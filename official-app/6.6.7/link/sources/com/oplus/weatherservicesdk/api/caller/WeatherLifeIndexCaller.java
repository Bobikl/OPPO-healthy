package com.oplus.weatherservicesdk.api.caller;

import android.content.Context;
import com.oplus.aiunit.vision.d14;
import com.oplus.servicesdk.WeatherRequest;
import com.oplus.weatherservicesdk.BaseCallBack;
import com.oplus.weatherservicesdk.DebugLog;
import com.oplus.weatherservicesdk.api.IWeatherLifeIndex;
import com.oplus.weatherservicesdk.api.IWeatherNotify;
import com.oplus.weatherservicesdk.data.Weather;
import com.oplus.weatherservicesdk.service.WeatherBaseDataTask;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public class WeatherLifeIndexCaller extends BaseWeatherCaller implements IWeatherLifeIndex {
    private static final String METHOD_REQUEST = "requestLifeIndex";
    private static final String TAG = "WeatherLifeIndexObserveCaller";

    public WeatherLifeIndexCaller(Context context, IWeatherNotify iWeatherNotify) {
        super(context, iWeatherNotify);
    }

    @Override // com.oplus.weatherservicesdk.api.caller.BaseWeatherCaller
    public void release() {
        super.release();
    }

    @Override // com.oplus.weatherservicesdk.api.IWeatherLifeIndex
    public Weather requestLifeIndex(final IWeatherLifeIndex.IResult iResult) {
        Weather weather = new Weather();
        try {
            new WeatherBaseDataTask(Weather.class, this.context, new WeatherRequest().setRequestID(String.valueOf(System.currentTimeMillis())).setCallMethodName(METHOD_REQUEST).setPackageName(this.context.getPackageName()).setParams(null), (BaseCallBack) new BaseCallBack<Weather>() { // from class: com.oplus.weatherservicesdk.api.caller.WeatherLifeIndexCaller.1
                @Override // com.oplus.weatherservicesdk.BaseCallBack
                public void onFail(String str) {
                    DebugLog.d(WeatherLifeIndexCaller.TAG, "onFail:" + str + d14.SEMICOLON_REGEX + iResult);
                    IWeatherLifeIndex.IResult iResult2 = iResult;
                    if (iResult2 != null) {
                        iResult2.onFail(str);
                    }
                }

                @Override // com.oplus.weatherservicesdk.BaseCallBack
                public void onSuccess(Weather weather2) {
                    DebugLog.d(WeatherLifeIndexCaller.TAG, "onSucces callback:" + iResult);
                    IWeatherLifeIndex.IResult iResult2 = iResult;
                    if (iResult2 != null) {
                        if (weather2 != null) {
                            iResult2.onSuccess(weather2.city, weather2.lifeIndexArrayList);
                        } else {
                            iResult2.onSuccess(null, null);
                        }
                    }
                }
            }).startServiceRequest();
            weather.status = 0;
        } catch (Exception e) {
            DebugLog.e(TAG, "requestObserveWeather error:" + e.getMessage());
            if (iResult != null) {
                iResult.onFail(e.getMessage());
            }
        }
        return weather;
    }
}
