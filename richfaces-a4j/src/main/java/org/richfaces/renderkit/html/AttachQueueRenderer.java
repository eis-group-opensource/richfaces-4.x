/* Copyright © 2016 EIS Group and/or one of its affiliates. All rights reserved. Unpublished work under U.S. copyright laws.
 CONFIDENTIAL AND TRADE SECRET INFORMATION. No portion of this work may be copied, distributed, modified, or incorporated into any other media without EIS Group prior written consent.*/
package org.richfaces.renderkit.html;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;

import org.richfaces.cdk.annotations.JsfRenderer;

/**
 * @author Nick Belaevski Renderer for attachedQueue component
 */
@JsfRenderer(type = "org.richfaces.AttachQueueRenderer", family = "org.richfaces.AttachQueue")
public class AttachQueueRenderer extends QueueRendererBase {
    @Override
    protected String getQueueName(FacesContext context, UIComponent comp) {
        return comp.getClientId(context);
    }
}