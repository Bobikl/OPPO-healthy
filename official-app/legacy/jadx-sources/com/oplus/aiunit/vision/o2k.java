package com.oplus.aiunit.vision;

import com.garmin.fit.Profile$Type;
import com.heytap.log.formatter.LogFieldKey;
import com.heytap.sports.record.details.bean.SportSummaryBean;

/* JADX INFO: loaded from: classes13.dex */
public class o2k extends bxb {
    public static final int ActiveTimeFieldNum = 6;
    public static final int CaloriesFieldNum = 2;
    public static final int DistanceFieldNum = 1;
    public static final int ElapsedTimeFieldNum = 4;
    public static final int MessageIndexFieldNum = 254;
    public static final int SessionsFieldNum = 5;
    public static final int SportFieldNum = 3;
    public static final int SportIndexFieldNum = 9;
    public static final int TimerTimeFieldNum = 0;
    public static final int TimestampFieldNum = 253;
    public static final bxb h;

    static {
        bxb bxbVar = new bxb("totals", 33);
        h = bxbVar;
        bxbVar.e(new w97("message_index", 254, 132, 1.0d, 0.0d, "", false, Profile$Type.MESSAGE_INDEX));
        bxbVar.e(new w97("timestamp", 253, 134, 1.0d, 0.0d, "s", false, Profile$Type.DATE_TIME));
        Profile$Type profile$Type = Profile$Type.UINT32;
        bxbVar.e(new w97("timer_time", 0, 134, 1.0d, 0.0d, "s", false, profile$Type));
        bxbVar.e(new w97("distance", 1, 134, 1.0d, 0.0d, LogFieldKey.MESSAGE_KEY, false, profile$Type));
        bxbVar.e(new w97(SportSummaryBean.CALORIES, 2, 134, 1.0d, 0.0d, "kcal", false, profile$Type));
        bxbVar.e(new w97("sport", 3, 0, 1.0d, 0.0d, "", false, Profile$Type.SPORT));
        bxbVar.e(new w97("elapsed_time", 4, 134, 1.0d, 0.0d, "s", false, profile$Type));
        bxbVar.e(new w97("sessions", 5, 132, 1.0d, 0.0d, "", false, Profile$Type.UINT16));
        bxbVar.e(new w97("active_time", 6, 134, 1.0d, 0.0d, "s", false, profile$Type));
        bxbVar.e(new w97("sport_index", 9, 2, 1.0d, 0.0d, "", false, Profile$Type.UINT8));
    }

    public o2k(bxb bxbVar) {
        super(bxbVar);
    }
}
