/* Copyright © 2016 EIS Group and/or one of its affiliates. All rights reserved. Unpublished work under U.S. copyright laws.
 CONFIDENTIAL AND TRADE SECRET INFORMATION. No portion of this work may be copied, distributed, modified, or incorporated into any other media without EIS Group prior written consent.*/
package org.richfaces.component.behavior;

import javax.el.ValueExpression;
import javax.faces.context.FacesContext;

import org.richfaces.component.PartialStateHolderHelper;

/**
 * @author Anton Belevich
 *
 */
public class BehaviorStateHelper extends PartialStateHolderHelper {
    private ClientBehavior behavior;

    public BehaviorStateHelper(ClientBehavior behavior) {
        super(behavior);
        this.behavior = behavior;
    }

    @Override
    protected Object getValueExpressionValue(String name) {
        Object retVal = null;
        ValueExpression ve = behavior.getValueExpression(name);
        if (ve != null) {
            retVal = ve.getValue(FacesContext.getCurrentInstance().getELContext());
        }
        return retVal;
    }
}
