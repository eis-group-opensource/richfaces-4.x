/* Copyright © 2016 EIS Group and/or one of its affiliates. All rights reserved. Unpublished work under U.S. copyright laws.
 CONFIDENTIAL AND TRADE SECRET INFORMATION. No portion of this work may be copied, distributed, modified, or incorporated into any other media without EIS Group prior written consent.*/
package org.richfaces.component;

import javax.faces.component.UIComponent;
import javax.faces.component.UIData;
import javax.faces.context.FacesContext;

/**
 * @author Nick Belaevski
 *
 */
public final class DataComponentsContextUtil {
    private static final String MODEL_RESET_ATTRIBUTE_SUFFIX = "#" + DataComponentsContextUtil.class.getName();

    private DataComponentsContextUtil() {
    }

    private static String getAttributeName(FacesContext context, UIComponent component) {
        return component.getClientId(context) + MODEL_RESET_ATTRIBUTE_SUFFIX;
    }

    public static void resetDataModelOncePerPhase(FacesContext context, UIComponent component) {
        String attributeName = getAttributeName(context, component);
        if (context.getCurrentPhaseId() != context.getAttributes().put(attributeName, context.getCurrentPhaseId())) {
            resetDataModel(context, component);
        }
    }

    private static void resetDataModel(FacesContext context, UIComponent component) {
        if (component instanceof UIDataAdaptor) {
            ((UIDataAdaptor) component).resetDataModel();
        } else if (component instanceof UIData) {
            // hack to reset cached data model
            component.setValueExpression("value", component.getValueExpression("value"));
        } else {
            throw new IllegalArgumentException(component.toString());
        }
    }
}
