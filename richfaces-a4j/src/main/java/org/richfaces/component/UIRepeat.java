/* Copyright © 2016 EIS Group and/or one of its affiliates. All rights reserved. Unpublished work under U.S. copyright laws.
 CONFIDENTIAL AND TRADE SECRET INFORMATION. No portion of this work may be copied, distributed, modified, or incorporated into any other media without EIS Group prior written consent.*/
package org.richfaces.component;

import org.richfaces.cdk.annotations.JsfComponent;
import org.richfaces.cdk.annotations.JsfRenderer;
import org.richfaces.cdk.annotations.Tag;
import org.richfaces.cdk.annotations.TagType;
import org.richfaces.component.attribute.IterationProps;
import org.richfaces.component.attribute.RowsProps;
import org.richfaces.component.attribute.SequenceProps;
import org.richfaces.view.facelets.html.RepeatHandler;

/**
 * <p>
 * The non-visual &lt;a4j:repeat&gt; component is used to iterate through a data model. The component renders child content for
 * every iteration according to the current object data.
 * </p>
 *
 * @author Nick Belaevski
 */
@JsfComponent(tag = @Tag(name = "repeat", handlerClass = RepeatHandler.class, type = TagType.Facelets),
        renderer = @JsfRenderer(type = "org.richfaces.RepeatRenderer"))
public class UIRepeat extends UISequence implements RowsProps, SequenceProps, IterationProps {
    public static final String COMPONENT_TYPE = "org.richfaces.Repeat";
    public static final String COMPONENT_FAMILY = "javax.faces.Data";

    public UIRepeat() {
        setRendererType("org.richfaces.RepeatRenderer");
    }

    @Override
    public String getFamily() {
        return COMPONENT_FAMILY;
    }
}
