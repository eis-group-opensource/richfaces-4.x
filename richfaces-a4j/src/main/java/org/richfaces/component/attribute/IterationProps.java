/* Copyright © 2016 EIS Group and/or one of its affiliates. All rights reserved. Unpublished work under U.S. copyright laws.
 CONFIDENTIAL AND TRADE SECRET INFORMATION. No portion of this work may be copied, distributed, modified, or incorporated into any other media without EIS Group prior written consent.*/

package org.richfaces.component.attribute;

import org.richfaces.cdk.annotations.Attribute;
import org.richfaces.cdk.annotations.Description;

/**
 * Interface defining the methods for iteration-props.xml
 *
 * @author <a href="http://community.jboss.org/people/bleathem">Brian Leathem</a>
 */
public interface IterationProps {
    /**
     * A request-scope attribute via which the data object for the current row will be used when iterating
     */
    @Attribute(description = @Description("A request-scope attribute via which the data object for the current row will be used when iterating"))
    String getVar();

    /**
     * Provides access to the row key in a Request scope
     */
    @Attribute(description = @Description("Provides access to the row key in a Request scope"))
    String getRowKeyVar();

    /**
     * Provides access to the state in a Request scope
     */
    @Attribute(description = @Description("Provides access to the state in a Request scope"))
    String getStateVar();

    /**
     * Provides access to the iteration status in a Request scope
     */
    @Attribute(description = @Description("Provides access to the iteration status in a Request scope"))
    String getIterationStatusVar();

    /**
     * Boolean attribute that defines whether this iteration component will reset saved children's state before
     * rendering. By default state is reset if there are no faces messages with severity error or higher
     */
    @Attribute(description = @Description("Boolean attribute that defines whether this iteration component will reset saved children's state before rendering. By default state is reset if there are no faces messages with severity error or higher"))
    boolean isKeepSaved();

    /**
     * A zero-relative row number of the first row to display
     */
    @Attribute(description = @Description("A zero-relative row number of the first row to display"))
    int getFirst();

    /**
     * Points to the data model
     */
    @Attribute(description = @Description("Points to the data model"))
    Object getValue();
}