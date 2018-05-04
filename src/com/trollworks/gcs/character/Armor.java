/*
 * Copyright (c) 1998-2017 by Richard A. Wilkes. All rights reserved.
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, version 2.0. If a copy of the MPL was not distributed with
 * this file, You can obtain one at http://mozilla.org/MPL/2.0/.
 *
 * This Source Code Form is "Incompatible With Secondary Licenses", as
 * defined by the Mozilla Public License, version 2.0.
 */

package com.trollworks.gcs.character;

import com.trollworks.gcs.feature.HitLocation;

/** Tracks the current armor levels. */
public class Armor {
    /** The prefix used in front of all IDs for damage resistance. */
    public static final String  DR_PREFIX                   = GURPSCharacter.CHARACTER_PREFIX + "dr.";                                                                                                                                                                                                         //$NON-NLS-1$
    /** The skull hit location's DR. */
    public static final String  ID_SKULL_DR                 = DR_PREFIX + HitLocation.SKULL.name();
    /** The eyes hit location's DR. */
    public static final String  ID_EYES_DR                  = DR_PREFIX + HitLocation.EYES.name();
    /** The face hit location's DR. */
    public static final String  ID_FACE_DR                  = DR_PREFIX + HitLocation.FACE.name();
    /** The neck hit location's DR. */
    public static final String  ID_NECK_DR                  = DR_PREFIX + HitLocation.NECK.name();
    /** The torso hit location's DR. */
    public static final String  ID_TORSO_DR                 = DR_PREFIX + HitLocation.TORSO.name();
    /** The vitals hit location's DR. */
    public static final String  ID_VITALS_DR                = DR_PREFIX + HitLocation.VITALS.name();
    private static final String ID_FULL_BODY_DR             = DR_PREFIX + HitLocation.FULL_BODY.name();
    private static final String ID_FULL_BODY_EXCEPT_EYES_DR = DR_PREFIX + HitLocation.FULL_BODY_EXCEPT_EYES.name();
    /** The groin hit location's DR. */
    public static final String  ID_GROIN_DR                 = DR_PREFIX + HitLocation.GROIN.name();
    /** The arm hit location's DR. */
    public static final String  ID_ARM_DR                   = DR_PREFIX + HitLocation.ARMS.name();
    /** The hand hit location's DR. */
    public static final String  ID_HAND_DR                  = DR_PREFIX + HitLocation.HANDS.name();
    /** The leg hit location's DR. */
    public static final String  ID_LEG_DR                   = DR_PREFIX + HitLocation.LEGS.name();
    /** The foot hit location's DR. */
    public static final String  ID_FOOT_DR                  = DR_PREFIX + HitLocation.FEET.name();
    /** The tail hit location's DR. */
    public static final String  ID_TAIL_DR                  = DR_PREFIX + HitLocation.TAIL.name();
    /** The wing hit location's DR. */
    public static final String  ID_WING_DR                  = DR_PREFIX + HitLocation.WINGS.name();
    /** The fin hit location's DR. */
    public static final String  ID_FIN_DR                   = DR_PREFIX + HitLocation.FINS.name();
    /** The brain hit location's DR. */
    public static final String  ID_BRAIN_DR                 = DR_PREFIX + HitLocation.BRAIN.name();

    public static final String  EP_PREFIX                   = GURPSCharacter.CHARACTER_PREFIX + "ep.";                                                                                                                                                                                                                                                                                                                                                        //$NON-NLS-1$
    public static final String  CUTTING_SUFFIX              = ".cutting";                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             //$NON-NLS-1$
    public static final String  IMPALING_SUFFIX             = ".impaling";                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     //$NON-NLS-1$

    /** The skull hit location's EPC. */
    public static final String  ID_SKULL_EPC                = EP_PREFIX + HitLocation.SKULL.name() + CUTTING_SUFFIX;
    /** The eyes hit location's EPC. */
    public static final String  ID_EYES_EPC                 = EP_PREFIX + HitLocation.EYES.name() + CUTTING_SUFFIX;
    /** The face hit location's EPC. */
    public static final String  ID_FACE_EPC                 = EP_PREFIX + HitLocation.FACE.name() + CUTTING_SUFFIX;
    /** The neck hit location's EPC. */
    public static final String  ID_NECK_EPC                 = EP_PREFIX + HitLocation.NECK.name() + CUTTING_SUFFIX;
    /** The torso hit location's EPC. */
    public static final String  ID_TORSO_EPC                = EP_PREFIX + HitLocation.TORSO.name() + CUTTING_SUFFIX;
    /** The vitals hit location's EPC. */
    public static final String  ID_VITALS_EPC               = EP_PREFIX + HitLocation.VITALS.name() + CUTTING_SUFFIX;
    /** The groin hit location's EPC. */
    public static final String  ID_GROIN_EPC                = EP_PREFIX + HitLocation.GROIN.name() + CUTTING_SUFFIX;
    /** The arm hit location's EPC. */
    public static final String  ID_ARM_EPC                  = EP_PREFIX + HitLocation.ARMS.name() + CUTTING_SUFFIX;
    /** The hand hit location's EPC. */
    public static final String  ID_HAND_EPC                 = EP_PREFIX + HitLocation.HANDS.name() + CUTTING_SUFFIX;
    /** The leg hit location's EPC. */
    public static final String  ID_LEG_EPC                  = EP_PREFIX + HitLocation.LEGS.name() + CUTTING_SUFFIX;
    /** The foot hit location's EPC. */
    public static final String  ID_FOOT_EPC                 = EP_PREFIX + HitLocation.FEET.name() + CUTTING_SUFFIX;
    /** The tail hit location's EPC. */
    public static final String  ID_TAIL_EPC                 = EP_PREFIX + HitLocation.TAIL.name() + CUTTING_SUFFIX;
    /** The wing hit location's EPC. */
    public static final String  ID_WING_EPC                 = EP_PREFIX + HitLocation.WINGS.name() + CUTTING_SUFFIX;
    /** The fin hit location's EPC. */
    public static final String  ID_FIN_EPC                  = EP_PREFIX + HitLocation.FINS.name() + CUTTING_SUFFIX;
    /** The brain hit location's EPC. */
    public static final String  ID_BRAIN_EPC                = EP_PREFIX + HitLocation.BRAIN.name() + CUTTING_SUFFIX;

