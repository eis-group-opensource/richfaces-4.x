/* Copyright © 2016 EIS Group and/or one of its affiliates. All rights reserved. Unpublished work under U.S. copyright laws.
 CONFIDENTIAL AND TRADE SECRET INFORMATION. No portion of this work may be copied, distributed, modified, or incorporated into any other media without EIS Group prior written consent.*/
package org.richfaces.view.facelets.html;

import javax.faces.component.UIComponent;
import javax.faces.view.facelets.ComponentConfig;
import javax.faces.view.facelets.ComponentHandler;
import javax.faces.view.facelets.FaceletContext;

import org.richfaces.component.AbstractAttachQueue;

/**
 * @author Nick Belaevski
 *
 */
public class AttachQueueHandler extends ComponentHandler {
    /**
     * @param config
     */
    public AttachQueueHandler(ComponentConfig config) {
        super(config);
    }

    @Override
    public void onComponentCreated(FaceletContext ctx, UIComponent c, UIComponent parent) {
        super.onComponentCreated(ctx, c, parent);

        AbstractAttachQueue attachQueue = ((AbstractAttachQueue) c);
        boolean associateWithParent = true;

        AttachQueueStack attachQueueStack = AttachQueueStack.getStack(ctx.getFacesContext(), false);
        if (attachQueueStack != null) {
            AttachQueueInfo attachQueueInfo = attachQueueStack.peek();
            if (attachQueueInfo != null) {
                UIComponent queueInfoParent = attachQueueInfo.getParentComponent();
                if (queueInfoParent.equals(parent)) {
                    attachQueueInfo.setAttachQueue(attachQueue);
                    associateWithParent = false;
                }
            }
        }

        if (associateWithParent) {
            attachQueue.associateWith(parent);
        }
    }
}
