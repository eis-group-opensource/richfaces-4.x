/* Copyright © 2016 EIS Group and/or one of its affiliates. All rights reserved. Unpublished work under U.S. copyright laws.
 CONFIDENTIAL AND TRADE SECRET INFORMATION. No portion of this work may be copied, distributed, modified, or incorporated into any other media without EIS Group prior written consent.*/
package org.richfaces.resource;

import static org.richfaces.application.configuration.ConfigurationServiceHelper.getBooleanConfigurationValue;

import java.util.Collections;

import javax.faces.context.FacesContext;

import org.richfaces.application.CommonComponentsConfiguration;

import com.google.common.collect.ImmutableList;

/**
 * This is a modified version of {@link AjaxResourceLibrary} that renders just richfaces-queue.js resource when it is configured.
 *
 * @author Nick Belaevski
 * @author Lukas Fryc
 */
public class QueueResourceLibrary implements ResourceLibrary {
    private static final ImmutableList<ResourceKey> AJAX_WITH_QUEUE_KEYS = ImmutableList.<ResourceKey>builder()
        .add(ResourceKey.create("richfaces-queue.js", "org.richfaces")).build();

    public Iterable<ResourceKey> getResources() {
        if (getBooleanConfigurationValue(FacesContext.getCurrentInstance(), CommonComponentsConfiguration.Items.queueEnabled)) {
            return AJAX_WITH_QUEUE_KEYS;
        }

        return Collections.emptyList();
    }
}
