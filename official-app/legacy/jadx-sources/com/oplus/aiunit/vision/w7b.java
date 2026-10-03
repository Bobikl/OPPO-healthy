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
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes8.dex */
public class w7b {
    public static boolean a;
    public static AtomicBoolean b = new AtomicBoolean(false);

    public static class b extends ContentObserver {
        @Override // android.database.ContentObserver
        public void onChange(boolean z, Uri uri) {
            boolean unused = w7b.a = SystemProperties.getBoolean("persist.sys.assert.panic", false);
        }

        public b(Handler handler) {
            super(null);
        }
    }

    public static void b(String str, @NonNull String str2, @NonNull Object... objArr) {
        if (a) {
            Log.d("Tingle->" + str, d(str2, objArr));
        }
    }

    public static void c(String str, @NonNull String str2, @NonNull Object... objArr) {
        Log.e("Tingle->" + str, d(str2, objArr));
    }

    public static String d(@NonNull String str, @NonNull Object[] objArr) {
        return (str == null || objArr == null || objArr.length <= 0) ? str : String.format(str, objArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void e(Context context) {
        if (b.getAndSet(true)) {
            return;
        }
        if (context == null || context.getContentResolver() == null) {
            a = false;
            return;
        }
        if (r04.a().equals(context.getPackageName())) {
            context.getContentResolver().registerContentObserver(Settings.System.getUriFor(SystemSettingsUtilsKt.LOG_SWITCH_TYPE), false, new b(null));
        }
        a = SystemProperties.getBoolean("persist.sys.assert.panic", false);
    }
}
