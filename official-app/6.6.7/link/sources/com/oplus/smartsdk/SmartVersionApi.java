package com.oplus.smartsdk;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.util.Log;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public class SmartVersionApi {
    protected static final String SMART_PACKAGE = "com.oplus.smartengine";
    private static final String TAG = "SmartVersionManager";
    private static volatile SmartVersionApi sInstance;
    private long mSmartVersion;

    private SmartVersionApi(Context context) {
        this.mSmartVersion = getSmartVersion(context);
    }

    public static SmartVersionApi getInstance(Context context) {
        if (sInstance == null) {
            synchronized (SmartVersionApi.class) {
                if (sInstance == null) {
                    sInstance = new SmartVersionApi(context);
                }
            }
        }
        return sInstance;
    }

    private long getSmartVersion(Context context) {
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo("com.oplus.smartengine", 0);
            if (packageInfo != null) {
                return packageInfo.getLongVersionCode();
            }
            return 0L;
        } catch (PackageManager.NameNotFoundException e) {
            Log.w(TAG, "getSmartVersion e: " + e.toString());
            return 0L;
        }
    }

    public boolean reloadSmartEngine(Context context) {
        if (context == null) {
            return false;
        }
        long smartVersion = getSmartVersion(context);
        if (smartVersion <= this.mSmartVersion) {
            return false;
        }
        this.mSmartVersion = smartVersion;
        return true;
    }
}
