package com.oplus.aiunit.vision;

import com.garmin.fit.Profile$Type;

/* JADX INFO: loaded from: classes13.dex */
public class byk extends bxb {
    public static final int FrameNumberFieldNum = 1;
    public static final int TimestampFieldNum = 253;
    public static final int TimestampMsFieldNum = 0;
    public static final bxb h;

    static {
        bxb bxbVar = new bxb("video_frame", 169);
        h = bxbVar;
        bxbVar.e(new w97("timestamp", 253, 134, 1.0d, 0.0d, "s", false, Profile$Type.DATE_TIME));
        bxbVar.e(new w97("timestamp_ms", 0, 132, 1.0d, 0.0d, "ms", false, Profile$Type.UINT16));
        bxbVar.e(new w97("frame_number", 1, 134, 1.0d, 0.0d, "", false, Profile$Type.UINT32));
    }

    public byk(bxb bxbVar) {
        super(bxbVar);
    }
}
