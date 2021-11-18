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
import org.richfaces.component.AbstractQueue;

/**
 *  <p>
 The &lt;a4j:queue&gt; component manages the JSF queue of Ajax requests. It provides additional options for a finer
 control of request processing.
 </p>
 @author Nick Belaevski

 **/
@Generated({"RichFaces CDK", "4.5.0-SNAPSHOT"})
public class UIQueue extends AbstractQueue
        {

    public static final String COMPONENT_TYPE="org.richfaces.Queue";

    public static final String COMPONENT_FAMILY="org.richfaces.Queue";

    @Override
    public String getFamily() {
        return COMPONENT_FAMILY;
    }

    public UIQueue() {
        super();
        setRendererType("org.richfaces.QueueRenderer");
    }




    protected enum Properties {
        ignoreDupResponses,
        name,
        onbeforedomupdate,
        oncomplete,
        onerror,
        onrequestdequeue,
        onrequestqueue,
        onsubmit,
        requestDelay
        
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

 
    public String getOnbeforedomupdate() {
        String value = (String) getStateHelper().eval(Properties.onbeforedomupdate);
        return value;
    }
    
    public void setOnbeforedomupdate(String onbeforedomupdate) {
        getStateHelper().put(Properties.onbeforedomupdate, onbeforedomupdate);
    }

 
    public String getOncomplete() {
        String value = (String) getStateHelper().eval(Properties.oncomplete);
        return value;
    }
    
    public void setOncomplete(String oncomplete) {
        getStateHelper().put(Properties.oncomplete, oncomplete);
    }

 
    public String getOnerror() {
        String value = (String) getStateHelper().eval(Properties.onerror);
        return value;
    }
    
    public void setOnerror(String onerror) {
        getStateHelper().put(Properties.onerror, onerror);
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

 
    public String getOnsubmit() {
        String value = (String) getStateHelper().eval(Properties.onsubmit);
        return value;
    }
    
    public void setOnsubmit(String onsubmit) {
        getStateHelper().put(Properties.onsubmit, onsubmit);
    }

 
    public int getRequestDelay() {
        Integer value = (Integer) getStateHelper().eval(Properties.requestDelay, Integer.MIN_VALUE);
        return value;
    }
    
    public void setRequestDelay(int requestDelay) {
        getStateHelper().put(Properties.requestDelay, requestDelay);
    }

    

}