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
import org.richfaces.component.AbstractCommandButton;
import org.richfaces.component.MetaComponentResolver;
import org.richfaces.component.attribute.AccesskeyProps;
import org.richfaces.component.attribute.AjaxProps;
import org.richfaces.component.attribute.BypassProps;
import org.richfaces.component.attribute.CommandButtonProps;
import org.richfaces.component.attribute.CoreProps;

/**
 *  <p>
 The &lt;a4j:commandButton&gt; component is similar to the JavaServer Faces (JSF) &lt;h:commandButton&gt; component,
 but additionally includes Ajax support.
 </p>
 @author Nick Belaevski

 **/
@Generated({"RichFaces CDK", "4.5.0-SNAPSHOT"})
public class UICommandButton extends AbstractCommandButton
    implements ClientBehaviorHolder,MetaComponentResolver,AccesskeyProps,AjaxProps,BypassProps,CommandButtonProps,CoreProps    {

    public static final String COMPONENT_TYPE="org.richfaces.CommandButton";

    public static final String COMPONENT_FAMILY="javax.faces.Command";

    @Override
    public String getFamily() {
        return COMPONENT_FAMILY;
    }

    public UICommandButton() {
        super();
        setRendererType("org.richfaces.CommandButtonRenderer");
    }

    private static final Collection<String> EVENT_NAMES = Collections.unmodifiableCollection(Arrays.asList(
        "keypress",
        "beforedomupdate",
        "mousedown",
        "keyup",
        "dblclick",
        "complete",
        "click",
        "mouseover",
        "begin",
        "mousemove",
        "mouseout",
        "keydown",
        "action",
        "mouseup"
        ));
    
    public Collection<String> getEventNames() {
        return EVENT_NAMES;
    }


    public String getDefaultEventName() {
        return "click";
    }


    protected enum Properties {
        accesskey,
        bypassUpdates,
        data,
        disabled,
        image,
        limitRender,
        onbeforedomupdate,
        onbegin,
        onclick,
        oncomplete,
        ondblclick,
        onkeydown,
        onkeypress,
        onkeyup,
        onmousedown,
        onmousemove,
        onmouseout,
        onmouseover,
        onmouseup,
        resetValues,
        status,
        style,
        styleClass,
        tabindex,
        title,
        type
        
    }

 
    public String getAccesskey() {
        String value = (String) getStateHelper().eval(Properties.accesskey);
        return value;
    }
    
    public void setAccesskey(String accesskey) {
        getStateHelper().put(Properties.accesskey, accesskey);
        handleAttribute("accesskey",accesskey);
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

 
    public boolean isDisabled() {
        Boolean value = (Boolean) getStateHelper().eval(Properties.disabled, false);
        return value;
    }
    
    public void setDisabled(boolean disabled) {
        getStateHelper().put(Properties.disabled, disabled);
    }

 
    public String getImage() {
        String value = (String) getStateHelper().eval(Properties.image);
        return value;
    }
    
    public void setImage(String image) {
        getStateHelper().put(Properties.image, image);
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

 
    public String getOnclick() {
        String value = (String) getStateHelper().eval(Properties.onclick);
        return value;
    }
    
    public void setOnclick(String onclick) {
        getStateHelper().put(Properties.onclick, onclick);
    }

 
    public String getOncomplete() {
        String value = (String) getStateHelper().eval(Properties.oncomplete);
        return value;
    }
    
    public void setOncomplete(String oncomplete) {
        getStateHelper().put(Properties.oncomplete, oncomplete);
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

 
    public String getTabindex() {
        String value = (String) getStateHelper().eval(Properties.tabindex);
        return value;
    }
    
    public void setTabindex(String tabindex) {
        getStateHelper().put(Properties.tabindex, tabindex);
    }

 
    public String getTitle() {
        String value = (String) getStateHelper().eval(Properties.title);
        return value;
    }
    
    public void setTitle(String title) {
        getStateHelper().put(Properties.title, title);
        handleAttribute("title",title);
    }

 
    public String getType() {
        String value = (String) getStateHelper().eval(Properties.type, "submit");
        return value;
    }
    
    public void setType(String type) {
        getStateHelper().put(Properties.type, type);
    }
    private static final String ATTRIBUTES_THAT_ARE_SET_KEY = "javax.faces.component.UIComponentBase.attributesThatAreSet";
    
    private void handleAttribute(String name, Object value) {
        List<String> setAttributes = (List<String>) this.getAttributes().get(ATTRIBUTES_THAT_ARE_SET_KEY);
        if (setAttributes == null) {
                setAttributes = new ArrayList<String>(12);
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