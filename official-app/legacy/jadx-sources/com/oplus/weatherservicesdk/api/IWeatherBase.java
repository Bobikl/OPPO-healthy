package com.oplus.weatherservicesdk.api;

/* JADX INFO: loaded from: classes5.dex */
public interface IWeatherBase {
    public static final int FAILED = -1;
    public static final int SUCCESS = 0;

    int updateLocalSummaryWeather(String str);

    int updateLocalWeather();
}
