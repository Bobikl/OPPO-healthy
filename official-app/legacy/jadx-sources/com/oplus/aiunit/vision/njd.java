package com.oplus.aiunit.vision;

import com.garmin.fit.Profile$Type;

/* JADX INFO: loaded from: classes13.dex */
public class njd extends bxb {
    public static final int CalibrationDivisorFieldNum = 2;
    public static final int CalibrationFactorFieldNum = 1;
    public static final int LevelShiftFieldNum = 3;
    public static final int OffsetCalFieldNum = 4;
    public static final int SensorTypeFieldNum = 0;
    public static final int TimestampFieldNum = 253;
    public static final bxb h;

    static {
        bxb bxbVar = new bxb("one_d_sensor_calibration", 210);
        h = bxbVar;
        bxbVar.e(new w97("timestamp", 253, 134, 1.0d, 0.0d, "s", false, Profile$Type.DATE_TIME));
        bxbVar.e(new w97("sensor_type", 0, 0, 1.0d, 0.0d, "", false, Profile$Type.SENSOR_TYPE));
        Profile$Type profile$Type = Profile$Type.UINT32;
        bxbVar.e(new w97("calibration_factor", 1, 134, 1.0d, 0.0d, "", false, profile$Type));
        bxbVar.d.get(2).k.add(new p2j("baro_cal_factor", 134, 1.0d, 0.0d, "Pa"));
        bxbVar.d.get(2).k.get(0).b(0, 3L);
        bxbVar.e(new w97("calibration_divisor", 2, 134, 1.0d, 0.0d, "counts", false, profile$Type));
        bxbVar.e(new w97("level_shift", 3, 134, 1.0d, 0.0d, "", false, profile$Type));
        bxbVar.e(new w97("offset_cal", 4, 133, 1.0d, 0.0d, "", false, Profile$Type.SINT32));
    }

    public njd(bxb bxbVar) {
        super(bxbVar);
    }
}
