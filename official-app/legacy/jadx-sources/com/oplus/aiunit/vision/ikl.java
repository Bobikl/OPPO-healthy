package com.oplus.aiunit.vision;

import com.garmin.fit.Profile$Type;

/* JADX INFO: loaded from: classes13.dex */
public class ikl extends bxb {
    public static final int ExpireTimeFieldNum = 2;
    public static final int IssueTimeFieldNum = 1;
    public static final int ReportIdFieldNum = 0;
    public static final int SeverityFieldNum = 3;
    public static final int TimestampFieldNum = 253;
    public static final int TypeFieldNum = 4;
    public static final bxb h;

    static {
        bxb bxbVar = new bxb("weather_alert", 129);
        h = bxbVar;
        Profile$Type profile$Type = Profile$Type.DATE_TIME;
        bxbVar.e(new w97("timestamp", 253, 134, 1.0d, 0.0d, "", false, profile$Type));
        bxbVar.e(new w97("report_id", 0, 7, 1.0d, 0.0d, "", false, Profile$Type.STRING));
        bxbVar.e(new w97("issue_time", 1, 134, 1.0d, 0.0d, "", false, profile$Type));
        bxbVar.e(new w97(com.coloros.sceneservice.e.b.Oa, 2, 134, 1.0d, 0.0d, "", false, profile$Type));
        bxbVar.e(new w97("severity", 3, 0, 1.0d, 0.0d, "", false, Profile$Type.WEATHER_SEVERITY));
        bxbVar.e(new w97("type", 4, 0, 1.0d, 0.0d, "", false, Profile$Type.WEATHER_SEVERE_TYPE));
    }

    public ikl(bxb bxbVar) {
        super(bxbVar);
    }
}
