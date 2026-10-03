package com.oplus.weatherservicesdk.api;

import com.oplus.weatherservicesdk.data.Weather;

/* JADX INFO: loaded from: classes5.dex */
public interface IWeatherObserve extends IWeatherBase {

    public interface IResult {
        void onFail(String str);

        void onSuccess(Weather.City city, Weather.ObserveWeather observeWeather);
    }

    Weather requestObserveWeather(IResult iResult);
}
