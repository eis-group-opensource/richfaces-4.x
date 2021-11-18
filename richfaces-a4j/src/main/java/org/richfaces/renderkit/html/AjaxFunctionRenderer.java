/* Copyright © 2016 EIS Group and/or one of its affiliates. All rights reserved. Unpublished work under U.S. copyright laws.
 CONFIDENTIAL AND TRADE SECRET INFORMATION. No portion of this work may be copied, distributed, modified, or incorporated into any other media without EIS Group prior written consent.*/
package org.richfaces.renderkit.html;

import java.io.IOException;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.context.ResponseWriter;
import org.richfaces.renderkit.AjaxFunctionRendererBase;


public class AjaxFunctionRenderer extends AjaxFunctionRendererBase {
	
	
private static String convertToString(Object object) 
 {
		return object != null ? object.toString() : "";
	}
	
@Override
public void doEncodeEnd(ResponseWriter responseWriter, FacesContext facesContext, UIComponent component) 
		throws IOException
	 {
		String clientId = component.getClientId(facesContext);
responseWriter.startElement("span", component); 
   {
      String value = clientId;
      if(null != value &&
         value.length()>0
      ) {
        responseWriter.writeAttribute("id",value,null);
      }
      
   }

  responseWriter.writeAttribute("style","display: none;",null);


responseWriter.startElement("script", component); 
  responseWriter.writeAttribute("type","text/javascript",null);


{
	Object text = convertToString(this.getFunction(facesContext,component)) + ";";
	if (text != null) {
		responseWriter.writeText(text, null); 
	}
}

responseWriter.endElement("script"); 
responseWriter.endElement("span"); 

	}
}

