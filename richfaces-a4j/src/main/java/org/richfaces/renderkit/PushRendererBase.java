/* Copyright © 2016 EIS Group and/or one of its affiliates. All rights reserved. Unpublished work under U.S. copyright laws.
 CONFIDENTIAL AND TRADE SECRET INFORMATION. No portion of this work may be copied, distributed, modified, or incorporated into any other media without EIS Group prior written consent.*/
package org.richfaces.renderkit;

import java.util.HashMap;
import java.util.Map;

import javax.faces.application.Resource;
import javax.faces.application.ResourceHandler;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;

import org.ajax4jsf.javascript.ScriptUtils;
import org.richfaces.application.ServiceTracker;
import org.richfaces.application.push.PushContext;
import org.richfaces.application.push.PushContextFactory;
import org.richfaces.component.AbstractPush;
import org.richfaces.resource.PushResource;

/**
 * @author Nick Belaevski
 *
 */
public class PushRendererBase extends RendererBase {
    private static final String PUSH_URL_ENCODED_ATTRIBUTE = PushRendererBase.class.getName();

    protected String getPushResourceUrl(FacesContext context) {
        ResourceHandler resourceHandler = context.getApplication().getResourceHandler();
        Resource pushResource = resourceHandler.createResource(PushResource.class.getName());

        return pushResource.getRequestPath();
    }

    protected String getPushHandlerUrl(FacesContext context) {
        PushContext pushContext = ServiceTracker.getService(PushContextFactory.class).getPushContext();

        return pushContext.getPushHandlerUrl();
    }

    protected boolean shouldEncodePushUrl(FacesContext context) {
        Map<Object, Object> attributes = context.getAttributes();

        if (attributes.get(PUSH_URL_ENCODED_ATTRIBUTE) == null) {
            attributes.put(PUSH_URL_ENCODED_ATTRIBUTE, Boolean.TRUE);
            return true;
        }

        return false;
    }

    protected String getOptionsString(FacesContext context, UIComponent component) {
        AbstractPush push = (AbstractPush) component;

        Map<String, Object> options = new HashMap<String, Object>(2);

        options.put("address", push.getAddress());
        options.put("dataHandler", push.getOndataavailable());
        options.put("errorHandler", push.getOnerror());

        return ScriptUtils.toScript(options);
    }
}
