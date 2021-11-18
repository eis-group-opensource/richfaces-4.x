/* Copyright © 2016 EIS Group and/or one of its affiliates. All rights reserved. Unpublished work under U.S. copyright laws.
 CONFIDENTIAL AND TRADE SECRET INFORMATION. No portion of this work may be copied, distributed, modified, or incorporated into any other media without EIS Group prior written consent.*/
package org.richfaces.component;

/**
 * @author Nick Belaevski
 *
 */
public enum LogMode {

    popup,
    inline,
    console;
    public static final LogMode DEFAULT = inline;
}
