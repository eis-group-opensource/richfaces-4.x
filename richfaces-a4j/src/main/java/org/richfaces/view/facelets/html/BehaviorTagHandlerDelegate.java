/* Copyright © 2016 EIS Group and/or one of its affiliates. All rights reserved. Unpublished work under U.S. copyright laws.
 CONFIDENTIAL AND TRADE SECRET INFORMATION. No portion of this work may be copied, distributed, modified, or incorporated into any other media without EIS Group prior written consent.*/
package org.richfaces.view.facelets.html;

import java.io.IOException;

import javax.faces.application.Application;
import javax.faces.component.UIComponent;
import javax.faces.component.behavior.Behavior;
import javax.faces.context.FacesContext;
import javax.faces.view.AttachedObjectHandler;
import javax.faces.view.facelets.FaceletContext;
import javax.faces.view.facelets.MetaRule;
import javax.faces.view.facelets.MetaRuleset;
import javax.faces.view.facelets.TagHandlerDelegate;

import org.richfaces.component.behavior.ClientBehavior;

/**
 * @author Anton Belevich
 *
 */
public class BehaviorTagHandlerDelegate extends TagHandlerDelegate implements AttachedObjectHandler {
    TagHandlerDelegate wrappedHandlerDelegate;
    CustomBehaviorHandler owner;
    private String behaviorId;
    private String eventName;
    private MetaRule[] metaRules;

    public BehaviorTagHandlerDelegate(CustomBehaviorHandler owner, TagHandlerDelegate wrappedHandlerDelegate) {
        this.owner = owner;
        this.wrappedHandlerDelegate = wrappedHandlerDelegate;
        this.behaviorId = owner.getBehaviorId();
        this.eventName = owner.getEventName();
        this.metaRules = owner.getMetaRules();
    }

    @Override
    public void apply(FaceletContext ctx, UIComponent parent) throws IOException {

        if (owner.isWrapping()) {

            Application application = ctx.getFacesContext().getApplication();
            Behavior behavior = application.createBehavior(this.behaviorId);

            if (behavior instanceof ClientBehavior) {
                ClientBehavior clientBehavior = (ClientBehavior) behavior;
                owner.setAttributes(ctx, clientBehavior);

                FacesContext context = ctx.getFacesContext();
                BehaviorStack behaviorStack = BehaviorStack.getBehaviorStack(context, true);

                behaviorStack.pushBehavior(context, clientBehavior, this.behaviorId, this.eventName);

                owner.applyNextHandler(ctx, parent);

                behaviorStack.popBehavior();
            }
        } else {
            wrappedHandlerDelegate.apply(ctx, parent);
        }
    }

    public MetaRuleset createMetaRuleset(Class type) {
        MetaRuleset metaRuleset = wrappedHandlerDelegate.createMetaRuleset(type);
        for (MetaRule metaRule : metaRules) {
            metaRuleset.addRule(metaRule);
        }
        return metaRuleset;
    }

    public void applyAttachedObject(FacesContext context, UIComponent parent) {
        if (wrappedHandlerDelegate instanceof AttachedObjectHandler) {
            ((AttachedObjectHandler) wrappedHandlerDelegate).applyAttachedObject(context, parent);
        }
    }

    public String getFor() {
        if (wrappedHandlerDelegate instanceof AttachedObjectHandler) {
            return ((AttachedObjectHandler) wrappedHandlerDelegate).getFor();
        }
        return null;
    }
}
