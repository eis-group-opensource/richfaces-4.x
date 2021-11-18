/* Copyright © 2016 EIS Group and/or one of its affiliates. All rights reserved. Unpublished work under U.S. copyright laws.
 CONFIDENTIAL AND TRADE SECRET INFORMATION. No portion of this work may be copied, distributed, modified, or incorporated into any other media without EIS Group prior written consent.*/
package org.richfaces.component;

import java.io.Serializable;

import javax.faces.component.StateHolder;
import javax.faces.context.FacesContext;

import org.ajax4jsf.model.DataComponentState;
import org.ajax4jsf.model.ExtendedDataModel;

public final class DataAdaptorIterationState implements StateHolder {
    private DataComponentState componentState;
    private Object savedComponentState;
    private boolean componentStateIsStateHolder;
    private ExtendedDataModel<?> dataModel;

    public DataAdaptorIterationState() {
        super();
    }

    public DataAdaptorIterationState(DataComponentState componentState, ExtendedDataModel<?> dataModel) {
        super();
        this.componentState = componentState;
        this.dataModel = dataModel;
    }

    public ExtendedDataModel<?> getDataModel() {
        return dataModel;
    }

    public DataComponentState getComponentState() {
        return componentState;
    }

    /**
     * @param uiDataAdaptor
     */
    public void restoreComponentState(UIDataAdaptor uiDataAdaptor) {
        if (savedComponentState != null && componentStateIsStateHolder) {
            componentState = uiDataAdaptor.createComponentState();
            ((StateHolder) componentState).restoreState(FacesContext.getCurrentInstance(), savedComponentState);
            savedComponentState = null;
        }
    }

    public void setTransient(boolean newTransientValue) {
        throw new UnsupportedOperationException();
    }

    public boolean isTransient() {
        if (componentState instanceof StateHolder) {
            return ((StateHolder) componentState).isTransient();
        }

        if (componentState instanceof Serializable) {
            return false;
        }

        return true;
    }

    public Object saveState(FacesContext context) {
        if (isTransient()) {
            return null;
        }

        boolean localComponentStateIsHolder = false;
        Object localSavedComponentState = null;

        if (componentState instanceof StateHolder) {
            localComponentStateIsHolder = true;

            StateHolder stateHolder = (StateHolder) componentState;
            localSavedComponentState = stateHolder.saveState(context);
        } else if (componentState instanceof Serializable) {
            localSavedComponentState = componentState;
        }

        return new Object[] { localComponentStateIsHolder ? Boolean.TRUE : Boolean.FALSE, localSavedComponentState };
    }

    public void restoreState(FacesContext context, Object stateObject) {
        if (stateObject != null) {
            Object[] state = (Object[]) stateObject;
            componentStateIsStateHolder = Boolean.TRUE.equals(state[0]);
            Object localSavedComponentState = state[1];

            if (componentStateIsStateHolder) {
                savedComponentState = localSavedComponentState;
            } else {
                componentState = (DataComponentState) localSavedComponentState;
            }
        }
    }
}