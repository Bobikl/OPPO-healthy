package com.oplus.aiunit.vision;

import com.garmin.fit.Profile$Type;

/* JADX INFO: loaded from: classes13.dex */
public class su6 extends bxb {
    public static final int ConceptCountFieldNum = 3;
    public static final int ConceptFieldFieldNum = 1;
    public static final int DisplayTypeFieldNum = 4;
    public static final int FieldIdFieldNum = 2;
    public static final int ScreenIndexFieldNum = 0;
    public static final int TitleFieldNum = 5;
    public static final bxb h;

    static {
        bxb bxbVar = new bxb("exd_data_field_configuration", 201);
        h = bxbVar;
        Profile$Type profile$Type = Profile$Type.UINT8;
        bxbVar.e(new w97("screen_index", 0, 2, 1.0d, 0.0d, "", false, profile$Type));
        bxbVar.e(new w97("concept_field", 1, 13, 1.0d, 0.0d, "", false, Profile$Type.BYTE));
        bxbVar.d.get(1).f18167j.add(new da7(2, false, 4, 1.0d, 0.0d));
        bxbVar.d.get(1).f18167j.add(new da7(3, false, 4, 1.0d, 0.0d));
        bxbVar.e(new w97("field_id", 2, 2, 1.0d, 0.0d, "", false, profile$Type));
        bxbVar.e(new w97("concept_count", 3, 2, 1.0d, 0.0d, "", false, profile$Type));
        bxbVar.e(new w97("display_type", 4, 0, 1.0d, 0.0d, "", false, Profile$Type.EXD_DISPLAY_TYPE));
        bxbVar.e(new w97("title", 5, 7, 1.0d, 0.0d, "", false, Profile$Type.STRING));
    }

    public su6(bxb bxbVar) {
        super(bxbVar);
    }
}
