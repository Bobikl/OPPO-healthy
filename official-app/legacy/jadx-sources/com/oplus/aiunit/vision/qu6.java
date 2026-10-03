package com.oplus.aiunit.vision;

import com.garmin.fit.Profile$Type;

/* JADX INFO: loaded from: classes13.dex */
public class qu6 extends bxb {
    public static final int ConceptFieldFieldNum = 1;
    public static final int ConceptIndexFieldNum = 3;
    public static final int ConceptKeyFieldNum = 5;
    public static final int DataPageFieldNum = 4;
    public static final int DataUnitsFieldNum = 8;
    public static final int DescriptorFieldNum = 10;
    public static final int FieldIdFieldNum = 2;
    public static final int IsSignedFieldNum = 11;
    public static final int QualifierFieldNum = 9;
    public static final int ScalingFieldNum = 6;
    public static final int ScreenIndexFieldNum = 0;
    public static final bxb h;

    static {
        bxb bxbVar = new bxb("exd_data_concept_configuration", 202);
        h = bxbVar;
        Profile$Type profile$Type = Profile$Type.UINT8;
        bxbVar.e(new w97("screen_index", 0, 2, 1.0d, 0.0d, "", false, profile$Type));
        bxbVar.e(new w97("concept_field", 1, 13, 1.0d, 0.0d, "", false, Profile$Type.BYTE));
        bxbVar.d.get(1).f18167j.add(new da7(2, false, 4, 1.0d, 0.0d));
        bxbVar.d.get(1).f18167j.add(new da7(3, false, 4, 1.0d, 0.0d));
        bxbVar.e(new w97("field_id", 2, 2, 1.0d, 0.0d, "", false, profile$Type));
        bxbVar.e(new w97("concept_index", 3, 2, 1.0d, 0.0d, "", false, profile$Type));
        bxbVar.e(new w97("data_page", 4, 2, 1.0d, 0.0d, "", false, profile$Type));
        bxbVar.e(new w97("concept_key", 5, 2, 1.0d, 0.0d, "", false, profile$Type));
        bxbVar.e(new w97("scaling", 6, 2, 1.0d, 0.0d, "", false, profile$Type));
        bxbVar.e(new w97("data_units", 8, 0, 1.0d, 0.0d, "", false, Profile$Type.EXD_DATA_UNITS));
        bxbVar.e(new w97("qualifier", 9, 0, 1.0d, 0.0d, "", false, Profile$Type.EXD_QUALIFIERS));
        bxbVar.e(new w97("descriptor", 10, 0, 1.0d, 0.0d, "", false, Profile$Type.EXD_DESCRIPTORS));
        bxbVar.e(new w97("is_signed", 11, 0, 1.0d, 0.0d, "", false, Profile$Type.BOOL));
    }

    public qu6(bxb bxbVar) {
        super(bxbVar);
    }
}
