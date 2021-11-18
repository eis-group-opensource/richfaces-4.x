/* Copyright © 2016 EIS Group and/or one of its affiliates. All rights reserved. Unpublished work under U.S. copyright laws.
 CONFIDENTIAL AND TRADE SECRET INFORMATION. No portion of this work may be copied, distributed, modified, or incorporated into any other media without EIS Group prior written consent.*/
package org.richfaces.resource;

import static org.richfaces.application.configuration.ConfigurationServiceHelper.getBooleanConfigurationValue;

import javax.faces.context.FacesContext;

import org.richfaces.application.CommonComponentsConfiguration;

import com.google.common.collect.ImmutableList;

/**
 * deprecated in RF-13314
 *
 * @author Nick Belaevski
 *
 */
@Deprecated
public class AjaxResourceLibrary implements ResourceLibrary {

    private static final ImmutableList<ResourceKey> AJAX_ONLY_KEYS = ImmutableList.of(
        ResourceKey.create("jsf.js", "javax.faces"),
        ResourceKey.create("jquery.js", "org.richfaces"),
        ResourceKey.create("richfaces.js", "org.richfaces"));

    private static final ImmutableList<ResourceKey> AJAX_WITH_QUEUE_KEYS = ImmutableList.<ResourceKey>builder()
        .addAll(AJAX_ONLY_KEYS)
        .add(ResourceKey.create("richfaces-queue.js", "org.richfaces")).build();

    public Iterable<ResourceKey> getResources() {
        // TODO - initialize at creation.
        if (getBooleanConfigurationValue(FacesContext.getCurrentInstance(), CommonComponentsConfiguration.Items.queueEnabled)) {
            return AJAX_WITH_QUEUE_KEYS;
        }

        return AJAX_ONLY_KEYS;
    }
}
