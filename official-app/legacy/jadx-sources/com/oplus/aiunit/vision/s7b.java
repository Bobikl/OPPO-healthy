package com.oplus.aiunit.vision;

import android.content.Context;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;
import android.os.SystemProperties;
import android.provider.Settings;
import android.util.Log;
import androidx.annotation.NonNull;
import com.oplus.utrace.utils.SystemSettingsUtilsKt;

/* JADX INFO: loaded from: classes15.dex */
public class s7b {
    public static final String APP_PLATFORM_PACKAGE_NAME = "com.heytap.appplatform";
    public static boolean a = SystemProperties.getBoolean("persist.sys.assert.panic", false);

    public static class b extends ContentObserver {
        @Override // android.database.ContentObserver
        public void onChange(boolean z, Uri uri) {
            boolean unused = s7b.a = SystemProperties.getBoolean("persist.sys.assert.panic", false);
        }

        public b(Handler handler) {
            super(null);
        }
    }

    public static void b(String str, @NonNull String str2, @NonNull Object... objArr) {
        if (a) {
            Log.d("Epona->" + str, d(str2, objArr));
        }
    }

    public static void c(String str, @NonNull String str2, @NonNull Object... objArr) {
        if (a) {
            Log.e("Epona->" + str, d(str2, objArr));
        }
    }

    public static String d(@NonNull String str, @NonNull Object[] objArr) {
        return (str == null || objArr == null || objArr.length <= 0) ? "" : String.format(str, objArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void e(Context context) {
        if (context == null || context.getContentResolver() == null || !"com.heytap.appplatform".equals(context.getPackageName())) {
            return;
        }
        context.getContentResolver().registerContentObserver(Settings.System.getUriFor(SystemSettingsUtilsKt.LOG_SWITCH_TYPE), false, new b(null));
    }

    public static void f(String str, @NonNull String str2, @NonNull Object... objArr) {
        if (a) {
            Log.w("Epona->" + str, d(str2, objArr));
        }
    }
}
