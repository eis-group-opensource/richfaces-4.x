/* Copyright © 2016 EIS Group and/or one of its affiliates. All rights reserved. Unpublished work under U.S. copyright laws.
 CONFIDENTIAL AND TRADE SECRET INFORMATION. No portion of this work may be copied, distributed, modified, or incorporated into any other media without EIS Group prior written consent.*/
package org.richfaces.event;

import javax.faces.component.UIComponent;
import javax.faces.component.behavior.Behavior;
import javax.faces.event.BehaviorEvent;
import javax.faces.event.FacesListener;
import javax.faces.event.PhaseId;

/**
 * @author Nick Belaevski
 *
 */
public class BypassUpdatesAjaxBehaviorEvent extends BehaviorEvent {
    private static final long serialVersionUID = 154803120133655033L;

    public BypassUpdatesAjaxBehaviorEvent(UIComponent component, Behavior behavior) {
        super(component, behavior);

        setPhaseId(PhaseId.PROCESS_VALIDATIONS);
    }

    @Override
    public boolean isAppropriateListener(FacesListener listener) {
        return false;
    }

    @Override
    public void processListener(FacesListener listener) {
        throw new UnsupportedOperationException();
    }
}
