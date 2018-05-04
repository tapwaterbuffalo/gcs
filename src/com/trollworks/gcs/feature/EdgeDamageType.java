/*
 * Copyright (c) 1998-2018 by Richard A. Wilkes. All rights reserved.
 *
 * This Source Code Form is subject to the terms of the Mozilla Public License,
 * version 2.0. If a copy of the MPL was not distributed with this file, You
 * can obtain one at http://mozilla.org/MPL/2.0/.
 *
 * This Source Code Form is "Incompatible With Secondary Licenses", as defined
 * by the Mozilla Public License, version 2.0.
 */

package com.trollworks.gcs.feature;

import com.trollworks.toolkit.annotation.Localize;
import com.trollworks.toolkit.utility.Localization;

import java.util.ArrayList;

public enum EdgeDamageType {
    CUTTING {
        @Override
        public String toString() {
            return CUTTING_TITLE;
        }
    },
    IMPALING {
        @Override
        public String toString() {
            return IMPALING_TITLE;
        }
    };

    @Localize("cutting")
    static String CUTTING_TITLE;
    @Localize("impaling")
    static String IMPALING_TITLE;

    static {
        Localization.initialize();
    }

    public static EdgeDamageType[] getChoosableDamageTypes() {
        ArrayList<EdgeDamageType> list = new ArrayList<>();
        for (EdgeDamageType one : values()) {
            if (one.isChoosable()) {
                list.add(one);
            }
        }
        return list.toArray(new EdgeDamageType[list.size()]);
    }

    @SuppressWarnings("static-method")
    public boolean isChoosable() {
        return true;
    }

}
