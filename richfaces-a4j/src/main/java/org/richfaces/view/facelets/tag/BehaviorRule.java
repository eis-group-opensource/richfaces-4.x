/* Copyright © 2016 EIS Group and/or one of its affiliates. All rights reserved. Unpublished work under U.S. copyright laws.
 CONFIDENTIAL AND TRADE SECRET INFORMATION. No portion of this work may be copied, distributed, modified, or incorporated into any other media without EIS Group prior written consent.*/
package org.richfaces.view.facelets.tag;

import javax.faces.view.facelets.FaceletContext;
import javax.faces.view.facelets.MetaRule;
import javax.faces.view.facelets.Metadata;
import javax.faces.view.facelets.MetadataTarget;
import javax.faces.view.facelets.TagAttribute;

import org.richfaces.component.behavior.ClientBehavior;

/**
 * @author Anton Belevich
 *
 */
public class BehaviorRule extends MetaRule {
    public static final BehaviorRule INSTANCE = new BehaviorRule();

    public static final class LiteralAttributeMetadata extends Metadata {
        private final String name;
        private final String value;

        public LiteralAttributeMetadata(String name, String value) {
            this.value = value;
            this.name = name;
        }

        public void applyMetadata(FaceletContext ctx, Object instance) {
            ((ClientBehavior) instance).setLiteralAttribute(this.name, this.value);
        }
    }

    public static final class ValueExpressionMetadata extends Metadata {
        private final String name;
        private final TagAttribute attr;
        private final Class<?> type;

        public ValueExpressionMetadata(String name, Class<?> type, TagAttribute attr) {
            this.name = name;
            this.attr = attr;
            this.type = type;
        }

        public void applyMetadata(FaceletContext ctx, Object instance) {
            ((ClientBehavior) instance).setValueExpression(this.name, this.attr.getValueExpression(ctx, this.type));
        }
    }

    @Override
    public Metadata applyRule(String name, TagAttribute attribute, MetadataTarget meta) {
        if (meta.isTargetInstanceOf(ClientBehavior.class)) {
            if (!attribute.isLiteral()) {
                Class<?> type = meta.getPropertyType(name);
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
}
