/* Copyright © 2016 EIS Group and/or one of its affiliates. All rights reserved. Unpublished work under U.S. copyright laws.
 CONFIDENTIAL AND TRADE SECRET INFORMATION. No portion of this work may be copied, distributed, modified, or incorporated into any other media without EIS Group prior written consent.*/
package org.richfaces.json;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Iterator;

/**
 * @author Nick Belaevski - nbelaevski@exadel.com created 15.12.2006
 */
public class JSONCollection extends AbstractCollection implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 3192118108278773579L;
    private JSONArray array;

    public JSONCollection() throws JSONException {
        super();
        this.array = new JSONArray();
    }

    public JSONCollection(JSONArray array) throws JSONException {
        super();
        this.array = array;
    }

    public JSONCollection(String jsonString) throws JSONException {
        super();
        this.array = new JSONArray(jsonString);
    }

    public Iterator iterator() {
        return new Iterator() {
            int index = 0;

            public boolean hasNext() {
                return index < array.length();
            }

            public Object next() {
                try {
                    return JSONAccessor.unwrapValue(array.get(index++));
                } catch (JSONException e) {

                    // TODO Auto-generated catch block
                    e.printStackTrace();

                    throw new RuntimeException();
                }
            }

            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
    }

    public int size() {
        return array.length();
    }
}
