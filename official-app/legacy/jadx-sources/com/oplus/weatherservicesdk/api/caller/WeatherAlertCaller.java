package com.oplus.weatherservicesdk.api.caller;

import android.content.Context;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;
import com.oplus.servicesdk.WeatherRequest;
import com.oplus.weatherservicesdk.BaseCallBack;
import com.oplus.weatherservicesdk.DebugLog;
import com.oplus.weatherservicesdk.api.IWeatherAlert;
import com.oplus.weatherservicesdk.api.IWeatherNotify;
import com.oplus.weatherservicesdk.data.Weather;
import com.oplus.weatherservicesdk.service.WeatherBaseDataTask;

/* JADX INFO: loaded from: classes5.dex */
public class WeatherAlertCaller implements IWeatherAlert {
    private static final String METHOD_REQUEST = "requestWeatherAlert";
    private static final String METHOD_UPDATE = "updateWeatherAlert";
    private static final String NOTIFY_URI = "content://com.oplus.weather.service.provider.data/weather_warn";
    private static final String TAG = "WeatherAlertCaller";
    private Context context;
    private ContentObserver mAlertObserver;

    public WeatherAlertCaller(Context context, final IWeatherNotify iWeatherNotify) {
        this.context = context;
        if (iWeatherNotify != null) {
            try {
                this.mAlertObserver = new ContentObserver(new Handler()) { // from class: com.oplus.weatherservicesdk.api.caller.WeatherAlertCaller.1
                    @Override // android.database.ContentObserver
                    public void onChange(boolean z) {
                        super.onChange(z);
                        iWeatherNotify.onChanged();
                    }
                };
                context.getContentResolver().registerContentObserver(Uri.parse(NOTIFY_URI), false, this.mAlertObserver);
            } catch (Exception e2) {
                DebugLog.e(TAG, "register error:" + e2.getMessage());
                this.mAlertObserver = null;
            }
        }
    }

    public void release() {
        DebugLog.i(TAG, "release:" + this.mAlertObserver);
        if (this.mAlertObserver != null) {
            this.context.getContentResolver().unregisterContentObserver(this.mAlertObserver);
            this.mAlertObserver = null;
        }
        this.context = null;
    }

    @Override // com.oplus.weatherservicesdk.api.IWeatherAlert
    public Weather requestWeatherAlert(final IWeatherAlert.IResult iResult) {
        Weather weather = new Weather();
        try {
            new WeatherBaseDataTask(Weather.class, this.context, new WeatherRequest().setRequestID(String.valueOf(System.currentTimeMillis())).setCallMethodName(METHOD_REQUEST).setPackageName(this.context.getPackageName()).setParams(null), (BaseCallBack) new BaseCallBack<Weather>() { // from class: com.oplus.weatherservicesdk.api.caller.WeatherAlertCaller.2
                @Override // com.oplus.weatherservicesdk.BaseCallBack
                public void onFail(String str) {
                    DebugLog.d(WeatherAlertCaller.TAG, "onFail:" + str + ";" + iResult);
                    IWeatherAlert.IResult iResult2 = iResult;
                    if (iResult2 != null) {
                        iResult2.onFail(str);
                    }
                }

                @Override // com.oplus.weatherservicesdk.BaseCallBack
                public void onSuccess(Weather weather2) {
                    DebugLog.d(WeatherAlertCaller.TAG, "onSucces:" + weather2 + ";" + iResult);
                    IWeatherAlert.IResult iResult2 = iResult;
                    if (iResult2 != null) {
                        if (weather2 != null) {
                            iResult2.onSuccess(weather2.city, weather2.alert);
                        } else {
                            iResult2.onSuccess(null, null);
                        }
                    }
                }
            }).startServiceRequest();
            weather.status = 0;
        } catch (Exception e2) {
            DebugLog.e(TAG, "requestWeatherAlert error:" + e2.getMessage());
            iResult.onFail(e2.getMessage());
        }
        return weather;
    }

    @Override // com.oplus.weatherservicesdk.api.IWeatherAlert
    public int updateWeatherAlert() {
        try {
            new WeatherBaseDataTask(Integer.TYPE, this.context, new WeatherRequest().setRequestID(String.valueOf(System.currentTimeMillis())).setCallMethodName(METHOD_UPDATE).setPackageName(this.context.getPackageName()).setParams(null), (BaseCallBack) null).startServiceRequest();
            return 0;
        } catch (Exception e2) {
            DebugLog.e(TAG, "updateWeatherAlert error:" + e2.getMessage());
            return -1;
        }
    }
}
