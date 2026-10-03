package com.oplus.aiunit.vision;

import com.garmin.fit.Profile$Type;
import com.heytap.sports.record.details.bean.SportSummaryBean;

/* JADX INFO: loaded from: classes13.dex */
public class kzb extends bxb {
    public static final int CaloriesFieldNum = 2;
    public static final int FatCaloriesFieldNum = 3;
    public static final int HighBpmFieldNum = 1;
    public static final int MessageIndexFieldNum = 254;
    public static final bxb h;

    static {
        bxb bxbVar = new bxb("met_zone", 10);
        h = bxbVar;
        bxbVar.e(new w97("message_index", 254, 132, 1.0d, 0.0d, "", false, Profile$Type.MESSAGE_INDEX));
        Profile$Type profile$Type = Profile$Type.UINT8;
        bxbVar.e(new w97("high_bpm", 1, 2, 1.0d, 0.0d, "", false, profile$Type));
        bxbVar.e(new w97(SportSummaryBean.CALORIES, 2, 132, 10.0d, 0.0d, "kcal / min", false, Profile$Type.UINT16));
        bxbVar.e(new w97("fat_calories", 3, 2, 10.0d, 0.0d, "kcal / min", false, profile$Type));
    }

    public kzb(bxb bxbVar) {
        super(bxbVar);
    }
}
