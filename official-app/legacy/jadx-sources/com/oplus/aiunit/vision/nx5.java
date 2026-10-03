package com.oplus.aiunit.vision;

import com.garmin.fit.Profile$Type;
import com.heytap.log.formatter.LogFieldKey;
import com.oplus.smartenginehelper.ParserTag;

/* JADX INFO: loaded from: classes13.dex */
public class nx5 extends bxb {
    public static final int AscentTimeFieldNum = 16;
    public static final int AvgAscentRateFieldNum = 17;
    public static final int AvgDepthFieldNum = 2;
    public static final int AvgDescentRateFieldNum = 22;
    public static final int AvgPressureSacFieldNum = 12;
    public static final int AvgRmvFieldNum = 14;
    public static final int AvgVolumeSacFieldNum = 13;
    public static final int BottomTimeFieldNum = 11;
    public static final int DescentTimeFieldNum = 15;
    public static final int DiveNumberFieldNum = 10;
    public static final int EndCnsFieldNum = 6;
    public static final int EndN2FieldNum = 8;
    public static final int HangTimeFieldNum = 25;
    public static final int MaxAscentRateFieldNum = 23;
    public static final int MaxDepthFieldNum = 3;
    public static final int MaxDescentRateFieldNum = 24;
    public static final int O2ToxicityFieldNum = 9;
    public static final int ReferenceIndexFieldNum = 1;
    public static final int ReferenceMesgFieldNum = 0;
    public static final int StartCnsFieldNum = 5;
    public static final int StartN2FieldNum = 7;
    public static final int SurfaceIntervalFieldNum = 4;
    public static final int TimestampFieldNum = 253;
    public static final bxb h;

    static {
        bxb bxbVar = new bxb("dive_summary", 268);
        h = bxbVar;
        bxbVar.e(new w97("timestamp", 253, 134, 1.0d, 0.0d, "s", false, Profile$Type.DATE_TIME));
        bxbVar.e(new w97("reference_mesg", 0, 132, 1.0d, 0.0d, "", false, Profile$Type.MESG_NUM));
        bxbVar.e(new w97("reference_index", 1, 132, 1.0d, 0.0d, "", false, Profile$Type.MESSAGE_INDEX));
        Profile$Type profile$Type = Profile$Type.UINT32;
        bxbVar.e(new w97("avg_depth", 2, 134, 1000.0d, 0.0d, LogFieldKey.MESSAGE_KEY, false, profile$Type));
        bxbVar.e(new w97("max_depth", 3, 134, 1000.0d, 0.0d, LogFieldKey.MESSAGE_KEY, false, profile$Type));
        bxbVar.e(new w97("surface_interval", 4, 134, 1.0d, 0.0d, "s", false, profile$Type));
        Profile$Type profile$Type2 = Profile$Type.UINT8;
        bxbVar.e(new w97("start_cns", 5, 2, 1.0d, 0.0d, ParserTag.TAG_PERCENT, false, profile$Type2));
        bxbVar.e(new w97("end_cns", 6, 2, 1.0d, 0.0d, ParserTag.TAG_PERCENT, false, profile$Type2));
        Profile$Type profile$Type3 = Profile$Type.UINT16;
        bxbVar.e(new w97("start_n2", 7, 132, 1.0d, 0.0d, ParserTag.TAG_PERCENT, false, profile$Type3));
        bxbVar.e(new w97("end_n2", 8, 132, 1.0d, 0.0d, ParserTag.TAG_PERCENT, false, profile$Type3));
        bxbVar.e(new w97("o2_toxicity", 9, 132, 1.0d, 0.0d, "OTUs", false, profile$Type3));
        bxbVar.e(new w97("dive_number", 10, 134, 1.0d, 0.0d, "", false, profile$Type));
        bxbVar.e(new w97("bottom_time", 11, 134, 1000.0d, 0.0d, "s", false, profile$Type));
        bxbVar.e(new w97("avg_pressure_sac", 12, 132, 100.0d, 0.0d, "bar/min", false, profile$Type3));
        bxbVar.e(new w97("avg_volume_sac", 13, 132, 100.0d, 0.0d, "L/min", false, profile$Type3));
        bxbVar.e(new w97("avg_rmv", 14, 132, 100.0d, 0.0d, "L/min", false, profile$Type3));
        bxbVar.e(new w97("descent_time", 15, 134, 1000.0d, 0.0d, "s", false, profile$Type));
        bxbVar.e(new w97("ascent_time", 16, 134, 1000.0d, 0.0d, "s", false, profile$Type));
        bxbVar.e(new w97("avg_ascent_rate", 17, 133, 1000.0d, 0.0d, "m/s", false, Profile$Type.SINT32));
        bxbVar.e(new w97("avg_descent_rate", 22, 134, 1000.0d, 0.0d, "m/s", false, profile$Type));
        bxbVar.e(new w97("max_ascent_rate", 23, 134, 1000.0d, 0.0d, "m/s", false, profile$Type));
        bxbVar.e(new w97("max_descent_rate", 24, 134, 1000.0d, 0.0d, "m/s", false, profile$Type));
        bxbVar.e(new w97("hang_time", 25, 134, 1000.0d, 0.0d, "s", false, profile$Type));
    }

    public nx5(bxb bxbVar) {
        super(bxbVar);
    }
}
