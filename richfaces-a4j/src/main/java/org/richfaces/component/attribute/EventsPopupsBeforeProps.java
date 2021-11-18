/* Copyright © 2016 EIS Group and/or one of its affiliates. All rights reserved. Unpublished work under U.S. copyright laws.
 CONFIDENTIAL AND TRADE SECRET INFORMATION. No portion of this work may be copied, distributed, modified, or incorporated into any other media without EIS Group prior written consent.*/
package org.richfaces.component.attribute;

import org.richfaces.cdk.annotations.Attribute;
import org.richfaces.cdk.annotations.Description;
import org.richfaces.cdk.annotations.EventName;

/**
 * Interface defining the methods for events-popups-before-props.xml
 *
 * @author <a href="http://community.jboss.org/people/bleathem">Brian Leathem</a>
 */
public interface EventsPopupsBeforeProps {
    /**
     * The client-side code executed before the popup disappears.
     */
    @Attribute(events = @EventName(value = "beforehide"),
            description = @Description(
                    value = "The client-side code executed before the popup disappears.",
                    displayName = "On Before Hide Script"))
    String getOnbeforehide();

    /**
     * The client-side code executed before this component is shown.
     */
    @Attribute(events = @EventName(value = "beforeshow"),
            description = @Description(
                    value = "The client-side code executed before this component is shown.",
                    displayName = "On Before Show"))
    String getOnbeforeshow();
}