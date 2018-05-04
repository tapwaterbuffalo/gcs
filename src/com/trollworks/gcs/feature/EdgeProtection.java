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

import com.trollworks.gcs.character.Armor;
import com.trollworks.toolkit.io.xml.XMLReader;
import com.trollworks.toolkit.io.xml.XMLWriter;
import com.trollworks.toolkit.utility.text.Enums;

import java.io.IOException;

/** RAW Write class JavaDoc */
public class EdgeProtection extends Bonus {
    /** The XML tag. */
    public static final String  TAG_ROOT     = "edge_protection";  //$NON-NLS-1$
    private static final String TAG_LOCATION = "location";                                                                                                                                                                          //$NON-NLS-1$
    private static final String TAG_TYPE     = "damage_type";                                                             //$NON-NLS-1$
    private HitLocation         mLocation;
    private EdgeDamageType      mEdgeDamageType;

    /** Creates a new Edge Protection. */
    public EdgeProtection() {
        super(1);
        mLocation = HitLocation.TORSO;
        mEdgeDamageType = EdgeDamageType.CUTTING;
    }

    /**
     * Loads a {@link EdgeProtection}.
     *
     * @param reader The XML reader to use.
     */
    public EdgeProtection(XMLReader reader) throws IOException {
        this();
        load(reader);
    }

    /**
     * Creates a clone of the specified bonus.
     *
     * @param other The bonus to clone.
     */
    public EdgeProtection(EdgeProtection other) {
        super(other);
        mLocation = other.mLocation;
        mEdgeDamageType = other.mEdgeDamageType;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof EdgeProtection && super.equals(obj)) {
            return mLocation == ((EdgeProtection) obj).mLocation;
        }
        return false;
    }

    @Override
    public String getXMLTag() {
        return TAG_ROOT;
    }

    @Override
    public String getKey() {
        StringBuffer buffer = new StringBuffer();

        buffer.append(Armor.EP_PREFIX);
        buffer.append(mLocation.name());
        buffer.append("."); //$NON-NLS-1$
        buffer.append(mEdgeDamageType.name());
        return buffer.toString();
    }

    @Override
    public Feature cloneFeature() {
        return new EdgeProtection(this);
    }

    @Override
    protected void loadSelf(XMLReader reader) throws IOException {
        if (TAG_LOCATION.equals(reader.getName())) {
            setLocation(Enums.extract(reader.readText(), HitLocation.values(), HitLocation.TORSO));
        } else if (TAG_TYPE.equals(reader.getName())) {
            setDamageType(Enums.extract(reader.readText(), EdgeDamageType.values(), EdgeDamageType.CUTTING));
        } else {
            super.loadSelf(reader);
        }
    }

    /**
     * Saves the bonus.
     *
     * @param out The XML writer to use.
     */
    @Override
    public void save(XMLWriter out) {
        out.startSimpleTagEOL(TAG_ROOT);
        out.simpleTag(TAG_LOCATION, Enums.toId(mLocation));
        out.simpleTag(TAG_TYPE, Enums.toId(mEdgeDamageType));
        saveBase(out);
        out.endTagEOL(TAG_ROOT, true);
    }

    public HitLocation getLocation() {
        return mLocation;
    }

    /** @param location The location. */
    public void setLocation(HitLocation location) {
        mLocation = location;
    }

    public EdgeDamageType getDamageType() {
        return mEdgeDamageType;
    }

    public void setDamageType(EdgeDamageType damageType) {
        mEdgeDamageType = damageType;
    }
}
