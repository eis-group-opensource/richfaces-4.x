/* Copyright © 2016 EIS Group and/or one of its affiliates. All rights reserved. Unpublished work under U.S. copyright laws.
 CONFIDENTIAL AND TRADE SECRET INFORMATION. No portion of this work may be copied, distributed, modified, or incorporated into any other media without EIS Group prior written consent.*/
package org.richfaces.event;

import javax.annotation.Generated;
import javax.faces.event.ActionListener;

/**
 * 
 **/
@Generated({"RichFaces CDK", "4.5.0-SNAPSHOT"})
public interface DummyActionListenerSource {

    /**
     * <p>Add a new {@link ActionListener} to the set of listeners interested
     * in being notified when {@link org.richfaces.view.facelets.html.LazyActionListener}s occur.</p>
     *
     * @param listener The {@link ActionListener} to be added
     *
     * @throws NullPointerException if <code>listener</code>
     *  is <code>null</code>
     */
    public void addActionListener(ActionListener listener);

    /**
     * <p>Remove an existing {@link ActionListener} (if any) from the set of
     * listeners interested in being notified when {@link org.richfaces.view.facelets.html.LazyActionListener}s
     * occur.</p>
     *
     * @param listener The {@link ActionListener} to be removed
     *
     * @throws NullPointerException if <code>listener</code>
     *  is <code>null</code>
     */
    public void removeActionListener(ActionListener listener);

    /**
     * <p>Return the array of registered {@link ActionListener}s for this instance.  If there are no registered listeners,
     * a zero-length array is returned.</p>
     */
    public ActionListener[] getActionListeners();
    
}