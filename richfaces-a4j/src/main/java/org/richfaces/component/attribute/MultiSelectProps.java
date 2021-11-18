/* Copyright © 2016 EIS Group and/or one of its affiliates. All rights reserved. Unpublished work under U.S. copyright laws.
 CONFIDENTIAL AND TRADE SECRET INFORMATION. No portion of this work may be copied, distributed, modified, or incorporated into any other media without EIS Group prior written consent.*/

package org.richfaces.component.attribute;

import org.richfaces.cdk.annotations.Attribute;
import org.richfaces.cdk.annotations.Description;
import org.richfaces.cdk.annotations.EventName;

/**
 * Interface defining the methods for multiselect-props.xml
 *
 * @author <a href="http://community.jboss.org/people/bleathem">Brian Leathem</a>
 */
public interface MultiSelectProps extends SelectProps {
    /**
     * Expose the value from the value attribute under this request scoped key so that it may be referred to in EL for the value of other attributes.
     */
    @Attribute(description = @Description(value = "Expose the value from the value attribute under this request scoped key so that it may be referred to in EL for the value of other attributes."))
    String getVar();

    /**
     * Optional attribute that is a literal string that is the fully qualified class name of a concrete class that
     * implements java.util.Collection, or an EL expression that evaluates to either 1. such a String, or 2. the Class object itself.
     */
    @Attribute(description = @Description(value = "Optional attribute that is a literal string that is the fully qualified class name of a concrete class that implements java.util.Collection, or an EL expression that evaluates to either 1. such a String, or 2. the Class object itself."))
    String getCollectionType();

    /**
     * The minimum height of the item list (in pixels).
     */
    @Attribute(description = @Description(value = "The minimum height of the item list (in pixels)."))
    String getMinListHeight();

    /**
     * The maximum height of the item list (in pixels).
     */
    @Attribute(description = @Description(value = "The maximum height of the item list (in pixels)."))
    String getMaxListHeight();

    @Attribute(hidden = true)
    String getDefaultLabel();

    @Attribute(hidden = true)
    String getActiveClass();

    @Attribute(hidden = true)
    String getChangedClass();

    @Attribute(hidden = true)
    String getListClass();

    /**
     * Space-separated list of CSS style class(es) to be applied to the columns of the list elements. This value must be passed through as the "class" attribute on generated markup.
     */
    @Attribute(description = @Description(value = "Space-separated list of CSS style class(es) to be applied to the columns of the list elements. This value must be passed through as the \"class\" attribute on generated markup."))
    String getColumnClasses();

    /**
     * Space-separated list of CSS style class(es) to be applied to the header element. This value must be passed through as the "class" attribute on generated markup.
     */
    @Attribute(description = @Description(value = "Space-separated list of CSS style class(es) to be applied to the header element. This value must be passed through as the \"class\" attribute on generated markup."))
    String getHeaderClass();

    /**
     * Javascript code executed when the list element loses focus and its value has been modified since gaining focus.
     */
    @Attribute(events = @EventName(value = "change", defaultEvent = true), description = @Description(value = "Javascript code executed when the list element loses focus and its value has been modified since gaining focus."))
    String getOnchange();

    /**
     * Javascript code executed when this element receives focus
     */
    @Attribute(events = @EventName("focus"), description = @Description(value = "Javascript code executed when this element receives focus."))
    String getOnfocus();

    /**
     * Javascript code executed when this element loses focus.
     */
    @Attribute(events = @EventName("blur"), description = @Description(value = "Javascript code executed when this element loses focus."))
    String getOnblur();
}