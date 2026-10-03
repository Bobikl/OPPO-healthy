package com.oplus.weatherservicesdk.api;

import com.oplus.weatherservicesdk.data.Weather;

/* JADX INFO: loaded from: classes5.dex */
public interface IWeatherShortRain {

    public interface IResult {
        void onFail(String str);

        void onSuccess(Weather.City city, Weather.ShortRain shortRain);
    }

    Weather requestShortRain(IResult iResult);
}
