package com.oplus.aiunit.vision;

import com.garmin.fit.Profile$Type;
import com.oplus.smartenginehelper.ParserTag;

/* JADX INFO: loaded from: classes13.dex */
public class ni9 extends bxb {
    public static final int ConfidenceFieldNum = 2;
    public static final int ProcessingIntervalFieldNum = 0;
    public static final int ReadingSpo2FieldNum = 1;
    public static final int TimestampFieldNum = 253;
    public static final bxb h;

    static {
        bxb bxbVar = new bxb("hsa_spo2_data", 305);
        h = bxbVar;
        bxbVar.e(new w97("timestamp", 253, 134, 1.0d, 0.0d, "s", false, Profile$Type.DATE_TIME));
        bxbVar.e(new w97("processing_interval", 0, 132, 1.0d, 0.0d, "s", false, Profile$Type.UINT16));
        Profile$Type profile$Type = Profile$Type.UINT8;
        bxbVar.e(new w97("reading_spo2", 1, 2, 1.0d, 0.0d, ParserTag.TAG_PERCENT, false, profile$Type));
        bxbVar.e(new w97("confidence", 2, 2, 1.0d, 0.0d, "", false, profile$Type));
    }

    public ni9(bxb bxbVar) {
        super(bxbVar);
    }
}
