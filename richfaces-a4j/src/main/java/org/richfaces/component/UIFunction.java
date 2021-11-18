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
import org.richfaces.component.AbstractAjaxFunction;
import org.richfaces.component.attribute.AjaxProps;
import org.richfaces.component.attribute.BypassProps;

/**
 *  <p>
 The &lt;a4j:jsFunction&gt; component performs Ajax requests directly from JavaScript code and retrieves server-side data.
 The server-side data is returned in JavaScript Object Notation (JSON) format prior to the execution of any JavaScript
 code defined using the "oncomplete" attribute.
 </p>
 @author asmirnov@exadel.com

 **/
@Generated({"RichFaces CDK", "4.5.0-SNAPSHOT"})
public class UIFunction extends AbstractAjaxFunction
    implements ClientBehaviorHolder,AjaxProps,BypassProps    {

    public static final String COMPONENT_TYPE="org.richfaces.Function";

    public static final String COMPONENT_FAMILY="javax.faces.Command";

    @Override
    public String getFamily() {
        return COMPONENT_FAMILY;
    }

    public UIFunction() {
        super();
        setRendererType("org.richfaces.FunctionRenderer");
    }

    private static final Collection<String> EVENT_NAMES = Collections.unmodifiableCollection(Arrays.asList(
        "beforedomupdate",
        "complete",
        "begin"
        ));
    
    public Collection<String> getEventNames() {
        return EVENT_NAMES;
    }


    public String getDefaultEventName() {
        return null;
    }


    protected enum Properties {
        bypassUpdates,
        data,
        limitRender,
        name,
        onbeforedomupdate,
        onbegin,
        oncomplete,
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

 
    public boolean isLimitRender() {
        Boolean value = (Boolean) getStateHelper().eval(Properties.limitRender, false);
        return value;
    }
    
    public void setLimitRender(boolean limitRender) {
        getStateHelper().put(Properties.limitRender, limitRender);
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