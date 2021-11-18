/* Copyright © 2016 EIS Group and/or one of its affiliates. All rights reserved. Unpublished work under U.S. copyright laws.
 CONFIDENTIAL AND TRADE SECRET INFORMATION. No portion of this work may be copied, distributed, modified, or incorporated into any other media without EIS Group prior written consent.*/
package org.richfaces.view.facelets.html;

import javax.faces.component.UIComponent;

import org.richfaces.component.AbstractAttachQueue;

/**
 * @author Nick Belaevski
 *
 */
final class AttachQueueInfo {
    private UIComponent parentComponent;
    private AbstractAttachQueue attachQueue;

    public AttachQueueInfo(UIComponent parentComponent) {
        super();
        this.parentComponent = parentComponent;
    }

    public UIComponent getParentComponent() {
        return parentComponent;
    }

    public void setAttachQueue(AbstractAttachQueue attachQueue) {
        this.attachQueue = attachQueue;
    }

    public AbstractAttachQueue getAttachQueue() {
        return attachQueue;
    }
}
