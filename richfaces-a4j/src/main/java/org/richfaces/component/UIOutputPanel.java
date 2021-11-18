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
import org.richfaces.component.AbstractOutputPanel;
import org.ajax4jsf.component.AjaxOutput;
import org.richfaces.component.attribute.AjaxOutputProps;
import org.richfaces.component.attribute.CoreProps;
import org.richfaces.component.attribute.EventsKeyProps;
import org.richfaces.component.attribute.EventsMouseProps;
import org.richfaces.component.attribute.I18nProps;

/**
 *  <p>
 The &lt;a4j:outputPanel&gt; component is used to group together components in to update them as a whole, rather than having
 to specify the components individually.
 <p>

 @author asmirnov@exadel.com

 **/
@Generated({"RichFaces CDK", "4.5.0-SNAPSHOT"})
public class UIOutputPanel extends AbstractOutputPanel
    implements ClientBehaviorHolder,AjaxOutput,AjaxOutputProps,CoreProps,EventsKeyProps,EventsMouseProps,I18nProps    {

    public static final String COMPONENT_TYPE="org.richfaces.OutputPanel";

    public static final String COMPONENT_FAMILY="javax.faces.Panel";

    @Override
    public String getFamily() {
        return COMPONENT_FAMILY;
    }

    public UIOutputPanel() {
        super();
        setRendererType("org.richfaces.OutputPanelRenderer");
    }

    private static final Collection<String> EVENT_NAMES = Collections.unmodifiableCollection(Arrays.asList(
        "keypress",
        "mousedown",
        "keyup",
        "dblclick",
        "click",
        "mouseover",
        "mousemove",
        "mouseout",
        "keydown",
        "mouseup"
        ));
    
    public Collection<String> getEventNames() {
        return EVENT_NAMES;
    }


    public String getDefaultEventName() {
        return null;
    }


    protected enum Properties {
        ajaxRendered,
        dir,
        keepTransient,
        lang,
        layout,
        onclick,
        ondblclick,
        onkeydown,
        onkeypress,
        onkeyup,
        onmousedown,
        onmousemove,
        onmouseout,
        onmouseover,
        onmouseup,
        style,
        styleClass,
        title
        
    }

 
    public boolean isAjaxRendered() {
        Boolean value = (Boolean) getStateHelper().eval(Properties.ajaxRendered, false);
        return value;
    }
    
    public void setAjaxRendered(boolean ajaxRendered) {
        getStateHelper().put(Properties.ajaxRendered, ajaxRendered);
    }

 
    public String getDir() {
        String value = (String) getStateHelper().eval(Properties.dir);
        return value;
    }
    
    public void setDir(String dir) {
        getStateHelper().put(Properties.dir, dir);
        handleAttribute("dir",dir);
    }

 
    public boolean isKeepTransient() {
        Boolean value = (Boolean) getStateHelper().eval(Properties.keepTransient, true);
        return value;
    }
    
    public void setKeepTransient(boolean keepTransient) {
        getStateHelper().put(Properties.keepTransient, keepTransient);
    }

 
    public String getLang() {
        String value = (String) getStateHelper().eval(Properties.lang);
        return value;
    }
    
    public void setLang(String lang) {
        getStateHelper().put(Properties.lang, lang);
        handleAttribute("lang",lang);
    }

 
    public OutputPanelLayout getLayout() {
        OutputPanelLayout value = (OutputPanelLayout) getStateHelper().eval(Properties.layout);
        return value;
    }
    
    public void setLayout(OutputPanelLayout layout) {
        getStateHelper().put(Properties.layout, layout);
    }

 
    public String getOnclick() {
        String value = (String) getStateHelper().eval(Properties.onclick);
        return value;
    }
    
    public void setOnclick(String onclick) {
        getStateHelper().put(Properties.onclick, onclick);
        handleAttribute("onclick",onclick);
    }

 
    public String getOndblclick() {
        String value = (String) getStateHelper().eval(Properties.ondblclick);
        return value;
    }
    
    public void setOndblclick(String ondblclick) {
        getStateHelper().put(Properties.ondblclick, ondblclick);
        handleAttribute("ondblclick",ondblclick);
    }

 
    public String getOnkeydown() {
        String value = (String) getStateHelper().eval(Properties.onkeydown);
        return value;
    }
    
    public void setOnkeydown(String onkeydown) {
        getStateHelper().put(Properties.onkeydown, onkeydown);
        handleAttribute("onkeydown",onkeydown);
    }

 
    public String getOnkeypress() {
        String value = (String) getStateHelper().eval(Properties.onkeypress);
        return value;
    }
    
    public void setOnkeypress(String onkeypress) {
        getStateHelper().put(Properties.onkeypress, onkeypress);
        handleAttribute("onkeypress",onkeypress);
    }

 
    public String getOnkeyup() {
        String value = (String) getStateHelper().eval(Properties.onkeyup);
        return value;
    }
    
    public void setOnkeyup(String onkeyup) {
        getStateHelper().put(Properties.onkeyup, onkeyup);
        handleAttribute("onkeyup",onkeyup);
    }

 
    public String getOnmousedown() {
        String value = (String) getStateHelper().eval(Properties.onmousedown);
        return value;
    }
    
    public void setOnmousedown(String onmousedown) {
        getStateHelper().put(Properties.onmousedown, onmousedown);
        handleAttribute("onmousedown",onmousedown);
    }

 
    public String getOnmousemove() {
        String value = (String) getStateHelper().eval(Properties.onmousemove);
        return value;
    }
    
    public void setOnmousemove(String onmousemove) {
        getStateHelper().put(Properties.onmousemove, onmousemove);
        handleAttribute("onmousemove",onmousemove);
    }

 
    public String getOnmouseout() {
        String value = (String) getStateHelper().eval(Properties.onmouseout);
        return value;
    }
    
    public void setOnmouseout(String onmouseout) {
        getStateHelper().put(Properties.onmouseout, onmouseout);
        handleAttribute("onmouseout",onmouseout);
    }

 
    public String getOnmouseover() {
        String value = (String) getStateHelper().eval(Properties.onmouseover);
        return value;
    }
    
    public void setOnmouseover(String onmouseover) {
        getStateHelper().put(Properties.onmouseover, onmouseover);
        handleAttribute("onmouseover",onmouseover);
    }

 
    public String getOnmouseup() {
        String value = (String) getStateHelper().eval(Properties.onmouseup);
        return value;
    }
    
    public void setOnmouseup(String onmouseup) {
        getStateHelper().put(Properties.onmouseup, onmouseup);
        handleAttribute("onmouseup",onmouseup);
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
    }

 
    public String getTitle() {
        String value = (String) getStateHelper().eval(Properties.title);
        return value;
    }
    
    public void setTitle(String title) {
        getStateHelper().put(Properties.title, title);
        handleAttribute("title",title);
    }
    private static final String ATTRIBUTES_THAT_ARE_SET_KEY = "javax.faces.component.UIComponentBase.attributesThatAreSet";
    
    private void handleAttribute(String name, Object value) {
        List<String> setAttributes = (List<String>) this.getAttributes().get(ATTRIBUTES_THAT_ARE_SET_KEY);
        if (setAttributes == null) {
                setAttributes = new ArrayList<String>(14);
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