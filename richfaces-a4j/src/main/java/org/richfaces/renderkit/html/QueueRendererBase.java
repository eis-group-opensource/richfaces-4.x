/* Copyright © 2016 EIS Group and/or one of its affiliates. All rights reserved. Unpublished work under U.S. copyright laws.
 CONFIDENTIAL AND TRADE SECRET INFORMATION. No portion of this work may be copied, distributed, modified, or incorporated into any other media without EIS Group prior written consent.*/
package org.richfaces.renderkit.html;

import static org.richfaces.application.configuration.ConfigurationServiceHelper.getBooleanConfigurationValue;

import java.util.List;

import javax.faces.application.Application;
import javax.faces.application.ResourceDependencies;
import javax.faces.application.ResourceDependency;
import javax.faces.component.UIComponent;
import javax.faces.component.UIOutput;
import javax.faces.context.FacesContext;
import javax.faces.event.AbortProcessingException;
import javax.faces.event.ComponentSystemEvent;
import javax.faces.event.ComponentSystemEventListener;
import javax.faces.event.ListenerFor;
import javax.faces.event.ListenersFor;
import javax.faces.event.PostAddToViewEvent;
import javax.faces.event.PreRemoveFromViewEvent;
import javax.faces.render.Renderer;

import org.richfaces.application.CommonComponentsConfiguration;
import org.richfaces.component.QueueRegistry;
import org.richfaces.log.Logger;
import org.richfaces.log.RichfacesLogger;

/**
 * @author Nick Belaevski Base class for rendering Queue
 */
@ResourceDependencies({
        @ResourceDependency(library = "javax.faces", name = "jsf.js"),
        @ResourceDependency(library = "org.richfaces", name = "jquery.js"),
        @ResourceDependency(library = "org.richfaces", name = "richfaces.js"),
        @ResourceDependency(library = "org.richfaces", name = "richfaces-queue.reslib")
})
@ListenersFor({ @ListenerFor(systemEventClass = PostAddToViewEvent.class),
        @ListenerFor(systemEventClass = PreRemoveFromViewEvent.class) })
public abstract class QueueRendererBase extends Renderer implements ComponentSystemEventListener {
    protected static final String QUEUE_ID_ATTRIBBUTE = "queueId";
    protected static final String NAME_ATTRIBBUTE = "name";
    protected static final Logger LOGGER = RichfacesLogger.COMPONENTS.getLogger();
    private static final String QUEUE_RESOURCE_COMPONENT_TARGET = "head";

    private void addQueueResourceComponent(FacesContext context) {
        List<UIComponent> resources = context.getViewRoot().getComponentResources(context, QUEUE_RESOURCE_COMPONENT_TARGET);

        for (UIComponent resource : resources) {
            if (QueueResourceComponentRenderer.TYPE.equals(resource.getRendererType())) {
                return;
            }
        }

        Application application = context.getApplication();
        UIComponent queueResourceComponent = application.createComponent(context, UIOutput.COMPONENT_TYPE,
                QueueResourceComponentRenderer.TYPE);

        // fix for JSF duplicate ID exception
        queueResourceComponent.setId(QueueRegistry.QUEUE_SCRIPT_ID);

        context.getViewRoot().addComponentResource(context, queueResourceComponent, QUEUE_RESOURCE_COMPONENT_TARGET);
    }

    public void processEvent(ComponentSystemEvent event) throws AbortProcessingException {
        FacesContext context = FacesContext.getCurrentInstance();

        if (!getBooleanConfigurationValue(context, CommonComponentsConfiguration.Items.queueEnabled)) {
            return;
        }

        UIComponent comp = event.getComponent();
        String queueName = getQueueName(context, comp);
        QueueRegistry queueRegistry = QueueRegistry.getInstance(context);

        if (event instanceof PostAddToViewEvent) {
            queueRegistry.addQueue(queueName, comp);
            addQueueResourceComponent(context);
        } else if (event instanceof PreRemoveFromViewEvent) {
            queueRegistry.removeQueue(queueName);
        }
    }

    protected abstract String getQueueName(FacesContext context, UIComponent comp);
}