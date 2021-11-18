/* Copyright © 2016 EIS Group and/or one of its affiliates. All rights reserved. Unpublished work under U.S. copyright laws.
 CONFIDENTIAL AND TRADE SECRET INFORMATION. No portion of this work may be copied, distributed, modified, or incorporated into any other media without EIS Group prior written consent.*/
package org.richfaces.resource;

import java.io.IOException;
import java.io.Writer;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.UUID;

import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;

import org.ajax4jsf.javascript.ScriptUtils;
import org.richfaces.application.push.PushContext;
import org.richfaces.application.push.PushContextFactory;
import org.richfaces.application.push.Session;
import org.richfaces.application.push.TopicKey;
import org.richfaces.application.ServiceTracker;

/**
 * @author Nick Belaevski
 *
 */
@DynamicResource
public class PushResource extends AbstractUserResource {
    private static final String PUSH_TOPIC_PARAM = "pushTopic";
    private static final String FORGET_PUSH_SESSION_ID_PARAM = "forgetPushSessionId";

    private Map<String, String> getFailuresMap(Map<TopicKey, String> failedSubscriptions) {
        Map<String, String> result = new HashMap<String, String>();

        for (Entry<TopicKey, String> entry : failedSubscriptions.entrySet()) {
            result.put(entry.getKey().getTopicAddress(), entry.getValue());
        }

        return result;
    }

    public void encode(FacesContext facesContext) throws IOException {
        ExternalContext externalContext = facesContext.getExternalContext();

        PushContextFactory pushContextFactory = ServiceTracker.getService(PushContextFactory.class);

        // resource plugin stub
        if (pushContextFactory == null) {
            return;
        }

        PushContext pushContext = pushContextFactory.getPushContext();

        String forgetPushSessionId = externalContext.getRequestParameterMap().get(FORGET_PUSH_SESSION_ID_PARAM);
        if (forgetPushSessionId != null) {
            Session oldSession = pushContext.getSessionManager().getPushSession(forgetPushSessionId);
            if (oldSession != null) {
                oldSession.invalidate();
            }
        }

        Session session = pushContext.getSessionFactory().createSession(UUID.randomUUID().toString());

        String[] topicNames = externalContext.getRequestParameterValuesMap().get(PUSH_TOPIC_PARAM);

        if (topicNames == null) {
            throw new IllegalArgumentException(PUSH_TOPIC_PARAM + " request parameter must be present");
        }

        session.subscribe(topicNames);

        Map<String, Object> subscriptionData = new HashMap<String, Object>(4);
        subscriptionData.put("sessionId", session.getId());

        Map<TopicKey, String> failedSubscriptions = session.getFailedSubscriptions();
        subscriptionData.put("failures", getFailuresMap(failedSubscriptions));

        Writer outWriter = facesContext.getExternalContext().getResponseOutputWriter();
        ScriptUtils.appendScript(outWriter, subscriptionData);
    }

    public String getContentType() {
        return "text/javascript; charset=utf-8";
    }
}
