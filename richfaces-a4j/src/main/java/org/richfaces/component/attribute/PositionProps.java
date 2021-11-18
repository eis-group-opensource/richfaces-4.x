/* Copyright © 2016 EIS Group and/or one of its affiliates. All rights reserved. Unpublished work under U.S. copyright laws.
 CONFIDENTIAL AND TRADE SECRET INFORMATION. No portion of this work may be copied, distributed, modified, or incorporated into any other media without EIS Group prior written consent.*/

package org.richfaces.component.attribute;

import org.richfaces.cdk.annotations.Attribute;
import org.richfaces.cdk.annotations.Description;
import org.richfaces.component.Positioning;

/**
 * Interface defining the methods for position-props.xml
 *
 * @author <a href="http://community.jboss.org/people/bleathem">Brian Leathem</a>
 */
public interface PositionProps {
    /**
     * <p>Set the corner attachment point with which the popup should be connected. Possible values are:<br />
     * auto, topLeft, topRight, bottomLeft, bottomRight, autoLeft,
     * autoRight, topAuto, bottomAuto</p>
     * <p/>
     * <p>Default value is auto</p>
     */
    @Attribute(description = @Description(
            value = "<p>Set the corner attachment point with which the popup should be connected. Possible values are:<br />auto, topLeft, topRight, bottomLeft, bottomRight, autoLeft, autoRight, topAuto, bottomAuto</p><p>Default value is auto</p>",
            displayName = "Joint Point"),
            defaultValue = "Positioning.auto")
    Positioning getJointPoint();

    /**
     * <p>Set the direction of the popup.  Possible values are:<br />
     * auto, topLeft, topRight, bottomLeft, bottomRight, autoLeft,
     * autoRight, topAuto, bottomAuto</p>
     * <p/>
     * <p>Default value is auto</p>
     */
    @Attribute(description = @Description(
            value = "<p>Set the direction of the popup.  Possible values are:<br />auto, topLeft, topRight, bottomLeft, bottomRight, autoLeft, autoRight, topAuto, bottomAuto</p><p>Default value is auto</p>",
            displayName = "Direction"),
            defaultValue = "Positioning.auto")
    Positioning getDirection();

    /**
     * <p>Sets the vertical offset between popup element and the conjunction point</p>
     * <p/>
     * <p>Default value is 0</p>
     */
    @Attribute(description = @Description(
            value = "<p>Sets the vertical offset between popup element and the conjunction point</p><p>Default value is 0</p>",
            displayName = "Vertical Offset"),
            defaultValue = "0")
    int getVerticalOffset();

    /**
     * <p>Sets the horizontal offset between popup element and the conjunction point</p>
     * <p/>
     * <p>Default value is 0</p>
     */
    @Attribute(description = @Description(
            value = "<p>Sets the horizontal offset between popup element and the conjunction point</p><p>Default value is 0</p>",
            displayName = "Horizontal Offset"),
            defaultValue = "0")
    int getHorizontalOffset();
}