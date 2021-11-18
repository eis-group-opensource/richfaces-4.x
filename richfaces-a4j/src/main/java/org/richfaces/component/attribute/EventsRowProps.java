/* Copyright © 2016 EIS Group and/or one of its affiliates. All rights reserved. Unpublished work under U.S. copyright laws.
 CONFIDENTIAL AND TRADE SECRET INFORMATION. No portion of this work may be copied, distributed, modified, or incorporated into any other media without EIS Group prior written consent.*/
package org.richfaces.component.attribute;

import org.richfaces.cdk.annotations.Attribute;
import org.richfaces.cdk.annotations.Description;
import org.richfaces.cdk.annotations.EventName;

/**
 * Interface defining the methods for events-row-props.xml
 *
 * @author <a href="http://community.jboss.org/people/bleathem">Brian Leathem</a>
 */
public interface EventsRowProps {
    /**
     * Javascript code executed when a pointer button is clicked over table row.
     */
    @Attribute(events = @EventName(value = "rowclick"),
            passThrough = true,
            description = @Description(
                    value = "Javascript code executed when a pointer button is clicked over table row.",
                    displayName = "Button Click Script"))
    String getOnrowclick();

    /**
     * Javascript code executed when a pointer button is double clicked over table row.
     */
    @Attribute(events = @EventName(value = "rowdblclick"),
            passThrough = true,
            description = @Description(
                    value = "Javascript code executed when a pointer button is double clicked over table row.",
                    displayName = "Double Click Script"))
    String getOnrowdblclick();

    /**
     * Javascript code executed when a pointer button is pressed down over table row.
     */
    @Attribute(events = @EventName(value = "rowmousedown"),
            passThrough = true,
            description = @Description(
                    value = "Javascript code executed when a pointer button is pressed down over table row.",
                    displayName = "Mouse Down Script"))
    String getOnrowmousedown();

    /**
     * Javascript code executed when a pointer button is released over table row.
     */
    @Attribute(events = @EventName(value = "rowmouseup"),
            passThrough = true,
            description = @Description(
                    value = "Javascript code executed when a pointer button is released over table row.",
                    displayName = "Mouse Up Script"))
    String getOnrowmouseup();

    /**
     * Javascript code executed when a pointer button is moved onto table row.
     */
    @Attribute(events = @EventName(value = "rowmouseover"),
            passThrough = true,
            description = @Description(
                    value = "Javascript code executed when a pointer button is moved onto table row.",
                    displayName = "Mouse Over Script"))
    String getOnrowmouseover();

    /**
     * Javascript code executed when a pointer button is moved within table row.
     */
    @Attribute(events = @EventName(value = "rowmousemove"),
            passThrough = true,
            description = @Description(
                    value = "Javascript code executed when a pointer button is moved within table row.",
                    displayName = "Mouse Move Script"))
    String getOnrowmousemove();

    /**
     * Javascript code executed when a pointer button is moved away from table row.
     */
    @Attribute(events = @EventName(value = "rowmouseout"),
            passThrough = true,
            description = @Description(
                    value = "Javascript code executed when a pointer button is moved away from table row.",
                    displayName = "Mouse Out Script"))
    String getOnrowmouseout();

    /**
     * Javascript code executed when a key is pressed and released over table row.
     */
    @Attribute(events = @EventName(value = "rowkeypress"),
            passThrough = true,
            description = @Description(
                    value = "Javascript code executed when a key is pressed and released over table row.",
                    displayName = "Key Press Script"))
    String getOnrowkeypress();

    /**
     * Javascript code executed when a key is pressed down over table row.
     */
    @Attribute(events = @EventName(value = "rowkeydown"),
            passThrough = true,
            description = @Description(
                    value = "Javascript code executed when a key is pressed down over table row.",
                    displayName = "Key Down Script"))
    String getOnrowkeydown();

    /**
     * Javascript code executed when a key is released over table row.
     */
    @Attribute(events = @EventName(value = "rowkeyup"),
            passThrough = true,
            description = @Description(
                    value = "Javascript code executed when a key is released over table row.",
                    displayName = "Key Up Script"))
    String getOnrowkeyup();
}