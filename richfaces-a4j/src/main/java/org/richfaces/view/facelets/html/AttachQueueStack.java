/* Copyright © 2016 EIS Group and/or one of its affiliates. All rights reserved. Unpublished work under U.S. copyright laws.
 CONFIDENTIAL AND TRADE SECRET INFORMATION. No portion of this work may be copied, distributed, modified, or incorporated into any other media without EIS Group prior written consent.*/
package org.richfaces.view.facelets.html;

import java.util.LinkedList;
import java.util.Map;

import javax.faces.context.FacesContext;

/**
 * @author Nick Belaevski
 *
 */
final class AttachQueueStack {
    private static final String STACK_ATTRIBUTE_NAME = "org.richfaces.AttachQueueStack";
    private LinkedList<AttachQueueInfo> stack = null;

    public AttachQueueStack() {
        stack = new LinkedList<AttachQueueInfo>();
    }

    public static AttachQueueStack getStack(FacesContext context, boolean createIfNull) {
        Map<Object, Object> attributes = context.getAttributes();
        AttachQueueStack attachQueueStack = (AttachQueueStack) attributes.get(STACK_ATTRIBUTE_NAME);

        if (attachQueueStack == null && createIfNull) {
            attachQueueStack = new AttachQueueStack();
            attributes.put(STACK_ATTRIBUTE_NAME, attachQueueStack);
        }

        return attachQueueStack;
    }

    public void push(AttachQueueInfo info) {
        stack.addFirst(info);
    }

    public AttachQueueInfo pop() {
        return stack.removeFirst();
    }

    public AttachQueueInfo peek() {
        if (!stack.isEmpty()) {
            return stack.getFirst();
        } else {
            return null;
        }
    }
}
