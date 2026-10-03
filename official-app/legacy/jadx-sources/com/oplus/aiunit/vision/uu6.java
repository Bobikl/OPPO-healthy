package com.oplus.aiunit.vision;

import com.garmin.fit.Profile$Type;
import com.oplus.smartenginehelper.ParserTag;

/* JADX INFO: loaded from: classes13.dex */
public class uu6 extends bxb {
    public static final int FieldCountFieldNum = 1;
    public static final int LayoutFieldNum = 2;
    public static final int ScreenEnabledFieldNum = 3;
    public static final int ScreenIndexFieldNum = 0;
    public static final bxb h;

    static {
        bxb bxbVar = new bxb("exd_screen_configuration", 200);
        h = bxbVar;
        Profile$Type profile$Type = Profile$Type.UINT8;
        bxbVar.e(new w97("screen_index", 0, 2, 1.0d, 0.0d, "", false, profile$Type));
        bxbVar.e(new w97("field_count", 1, 2, 1.0d, 0.0d, "", false, profile$Type));
        bxbVar.e(new w97(ParserTag.CHILD_LAYOUT, 2, 0, 1.0d, 0.0d, "", false, Profile$Type.EXD_LAYOUT));
        bxbVar.e(new w97("screen_enabled", 3, 0, 1.0d, 0.0d, "", false, Profile$Type.BOOL));
    }

    public uu6(bxb bxbVar) {
        super(bxbVar);
    }
}
