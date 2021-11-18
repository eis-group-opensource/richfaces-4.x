/* Copyright © 2016 EIS Group and/or one of its affiliates. All rights reserved. Unpublished work under U.S. copyright laws.
 CONFIDENTIAL AND TRADE SECRET INFORMATION. No portion of this work may be copied, distributed, modified, or incorporated into any other media without EIS Group prior written consent.*/
package org.ajax4jsf.component.behavior;

import javax.el.ELContext;
import javax.el.MethodExpression;
import javax.el.MethodNotFoundException;
import javax.faces.component.StateHolder;
import javax.faces.context.FacesContext;
import javax.faces.event.AbortProcessingException;
import javax.faces.event.AjaxBehaviorEvent;
import javax.faces.event.AjaxBehaviorListener;

/**
 * @author Anton Belevich
 *
 */
public class MethodExpressionAjaxBehaviorListener implements AjaxBehaviorListener, StateHolder {
    private static final Class<?>[] ACTION_LISTENER_ZEROARG_SIG = new Class[] {};
    private MethodExpression methodExpressionOneArg = null;
    private MethodExpression methodExpressionZeroArg = null;
    private boolean isTransient;

    public MethodExpressionAjaxBehaviorListener() {
    }

    public MethodExpressionAjaxBehaviorListener(MethodExpression methodExpressionOneArg) {
        this.methodExpressionOneArg = methodExpressionOneArg;

        FacesContext context = FacesContext.getCurrentInstance();
        ELContext elContext = context.getELContext();
        this.methodExpressionZeroArg = context
            .getApplication()
            .getExpressionFactory()
            .createMethodExpression(elContext, methodExpressionOneArg.getExpressionString(), Void.class,
                ACTION_LISTENER_ZEROARG_SIG);
    }

    public MethodExpressionAjaxBehaviorListener(MethodExpression methodExpressionOneArg, MethodExpression methodExpressionZeroArg) {
        this.methodExpressionOneArg = methodExpressionOneArg;
        this.methodExpressionZeroArg = methodExpressionZeroArg;
    }

    public void processAjaxBehavior(AjaxBehaviorEvent event) throws AbortProcessingException {

        FacesContext context = FacesContext.getCurrentInstance();
        ELContext elContext = context.getELContext();

        try {
            methodExpressionOneArg.invoke(elContext, new Object[] { event });
        } catch (MethodNotFoundException mnfe) {
            methodExpressionZeroArg.invoke(elContext, new Object[] {});
        }
    }

    public boolean isTransient() {
        return isTransient;
    }

    public void setTransient(boolean newTransientValue) {
        isTransient = newTransientValue;
    }

    public void restoreState(FacesContext context, Object state) {
        if (context == null) {
            throw new NullPointerException();
        }
        if (state == null) {
            return;
        }
        methodExpressionOneArg = (MethodExpression) ((Object[]) state)[0];
        methodExpressionZeroArg = (MethodExpression) ((Object[]) state)[1];
    }

    public Object saveState(FacesContext context) {
        if (context == null) {
            throw new NullPointerException();
        }
        return new Object[] { methodExpressionOneArg, methodExpressionZeroArg };
    }
}
