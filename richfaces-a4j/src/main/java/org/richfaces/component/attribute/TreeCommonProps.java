/* Copyright © 2016 EIS Group and/or one of its affiliates. All rights reserved. Unpublished work under U.S. copyright laws.
 CONFIDENTIAL AND TRADE SECRET INFORMATION. No portion of this work may be copied, distributed, modified, or incorporated into any other media without EIS Group prior written consent.*/

package org.richfaces.component.attribute;

import org.richfaces.cdk.annotations.Attribute;
import org.richfaces.cdk.annotations.Description;
import org.richfaces.cdk.annotations.EventName;
import org.richfaces.component.SwitchType;

import javax.el.MethodExpression;

import java.util.Collection;

/**
 * Interface defining the methods for tree-common-props.xml
 *
 * @author <a href="http://community.jboss.org/people/bleathem">Brian Leathem</a>
 */
public interface TreeCommonProps {
    /**
     * The icon for component leaves
     */
    @Attribute(description = @Description(value = "The icon for component leaves."))
    String getIconLeaf();

    /**
     * The icon for expanded node
     */
    @Attribute(description = @Description(value = "The icon for expanded node."))
    String getIconExpanded();

    /**
     * The icon for collapsed node
     */
    @Attribute(description = @Description(value = "The icon for collapsed node."))
    String getIconCollapsed();

    /**
     * Space-separated list of CSS style class(es) to be applied to the tree node handles.
     */
    @Attribute(description = @Description(value = "Space-separated list of CSS style class(es) to be applied to the tree node handles."))
    String getHandleClass();

    /**
     * Space-separated list of CSS style class(es) to be applied to the tree node icons.
     */
    @Attribute(description = @Description(value = "Space-separated list of CSS style class(es) to be applied to the tree node icons."))
    String getIconClass();

    /**
     * Space-separated list of CSS style class(es) to be applied to the tree node labels.
     */
    @Attribute(description = @Description(value = "Space-separated list of CSS style class(es) to be applied to the tree node labels."))
    String getLabelClass();
}