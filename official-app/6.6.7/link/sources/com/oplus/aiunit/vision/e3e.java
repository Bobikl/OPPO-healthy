package com.oplus.aiunit.vision;

import android.content.Context;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.SystemProperties;
import android.provider.Settings;
import android.util.Log;
import com.oplus.utrace.utils.SystemSettingsUtilsKt;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public class e3e {
    public static boolean a = false;

    public static class b extends ContentObserver {
        @Override // android.database.ContentObserver
        public void onChange(boolean z, Uri uri) {
            boolean unused = e3e.a = SystemProperties.getBoolean("persist.sys.assert.panic", false);
        }

        public b() {
            super(null);
        }
    }

    public static void b(String str) {
        if (a) {
            Log.d(d14.TAG, str);
        }
    }

    public static void c(String str) {
        Log.e(d14.TAG, str);
    }

    public static void d(String str) {
        if (a) {
            Log.i(d14.TAG, str);
        }
    }

    public static void e(Context context) {
        a = SystemProperties.getBoolean("persist.sys.assert.panic", false);
        context.getContentResolver().registerContentObserver(Settings.System.getUriFor(SystemSettingsUtilsKt.LOG_SWITCH_TYPE), false, new b());
    }
}
