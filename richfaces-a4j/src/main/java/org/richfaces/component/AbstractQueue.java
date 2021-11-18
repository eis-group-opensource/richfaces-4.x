/* Copyright © 2016 EIS Group and/or one of its affiliates. All rights reserved. Unpublished work under U.S. copyright laws.
 CONFIDENTIAL AND TRADE SECRET INFORMATION. No portion of this work may be copied, distributed, modified, or incorporated into any other media without EIS Group prior written consent.*/
package org.richfaces.component;

import javax.faces.component.UIComponentBase;

import org.richfaces.cdk.annotations.Attribute;
import org.richfaces.cdk.annotations.JsfComponent;
import org.richfaces.cdk.annotations.JsfRenderer;
import org.richfaces.cdk.annotations.Tag;
import org.richfaces.cdk.annotations.TagType;

/**
 * <p>
 * The &lt;a4j:queue&gt; component manages the JSF queue of Ajax requests. It provides additional options for a finer
 * control of request processing.
 * </p>
 * @author Nick Belaevski
 */
@JsfComponent(tag = @Tag(name = "queue", generate = false, type = TagType.Facelets), renderer = @JsfRenderer(type = "org.richfaces.QueueRenderer"))
public abstract class AbstractQueue extends UIComponentBase {
    public static final String GLOBAL_QUEUE_NAME = "org.richfaces.queue.global";
    public static final String COMPONENT_TYPE = "org.richfaces.Queue";
    public static final String COMPONENT_FAMILY = "org.richfaces.Queue";

    /**
     * Attribute defines the time (in ms) the request will be waiting in the queue before it is ready to be sent.
     */
    @Attribute
    public abstract int getRequestDelay();

    /**
     * The client-side script method to be called before an ajax request is submitted
     */
    @Attribute
    public abstract String getOnsubmit();

    /**
     * The client-side script method to be called after the request is completed
     */
    @Attribute
    public abstract String getOncomplete();

    /**
     * The client-side script method to be called before DOM is updated
     */
    @Attribute
    public abstract String getOnbeforedomupdate();

    /**
     * The client-side script method to be called when an error has occurred during Ajax communications
     */
    @Attribute
    public abstract String getOnerror();

    /**
     * The client-side script method to be called when the request is added to the queue
     */
    @Attribute
    public abstract String getOnrequestqueue();

    /**
     * The client-side script method to be called after the request is removed from the queue
     */
    @Attribute
    public abstract String getOnrequestdequeue();

    /**
     * Attribute allows you to ignore an Ajax response produced by a request if the newest 'similar' request is in the
     * queue already. ignoreDupResponses="true" does not cancel the request while it is processed on the server, but
     * just allows avoiding unnecessary updates on the client side if the response isn't actual now
     */
    @Attribute
    public abstract boolean isIgnoreDupResponses();

    /**
     * Specifies the name for the queue, allowing it to be referenced via the name attribute of the attachQueue component
     */
    @Attribute
    public abstract String getName();
}
