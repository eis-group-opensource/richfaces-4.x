/* Copyright © 2016 EIS Group and/or one of its affiliates. All rights reserved. Unpublished work under U.S. copyright laws.
 CONFIDENTIAL AND TRADE SECRET INFORMATION. No portion of this work may be copied, distributed, modified, or incorporated into any other media without EIS Group prior written consent.*/
package org.richfaces.view.facelets.html;

import java.io.IOException;

import javax.el.ELException;
import javax.faces.FacesException;
import javax.faces.FacesWrapper;
import javax.faces.component.UIComponent;
import javax.faces.component.behavior.ClientBehaviorHolder;
import javax.faces.context.FacesContext;
import javax.faces.view.facelets.ComponentHandler;
import javax.faces.view.facelets.FaceletContext;
import javax.faces.view.facelets.Tag;
import javax.faces.view.facelets.TagAttribute;

/**
 * @author Nick Belaevski
 */
public class BehaviorsAddingComponentHandlerWrapper extends ComponentHandler implements FacesWrapper<ComponentHandler> {
    private ComponentHandler componentHandler;

    public BehaviorsAddingComponentHandlerWrapper(ComponentHandler componentHandler) {
        super(componentHandler.getComponentConfig());
        this.componentHandler = componentHandler;
    }

    public void apply(FaceletContext ctx, UIComponent parent) throws IOException {
        componentHandler.apply(ctx, parent);
    }

    public void applyNextHandler(FaceletContext ctx, UIComponent c) throws IOException, FacesException, ELException {
        componentHandler.applyNextHandler(ctx, c);
    }

    public TagAttribute getBinding() {
        return componentHandler.getBinding();
    }

    public Tag getTag() {
        return componentHandler.getTag();
    }

    public TagAttribute getTagAttribute(String localName) {
        // workaround for MyFaces
        if (componentHandler == null) {
            return getComponentConfig().getTag().getAttributes().get(localName);
        }

        return componentHandler.getTagAttribute(localName);
    }

    public String getTagId() {
        return componentHandler.getTagId();
    }

    public boolean equals(Object obj) {
        return componentHandler.equals(obj);
    }

    public int hashCode() {
        return componentHandler.hashCode();
    }

    public String toString() {
        return componentHandler.toString();
    }

    public boolean isDisabled(FaceletContext ctx) {
        return componentHandler.isDisabled(ctx);
    }

    public void onComponentCreated(FaceletContext ctx, UIComponent c, UIComponent parent) {
        componentHandler.onComponentCreated(ctx, c, parent);
    }

    public void onComponentPopulated(FaceletContext ctx, UIComponent c, UIComponent parent) {
        FacesContext facesContext = ctx.getFacesContext();
        BehaviorStack behaviorStack = BehaviorStack.getBehaviorStack(facesContext, false);

        if (behaviorStack != null && !behaviorStack.isEmpty()) {
            if (c instanceof ClientBehaviorHolder) {
                ClientBehaviorHolder behaviorHolder = (ClientBehaviorHolder) c;

                behaviorStack.addBehaviors(facesContext, behaviorHolder);
            }
        }

        componentHandler.onComponentPopulated(ctx, c, parent);
    }

    public void setAttributes(FaceletContext ctx, Object instance) {
        componentHandler.setAttributes(ctx, instance);
    }

    public ComponentHandler getWrapped() {
        return componentHandler;
    }
}
