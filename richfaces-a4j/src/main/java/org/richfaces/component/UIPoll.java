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
import org.richfaces.component.AbstractPoll;
import org.richfaces.component.attribute.AjaxProps;
import org.richfaces.component.attribute.BypassProps;

/**
 *  <p>
 The &lt;a4j:poll&gt; component allows periodical sending of Ajax requests to the server. It is used for repeatedly
 updating a page at specific time intervals.
 </p>
 @author shura

 **/
@Generated({"RichFaces CDK", "4.5.0-SNAPSHOT"})
public class UIPoll extends AbstractPoll
    implements ClientBehaviorHolder,AjaxProps,BypassProps    {

    public static final String COMPONENT_TYPE="org.richfaces.Poll";

    public static final String COMPONENT_FAMILY="org.richfaces.Poll";

    @Override
    public String getFamily() {
        return COMPONENT_FAMILY;
    }

    public UIPoll() {
        super();
        setRendererType("org.richfaces.PollRenderer");
    }

    private static final Collection<String> EVENT_NAMES = Collections.unmodifiableCollection(Arrays.asList(
        "beforedomupdate",
        "complete",
        "timer",
        "begin"
        ));
    
    public Collection<String> getEventNames() {
        return EVENT_NAMES;
    }


    public String getDefaultEventName() {
        return "timer";
    }


    protected enum Properties {
        bypassUpdates,
        data,
        enabled,
        interval,
        limitRender,
        onbeforedomupdate,
        onbegin,
        oncomplete,
        ontimer,
        resetValues,
        status
        
    }

 
    public boolean isBypassUpdates() {
        Boolean value = (Boolean) getStateHelper().eval(Properties.bypassUpdates, false);
        return value;
    }
    
    public void setBypassUpdates(boolean bypassUpdates) {
        getStateHelper().put(Properties.bypassUpdates, bypassUpdates);
    }

 
    public Object getData() {
        Object value = (Object) getStateHelper().eval(Properties.data);
        return value;
    }
    
    public void setData(Object data) {
        getStateHelper().put(Properties.data, data);
    }

 
    public boolean isEnabled() {
        Boolean value = (Boolean) getStateHelper().eval(Properties.enabled, true);
        return value;
    }
    
    public void setEnabled(boolean enabled) {
        getStateHelper().put(Properties.enabled, enabled);
    }

 
    public int getInterval() {
        Integer value = (Integer) getStateHelper().eval(Properties.interval, Integer.MIN_VALUE);
        return value;
    }
    
    public void setInterval(int interval) {
        getStateHelper().put(Properties.interval, interval);
    }

 
    public boolean isLimitRender() {
        Boolean value = (Boolean) getStateHelper().eval(Properties.limitRender, false);
        return value;
    }
    
    public void setLimitRender(boolean limitRender) {
        getStateHelper().put(Properties.limitRender, limitRender);
    }

 
    public String getOnbeforedomupdate() {
        String value = (String) getStateHelper().eval(Properties.onbeforedomupdate);
        return value;
    }
    
    public void setOnbeforedomupdate(String onbeforedomupdate) {
        getStateHelper().put(Properties.onbeforedomupdate, onbeforedomupdate);
    }

 
    public String getOnbegin() {
        String value = (String) getStateHelper().eval(Properties.onbegin);
        return value;
    }
    
    public void setOnbegin(String onbegin) {
        getStateHelper().put(Properties.onbegin, onbegin);
    }

 
    public String getOncomplete() {
        String value = (String) getStateHelper().eval(Properties.oncomplete);
        return value;
    }
    
    public void setOncomplete(String oncomplete) {
        getStateHelper().put(Properties.oncomplete, oncomplete);
    }

 
    public String getOntimer() {
        String value = (String) getStateHelper().eval(Properties.ontimer);
        return value;
    }
    
    public void setOntimer(String ontimer) {
        getStateHelper().put(Properties.ontimer, ontimer);
    }

 
    public boolean isResetValues() {
        Boolean value = (Boolean) getStateHelper().eval(Properties.resetValues, false);
        return value;
    }
    
    public void setResetValues(boolean resetValues) {
        getStateHelper().put(Properties.resetValues, resetValues);
    }

 
    public String getStatus() {
        String value = (String) getStateHelper().eval(Properties.status);
        return value;
    }
    
    public void setStatus(String status) {
        getStateHelper().put(Properties.status, status);
    }

    

}