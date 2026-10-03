package com.heytap.log.kit.init;

import android.content.Context;
import android.os.Bundle;
import com.heytap.log.core.DataCallback;
import com.heytap.log.kit.KitSdk;
import com.heytap.mspsdk.MspSdk;
import com.heytap.mspsdk.core.crash.e;
import com.heytap.mspsdk.log.MspLog;

/* JADX INFO: loaded from: classes19.dex */
public class SalvageManager {
    private static final String TAG = "SalvageManager";

    public static boolean activeNotifyLogFileReady(Context context, String str) {
        return KitSdk.activeNotifyLogFileReady(context, str);
    }

    public static boolean activeReportTask(Context context, String str) {
        return KitSdk.activeReportTask(context, str);
    }

    public static boolean activeSalvageTask(Context context, String str) {
        return KitSdk.activeSalvageTask(context, str);
    }

    public static void changeSdkModeWithMspCrash(Context context, final DataCallback<Boolean> dataCallback) {
        e eVar = new e() { // from class: com.heytap.log.kit.init.SalvageManager.1
            @Override // com.heytap.mspsdk.core.crash.e
            public void onMspProcessCrash(int i, int i2, String str, int i3, String str2) {
                dataCallback.onData(Boolean.FALSE);
            }

            @Override // com.heytap.mspsdk.core.crash.e
            public void onMspProcessRecover(String str, int i, String str2) {
                dataCallback.onData(Boolean.TRUE);
            }
        };
        MspSdk.addMspProcessCrashListener(context, "com.heytap.htms:kit_hlog", eVar);
        MspSdk.addMspProcessCrashListener(context, "com.heytap.htms", eVar);
    }

    public static int getKitVersionCode(Context context) {
        try {
            Bundle bundle = context.getPackageManager().getApplicationInfo("com.heytap.htms", 128).metaData;
            if (bundle != null) {
                return bundle.getInt("kit_hlog_vercode");
            }
            return -1;
        } catch (Throwable th) {
            MspLog.e(TAG, th);
            return -1;
        }
    }

    public static void init(Context context) {
        KitSdk.init(context);
    }

    public static boolean isSupportHLogKit(Context context) {
        return KitSdk.isSupportHLogKit(context);
    }

    public static boolean mspCanSupportService(Context context) {
        return KitSdk.mspCanSupportService(context);
    }

    public static void queryConfig(Context context, String str) {
        KitSdk.queryConfig(context, str);
    }

    public static void raiseUploadTask(Context context, String str, String str2) {
        KitSdk.raiseUploadTask(context, str, str2);
    }

    public static void syncSalvageTask(Context context, String str) {
        KitSdk.syncSalvageTask(context, str);
    }
}
