/* Copyright © 2016 EIS Group and/or one of its affiliates. All rights reserved. Unpublished work under U.S. copyright laws.
 CONFIDENTIAL AND TRADE SECRET INFORMATION. No portion of this work may be copied, distributed, modified, or incorporated into any other media without EIS Group prior written consent.*/
package org.richfaces.component.attribute;

import org.richfaces.cdk.annotations.Attribute;
import org.richfaces.cdk.annotations.Description;
import org.richfaces.cdk.annotations.EventName;

/**
 * Interface defining the methods for focus-props.xml, specifying focus-related attributes: tabindex, onfocus, onblur
 *
 * @author Lukas Fryc
 * @author <a href="http://community.jboss.org/people/bleathem">Brian Leathem</a>
 */
public interface FocusProps {

    /**
     * Javascript code executed when this element loses focus.
     */
    @Attribute(events = @EventName("blur"), passThrough = true,
            description = @Description(value="Javascript code executed when this element loses focus.", displayName = "Focus Off Script"))
    String getOnblur();

    /**
     * Javascript code executed when this element receives focus.
     */
    @Attribute(events = @EventName("focus"), passThrough = true,
            description = @Description(value="Javascript code executed when this element receives focus.", displayName = "Focus On Script"))
    String getOnfocus();

    /**
     * Position of this element in the tabbing order for the current document.
     * This value must be an integer between 0 and 32767.
     */
    @Attribute(passThrough = true,
            description = @Description(
                    value="Position of this element in the tabbing order for the current document.  This value must be an integer between 0 and 32767.",
                    displayName = "Tab Index"))
    String getTabindex();
}
