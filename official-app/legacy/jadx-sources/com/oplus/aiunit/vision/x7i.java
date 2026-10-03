package com.oplus.aiunit.vision;

import com.garmin.fit.Profile$Type;
import com.heytap.log.formatter.LogFieldKey;
import com.heytap.sports.record.details.bean.SportSummaryBean;

/* JADX INFO: loaded from: classes13.dex */
public class x7i extends bxb {
    public static final int AvgSpeedFieldNum = 4;
    public static final int AvgVertSpeedFieldNum = 26;
    public static final int EndPositionLatFieldNum = 23;
    public static final int EndPositionLongFieldNum = 24;
    public static final int EndTimeFieldNum = 27;
    public static final int MaxSpeedFieldNum = 25;
    public static final int MessageIndexFieldNum = 254;
    public static final int SplitTypeFieldNum = 0;
    public static final int StartElevationFieldNum = 74;
    public static final int StartPositionLatFieldNum = 21;
    public static final int StartPositionLongFieldNum = 22;
    public static final int StartTimeFieldNum = 9;
    public static final int TotalAscentFieldNum = 13;
    public static final int TotalCaloriesFieldNum = 28;
    public static final int TotalDescentFieldNum = 14;
    public static final int TotalDistanceFieldNum = 3;
    public static final int TotalElapsedTimeFieldNum = 1;
    public static final int TotalMovingTimeFieldNum = 110;
    public static final int TotalTimerTimeFieldNum = 2;
    public static final bxb h;

    static {
        bxb bxbVar = new bxb("split", 312);
        h = bxbVar;
        bxbVar.e(new w97("message_index", 254, 132, 1.0d, 0.0d, "", false, Profile$Type.MESSAGE_INDEX));
        bxbVar.e(new w97("split_type", 0, 0, 1.0d, 0.0d, "", false, Profile$Type.SPLIT_TYPE));
        Profile$Type profile$Type = Profile$Type.UINT32;
        bxbVar.e(new w97("total_elapsed_time", 1, 134, 1000.0d, 0.0d, "s", false, profile$Type));
        bxbVar.e(new w97("total_timer_time", 2, 134, 1000.0d, 0.0d, "s", false, profile$Type));
        bxbVar.e(new w97("total_distance", 3, 134, 100.0d, 0.0d, LogFieldKey.MESSAGE_KEY, false, profile$Type));
        bxbVar.e(new w97(SportSummaryBean.AVG_SPEED, 4, 134, 1000.0d, 0.0d, "m/s", false, profile$Type));
        Profile$Type profile$Type2 = Profile$Type.DATE_TIME;
        bxbVar.e(new w97("start_time", 9, 134, 1.0d, 0.0d, "", false, profile$Type2));
        Profile$Type profile$Type3 = Profile$Type.UINT16;
        bxbVar.e(new w97("total_ascent", 13, 132, 1.0d, 0.0d, LogFieldKey.MESSAGE_KEY, false, profile$Type3));
        bxbVar.e(new w97("total_descent", 14, 132, 1.0d, 0.0d, LogFieldKey.MESSAGE_KEY, false, profile$Type3));
        Profile$Type profile$Type4 = Profile$Type.SINT32;
        bxbVar.e(new w97("start_position_lat", 21, 133, 1.0d, 0.0d, "semicircles", false, profile$Type4));
        bxbVar.e(new w97("start_position_long", 22, 133, 1.0d, 0.0d, "semicircles", false, profile$Type4));
        bxbVar.e(new w97("end_position_lat", 23, 133, 1.0d, 0.0d, "semicircles", false, profile$Type4));
        bxbVar.e(new w97("end_position_long", 24, 133, 1.0d, 0.0d, "semicircles", false, profile$Type4));
        bxbVar.e(new w97(SportSummaryBean.MAX_SPEED, 25, 134, 1000.0d, 0.0d, "m/s", false, profile$Type));
        bxbVar.e(new w97("avg_vert_speed", 26, 133, 1000.0d, 0.0d, "m/s", false, profile$Type4));
        bxbVar.e(new w97("end_time", 27, 134, 1.0d, 0.0d, "", false, profile$Type2));
        bxbVar.e(new w97("total_calories", 28, 134, 1.0d, 0.0d, "kcal", false, profile$Type));
        bxbVar.e(new w97("start_elevation", 74, 134, 5.0d, 500.0d, LogFieldKey.MESSAGE_KEY, false, profile$Type));
        bxbVar.e(new w97("total_moving_time", 110, 134, 1000.0d, 0.0d, "s", false, profile$Type));
    }

    public x7i(bxb bxbVar) {
        super(bxbVar);
    }
}
