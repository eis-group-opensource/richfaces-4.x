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
import org.richfaces.component.AbstractPush;

/**
 *  <p>
 The &lt;a4j:push&gt; component performs real-time updates on the client side from events triggered at the server side. The
 events are pushed out to the client through the RichFaces messaging queue (which is bound to Java Messaging Service - JMS).
 When the &lt;a4j:push&gt; component is triggered by a server event, it can in turn cause Ajax updates and changes.
 </p>

 @author Nick Belaevski
 @author Lukas Fryc

 **/
@Generated({"RichFaces CDK", "4.5.0-SNAPSHOT"})
public class UIPush extends AbstractPush
    implements ClientBehaviorHolder    {

    public static final String COMPONENT_TYPE="org.richfaces.Push";

    public static final String COMPONENT_FAMILY="org.richfaces.Push";

    @Override
    public String getFamily() {
        return COMPONENT_FAMILY;
    }

    public UIPush() {
        super();
        setRendererType("org.richfaces.PushRenderer");
    }

    private static final Collection<String> EVENT_NAMES = Collections.unmodifiableCollection(Arrays.asList(
        "error",
        "dataavailable",
        "subscribed"
        ));
    
    public Collection<String> getEventNames() {
        return EVENT_NAMES;
    }


    public String getDefaultEventName() {
        return null;
    }


    protected enum Properties {
        address,
        ondataavailable,
        onerror,
        onsubscribed
        
    }

 
    public String getAddress() {
        String value = (String) getStateHelper().eval(Properties.address);
        return value;
    }
    
    public void setAddress(String address) {
        getStateHelper().put(Properties.address, address);
    }

 
    public String getOndataavailable() {
        String value = (String) getStateHelper().eval(Properties.ondataavailable);
        return value;
    }
    
    public void setOndataavailable(String ondataavailable) {
        getStateHelper().put(Properties.ondataavailable, ondataavailable);
    }

 
    public String getOnerror() {
        String value = (String) getStateHelper().eval(Properties.onerror);
        return value;
    }
    
    public void setOnerror(String onerror) {
        getStateHelper().put(Properties.onerror, onerror);
    }

 
    public String getOnsubscribed() {
        String value = (String) getStateHelper().eval(Properties.onsubscribed);
        return value;
    }
    
    public void setOnsubscribed(String onsubscribed) {
        getStateHelper().put(Properties.onsubscribed, onsubscribed);
    }

    

}