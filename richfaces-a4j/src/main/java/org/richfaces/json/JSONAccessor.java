/* Copyright © 2016 EIS Group and/or one of its affiliates. All rights reserved. Unpublished work under U.S. copyright laws.
 CONFIDENTIAL AND TRADE SECRET INFORMATION. No portion of this work may be copied, distributed, modified, or incorporated into any other media without EIS Group prior written consent.*/
package org.richfaces.json;

import java.util.Collection;
import java.util.Map;

final class JSONAccessor {
    private JSONAccessor() {
    }

    static boolean putValue(JSONObject object, String key, Object value) {
        try {
            if (value instanceof Boolean) {
                object.put(key, ((Boolean) value).booleanValue());
            } else if (value instanceof Double) {
                object.put(key, ((Double) value).doubleValue());
            } else if (value instanceof Integer) {
                object.put(key, ((Integer) value).intValue());
            } else if (value instanceof Long) {
                object.put(key, ((Long) value).longValue());
            } else if (value instanceof Collection) {
                object.put(key, (Collection) value);
            } else if (value instanceof Map) {
                object.put(key, (Map) value);
            } else {
                object.put(key, value);
            }
        } catch (JSONException e) {
            e.printStackTrace();

            return false;
        }

        // no exception - suppose it's added
        return true;
    }

    static Object unwrapValue(Object value) throws JSONException {
        if (value instanceof JSONObject) {
            return new JSONMap((JSONObject) value);
        } else if (value instanceof JSONArray) {
            return new JSONCollection((JSONArray) value);
        }

        return value;
    }

    static Object getValue(JSONObject object, String key) throws JSONException {
        return unwrapValue(object.get(key));
    }
}
