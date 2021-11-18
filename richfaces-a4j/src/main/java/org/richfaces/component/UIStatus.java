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
import org.richfaces.component.AbstractAjaxStatus;

/**
 *  <p>
 The &lt;a4j:status&gt; component displays the status of current Ajax requests. The status can be either in progress,
 complete, or an error is shown after a failed request.
 </p>
 @author Nick Belaevski

 **/
@Generated({"RichFaces CDK", "4.5.0-SNAPSHOT"})
public class UIStatus extends AbstractAjaxStatus
    implements ClientBehaviorHolder    {

    public static final String COMPONENT_TYPE="org.richfaces.Status";

    public static final String COMPONENT_FAMILY="org.richfaces.Status";

    @Override
    public String getFamily() {
        return COMPONENT_FAMILY;
    }

    public UIStatus() {
        super();
        setRendererType("org.richfaces.StatusRenderer");
    }

    private static final Collection<String> EVENT_NAMES = Collections.unmodifiableCollection(Arrays.asList(
        "stop",
        "start",
        "error",
        "success"
        ));
    
    public Collection<String> getEventNames() {
        return EVENT_NAMES;
    }


    public String getDefaultEventName() {
        return null;
    }


    protected enum Properties {
        errorStyle,
        errorStyleClass,
        errorText,
        name,
        onerror,
        onstart,
        onstop,
        onsuccess,
        startStyle,
        startStyleClass,
        startText,
        stopStyle,
        stopStyleClass,
        stopText
        
    }

 
    public String getErrorStyle() {
        String value = (String) getStateHelper().eval(Properties.errorStyle);
        return value;
    }
    
    public void setErrorStyle(String errorStyle) {
        getStateHelper().put(Properties.errorStyle, errorStyle);
    }

 
    public String getErrorStyleClass() {
        String value = (String) getStateHelper().eval(Properties.errorStyleClass);
        return value;
    }
    
    public void setErrorStyleClass(String errorStyleClass) {
        getStateHelper().put(Properties.errorStyleClass, errorStyleClass);
    }

 
    public String getErrorText() {
        String value = (String) getStateHelper().eval(Properties.errorText);
        return value;
    }
    
    public void setErrorText(String errorText) {
        getStateHelper().put(Properties.errorText, errorText);
    }

 
    public String getName() {
        String value = (String) getStateHelper().eval(Properties.name);
        return value;
    }
    
    public void setName(String name) {
        getStateHelper().put(Properties.name, name);
    }

 
    public String getOnerror() {
        String value = (String) getStateHelper().eval(Properties.onerror);
        return value;
    }
    
    public void setOnerror(String onerror) {
        getStateHelper().put(Properties.onerror, onerror);
    }

 
    public String getOnstart() {
        String value = (String) getStateHelper().eval(Properties.onstart);
        return value;
    }
    
    public void setOnstart(String onstart) {
        getStateHelper().put(Properties.onstart, onstart);
    }

 
    public String getOnstop() {
        String value = (String) getStateHelper().eval(Properties.onstop);
        return value;
    }
    
    public void setOnstop(String onstop) {
        getStateHelper().put(Properties.onstop, onstop);
    }

 
    public String getOnsuccess() {
        String value = (String) getStateHelper().eval(Properties.onsuccess);
        return value;
    }
    
    public void setOnsuccess(String onsuccess) {
        getStateHelper().put(Properties.onsuccess, onsuccess);
    }

 
    public String getStartStyle() {
        String value = (String) getStateHelper().eval(Properties.startStyle);
        return value;
    }
    
    public void setStartStyle(String startStyle) {
        getStateHelper().put(Properties.startStyle, startStyle);
    }

 
    public String getStartStyleClass() {
        String value = (String) getStateHelper().eval(Properties.startStyleClass);
        return value;
    }
    
    public void setStartStyleClass(String startStyleClass) {
        getStateHelper().put(Properties.startStyleClass, startStyleClass);
    }

 
    public String getStartText() {
        String value = (String) getStateHelper().eval(Properties.startText);
        return value;
    }
    
    public void setStartText(String startText) {
        getStateHelper().put(Properties.startText, startText);
    }

 
    public String getStopStyle() {
        String value = (String) getStateHelper().eval(Properties.stopStyle);
        return value;
    }
    
    public void setStopStyle(String stopStyle) {
        getStateHelper().put(Properties.stopStyle, stopStyle);
    }

 
    public String getStopStyleClass() {
        String value = (String) getStateHelper().eval(Properties.stopStyleClass);
        return value;
    }
    
    public void setStopStyleClass(String stopStyleClass) {
        getStateHelper().put(Properties.stopStyleClass, stopStyleClass);
    }

 
    public String getStopText() {
        String value = (String) getStateHelper().eval(Properties.stopText);
        return value;
    }
    
    public void setStopText(String stopText) {
        getStateHelper().put(Properties.stopText, stopText);
    }

    

}