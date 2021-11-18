/* Copyright © 2016 EIS Group and/or one of its affiliates. All rights reserved. Unpublished work under U.S. copyright laws.
 CONFIDENTIAL AND TRADE SECRET INFORMATION. No portion of this work may be copied, distributed, modified, or incorporated into any other media without EIS Group prior written consent.*/
package org.richfaces.application;

import org.richfaces.application.configuration.ConfigurationItem;

/**
 * @author Nick Belaevski
 *
 */
public final class CommonComponentsConfiguration {
    private CommonComponentsConfiguration() {
    }

    public enum Items {

        @ConfigurationItem(defaultValue = "true", names = "org.richfaces.queue.enabled", literal = true)
        queueEnabled

    }
}
