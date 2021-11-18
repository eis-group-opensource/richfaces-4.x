/* Copyright © 2016 EIS Group and/or one of its affiliates. All rights reserved. Unpublished work under U.S. copyright laws.
 CONFIDENTIAL AND TRADE SECRET INFORMATION. No portion of this work may be copied, distributed, modified, or incorporated into any other media without EIS Group prior written consent.*/
package org.richfaces.renderkit.html;

import static org.richfaces.application.configuration.ConfigurationServiceHelper.getBooleanConfigurationValue;
import static org.richfaces.renderkit.RenderKitUtils.addToScriptHash;

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

import javax.faces.application.ResourceDependencies;
import javax.faces.application.ResourceDependency;
import javax.faces.component.UIComponent;
import javax.faces.component.UIOutput;
import javax.faces.context.FacesContext;
import javax.faces.context.ResponseWriter;
import javax.faces.render.Renderer;

import org.ajax4jsf.javascript.ScriptUtils;
import org.richfaces.application.CommonComponentsConfiguration;
import org.richfaces.cdk.annotations.JsfRenderer;
import org.richfaces.component.QueueRegistry;
import org.richfaces.renderkit.HtmlConstants;

/**
 * @author Nick Belaevski
 *
 */
@JsfRenderer(type = QueueResourceComponentRenderer.TYPE, family = UIOutput.COMPONENT_FAMILY)
@ResourceDependencies({
        @ResourceDependency(library = "javax.faces", name = "jsf.js"),
        @ResourceDependency(library = "org.richfaces", name = "jquery.js"),
        @ResourceDependency(library = "org.richfaces", name = "richfaces.js"),
        @ResourceDependency(library = "org.richfaces", name = "richfaces-queue.reslib")
})
public class QueueResourceComponentRenderer extends Renderer {
    static final String TYPE = "org.richfaces.QueueResourceComponentRenderer";
    private static final String FUNCTION_NAME = "RichFaces.queue.setQueueOptions";

    private enum QueueOptions {
        onbeforedomupdate,
        oncomplete,
        onerror,
        onrequestdequeue,
        onrequestqueue,
        onsubmit,
        requestDelay,
        queueId,
        ignoreDupResponses,
        requestGroupingId
    }

    private void appendOptions(UIComponent queue, Map<String, Object> optionsHash) {
        Map<String, Object> attributes = queue.getAttributes();

        for (QueueOptions option : QueueOptions.values()) {
            String optionName = option.name();
            Object value = attributes.get(optionName);
            addToScriptHash(optionsHash, optionName, value);
        }
    }

    @Override
    public void encodeEnd(FacesContext context, UIComponent component) throws IOException {
        super.encodeEnd(context, component);

        if (!getBooleanConfigurationValue(context, CommonComponentsConfiguration.Items.queueEnabled)) {
            return;
        }

        QueueRegistry registry = QueueRegistry.getInstance(context);
        if (registry != null && registry.hasQueuesToEncode()) {
            ResponseWriter writer = context.getResponseWriter();

            writer.startElement(HtmlConstants.SCRIPT_ELEM, component);
            writer.writeAttribute(HtmlConstants.ID_ATTRIBUTE, component.getClientId(context), null);
            writer.writeAttribute(HtmlConstants.TYPE_ATTR, HtmlConstants.JAVASCRIPT_TYPE, null);

            writer.writeText(FUNCTION_NAME, null);
            writer.writeText("({", null);

            Map<String, Object> queueOptionsMap = new LinkedHashMap<String, Object>();

            boolean isFirst = true;
            Map<String, UIComponent> registeredQueues = registry.getRegisteredQueues();
            for (Entry<String, UIComponent> queueEntry : registeredQueues.entrySet()) {
                if (!queueEntry.getValue().isRendered()) {
                    break;
                }
                if (isFirst) {
                    isFirst = false;
                } else {
                    writer.writeText(",", null);
                }

                queueOptionsMap.clear();

                String queueName = queueEntry.getKey();
                UIComponent queue = queueEntry.getValue();

                appendOptions(queue, queueOptionsMap);

                ScriptUtils.writeToStream(writer, queueName);
                writer.writeText(":", null);
                ScriptUtils.writeToStream(writer, queueOptionsMap);
            }

            writer.writeText("});", null);

            writer.endElement(HtmlConstants.SCRIPT_ELEM);
        }
    }
}
