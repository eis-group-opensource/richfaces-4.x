/* Copyright © 2016 EIS Group and/or one of its affiliates. All rights reserved. Unpublished work under U.S. copyright laws.
 CONFIDENTIAL AND TRADE SECRET INFORMATION. No portion of this work may be copied, distributed, modified, or incorporated into any other media without EIS Group prior written consent.*/
package org.richfaces.view.facelets.html;

import javax.faces.view.facelets.BehaviorConfig;
import javax.faces.view.facelets.BehaviorHandler;
import javax.faces.view.facelets.CompositeFaceletHandler;
import javax.faces.view.facelets.MetaRule;
import javax.faces.view.facelets.TagHandler;
import javax.faces.view.facelets.TagHandlerDelegate;

import org.richfaces.view.facelets.tag.BehaviorRule;

/**
 * @author Anton Belevich
 *
 */
public class CustomBehaviorHandler extends BehaviorHandler {
    TagHandlerDelegate helper;

    public CustomBehaviorHandler(BehaviorConfig config) {
        super(config);
    }

    public boolean isWrapping() {
        return ((this.nextHandler instanceof TagHandler) || (this.nextHandler instanceof CompositeFaceletHandler));
    }

    public boolean isWrappingAttachQueue() {
        return (this.nextHandler instanceof AttachQueueHandler);
    }

    public MetaRule[] getMetaRules() {
        return new MetaRule[] { BehaviorRule.INSTANCE };
    }

    @Override
    protected TagHandlerDelegate getTagHandlerDelegate() {
        if (helper == null) {
            helper = new BehaviorTagHandlerDelegate(this, delegateFactory.createBehaviorHandlerDelegate(this));
        }
        return helper;
    }
}
