/* Copyright © 2016 EIS Group and/or one of its affiliates. All rights reserved. Unpublished work under U.S. copyright laws.
 CONFIDENTIAL AND TRADE SECRET INFORMATION. No portion of this work may be copied, distributed, modified, or incorporated into any other media without EIS Group prior written consent.*/
package org.richfaces.event;

import javax.el.ELContext;
import javax.el.ELException;
import javax.el.MethodExpression;
import javax.el.MethodNotFoundException;
import javax.faces.component.StateHolder;
import javax.faces.component.UIComponentBase;
import javax.faces.context.FacesContext;
import javax.faces.event.AbortProcessingException;
import javax.faces.event.FacesEvent;
import javax.faces.event.FacesListener;

/**
 * <p>
 * <strong><span class="changed_modified_2_0">MethodExpressionEventListener</span></strong> is a {@link FacesListener} that
 * wraps a {@link MethodExpression}. When it receives a {@link FacesEvent}, it executes a method on an object identified by the
 * {@link MethodExpression}.
 * </p>
 *
 * @author akolonitsky
 * @version 1.0
 *
 */
public abstract class MethodExpressionEventListener implements FacesListener, StateHolder {
    private static final Class<?>[] EVENT_LISTENER_ZERO_ARG_SIG = new Class[] {};
    private static final Object[] NO_PARAMS = new Object[0];

    // ------------------------------------------------------ Instance Variables
    private MethodExpression methodExpressionOneArg = null;
    private MethodExpression methodExpressionZeroArg = null;
    private boolean isTransient;

    protected MethodExpressionEventListener() {
    }

    /**
     * <p>
     * <span class="changed_modified_2_0">Construct</span> a {@link FacesListener} that contains a {@link MethodExpression}
     * .<span class="changed_added_2_0">To accomodate method expression targets that take no arguments instead of taking a
     * {@link FacesEvent} argument</span>, the implementation of this class must take the argument
     * <code>methodExpressionOneArg</code>, extract its expression string, and create another <code>MethodExpression</code>
     * whose expected param types match those of a zero argument method. The usage requirements for both of these
     * <code>MethodExpression</code> instances are described in {@link #processEvent}.</span>
     * </p>
     *
     * @param methodExpressionOneArg a <code>MethodExpression</code> that points to a method that returns <code>void</code> and
     *        takes a single argument of type {@link FacesEvent}.
     */
    protected MethodExpressionEventListener(MethodExpression methodExpressionOneArg) {

        super();
        this.methodExpressionOneArg = methodExpressionOneArg;
        FacesContext context = FacesContext.getCurrentInstance();
        ELContext elContext = context.getELContext();
        this.methodExpressionZeroArg = context
            .getApplication()
            .getExpressionFactory()
            .createMethodExpression(elContext, methodExpressionOneArg.getExpressionString(), Void.class,
                EVENT_LISTENER_ZERO_ARG_SIG);
    }

    /**
     * <p>
     * Construct a {@link FacesListener} that contains a {@link MethodExpression}.
     * </p>
     *
     * @param methodExprOneArg
     * @param methodExprZeroArg
     */
    protected MethodExpressionEventListener(MethodExpression methodExprOneArg, MethodExpression methodExprZeroArg) {

        super();
        this.methodExpressionOneArg = methodExprOneArg;
        this.methodExpressionZeroArg = methodExprZeroArg;
    }

    // ------------------------------------------------------- Event Method

    /**
     * <p>
     * <span class="changed_modified_2_0">Call</span> through to the {@link MethodExpression} passed in our constructor. <span
     * class="changed_added_2_0">First, try to invoke the <code>MethodExpression</code> passed to the constructor of this
     * instance, passing the argument {@link FacesEvent} as the argument. If a {@link MethodNotFoundException} is thrown, call
     * to the zero argument <code>MethodExpression</code> derived from the <code>MethodExpression</code> passed to the
     * constructor of this instance. If that fails for any reason, throw an {@link AbortProcessingException}, including the
     * cause of the failure.</span>
     * </p>
     *
     * @throws NullPointerException {@inheritDoc}
     * @throws AbortProcessingException {@inheritDoc}
     */
    public void processEvent(FacesEvent event) throws AbortProcessingException {

        if (event == null) {
            throw new NullPointerException();
        }
        FacesContext context = FacesContext.getCurrentInstance();
        ELContext elContext = context.getELContext();
        // PENDING: The corresponding code in MethodExpressionActionListener
        // has an elaborate message capture, logging, and rethrowing block.
        // Why not here?
        try {
            methodExpressionOneArg.invoke(elContext, new Object[] { event });
        } catch (MethodNotFoundException mnf) {
            if (null != methodExpressionZeroArg) {

                try {
                    // try to invoke a no-arg version
                    methodExpressionZeroArg.invoke(elContext, NO_PARAMS);
                } catch (ELException e) {
                    throw new AbortProcessingException(e.getMessage(), e.getCause());
                }
            }
        } catch (ELException e) {
            throw new AbortProcessingException(e.getMessage(), e.getCause());
        }
    }

    // ------------------------------------------------ Methods from StateHolder

    /**
     * <p class="changed_modified_2_0">
     * Both {@link MethodExpression} instances described in the constructor must be saved.
     * </p>
     */
    public Object saveState(FacesContext context) {
        if (context == null) {
            throw new NullPointerException();
        }

        return new Object[] { UIComponentBase.saveAttachedState(context, methodExpressionOneArg),
                UIComponentBase.saveAttachedState(context, methodExpressionZeroArg) };
    }

    /**
     * <p class="changed_modified_2_0">
     * Both {@link MethodExpression} instances described in the constructor must be restored.
     * </p>
     */
    public void restoreState(FacesContext context, Object state) {

        if (context == null) {
            throw new NullPointerException();
        }
        if (state == null) {
            return;
        }

        methodExpressionOneArg = (MethodExpression) UIComponentBase.restoreAttachedState(context, ((Object[]) state)[0]);
        methodExpressionZeroArg = (MethodExpression) UIComponentBase.restoreAttachedState(context, ((Object[]) state)[1]);
    }

    public boolean isTransient() {
        return isTransient;
    }

    public void setTransient(boolean newTransientValue) {
        isTransient = newTransientValue;
    }
}
