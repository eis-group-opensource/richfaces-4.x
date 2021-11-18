/* Copyright © 2016 EIS Group and/or one of its affiliates. All rights reserved. Unpublished work under U.S. copyright laws.
 CONFIDENTIAL AND TRADE SECRET INFORMATION. No portion of this work may be copied, distributed, modified, or incorporated into any other media without EIS Group prior written consent.*/
package org.richfaces.view.facelets;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.faces.component.UIComponent;
import javax.faces.view.AttachedObjectHandler;
import javax.faces.view.facelets.FaceletContext;

/**
 * @author Nick Belaevski
 *
 */
public final class TagHandlerUtils {

    /**
     * Constant that is obtained by reflection from {@link FaceletContext#FACELET_CONTEXT_KEY} to ensure that the constant isn't inlined.
     *
     * Prevents RF-13472.
     */
    public static final String FACELET_CONTEXT_KEY;

    static {
        try {
            // use reflection to access the Face
            FACELET_CONTEXT_KEY = (String) FaceletContext.class.getField("FACELET_CONTEXT_KEY").get(null);
        } catch (Exception e) {
            throw new IllegalStateException("Cannot obtain FACELET_CONTEXT_KEY", e);
        }
    }

    // TODO - is that implementation dependency? - yes, it is: RF-13518
    // Mojarra 2.1
    private static final String JAVAX_FACES_RETARGETABLE_HANDLERS = "javax.faces.RetargetableHandlers";
    // Mojarra 2.2
    private static final String JAVAX_FACES_ATTACHED_OBJECT_HANDLERS = "javax.faces.view.AttachedObjectHandlers";

    private TagHandlerUtils() {
        // utility class constructor
    }

    @SuppressWarnings({ "unchecked" })
    public static List<AttachedObjectHandler> getOrCreateRetargetableHandlersList(UIComponent component) {
        Map<String, Object> attrs = component.getAttributes();
        List<AttachedObjectHandler> list = (List<AttachedObjectHandler>) attrs.get(JAVAX_FACES_ATTACHED_OBJECT_HANDLERS);
        if (list == null) {
            list = (List<AttachedObjectHandler>) attrs.get(JAVAX_FACES_RETARGETABLE_HANDLERS);
        }

        if (list == null) {
            list = new ArrayList<AttachedObjectHandler>();
            attrs.put(JAVAX_FACES_RETARGETABLE_HANDLERS, list);
            attrs.put(JAVAX_FACES_ATTACHED_OBJECT_HANDLERS, list);
        }

        return list;
    }

    public static <T> Class<? extends T> loadClass(String className, Class<T> type) throws ClassNotFoundException,
        ClassCastException {

        ClassLoader ccl = Thread.currentThread().getContextClassLoader();
        Class<?> loadedClass = Class.forName(className, false, ccl);

        return loadedClass.asSubclass(type);
    }
}
