/* Copyright © 2016 EIS Group and/or one of its affiliates. All rights reserved. Unpublished work under U.S. copyright laws.
 CONFIDENTIAL AND TRADE SECRET INFORMATION. No portion of this work may be copied, distributed, modified, or incorporated into any other media without EIS Group prior written consent.*/
package org.richfaces;

import java.util.ArrayList;

import javax.faces.component.StateHolder;
import javax.faces.component.UIComponentBase;
import javax.faces.context.FacesContext;

import com.google.common.collect.Lists;

/**
 * @author Nick Belaevski
 *
 */
public class StateHolderArray implements StateHolder {
    private boolean tranzient = false;
    private ArrayList<Object> backingList = Lists.newArrayListWithCapacity(2);

    public Object saveState(FacesContext context) {
        Object[] savedState = new Object[backingList.size()];

        boolean hasNonNullState = false;

        for (int i = 0; i < savedState.length; i++) {
            Object state = UIComponentBase.saveAttachedState(context, backingList.get(i));
            savedState[i] = state;

            if (state != null) {
                hasNonNullState = true;
            }
        }

        if (hasNonNullState) {
            return savedState;
        } else {
            return null;
        }
    }

    public void restoreState(FacesContext context, Object stateObject) {
        if (stateObject != null) {
            Object[] state = (Object[]) stateObject;

            backingList.ensureCapacity(state.length);

            for (int i = 0; i < state.length; i++) {
                backingList.add(UIComponentBase.restoreAttachedState(context, state[i]));
            }
        }
    }

    public boolean isTransient() {
        return tranzient;
    }

    public void setTransient(boolean newTransientValue) {
        this.tranzient = newTransientValue;
    }

    public boolean add(Object e) {
        return backingList.add(e);
    }

    public Object get(int index) {
        return backingList.get(index);
    }

    public boolean isEmpty() {
        return backingList.isEmpty();
    }
}
