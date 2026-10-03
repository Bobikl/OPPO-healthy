package com.oplus.aiunit.vision;

import com.garmin.fit.Profile$Type;

/* JADX INFO: loaded from: classes13.dex */
public class qnj extends bxb {
    public static final int EndPressureFieldNum = 2;
    public static final int SensorFieldNum = 0;
    public static final int StartPressureFieldNum = 1;
    public static final int TimestampFieldNum = 253;
    public static final int VolumeUsedFieldNum = 3;
    public static final bxb h;

    static {
        bxb bxbVar = new bxb("tank_summary", ixb.TANK_SUMMARY);
        h = bxbVar;
        bxbVar.e(new w97("timestamp", 253, 134, 1.0d, 0.0d, "s", false, Profile$Type.DATE_TIME));
        bxbVar.e(new w97(com.heytap.health.gdxui.stars.b.TAG_SENSOR, 0, 140, 1.0d, 0.0d, "", false, Profile$Type.ANT_CHANNEL_ID));
        Profile$Type profile$Type = Profile$Type.UINT16;
        bxbVar.e(new w97("start_pressure", 1, 132, 100.0d, 0.0d, "bar", false, profile$Type));
        bxbVar.e(new w97("end_pressure", 2, 132, 100.0d, 0.0d, "bar", false, profile$Type));
        bxbVar.e(new w97("volume_used", 3, 134, 100.0d, 0.0d, "L", false, Profile$Type.UINT32));
    }

    public qnj(bxb bxbVar) {
        super(bxbVar);
    }
}