    /** The skull hit location's EPI. */
    public static final String  ID_SKULL_EPI                = EP_PREFIX + HitLocation.SKULL.name() + IMPALING_SUFFIX;
    /** The eyes hit location's EPI. */
    public static final String  ID_EYES_EPI                 = EP_PREFIX + HitLocation.EYES.name() + IMPALING_SUFFIX;
    /** The face hit location's EPI. */
    public static final String  ID_FACE_EPI                 = EP_PREFIX + HitLocation.FACE.name() + IMPALING_SUFFIX;
    /** The neck hit location's EPI. */
    public static final String  ID_NECK_EPI                 = EP_PREFIX + HitLocation.NECK.name() + IMPALING_SUFFIX;
    /** The torso hit location's EPI. */
    public static final String  ID_TORSO_EPI                = EP_PREFIX + HitLocation.TORSO.name() + IMPALING_SUFFIX;
    /** The vitals hit location's EPI. */
    public static final String  ID_VITALS_EPI               = EP_PREFIX + HitLocation.VITALS.name() + IMPALING_SUFFIX;
    /** The groin hit location's EPI. */
    public static final String  ID_GROIN_EPI                = EP_PREFIX + HitLocation.GROIN.name() + IMPALING_SUFFIX;
    /** The arm hit location's EPI. */
    public static final String  ID_ARM_EPI                  = EP_PREFIX + HitLocation.ARMS.name() + IMPALING_SUFFIX;
    /** The hand hit location's EPI. */
    public static final String  ID_HAND_EPI                 = EP_PREFIX + HitLocation.HANDS.name() + IMPALING_SUFFIX;
    /** The leg hit location's EPI. */
    public static final String  ID_LEG_EPI                  = EP_PREFIX + HitLocation.LEGS.name() + IMPALING_SUFFIX;
    /** The foot hit location's EPI. */
    public static final String  ID_FOOT_EPI                 = EP_PREFIX + HitLocation.FEET.name() + IMPALING_SUFFIX;
    /** The tail hit location's EPI. */
    public static final String  ID_TAIL_EPI                 = EP_PREFIX + HitLocation.TAIL.name() + IMPALING_SUFFIX;
    /** The wing hit location's EPI. */
    public static final String  ID_WING_EPI                 = EP_PREFIX + HitLocation.WINGS.name() + IMPALING_SUFFIX;
    /** The fin hit location's EPI. */
    public static final String  ID_FIN_EPI                  = EP_PREFIX + HitLocation.FINS.name() + IMPALING_SUFFIX;
    /** The brain hit location's EPI. */
    public static final String  ID_BRAIN_EPI                = EP_PREFIX + HitLocation.BRAIN.name() + IMPALING_SUFFIX;

    private GURPSCharacter      mCharacter;
    private int                 mBrainDR;
    private int                 mSkullDR;
    private int                 mEyesDR;
    private int                 mFaceDR;
    private int                 mNeckDR;
    private int                 mTorsoDR;
    private int                 mVitalsDR;
    private int                 mGroinDR;
    private int                 mArmDR;
    private int                 mWingDR;
    private int                 mHandDR;
    private int                 mFinDR;
    private int                 mLegDR;
    private int                 mFootDR;
    private int                 mTailDR;

    // edge protection cutting
    private int                 mBrainEPC;
    private int                 mSkullEPC;
    private int                 mEyesEPC;
    private int                 mFaceEPC;
    private int                 mNeckEPC;
    private int                 mTorsoEPC;
    private int                 mVitalsEPC;
    private int                 mGroinEPC;
    private int                 mArmEPC;
    private int                 mWingEPC;
    private int                 mHandEPC;
    private int                 mFinEPC;
    private int                 mLegEPC;
    private int                 mFootEPC;
    private int                 mTailEPC;

    // edge protection impaling
    private int                 mBrainEPI;
    private int                 mSkullEPI;
    private int                 mEyesEPI;
    private int                 mFaceEPI;
    private int                 mNeckEPI;
    private int                 mTorsoEPI;
    private int                 mVitalsEPI;
    private int                 mGroinEPI;
    private int                 mArmEPI;
    private int                 mWingEPI;
    private int                 mHandEPI;
    private int                 mFinEPI;
    private int                 mLegEPI;
    private int                 mFootEPI;
    private int                 mTailEPI;

    Armor(GURPSCharacter character) {
        mCharacter = character;
        mSkullDR = 2;
    }

