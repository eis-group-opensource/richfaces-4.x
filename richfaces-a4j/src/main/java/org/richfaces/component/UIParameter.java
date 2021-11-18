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
import org.richfaces.component.AbstractParameter;
import javax.faces.event.ActionListener;
import org.ajax4jsf.component.JavaScriptParameter;

/**
 *  <p>
 The &lt;a4j:param&gt; behavior combines the functionality of the JavaServer Faces (JSF) components
 &lt;f:param&gt; and &lt;f:actionListener&gt;.
 </p>
 @author shura, alexsmirnov

 **/
@Generated({"RichFaces CDK", "4.5.0-SNAPSHOT"})
public class UIParameter extends AbstractParameter
    implements ActionListener,JavaScriptParameter    {

    public static final String COMPONENT_TYPE="org.richfaces.Parameter";

    public static final String COMPONENT_FAMILY="javax.faces.Parameter";

    @Override
    public String getFamily() {
        return COMPONENT_FAMILY;
    }






    protected enum Properties {
        assignTo,
        noEscape
        
    }

 
    public Object getAssignTo() {
        Object value = (Object) getStateHelper().eval(Properties.assignTo);
        return value;
    }
    
    public void setAssignTo(Object assignTo) {
        getStateHelper().put(Properties.assignTo, assignTo);
    }

 
    public boolean isNoEscape() {
        Boolean value = (Boolean) getStateHelper().eval(Properties.noEscape, false);
        return value;
    }
    
    public void setNoEscape(boolean noEscape) {
        getStateHelper().put(Properties.noEscape, noEscape);
    }

    

}