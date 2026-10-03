package com.oplus.weatherservicesdk.api;

import com.oplus.weatherservicesdk.data.Weather;
import java.util.List;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public interface IWeatherAlert {

    public interface IResult {
        void onFail(String str);

        void onSuccess(Weather.City city, List<Weather.Alert> list);
    }

    Weather requestWeatherAlert(IResult iResult);

    int updateWeatherAlert();
}
