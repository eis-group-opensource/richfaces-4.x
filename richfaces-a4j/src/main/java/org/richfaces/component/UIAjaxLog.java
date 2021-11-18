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
import org.richfaces.component.AbstractAjaxLog;
import org.richfaces.component.attribute.StyleClassProps;
import org.richfaces.component.attribute.StyleProps;

/**
 *  <p>
 The &lt;a4j:log&gt; component generates JavaScript that opens a debug window, logging application information such as
 requests, responses, and DOM changes.
 </p>
 @author Nick Belaevski

 **/
@Generated({"RichFaces CDK", "4.5.0-SNAPSHOT"})
public class UIAjaxLog extends AbstractAjaxLog
    implements StyleClassProps,StyleProps    {

    public static final String COMPONENT_TYPE="org.richfaces.AjaxLog";

    public static final String COMPONENT_FAMILY="org.richfaces.AjaxLog";

    @Override
    public String getFamily() {
        return COMPONENT_FAMILY;
    }

    public UIAjaxLog() {
        super();
        setRendererType("org.richfaces.AjaxLogRenderer");
    }




    protected enum Properties {
        level,
        mode,
        style,
        styleClass
        
    }

 
    public String getLevel() {
        String value = (String) getStateHelper().eval(Properties.level);
        return value;
    }
    
    public void setLevel(String level) {
        getStateHelper().put(Properties.level, level);
    }

 
    public LogMode getMode() {
        LogMode value = (LogMode) getStateHelper().eval(Properties.mode);
        return value;
    }
    
    public void setMode(LogMode mode) {
        getStateHelper().put(Properties.mode, mode);
    }

 
    public String getStyle() {
        String value = (String) getStateHelper().eval(Properties.style);
        return value;
    }
    
    public void setStyle(String style) {
        getStateHelper().put(Properties.style, style);
        handleAttribute("style",style);
    }

 
    public String getStyleClass() {
        String value = (String) getStateHelper().eval(Properties.styleClass);
        return value;
    }
    
    public void setStyleClass(String styleClass) {
        getStateHelper().put(Properties.styleClass, styleClass);
        handleAttribute("styleClass",styleClass);
    }
    private static final String ATTRIBUTES_THAT_ARE_SET_KEY = "javax.faces.component.UIComponentBase.attributesThatAreSet";
    
    private void handleAttribute(String name, Object value) {
        List<String> setAttributes = (List<String>) this.getAttributes().get(ATTRIBUTES_THAT_ARE_SET_KEY);
        if (setAttributes == null) {
                setAttributes = new ArrayList<String>(2);
                this.getAttributes().put(ATTRIBUTES_THAT_ARE_SET_KEY, setAttributes);
        }
        if (value == null) {
                ValueExpression ve = getValueExpression(name);
                if (ve == null) {
                    setAttributes.remove(name);
                }
            } else if (!setAttributes.contains(name)) {
                setAttributes.add(name);
        }
    }    

    

}