/* Copyright © 2016 EIS Group and/or one of its affiliates. All rights reserved. Unpublished work under U.S. copyright laws.
 CONFIDENTIAL AND TRADE SECRET INFORMATION. No portion of this work may be copied, distributed, modified, or incorporated into any other media without EIS Group prior written consent.*/
package org.richfaces.renderkit.html;

import java.io.IOException;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.render.Renderer;

import org.ajax4jsf.model.DataVisitResult;
import org.ajax4jsf.model.DataVisitor;
import org.richfaces.cdk.annotations.JsfRenderer;
import org.richfaces.component.UIRepeat;

/**
 * @author Nick Belaevski
 *
 */
@JsfRenderer(type = "org.richfaces.RepeatRenderer", family = UIRepeat.COMPONENT_FAMILY)
public class RepeatRenderer extends Renderer {
    @Override
    public boolean getRendersChildren() {
        return true;
    }

    public void encodeChildren(FacesContext context, UIComponent component) throws IOException {
        final UIRepeat repeater = (UIRepeat) component;
        try {
            DataVisitor visitor = new DataVisitor() {
                public DataVisitResult process(FacesContext context, Object rowKey, Object argument) {
                    repeater.setRowKey(context, rowKey);

                    if (repeater.isRowAvailable()) {
                        if (repeater.getChildCount() > 0) {
                            try {
                                for (UIComponent child : repeater.getChildren()) {
                                    child.encodeAll(context);
                                }
                            } catch (IOException e) {
                                // TODO Auto-generated catch block
                                e.printStackTrace();
                            }
                        }
                    }

                    return DataVisitResult.CONTINUE;
                }
            };

            repeater.walk(context, visitor, null);
        } finally {
            repeater.setRowKey(context, null);
        }
    }
}
