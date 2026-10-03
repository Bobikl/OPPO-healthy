package com.oplus.weatherservicesdk.api.caller;

import android.content.Context;
import com.oplus.aiunit.vision.d14;
import com.oplus.servicesdk.WeatherRequest;
import com.oplus.weatherservicesdk.BaseCallBack;
import com.oplus.weatherservicesdk.DebugLog;
import com.oplus.weatherservicesdk.api.IWeatherHourlyForecast;
import com.oplus.weatherservicesdk.api.IWeatherNotify;
import com.oplus.weatherservicesdk.data.Weather;
import com.oplus.weatherservicesdk.service.WeatherBaseDataTask;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public class WeatherHourlyForecastCaller extends BaseWeatherCaller implements IWeatherHourlyForecast {
    private static final String METHOD_REQUEST = "requestHourlyForecast";
    private static final String TAG = "WeatherHourlyForecastCaller";

    public WeatherHourlyForecastCaller(Context context, IWeatherNotify iWeatherNotify) {
        super(context, iWeatherNotify);
    }

    @Override // com.oplus.weatherservicesdk.api.caller.BaseWeatherCaller
    public void release() {
        super.release();
    }

    @Override // com.oplus.weatherservicesdk.api.IWeatherHourlyForecast
    public Weather requestHourlyForecast(final IWeatherHourlyForecast.IResult iResult) {
        Weather weather = new Weather();
        try {
            new WeatherBaseDataTask(Weather.class, this.context, new WeatherRequest().setRequestID(String.valueOf(System.currentTimeMillis())).setCallMethodName(METHOD_REQUEST).setPackageName(this.context.getPackageName()).setParams(null), (BaseCallBack) new BaseCallBack<Weather>() { // from class: com.oplus.weatherservicesdk.api.caller.WeatherHourlyForecastCaller.1
                @Override // com.oplus.weatherservicesdk.BaseCallBack
                public void onFail(String str) {
                    DebugLog.d(WeatherHourlyForecastCaller.TAG, "onFail:" + str + d14.SEMICOLON_REGEX + iResult);
                    IWeatherHourlyForecast.IResult iResult2 = iResult;
                    if (iResult2 != null) {
                        iResult2.onFail(str);
                    }
                }

                @Override // com.oplus.weatherservicesdk.BaseCallBack
                public void onSuccess(Weather weather2) {
                    DebugLog.d(WeatherHourlyForecastCaller.TAG, "onSucces callback:" + iResult);
                    IWeatherHourlyForecast.IResult iResult2 = iResult;
                    if (iResult2 != null) {
                        if (weather2 != null) {
                            iResult2.onSuccess(weather2.city, weather2.hourlyForecastWeatherArrayList);
                        } else {
                            iResult2.onSuccess(null, null);
                        }
                    }
                }
            }).startServiceRequest();
            weather.status = 0;
        } catch (Exception e) {
            DebugLog.e(TAG, "requestShortRain error:" + e.getMessage());
            if (iResult != null) {
                iResult.onFail(e.getMessage());
            }
        }
        return weather;
    }
}
