package com.oplus.weatherservicesdk.api;

import com.oplus.weatherservicesdk.data.Weather;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
public interface IWeatherHourlyForecast {

    public interface IResult {
        void onFail(String str);

        void onSuccess(Weather.City city, ArrayList<Weather.HourlyForecast> arrayList);
    }

    Weather requestHourlyForecast(IResult iResult);
}
