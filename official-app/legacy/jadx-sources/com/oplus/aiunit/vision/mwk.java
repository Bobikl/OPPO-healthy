package com.oplus.aiunit.vision;

import com.garmin.fit.Profile$Type;

/* JADX INFO: loaded from: classes13.dex */
public class mwk extends bxb {
    public static final int ClipEndFieldNum = 7;
    public static final int ClipNumberFieldNum = 0;
    public static final int ClipStartFieldNum = 6;
    public static final int EndTimestampFieldNum = 3;
    public static final int EndTimestampMsFieldNum = 4;
    public static final int StartTimestampFieldNum = 1;
    public static final int StartTimestampMsFieldNum = 2;
    public static final bxb h;

    static {
        bxb bxbVar = new bxb("video_clip", 187);
        h = bxbVar;
        Profile$Type profile$Type = Profile$Type.UINT16;
        bxbVar.e(new w97("clip_number", 0, 132, 1.0d, 0.0d, "", false, profile$Type));
        Profile$Type profile$Type2 = Profile$Type.DATE_TIME;
        bxbVar.e(new w97("start_timestamp", 1, 134, 1.0d, 0.0d, "", false, profile$Type2));
        bxbVar.e(new w97("start_timestamp_ms", 2, 132, 1.0d, 0.0d, "", false, profile$Type));
        bxbVar.e(new w97("end_timestamp", 3, 134, 1.0d, 0.0d, "", false, profile$Type2));
        bxbVar.e(new w97("end_timestamp_ms", 4, 132, 1.0d, 0.0d, "", false, profile$Type));
        Profile$Type profile$Type3 = Profile$Type.UINT32;
        bxbVar.e(new w97("clip_start", 6, 134, 1.0d, 0.0d, "ms", false, profile$Type3));
        bxbVar.e(new w97("clip_end", 7, 134, 1.0d, 0.0d, "ms", false, profile$Type3));
    }

    public mwk(bxb bxbVar) {
        super(bxbVar);
    }
}
