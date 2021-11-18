/* Copyright © 2016 EIS Group and/or one of its affiliates. All rights reserved. Unpublished work under U.S. copyright laws.
 CONFIDENTIAL AND TRADE SECRET INFORMATION. No portion of this work may be copied, distributed, modified, or incorporated into any other media without EIS Group prior written consent.*/
package org.richfaces.component.attribute;

import org.richfaces.cdk.annotations.Attribute;
import org.richfaces.cdk.annotations.Description;
import org.richfaces.cdk.annotations.EventName;

/**
 * Interface defining the methods for command-button-props.xml
 *
 * @author <a href="http://community.jboss.org/people/bleathem">Brian Leathem</a>
 */
public interface CommandButtonProps extends DisabledProps, EventsMouseProps, EventsKeyProps {
    /**
     * Javascript code executed when a pointer button is clicked over this element.
     */
    @Override
    @Attribute(events = { @EventName(value = "click", defaultEvent = true), @EventName(value = "action") },
            description = @Description(
                    value = "Javascript code executed when a pointer button is clicked over this element.",
                    displayName = "Button Click Script"))
    String getOnclick();

    /**
     * Type of button to create. Can be one of "submit", "button", "image" and "reset". If not specified, the default value is "submit".
     */
    @Attribute(defaultValue = "submit",
            description = @Description(
                    value = "Type of button to create. Can be one of \"submit\", \"button\", \"image\" and \"reset\". If not specified, the default value is \"submit\".",
                    displayName = "Button Type"))
    String getType();

}