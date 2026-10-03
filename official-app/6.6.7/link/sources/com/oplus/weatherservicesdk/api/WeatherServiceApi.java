package com.oplus.weatherservicesdk.api;

import android.content.Context;
import com.oplus.weatherservicesdk.DebugLog;
import com.oplus.weatherservicesdk.api.caller.WeatherAlertCaller;
import com.oplus.weatherservicesdk.api.caller.WeatherObserveCaller;
import com.oplus.weatherservicesdk.api.caller.WeatherSummaryCaller;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public class WeatherServiceApi {
    private static final String TAG = "WeatherServiceApi";
    private Context context;
    private IWeatherAlert weatherAlert = null;
    private IWeatherObserve weatherObserve = null;
    private IWeatherSummary mWeatherSummary = null;

    public WeatherServiceApi(Context context) {
        this.context = context;
    }

    public void enableDebugModel(boolean z) {
        DebugLog.enableDebugMode(z);
    }

    public void release() {
        IWeatherAlert iWeatherAlert = this.weatherAlert;
        if (iWeatherAlert != null) {
            ((WeatherAlertCaller) iWeatherAlert).release();
            this.weatherAlert = null;
        }
        IWeatherObserve iWeatherObserve = this.weatherObserve;
        if (iWeatherObserve != null) {
            ((WeatherObserveCaller) iWeatherObserve).release();
            this.weatherObserve = null;
        }
        IWeatherSummary iWeatherSummary = this.mWeatherSummary;
        if (iWeatherSummary != null) {
            ((WeatherSummaryCaller) iWeatherSummary).release();
            this.mWeatherSummary = null;
        }
        this.context = null;
    }

    public IWeatherAlert weatherAlertClient(IWeatherNotify iWeatherNotify) {
        Context context = this.context;
        if (context == null) {
            DebugLog.e(TAG, "weather alert client error, context is null!");
            return null;
        }
        if (this.weatherAlert == null) {
            this.weatherAlert = new WeatherAlertCaller(context, iWeatherNotify);
        }
        return this.weatherAlert;
    }

    public IWeatherObserve weatherObserveClient(IWeatherNotify iWeatherNotify) {
        Context context = this.context;
        if (context == null) {
            DebugLog.e(TAG, "weather observe client error, context is null!");
            return null;
        }
        if (this.weatherObserve == null) {
            this.weatherObserve = new WeatherObserveCaller(context, iWeatherNotify);
        }
        return this.weatherObserve;
    }

    public IWeatherSummary weatherSummaryClient(IWeatherNotify iWeatherNotify) {
        Context context = this.context;
        if (context == null) {
            DebugLog.e(TAG, "weather observe client error, context is null!");
            return null;
        }
        if (this.mWeatherSummary == null) {
            this.mWeatherSummary = new WeatherSummaryCaller(context, iWeatherNotify);
        }
        return this.mWeatherSummary;
    }
}
