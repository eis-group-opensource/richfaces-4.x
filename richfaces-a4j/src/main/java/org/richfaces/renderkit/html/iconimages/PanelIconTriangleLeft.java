/* Copyright © 2016 EIS Group and/or one of its affiliates. All rights reserved. Unpublished work under U.S. copyright laws.
 CONFIDENTIAL AND TRADE SECRET INFORMATION. No portion of this work may be copied, distributed, modified, or incorporated into any other media without EIS Group prior written consent.*/
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
package org.richfaces.renderkit.html.iconimages;

import java.awt.Graphics2D;
import java.awt.geom.GeneralPath;

import org.richfaces.resource.DynamicUserResource;

@DynamicUserResource
public class PanelIconTriangleLeft extends PanelIconTriangleBasic {
    void draw(GeneralPath path, Graphics2D g2d) {
        g2d.translate(47, 30);
        path.moveTo(33, 0);
        path.lineTo(0, 33);
        path.lineTo(0, 34);
        path.lineTo(33, 67);
        path.closePath();
    }
}
