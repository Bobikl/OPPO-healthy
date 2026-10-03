package com.oplus.weatherservicesdk.api.caller;

import android.content.Context;
import com.oplus.servicesdk.WeatherRequest;
import com.oplus.weatherservicesdk.BaseCallBack;
import com.oplus.weatherservicesdk.DebugLog;
import com.oplus.weatherservicesdk.api.IWeatherNotify;
import com.oplus.weatherservicesdk.api.IWeatherObserve;
import com.oplus.weatherservicesdk.data.Weather;
import com.oplus.weatherservicesdk.service.WeatherBaseDataTask;

/* JADX INFO: loaded from: classes5.dex */
public class WeatherObserveCaller extends BaseWeatherCaller implements IWeatherObserve {
    private static final String METHOD_REQUEST = "requestObserveWeather";
    private static final String NOTIFY_URI = "content://com.oplusos.weather.service.provider.data/oplus_weather_info";
    private static final String TAG = "WeatherObserveCaller";

    public WeatherObserveCaller(Context context, IWeatherNotify iWeatherNotify) {
        super(context, iWeatherNotify);
    }

    @Override // com.oplus.weatherservicesdk.api.caller.BaseWeatherCaller
    public void release() {
        super.release();
    }

    @Override // com.oplus.weatherservicesdk.api.IWeatherObserve
    public Weather requestObserveWeather(final IWeatherObserve.IResult iResult) {
        Weather weather = new Weather();
        try {
            new WeatherBaseDataTask(Weather.class, this.context, new WeatherRequest().setRequestID(String.valueOf(System.currentTimeMillis())).setCallMethodName(METHOD_REQUEST).setPackageName(this.context.getPackageName()).setParams(null), (BaseCallBack) new BaseCallBack<Weather>() { // from class: com.oplus.weatherservicesdk.api.caller.WeatherObserveCaller.1
                @Override // com.oplus.weatherservicesdk.BaseCallBack
                public void onFail(String str) {
                    DebugLog.d(WeatherObserveCaller.TAG, "onFail:" + str + ";" + iResult);
                    IWeatherObserve.IResult iResult2 = iResult;
                    if (iResult2 != null) {
                        iResult2.onFail(str);
                    }
                }

                @Override // com.oplus.weatherservicesdk.BaseCallBack
                public void onSuccess(Weather weather2) {
                    DebugLog.d(WeatherObserveCaller.TAG, "onSucces callback:" + iResult);
                    IWeatherObserve.IResult iResult2 = iResult;
                    if (iResult2 != null) {
                        if (weather2 != null) {
                            iResult2.onSuccess(weather2.city, weather2.observeWeather);
                        } else {
                            iResult2.onSuccess(null, null);
                        }
                    }
                }
            }).startServiceRequest();
            weather.status = 0;
        } catch (Exception e2) {
            DebugLog.e(TAG, "requestObserveWeather error:" + e2.getMessage());
            if (iResult != null) {
                iResult.onFail(e2.getMessage());
            }
        }
        return weather;
    }
}
