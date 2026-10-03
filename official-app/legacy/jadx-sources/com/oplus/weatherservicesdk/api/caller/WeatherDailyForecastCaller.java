package com.oplus.weatherservicesdk.api.caller;

import android.content.Context;
import com.oplus.servicesdk.WeatherRequest;
import com.oplus.weatherservicesdk.BaseCallBack;
import com.oplus.weatherservicesdk.DebugLog;
import com.oplus.weatherservicesdk.api.IWeatherDailyForecast;
import com.oplus.weatherservicesdk.api.IWeatherNotify;
import com.oplus.weatherservicesdk.data.Weather;
import com.oplus.weatherservicesdk.service.WeatherBaseDataTask;

/* JADX INFO: loaded from: classes5.dex */
public class WeatherDailyForecastCaller extends BaseWeatherCaller implements IWeatherDailyForecast {
    private static final String METHOD_REQUEST = "requestDailyForecast";
    private static final String TAG = "WeatherDailyForecastCaller";

    public WeatherDailyForecastCaller(Context context, IWeatherNotify iWeatherNotify) {
        super(context, iWeatherNotify);
    }

    @Override // com.oplus.weatherservicesdk.api.caller.BaseWeatherCaller
    public void release() {
        super.release();
    }

    @Override // com.oplus.weatherservicesdk.api.IWeatherDailyForecast
    public Weather requestDailyForecast(final IWeatherDailyForecast.IResult iResult) {
        Weather weather = new Weather();
        try {
            new WeatherBaseDataTask(Weather.class, this.context, new WeatherRequest().setRequestID(String.valueOf(System.currentTimeMillis())).setCallMethodName(METHOD_REQUEST).setPackageName(this.context.getPackageName()).setParams(null), (BaseCallBack) new BaseCallBack<Weather>() { // from class: com.oplus.weatherservicesdk.api.caller.WeatherDailyForecastCaller.1
                @Override // com.oplus.weatherservicesdk.BaseCallBack
                public void onFail(String str) {
                    DebugLog.d(WeatherDailyForecastCaller.TAG, "onFail:" + str + ";" + iResult);
                    IWeatherDailyForecast.IResult iResult2 = iResult;
                    if (iResult2 != null) {
                        iResult2.onFail(str);
                    }
                }

                @Override // com.oplus.weatherservicesdk.BaseCallBack
                public void onSuccess(Weather weather2) {
                    DebugLog.d(WeatherDailyForecastCaller.TAG, "onSucces callback:" + iResult);
                    IWeatherDailyForecast.IResult iResult2 = iResult;
                    if (iResult2 != null) {
                        if (weather2 != null) {
                            iResult2.onSuccess(weather2.city, weather2.dailyForecastArrayList);
                        } else {
                            iResult2.onSuccess(null, null);
                        }
                    }
                }
            }).startServiceRequest();
            weather.status = 0;
        } catch (Exception e2) {
            DebugLog.e(TAG, "requestShortRain error:" + e2.getMessage());
            if (iResult != null) {
                iResult.onFail(e2.getMessage());
            }
        }
        return weather;
    }
}
