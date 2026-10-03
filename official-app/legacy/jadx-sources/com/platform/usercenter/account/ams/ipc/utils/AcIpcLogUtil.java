package com.platform.usercenter.account.ams.ipc.utils;

import android.util.Log;
import androidx.annotation.Keep;
import com.oplus.weatherservicesdk.data.Weather;

/* JADX INFO: loaded from: classes9.dex */
@Keep
public class AcIpcLogUtil {
    private static final String PREFIX = "AC_SDK";
    private static final String TAG = "AcIpcLogUtil";
    private static IAcLogImpl logImpl;

    @Keep
    public interface IAcLogImpl {
        void d(String str, String str2);

        void e(String str, String str2);

        void i(String str, String str2);

        void w(String str, String str2);
    }

    public static void d(String str, String str2, String str3) {
        d(str, str2 + " traceId:" + str3);
    }

    public static void e(String str, String str2, String str3) {
        e(str, str2 + " traceId:" + str3);
    }

    private static String getTag(String str) {
        return "AC_SDK_" + str;
    }

    public static void i(String str, String str2, String str3) {
        i(str, str2 + " traceId:" + str3);
    }

    public static void setLogImpl(IAcLogImpl iAcLogImpl) {
        logImpl = iAcLogImpl;
    }

    public static void w(String str, String str2, String str3) {
        w(str, str2 + " traceId:" + str3);
    }

    public static void d(String str, String str2) {
        String tag = getTag(str);
        IAcLogImpl iAcLogImpl = logImpl;
        if (iAcLogImpl != null) {
            iAcLogImpl.d(tag, str2);
        } else {
            Log.d(tag, str2);
        }
    }

    public static void e(String str, String str2, Throwable th) {
        e(str, str2 + Weather.SEPARATOR + Log.getStackTraceString(th));
    }

    public static void i(String str, String str2) {
        String tag = getTag(str);
        IAcLogImpl iAcLogImpl = logImpl;
        if (iAcLogImpl != null) {
            iAcLogImpl.i(tag, str2);
        } else {
            Log.i(tag, str2);
        }
    }

    public static void w(String str, String str2) {
        String tag = getTag(str);
        IAcLogImpl iAcLogImpl = logImpl;
        if (iAcLogImpl != null) {
            iAcLogImpl.w(tag, str2);
        } else {
            Log.w(tag, str2);
        }
    }

    public static void e(String str, String str2, Throwable th, String str3) {
        e(str, str2 + " traceId:" + str3, th);
    }

    public static void e(String str, String str2) {
        String tag = getTag(str);
        IAcLogImpl iAcLogImpl = logImpl;
        if (iAcLogImpl != null) {
            iAcLogImpl.e(tag, str2);
        } else {
            Log.e(tag, str2);
        }
    }
}
