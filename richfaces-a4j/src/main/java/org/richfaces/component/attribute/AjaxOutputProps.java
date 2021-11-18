/* Copyright © 2016 EIS Group and/or one of its affiliates. All rights reserved. Unpublished work under U.S. copyright laws.
 CONFIDENTIAL AND TRADE SECRET INFORMATION. No portion of this work may be copied, distributed, modified, or incorporated into any other media without EIS Group prior written consent.*/
package org.richfaces.component.attribute;

import org.richfaces.cdk.annotations.Attribute;
import org.richfaces.cdk.annotations.Description;

/**
 * Interface defining the methods for AjaxOutput-props.xml
 *
 * @author <a href="http://community.jboss.org/people/bleathem">Brian Leathem</a>
 */
public interface AjaxOutputProps {
    /**
     * Defines, whether the content of this component must be (or not) included in AJAX response created by parent AJAX
     * Container, even if it is not forced by reRender list of ajax action. Ignored if component marked to output by
     * some Ajax action component. Default value - "true"
     */
    @Attribute(description = @Description("Defines, whether the content of this component must be (or not) included in AJAX response created by parent AJAX Container, even if it is not forced by reRender list of ajax action. Ignored if component marked to output by some Ajax action component. Default value - \"true\""), defaultValue = "true")
    boolean isAjaxRendered();

    /**
     * Flag to mark all child components to non-transient. If true, all children components will be set to non-transient
     * state and keep in saved components tree. For output in self-renderer region all content ( By default, all content
     * in &lt;f:verbatim&gt; tags and non-jsf elements in facelets, marked as transient - since, self-rendered ajax
     * regions don't plain output for ajax processing ).
     */
    @Attribute(description = @Description("Flag to mark all child components to non-transient. If true, all children components will be set to non-transient state and keep in saved components tree. For output in self-renderer region all content ( By default, all content in &lt;f:verbatim&gt; tags and non-jsf elements in facelets, marked as transient - since, self-rendered ajax regions don't plain output for ajax processing )."))
    boolean isKeepTransient();
}