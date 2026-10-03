package com.oplus.aiunit.vision;

import com.garmin.fit.Profile$Type;
import com.heytap.databaseengine.apiv3.data.Element;

/* JADX INFO: loaded from: classes13.dex */
public class uql extends bxb {
    public static final int ActiveMetFieldNum = 9;
    public static final int BasalMetFieldNum = 7;
    public static final int BmiFieldNum = 13;
    public static final int BoneMassFieldNum = 4;
    public static final int MetabolicAgeFieldNum = 10;
    public static final int MuscleMassFieldNum = 5;
    public static final int PercentFatFieldNum = 1;
    public static final int PercentHydrationFieldNum = 2;
    public static final int PhysiqueRatingFieldNum = 8;
    public static final int TimestampFieldNum = 253;
    public static final int UserProfileIndexFieldNum = 12;
    public static final int VisceralFatMassFieldNum = 3;
    public static final int VisceralFatRatingFieldNum = 11;
    public static final int WeightFieldNum = 0;
    public static final bxb h;

    static {
        bxb bxbVar = new bxb("weight_scale", 30);
        h = bxbVar;
        bxbVar.e(new w97("timestamp", 253, 134, 1.0d, 0.0d, "s", false, Profile$Type.DATE_TIME));
        bxbVar.e(new w97("weight", 0, 132, 100.0d, 0.0d, "kg", false, Profile$Type.WEIGHT));
        Profile$Type profile$Type = Profile$Type.UINT16;
        bxbVar.e(new w97("percent_fat", 1, 132, 100.0d, 0.0d, "%", false, profile$Type));
        bxbVar.e(new w97("percent_hydration", 2, 132, 100.0d, 0.0d, "%", false, profile$Type));
        bxbVar.e(new w97("visceral_fat_mass", 3, 132, 100.0d, 0.0d, "kg", false, profile$Type));
        bxbVar.e(new w97("bone_mass", 4, 132, 100.0d, 0.0d, "kg", false, profile$Type));
        bxbVar.e(new w97("muscle_mass", 5, 132, 100.0d, 0.0d, "kg", false, profile$Type));
        bxbVar.e(new w97("basal_met", 7, 132, 4.0d, 0.0d, "kcal/day", false, profile$Type));
        Profile$Type profile$Type2 = Profile$Type.UINT8;
        bxbVar.e(new w97("physique_rating", 8, 2, 1.0d, 0.0d, "", false, profile$Type2));
        bxbVar.e(new w97("active_met", 9, 132, 4.0d, 0.0d, "kcal/day", false, profile$Type));
        bxbVar.e(new w97("metabolic_age", 10, 2, 1.0d, 0.0d, "years", false, profile$Type2));
        bxbVar.e(new w97("visceral_fat_rating", 11, 2, 1.0d, 0.0d, "", false, profile$Type2));
        bxbVar.e(new w97("user_profile_index", 12, 132, 1.0d, 0.0d, "", false, Profile$Type.MESSAGE_INDEX));
        bxbVar.e(new w97(Element.ELEMENT_NAME_BMI, 13, 132, 10.0d, 0.0d, "kg/m^2", false, profile$Type));
    }

    public uql(bxb bxbVar) {
        super(bxbVar);
    }
}
