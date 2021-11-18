/* Copyright © 2016 EIS Group and/or one of its affiliates. All rights reserved. Unpublished work under U.S. copyright laws.
 CONFIDENTIAL AND TRADE SECRET INFORMATION. No portion of this work may be copied, distributed, modified, or incorporated into any other media without EIS Group prior written consent.*/
package org.richfaces.component.attribute;

import org.richfaces.cdk.annotations.Attribute;
import org.richfaces.cdk.annotations.Description;
import org.richfaces.cdk.annotations.EventName;

/**
 * Interface defining the methods for i18n-props.xml
 *
 * @author <a href="http://community.jboss.org/people/bleathem">Brian Leathem</a>
 */
public interface I18nProps {
    /**
     * Direction indication for text that does not inherit directionality. Valid values are "LTR" (left-to-right) and "RTL" (right-to-left).
     */
    @Attribute(passThrough = true,
            description = @Description(
                    value = "Direction indication for text that does not inherit directionality. Valid values are \"LTR\" (left-to-right) and \"RTL\" (right-to-left).",
                    displayName = "Direction"))
    String getDir();

    /**
     * Code describing the language used in the generated markup for this component.
     */
    @Attribute(passThrough = true,
            description = @Description(
                    value = "Code describing the language used in the generated markup for this component.",
                    displayName = "Language Code"))
    String getLang();
}