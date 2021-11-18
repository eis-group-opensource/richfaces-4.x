/* Copyright © 2016 EIS Group and/or one of its affiliates. All rights reserved. Unpublished work under U.S. copyright laws.
 CONFIDENTIAL AND TRADE SECRET INFORMATION. No portion of this work may be copied, distributed, modified, or incorporated into any other media without EIS Group prior written consent.*/
package org.richfaces.view.facelets;

import javax.el.MethodExpression;
import javax.faces.view.facelets.FaceletContext;
import javax.faces.view.facelets.Metadata;
import javax.faces.view.facelets.TagAttribute;

/**
 * @author akolonitsky
 * @since Feb 24, 2010
 */
// TODO nick - handle return type
public abstract class MethodMetadata extends Metadata {
    protected final Class<?>[] signature;
    protected final TagAttribute attribute;

    public MethodMetadata(TagAttribute attribute, Class<?>... signature) {
        this.attribute = attribute;
        this.signature = signature;
    }

    protected MethodExpression getMethodExpression(FaceletContext ctx) {
        return this.attribute.getMethodExpression(ctx, null, signature);
    }
}
