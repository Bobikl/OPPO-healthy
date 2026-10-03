package com.sensorsdata.analytics.android.sdk.util;

import android.content.Context;
import com.sensorsdata.analytics.android.sdk.SALog;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes10.dex */
public class PermissionUtils {
    private static final String TAG = "SA.PermissionUtils";
    private static final Set<String> mPermissionGrantedSet = new HashSet();
    private static final Set<String> mPermissionGrantedOnceSet = new HashSet<String>() { // from class: com.sensorsdata.analytics.android.sdk.util.PermissionUtils.1
        {
            add("android.permission.ACCESS_WIFI_STATE");
            add("android.permission.ACCESS_NETWORK_STATE");
        }
    };

    public static boolean checkSelfPermission(Context context, String str) {
        Set<String> set = mPermissionGrantedSet;
        if (set.contains(str)) {
            return true;
        }
        boolean z = context.checkSelfPermission(str) == 0;
        if (z && mPermissionGrantedOnceSet.contains(str)) {
            set.add(str);
        }
        return z;
    }

    public static boolean hasReadPhoneStatePermission(Context context) {
        if (checkSelfPermission(context, "android.permission.READ_PRECISE_PHONE_STATE")) {
            return true;
        }
        SALog.i(TAG, "Don't have permission android.permission.READ_PRECISE_PHONE_STATE,getDeviceID failed");
        return false;
    }
}
