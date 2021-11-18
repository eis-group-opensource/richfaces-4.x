/* Copyright © 2016 EIS Group and/or one of its affiliates. All rights reserved. Unpublished work under U.S. copyright laws.
 CONFIDENTIAL AND TRADE SECRET INFORMATION. No portion of this work may be copied, distributed, modified, or incorporated into any other media without EIS Group prior written consent.*/
package org.richfaces.component.attribute;

import org.richfaces.cdk.annotations.Attribute;
import org.richfaces.cdk.annotations.Description;
import org.richfaces.cdk.annotations.EventName;

/**
 * Interface defining the methods for input-props.xml
 *
 * @author <a href="http://community.jboss.org/people/bleathem">Brian Leathem</a>
 */
public interface InputProps extends DisabledProps {

    /**
     * Javascript code executed when this element loses focus and its value has been modified since gaining focus.
     */
    @Attribute(events = @EventName(value = "change", defaultEvent = true),
            description = @Description(
                    value = "Javascript code executed when this element loses focus and its value has been modified since gaining focus.",
                    displayName = "Input Change Script"))
    String getOnchange();

    /**
     * Javascript code executed when text within this element is selected by the user.
     */
    @Attribute(events = @EventName(value = "select"),
            passThrough = true,
            description = @Description(
                    value = "Javascript code executed when text within this element is selected by the user.",
                    displayName = "Text Select Script"))
    String getOnselect();

    /**
     * Flag indicating that this component will prohibit changes by the user. The element may receive focus unless it has also been disabled. A value of false causes no attribute to be rendered, while a value of true causes the attribute to be rendered as readonly="readonly".
     */
    @Attribute(description = @Description(
            value = "Flag indicating that this component will prohibit changes by the user. The element may receive focus unless it has also been disabled. A value of false causes no attribute to be rendered, while a value of true causes the attribute to be rendered as readonly=\"readonly\".",
            displayName = "Read Only Flag"))
    boolean isReadonly();

    /**
     * A localized user presentable name for this component.
     */
    @Attribute(description = @Description(
            value = "A localized user presentable name for this component.",
            displayName = "Label"))
    String getLabel();
}
