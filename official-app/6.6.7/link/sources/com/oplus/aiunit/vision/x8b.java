package com.oplus.aiunit.vision;

import android.content.Context;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.SystemProperties;
import android.provider.Settings;
import android.util.Log;
import androidx.annotation.NonNull;
import com.oplus.utrace.utils.SystemSettingsUtilsKt;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public class x8b {
    public static boolean a = f();
    public static AtomicBoolean b = new AtomicBoolean(false);
    public static volatile x8b c;

    public static class b extends ContentObserver {
        @Override // android.database.ContentObserver
        public void onChange(boolean z, Uri uri) {
            boolean unused = x8b.a = x8b.f();
        }

        public b() {
            super(null);
        }
    }

    public static void c(String str, @NonNull String str2, @NonNull Object... objArr) {
        if (a) {
            Log.d(str, e(str2, objArr));
        }
    }

    public static void d(String str, @NonNull String str2, @NonNull Object... objArr) {
        if (a) {
            Log.e(str, e(str2, objArr));
        }
    }

    public static String e(String str, @NonNull Object[] objArr) {
        if (str == null) {
            return "";
        }
        return objArr.length > 0 ? String.format(str, objArr) : str;
    }

    public static boolean f() {
        return SystemProperties.getBoolean("persist.sys.assert.panic", false);
    }

    public static x8b g() {
        if (c == null) {
            synchronized (x8b.class) {
                if (c == null) {
                    c = new x8b();
                }
            }
        }
        return c;
    }

    public static void i(String str, @NonNull String str2, @NonNull Object... objArr) {
        if (a) {
            Log.w(str, e(str2, objArr));
        }
    }

    public void h(Context context) {
        if (b.getAndSet(true) || context == null || context.getContentResolver() == null) {
            return;
        }
        context.getContentResolver().registerContentObserver(Settings.System.getUriFor(SystemSettingsUtilsKt.LOG_SWITCH_TYPE), false, new b());
    }
}
