package com.oplus.weatherservicesdk.api;

import com.oplus.weatherservicesdk.data.Weather;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
public interface IWeatherDailyForecast {

    public interface IResult {
        void onFail(String str);

        void onSuccess(Weather.City city, ArrayList<Weather.DailyForecast> arrayList);
    }

    Weather requestDailyForecast(IResult iResult);
}
