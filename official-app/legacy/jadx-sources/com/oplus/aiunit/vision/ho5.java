package com.oplus.aiunit.vision;

import com.garmin.fit.Profile$Type;

/* JADX INFO: loaded from: classes13.dex */
public class ho5 extends bxb {
    public static final int ActiveTimeZoneFieldNum = 0;
    public static final int ActivityTrackerEnabledFieldNum = 36;
    public static final int AutoActivityDetectFieldNum = 90;
    public static final int AutoSyncFrequencyFieldNum = 89;
    public static final int AutosyncMinStepsFieldNum = 58;
    public static final int AutosyncMinTimeFieldNum = 59;
    public static final int BacklightModeFieldNum = 12;
    public static final int BleAutoUploadEnabledFieldNum = 86;
    public static final int ClockTimeFieldNum = 39;
    public static final int DateModeFieldNum = 47;
    public static final int DefaultPageFieldNum = 57;
    public static final int DisplayOrientationFieldNum = 55;
    public static final int LactateThresholdAutodetectEnabledFieldNum = 80;
    public static final int MountingSideFieldNum = 56;
    public static final int MoveAlertEnabledFieldNum = 46;
    public static final int NumberOfScreensFieldNum = 94;
    public static final int PagesEnabledFieldNum = 40;
    public static final int SmartNotificationDisplayOrientationFieldNum = 95;
    public static final int TapInterfaceFieldNum = 134;
    public static final int TapSensitivityFieldNum = 174;
    public static final int TimeModeFieldNum = 4;
    public static final int TimeOffsetFieldNum = 2;
    public static final int TimeZoneOffsetFieldNum = 5;
    public static final int UtcOffsetFieldNum = 1;
    public static final bxb h;

    static {
        bxb bxbVar = new bxb("device_settings", 2);
        h = bxbVar;
        Profile$Type profile$Type = Profile$Type.UINT8;
        bxbVar.e(new w97("active_time_zone", 0, 2, 1.0d, 0.0d, "", false, profile$Type));
        Profile$Type profile$Type2 = Profile$Type.UINT32;
        bxbVar.e(new w97("utc_offset", 1, 134, 1.0d, 0.0d, "", false, profile$Type2));
        bxbVar.e(new w97("time_offset", 2, 134, 1.0d, 0.0d, "s", false, profile$Type2));
        bxbVar.e(new w97("time_mode", 4, 0, 1.0d, 0.0d, "", false, Profile$Type.TIME_MODE));
        bxbVar.e(new w97("time_zone_offset", 5, 1, 4.0d, 0.0d, "hr", false, Profile$Type.SINT8));
        bxbVar.e(new w97("backlight_mode", 12, 0, 1.0d, 0.0d, "", false, Profile$Type.BACKLIGHT_MODE));
        Profile$Type profile$Type3 = Profile$Type.BOOL;
        bxbVar.e(new w97("activity_tracker_enabled", 36, 0, 1.0d, 0.0d, "", false, profile$Type3));
        bxbVar.e(new w97("clock_time", 39, 134, 1.0d, 0.0d, "", false, Profile$Type.DATE_TIME));
        Profile$Type profile$Type4 = Profile$Type.UINT16;
        bxbVar.e(new w97("pages_enabled", 40, 132, 1.0d, 0.0d, "", false, profile$Type4));
        bxbVar.e(new w97("move_alert_enabled", 46, 0, 1.0d, 0.0d, "", false, profile$Type3));
        bxbVar.e(new w97("date_mode", 47, 0, 1.0d, 0.0d, "", false, Profile$Type.DATE_MODE));
        Profile$Type profile$Type5 = Profile$Type.DISPLAY_ORIENTATION;
        bxbVar.e(new w97("display_orientation", 55, 0, 1.0d, 0.0d, "", false, profile$Type5));
        bxbVar.e(new w97("mounting_side", 56, 0, 1.0d, 0.0d, "", false, Profile$Type.SIDE));
        bxbVar.e(new w97("default_page", 57, 132, 1.0d, 0.0d, "", false, profile$Type4));
        bxbVar.e(new w97("autosync_min_steps", 58, 132, 1.0d, 0.0d, "steps", false, profile$Type4));
        bxbVar.e(new w97("autosync_min_time", 59, 132, 1.0d, 0.0d, "minutes", false, profile$Type4));
        bxbVar.e(new w97("lactate_threshold_autodetect_enabled", 80, 0, 1.0d, 0.0d, "", false, profile$Type3));
        bxbVar.e(new w97("ble_auto_upload_enabled", 86, 0, 1.0d, 0.0d, "", false, profile$Type3));
        bxbVar.e(new w97("auto_sync_frequency", 89, 0, 1.0d, 0.0d, "", false, Profile$Type.AUTO_SYNC_FREQUENCY));
        bxbVar.e(new w97("auto_activity_detect", 90, 134, 1.0d, 0.0d, "", false, Profile$Type.AUTO_ACTIVITY_DETECT));
        bxbVar.e(new w97("number_of_screens", 94, 2, 1.0d, 0.0d, "", false, profile$Type));
        bxbVar.e(new w97("smart_notification_display_orientation", 95, 0, 1.0d, 0.0d, "", false, profile$Type5));
        bxbVar.e(new w97("tap_interface", 134, 0, 1.0d, 0.0d, "", false, Profile$Type.SWITCH));
        bxbVar.e(new w97("tap_sensitivity", 174, 0, 1.0d, 0.0d, "", false, Profile$Type.TAP_SENSITIVITY));
    }

    public ho5(bxb bxbVar) {
        super(bxbVar);
    }
}
