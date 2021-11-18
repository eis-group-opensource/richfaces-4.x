/* Copyright © 2016 EIS Group and/or one of its affiliates. All rights reserved. Unpublished work under U.S. copyright laws.
 CONFIDENTIAL AND TRADE SECRET INFORMATION. No portion of this work may be copied, distributed, modified, or incorporated into any other media without EIS Group prior written consent.*/

package org.richfaces.component.attribute;

import org.richfaces.cdk.annotations.Attribute;
import org.richfaces.cdk.annotations.Description;

/**
 * Interface defining the disabled attribute
 *
 * @author <a href="http://community.jboss.org/people/bleathem">Brian Leathem</a>
 */
public interface DisabledProps {
    /**
     * Flag indicating that this element must never receive focus or be included in a subsequent submit.
     */
    @Attribute(description = @Description(
            value = "Flag indicating that this element must never receive focus or be included in a subsequent submit. Default value - \"false\"",
            displayName = "Disabled Flag"),
            defaultValue = "false")
    boolean isDisabled();
}