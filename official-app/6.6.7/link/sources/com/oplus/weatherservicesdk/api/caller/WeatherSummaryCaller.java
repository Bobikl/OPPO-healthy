package com.oplus.weatherservicesdk.api.caller;

import android.content.Context;
import com.oplus.aiunit.vision.d14;
import com.oplus.servicesdk.WeatherRequest;
import com.oplus.weatherservicesdk.BaseCallBack;
import com.oplus.weatherservicesdk.DebugLog;
import com.oplus.weatherservicesdk.api.IWeatherNotify;
import com.oplus.weatherservicesdk.api.IWeatherSummary;
import com.oplus.weatherservicesdk.data.Weather;
import com.oplus.weatherservicesdk.service.WeatherBaseDataTask;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public class WeatherSummaryCaller extends BaseWeatherCaller implements IWeatherSummary {
    private static final String METHOD_REQUEST = "requestWeatherSummary";
    private static final String TAG = "WeatherSummaryCaller";

    public WeatherSummaryCaller(Context context, IWeatherNotify iWeatherNotify) {
        super(context, iWeatherNotify);
    }

    @Override // com.oplus.weatherservicesdk.api.caller.BaseWeatherCaller
    public void release() {
        super.release();
    }

    @Override // com.oplus.weatherservicesdk.api.IWeatherSummary
    public Weather requestWeatherSummary(final IWeatherSummary.IResult iResult, int[] iArr, String str) {
        Weather weather = new Weather();
        try {
            ArrayList<String> arrayList = new ArrayList<>();
            arrayList.add(null);
            arrayList.add(Arrays.toString(iArr));
            arrayList.add(str);
            new WeatherBaseDataTask(Weather.class, this.context, new WeatherRequest().setRequestID(String.valueOf(System.currentTimeMillis())).setCallMethodName(METHOD_REQUEST).setPackageName(str).setParams(arrayList), (BaseCallBack) new BaseCallBack<Weather>() { // from class: com.oplus.weatherservicesdk.api.caller.WeatherSummaryCaller.1
                @Override // com.oplus.weatherservicesdk.BaseCallBack
                public void onFail(String str2) {
                    DebugLog.d(WeatherSummaryCaller.TAG, "onFail:" + str2 + d14.SEMICOLON_REGEX + iResult);
                    IWeatherSummary.IResult iResult2 = iResult;
                    if (iResult2 != null) {
                        iResult2.onFail(str2);
                    }
                }

                @Override // com.oplus.weatherservicesdk.BaseCallBack
                public void onSuccess(Weather weather2) {
                    DebugLog.d(WeatherSummaryCaller.TAG, "onSuccess callback:" + iResult);
                    DebugLog.ds(WeatherSummaryCaller.TAG, "onSuccess weather:" + weather2);
                    IWeatherSummary.IResult iResult2 = iResult;
                    if (iResult2 != null) {
                        if (weather2 == null) {
                            weather2 = null;
                        }
                        iResult2.onSuccess(weather2);
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
