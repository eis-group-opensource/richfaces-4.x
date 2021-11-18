/* Copyright © 2016 EIS Group and/or one of its affiliates. All rights reserved. Unpublished work under U.S. copyright laws.
 CONFIDENTIAL AND TRADE SECRET INFORMATION. No portion of this work may be copied, distributed, modified, or incorporated into any other media without EIS Group prior written consent.*/
package org.richfaces.component.attribute;

import org.richfaces.cdk.annotations.Attribute;
import org.richfaces.cdk.annotations.Description;
import org.richfaces.cdk.annotations.EventName;

/**
 * Interface defining the methods for events-mouse-props.xml
 *
 * @author <a href="http://community.jboss.org/people/bleathem">Brian Leathem</a>
 */
public interface EventsMouseProps {
    /**
     * Javascript code executed when a pointer button is clicked over this element.
     */
    @Attribute(events = @EventName(value = "click"),
            passThrough = true,
            description = @Description(
                    value = "Javascript code executed when a pointer button is clicked over this element.",
                    displayName = "Button Click Script"))
    String getOnclick();

    /**
     * Javascript code executed when a pointer button is double clicked over this element.
     */
    @Attribute(events = @EventName(value = "dblclick"),
            passThrough = true,
            description = @Description(
                    value = "Javascript code executed when a pointer button is double clicked over this element.",
                    displayName = "Double Click Script"))
    String getOndblclick();

    /**
     * Javascript code executed when a pointer button is pressed down over this element.
     */
    @Attribute(events = @EventName(value = "mousedown"),
            passThrough = true,
            description = @Description(
                    value = "Javascript code executed when a pointer button is pressed down over this element.",
                    displayName = "Mouse Down Script"))
    String getOnmousedown();

    /**
     * Javascript code executed when a pointer button is released over this element.
     */
    @Attribute(events = @EventName(value = "mouseup"),
            passThrough = true,
            description = @Description(
                    value = "Javascript code executed when a pointer button is released over this element.",
                    displayName = "Mouse Up Script"))
    String getOnmouseup();

    /**
     * Javascript code executed when a pointer button is moved onto this element.
     */
    @Attribute(events = @EventName(value = "mouseover"),
            passThrough = true,
            description = @Description(
                    value = "Javascript code executed when a pointer button is moved onto this element.",
                    displayName = "Mouse Over Script"))
    String getOnmouseover();

    /**
     * Javascript code executed when a pointer button is moved within this element.
     */
    @Attribute(events = @EventName(value = "mousemove"),
            passThrough = true,
            description = @Description(
                    value = "Javascript code executed when a pointer button is moved within this element.",
                    displayName = "Mouse Move Script"))
    String getOnmousemove();

    /**
     * Javascript code executed when a pointer button is moved away from this element.
     */
    @Attribute(events = @EventName(value = "mouseout"),
            passThrough = true,
            description = @Description(
                    value = "Javascript code executed when a pointer button is moved away from this element.",
                    displayName = "Mouse Out Script"))
    String getOnmouseout();
}