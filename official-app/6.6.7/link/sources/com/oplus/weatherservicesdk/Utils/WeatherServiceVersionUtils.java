package com.oplus.weatherservicesdk.Utils;

import android.content.Context;
import android.content.pm.PackageManager;
import com.oplus.weatherservicesdk.DebugLog;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public class WeatherServiceVersionUtils {
    private static final String CLOCK_APP_PACKAGE_NAME = "com.coloros.alarmclock";
    private static final String CLOCK_APP_PACKAGE_NAME_ONEPLUS = "com.oneplus.deskclock";
    private static final int COMMON_VERSION_CODE = 40700;
    private static final String SERVICE_PACKAGE_NAME = "com.coloros.weather.service";
    private static final String TAG = "WeatherServiceVersionUtils";
    private static long clockVersionCode = -1;

    public static long getAppVersionCode(Context context, String str) {
        long longVersionCode;
        try {
            longVersionCode = context.getPackageManager().getPackageInfo(str, 0).getLongVersionCode();
        } catch (PackageManager.NameNotFoundException unused) {
            DebugLog.e(TAG, "NameNotFoundException " + str + " app version code get fail.");
            longVersionCode = -1;
        }
        DebugLog.d(TAG, "getAppVersionCode packageName " + str + "  versionCode" + longVersionCode);
        return longVersionCode;
    }

    public static long getClockVersionCode(Context context) {
        if (clockVersionCode == -1) {
            long appVersionCode = getAppVersionCode(context, CLOCK_APP_PACKAGE_NAME);
            clockVersionCode = appVersionCode;
            if (appVersionCode == -1) {
                clockVersionCode = getAppVersionCode(context, CLOCK_APP_PACKAGE_NAME_ONEPLUS);
            }
            DebugLog.d(TAG, "get real weather service version code $clockVersionCode");
        }
        DebugLog.d(TAG, "getClockVersionCode :" + clockVersionCode);
        return clockVersionCode;
    }

    public static long getWeatherServiceVersionCode(Context context) {
        long j;
        try {
            j = context.getPackageManager().getPackageInfo(SERVICE_PACKAGE_NAME, 0).versionCode;
            try {
                DebugLog.i(TAG, "serviceVersionCode" + j);
            } catch (PackageManager.NameNotFoundException unused) {
                DebugLog.w(TAG, "No WeatherService");
            }
        } catch (PackageManager.NameNotFoundException unused2) {
            j = 0;
        }
        return j;
    }

    public static boolean isCommonWeatherServiceExist(Context context) {
        return getWeatherServiceVersionCode(context) >= 40700;
    }
}
