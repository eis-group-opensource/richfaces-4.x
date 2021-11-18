/* Copyright © 2016 EIS Group and/or one of its affiliates. All rights reserved. Unpublished work under U.S. copyright laws.
 CONFIDENTIAL AND TRADE SECRET INFORMATION. No portion of this work may be copied, distributed, modified, or incorporated into any other media without EIS Group prior written consent.*/
package org.richfaces.renderkit.html;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;

import org.richfaces.cdk.annotations.JsfRenderer;
import org.richfaces.component.AbstractQueue;
import org.richfaces.renderkit.util.RendererUtils;

/**
 * @author Nick Belaevski Renderer for queue component
 */
@JsfRenderer(type = "org.richfaces.QueueRenderer", family = "org.richfaces.Queue")
public class QueueRenderer extends QueueRendererBase {
    private final RendererUtils utils = RendererUtils.getInstance();

    protected String getQueueName(FacesContext context, UIComponent comp) {
        String nameAttributeValue = (String) comp.getAttributes().get(NAME_ATTRIBBUTE);

        if (nameAttributeValue == null || nameAttributeValue.length() == 0) {
            UIComponent form = utils.getNestingForm(comp);
            if (form != null) {
                nameAttributeValue = form.getClientId(context);
            } else {
                nameAttributeValue = AbstractQueue.GLOBAL_QUEUE_NAME;
            }
        }

        return nameAttributeValue;
    }
}