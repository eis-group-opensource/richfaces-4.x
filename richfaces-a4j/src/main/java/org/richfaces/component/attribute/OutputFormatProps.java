/* Copyright © 2016 EIS Group and/or one of its affiliates. All rights reserved. Unpublished work under U.S. copyright laws.
 CONFIDENTIAL AND TRADE SECRET INFORMATION. No portion of this work may be copied, distributed, modified, or incorporated into any other media without EIS Group prior written consent.*/

package org.richfaces.component.attribute;

import org.richfaces.cdk.annotations.Attribute;
import org.richfaces.cdk.annotations.Description;

/**
 * Interface defining the methods for output-format-props.xml
 *
 * @author <a href="http://community.jboss.org/people/bleathem">Brian Leathem</a>
 */
public interface OutputFormatProps extends DisabledProps, EventsMouseProps, EventsKeyProps {
    /**
     * Flag indicating that characters that are sensitive in HTML and XML markup must be escaped. This flag is set to "true" by default.
     */
    @Attribute(defaultValue = "true",
            description = @Description(
                    value = "Flag indicating that characters that are sensitive in HTML and XML markup must be escaped. This flag is set to \"true\" by default.",
                    displayName = "Escape Characters Flag"))
    boolean isEscape();
}