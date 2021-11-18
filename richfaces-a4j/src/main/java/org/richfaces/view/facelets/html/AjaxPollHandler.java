/* Copyright © 2016 EIS Group and/or one of its affiliates. All rights reserved. Unpublished work under U.S. copyright laws.
 CONFIDENTIAL AND TRADE SECRET INFORMATION. No portion of this work may be copied, distributed, modified, or incorporated into any other media without EIS Group prior written consent.*/
package org.richfaces.view.facelets.html;

import javax.faces.event.ActionEvent;
import javax.faces.event.ActionListener;
import javax.faces.event.MethodExpressionActionListener;
import javax.faces.view.facelets.ComponentConfig;
import javax.faces.view.facelets.ComponentHandler;
import javax.faces.view.facelets.FaceletContext;
import javax.faces.view.facelets.MetaRule;
import javax.faces.view.facelets.MetaRuleset;
import javax.faces.view.facelets.Metadata;
import javax.faces.view.facelets.MetadataTarget;
import javax.faces.view.facelets.TagAttribute;

import org.richfaces.component.AbstractPoll;
import org.richfaces.view.facelets.MethodMetadata;

public class AjaxPollHandler extends ComponentHandler {
    private static final AjaxPollHandlerMetaRule META_RULE = new AjaxPollHandlerMetaRule();

    public AjaxPollHandler(ComponentConfig config) {
        super(config);
    }

    protected MetaRuleset createMetaRuleset(Class type) {
        MetaRuleset m = super.createMetaRuleset(type);
        m.addRule(META_RULE);
        return m;
    }

    static class AjaxPollHandlerMetaRule extends MetaRule {
        public Metadata applyRule(String name, TagAttribute attribute, MetadataTarget meta) {
            if (meta.isTargetInstanceOf(AbstractPoll.class)) {
                if ("action".equals(name)) {
                    return new MethodMetadata(attribute) {
                        public void applyMetadata(FaceletContext ctx, Object instance) {
                            ((AbstractPoll) instance).setActionExpression(getMethodExpression(ctx));
                        }
                    };
                }
                if ("actionExpression".equals(name)) {
                    return new MethodMetadata(attribute) {
                        public void applyMetadata(FaceletContext ctx, Object instance) {
                            ((AbstractPoll) instance).setActionExpression(getMethodExpression(ctx));
                        }
                    };
                }
                if ("actionListener".equals(name)) {
                    return new MethodMetadata(attribute, ActionEvent.class) {
                        public void applyMetadata(FaceletContext ctx, Object instance) {
                            ActionListener actionListener = new MethodExpressionActionListener(getMethodExpression(ctx));
                            ((AbstractPoll) instance).addActionListener(actionListener);
                        }
                    };
                }
            }
            return null;
        }
    }
}
