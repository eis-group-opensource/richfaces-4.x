/* Copyright © 2016 EIS Group and/or one of its affiliates. All rights reserved. Unpublished work under U.S. copyright laws.
 CONFIDENTIAL AND TRADE SECRET INFORMATION. No portion of this work may be copied, distributed, modified, or incorporated into any other media without EIS Group prior written consent.*/
package org.richfaces.renderkit.html;

import java.io.IOException;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.context.ResponseWriter;
import org.richfaces.renderkit.RenderKitUtils;
import static org.richfaces.renderkit.RenderKitUtils.*;
import org.richfaces.renderkit.RenderKitUtils.Attributes;
import org.richfaces.renderkit.RenderKitUtils.ScriptHashVariableWrapper;
import org.richfaces.renderkit.html.CommandButtonRendererBase;


public class CommandButtonRenderer extends CommandButtonRendererBase {
	
private static final Attributes PASS_THROUGH_ATTRIBUTES2 = attributes()
	     .generic("accept","accept")
	     

	     .generic("accesskey","accesskey")
	     

	     .generic("align","align")
	     

	     .generic("alt","alt")
	     

	     .bool("checked","checked")
	     

	     .generic("class","styleClass")
	     

	     .generic("dir","dir")
	     

	     .bool("disabled","disabled")
	     

	     .generic("lang","lang")
	     

	     .generic("maxlength","maxlength")
	     

	     .generic("onblur","onblur")
	     

	     .generic("onchange","onchange")
	     

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
	     

	     .generic("onselect","onselect")
	     

	     .bool("readonly","readonly")
	     

	     .generic("role","role")
	     

	     .generic("size","size")
	     

	     .uri("src","src")
	     

	     .generic("style","style")
	     

	     .generic("tabindex","tabindex")
	     

	     .generic("title","title")
	     

	     .uri("usemap","usemap")
	     
;
	
	
@Override
public void doEncodeEnd(ResponseWriter responseWriter, FacesContext facesContext, UIComponent component) 
		throws IOException
	 {
		String clientId = component.getClientId(facesContext);
responseWriter.startElement("input", component); 
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

   {
      Object value = component.getAttributes().get("value");
      if(null != value &&
      shouldRenderAttribute(value)
      ) {
        responseWriter.writeAttribute("value",value,null);
      }
      
   }


	
renderPassThroughAttributes(facesContext, component, 
	PASS_THROUGH_ATTRIBUTES2);

encodeTypeAndImage(facesContext, component);;
responseWriter.endElement("input"); 

	}
}

