/**
 * License Agreement.
 *
 *  JBoss RichFaces - Ajax4jsf Component Library
 *
 * Copyright (C) 2007  Exadel, Inc.
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License version 2.1 as published by the Free Software Foundation.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA 02110-1301  USA
 */
package org.richfaces.component;

import java.util.Collections;
import java.util.Iterator;

import javax.faces.component.UIComponent;

import org.checkerframework.checker.nullness.qual.Nullable;
import org.richfaces.cdk.annotations.Attribute;
import org.richfaces.cdk.annotations.EventName;
import org.richfaces.cdk.annotations.Facet;
import org.richfaces.cdk.annotations.JsfComponent;
import org.richfaces.cdk.annotations.JsfRenderer;
import org.richfaces.cdk.annotations.Tag;
import org.richfaces.cdk.annotations.TagType;

import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import com.google.common.collect.Iterators;
import com.google.common.collect.Maps;

/**
 * <p>The &lt;rich:list&gt; component renders a list of items. The list can be an numerically ordered list, an
 * un-ordered bullet-point list, or a data definition list. The component uses a data model for managing the list items,
 * which can be updated dynamically.</p>
 */
@JsfComponent(type = "org.richfaces.List", family = "org.richfaces.List", facets = @Facet(name = AbstractList.TERM), tag = @Tag(name = "list", handler = "org.richfaces.taglib.ListHandler", type = TagType.Facelets), renderer = @JsfRenderer(type = "org.richfaces.ListRenderer"), attributes = {
        "core-props.xml", "iteration-props.xml", "rows-prop.xml", "sequence-props.xml", "events-mouse-props.xml",
        "events-key-props.xml", "events-row-props.xml", "i18n-props.xml" })
public abstract class AbstractList extends UISequence {
    public static final String TERM = "term";
    private static final Predicate<String> TERM_PREDICATE = new Predicate<String>() {
        public boolean apply(String input) {
            return TERM.equals(input);
        }

        @Override
        public boolean test(@Nullable String input) {
            return apply(input);
        }
    };
    private static final Predicate<String> NON_TERM_PREDICATE = Predicates.not(TERM_PREDICATE);

    private Iterator<UIComponent> getFacetsIterator(Predicate<? super String> namePredicate) {
        if (getFacetCount() > 0) {
            return Maps.filterKeys(getFacets(), namePredicate).values().iterator();
        }

        return Collections.emptyIterator();
    }

    protected Iterator<UIComponent> dataChildren() {
        return Iterators.concat(getChildren().iterator(), getFacetsIterator(TERM_PREDICATE));
    }

    protected Iterator<UIComponent> fixedChildren() {
        return getFacetsIterator(NON_TERM_PREDICATE);
    }

    /**
     * The type of the list: unordered (default), ordered, definitions
     */
    @Attribute(defaultValue = "ListType.unordered")
    public abstract ListType getType();

    public UIComponent getTerm() {
        return getFacet(TERM);
    }

    @Attribute(events = @EventName("click"))
    public abstract String getOnclick();

    @Attribute(events = @EventName("dblclick"))
    public abstract String getOndblclick();

    @Attribute(events = @EventName("mousedown"))
    public abstract String getOnmousedown();

    @Attribute(events = @EventName("mouseup"))
    public abstract String getOnmouseup();

    @Attribute(events = @EventName("mouseover"))
    public abstract String getOnmouseover();

    @Attribute(events = @EventName("mousemove"))
    public abstract String getOnmousemove();

    @Attribute(events = @EventName("mouseout"))
    public abstract String getOnmouseout();

    @Attribute(events = @EventName("keypress"))
    public abstract String getOnkeypress();

    @Attribute(events = @EventName("keydown"))
    public abstract String getOnkeydown();

    @Attribute(events = @EventName("keyup"))
    public abstract String getOnkeyup();

    @Attribute(events = @EventName("rowclick"))
    public abstract String getOnrowclick();

    @Attribute(events = @EventName("rowdblclick"))
    public abstract String getOnrowdblclick();

    @Attribute(events = @EventName("rowmousedown"))
    public abstract String getOnrowmousedown();

    @Attribute(events = @EventName("rowmouseup"))
    public abstract String getOnrowmouseup();

    @Attribute(events = @EventName("rowmouseover"))
    public abstract String getOnrowmouseover();

    @Attribute(events = @EventName("rowmousemove"))
    public abstract String getOnrowmousemove();

    @Attribute(events = @EventName("rowmouseout"))
    public abstract String getOnrowmouseout();

    @Attribute(events = @EventName("rowkeypress"))
    public abstract String getOnrowkeypress();

    @Attribute(events = @EventName("rowkeydown"))
    public abstract String getOnrowkeydown();

    @Attribute(events = @EventName("rowkeyup"))
    public abstract String getOnrowkeyup();

    @Attribute
    public abstract String getStyle();

    @Attribute
    public abstract String getStyleClass();

    @Attribute
    public abstract String getTitle();

    @Attribute
    public abstract String getDir();

    @Attribute
    public abstract String getLang();

    /**
     * Assigns one or more space-separated CSS class names to the rows of the table. If the CSS class names are comma-separated,
     * each class will be assigned to a particular row in the order they follow in the attribute. If you have less class names
     * than rows, the class will be applied to every n-fold row where n is the order in which the class is listed in the
     * attribute. If there are more class names than rows, the overflow ones are ignored.
     */
    @Attribute
    public abstract String getRowClasses();

    /**
     * Assigns one or more space-separated CSS class names to the list rows
     */
    @Attribute
    public abstract String getRowClass();
}
