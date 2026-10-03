package com.oplus.aiunit.vision;

import android.content.Context;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.SystemProperties;
import android.provider.Settings;
import android.util.Log;
import com.oplus.utrace.utils.SystemSettingsUtilsKt;

/* JADX INFO: loaded from: classes19.dex */
public class i1e {
    public static boolean a = false;

    public static class b extends ContentObserver {
        @Override // android.database.ContentObserver
        public void onChange(boolean z, Uri uri) {
            boolean unused = i1e.a = SystemProperties.getBoolean("persist.sys.assert.panic", false);
        }

        public b() {
            super(null);
        }
    }

    public static void b(String str) {
        if (a) {
            Log.d("AppPlatform.Shield", str);
        }
    }

    public static void c(String str) {
        Log.e("AppPlatform.Shield", str);
    }

    public static void d(String str) {
        if (a) {
            Log.i("AppPlatform.Shield", str);
        }
    }

    public static void e(Context context) {
        a = SystemProperties.getBoolean("persist.sys.assert.panic", false);
        context.getContentResolver().registerContentObserver(Settings.System.getUriFor(SystemSettingsUtilsKt.LOG_SWITCH_TYPE), false, new b());
    }
}
