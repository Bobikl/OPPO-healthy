package com.oplus.aiunit.vision;

import com.garmin.fit.Profile$Type;
import com.heytap.log.formatter.LogFieldKey;
import com.heytap.sports.record.details.bean.SportSummaryBean;
import com.oplus.deepthinker.sdk.app.awareness.capability.impl.ActivityRecognizeEvent;

/* JADX INFO: loaded from: classes13.dex */
public class i3c extends bxb {
    public static final int ActiveCaloriesFieldNum = 19;
    public static final int ActiveTime16FieldNum = 10;
    public static final int ActiveTimeFieldNum = 4;
    public static final int ActivityLevelFieldNum = 7;
    public static final int ActivitySubtypeFieldNum = 6;
    public static final int ActivityTimeFieldNum = 16;
    public static final int ActivityTypeFieldNum = 5;
    public static final int AscentFieldNum = 31;
    public static final int CaloriesFieldNum = 1;
    public static final int CurrentActivityTypeIntensityFieldNum = 24;
    public static final int Cycles16FieldNum = 9;
    public static final int CyclesFieldNum = 3;
    public static final int DescentFieldNum = 32;
    public static final int DeviceIndexFieldNum = 0;
    public static final int Distance16FieldNum = 8;
    public static final int DistanceFieldNum = 2;
    public static final int DurationFieldNum = 30;
    public static final int DurationMinFieldNum = 29;
    public static final int HeartRateFieldNum = 27;
    public static final int IntensityFieldNum = 28;
    public static final int LocalTimestampFieldNum = 11;
    public static final int ModerateActivityMinutesFieldNum = 33;
    public static final int TemperatureFieldNum = 12;
    public static final int TemperatureMaxFieldNum = 15;
    public static final int TemperatureMinFieldNum = 14;
    public static final int Timestamp16FieldNum = 26;
    public static final int TimestampFieldNum = 253;
    public static final int TimestampMin8FieldNum = 25;
    public static final int VigorousActivityMinutesFieldNum = 34;
    public static final bxb h;

    static {
        bxb bxbVar = new bxb("monitoring", 55);
        h = bxbVar;
        bxbVar.e(new w97("timestamp", 253, 134, 1.0d, 0.0d, "s", false, Profile$Type.DATE_TIME));
        bxbVar.e(new w97("device_index", 0, 2, 1.0d, 0.0d, "", false, Profile$Type.DEVICE_INDEX));
        Profile$Type profile$Type = Profile$Type.UINT16;
        bxbVar.e(new w97(SportSummaryBean.CALORIES, 1, 132, 1.0d, 0.0d, "kcal", false, profile$Type));
        Profile$Type profile$Type2 = Profile$Type.UINT32;
        bxbVar.e(new w97("distance", 2, 134, 100.0d, 0.0d, LogFieldKey.MESSAGE_KEY, false, profile$Type2));
        bxbVar.e(new w97("cycles", 3, 134, 2.0d, 0.0d, "cycles", false, profile$Type2));
        bxbVar.d.get(4).k.add(new p2j("steps", 134, 1.0d, 0.0d, "steps"));
        bxbVar.d.get(4).k.get(0).b(5, 6L);
        bxbVar.d.get(4).k.get(0).b(5, 1L);
        bxbVar.d.get(4).k.add(new p2j("strokes", 134, 2.0d, 0.0d, "strokes"));
        bxbVar.d.get(4).k.get(1).b(5, 2L);
        bxbVar.d.get(4).k.get(1).b(5, 5L);
        bxbVar.e(new w97("active_time", 4, 134, 1000.0d, 0.0d, "s", false, profile$Type2));
        bxbVar.e(new w97(ActivityRecognizeEvent.BUNDLE_KEY_ACTIVITY_TYPE, 5, 0, 1.0d, 0.0d, "", false, Profile$Type.ACTIVITY_TYPE));
        bxbVar.e(new w97("activity_subtype", 6, 0, 1.0d, 0.0d, "", false, Profile$Type.ACTIVITY_SUBTYPE));
        bxbVar.e(new w97("activity_level", 7, 0, 1.0d, 0.0d, "", false, Profile$Type.ACTIVITY_LEVEL));
        bxbVar.e(new w97("distance_16", 8, 132, 1.0d, 0.0d, "100 * m", false, profile$Type));
        bxbVar.e(new w97("cycles_16", 9, 132, 1.0d, 0.0d, "2 * cycles (steps)", false, profile$Type));
        bxbVar.e(new w97("active_time_16", 10, 132, 1.0d, 0.0d, "s", false, profile$Type));
        bxbVar.e(new w97("local_timestamp", 11, 134, 1.0d, 0.0d, "", false, Profile$Type.LOCAL_DATE_TIME));
        Profile$Type profile$Type3 = Profile$Type.SINT16;
        bxbVar.e(new w97("temperature", 12, 131, 100.0d, 0.0d, "C", false, profile$Type3));
        bxbVar.e(new w97("temperature_min", 14, 131, 100.0d, 0.0d, "C", false, profile$Type3));
        bxbVar.e(new w97("temperature_max", 15, 131, 100.0d, 0.0d, "C", false, profile$Type3));
        bxbVar.e(new w97("activity_time", 16, 132, 1.0d, 0.0d, "minutes", false, profile$Type));
        bxbVar.e(new w97("active_calories", 19, 132, 1.0d, 0.0d, "kcal", false, profile$Type));
        bxbVar.e(new w97("current_activity_type_intensity", 24, 13, 1.0d, 0.0d, "", false, Profile$Type.BYTE));
        bxbVar.d.get(18).f18167j.add(new da7(5, false, 5, 1.0d, 0.0d));
        bxbVar.d.get(18).f18167j.add(new da7(28, false, 3, 1.0d, 0.0d));
        Profile$Type profile$Type4 = Profile$Type.UINT8;
        bxbVar.e(new w97("timestamp_min_8", 25, 2, 1.0d, 0.0d, "min", false, profile$Type4));
        bxbVar.e(new w97("timestamp_16", 26, 132, 1.0d, 0.0d, "s", false, profile$Type));
        bxbVar.e(new w97("heart_rate", 27, 2, 1.0d, 0.0d, "bpm", false, profile$Type4));
        bxbVar.e(new w97("intensity", 28, 2, 10.0d, 0.0d, "", false, profile$Type4));
        bxbVar.e(new w97("duration_min", 29, 132, 1.0d, 0.0d, "min", false, profile$Type));
        bxbVar.e(new w97("duration", 30, 134, 1.0d, 0.0d, "s", false, profile$Type2));
        bxbVar.e(new w97("ascent", 31, 134, 1000.0d, 0.0d, LogFieldKey.MESSAGE_KEY, false, profile$Type2));
        bxbVar.e(new w97("descent", 32, 134, 1000.0d, 0.0d, LogFieldKey.MESSAGE_KEY, false, profile$Type2));
        bxbVar.e(new w97("moderate_activity_minutes", 33, 132, 1.0d, 0.0d, "minutes", false, profile$Type));
        bxbVar.e(new w97("vigorous_activity_minutes", 34, 132, 1.0d, 0.0d, "minutes", false, profile$Type));
    }

    public i3c(bxb bxbVar) {
        super(bxbVar);
    }
}
