package com.heytap.health.osahssdkself;

import androidx.annotation.Keep;
import com.heytap.health.osahssdkself.bean.OsaSummaryBean;
import com.heytap.health.osahssdkself.bean.SnoreInfoBean;

/* JADX INFO: loaded from: classes17.dex */
@Keep
public class OsahsSDKNative {
    private Object logger;

    static {
        System.loadLibrary("libOsahsSDK");
    }

    public static native short deinit();

    public static native short init();

    public static native short initHealthLog(HealthLogProxy healthLogProxy);

    public static native void recycleGlobalRef();

    public static native SnoreInfoBean snoreMonitor(short[] sArr);

    public static native SnoreInfoBean snoreMonitorUnprocess(short[] sArr);

    public static native OsaSummaryBean summary();
}