    void update() {
        int extra = mCharacter.getIntegerBonusFor(ID_FULL_BODY_DR);
        mCharacter.startNotify();
        setEyesDR(getBonusDR(ID_EYES_DR) + extra);
        extra += mCharacter.getIntegerBonusFor(ID_FULL_BODY_EXCEPT_EYES_DR);
        setBrainDR(getBonusDR(ID_BRAIN_DR) + extra);
        setSkullDR(getBonusDR(ID_SKULL_DR) + extra);
        setFaceDR(getBonusDR(ID_FACE_DR) + extra);
        setNeckDR(getBonusDR(ID_NECK_DR) + extra);
        int torsoDR = getBonusDR(ID_TORSO_DR);
        setTorsoDR(torsoDR + extra);
        setVitalsDR(getBonusDR(ID_VITALS_DR) + torsoDR + extra);
        setGroinDR(getBonusDR(ID_GROIN_DR) + extra);
        setArmDR(getBonusDR(ID_ARM_DR) + extra);
        setWingDR(getBonusDR(ID_WING_DR) + extra);
        setHandDR(getBonusDR(ID_HAND_DR) + extra);
        setFinDR(getBonusDR(ID_FIN_DR) + extra);
        setLegDR(getBonusDR(ID_LEG_DR) + extra);
        setFootDR(getBonusDR(ID_FOOT_DR) + extra);
        setTailDR(getBonusDR(ID_TAIL_DR) + extra);

        // edge protection
        setEyesEPC(mCharacter.getIntegerBonusFor(ID_EYES_EPC));
        setBrainEPC(mCharacter.getIntegerBonusFor(ID_BRAIN_EPC));
        setSkullEPC(mCharacter.getIntegerBonusFor(ID_SKULL_EPC));
        setFaceEPC(mCharacter.getIntegerBonusFor(ID_FACE_EPC));
        setNeckEPC(mCharacter.getIntegerBonusFor(ID_NECK_EPC));
        setTorsoEPC(mCharacter.getIntegerBonusFor(ID_TORSO_EPC));
        setVitalsEPC(mCharacter.getIntegerBonusFor(ID_VITALS_EPC) + getTorsoEPC());
        setGroinEPC(mCharacter.getIntegerBonusFor(ID_GROIN_EPC));
        setArmEPC(mCharacter.getIntegerBonusFor(ID_ARM_EPC));
        setWingEPC(mCharacter.getIntegerBonusFor(ID_WING_EPC));
        setHandEPC(mCharacter.getIntegerBonusFor(ID_HAND_EPC));
        setFinEPC(mCharacter.getIntegerBonusFor(ID_FIN_EPC));
        setLegEPC(mCharacter.getIntegerBonusFor(ID_LEG_EPC));
        setFootEPC(mCharacter.getIntegerBonusFor(ID_FOOT_EPC));
        setTailEPC(mCharacter.getIntegerBonusFor(ID_TAIL_EPC));
        setEyesEPI(mCharacter.getIntegerBonusFor(ID_EYES_EPI));
        setBrainEPI(mCharacter.getIntegerBonusFor(ID_BRAIN_EPI));
        setSkullEPI(mCharacter.getIntegerBonusFor(ID_SKULL_EPI));
        setFaceEPI(mCharacter.getIntegerBonusFor(ID_FACE_EPI));
        setNeckEPI(mCharacter.getIntegerBonusFor(ID_NECK_EPI));
        setTorsoEPI(mCharacter.getIntegerBonusFor(ID_TORSO_EPI));
        setVitalsEPI(mCharacter.getIntegerBonusFor(ID_VITALS_EPI) + getTorsoEPI());
        setGroinEPI(mCharacter.getIntegerBonusFor(ID_GROIN_EPI));
        setArmEPI(mCharacter.getIntegerBonusFor(ID_ARM_EPI));
        setWingEPI(mCharacter.getIntegerBonusFor(ID_WING_EPI));
        setHandEPI(mCharacter.getIntegerBonusFor(ID_HAND_EPI));
        setFinEPI(mCharacter.getIntegerBonusFor(ID_FIN_EPI));
        setLegEPI(mCharacter.getIntegerBonusFor(ID_LEG_EPI));
        setFootEPI(mCharacter.getIntegerBonusFor(ID_FOOT_EPI));
        setTailEPI(mCharacter.getIntegerBonusFor(ID_TAIL_EPI));

        mCharacter.endNotify();
    }

    private int getBonusDR(String key) {
        int bonus = mCharacter.getIntegerBonusFor(key);
        com.trollworks.gcs.character.HitLocation hitLocation = com.trollworks.gcs.character.HitLocation.MAP.get(key);
        if (hitLocation != null) {
            bonus += hitLocation.getDRBonus();
        }
        return bonus;
    }

    /** @return The brain hit location's DR. */
    public int getBrainDR() {
        return mBrainDR;
    }

    /**
     * Sets the brain hit location's DR.
     *
     * @param dr The DR amount.
     */
    public void setBrainDR(int dr) {
        if (mBrainDR != dr) {
            mBrainDR = dr;
            mCharacter.notifySingle(ID_BRAIN_DR, Integer.valueOf(mBrainDR));
        }
    }

    /** @return The skull hit location's DR. */
    public int getSkullDR() {
        return mSkullDR;
    }

    /**
     * Sets the skull hit location's DR.
     *
     * @param dr The DR amount.
     */
    public void setSkullDR(int dr) {
        if (mSkullDR != dr) {
            mSkullDR = dr;
            mCharacter.notifySingle(ID_SKULL_DR, Integer.valueOf(mSkullDR));
        }
    }

    /** @return The eyes hit location's DR. */
    public int getEyesDR() {
        return mEyesDR;
    }

    /**
     * Sets the eyes hit location's DR.
     *
     * @param dr The DR amount.
     */
    public void setEyesDR(int dr) {
        if (mEyesDR != dr) {
            mEyesDR = dr;
            mCharacter.notifySingle(ID_EYES_DR, Integer.valueOf(mEyesDR));
        }
    }

    /** @return The face hit location's DR. */
    public int getFaceDR() {
        return mFaceDR;
    }

    /**
     * Sets the face hit location's DR.
     *
     * @param dr The DR amount.
     */
    public void setFaceDR(int dr) {
        if (mFaceDR != dr) {
            mFaceDR = dr;
            mCharacter.notifySingle(ID_FACE_DR, Integer.valueOf(mFaceDR));
        }
    }

    /** @return The neck hit location's DR. */
    public int getNeckDR() {
        return mNeckDR;
    }

    /**
     * Sets the neck hit location's DR.
     *
     * @param dr The DR amount.
     */
    public void setNeckDR(int dr) {
        if (mNeckDR != dr) {
            mNeckDR = dr;
            mCharacter.notifySingle(ID_NECK_DR, Integer.valueOf(mNeckDR));
        }
    }

    /** @return The torso hit location's DR. */
    public int getTorsoDR() {
        return mTorsoDR;
    }

    /**
     * Sets the torso hit location's DR.
     *
     * @param dr The DR amount.
     */
    public void setTorsoDR(int dr) {
        if (mTorsoDR != dr) {
            mTorsoDR = dr;
            mCharacter.notifySingle(ID_TORSO_DR, Integer.valueOf(mTorsoDR));
        }
    }

