/* Copyright © 2016 EIS Group and/or one of its affiliates. All rights reserved. Unpublished work under U.S. copyright laws.
 CONFIDENTIAL AND TRADE SECRET INFORMATION. No portion of this work may be copied, distributed, modified, or incorporated into any other media without EIS Group prior written consent.*/
package org.richfaces.renderkit;

import java.util.Map;
import java.util.TreeMap;

/**
 * @author Nick Belaevski
 */
public class ComponentAttribute implements Comparable<ComponentAttribute> {
    public enum Kind {
        BOOL,
        GENERIC,
        URI
    }

    private final String htmlAttributeName;
    private String componentAttributeName;
    private Object defaultValue;
    private String[] eventNames = {};
    private Kind kind = Kind.GENERIC;

    // TODO handling for aliases: "styleClass" -> "class"

    public ComponentAttribute(String htmlAttributeName) {
        super();
        this.htmlAttributeName = htmlAttributeName;
    }

    /**
     * <p class="changed_added_4_0">
     * </p>
     *
     * @return the defaultValue
     */
    public Object getDefaultValue() {
        return this.defaultValue;
    }

    /**
     * <p class="changed_added_4_0">
     * </p>
     *
     * @param defaultValue the defaultValue to set
     */
    public void setDefaultValue(Object defaultValue) {
        this.defaultValue = defaultValue;
    }

    /**
     * <p class="changed_added_4_0">
     * </p>
     *
     * @return the kind
     */
    public Kind getKind() {
        return this.kind;
    }

    /**
     * <p class="changed_added_4_0">
     * </p>
     *
     * @param kind the kind to set
     */
    public void setKind(Kind kind) {
        this.kind = kind;
    }

    public static final Map<String, ComponentAttribute> createMap(ComponentAttribute... attributes) {
        Map<String, ComponentAttribute> result = new TreeMap<String, ComponentAttribute>();

        for (ComponentAttribute componentAttribute : attributes) {
            result.put(componentAttribute.getComponentAttributeName(), componentAttribute);
        }

        return result;
    }

    /**
     * @return the name
     */
    public String getHtmlAttributeName() {
        return htmlAttributeName;
    }

    /**
     * @return the componentAttributeName
     */
    public String getComponentAttributeName() {
        return (componentAttributeName == null) ? htmlAttributeName : componentAttributeName;
    }

    /**
     * @param componentAttributeName the componentAttributeName to set
     * @return
     */
    public ComponentAttribute setComponentAttributeName(String componentAttributeName) {
        this.componentAttributeName = componentAttributeName;

        return this;
    }

    /**
     * @return the eventNames
     */
    public String[] getEventNames() {
        return eventNames;
    }

    /**
     * @param eventNames the eventNames to set
     * @return
     */
    public ComponentAttribute setEventNames(String... eventNames) {
        this.eventNames = eventNames;

        return this;
    }

    public int compareTo(ComponentAttribute o) {
        return getHtmlAttributeName().compareTo(o.getHtmlAttributeName());
    }
}
