package com.oplus.aiunit.vision;

import com.garmin.fit.Profile$Type;
import com.heytap.log.formatter.LogFieldKey;
import com.heytap.nearx.tangramconfig.strategy.Fields;

/* JADX INFO: loaded from: classes13.dex */
public class sma extends bxb {
    public static final int DistanceFieldNum = 0;
    public static final int EnhancedSpeedFieldNum = 8;
    public static final int HangTimeFieldNum = 3;
    public static final int HeightFieldNum = 1;
    public static final int PositionLatFieldNum = 5;
    public static final int PositionLongFieldNum = 6;
    public static final int RotationsFieldNum = 2;
    public static final int ScoreFieldNum = 4;
    public static final int SpeedFieldNum = 7;
    public static final int TimestampFieldNum = 253;
    public static final bxb h;

    static {
        bxb bxbVar = new bxb("jump", ixb.JUMP);
        h = bxbVar;
        bxbVar.e(new w97("timestamp", 253, 134, 1.0d, 0.0d, "s", false, Profile$Type.DATE_TIME));
        Profile$Type profile$Type = Profile$Type.FLOAT32;
        bxbVar.e(new w97("distance", 0, 136, 1.0d, 0.0d, LogFieldKey.MESSAGE_KEY, false, profile$Type));
        bxbVar.e(new w97(Fields.HEIGHT_FIELD, 1, 136, 1.0d, 0.0d, LogFieldKey.MESSAGE_KEY, false, profile$Type));
        bxbVar.e(new w97("rotations", 2, 2, 1.0d, 0.0d, "", false, Profile$Type.UINT8));
        bxbVar.e(new w97("hang_time", 3, 136, 1.0d, 0.0d, "s", false, profile$Type));
        bxbVar.e(new w97("score", 4, 136, 1.0d, 0.0d, "", false, profile$Type));
        Profile$Type profile$Type2 = Profile$Type.SINT32;
        bxbVar.e(new w97("position_lat", 5, 133, 1.0d, 0.0d, "semicircles", false, profile$Type2));
        bxbVar.e(new w97("position_long", 6, 133, 1.0d, 0.0d, "semicircles", false, profile$Type2));
        bxbVar.e(new w97("speed", 7, 132, 1000.0d, 0.0d, "m/s", false, Profile$Type.UINT16));
        bxbVar.d.get(8).f18167j.add(new da7(8, false, 16, 1000.0d, 0.0d));
        bxbVar.e(new w97("enhanced_speed", 8, 134, 1000.0d, 0.0d, "m/s", false, Profile$Type.UINT32));
    }

    public sma(bxb bxbVar) {
        super(bxbVar);
    }
}
