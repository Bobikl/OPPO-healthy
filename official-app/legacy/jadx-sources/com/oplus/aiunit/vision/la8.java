package com.oplus.aiunit.vision;

import com.garmin.fit.Profile$Type;
import com.heytap.log.formatter.LogFieldKey;

/* JADX INFO: loaded from: classes13.dex */
public class la8 extends bxb {
    public static final int EnhancedAltitudeFieldNum = 3;
    public static final int EnhancedSpeedFieldNum = 4;
    public static final int HeadingFieldNum = 5;
    public static final int PositionLatFieldNum = 1;
    public static final int PositionLongFieldNum = 2;
    public static final int TimestampFieldNum = 253;
    public static final int TimestampMsFieldNum = 0;
    public static final int UtcTimestampFieldNum = 6;
    public static final int VelocityFieldNum = 7;
    public static final bxb h;

    static {
        bxb bxbVar = new bxb("gps_metadata", 160);
        h = bxbVar;
        Profile$Type profile$Type = Profile$Type.DATE_TIME;
        bxbVar.e(new w97("timestamp", 253, 134, 1.0d, 0.0d, "s", false, profile$Type));
        Profile$Type profile$Type2 = Profile$Type.UINT16;
        bxbVar.e(new w97("timestamp_ms", 0, 132, 1.0d, 0.0d, "ms", false, profile$Type2));
        Profile$Type profile$Type3 = Profile$Type.SINT32;
        bxbVar.e(new w97("position_lat", 1, 133, 1.0d, 0.0d, "semicircles", false, profile$Type3));
        bxbVar.e(new w97("position_long", 2, 133, 1.0d, 0.0d, "semicircles", false, profile$Type3));
        Profile$Type profile$Type4 = Profile$Type.UINT32;
        bxbVar.e(new w97("enhanced_altitude", 3, 134, 5.0d, 500.0d, LogFieldKey.MESSAGE_KEY, false, profile$Type4));
        bxbVar.e(new w97("enhanced_speed", 4, 134, 1000.0d, 0.0d, "m/s", false, profile$Type4));
        bxbVar.e(new w97("heading", 5, 132, 100.0d, 0.0d, "degrees", false, profile$Type2));
        bxbVar.e(new w97("utc_timestamp", 6, 134, 1.0d, 0.0d, "s", false, profile$Type));
        bxbVar.e(new w97("velocity", 7, 131, 100.0d, 0.0d, "m/s", false, Profile$Type.SINT16));
    }

    public la8(bxb bxbVar) {
        super(bxbVar);
    }
}
