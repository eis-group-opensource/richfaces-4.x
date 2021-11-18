/* Copyright © 2016 EIS Group and/or one of its affiliates. All rights reserved. Unpublished work under U.S. copyright laws.
 CONFIDENTIAL AND TRADE SECRET INFORMATION. No portion of this work may be copied, distributed, modified, or incorporated into any other media without EIS Group prior written consent.*/
package org.richfaces.renderkit;

import java.io.IOException;

import org.ajax4jsf.javascript.JSChainJSFFunction;
import org.ajax4jsf.javascript.JSReference;
import org.ajax4jsf.javascript.ScriptStringBase;
import org.ajax4jsf.javascript.ScriptUtils;

/**
 * @author Nick Belaevski
 *
 */
public class AjaxFunction extends ScriptStringBase {
    public static final String FUNCTION_NAME = "RichFaces.ajax";
    private Object source;
    private Object event = JSReference.EVENT;
    private AjaxOptions options;

    public AjaxFunction(Object source, AjaxOptions options) {
        super();
        this.source = source;
        this.options = options;
    }

    public Object getSource() {
        return source;
    }

    public void setSource(Object source) {
        this.source = source;
    }

    public Object getEvent() {
        return event;
    }

    public void setEvent(Object event) {
        this.event = event;
    }

    public AjaxOptions getOptions() {
        return options;
    }

    public void setOptions(AjaxOptions eventOptions) {
        this.options = eventOptions;
    }

    private void appendAjaxFunctionCall(Appendable target) throws IOException {
        target.append(FUNCTION_NAME);
        target.append('(');

        ScriptUtils.appendScript(target, source);
        target.append(',');
        ScriptUtils.appendScript(target, event);

        if (!options.isEmpty()) {
            target.append(',');
            ScriptUtils.appendScript(target, options);
        }

        target.append(")");
    }

    public void appendScript(Appendable target) throws IOException {
        if (options.getBeforesubmitHandler() == null) {
            appendAjaxFunctionCall(target);
        } else {
            StringBuilder ajaxCall = new StringBuilder();
            appendAjaxFunctionCall(ajaxCall);

            ScriptUtils.appendScript(target, new JSChainJSFFunction(options.getBeforesubmitHandler(), ajaxCall.toString()));
        }
    }
}
