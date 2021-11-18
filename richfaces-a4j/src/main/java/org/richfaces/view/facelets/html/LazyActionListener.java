/* Copyright © 2016 EIS Group and/or one of its affiliates. All rights reserved. Unpublished work under U.S. copyright laws.
 CONFIDENTIAL AND TRADE SECRET INFORMATION. No portion of this work may be copied, distributed, modified, or incorporated into any other media without EIS Group prior written consent.*/
package org.richfaces.view.facelets.html;

import java.io.Serializable;

import javax.el.ValueExpression;
import javax.faces.context.FacesContext;
import javax.faces.event.AbortProcessingException;
import javax.faces.event.ActionEvent;
import javax.faces.event.ActionListener;

import org.richfaces.cdk.annotations.Event;
import org.richfaces.cdk.annotations.Tag;
import org.richfaces.cdk.annotations.TagType;
import org.richfaces.view.facelets.TagHandlerUtils;

/**
 * @author Nick Belaevski
 *
 */
@Event(listener = ActionListener.class, source = "org.richfaces.event.DummyActionListenerSource", tag = { @Tag(name = "actionListener", handlerClass = ActionListenerHandler.class, generate = false, type = TagType.Facelets) })
class LazyActionListener implements ActionListener, Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 6303879250524609909L;
    private final String type;
    private final ValueExpression binding;

    public LazyActionListener(String type, ValueExpression binding) {
        this.type = type;
        this.binding = binding;
    }

    public void processAction(ActionEvent event) throws AbortProcessingException {
        ActionListener instance = null;
        FacesContext faces = FacesContext.getCurrentInstance();
        if (faces == null) {
            return;
        }

        if (this.binding != null) {
            instance = (ActionListener) binding.getValue(faces.getELContext());
        }

        if (instance == null && this.type != null) {
            try {
                instance = TagHandlerUtils.loadClass(this.type, ActionListener.class).newInstance();
            } catch (Exception e) {
                throw new AbortProcessingException("Couldn't lazily instantiate ActionListener", e);
            }

            if (this.binding != null) {
                binding.setValue(faces.getELContext(), instance);
            }
        }

        if (instance != null) {
            instance.processAction(event);
        }
    }
}