    /** @return The vitals hit location's DR. */
    public int getVitalsDR() {
        return mVitalsDR;
    }

    /**
     * Sets the vitals hit location's DR.
     *
     * @param dr The DR amount.
     */
    public void setVitalsDR(int dr) {
        if (mVitalsDR != dr) {
            mVitalsDR = dr;
            mCharacter.notifySingle(ID_VITALS_DR, Integer.valueOf(mVitalsDR));
        }
    }

    /** @return The groin hit location's DR. */
    public int getGroinDR() {
        return mGroinDR;
    }

    /**
     * Sets the groin hit location's DR.
     *
     * @param dr The DR amount.
     */
    public void setGroinDR(int dr) {
        if (mGroinDR != dr) {
            mGroinDR = dr;
            mCharacter.notifySingle(ID_GROIN_DR, Integer.valueOf(mGroinDR));
        }
    }

    /** @return The arm hit location's DR. */
    public int getArmDR() {
        return mArmDR;
    }

    /**
     * Sets the arm hit location's DR.
     *
     * @param dr The DR amount.
     */
    public void setArmDR(int dr) {
        if (mArmDR != dr) {
            mArmDR = dr;
            mCharacter.notifySingle(ID_ARM_DR, Integer.valueOf(mArmDR));
        }
    }

    /** @return The wing hit location's DR. */
    public int getWingDR() {
        return mWingDR;
    }

    /**
     * Sets the wing hit location's DR.
     *
     * @param dr The DR amount.
     */
    public void setWingDR(int dr) {
        if (mWingDR != dr) {
            mWingDR = dr;
            mCharacter.notifySingle(ID_WING_DR, Integer.valueOf(mWingDR));
        }
    }

    /** @return The hand hit location's DR. */
    public int getHandDR() {
        return mHandDR;
    }

    /**
     * Sets the hand hit location's DR.
     *
     * @param dr The DR amount.
     */
    public void setHandDR(int dr) {
        if (mHandDR != dr) {
            mHandDR = dr;
            mCharacter.notifySingle(ID_HAND_DR, Integer.valueOf(mHandDR));
        }
    }

    /** @return The fin hit location's DR. */
    public int getFinDR() {
        return mFinDR;
    }

    /**
     * Sets the fin hit location's DR.
     *
     * @param dr The DR amount.
     */
    public void setFinDR(int dr) {
        if (mFinDR != dr) {
            mFinDR = dr;
            mCharacter.notifySingle(ID_FIN_DR, Integer.valueOf(mFinDR));
        }
    }

    /** @return The leg hit location's DR. */
    public int getLegDR() {
        return mLegDR;
    }

    /**
     * Sets the leg hit location's DR.
     *
     * @param dr The DR amount.
     */
    public void setLegDR(int dr) {
        if (mLegDR != dr) {
            mLegDR = dr;
            mCharacter.notifySingle(ID_LEG_DR, Integer.valueOf(mLegDR));
        }
    }

    /** @return The foot hit location's DR. */
    public int getFootDR() {
        return mFootDR;
    }

    /**
     * Sets the foot hit location's DR.
     *
     * @param dr The DR amount.
     */
    public void setFootDR(int dr) {
        if (mFootDR != dr) {
            mFootDR = dr;
            mCharacter.notifySingle(ID_FOOT_DR, Integer.valueOf(mFootDR));
        }
    }

    /** @return The tail hit location's DR. */
    public int getTailDR() {
        return mTailDR;
    }

    /**
     * Sets the tail hit location's DR.
     *
     * @param dr The DR amount.
     */
    public void setTailDR(int dr) {
        if (mTailDR != dr) {
            mTailDR = dr;
            mCharacter.notifySingle(ID_TAIL_DR, Integer.valueOf(mTailDR));
        }
    }

    /** @return The brainEPC. */
    public int getBrainEPC() {
        return mBrainEPC;
    }

    /** @return The skullEPC. */
    public int getSkullEPC() {
        return mSkullEPC;
    }

    /** @return The eyesEPC. */
    public int getEyesEPC() {
        return mEyesEPC;
    }

    /** @return The faceEPC. */
    public int getFaceEPC() {
        return mFaceEPC;
    }

    /** @return The neckEPC. */
    public int getNeckEPC() {
        return mNeckEPC;
    }

    /** @return The torsoEPC. */
    public int getTorsoEPC() {
        return mTorsoEPC;
    }

    /** @return The vitalsEPC. */
    public int getVitalsEPC() {
        return mVitalsEPC;
    }

    /** @return The groinEPC. */
    public int getGroinEPC() {
        return mGroinEPC;
    }

    /** @return The armEPC. */
    public int getArmEPC() {
        return mArmEPC;
    }

    /** @return The wingEPC. */
    public int getWingEPC() {
        return mWingEPC;
    }

    /** @return The handEPC. */
    public int getHandEPC() {
        return mHandEPC;
    }

    /** @return The finEPC. */
    public int getFinEPC() {
        return mFinEPC;
    }

    /** @return The legEPC. */
    public int getLegEPC() {
        return mLegEPC;
    }

    /** @return The footEPC. */
    public int getFootEPC() {
        return mFootEPC;
    }

    /** @return The tailEPC. */
    public int getTailEPC() {
        return mTailEPC;
    }

    /** @return The brainEPI. */
    public int getBrainEPI() {
        return mBrainEPI;
    }

    /** @return The skullEPI. */
    public int getSkullEPI() {
        return mSkullEPI;
    }

    /** @return The eyesEPI. */
    public int getEyesEPI() {
        return mEyesEPI;
    }

    /** @return The faceEPI. */
    public int getFaceEPI() {
        return mFaceEPI;
    }

    /** @return The neckEPI. */
    public int getNeckEPI() {
        return mNeckEPI;
    }

