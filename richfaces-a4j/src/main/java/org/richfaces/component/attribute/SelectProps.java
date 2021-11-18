/* Copyright © 2016 EIS Group and/or one of its affiliates. All rights reserved. Unpublished work under U.S. copyright laws.
 CONFIDENTIAL AND TRADE SECRET INFORMATION. No portion of this work may be copied, distributed, modified, or incorporated into any other media without EIS Group prior written consent.*/

package org.richfaces.component.attribute;

import org.richfaces.cdk.annotations.Attribute;
import org.richfaces.cdk.annotations.Description;

/**
 * Interface defining the methods for select-props.xml
 *
 * @author <a href="http://community.jboss.org/people/bleathem">Brian Leathem</a>
 */
public interface SelectProps {

    /**
     * The width of the list element (in pixels)
     */
    @Attribute(description = @Description(value = "The width of the list element (in pixels)"))
    String getListWidth();

    /**
     * The height of the list element (in pixels)
     */
    @Attribute(description = @Description(value = "The height of the list element (in pixels)"))
    String getListHeight();

    /**
     * Used to set the display text when value is undefined
     */
    @Attribute(description = @Description(value = "Used to set the display text when value is undefined"))
    String getDefaultLabel();

    /**
     * Space-separated list of CSS style class(es) to be applied to the list element when it is in the "active" state.
     * This value must be passed through as the "class" attribute on generated markup.
     */
    @Attribute(description = @Description(value = "Space-separated list of CSS style class(es) to be applied to the list element when it is in the \"active\" state. This value must be passed through as the \"class\" attribute on generated markup."))
    String getActiveClass();

    /**
     * Space-separated list of CSS style class(es) to be applied to the list element when it is in the "changed" state.
     * This value must be passed through as the "class" attribute on generated markup.
     */
    @Attribute(description = @Description(value = "Space-separated list of CSS style class(es) to be applied to the list element when it is in the \"changed\" state. This value must be passed through as the \"class\" attribute on generated markup."))
    String getChangedClass();

    /**
     * Space-separated list of CSS style class(es) to be applied to the list items. This value must be passed through as the "class" attribute on generated markup.
     */
    @Attribute(description = @Description(value = "Space-separated list of CSS style class(es) to be applied to the list items. This value must be passed through as the \"class\" attribute on generated markup."))
    String getItemClass();

    /**
     * Space-separated list of CSS style class(es) to be applied to the selected list item. This value must be passed through as the "class" attribute on generated markup.
     */
    @Attribute(description = @Description(value = "Space-separated list of CSS style class(es) to be applied to the selected list item. This value must be passed through as the \"class\" attribute on generated markup."))
    String getSelectItemClass();

    /**
     * Space-separated list of CSS style class(es) to be applied to the list element when it is disabled. This value must be passed through as the "class" attribute on generated markup.
     */
    @Attribute(description = @Description(value = "Space-separated list of CSS style class(es) to be applied to the list element when it is disabled. This value must be passed through as the \"class\" attribute on generated markup."))
    String getDisabledClass();

    /**
     * Space-separated list of CSS style class(es) to be applied to the list element. This value must be passed through as the "class" attribute on generated markup.
     */
    @Attribute(description = @Description(value = "Space-separated list of CSS style class(es) to be applied to the list element. This value must be passed through as the \"class\" attribute on generated markup."))
    String getListClass();
}