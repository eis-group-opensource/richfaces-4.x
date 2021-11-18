/* Copyright © 2016 EIS Group and/or one of its affiliates. All rights reserved. Unpublished work under U.S. copyright laws.
 CONFIDENTIAL AND TRADE SECRET INFORMATION. No portion of this work may be copied, distributed, modified, or incorporated into any other media without EIS Group prior written consent.*/
package org.richfaces.component.event;

import java.io.Serializable;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.event.AbortProcessingException;
import javax.faces.event.ComponentSystemEvent;
import javax.faces.event.ComponentSystemEventListener;
import javax.faces.event.PreRenderComponentEvent;

/**
 * <p>
 * Listener takes component to be processed before parent component is rendered.
 * </p>
 *
 * <p>
 * The parent does not need to be parent component, but given component will be searched for in context of parent component by
 * its id using {@link UIComponent#findComponent(String)}.
 * </p>
 *
 * <p>
 * The listener for {@link PreRenderComponentEvent} will be automatically bound to parent component.
 * </p>
 */
public abstract class PreRenderParentListener implements ComponentSystemEventListener, Serializable {

    private static final long serialVersionUID = 2106663563922715641L;

    private String componentId;

    public PreRenderParentListener(UIComponent parent, UIComponent component) {
        this.componentId = component.getId();
        parent.subscribeToEvent(PreRenderComponentEvent.class, this);
    }

    /**
     * Will be processed before the component which this event is registered to is rendered
     */
    protected abstract void preRenderParent(FacesContext facesContext, UIComponent component);

    @Override
    public void processEvent(ComponentSystemEvent event) throws AbortProcessingException {
        if (event instanceof PreRenderComponentEvent) {
            final FacesContext facesContext = FacesContext.getCurrentInstance();
            final UIComponent parent = event.getComponent();
            final UIComponent component = parent.findComponent(componentId);

            preRenderParent(facesContext, component);
        }
    }
}