/* Copyright © 2016 EIS Group and/or one of its affiliates. All rights reserved. Unpublished work under U.S. copyright laws.
 CONFIDENTIAL AND TRADE SECRET INFORMATION. No portion of this work may be copied, distributed, modified, or incorporated into any other media without EIS Group prior written consent.*/
package org.richfaces.json;

/**
 * The <code>JSONString</code> interface allows a <code>toJSONString()</code> method so that a class can change the behavior of
 * <code>JSONObject.toString()</code>, <code>JSONArray.toString()</code>, and <code>JSONWriter.value(</code>Object<code>)</code>
 * . The <code>toJSONString</code> method will be used instead of the default behavior of using the Object's
 * <code>toString()</code> method and quoting the result.
 */
public interface JSONString {
    /**
     * The <code>toJSONString</code> method allows a class to produce its own JSON serialization.
     *
     * @return A strictly syntactically correct JSON text.
     */
    String toJSONString();
}
