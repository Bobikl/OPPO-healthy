package com.oplus.statistics.util;

import android.util.Log;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes8.dex */
public class LogUtil {
    public static final String TAG_PREFIX = "OplusTrack-";
    public static boolean a = false;

    public static void d(String str, @NonNull Supplier<String> supplier) {
        if (a) {
            Log.d(TAG_PREFIX + str, supplier.get());
        }
    }

    public static void e(String str, @NonNull Supplier<String> supplier) {
        Log.e(TAG_PREFIX + str, supplier.get());
    }

    public static void i(String str, @NonNull Supplier<String> supplier) {
        if (a) {
            Log.i(TAG_PREFIX + str, supplier.get());
        }
    }

    public static boolean isDebug() {
        return a;
    }

    public static void setDebug(boolean z) {
        a = z;
    }

    public static void v(String str, @NonNull Supplier<String> supplier) {
        if (a) {
            Log.v(TAG_PREFIX + str, supplier.get());
        }
    }

    public static void w(String str, @NonNull Supplier<String> supplier) {
        Log.w(TAG_PREFIX + str, supplier.get());
    }
}
