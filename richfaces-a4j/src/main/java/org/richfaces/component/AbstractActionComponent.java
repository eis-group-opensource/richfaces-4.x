/* Copyright © 2016 EIS Group and/or one of its affiliates. All rights reserved. Unpublished work under U.S. copyright laws.
 CONFIDENTIAL AND TRADE SECRET INFORMATION. No portion of this work may be copied, distributed, modified, or incorporated into any other media without EIS Group prior written consent.*/
package org.richfaces.component;

import org.richfaces.cdk.annotations.Attribute;
import org.richfaces.component.attribute.BypassProps;

import javax.faces.component.UICommand;
import javax.faces.event.ActionEvent;
import javax.faces.event.FacesEvent;
import javax.faces.event.PhaseId;

/**
 * @author Nick Belaevski
 *
 */
public abstract class AbstractActionComponent extends UICommand implements BypassProps {

    @Override
    public void queueEvent(FacesEvent event) {
        if (event instanceof ActionEvent) {
            if (event.getComponent() == this) {
                if (isImmediate()) {
                    event.setPhaseId(PhaseId.APPLY_REQUEST_VALUES);
                } else if (isBypassUpdates()) {
                    event.setPhaseId(PhaseId.PROCESS_VALIDATIONS);
                } else {
                    event.setPhaseId(PhaseId.INVOKE_APPLICATION);
                }
            }

            // UICommand set Phase ID for all ActionEvents - bypass it.
            getParent().queueEvent(event);
        } else {
            super.queueEvent(event);
        }
    }
}
