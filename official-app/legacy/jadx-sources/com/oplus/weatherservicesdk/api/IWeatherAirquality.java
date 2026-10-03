package com.oplus.weatherservicesdk.api;

import com.oplus.weatherservicesdk.data.Weather;

/* JADX INFO: loaded from: classes5.dex */
public interface IWeatherAirquality {

    public interface IResult {
        void onFail(String str);

        void onSuccess(Weather.City city, Weather.AirQuality airQuality);
    }

    Weather requestAirquality(IResult iResult);
}
