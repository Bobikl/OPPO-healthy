package com.heytap.accessory.utils;

import android.content.Context;
import android.content.pm.PackageManager;
import com.google.mlkit.vision.barcode.common.Barcode;
import com.heytap.accessory.logging.SdkLog;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
public class PackageUtils {
    private static final String TAG = "PackageUtils";

    public static int getUid(Context context) {
        try {
            return context.getPackageManager().getApplicationInfo(context.getPackageName(), Barcode.FORMAT_ITF).uid;
        } catch (PackageManager.NameNotFoundException e) {
            SdkLog.w(TAG, "getUid failed:" + e);
            return 0;
        }
    }
}
