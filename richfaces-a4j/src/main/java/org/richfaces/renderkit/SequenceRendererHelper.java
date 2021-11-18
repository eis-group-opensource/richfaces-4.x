/* Copyright © 2016 EIS Group and/or one of its affiliates. All rights reserved. Unpublished work under U.S. copyright laws.
 CONFIDENTIAL AND TRADE SECRET INFORMATION. No portion of this work may be copied, distributed, modified, or incorporated into any other media without EIS Group prior written consent.*/
package org.richfaces.renderkit;

import org.richfaces.component.UISequence;
import org.richfaces.component.util.HtmlUtil;

/**
 * @author Nick Belaevski
 *
 */
public class SequenceRendererHelper {
    private UISequence sequence;
    private int rowIndex = -1;
    private int columnIndex = 0;
    private String[] rowClasses = null;
    private String[] columnClasses = null;

    public SequenceRendererHelper(UISequence sequence) {
        super();
        this.sequence = sequence;

        this.rowClasses = splitClassesString((String) sequence.getAttributes().get("rowClasses"));
        this.columnClasses = splitClassesString((String) sequence.getAttributes().get("columnClasses"));
    }

    private static String[] splitClassesString(String s) {
        if (s != null) {
            return s.split(",");
        }

        return null;
    }

    private static String getCorrespondingArrayItem(String[] strings, int idx) {
        if (strings != null && strings.length > 0) {
            return strings[idx % strings.length];
        }

        return null;
    }

    public UISequence getSequence() {
        return sequence;
    }

    private void initialize() {
        rowIndex = sequence.getRowIndex();
    }

    public void nextRow() {
        if (rowIndex == -1) {
            initialize();
        }

        rowIndex++;
        columnIndex = 0;
    }

    public void nextColumn() {
        columnIndex++;
    }

    public String getRowClass() {
        String rowClass = (String) sequence.getAttributes().get("rowClass");
        return HtmlUtil.concatClasses(getCorrespondingArrayItem(rowClasses, rowIndex), rowClass);
    }

    public String getColumnClass() {
        return getCorrespondingArrayItem(columnClasses, columnIndex);
    }

    public boolean hasWalkedOverRows() {
        return rowIndex != -1;
    }
}
