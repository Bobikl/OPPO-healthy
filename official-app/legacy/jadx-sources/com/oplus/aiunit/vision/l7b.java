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

/* JADX INFO: loaded from: classes8.dex */
public class l7b {
    public static boolean a = f();
    public static AtomicBoolean b = new AtomicBoolean(false);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile l7b f13559c;

    public static class b extends ContentObserver {
        @Override // android.database.ContentObserver
        public void onChange(boolean z, Uri uri) {
            boolean unused = l7b.a = l7b.f();
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

    public static l7b g() {
        if (f13559c == null) {
            synchronized (l7b.class) {
                if (f13559c == null) {
                    f13559c = new l7b();
                }
            }
        }
        return f13559c;
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
