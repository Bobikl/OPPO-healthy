package com.oplus.aiunit.vision;

import com.garmin.fit.Profile$Type;

/* JADX INFO: loaded from: classes13.dex */
public class rsc extends bxb {
    public static final int SentenceFieldNum = 1;
    public static final int TimestampFieldNum = 253;
    public static final int TimestampMsFieldNum = 0;
    public static final bxb h;

    static {
        bxb bxbVar = new bxb("nmea_sentence", 177);
        h = bxbVar;
        bxbVar.e(new w97("timestamp", 253, 134, 1.0d, 0.0d, "s", false, Profile$Type.DATE_TIME));
        bxbVar.e(new w97("timestamp_ms", 0, 132, 1.0d, 0.0d, "ms", false, Profile$Type.UINT16));
        bxbVar.e(new w97("sentence", 1, 7, 1.0d, 0.0d, "", false, Profile$Type.STRING));
    }

    public rsc(bxb bxbVar) {
        super(bxbVar);
    }
}