    /** @return The torsoEPI. */
    public int getTorsoEPI() {
        return mTorsoEPI;
    }

    /** @return The vitalsEPI. */
    public int getVitalsEPI() {
        return mVitalsEPI;
    }

    /** @return The groinEPI. */
    public int getGroinEPI() {
        return mGroinEPI;
    }

    /** @return The armEPI. */
    public int getArmEPI() {
        return mArmEPI;
    }

    /** @return The wingEPI. */
    public int getWingEPI() {
        return mWingEPI;
    }

    /** @return The handEPI. */
    public int getHandEPI() {
        return mHandEPI;
    }

    /** @return The finEPI. */
    public int getFinEPI() {
        return mFinEPI;
    }

    /** @return The legEPI. */
    public int getLegEPI() {
        return mLegEPI;
    }

    /** @return The footEPI. */
    public int getFootEPI() {
        return mFootEPI;
    }

    /** @return The tailEPI. */
    public int getTailEPI() {
        return mTailEPI;
    }

    /** @param brainEPC The value to set. */
    public void setBrainEPC(int brainEPC) {
        if (mBrainEPC != brainEPC) {
            mBrainEPC = brainEPC;
            mCharacter.notifySingle(ID_BRAIN_EPC, Integer.valueOf(mBrainEPC));
        }
    }

    /** @param skullEPC The value to set. */
    public void setSkullEPC(int skullEPC) {
        if (mSkullEPC != skullEPC) {
            mSkullEPC = skullEPC;
            mCharacter.notifySingle(ID_SKULL_EPC, Integer.valueOf(mSkullEPC));
        }
    }

    /** @param eyesEPC The value to set. */
    public void setEyesEPC(int eyesEPC) {
        if (mEyesEPC != eyesEPC) {
            mEyesEPC = eyesEPC;
            mCharacter.notifySingle(ID_EYES_EPC, Integer.valueOf(mEyesEPC));
        }
    }

    /** @param faceEPC The value to set. */
    public void setFaceEPC(int faceEPC) {
        if (mFaceEPC != faceEPC) {
            mFaceEPC = faceEPC;
            mCharacter.notifySingle(ID_FACE_EPC, Integer.valueOf(mFaceEPC));
        }
    }

    /** @param neckEPC The value to set. */
    public void setNeckEPC(int neckEPC) {
        if (mNeckEPC != neckEPC) {
            mNeckEPC = neckEPC;
            mCharacter.notifySingle(ID_NECK_EPC, Integer.valueOf(mNeckEPC));
        }
    }

    /** @param torsoEPC The value to set. */
    public void setTorsoEPC(int torsoEPC) {
        if (mTorsoEPC != torsoEPC) {
            mTorsoEPC = torsoEPC;
            mCharacter.notifySingle(ID_TORSO_EPC, Integer.valueOf(mTorsoEPC));
        }
    }

    /** @param vitalsEPC The value to set. */
    public void setVitalsEPC(int vitalsEPC) {
        if (mVitalsEPC != vitalsEPC) {
            mVitalsEPC = vitalsEPC;
            mCharacter.notifySingle(ID_VITALS_EPC, Integer.valueOf(mVitalsEPC));
        }
    }

    /** @param groinEPC The value to set. */
    public void setGroinEPC(int groinEPC) {
        if (mGroinEPC != groinEPC) {
            mGroinEPC = groinEPC;
            mCharacter.notifySingle(ID_GROIN_EPC, Integer.valueOf(mGroinEPC));
        }
    }

    /** @param armEPC The value to set. */
    public void setArmEPC(int armEPC) {
        if (mArmEPC != armEPC) {
            mArmEPC = armEPC;
            mCharacter.notifySingle(ID_ARM_EPC, Integer.valueOf(mArmEPC));
        }
    }

    /** @param wingEPC The value to set. */
    public void setWingEPC(int wingEPC) {
        if (mWingEPC != wingEPC) {
            mWingEPC = wingEPC;
            mCharacter.notifySingle(ID_WING_EPC, Integer.valueOf(mWingEPC));
        }
    }

    /** @param handEPC The value to set. */
    public void setHandEPC(int handEPC) {
        if (mHandEPC != handEPC) {
            mHandEPC = handEPC;
            mCharacter.notifySingle(ID_HAND_EPC, Integer.valueOf(mHandEPC));
        }
    }

    /** @param finEPC The value to set. */
    public void setFinEPC(int finEPC) {
        if (mFinEPC != finEPC) {
            mFinEPC = finEPC;
            mCharacter.notifySingle(ID_FIN_EPC, Integer.valueOf(mFinEPC));
        }
    }

    /** @param legEPC The value to set. */
    public void setLegEPC(int legEPC) {
        if (mLegEPC != legEPC) {
            mLegEPC = legEPC;
            mCharacter.notifySingle(ID_LEG_EPC, Integer.valueOf(mLegEPC));
        }
    }

    /** @param footEPC The value to set. */
    public void setFootEPC(int footEPC) {
        if (mFootEPC != footEPC) {
            mFootEPC = footEPC;
            mCharacter.notifySingle(ID_FOOT_EPC, Integer.valueOf(mFootEPC));
        }
    }

    /** @param tailEPC The value to set. */
    public void setTailEPC(int tailEPC) {
        if (mTailEPC != tailEPC) {
            mTailEPC = tailEPC;
            mCharacter.notifySingle(ID_TAIL_EPC, Integer.valueOf(mTailEPC));
        }
    }

    /** @param brainEPI The value to set. */
    public void setBrainEPI(int brainEPI) {
        if (mBrainEPI != brainEPI) {
            mBrainEPI = brainEPI;
            mCharacter.notifySingle(ID_BRAIN_EPI, Integer.valueOf(mBrainEPI));
        }
    }

    /** @param skullEPI The value to set. */
    public void setSkullEPI(int skullEPI) {
        if (mSkullEPI != skullEPI) {
            mSkullEPI = skullEPI;
            mCharacter.notifySingle(ID_SKULL_EPI, Integer.valueOf(mSkullEPI));
        }
    }

