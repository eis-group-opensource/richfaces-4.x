/* Copyright © 2016 EIS Group and/or one of its affiliates. All rights reserved. Unpublished work under U.S. copyright laws.
 CONFIDENTIAL AND TRADE SECRET INFORMATION. No portion of this work may be copied, distributed, modified, or incorporated into any other media without EIS Group prior written consent.*/

package org.richfaces.component.attribute;

import org.richfaces.cdk.annotations.Attribute;
import org.richfaces.cdk.annotations.Description;

/**
 * Interface defining the methods for styleClass-prop.xml
 *
 * @author <a href="http://community.jboss.org/people/bleathem">Brian Leathem</a>
 */
public interface StyleClassProps {
    /**
     * Space-separated list of CSS style class(es) to be applied when this element is rendered. This value must be
     * passed through as the "class" attribute on generated markup.
     */
    @Attribute(passThrough = true,
            description = @Description(
                    value = "Space-separated list of CSS style class(es) to be applied when this element is rendered. This value must be passed through as the \"class\" attribute on generated markup.",
                    displayName = "CSS Style Classes"))
    String getStyleClass();
}