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
import org.richfaces.component.AbstractRegion;
import org.richfaces.component.AjaxContainer;
import org.richfaces.component.MetaComponentResolver;

/**
 *  <p>
 The &lt;a4j:region&gt; component specifies a part of the JSF component tree to be processed on the server.
 The region causes all the a4j and rich Ajax controls to execute: decoding, validating, and updating the model.
 The region causes these components to execute even if not explicitly declared. As such, processing areas can more
 easily be marked using a declarative approach.
 </p>
 <p>
 Regions can be nested, in which case only the parent region of the component initiating the request will be processed.
 </p>
 @author Nick Belaevski

 **/
@Generated({"RichFaces CDK", "4.5.0-SNAPSHOT"})
public class UIRegion extends AbstractRegion
    implements AjaxContainer,MetaComponentResolver    {

    public static final String COMPONENT_TYPE="org.richfaces.Region";

    public static final String COMPONENT_FAMILY="org.richfaces.AjaxContainer";

    @Override
    public String getFamily() {
        return COMPONENT_FAMILY;
    }






    protected enum Properties {
        
        
    }

    

}