    /** @param eyesEPI The value to set. */
    public void setEyesEPI(int eyesEPI) {
        if (mEyesEPI != eyesEPI) {
            mEyesEPI = eyesEPI;
            mCharacter.notifySingle(ID_EYES_EPI, Integer.valueOf(mEyesEPI));
        }
    }

    /** @param faceEPI The value to set. */
    public void setFaceEPI(int faceEPI) {
        if (mFaceEPI != faceEPI) {
            mFaceEPI = faceEPI;
            mCharacter.notifySingle(ID_FACE_EPI, Integer.valueOf(mFaceEPI));
        }
    }

    /** @param neckEPI The value to set. */
    public void setNeckEPI(int neckEPI) {
        if (mNeckEPI != neckEPI) {
            mNeckEPI = neckEPI;
            mCharacter.notifySingle(ID_NECK_EPI, Integer.valueOf(mNeckEPI));
        }
    }

    /** @param torsoEPI The value to set. */
    public void setTorsoEPI(int torsoEPI) {
        if (mTorsoEPI != torsoEPI) {
            mTorsoEPI = torsoEPI;
            mCharacter.notifySingle(ID_TORSO_EPI, Integer.valueOf(mTorsoEPI));
        }
    }

    /** @param vitalsEPI The value to set. */
    public void setVitalsEPI(int vitalsEPI) {
        if (mVitalsEPI != vitalsEPI) {
            mVitalsEPI = vitalsEPI;
            mCharacter.notifySingle(ID_VITALS_EPI, Integer.valueOf(mVitalsEPI));
        }
    }

    /** @param groinEPI The value to set. */
    public void setGroinEPI(int groinEPI) {
        if (mGroinEPI != groinEPI) {
            mGroinEPI = groinEPI;
            mCharacter.notifySingle(ID_GROIN_EPI, Integer.valueOf(mGroinEPI));
        }
    }

    /** @param armEPI The value to set. */
    public void setArmEPI(int armEPI) {
        if (mArmEPI != armEPI) {
            mArmEPI = armEPI;
            mCharacter.notifySingle(ID_ARM_EPI, Integer.valueOf(mArmEPI));
        }
    }

    /** @param wingEPI The value to set. */
    public void setWingEPI(int wingEPI) {
        if (mWingEPI != wingEPI) {
            mWingEPI = wingEPI;
            mCharacter.notifySingle(ID_WING_EPI, Integer.valueOf(mWingEPI));
        }
    }

    /** @param handEPI The value to set. */
    public void setHandEPI(int handEPI) {
        if (mHandEPI != handEPI) {
            mHandEPI = handEPI;
            mCharacter.notifySingle(ID_HAND_EPI, Integer.valueOf(mHandEPI));
        }
    }

    /** @param finEPI The value to set. */
    public void setFinEPI(int finEPI) {
        if (mFinEPI != finEPI) {
            mFinEPI = finEPI;
            mCharacter.notifySingle(ID_FIN_EPI, Integer.valueOf(mFinEPI));
        }
    }

    /** @param legEPI The value to set. */
    public void setLegEPI(int legEPI) {
        if (mLegEPI != legEPI) {
            mLegEPI = legEPI;
            mCharacter.notifySingle(ID_LEG_EPI, Integer.valueOf(mLegEPI));
        }
    }

    /** @param footEPI The value to set. */
    public void setFootEPI(int footEPI) {
        if (mFootEPI != footEPI) {
            mFootEPI = footEPI;
            mCharacter.notifySingle(ID_FOOT_EPI, Integer.valueOf(mFootEPI));
        }
    }

    /** @param tailEPI The value to set. */
    public void setTailEPI(int tailEPI) {
        if (mTailEPI != tailEPI) {
            mTailEPI = tailEPI;
            mCharacter.notifySingle(ID_TAIL_EPI, Integer.valueOf(mTailEPI));
        }
    }

