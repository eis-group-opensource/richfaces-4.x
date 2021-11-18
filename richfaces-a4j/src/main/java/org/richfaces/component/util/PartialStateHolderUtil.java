/* Copyright © 2016 EIS Group and/or one of its affiliates. All rights reserved. Unpublished work under U.S. copyright laws.
 CONFIDENTIAL AND TRADE SECRET INFORMATION. No portion of this work may be copied, distributed, modified, or incorporated into any other media without EIS Group prior written consent.*/
package org.richfaces.component.util;

import java.io.Serializable;

import javax.faces.component.PartialStateHolder;
import javax.faces.component.StateHolder;
import javax.faces.component.UIComponent;
import javax.faces.component.UIComponentBase;
import javax.faces.context.FacesContext;

/**
 * @author Nick Belaevski
 *
 */
public final class PartialStateHolderUtil {
    private static final class StateHolderObject implements Serializable {
        private static final long serialVersionUID = 6157742187482213801L;
        private boolean partialState;
        private Object savedState;

        public StateHolderObject(boolean partialState, Object savedState) {
            super();
            this.partialState = partialState;
            this.savedState = savedState;
        }

        public boolean isPartialState() {
            return partialState;
        }

        public Object getSavedState() {
            return savedState;
        }
    }

    private PartialStateHolderUtil() {
        // utility class constructor
    }

    public static Object saveState(FacesContext context, UIComponent component, Object objectToSave) {
        Object savedState = null;
        boolean nullDelta = true;

        boolean converterHasPartialState = false;

        if (component.initialStateMarked()) {
            if (objectToSave != null) {
                if (objectToSave instanceof PartialStateHolder) {
                    // Delta
                    StateHolder holder = (StateHolder) objectToSave;
                    if (!holder.isTransient()) {
                        Object attachedState = holder.saveState(context);
                        if (attachedState != null) {
                            nullDelta = false;
                            savedState = attachedState;
                        }
                        converterHasPartialState = true;
                    } else {
                        savedState = null;
                    }
                } else {
                    // Full
                    savedState = UIComponentBase.saveAttachedState(context, objectToSave);
                    nullDelta = false;
                }
            }

            if (savedState == null && nullDelta) {
                // No values
                return null;
            }
        } else {
            savedState = UIComponentBase.saveAttachedState(context, objectToSave);
        }

        return new StateHolderObject(converterHasPartialState, savedState);
    }

    public static Object restoreState(FacesContext context, Object savedState, Object existingObject) {
        if (savedState != null) {
            StateHolderObject stateHolderObject = (StateHolderObject) savedState;
            if (stateHolderObject.isPartialState()) {
                ((StateHolder) existingObject).restoreState(context, stateHolderObject.getSavedState());
                return existingObject;
            } else {
                return UIComponentBase.restoreAttachedState(context, stateHolderObject.getSavedState());
            }
        } else {
            return null;
        }
    }
}
