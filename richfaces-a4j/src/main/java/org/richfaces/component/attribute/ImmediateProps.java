/* Copyright © 2016 EIS Group and/or one of its affiliates. All rights reserved. Unpublished work under U.S. copyright laws.
 CONFIDENTIAL AND TRADE SECRET INFORMATION. No portion of this work may be copied, distributed, modified, or incorporated into any other media without EIS Group prior written consent.*/
package org.richfaces.component.attribute;

import org.richfaces.cdk.annotations.Attribute;
import org.richfaces.cdk.annotations.Description;
import org.richfaces.cdk.annotations.EventName;

/**
 * Interface defining the methods for immediate-prop.xml
 *
 * @author <a href="http://community.jboss.org/people/bleathem">Brian Leathem</a>
 */
public interface ImmediateProps {

    /**
     * Flag indicating that, if this component is activated by the user, notifications should be delivered to interested
     * listeners and actions immediately (that is, during Apply Request Values phase) rather than waiting until the
     * Invoke Application phase.
     */
    @Attribute(description = @Description("Flag indicating that, if this component is activated by the user, notifications should be delivered to interested listeners and actions immediately (that is, during Apply Request Values phase) rather than waiting until the Invoke Application phase."))
    boolean isImmediate();

}
