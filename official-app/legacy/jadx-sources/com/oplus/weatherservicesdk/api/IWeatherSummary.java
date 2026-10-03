package com.oplus.weatherservicesdk.api;

import com.oplus.weatherservicesdk.data.Weather;

/* JADX INFO: loaded from: classes5.dex */
public interface IWeatherSummary extends IWeatherBase {
    public static final int WEATHER_TYPE_AIR_QUALITY = 4;
    public static final int WEATHER_TYPE_ALERT = 5;
    public static final int WEATHER_TYPE_DAILY_FORECAST = 2;
    public static final int WEATHER_TYPE_HOURLY_FORECAST = 6;
    public static final int WEATHER_TYPE_LIFE_INDEX = 3;
    public static final int WEATHER_TYPE_OBSERVE = 1;
    public static final int WEATHER_TYPE_SHORT_RAIN = 7;
    public static final int WEATHER_TYPE_WEATHER_TIPS_EXPORT = 8;

    public interface IResult {
        void onFail(String str);

        void onSuccess(Weather weather);
    }

    Weather requestWeatherSummary(IResult iResult, int[] iArr, String str);
}
