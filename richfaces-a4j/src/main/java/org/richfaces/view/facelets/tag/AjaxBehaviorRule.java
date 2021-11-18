/* Copyright © 2016 EIS Group and/or one of its affiliates. All rights reserved. Unpublished work under U.S. copyright laws.
 CONFIDENTIAL AND TRADE SECRET INFORMATION. No portion of this work may be copied, distributed, modified, or incorporated into any other media without EIS Group prior written consent.*/
package org.richfaces.view.facelets.tag;

import javax.el.MethodExpression;
import javax.faces.event.AjaxBehaviorEvent;
import javax.faces.view.facelets.FaceletContext;
import javax.faces.view.facelets.Metadata;
import javax.faces.view.facelets.MetadataTarget;
import javax.faces.view.facelets.TagAttribute;

import org.ajax4jsf.component.AjaxClientBehavior;
import org.ajax4jsf.component.behavior.AjaxBehavior;
import org.ajax4jsf.component.behavior.MethodExpressionAjaxBehaviorListener;

/**
 * @author Anton Belevich
 *
 */
public class AjaxBehaviorRule extends BehaviorRule {
    public static final Class<?>[] AJAX_BEHAVIOR_LISTENER_SIG = new Class[] { AjaxBehaviorEvent.class };
    private static final Class<?>[] AJAX_BEHAVIOR_ZEROARG_SIG = new Class[] {};
    public static final AjaxBehaviorRule INSTANCE = new AjaxBehaviorRule();
    public static final String EXECUTE = "execute";
    public static final String RENDER = "render";
    public static final String LISTENER = "listener";

    @Override
    public Metadata applyRule(String name, TagAttribute attribute, MetadataTarget meta) {

        if (meta.isTargetInstanceOf(AjaxBehavior.class)) {

            if (!attribute.isLiteral()) {

                if (LISTENER.equals(name)) {
                    return new AjaxBehaviorListenerMapper(attribute);
                }

                Class<?> type = meta.getPropertyType(name);

                if (EXECUTE.equals(name) || RENDER.equals(name)) {
                    type = Object.class;
                }

                if (type == null) {
                    type = Object.class;
                }

                return new ValueExpressionMetadata(name, type, attribute);
            } else if (meta != null && meta.getWriteMethod(name) != null) {
                return new LiteralAttributeMetadata(name, attribute.getValue());
            }
        }

        return null;
    }

    public static final class AjaxBehaviorListenerMapper extends Metadata {
        private final TagAttribute attr;

        public AjaxBehaviorListenerMapper(TagAttribute attr) {
            this.attr = attr;
        }

        public void applyMetadata(FaceletContext ctx, Object instance) {
            MethodExpression methodExpressionOneArg = this.attr
                .getMethodExpression(ctx, null, AjaxBehaviorRule.AJAX_BEHAVIOR_LISTENER_SIG);
            MethodExpression methodExpressionZeroArg = this.attr
                    .getMethodExpression(ctx, null, AjaxBehaviorRule.AJAX_BEHAVIOR_ZEROARG_SIG);
            ((AjaxClientBehavior) instance).addAjaxBehaviorListener(new MethodExpressionAjaxBehaviorListener(methodExpressionOneArg, methodExpressionZeroArg));
        }
    }
}
