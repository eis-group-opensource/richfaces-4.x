/* Copyright © 2016 EIS Group and/or one of its affiliates. All rights reserved. Unpublished work under U.S. copyright laws.
 CONFIDENTIAL AND TRADE SECRET INFORMATION. No portion of this work may be copied, distributed, modified, or incorporated into any other media without EIS Group prior written consent.*/
package org.richfaces.component;

import javax.faces.component.UIComponentBase;

import org.richfaces.cdk.annotations.Attribute;
import org.richfaces.cdk.annotations.EventName;
import org.richfaces.cdk.annotations.JsfComponent;
import org.richfaces.cdk.annotations.JsfRenderer;
import org.richfaces.cdk.annotations.Tag;
import org.richfaces.cdk.annotations.TagType;

/**
 * <p>
 * The &lt;a4j:push&gt; component performs real-time updates on the client side from events triggered at the server side. The
 * events are pushed out to the client through the RichFaces messaging queue (which is bound to Java Messaging Service - JMS).
 * When the &lt;a4j:push&gt; component is triggered by a server event, it can in turn cause Ajax updates and changes.
 * </p>
 *
 * @author Nick Belaevski
 * @author Lukas Fryc
 */
@JsfComponent(type = AbstractPush.COMPONENT_TYPE, family = AbstractPush.COMPONENT_FAMILY, tag = @Tag(name = "push", type = TagType.Facelets), renderer = @JsfRenderer(type = "org.richfaces.PushRenderer"))
public abstract class AbstractPush extends UIComponentBase {
    public static final String COMPONENT_TYPE = "org.richfaces.Push";
    public static final String COMPONENT_FAMILY = "org.richfaces.Push";

    @Override
    public String getFamily() {
        return COMPONENT_FAMILY;
    }

    /**
     * References the topic on the JMS server that contains the pushed messages
     */
    @Attribute(required = true)
    public abstract String getAddress();

    /**
     * The client-side script method to be called when a push notification is received
     */
    @Attribute(events = { @EventName("dataavailable") })
    public abstract String getOndataavailable();

    /**
     * The client-side script method to be called when push is subscribed successfully to the topic.
     */
    @Attribute(events = { @EventName("subscribed") })
    public abstract String getOnsubscribed();

    /**
     * The client-side script method to be called when an error has occurred with the push notifications
     */
    @Attribute(events = { @EventName("error") })
    public abstract String getOnerror();
}
