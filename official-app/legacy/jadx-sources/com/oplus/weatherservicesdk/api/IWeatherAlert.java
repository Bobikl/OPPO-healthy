package com.oplus.weatherservicesdk.api;

import com.oplus.weatherservicesdk.data.Weather;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public interface IWeatherAlert {

    public interface IResult {
        void onFail(String str);

        void onSuccess(Weather.City city, List<Weather.Alert> list);
    }

    Weather requestWeatherAlert(IResult iResult);

    int updateWeatherAlert();
}
