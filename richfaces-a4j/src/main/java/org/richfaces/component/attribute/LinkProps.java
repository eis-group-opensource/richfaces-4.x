/* Copyright © 2016 EIS Group and/or one of its affiliates. All rights reserved. Unpublished work under U.S. copyright laws.
 CONFIDENTIAL AND TRADE SECRET INFORMATION. No portion of this work may be copied, distributed, modified, or incorporated into any other media without EIS Group prior written consent.*/

package org.richfaces.component.attribute;

import org.richfaces.cdk.annotations.Attribute;
import org.richfaces.cdk.annotations.Description;
import org.richfaces.cdk.annotations.EventName;

/**
 * Interface defining the methods for link-props.xml
 *
 * @author <a href="http://community.jboss.org/people/bleathem">Brian Leathem</a>
 */
public interface LinkProps extends DisabledProps, EventsMouseProps, EventsKeyProps {


    /**
     * Javascript code executed when a pointer button is clicked over this element.
     */
    @Override
    @Attribute(events = { @EventName(value = "click", defaultEvent = true), @EventName(value = "action") },
            description = @Description(
                    value = "Javascript code executed when a pointer button is clicked over this element.",
                    displayName = "Button Click Script"))
    String getOnclick();

    /**
     * The character encoding of the resource designated by this hyperlink.
     */
    @Attribute(passThrough = true,
            description = @Description(
                    value = "The character encoding of the resource designated by this hyperlink.",
                    displayName = "Character Set"))
    String getCharset();


    /**
     * The position and shape of the hot spot on the screen (for use in client-side image maps).
     */
    @Attribute(passThrough = true,
            description = @Description(
                    value = "The position and shape of the hot spot on the screen (for use in client-side image maps).",
                    displayName = "Coordinates"))
    String getCoords();

    /**
     * The language code of the resource designated by this hyperlink.
     */
    @Attribute(passThrough = true,
            description = @Description(
                    value = "The language code of the resource designated by this hyperlink.",
                    displayName = "Language"))
    String getHreflang();

    /**
     * The relationship from the current document to the anchor specified by this hyperlink.
     * The value of this attribute is a space-separated list of link types.
     */
    @Attribute(passThrough = true,
            description = @Description(
                    value = "The relationship from the current document to the anchor specified by this hyperlink. The value of this attribute is a space-separated list of link types.",
                    displayName = "Relationship"))
    String getRel();

    /**
     * A reverse link from the anchor specified by this hyperlink to the current document.
     * The value of this attribute is a space-separated list of link types.
     */
    @Attribute(passThrough = true,
            description = @Description(
                    value = "A reverse link from the anchor specified by this hyperlink to the current document. The value of this attribute is a space-separated list of link types.",
                    displayName = "Reverse Link"))
    String getRev();

    /**
     * The shape of the hot spot on the screen (for use in client-side image maps). Valid values are:
     * default (entire region); rect (rectangular region); circle (circular region); and poly (polygonal region).
     */
    @Attribute(passThrough = true,
            description = @Description(
                    value = "The shape of the hot spot on the screen (for use in client-side image maps). Valid values are: default (entire region); rect (rectangular region); circle (circular region); and poly (polygonal region).",
                    displayName = "Shape"))
    String getShape();

    /**
     * Name of a frame where the resource retrieved via this hyperlink is to be displayed.
     */
    @Attribute(
            description = @Description(
                    value = "Name of a frame where the resource retrieved via this hyperlink is to be displayed.",
                    displayName = "Target Frame"))
    String getTarget();

    /**
     * The content type of the resource designated by this hyperlink.
     */
    @Attribute(passThrough = true,
            description = @Description(
                    value = "The content type of the resource designated by this hyperlink.",
                    displayName = "Content Type"))
    String getType();
}
