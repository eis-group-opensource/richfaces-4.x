/* Copyright © 2016 EIS Group and/or one of its affiliates. All rights reserved. Unpublished work under U.S. copyright laws.
 CONFIDENTIAL AND TRADE SECRET INFORMATION. No portion of this work may be copied, distributed, modified, or incorporated into any other media without EIS Group prior written consent.*/
package org.richfaces.component;

/**
 * @author akolonitsky
 * @since Jun 15, 2010
 */
public enum SwitchType {
    /**
     * value for tab change method for - client-side tabs.
     */
    client,
    /**
     * value for tab change method - server-side tabs
     */
    server,
    /**
     * value for tab change method - ajax tabs
     */
    ajax;
    public static final SwitchType DEFAULT = SwitchType.ajax;
}
