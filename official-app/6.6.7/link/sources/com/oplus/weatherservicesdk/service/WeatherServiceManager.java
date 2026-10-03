package com.oplus.weatherservicesdk.service;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.RemoteException;
import com.oplus.weatherservicesdk.DebugLog;
import com.oppo.servicesdk.ICommonService;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public class WeatherServiceManager {
    private static final String CONTEXT_IS_NULL = "context is null";
    private static final String TAG = "WeatherServiceManager";
    private static final String WEATHER_COMMON_SERVICE_ACTION = "com.oppo.weather.external.weather_common_service";
    private static final String WEATHER_SERVICE_PACKAGE_NAME = "com.coloros.weather.service";
    private ICommonService mWeatherService = null;
    private volatile boolean mIsStartService = false;
    private final CopyOnWriteArrayList<IWeatherServiceManagerCallback> mCallbacks = new CopyOnWriteArrayList<>();
    private final IBinder.DeathRecipient mDeathRecipient = new IBinder.DeathRecipient() { // from class: com.oplus.weatherservicesdk.service.WeatherServiceManager.1
        @Override // android.os.IBinder.DeathRecipient
        public void binderDied() {
            DebugLog.e(WeatherServiceManager.TAG, "mDeathListener binderDied");
            WeatherServiceManager.this.mIsStartService = false;
        }
    };
    private final ServiceConnection mWeatherAppConnection = new ServiceConnection() { // from class: com.oplus.weatherservicesdk.service.WeatherServiceManager.2
        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            String str;
            DebugLog.i(WeatherServiceManager.TAG, "onServiceConnected");
            try {
                WeatherServiceManager.this.mWeatherService = ICommonService.Stub.asInterface(iBinder);
                WeatherServiceManager.this.mIsStartService = true;
                if (WeatherServiceManager.this.mIsStartService && WeatherServiceManager.this.mWeatherService != null) {
                    try {
                        WeatherServiceManager.this.mWeatherService.asBinder().linkToDeath(WeatherServiceManager.this.mDeathRecipient, 0);
                    } catch (DeadObjectException unused) {
                        str = "onServiceConnected DeadObjectException";
                        DebugLog.e(WeatherServiceManager.TAG, str);
                    } catch (RemoteException unused2) {
                        str = "onServiceConnected RemoteException";
                        DebugLog.e(WeatherServiceManager.TAG, str);
                    }
                }
                for (IWeatherServiceManagerCallback iWeatherServiceManagerCallback : WeatherServiceManager.this.mCallbacks) {
                    if (iWeatherServiceManagerCallback != null) {
                        iWeatherServiceManagerCallback.onServiceConnected();
                    }
                }
            } catch (Exception e) {
                DebugLog.e(WeatherServiceManager.TAG, " Exception ", e);
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            DebugLog.i(WeatherServiceManager.TAG, "onServiceDisconnected");
            for (IWeatherServiceManagerCallback iWeatherServiceManagerCallback : WeatherServiceManager.this.mCallbacks) {
                if (iWeatherServiceManagerCallback != null) {
                    iWeatherServiceManagerCallback.onServiceDisconnected();
                }
            }
            WeatherServiceManager.this.mIsStartService = false;
            WeatherServiceManager.this.mWeatherService = null;
        }
    };

    public interface IWeatherServiceManagerCallback {
        void onServiceConnected();

        void onServiceDisconnected();
    }

    public boolean bindUpdateService(Context context) {
        try {
            DebugLog.i(TAG, "bindUpdateService " + this.mIsStartService);
            if (!this.mIsStartService) {
                Intent intent = new Intent(WEATHER_COMMON_SERVICE_ACTION).setPackage(WEATHER_SERVICE_PACKAGE_NAME);
                if (context != null) {
                    return context.bindService(intent, this.mWeatherAppConnection, 257);
                }
                DebugLog.w(TAG, CONTEXT_IS_NULL);
            }
        } catch (Exception e) {
            DebugLog.e(TAG, "Bind update service failed.", e);
        }
        return false;
    }

    public ICommonService getWeatherService() {
        return this.mWeatherService;
    }

    public boolean isStartService() {
        return this.mIsStartService;
    }

    public synchronized void registerCallback(IWeatherServiceManagerCallback iWeatherServiceManagerCallback) {
        try {
            if (iWeatherServiceManagerCallback == null) {
                DebugLog.e(TAG, "registerCallback error as callback == null,check your methods if need");
            } else if (!this.mCallbacks.contains(iWeatherServiceManagerCallback)) {
                this.mCallbacks.add(iWeatherServiceManagerCallback);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public void unBindUpdateService(Context context) {
        try {
            DebugLog.i(TAG, "unBindUpdateService " + this.mIsStartService);
            if (this.mIsStartService) {
                ICommonService iCommonService = this.mWeatherService;
                if (iCommonService != null) {
                    iCommonService.asBinder().unlinkToDeath(this.mDeathRecipient, 0);
                }
                if (context != null) {
                    context.unbindService(this.mWeatherAppConnection);
                }
                this.mIsStartService = false;
            }
            this.mWeatherService = null;
        } catch (Exception e) {
            DebugLog.e(TAG, " Exception ", e);
        }
    }

    public synchronized void unregisterCallback(IWeatherServiceManagerCallback iWeatherServiceManagerCallback) {
        this.mCallbacks.remove(iWeatherServiceManagerCallback);
    }
}
