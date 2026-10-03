package com.oplus.weatherservicesdk.api;

import com.oplus.weatherservicesdk.data.Weather;
import java.util.ArrayList;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public interface IWeatherDailyForecast {

    public interface IResult {
        void onFail(String str);

        void onSuccess(Weather.City city, ArrayList<Weather.DailyForecast> arrayList);
    }

    Weather requestDailyForecast(IResult iResult);
}
