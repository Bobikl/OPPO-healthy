package com.heytap.accessory.utils;

import android.content.Context;
import android.content.pm.PackageManager;
import com.heytap.accessory.logging.SdkLog;

/* JADX INFO: loaded from: classes14.dex */
public class PackageUtils {
    private static final String TAG = "PackageUtils";

    public static int getUid(Context context) {
        try {
            return context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).uid;
        } catch (PackageManager.NameNotFoundException e2) {
            SdkLog.w(TAG, "getUid failed:" + e2);
            return 0;
        }
    }
}