    /**
     * @param id The field ID to retrieve the data for.
     * @return The value of the specified field ID, or <code>null</code> if the field ID is invalid.
     */
    public Object getValueForID(String id) {
        if (id != null && id.startsWith(DR_PREFIX)) {
            if (ID_BRAIN_DR.equals(id)) {
                return Integer.valueOf(getBrainDR());
            } else if (ID_SKULL_DR.equals(id)) {
                return Integer.valueOf(getSkullDR());
            } else if (ID_EYES_DR.equals(id)) {
                return Integer.valueOf(getEyesDR());
            } else if (ID_FACE_DR.equals(id)) {
                return Integer.valueOf(getFaceDR());
            } else if (ID_NECK_DR.equals(id)) {
                return Integer.valueOf(getNeckDR());
            } else if (ID_TORSO_DR.equals(id)) {
                return Integer.valueOf(getTorsoDR());
            } else if (ID_VITALS_DR.equals(id)) {
                return Integer.valueOf(getVitalsDR());
            } else if (ID_GROIN_DR.equals(id)) {
                return Integer.valueOf(getGroinDR());
            } else if (ID_ARM_DR.equals(id)) {
                return Integer.valueOf(getArmDR());
            } else if (ID_WING_DR.equals(id)) {
                return Integer.valueOf(getWingDR());
            } else if (ID_HAND_DR.equals(id)) {
                return Integer.valueOf(getHandDR());
            } else if (ID_FIN_DR.equals(id)) {
                return Integer.valueOf(getFinDR());
            } else if (ID_LEG_DR.equals(id)) {
                return Integer.valueOf(getLegDR());
            } else if (ID_FOOT_DR.equals(id)) {
                return Integer.valueOf(getFootDR());
            } else if (ID_TAIL_DR.equals(id)) {
                return Integer.valueOf(getTailDR());
            } else if (ID_BRAIN_EPC.equals(id)) {
                return Integer.valueOf(getBrainEPC());
            } else if (ID_SKULL_EPC.equals(id)) {
                return Integer.valueOf(getSkullEPC());
            } else if (ID_EYES_EPC.equals(id)) {
                return Integer.valueOf(getEyesEPC());
            } else if (ID_FACE_EPC.equals(id)) {
                return Integer.valueOf(getFaceEPC());
            } else if (ID_NECK_EPC.equals(id)) {
                return Integer.valueOf(getNeckEPC());
            } else if (ID_TORSO_EPC.equals(id)) {
                return Integer.valueOf(getTorsoEPC());
            } else if (ID_VITALS_EPC.equals(id)) {
                return Integer.valueOf(getVitalsEPC());
            } else if (ID_GROIN_EPC.equals(id)) {
                return Integer.valueOf(getGroinEPC());
            } else if (ID_ARM_EPC.equals(id)) {
                return Integer.valueOf(getArmEPC());
            } else if (ID_WING_EPC.equals(id)) {
                return Integer.valueOf(getWingEPC());
            } else if (ID_HAND_EPC.equals(id)) {
                return Integer.valueOf(getHandEPC());
            } else if (ID_FIN_EPC.equals(id)) {
                return Integer.valueOf(getFinEPC());
            } else if (ID_LEG_EPC.equals(id)) {
                return Integer.valueOf(getLegEPC());
            } else if (ID_FOOT_EPC.equals(id)) {
                return Integer.valueOf(getFootEPC());
            } else if (ID_TAIL_EPC.equals(id)) {
                return Integer.valueOf(getTailEPC());
            } else if (ID_BRAIN_EPI.equals(id)) {
                return Integer.valueOf(getBrainEPI());
            } else if (ID_SKULL_EPI.equals(id)) {
                return Integer.valueOf(getSkullEPI());
            } else if (ID_EYES_EPI.equals(id)) {
                return Integer.valueOf(getEyesEPI());
            } else if (ID_FACE_EPI.equals(id)) {
                return Integer.valueOf(getFaceEPI());
            } else if (ID_NECK_EPI.equals(id)) {
                return Integer.valueOf(getNeckEPI());
            } else if (ID_TORSO_EPI.equals(id)) {
                return Integer.valueOf(getTorsoEPI());
            } else if (ID_VITALS_EPI.equals(id)) {
                return Integer.valueOf(getVitalsEPI());
            } else if (ID_GROIN_EPI.equals(id)) {
                return Integer.valueOf(getGroinEPI());
            } else if (ID_ARM_EPI.equals(id)) {
                return Integer.valueOf(getArmEPI());
            } else if (ID_WING_EPI.equals(id)) {
                return Integer.valueOf(getWingEPI());
            } else if (ID_HAND_EPI.equals(id)) {
                return Integer.valueOf(getHandEPI());
            } else if (ID_FIN_EPI.equals(id)) {
                return Integer.valueOf(getFinEPI());
            } else if (ID_LEG_EPI.equals(id)) {
                return Integer.valueOf(getLegEPI());
            } else if (ID_FOOT_EPI.equals(id)) {
                return Integer.valueOf(getFootEPI());
            } else if (ID_TAIL_EPI.equals(id)) {
                return Integer.valueOf(getTailEPI());
            }
        }
        return null;
    }

    /**
     * @param id The field ID to set the value for.
     * @param value The value to set.
     */
    public void setValueForID(String id, Object value) {
        if (id != null && id.startsWith(DR_PREFIX)) {
            if (ID_BRAIN_DR.equals(id)) {
                setBrainDR(((Integer) value).intValue());
            } else if (ID_SKULL_DR.equals(id)) {
                setSkullDR(((Integer) value).intValue());
            } else if (ID_EYES_DR.equals(id)) {
                setEyesDR(((Integer) value).intValue());
            } else if (ID_FACE_DR.equals(id)) {
                setFaceDR(((Integer) value).intValue());
            } else if (ID_NECK_DR.equals(id)) {
                setNeckDR(((Integer) value).intValue());
            } else if (ID_TORSO_DR.equals(id)) {
                setTorsoDR(((Integer) value).intValue());
            } else if (ID_VITALS_DR.equals(id)) {
                setVitalsDR(((Integer) value).intValue());
            } else if (ID_GROIN_DR.equals(id)) {
                setGroinDR(((Integer) value).intValue());
            } else if (ID_ARM_DR.equals(id)) {
                setArmDR(((Integer) value).intValue());
            } else if (ID_WING_DR.equals(id)) {
                setWingDR(((Integer) value).intValue());
            } else if (ID_HAND_DR.equals(id)) {
                setHandDR(((Integer) value).intValue());
            } else if (ID_FIN_DR.equals(id)) {
                setFinDR(((Integer) value).intValue());
            } else if (ID_LEG_DR.equals(id)) {
                setLegDR(((Integer) value).intValue());
            } else if (ID_FOOT_DR.equals(id)) {
                setFootDR(((Integer) value).intValue());
            } else if (ID_TAIL_DR.equals(id)) {
                setTailDR(((Integer) value).intValue());
            }
        }
    }

