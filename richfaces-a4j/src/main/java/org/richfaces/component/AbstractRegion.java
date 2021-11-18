/* Copyright © 2016 EIS Group and/or one of its affiliates. All rights reserved. Unpublished work under U.S. copyright laws.
 CONFIDENTIAL AND TRADE SECRET INFORMATION. No portion of this work may be copied, distributed, modified, or incorporated into any other media without EIS Group prior written consent.*/
package org.richfaces.component;

import javax.faces.component.UIComponent;
import javax.faces.component.UIComponentBase;
import javax.faces.context.FacesContext;

import org.richfaces.cdk.annotations.JsfComponent;
import org.richfaces.cdk.annotations.Tag;
import org.richfaces.cdk.annotations.TagType;

/**
 * <p>
 * The &lt;a4j:region&gt; component specifies a part of the JSF component tree to be processed on the server.
 * The region causes all the a4j and rich Ajax controls to execute: decoding, validating, and updating the model.
 * The region causes these components to execute even if not explicitly declared. As such, processing areas can more
 * easily be marked using a declarative approach.
 * </p>
 * <p>
 * Regions can be nested, in which case only the parent region of the component initiating the request will be processed.
 * </p>
 * @author Nick Belaevski
 */
@JsfComponent(tag = @Tag(name = "region", type = TagType.Facelets))
public abstract class AbstractRegion extends UIComponentBase implements MetaComponentResolver, AjaxContainer {
    public static final String COMPONENT_TYPE = "org.richfaces.Region";
    public static final String COMPONENT_FAMILY = "org.richfaces.AjaxContainer";

    public String resolveClientId(FacesContext facesContext, UIComponent contextComponent, String metaId) {

        if (META_COMPONENT_ID.equals(metaId)) {
            return getClientId(facesContext);
        }

        return null;
    }

    public String substituteUnresolvedClientId(FacesContext facesContext, UIComponent contextComponent, String metaComponentId) {

        return null;
    }
}
