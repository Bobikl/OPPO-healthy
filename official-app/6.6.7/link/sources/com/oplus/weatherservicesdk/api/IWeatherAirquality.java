package com.oplus.weatherservicesdk.api;

import com.oplus.weatherservicesdk.data.Weather;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public interface IWeatherAirquality {

    public interface IResult {
        void onFail(String str);

        void onSuccess(Weather.City city, Weather.AirQuality airQuality);
    }

    Weather requestAirquality(IResult iResult);
}
