package com.oplus.aiunit.vision;

import com.garmin.fit.Profile$Type;

/* JADX INFO: loaded from: classes13.dex */
public class uz3 extends bxb {
    public static final int AntEnabledFieldNum = 2;
    public static final int AutoActivityUploadEnabledFieldNum = 7;
    public static final int BluetoothEnabledFieldNum = 0;
    public static final int BluetoothLeEnabledFieldNum = 1;
    public static final int CourseDownloadEnabledFieldNum = 8;
    public static final int GpsEphemerisDownloadEnabledFieldNum = 10;
    public static final int GrouptrackEnabledFieldNum = 12;
    public static final int IncidentDetectionEnabledFieldNum = 11;
    public static final int LiveTrackingEnabledFieldNum = 4;
    public static final int NameFieldNum = 3;
    public static final int WeatherAlertsEnabledFieldNum = 6;
    public static final int WeatherConditionsEnabledFieldNum = 5;
    public static final int WorkoutDownloadEnabledFieldNum = 9;
    public static final bxb h;

    static {
        bxb bxbVar = new bxb("connectivity", 127);
        h = bxbVar;
        Profile$Type profile$Type = Profile$Type.BOOL;
        bxbVar.e(new w97("bluetooth_enabled", 0, 0, 1.0d, 0.0d, "", false, profile$Type));
        bxbVar.e(new w97("bluetooth_le_enabled", 1, 0, 1.0d, 0.0d, "", false, profile$Type));
        bxbVar.e(new w97("ant_enabled", 2, 0, 1.0d, 0.0d, "", false, profile$Type));
        bxbVar.e(new w97("name", 3, 7, 1.0d, 0.0d, "", false, Profile$Type.STRING));
        bxbVar.e(new w97("live_tracking_enabled", 4, 0, 1.0d, 0.0d, "", false, profile$Type));
        bxbVar.e(new w97("weather_conditions_enabled", 5, 0, 1.0d, 0.0d, "", false, profile$Type));
        bxbVar.e(new w97("weather_alerts_enabled", 6, 0, 1.0d, 0.0d, "", false, profile$Type));
        bxbVar.e(new w97("auto_activity_upload_enabled", 7, 0, 1.0d, 0.0d, "", false, profile$Type));
        bxbVar.e(new w97("course_download_enabled", 8, 0, 1.0d, 0.0d, "", false, profile$Type));
        bxbVar.e(new w97("workout_download_enabled", 9, 0, 1.0d, 0.0d, "", false, profile$Type));
        bxbVar.e(new w97("gps_ephemeris_download_enabled", 10, 0, 1.0d, 0.0d, "", false, profile$Type));
        bxbVar.e(new w97("incident_detection_enabled", 11, 0, 1.0d, 0.0d, "", false, profile$Type));
        bxbVar.e(new w97("grouptrack_enabled", 12, 0, 1.0d, 0.0d, "", false, profile$Type));
    }

    public uz3(bxb bxbVar) {
        super(bxbVar);
    }
}
