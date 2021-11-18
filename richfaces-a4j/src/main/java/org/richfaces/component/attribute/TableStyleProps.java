/* Copyright © 2016 EIS Group and/or one of its affiliates. All rights reserved. Unpublished work under U.S. copyright laws.
 CONFIDENTIAL AND TRADE SECRET INFORMATION. No portion of this work may be copied, distributed, modified, or incorporated into any other media without EIS Group prior written consent.*/

package org.richfaces.component.attribute;

import org.richfaces.cdk.annotations.Attribute;
import org.richfaces.cdk.annotations.Description;

/**
 * Interface defining style classes for dataTable and collapsibleSubTable
 *
 * @author Michal Petrov
 */
public interface TableStyleProps {
    @Attribute(description = @Description(value = "Space-separated list of CSS style class(es) that will be applied to the first row of the table", displayName = "First row CSS Classes"))
    String getFirstRowClass();

    @Attribute(description = @Description(value = "Space-separated list of CSS style class(es) that will be applied to the cells of the table", displayName = "Cell CSS Classes"))
    String getCellClass();

    @Attribute(description = @Description(value = "Space-separated list of CSS style class(es) that will be applied to the cells of the footer of the table", displayName = "Footer cell CSS Classes"))
    String getFooterCellClass();

    @Attribute(description = @Description(value = "Space-separated list of CSS style class(es) that will be applied to the first row of the footer of the table", displayName = "Footer first row CSS Classes"))
    String getFooterFirstClass();

    @Attribute(description = @Description(value = "Space-separated list of CSS style class(es) that will be applied to the cells of the header of the table", displayName = "Header cell CSS Classes"))
    String getHeaderCellClass();

    @Attribute(description = @Description(value = "Space-separated list of CSS style class(es) that will be applied to the first row of the header of the table", displayName = "Header first row CSS Classes"))
    String getHeaderFirstClass();

    @Attribute(description = @Description(value = "Space-separated list of CSS style class(es) that will be applied to the rows of the subheader of the table", displayName = "Subheader CSS Classes"))
    String getColumnHeaderClass();

    @Attribute(description = @Description(value = "Space-separated list of CSS style class(es) that will be applied to the cells of the subheader of the table", displayName = "Subheader cell CSS Classes"))
    String getColumnHeaderCellClass();

    @Attribute(description = @Description(value = "Space-separated list of CSS style class(es) that will be applied to the first row of the subheader of the table", displayName = "Subheader first row CSS Classes"))
    String getColumnHeaderFirstClass();

    @Attribute(description = @Description(value = "Space-separated list of CSS style class(es) that will be applied to the rows of the subfooter of the table", displayName = "Subfooter CSS Classes"))
    String getColumnFooterClass();

    @Attribute(description = @Description(value = "Space-separated list of CSS style class(es) that will be applied to the cells of the subfooter of the table", displayName = "Subfooter cell CSS Classes"))
    String getColumnFooterCellClass();

    @Attribute(description = @Description(value = "Space-separated list of CSS style class(es) that will be applied to the first row of the subheader of the table", displayName = "Subfooter first row CSS Classes"))
    String getFirstColumnFooterClass();
}
