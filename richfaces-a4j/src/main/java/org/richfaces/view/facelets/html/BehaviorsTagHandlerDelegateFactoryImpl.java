/* Copyright © 2016 EIS Group and/or one of its affiliates. All rights reserved. Unpublished work under U.S. copyright laws.
 CONFIDENTIAL AND TRADE SECRET INFORMATION. No portion of this work may be copied, distributed, modified, or incorporated into any other media without EIS Group prior written consent.*/
package org.richfaces.view.facelets.html;

import javax.faces.FacesWrapper;
import javax.faces.view.facelets.BehaviorHandler;
import javax.faces.view.facelets.ComponentHandler;
import javax.faces.view.facelets.ConverterHandler;
import javax.faces.view.facelets.TagHandlerDelegate;
import javax.faces.view.facelets.TagHandlerDelegateFactory;
import javax.faces.view.facelets.ValidatorHandler;

/**
 * @author Nick Belaevski
 */
public class BehaviorsTagHandlerDelegateFactoryImpl extends TagHandlerDelegateFactory implements
    FacesWrapper<TagHandlerDelegateFactory> {
    private TagHandlerDelegateFactory factory;

    public BehaviorsTagHandlerDelegateFactoryImpl(TagHandlerDelegateFactory factory) {
        this.factory = factory;
    }

    /*
     * (non-Javadoc)
     *
     * @see
     * javax.faces.view.facelets.TagHandlerDelegateFactory#createBehaviorHandlerDelegate(javax.faces.view.facelets.BehaviorHandler
     * )
     */
    @Override
    public TagHandlerDelegate createBehaviorHandlerDelegate(BehaviorHandler owner) {
        return factory.createBehaviorHandlerDelegate(owner);
    }

    /*
     * (non-Javadoc)
     *
     * @see
     * javax.faces.view.facelets.TagHandlerDelegateFactory#createComponentHandlerDelegate(javax.faces.view.facelets.ComponentHandler
     * )
     */
    @Override
    public TagHandlerDelegate createComponentHandlerDelegate(ComponentHandler owner) {

        // TagHandlers structure is created when view is compiled
        // so there's no need to check for BehaviorsStack

        if (owner instanceof BehaviorsAddingComponentHandlerWrapper) {
            // this is to avoid StackOverflowError because of ComponentHandler constructor call
            return factory.createComponentHandlerDelegate(owner);
        }

        ComponentHandler wrappedHandler = new BehaviorsAddingComponentHandlerWrapper(owner);

        return factory.createComponentHandlerDelegate(wrappedHandler);
    }

    /*
     * (non-Javadoc)
     *
     * @see
     * javax.faces.view.facelets.TagHandlerDelegateFactory#createConverterHandlerDelegate(javax.faces.view.facelets.ConverterHandler
     * )
     */
    @Override
    public TagHandlerDelegate createConverterHandlerDelegate(ConverterHandler owner) {
        return factory.createConverterHandlerDelegate(owner);
    }

    /*
     * (non-Javadoc)
     *
     * @see
     * javax.faces.view.facelets.TagHandlerDelegateFactory#createValidatorHandlerDelegate(javax.faces.view.facelets.ValidatorHandler
     * )
     */
    @Override
    public TagHandlerDelegate createValidatorHandlerDelegate(ValidatorHandler owner) {
        return factory.createValidatorHandlerDelegate(owner);
    }

    public TagHandlerDelegateFactory getWrapped() {
        return factory;
    }
}
