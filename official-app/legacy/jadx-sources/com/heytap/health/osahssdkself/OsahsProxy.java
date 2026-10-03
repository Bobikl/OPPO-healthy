package com.heytap.health.osahssdkself;

import android.util.Log;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import com.heytap.health.osahssdkself.bean.OsaSummaryBean;
import com.heytap.health.osahssdkself.bean.SnoreInfoBean;

/* JADX INFO: loaded from: classes17.dex */
@Keep
public class OsahsProxy {
    public static final String TAG = "snore_alg:Proxy";
    private SnoreListener snoreListener;

    public void addData(short[] sArr) {
        SnoreInfoBean snoreInfoBeanSnoreMonitor = OsahsSDKNative.snoreMonitor(sArr);
        if (snoreInfoBeanSnoreMonitor == null) {
            Log.i(TAG, "addData fail infoBean is null");
        } else if (snoreInfoBeanSnoreMonitor.snoreNum > 0 && this.snoreListener == null) {
            Log.i(TAG, "addData fail snoreListener is null");
            return;
        }
        this.snoreListener.snoreAppeared(snoreInfoBeanSnoreMonitor);
    }

    public void addDataUnprocess(short[] sArr) {
        SnoreInfoBean snoreInfoBeanSnoreMonitorUnprocess = OsahsSDKNative.snoreMonitorUnprocess(sArr);
        if (snoreInfoBeanSnoreMonitorUnprocess == null) {
            Log.i(TAG, "addData fail infoBean is null");
        } else if (snoreInfoBeanSnoreMonitorUnprocess.snoreNum > 0 && this.snoreListener == null) {
            Log.i(TAG, "addData fail snoreListener is null");
            return;
        }
        this.snoreListener.snoreAppeared(snoreInfoBeanSnoreMonitorUnprocess);
    }

    public boolean deinitSDK() {
        return OsahsSDKNative.deinit() == 0;
    }

    public boolean initHealthLog(@NonNull HealthLogProxy healthLogProxy) {
        return OsahsSDKNative.initHealthLog(healthLogProxy) == 0;
    }

    public boolean initSDK() {
        return OsahsSDKNative.init() == 0;
    }

    public void recycleGlobalRef() {
        OsahsSDKNative.recycleGlobalRef();
    }

    public void setSnoreListener(SnoreListener snoreListener) {
        this.snoreListener = snoreListener;
    }

    public OsaSummaryBean summarySDK() {
        return OsahsSDKNative.summary();
    }
}
