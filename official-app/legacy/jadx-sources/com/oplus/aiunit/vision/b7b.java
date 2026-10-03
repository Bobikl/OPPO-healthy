package com.oplus.aiunit.vision;

import android.util.Log;
import com.oplus.weatherservicesdk.data.Weather;

/* JADX INFO: loaded from: classes3.dex */
public class b7b {
    public static void a(String str, String str2) {
        e(3, str, str2);
    }

    public static void b(String str, String str2) {
        if (oll.sEXP) {
            return;
        }
        e(3, str, str2);
    }

    public static void c(String str, String str2) {
        e(6, str, str2);
    }

    public static void d(String str, String str2, Throwable th) {
        e(6, str, str2 + Weather.SEPARATOR + Log.getStackTraceString(th));
    }

    public static void e(int i, String str, String str2) {
        if (oll.sDebugLog) {
            if (i == 6) {
                Log.e("Weather_sdk_" + str, str2);
                return;
            }
            if (i == 3) {
                Log.d("Weather_sdk_" + str, str2);
            }
        }
    }
}
