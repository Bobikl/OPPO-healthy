package com.oplus.aiunit.vision;

import com.garmin.fit.Profile$Type;

/* JADX INFO: loaded from: classes13.dex */
public class qkl extends bxb {
    public static final int ConditionFieldNum = 2;
    public static final int DayOfWeekFieldNum = 12;
    public static final int HighTemperatureFieldNum = 13;
    public static final int LocationFieldNum = 8;
    public static final int LowTemperatureFieldNum = 14;
    public static final int ObservedAtTimeFieldNum = 9;
    public static final int ObservedLocationLatFieldNum = 10;
    public static final int ObservedLocationLongFieldNum = 11;
    public static final int PrecipitationProbabilityFieldNum = 5;
    public static final int RelativeHumidityFieldNum = 7;
    public static final int TemperatureFeelsLikeFieldNum = 6;
    public static final int TemperatureFieldNum = 1;
    public static final int TimestampFieldNum = 253;
    public static final int WeatherReportFieldNum = 0;
    public static final int WindDirectionFieldNum = 3;
    public static final int WindSpeedFieldNum = 4;
    public static final bxb h;

    static {
        bxb bxbVar = new bxb("weather_conditions", 128);
        h = bxbVar;
        Profile$Type profile$Type = Profile$Type.DATE_TIME;
        bxbVar.e(new w97("timestamp", 253, 134, 1.0d, 0.0d, "", false, profile$Type));
        bxbVar.e(new w97("weather_report", 0, 0, 1.0d, 0.0d, "", false, Profile$Type.WEATHER_REPORT));
        Profile$Type profile$Type2 = Profile$Type.SINT8;
        bxbVar.e(new w97("temperature", 1, 1, 1.0d, 0.0d, "C", false, profile$Type2));
        bxbVar.e(new w97("condition", 2, 0, 1.0d, 0.0d, "", false, Profile$Type.WEATHER_STATUS));
        Profile$Type profile$Type3 = Profile$Type.UINT16;
        bxbVar.e(new w97("wind_direction", 3, 132, 1.0d, 0.0d, "degrees", false, profile$Type3));
        bxbVar.e(new w97("wind_speed", 4, 132, 1000.0d, 0.0d, "m/s", false, profile$Type3));
        Profile$Type profile$Type4 = Profile$Type.UINT8;
        bxbVar.e(new w97("precipitation_probability", 5, 2, 1.0d, 0.0d, "", false, profile$Type4));
        bxbVar.e(new w97("temperature_feels_like", 6, 1, 1.0d, 0.0d, "C", false, profile$Type2));
        bxbVar.e(new w97("relative_humidity", 7, 2, 1.0d, 0.0d, "", false, profile$Type4));
        bxbVar.e(new w97("location", 8, 7, 1.0d, 0.0d, "", false, Profile$Type.STRING));
        bxbVar.e(new w97("observed_at_time", 9, 134, 1.0d, 0.0d, "", false, profile$Type));
        Profile$Type profile$Type5 = Profile$Type.SINT32;
        bxbVar.e(new w97("observed_location_lat", 10, 133, 1.0d, 0.0d, "semicircles", false, profile$Type5));
        bxbVar.e(new w97("observed_location_long", 11, 133, 1.0d, 0.0d, "semicircles", false, profile$Type5));
        bxbVar.e(new w97("day_of_week", 12, 0, 1.0d, 0.0d, "", false, Profile$Type.DAY_OF_WEEK));
        bxbVar.e(new w97("high_temperature", 13, 1, 1.0d, 0.0d, "C", false, profile$Type2));
        bxbVar.e(new w97("low_temperature", 14, 1, 1.0d, 0.0d, "C", false, profile$Type2));
    }

    public qkl(bxb bxbVar) {
        super(bxbVar);
    }
}