    public Object getEPValueForID(String id) {
        if (id != null && id.startsWith(EP_PREFIX)) {
            if (ID_BRAIN_EPC.equals(id)) {
                return Integer.valueOf(getBrainEPC());
            } else if (ID_SKULL_EPC.equals(id)) {
                return Integer.valueOf(getSkullEPC());
            } else if (ID_EYES_EPC.equals(id)) {
                return Integer.valueOf(getEyesEPC());
            } else if (ID_FACE_EPC.equals(id)) {
                return Integer.valueOf(getFaceEPC());
            } else if (ID_NECK_EPC.equals(id)) {
                return Integer.valueOf(getNeckEPC());
            } else if (ID_TORSO_EPC.equals(id)) {
                return Integer.valueOf(getTorsoEPC());
            } else if (ID_VITALS_EPC.equals(id)) {
                return Integer.valueOf(getVitalsEPC());
            } else if (ID_GROIN_EPC.equals(id)) {
                return Integer.valueOf(getGroinEPC());
            } else if (ID_ARM_EPC.equals(id)) {
                return Integer.valueOf(getArmEPC());
            } else if (ID_WING_EPC.equals(id)) {
                return Integer.valueOf(getWingEPC());
            } else if (ID_HAND_EPC.equals(id)) {
                return Integer.valueOf(getHandEPC());
            } else if (ID_FIN_EPC.equals(id)) {
                return Integer.valueOf(getFinEPC());
            } else if (ID_LEG_EPC.equals(id)) {
                return Integer.valueOf(getLegEPC());
            } else if (ID_FOOT_EPC.equals(id)) {
                return Integer.valueOf(getFootEPC());
            } else if (ID_TAIL_EPC.equals(id)) {
                return Integer.valueOf(getTailEPC());
            } else if (ID_BRAIN_EPI.equals(id)) {
                return Integer.valueOf(getBrainEPI());
            } else if (ID_SKULL_EPI.equals(id)) {
                return Integer.valueOf(getSkullEPI());
            } else if (ID_EYES_EPI.equals(id)) {
                return Integer.valueOf(getEyesEPI());
            } else if (ID_FACE_EPI.equals(id)) {
                return Integer.valueOf(getFaceEPI());
            } else if (ID_NECK_EPI.equals(id)) {
                return Integer.valueOf(getNeckEPI());
            } else if (ID_TORSO_EPI.equals(id)) {
                return Integer.valueOf(getTorsoEPI());
            } else if (ID_VITALS_EPI.equals(id)) {
                return Integer.valueOf(getVitalsEPI());
            } else if (ID_GROIN_EPI.equals(id)) {
                return Integer.valueOf(getGroinEPI());
            } else if (ID_ARM_EPI.equals(id)) {
                return Integer.valueOf(getArmEPI());
            } else if (ID_WING_EPI.equals(id)) {
                return Integer.valueOf(getWingEPI());
            } else if (ID_HAND_EPI.equals(id)) {
                return Integer.valueOf(getHandEPI());
            } else if (ID_FIN_EPI.equals(id)) {
                return Integer.valueOf(getFinEPI());
            } else if (ID_LEG_EPI.equals(id)) {
                return Integer.valueOf(getLegEPI());
            } else if (ID_FOOT_EPI.equals(id)) {
                return Integer.valueOf(getFootEPI());
            } else if (ID_TAIL_EPI.equals(id)) {
                return Integer.valueOf(getTailEPI());
            }
        }
        return null;
    }

    public void setEPValueForID(String id, Object value) {
        if (id != null && id.startsWith(EP_PREFIX)) {
            if (ID_BRAIN_EPC.equals(id)) {
                setBrainEPC(((Integer) value).intValue());
            } else if (ID_SKULL_EPC.equals(id)) {
                setSkullEPC(((Integer) value).intValue());
            } else if (ID_EYES_EPC.equals(id)) {
                setEyesEPC(((Integer) value).intValue());
            } else if (ID_FACE_EPC.equals(id)) {
                setFaceEPC(((Integer) value).intValue());
            } else if (ID_NECK_EPC.equals(id)) {
                setNeckEPC(((Integer) value).intValue());
            } else if (ID_TORSO_EPC.equals(id)) {
                setTorsoEPC(((Integer) value).intValue());
            } else if (ID_VITALS_EPC.equals(id)) {
                setVitalsEPC(((Integer) value).intValue());
            } else if (ID_GROIN_EPC.equals(id)) {
                setGroinEPC(((Integer) value).intValue());
            } else if (ID_ARM_EPC.equals(id)) {
                setArmEPC(((Integer) value).intValue());
            } else if (ID_WING_EPC.equals(id)) {
                setWingEPC(((Integer) value).intValue());
            } else if (ID_HAND_EPC.equals(id)) {
                setHandEPC(((Integer) value).intValue());
            } else if (ID_FIN_EPC.equals(id)) {
                setFinEPC(((Integer) value).intValue());
            } else if (ID_LEG_EPC.equals(id)) {
                setLegEPC(((Integer) value).intValue());
            } else if (ID_FOOT_EPC.equals(id)) {
                setFootEPC(((Integer) value).intValue());
            } else if (ID_TAIL_EPC.equals(id)) {
                setTailEPC(((Integer) value).intValue());
            } else if (ID_BRAIN_EPI.equals(id)) {
                setBrainEPI(((Integer) value).intValue());
            } else if (ID_SKULL_EPI.equals(id)) {
                setSkullEPI(((Integer) value).intValue());
            } else if (ID_EYES_EPI.equals(id)) {
                setEyesEPI(((Integer) value).intValue());
            } else if (ID_FACE_EPI.equals(id)) {
                setFaceEPI(((Integer) value).intValue());
            } else if (ID_NECK_EPI.equals(id)) {
                setNeckEPI(((Integer) value).intValue());
            } else if (ID_TORSO_EPI.equals(id)) {
                setTorsoEPI(((Integer) value).intValue());
            } else if (ID_VITALS_EPI.equals(id)) {
                setVitalsEPI(((Integer) value).intValue());
            } else if (ID_GROIN_EPI.equals(id)) {
                setGroinEPI(((Integer) value).intValue());
            } else if (ID_ARM_EPI.equals(id)) {
                setArmEPI(((Integer) value).intValue());
            } else if (ID_WING_EPI.equals(id)) {
                setWingEPI(((Integer) value).intValue());
            } else if (ID_HAND_EPI.equals(id)) {
                setHandEPI(((Integer) value).intValue());
            } else if (ID_FIN_EPI.equals(id)) {
                setFinEPI(((Integer) value).intValue());
            } else if (ID_LEG_EPI.equals(id)) {
                setLegEPI(((Integer) value).intValue());
            } else if (ID_FOOT_EPI.equals(id)) {
                setFootEPI(((Integer) value).intValue());
            } else if (ID_TAIL_EPI.equals(id)) {
                setTailEPI(((Integer) value).intValue());
            }
        }
    }
}
