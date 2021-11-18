/* Copyright © 2016 EIS Group and/or one of its affiliates. All rights reserved. Unpublished work under U.S. copyright laws.
 CONFIDENTIAL AND TRADE SECRET INFORMATION. No portion of this work may be copied, distributed, modified, or incorporated into any other media without EIS Group prior written consent.*/
package org.richfaces.renderkit.html;

import java.io.IOException;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.context.ResponseWriter;
import org.richfaces.renderkit.AjaxCommandRendererBase;
import org.richfaces.renderkit.RenderKitUtils;
import static org.richfaces.renderkit.RenderKitUtils.*;
import org.richfaces.renderkit.RenderKitUtils.Attributes;
import org.richfaces.renderkit.RenderKitUtils.ScriptHashVariableWrapper;


public class CommandLinkRenderer extends AjaxCommandRendererBase {
	
private static final Attributes PASS_THROUGH_ATTRIBUTES0 = attributes()
	     .generic("accesskey","accesskey")
	     

	     .generic("charset","charset")
	     

	     .generic("class","styleClass")
	     

	     .generic("coords","coords")
	     

	     .generic("dir","dir")
	     

	     .generic("hreflang","hreflang")
	     

	     .generic("lang","lang")
	     

	     .generic("onblur","onblur")
	     

	     .generic("ondblclick","ondblclick","dblclick")
	     

	     .generic("onfocus","onfocus")
	     

	     .generic("onkeydown","onkeydown","keydown")
	     

	     .generic("onkeypress","onkeypress","keypress")
	     

	     .generic("onkeyup","onkeyup","keyup")
	     

	     .generic("onmousedown","onmousedown","mousedown")
	     

	     .generic("onmousemove","onmousemove","mousemove")
	     

	     .generic("onmouseout","onmouseout","mouseout")
	     

	     .generic("onmouseover","onmouseover","mouseover")
	     

	     .generic("onmouseup","onmouseup","mouseup")
	     

	     .generic("rel","rel")
	     

	     .generic("rev","rev")
	     

	     .generic("role","role")
	     

	     .generic("shape","shape")
	     

	     .generic("style","style")
	     

	     .generic("tabindex","tabindex")
	     

	     .generic("title","title")
	     

	     .generic("type","type")
	     
;
	
private static final Attributes PASS_THROUGH_ATTRIBUTES1 = attributes()
	     .generic("class","styleClass")
	     

	     .generic("dir","dir")
	     

	     .generic("lang","lang")
	     

	     .generic("onclick","onclick","action","click")
	     

	     .generic("ondblclick","ondblclick","dblclick")
	     

	     .generic("onkeydown","onkeydown","keydown")
	     

	     .generic("onkeypress","onkeypress","keypress")
	     

	     .generic("onkeyup","onkeyup","keyup")
	     

	     .generic("onmousedown","onmousedown","mousedown")
	     

	     .generic("onmousemove","onmousemove","mousemove")
	     

	     .generic("onmouseout","onmouseout","mouseout")
	     

	     .generic("onmouseover","onmouseover","mouseover")
	     

	     .generic("onmouseup","onmouseup","mouseup")
	     

	     .generic("role","role")
	     

	     .generic("style","style")
	     

	     .generic("title","title")
	     
;
	
	
private static boolean convertToBoolean(Object object) 
 {
		if (object == null) {
	return false;
}

if (object instanceof Boolean) {
    return (Boolean) object;
}

return Boolean.valueOf(object.toString());
	}
	
@Override
public void doEncodeEnd(ResponseWriter responseWriter, FacesContext facesContext, UIComponent component) 
		throws IOException
	 {
		String clientId = component.getClientId(facesContext);
	if ((!convertToBoolean(component.getAttributes().get("disabled")))) {
	responseWriter.startElement("a", component); 
	  responseWriter.writeURIAttribute("href","#",null);

   {
      String value = clientId;
      if(null != value &&
         value.length()>0
      ) {
        responseWriter.writeAttribute("id",value,null);
      }
      
   }

   {
      String value = clientId;
      if(null != value &&
         value.length()>0
      ) {
        responseWriter.writeAttribute("name",value,null);
      }
      
   }

   {
      String value = this.getOnClick(facesContext,component);
      if(null != value &&
         value.length()>0
      ) {
        responseWriter.writeAttribute("onclick",value,null);
      }
      
   }


	
renderPassThroughAttributes(facesContext, component, 
	PASS_THROUGH_ATTRIBUTES0);

	{
	Object text = component.getAttributes().get("value");
	if (text != null) {
		responseWriter.writeText(text, null); 
	}
}

	renderChildren(facesContext, component);
	responseWriter.endElement("a"); 
	} else  { 
	responseWriter.startElement("span", component); 
	   {
      String value = clientId;
      if(null != value &&
         value.length()>0
      ) {
        responseWriter.writeAttribute("id",value,null);
      }
      
   }


	
renderPassThroughAttributes(facesContext, component, 
	PASS_THROUGH_ATTRIBUTES1);

	{
	Object text = component.getAttributes().get("value");
	if (text != null) {
		responseWriter.writeText(text, null); 
	}
}

	renderChildren(facesContext, component);
	responseWriter.endElement("span"); 
}

	}
	
@Override
public boolean getRendersChildren() 
 {
		return true;
	}
}

