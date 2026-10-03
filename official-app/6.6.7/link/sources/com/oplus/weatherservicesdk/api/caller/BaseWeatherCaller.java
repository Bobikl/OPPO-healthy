package com.oplus.weatherservicesdk.api.caller;

import android.content.Context;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;
import com.oplus.servicesdk.WeatherRequest;
import com.oplus.weatherservicesdk.BaseCallBack;
import com.oplus.weatherservicesdk.DebugLog;
import com.oplus.weatherservicesdk.api.IWeatherBase;
import com.oplus.weatherservicesdk.api.IWeatherNotify;
import com.oplus.weatherservicesdk.service.WeatherBaseDataTask;
import java.util.ArrayList;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public class BaseWeatherCaller implements IWeatherBase {
    private static final String METHOD_UPDATE_SUMMARY_WEATHER = "updateLocalSummaryWeather";
    private static final String METHOD_UPDATE_WEATHER = "updateLocalWeather";
    private static final String NOTIFY_URI = "content://com.oplusos.weather.service.provider.data/oplus_weather_info";
    private static final String TAG = "BaseWeatherCaller";
    protected Context context;
    protected ContentObserver mObserver;

    public BaseWeatherCaller(Context context, IWeatherNotify iWeatherNotify) {
        this.context = context;
        registerListener(NOTIFY_URI, iWeatherNotify);
    }

    private void registerListener(String str, final IWeatherNotify iWeatherNotify) {
        if (iWeatherNotify != null) {
            try {
                this.mObserver = new ContentObserver(new Handler()) { // from class: com.oplus.weatherservicesdk.api.caller.BaseWeatherCaller.1
                    @Override // android.database.ContentObserver
                    public void onChange(boolean z) {
                        super.onChange(z);
                        iWeatherNotify.onChanged();
                    }
                };
                this.context.getContentResolver().registerContentObserver(Uri.parse(str), false, this.mObserver);
            } catch (Exception e) {
                DebugLog.e(TAG, "register error:" + e.getMessage());
                this.mObserver = null;
            }
        }
    }

    public void release() {
        DebugLog.i(TAG, "release:" + this.mObserver);
        if (this.mObserver != null) {
            this.context.getContentResolver().unregisterContentObserver(this.mObserver);
            this.mObserver = null;
        }
        this.context = null;
    }

    @Override // com.oplus.weatherservicesdk.api.IWeatherBase
    public int updateLocalSummaryWeather(String str) {
        try {
            ArrayList<String> arrayList = new ArrayList<>();
            arrayList.add(str);
            new WeatherBaseDataTask(Integer.TYPE, this.context, new WeatherRequest().setRequestID(String.valueOf(System.currentTimeMillis())).setCallMethodName(METHOD_UPDATE_SUMMARY_WEATHER).setPackageName(str).setParams(arrayList), (BaseCallBack) null).startServiceRequest();
            return 0;
        } catch (Exception e) {
            DebugLog.e(TAG, "updateLocalWeather error:" + e.getMessage());
            return -1;
        }
    }

    @Override // com.oplus.weatherservicesdk.api.IWeatherBase
    public int updateLocalWeather() {
        try {
            new WeatherBaseDataTask(Integer.TYPE, this.context, new WeatherRequest().setRequestID(String.valueOf(System.currentTimeMillis())).setCallMethodName(METHOD_UPDATE_WEATHER).setPackageName(this.context.getPackageName()).setParams(null), (BaseCallBack) null).startServiceRequest();
            return 0;
        } catch (Exception e) {
            DebugLog.e(TAG, "updateLocalWeather error:" + e.getMessage());
            return -1;
        }
    }
}
