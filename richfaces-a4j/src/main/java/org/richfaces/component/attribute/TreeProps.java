/* Copyright © 2016 EIS Group and/or one of its affiliates. All rights reserved. Unpublished work under U.S. copyright laws.
 CONFIDENTIAL AND TRADE SECRET INFORMATION. No portion of this work may be copied, distributed, modified, or incorporated into any other media without EIS Group prior written consent.*/

package org.richfaces.component.attribute;

import org.richfaces.cdk.annotations.Attribute;
import org.richfaces.cdk.annotations.Description;
import org.richfaces.cdk.annotations.EventName;
import org.richfaces.component.SwitchType;

import javax.el.MethodExpression;

import java.util.Collection;

/**
 * Interface defining the methods for tree-props.xml
 *
 * @author <a href="http://community.jboss.org/people/bleathem">Brian Leathem</a>
 */
public interface TreeProps {
    /**
     * Space-separated list of CSS style class(es) to be applied to the tree nodes.
     */
    @Attribute(description = @Description(value = "Space-separated list of CSS style class(es) to be applied to the tree nodes."))
    String getNodeClass();

    /**
     * Determines which treeNode should be used for rendering. Should contain EL expressions which uses request-scoped variable with name defied in attribute 'var'.
     */
    @Attribute(description = @Description(value = "Determines which treeNode should be used for rendering. Should contain EL expressions which uses request-scoped variable with name defied in attribute 'var'."))
    String getNodeType();

    /**
     * The client-side script method to be called after the node is toggled.
     */
    @Attribute(events = @EventName("nodetoggle"), description = @Description(value = "The client-side script method to be called after the node is toggled."))
    String getOnnodetoggle();

    /**
     * The client-side script method to be called after the selection is changed.
     */
    @Attribute(events = @EventName("selectionchange"), description = @Description(value = "The client-side script method to be called after the selection is changed."))
    String getOnselectionchange();

    /**
     *  The client-side script method to be called before the node is toggled.
     */
    @Attribute(events = @EventName("beforenodetoggle"), description = @Description(value = "The client-side script method to be called before the node is toggled."))
    String getOnbeforenodetoggle();

    /**
     * The client-side script method to be called before the selection is changed.
     */
    @Attribute(events = @EventName("beforeselectionchange"), description = @Description(value = "The client-side script method to be called before the selection is changed."))
    String getOnbeforeselectionchange();

    /**
     * Client-side event used for toggling tree nodes (click, dblclick, etc.)
     */
    @Attribute(description = @Description(value = "Client-side event used for toggling tree nodes (click, dblclick, etc.)"))
    String getToggleNodeEvent();

    /**
     * The collections of selected nodes.
     */
    @Attribute(description = @Description(value = "The collections of selected nodes."))
    Collection getSelection();

    /**
     *The type of type of the selection - ajax (default), client, server.
     */
    @Attribute(description = @Description(value = "The type of type of the selection - ajax (default), client, server."))
    SwitchType getSelectionType();

    /**
     * The type of type of the node toggling - ajax (default), client, server.
     */
    @Attribute(description = @Description(value = "The type of type of the node toggling - ajax (default), client, server."))
    SwitchType getToggleType();

    /**
     * Method expression referencing a method that will be called when an TreeSelectionChangeEvent has been broadcast for the listener.
     */
    @Attribute(description = @Description(value = "Method expression referencing a method that will be called when an TreeSelectionChangeEvent has been broadcast for the listener."))
    MethodExpression getSelectionChangeListener();

    /**
     * MethodExpression representing an tree node toggle listener method that will be notified when the tree node
     * is toggled. The expression must evaluate to a public method that takes an TreeToggleEvent parameter, with a
     * return type of void, or to a public method that takes no arguments with a return type of void.
     * In the latter case, the method has no way of easily knowing where the event came from, but this can be
     * useful in cases where a notification is needed that "some action happened".
     */
    @Attribute(description = @Description(value = "MethodExpression representing an tree node toggle listener method that will be notified when the tree node is toggled. The expression must evaluate to a public method that takes an TreeToggleEvent parameter, with a return type of void, or to a public method that takes no arguments with a return type of void. In the latter case, the method has no way of easily knowing where the event came from, but this can be useful in cases where a notification is needed that \"some action happened\"."))
    MethodExpression getToggleListener();

    // TODO: There is some overlap between the attributes below and with IterationProps.

    /**
     * A request-scope attribute via which the data object for the current row will be used when iterating
     */
    @Attribute(description = @Description(value = "A request-scope attribute via which the data object for the current row will be used when iterating."))
    String getVar();

    /**
     * Provides access to the row key in a Request scope
     */
    @Attribute(description = @Description(value = "Provides access to the row key in a Request scope."))
    String getRowKeyVar();

    /**
     * Provides access to the state in a Request scope
     */
    @Attribute(description = @Description(value = "Provides access to the state in a Request scope."))
    String getStateVar();

    /**
     * Boolean attribute that defines whether this iteration component will reset saved children's state before
     * rendering. By default state is reset if there are no faces messages with severity error or higher
     */
    @Attribute(description = @Description(value = "Boolean attribute that defines whether this iteration component will reset saved children's state before rendering. By default state is reset if there are no faces messages with severity error or higher."))
    boolean isKeepSaved();
}
