/* Copyright © 2016 EIS Group and/or one of its affiliates. All rights reserved. Unpublished work under U.S. copyright laws.
 CONFIDENTIAL AND TRADE SECRET INFORMATION. No portion of this work may be copied, distributed, modified, or incorporated into any other media without EIS Group prior written consent.*/
package org.richfaces.event;

import javax.el.MethodExpression;
import javax.faces.component.StateHolder;
import javax.faces.context.FacesContext;

/**
 * @author abelevich
 *
 */
public class MethodExpressionDropListener implements DropListener, StateHolder {
    private MethodExpression methodExpression;
    
    private boolean _transient;

    public MethodExpressionDropListener() {
        super();
    }

    public MethodExpressionDropListener(MethodExpression methodExpression) {
        super();
        this.methodExpression = methodExpression;
    }

    public void processDrop(DropEvent event) {
        FacesContext facesContext = FacesContext.getCurrentInstance();
        methodExpression.invoke(facesContext.getELContext(), new Object[] { event });
    }

    @Override
    public Object saveState(FacesContext context) {
        return new Object[]{methodExpression, _transient};
    }

    @Override
    public void restoreState(FacesContext context, Object state) {
        Object[] stateArray = (Object[]) state;
        methodExpression = (MethodExpression) stateArray[0];
        _transient = (Boolean) stateArray[1];
    }

    @Override
    public boolean isTransient() {
        return _transient;
    }

    @Override
    public void setTransient(boolean newTransientValue) {
        _transient = newTransientValue;
    }
}
