/* Copyright © 2016 EIS Group and/or one of its affiliates. All rights reserved. Unpublished work under U.S. copyright laws.
 CONFIDENTIAL AND TRADE SECRET INFORMATION. No portion of this work may be copied, distributed, modified, or incorporated into any other media without EIS Group prior written consent.*/

package org.richfaces.component.attribute;

import org.richfaces.cdk.annotations.Attribute;
import org.richfaces.cdk.annotations.Description;

/**
 * Interface defining the methods for popups-props.xml
 *
 * @author <a href="http://community.jboss.org/people/bleathem">Brian Leathem</a>
 */
public interface PopupsProps {
    /**
     * Attribute is similar to the standard HTML attribute and can specify window placement relative to the content. Default value is "3".
     */
    @Attribute(description = @Description("Attribute is similar to the standard HTML attribute and can specify window placement relative to the content. Default value is \"3\"."),
               defaultValue = "3")
    int getZindex();
}