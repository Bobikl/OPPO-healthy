package com.oplus.aiunit.vision;

import com.garmin.fit.Profile$Type;
import com.heytap.databaseengine.apiv3.data.Element;
import com.heytap.log.formatter.LogFieldKey;
import com.heytap.sports.record.details.bean.SportSummaryBean;

/* JADX INFO: loaded from: classes13.dex */
public class l8i extends bxb {
    public static final int AvgHeartRateFieldNum = 10;
    public static final int AvgSpeedFieldNum = 6;
    public static final int AvgVertSpeedFieldNum = 12;
    public static final int MaxHeartRateFieldNum = 11;
    public static final int MaxSpeedFieldNum = 7;
    public static final int MessageIndexFieldNum = 254;
    public static final int NumSplitsFieldNum = 3;
    public static final int SplitTypeFieldNum = 0;
    public static final int TotalAscentFieldNum = 8;
    public static final int TotalCaloriesFieldNum = 13;
    public static final int TotalDescentFieldNum = 9;
    public static final int TotalDistanceFieldNum = 5;
    public static final int TotalMovingTimeFieldNum = 77;
    public static final int TotalTimerTimeFieldNum = 4;
    public static final bxb h;

    static {
        bxb bxbVar = new bxb("split_summary", 313);
        h = bxbVar;
        bxbVar.e(new w97("message_index", 254, 132, 1.0d, 0.0d, "", false, Profile$Type.MESSAGE_INDEX));
        bxbVar.e(new w97("split_type", 0, 0, 1.0d, 0.0d, "", false, Profile$Type.SPLIT_TYPE));
        Profile$Type profile$Type = Profile$Type.UINT16;
        bxbVar.e(new w97("num_splits", 3, 132, 1.0d, 0.0d, "", false, profile$Type));
        Profile$Type profile$Type2 = Profile$Type.UINT32;
        bxbVar.e(new w97("total_timer_time", 4, 134, 1000.0d, 0.0d, "s", false, profile$Type2));
        bxbVar.e(new w97("total_distance", 5, 134, 100.0d, 0.0d, LogFieldKey.MESSAGE_KEY, false, profile$Type2));
        bxbVar.e(new w97(SportSummaryBean.AVG_SPEED, 6, 134, 1000.0d, 0.0d, "m/s", false, profile$Type2));
        bxbVar.e(new w97(SportSummaryBean.MAX_SPEED, 7, 134, 1000.0d, 0.0d, "m/s", false, profile$Type2));
        bxbVar.e(new w97("total_ascent", 8, 132, 1.0d, 0.0d, LogFieldKey.MESSAGE_KEY, false, profile$Type));
        bxbVar.e(new w97("total_descent", 9, 132, 1.0d, 0.0d, LogFieldKey.MESSAGE_KEY, false, profile$Type));
        Profile$Type profile$Type3 = Profile$Type.UINT8;
        bxbVar.e(new w97(Element.ELEMENT_NAME_AVG_HEART_RATE, 10, 2, 1.0d, 0.0d, "bpm", false, profile$Type3));
        bxbVar.e(new w97(Element.ELEMENT_NAME_MAX_HEART_RATE, 11, 2, 1.0d, 0.0d, "bpm", false, profile$Type3));
        bxbVar.e(new w97("avg_vert_speed", 12, 133, 1000.0d, 0.0d, "m/s", false, Profile$Type.SINT32));
        bxbVar.e(new w97("total_calories", 13, 134, 1.0d, 0.0d, "kcal", false, profile$Type2));
        bxbVar.e(new w97("total_moving_time", 77, 134, 1000.0d, 0.0d, "s", false, profile$Type2));
    }

    public l8i(bxb bxbVar) {
        super(bxbVar);
    }
}
