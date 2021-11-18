/* Copyright © 2016 EIS Group and/or one of its affiliates. All rights reserved. Unpublished work under U.S. copyright laws.
 CONFIDENTIAL AND TRADE SECRET INFORMATION. No portion of this work may be copied, distributed, modified, or incorporated into any other media without EIS Group prior written consent.*/
package org.richfaces.component.attribute;

import org.richfaces.cdk.annotations.Attribute;
import org.richfaces.cdk.annotations.Description;
import org.richfaces.cdk.annotations.EventName;

/**
 * Interface defining the methods for ajax-props.xml
 *
 * @author Lukas Fryc
 */
public interface AjaxActivatorProps {

    /**
     * IDs of components that will participate in the "render" portion of the Request Processing Lifecycle. Can be a single ID,
     * a space or comma separated list of Id's, or an EL Expression evaluating to an array or Collection. Any of the keywords
     * "@this", "@form", "@all", "@none", "@region" may be specified in the identifier list. Some components make use of
     * additional keywords
     */
    @Attribute(description = @Description("IDs of components that will participate in the \"render\" portion of the Request Processing Lifecycle. Can be a single ID, a space or comma separated list of Id's, or an EL Expression evaluating to an array or Collection. Any of the keywords \"@this\", \"@form\", \"@all\", \"@none\", \"@region\" may be specified in the identifier list. Some components make use of additional keywords"))
    Object getRender();

    /**
     * If "true", render only those ids specified in the "render" attribute, forgoing the render of the auto-rendered panels
     */
    @Attribute(defaultValue = "false", description = @Description("If \"true\", render only those ids specified in the \"render\" attribute, forgoing the render of the auto-rendered panels"))
    boolean isLimitRender();

    /**
     * Serialized (on default with JSON) data passed to the client by a developer on an AJAX request. It's accessible via
     * "event.data" syntax. Both primitive types and complex types such as arrays and collections can be serialized and used
     * with data
     */
    @Attribute(description = @Description("Serialized (on default with JSON) data passed to the client by a developer on an AJAX request. It's accessible via \"event.data\" syntax. Both primitive types and complex types such as arrays and collections can be serialized and used with data"))
    Object getData();

    /**
     * The client-side script method to be called after the ajax response comes back, but before the DOM is updated
     */
    @Attribute(events = @EventName("beforedomupdate"), description = @Description("The client-side script method to be called after the ajax response comes back, but before the DOM is updated"))
    String getOnbeforedomupdate();

    /**
     * The client-side script method to be called after the DOM is updated
     */
    @Attribute(events = @EventName("complete"), description = @Description("The client-side script method to be called after the DOM is updated"))
    String getOncomplete();

    /**
     * If true, indicate that this particular Ajax transaction is a value reset transaction. This will cause resetValue() to be called on any EditableValueHolder instances encountered as a result of this ajax transaction. If not specified, or the value is false, no such indication is made.
     */
    @Attribute(description = @Description("If true, indicate that this particular Ajax transaction is a value reset transaction. This will cause resetValue() to be called on any EditableValueHolder instances encountered as a result of this ajax transaction. If not specified, or the value is false, no such indication is made."))
    boolean isResetValues();
}
