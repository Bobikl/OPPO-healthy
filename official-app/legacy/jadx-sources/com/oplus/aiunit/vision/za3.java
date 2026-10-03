package com.oplus.aiunit.vision;

import com.garmin.fit.Profile$Type;

/* JADX INFO: loaded from: classes13.dex */
public class za3 extends bxb {
    public static final int ShotNumFieldNum = 1;
    public static final int ShotSpeedFieldNum = 0;
    public static final int TimestampFieldNum = 253;
    public static final bxb h;

    static {
        bxb bxbVar = new bxb("chrono_shot_data", ixb.CHRONO_SHOT_DATA);
        h = bxbVar;
        bxbVar.e(new w97("timestamp", 253, 134, 1.0d, 0.0d, "", false, Profile$Type.DATE_TIME));
        bxbVar.e(new w97("shot_speed", 0, 134, 1000.0d, 0.0d, "m/s", false, Profile$Type.UINT32));
        bxbVar.e(new w97("shot_num", 1, 132, 1.0d, 0.0d, "", false, Profile$Type.UINT16));
    }

    public za3(bxb bxbVar) {
        super(bxbVar);
    }
}
