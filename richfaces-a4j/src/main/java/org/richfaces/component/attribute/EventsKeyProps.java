/* Copyright © 2016 EIS Group and/or one of its affiliates. All rights reserved. Unpublished work under U.S. copyright laws.
 CONFIDENTIAL AND TRADE SECRET INFORMATION. No portion of this work may be copied, distributed, modified, or incorporated into any other media without EIS Group prior written consent.*/
package org.richfaces.component.attribute;

import org.richfaces.cdk.annotations.Attribute;
import org.richfaces.cdk.annotations.Description;
import org.richfaces.cdk.annotations.EventName;

/**
 * Interface defining the methods for events-key-props.xml
 *
 * @author <a href="http://community.jboss.org/people/bleathem">Brian Leathem</a>
 */
public interface EventsKeyProps {
    /**
     * Javascript code executed when a key is pressed and released over this element.
     */
    @Attribute(events = @EventName(value = "keypress"),
            passThrough = true,
            description = @Description(
                    value = "Javascript code executed when a key is pressed and released over this element.",
                    displayName = "Key Press Script"))
    String getOnkeypress();

    /**
     * Javascript code executed when a key is pressed down over this element.
     */
    @Attribute(events = @EventName(value = "keydown"),
            passThrough = true,
            description = @Description(
                    value = "Javascript code executed when a key is pressed down over this element.",
                    displayName = "Key Down Script"))
    String getOnkeydown();

    /**
     * Javascript code executed when a key is released over this element.
     */
    @Attribute(events = @EventName(value = "keyup"),
            passThrough = true,
            description = @Description(
                    value = "Javascript code executed when a key is released over this element.",
                    displayName = "Key Up Script"))
    String getOnkeyup();
}