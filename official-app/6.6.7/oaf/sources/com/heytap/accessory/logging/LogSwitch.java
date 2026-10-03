package com.heytap.accessory.logging;

import android.content.Context;
import android.database.ContentObserver;
import android.net.Uri;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
public class LogSwitch {
    private static final String LOGGING_STATUS_KEY = "log_switch_type";
    private static final String TAG = "LogSwitch";
    private static boolean sIsDebugTagOn = Log.isLoggable(TAG, 3);
    private static boolean sTraceFunc = false;

    public static void init(Context context) {
        if (context != null) {
            final Context applicationContext = context.getApplicationContext();
            applicationContext.getContentResolver().registerContentObserver(Settings.System.getUriFor(LOGGING_STATUS_KEY), true, new ContentObserver(null) { // from class: com.heytap.accessory.logging.LogSwitch.1
                @Override // android.database.ContentObserver
                public void onChange(boolean z, @Nullable Uri uri) {
                    Log.i(LogSwitch.TAG, "onSystemLog changed. selfChange:" + z + "; uri: " + uri);
                    LogSwitch.onSystemLogChanged(applicationContext);
                }
            });
            onSystemLogChanged(context);
            CommonLog.enableTrackFunction(sTraceFunc);
        }
    }

    public static void logCommitMessage(String str) {
        CommonLog.i(str, "Accessory Framework commit id is 7a644c7");
        CommonLog.i(str, "Accessory Framework build time is 250930");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void onSystemLogChanged(@NonNull Context context) {
        boolean z = Settings.System.getInt(context.getContentResolver(), LOGGING_STATUS_KEY, 0) != 0;
        String packageName = context.getPackageName();
        Log.i(TAG, "isLogOn = " + z + ", isDebugTagOn = " + sIsDebugTagOn + ", packageName = " + packageName);
        if (!TextUtils.isEmpty(packageName)) {
            CommonLog.setTagSymbol(packageName.charAt(packageName.length() - 1));
        }
        logCommitMessage(context.getPackageName());
        CommonLog.enableDevelopMode(z || sIsDebugTagOn);
    }
}
