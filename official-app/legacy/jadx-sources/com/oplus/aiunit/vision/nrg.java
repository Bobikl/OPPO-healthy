package com.oplus.aiunit.vision;

import com.garmin.fit.Profile$Type;
import com.heytap.log.formatter.LogFieldKey;

/* JADX INFO: loaded from: classes13.dex */
public class nrg extends bxb {
    public static final int AltitudeFieldNum = 4;
    public static final int DistanceFieldNum = 3;
    public static final int EnhancedAltitudeFieldNum = 6;
    public static final int LeaderTimeFieldNum = 5;
    public static final int MessageIndexFieldNum = 254;
    public static final int PositionLatFieldNum = 1;
    public static final int PositionLongFieldNum = 2;
    public static final bxb h;

    static {
        bxb bxbVar = new bxb("segment_point", 150);
        h = bxbVar;
        bxbVar.e(new w97("message_index", 254, 132, 1.0d, 0.0d, "", false, Profile$Type.MESSAGE_INDEX));
        Profile$Type profile$Type = Profile$Type.SINT32;
        bxbVar.e(new w97("position_lat", 1, 133, 1.0d, 0.0d, "semicircles", false, profile$Type));
        bxbVar.e(new w97("position_long", 2, 133, 1.0d, 0.0d, "semicircles", false, profile$Type));
        Profile$Type profile$Type2 = Profile$Type.UINT32;
        bxbVar.e(new w97("distance", 3, 134, 100.0d, 0.0d, LogFieldKey.MESSAGE_KEY, false, profile$Type2));
        bxbVar.e(new w97("altitude", 4, 132, 5.0d, 500.0d, LogFieldKey.MESSAGE_KEY, false, Profile$Type.UINT16));
        bxbVar.d.get(4).f18167j.add(new da7(6, false, 16, 5.0d, 500.0d));
        bxbVar.e(new w97("leader_time", 5, 134, 1000.0d, 0.0d, "s", false, profile$Type2));
        bxbVar.e(new w97("enhanced_altitude", 6, 134, 5.0d, 500.0d, LogFieldKey.MESSAGE_KEY, false, profile$Type2));
    }

    public nrg(bxb bxbVar) {
        super(bxbVar);
    }
}
