/* Copyright © 2016 EIS Group and/or one of its affiliates. All rights reserved. Unpublished work under U.S. copyright laws.
 CONFIDENTIAL AND TRADE SECRET INFORMATION. No portion of this work may be copied, distributed, modified, or incorporated into any other media without EIS Group prior written consent.*/
package org.richfaces.component.util;

import java.util.NoSuchElementException;

import javax.faces.component.UINamingContainer;
import javax.faces.context.FacesContext;

import org.richfaces.util.FastJoiner;

import com.google.common.base.Joiner;
import com.google.common.base.Splitter;

/**
 * <p class="changed_added_4_0">
 * String manipulation utils.
 * </p>
 *
 * @author asmirnov@exadel.com
 */
public final class Strings {
    public static final Joiner DOT_JOINER = Joiner.on('.');

    public static final class NamingContainerDataHolder {
        public static final char SEPARATOR_CHAR = UINamingContainer.getSeparatorChar(FacesContext.getCurrentInstance());
        public static final FastJoiner SEPARATOR_CHAR_JOINER = FastJoiner.on(SEPARATOR_CHAR);
        public static final Splitter SEPARATOR_CHAR_SPLITTER = Splitter.on(SEPARATOR_CHAR);

        private NamingContainerDataHolder() {
        }
    }

    private Strings() {

        // this is utility class with static methods only.
    }

    /**
     * <p class="changed_added_4_0">
     * Remove characters from string end
     * </p>
     *
     * @param in input string
     * @param size number of characters to remove.
     */
    public static String cut(String in, int size) {
        if (size > 0) {
            return in.substring(0, in.length() - size);
        }

        return in;
    }

    /**
     * <p class="changed_added_4_0">
     * Change case of the first character to lower, as it required by the Java Beans property and setter/getter method name
     * conventions:
     * </p>
     * <p>
     * "PropertyFoo" will be changed to "propertyFoo"
     * </p>
     *
     * @param in
     * @return {@code in} with first character changed to lower case.
     */
    public static String firstToLowerCase(String in) {
        if (!isEmpty(in)) {
            in = in.substring(0, 1).toLowerCase() + in.substring(1);
        }

        return in;
    }

    /**
     * <p class="changed_added_4_0">
     * Change case of the first character to upper, as it required by the Java Beans property and setter/getter method name
     * conventions:
     * </p>
     * <p>
     * "propertyFoo" will be changed to "PropertyFoo"
     * </p>
     *
     * @param in
     * @return {@code in} with first character changed to lower case.
     */
    public static String firstToUpperCase(String in) {
        if (!isEmpty(in)) {
            in = in.substring(0, 1).toUpperCase() + in.substring(1);
        }

        return in;
    }

    /**
     * <p class="changed_added_4_0">
     * Check string for null or empty value
     * </p>
     *
     * @param type
     * @return true if {@code type} is null or zero-length string.
     */
    public static boolean isEmpty(String type) {
        return type == null || type.length() == 0;
    }

    public static String firstNonEmpty(String... strings) {
        for (String s : strings) {
            if (!isEmpty(s)) {
                return s;
            }
        }

        throw new NoSuchElementException();
    }
}
