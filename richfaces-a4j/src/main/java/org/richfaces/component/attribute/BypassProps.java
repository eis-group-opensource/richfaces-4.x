/* Copyright © 2016 EIS Group and/or one of its affiliates. All rights reserved. Unpublished work under U.S. copyright laws.
 CONFIDENTIAL AND TRADE SECRET INFORMATION. No portion of this work may be copied, distributed, modified, or incorporated into any other media without EIS Group prior written consent.*/
package org.richfaces.component.attribute;

import org.richfaces.cdk.annotations.Attribute;
import org.richfaces.cdk.annotations.Description;

/**
 * Interface defining the methods for bypass-props.xml
 *
 * @author <a href="http://community.jboss.org/people/bleathem">Brian Leathem</a>
 */
public interface BypassProps {
    /**
     * If "true", after process validations phase it skips updates of model beans on a force render response.
     * It can be used for validating components input.
     */
    @Attribute(description = @Description("If \"true\", after process validations phase it skips updates of model beans on a force render response.  It can be used for validating components input."))
    boolean isBypassUpdates();
}