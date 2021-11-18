/* Copyright © 2016 EIS Group and/or one of its affiliates. All rights reserved. Unpublished work under U.S. copyright laws.
 CONFIDENTIAL AND TRADE SECRET INFORMATION. No portion of this work may be copied, distributed, modified, or incorporated into any other media without EIS Group prior written consent.*/
package org.richfaces.component.util;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;

import com.google.common.base.Strings;

/**
 * @author Nick Belaevski
 *
 */
public final class MessageUtil {
    private MessageUtil() {
    }

    public static String getLabel(FacesContext context, UIComponent component) {
        String label = (String) component.getAttributes().get("label");

        if (Strings.isNullOrEmpty(label)) {
            label = component.getClientId(context);
        }

        return label;
    }
}
