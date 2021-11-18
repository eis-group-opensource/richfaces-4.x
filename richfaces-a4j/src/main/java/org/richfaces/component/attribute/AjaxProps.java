/* Copyright © 2016 EIS Group and/or one of its affiliates. All rights reserved. Unpublished work under U.S. copyright laws.
 CONFIDENTIAL AND TRADE SECRET INFORMATION. No portion of this work may be copied, distributed, modified, or incorporated into any other media without EIS Group prior written consent.*/
package org.richfaces.component.attribute;

import org.richfaces.cdk.annotations.Attribute;
import org.richfaces.cdk.annotations.Description;
import org.richfaces.cdk.annotations.EventName;

/**
 * Interface defining the methods for ajax activator components
 *
 * @author Lukas Fryc
 */
public interface AjaxProps extends AjaxActivatorProps {

    /**
     * IDs of components that will participate in the "execute" portion of the Request Processing Lifecycle. Can be a single ID,
     * a space or comma separated list of IDs, or an EL Expression evaluating to an array or Collection. Any of the keywords
     * "@this", "@form", "@all", "@none", "@region" may be specified in the identifier list. Some components make use of
     * additional keywords
     */
    @Attribute(description = @Description("IDs of components that will participate in the \"execute\" portion of the Request Processing Lifecycle. Can be a single ID, a space or comma separated list of IDs, or an EL Expression evaluating to an array or Collection. Any of the keywords \"@this\", \"@form\", \"@all\", \"@none\", \"@region\" may be specified in the identifier list. Some components make use of additional keywords"))
    Object getExecute();

    /**
     * Name of the request status component that will indicate the status of the Ajax request
     */
    @Attribute(description = @Description("Name of the request status component that will indicate the status of the Ajax request"))
    String getStatus();

    /**
     * The client-side script method to be called before an ajax request.
     */
    @Attribute(events = @EventName("begin"), description = @Description("The client-side script method to be called before an ajax request."))
    String getOnbegin();
}
