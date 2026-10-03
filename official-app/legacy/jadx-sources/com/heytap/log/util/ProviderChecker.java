package com.heytap.log.util;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.text.TextUtils;
import android.util.Log;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public class ProviderChecker {
    private static final String TAG = "HLog_ProviderUtils";

    public static boolean checkProvider(Context context) {
        int i = 0;
        for (ProviderInfo providerInfo : getAllProviders(context)) {
            if (!TextUtils.isEmpty(providerInfo.authority) && (providerInfo.authority.contains("HLOG_SDK_PROVIDER") || providerInfo.authority.contains("FILEPROVIDER"))) {
                i++;
                if (i > 1) {
                    break;
                }
            }
        }
        Log.d(TAG, "Authority statusStep : " + i);
        return i > 1;
    }

    public static List<ProviderInfo> getAllProviders(Context context) {
        try {
            ProviderInfo[] providerInfoArr = context.getPackageManager().getPackageInfo(context.getPackageName(), 8).providers;
            if (providerInfoArr != null) {
                return Collections.unmodifiableList(Arrays.asList(providerInfoArr));
            }
            return null;
        } catch (PackageManager.NameNotFoundException e2) {
            e2.printStackTrace();
            return null;
        }
    }
}
