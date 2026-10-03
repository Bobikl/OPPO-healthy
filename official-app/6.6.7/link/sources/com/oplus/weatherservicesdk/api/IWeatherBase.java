package com.oplus.weatherservicesdk.api;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public interface IWeatherBase {
    public static final int FAILED = -1;
    public static final int SUCCESS = 0;

    int updateLocalSummaryWeather(String str);

    int updateLocalWeather();
}
