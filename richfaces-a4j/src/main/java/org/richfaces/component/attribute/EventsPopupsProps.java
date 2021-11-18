/* Copyright © 2016 EIS Group and/or one of its affiliates. All rights reserved. Unpublished work under U.S. copyright laws.
 CONFIDENTIAL AND TRADE SECRET INFORMATION. No portion of this work may be copied, distributed, modified, or incorporated into any other media without EIS Group prior written consent.*/
package org.richfaces.component.attribute;

import org.richfaces.cdk.annotations.Attribute;
import org.richfaces.cdk.annotations.Description;
import org.richfaces.cdk.annotations.EventName;

/**
 * Interface defining the methods for events-popups-props.xml
 *
 * @author <a href="http://community.jboss.org/people/bleathem">Brian Leathem</a>
 */
public interface EventsPopupsProps {
    /**
     * The client-side code executed after the popup disappears.
     */
    @Attribute(events = @EventName(value = "hide"),
            passThrough = true,
            description = @Description(
                    value = "The client-side code executed after the popup disappears.",
                    displayName = "On Hide Script"))
    String getOnhide();

    /**
     * The client-side code executed after the popup is shown.
     */
    @Attribute(events = @EventName(value = "show"),
            passThrough = true,
            description = @Description(
                    value = "The client-side code executed after the popup is shown.",
                    displayName = "On Show Script"))
    String getOnshow();
}