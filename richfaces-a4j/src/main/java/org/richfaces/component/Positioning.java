/* Copyright © 2016 EIS Group and/or one of its affiliates. All rights reserved. Unpublished work under U.S. copyright laws.
 CONFIDENTIAL AND TRADE SECRET INFORMATION. No portion of this work may be copied, distributed, modified, or incorporated into any other media without EIS Group prior written consent.*/
package org.richfaces.component;

/**
 * @author amarkhel
 */
public enum Positioning {
    auto("AA"),
    topLeft("LT"),
    topRight("RT"),
    bottomLeft("LB"),
    bottomRight("RB"),
    autoLeft("LA"),
    autoRight("RA"),
    topAuto("AT"),
    bottomAuto("AB");
    public static final Positioning DEFAULT = auto;
    String value;

    Positioning(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
