package com.oplus.aiunit.vision;

import com.garmin.fit.Profile$Type;
import com.oplus.smartenginehelper.ParserTag;

/* JADX INFO: loaded from: classes13.dex */
public class o8i extends bxb {
    public static final int ModeFieldNum = 2;
    public static final int ReadingConfidenceFieldNum = 1;
    public static final int ReadingSpo2FieldNum = 0;
    public static final int TimestampFieldNum = 253;
    public static final bxb h;

    static {
        bxb bxbVar = new bxb("spo2_data", ixb.SPO2_DATA);
        h = bxbVar;
        bxbVar.e(new w97("timestamp", 253, 134, 1.0d, 0.0d, "s", false, Profile$Type.DATE_TIME));
        Profile$Type profile$Type = Profile$Type.UINT8;
        bxbVar.e(new w97("reading_spo2", 0, 2, 1.0d, 0.0d, ParserTag.TAG_PERCENT, false, profile$Type));
        bxbVar.e(new w97("reading_confidence", 1, 2, 1.0d, 0.0d, "", false, profile$Type));
        bxbVar.e(new w97("mode", 2, 0, 1.0d, 0.0d, "", false, Profile$Type.SPO2_MEASUREMENT_TYPE));
    }

    public o8i(bxb bxbVar) {
        super(bxbVar);
    }
}
