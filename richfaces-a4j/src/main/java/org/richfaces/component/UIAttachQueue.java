/* Copyright © 2016 EIS Group and/or one of its affiliates. All rights reserved. Unpublished work under U.S. copyright laws.
 CONFIDENTIAL AND TRADE SECRET INFORMATION. No portion of this work may be copied, distributed, modified, or incorporated into any other media without EIS Group prior written consent.*/
package org.richfaces.component;

import javax.annotation.Generated;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import javax.faces.context.FacesContext;
import javax.faces.component.UIComponent;
import javax.faces.component.behavior.ClientBehaviorHolder;
import javax.el.MethodExpression;
import javax.el.ValueExpression;
import javax.faces.component.StateHelper;
import org.richfaces.component.AbstractAttachQueue;
import javax.faces.event.ComponentSystemEventListener;

/**
 *  <p>
 The &lt;a4j:attachQueue&gt; behavior is used together with a &lt;a4j:queue&gt; component to further customize queuing for
 particular components and behaviors. The &lt;a4j:attachQueue&gt; behavior can override the scope-wide queue settings for
 an individual component, or attach specific requests to a queue.
 </p>
 @author Nick Belaevski

 **/
@Generated({"RichFaces CDK", "4.5.0-SNAPSHOT"})
public class UIAttachQueue extends AbstractAttachQueue
    implements ComponentSystemEventListener    {

    public static final String COMPONENT_TYPE="org.richfaces.AttachQueue";

    public static final String COMPONENT_FAMILY="org.richfaces.AttachQueue";

    @Override
    public String getFamily() {
        return COMPONENT_FAMILY;
    }

    public UIAttachQueue() {
        super();
        setRendererType("org.richfaces.AttachQueueRenderer");
    }




    protected enum Properties {
        ignoreDupResponses,
        name,
        onrequestdequeue,
        onrequestqueue,
        requestDelay,
        requestGroupingId
        
    }

 
    public boolean isIgnoreDupResponses() {
        Boolean value = (Boolean) getStateHelper().eval(Properties.ignoreDupResponses, false);
        return value;
    }
    
    public void setIgnoreDupResponses(boolean ignoreDupResponses) {
        getStateHelper().put(Properties.ignoreDupResponses, ignoreDupResponses);
    }

 
    public String getName() {
        String value = (String) getStateHelper().eval(Properties.name);
        return value;
    }
    
    public void setName(String name) {
        getStateHelper().put(Properties.name, name);
    }

 
    public String getOnrequestdequeue() {
        String value = (String) getStateHelper().eval(Properties.onrequestdequeue);
        return value;
    }
    
    public void setOnrequestdequeue(String onrequestdequeue) {
        getStateHelper().put(Properties.onrequestdequeue, onrequestdequeue);
    }

 
    public String getOnrequestqueue() {
        String value = (String) getStateHelper().eval(Properties.onrequestqueue);
        return value;
    }
    
    public void setOnrequestqueue(String onrequestqueue) {
        getStateHelper().put(Properties.onrequestqueue, onrequestqueue);
    }

 
    public int getRequestDelay() {
        Integer value = (Integer) getStateHelper().eval(Properties.requestDelay, Integer.MIN_VALUE);
        return value;
    }
    
    public void setRequestDelay(int requestDelay) {
        getStateHelper().put(Properties.requestDelay, requestDelay);
    }

 
    public String getRequestGroupingId() {
        String value = (String) getStateHelper().eval(Properties.requestGroupingId);
        return value;
    }
    
    public void setRequestGroupingId(String requestGroupingId) {
        getStateHelper().put(Properties.requestGroupingId, requestGroupingId);
    }

    

}