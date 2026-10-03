package com.oplus.aiunit.vision;

import android.content.Context;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.Log;
import com.oplus.drs.base.ChannelMode;
import com.oplus.drs.base.util.SystemProperty;
import com.oplus.pantaconnect.sdk.connectionservice.lan.LanConstants;
import com.oplus.utrace.utils.SystemSettingsUtilsKt;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes6.dex */
public class z6b {
    public static boolean d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static Context f19299e;
    public static final AtomicInteger a = new AtomicInteger(6);
    public static final AtomicBoolean b = new AtomicBoolean(false);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final hs9 f19298c = o6b.f();
    public static boolean f = false;
    public static volatile boolean g = false;
    public static volatile int h = -1;
    public static volatile long i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static volatile int f19300j = -1;
    public static volatile long k = 0;

    public class a extends ContentObserver {
        public a(Handler handler) {
            super(handler);
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z) {
            super.onChange(z);
            if (z6b.f19299e != null) {
                if ("1".equals(Settings.System.getString(z6b.f19299e.getContentResolver(), SystemSettingsUtilsKt.LOG_SWITCH_TYPE))) {
                    z6b.z(2);
                } else {
                    z6b.y();
                }
            }
        }
    }

    public static String d(String str, Throwable th) {
        if (th == null) {
            return str == null ? "" : str;
        }
        if (str == null) {
            return Log.getStackTraceString(th);
        }
        return str + '\n' + Log.getStackTraceString(th);
    }

    public static String e(String str) {
        try {
            Object[] objArr = new Object[2];
            objArr[0] = TextUtils.isEmpty(str) ? LanConstants.OPERATOR_UNKNOWN : str;
            objArr[1] = b.get() ? Thread.currentThread().getName() : Long.valueOf(Thread.currentThread().getId());
            return String.format("DRS_LOG_%s[%s]", objArr);
        } catch (Throwable unused) {
            if (TextUtils.isEmpty(str)) {
                return "DRS_LOG";
            }
            return "DRS_LOG_" + str;
        }
    }

    public static void f(Context context, boolean z) {
        if (context != null) {
            f19299e = context.getApplicationContext();
        }
        d = z;
        x();
        y();
        if (f19299e != null) {
            try {
                Uri uriFor = Settings.System.getUriFor(SystemSettingsUtilsKt.LOG_SWITCH_TYPE);
                if (uriFor != null) {
                    f19299e.getContentResolver().registerContentObserver(uriFor, true, new a(null));
                }
            } catch (Throwable th) {
                Log.e("DRS-LogUtils", "observe *#800# failed. ", th);
            }
        }
    }

    public static boolean g() {
        return f;
    }

    public static boolean h() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (h == -1 || jCurrentTimeMillis - i > 60000) {
            i = jCurrentTimeMillis;
            h = w("drs_debug_domain_log");
        }
        return h == 1;
    }

    public static boolean i() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (f19300j == -1 || jCurrentTimeMillis - k > 60000) {
            k = jCurrentTimeMillis;
            f19300j = w("drs_debug_openid_log");
        }
        return f19300j == 1;
    }

    public static void j(int i2, String str, String str2, Throwable th) {
        if (i2 >= a.get()) {
            if (i2 < 4 || b.get()) {
                if (str2 == null) {
                    str2 = "";
                }
                String strE = e(str);
                String strD = d(str2, th);
                hs9 hs9Var = f19298c;
                if (hs9Var != null) {
                    if (i2 == 1) {
                        hs9Var.v(strE, strD);
                        return;
                    }
                    if (i2 == 2) {
                        hs9Var.d(strE, strD);
                        return;
                    }
                    if (i2 == 3) {
                        hs9Var.i(strE, strD);
                    } else if (i2 == 4) {
                        hs9Var.w(strE, strD);
                    } else {
                        if (i2 != 5) {
                            return;
                        }
                        hs9Var.e(strE, strD);
                    }
                }
            }
        }
    }

    public static void k(String str, String str2) {
        j(2, str, str2, null);
    }

    public static void l(String str, String str2) {
        if (h()) {
            j(2, str, str2, null);
        }
    }

    public static void m(String str, String str2) {
        if (h()) {
            j(3, str, str2, null);
        }
    }

    public static void n(String str, String str2) {
        if (h()) {
            j(4, str, str2, null);
        }
    }

    public static void o(String str, String str2) {
        j(5, str, str2, null);
    }

    public static void p(String str, String str2, Throwable th) {
        j(5, str, str2, th);
    }

    public static void q(String str, String str2) {
        j(3, str, str2, null);
    }

    public static void r(String str, String str2) {
        if (i()) {
            j(3, str, str2, null);
        }
    }

    public static void s(String str, String str2) {
        if (f) {
            j(d ? 2 : 3, str, str2, null);
        }
    }

    public static void t(String str, String str2) {
        if (f) {
            j(d ? 1 : 3, str, str2, null);
        }
    }

    public static void u(String str, String str2) {
        j(4, str, str2, null);
    }

    public static void v(String str, String str2, Throwable th) {
        j(4, str, str2, th);
    }

    public static int w(String str) {
        try {
            Context context = f19299e;
            if (context != null) {
                return Settings.Global.getInt(context.getContentResolver(), str, 0);
            }
        } catch (Exception unused) {
        }
        return 0;
    }

    public static void x() {
        try {
            Context context = f19299e;
            boolean z = true;
            if (context != null) {
                String packageName = context.getPackageName();
                if ("com.oplus.track.demo".equals(packageName)) {
                    f = true;
                    Log.i("DRS-LogUtils", "ALLOW_SENSITIVE_LOG=true for remote-maven-demo (package: " + packageName + ")");
                    return;
                }
            }
            if (w56.a() != ChannelMode.DRS) {
                f = d;
                return;
            }
            if (!d && !g) {
                z = false;
            }
            f = z;
        } catch (Throwable unused) {
            f = d;
        }
    }

    public static void y() {
        Context context = f19299e;
        if (context == null || !"com.oplus.track.demo".equals(context.getPackageName())) {
            z(d ? 1 : 3);
        } else {
            z(1);
        }
    }

    public static void z(int i2) {
        if (i2 != 1 && i2 != 2 && i2 != 3 && i2 != 4 && i2 != 5 && i2 != 6) {
            Log.w("DRS-LogUtils", "updateLogLevel: invalid level=" + i2);
            return;
        }
        Context context = f19299e;
        if (context != null && "com.oplus.track.demo".equals(context.getPackageName())) {
            b.set(true);
            a.set(1);
            return;
        }
        if (d) {
            b.set(true);
            a.set(i2);
            return;
        }
        boolean z = SystemProperty.getBoolean("persist.sys.assert.panic", false);
        AtomicBoolean atomicBoolean = b;
        atomicBoolean.set(z);
        if (!z) {
            a.set(i2);
        } else {
            atomicBoolean.set(true);
            a.set(2);
        }
    }
}
