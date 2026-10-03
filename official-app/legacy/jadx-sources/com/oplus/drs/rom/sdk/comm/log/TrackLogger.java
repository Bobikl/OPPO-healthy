package com.oplus.drs.rom.sdk.comm.log;

import android.util.Log;
import androidx.annotation.Nullable;
import com.oplus.aiunit.vision.fs9;
import java.util.Locale;

/* JADX INFO: loaded from: classes19.dex */
public final class TrackLogger {
    public static volatile boolean a = false;
    public static volatile boolean b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public static volatile fs9 f19847c;

    public enum Level {
        V,
        D,
        I,
        W,
        E
    }

    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[Level.values().length];
            a = iArr;
            try {
                iArr[Level.V.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[Level.D.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[Level.I.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[Level.W.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[Level.E.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public static boolean a(Level level, String str, String str2, @Nullable Throwable th, Object[] objArr) {
        fs9 fs9Var = f19847c;
        if (fs9Var == null) {
            return false;
        }
        try {
            int i = a.a[level.ordinal()];
            if (i == 1) {
                return fs9Var.v(str, str2, th, objArr);
            }
            if (i == 2) {
                return fs9Var.d(str, str2, th, objArr);
            }
            if (i == 3) {
                return fs9Var.i(str, str2, th, objArr);
            }
            if (i == 4) {
                return fs9Var.w(str, str2, th, objArr);
            }
            if (i != 5) {
                return false;
            }
            return fs9Var.e(str, str2, th, objArr);
        } catch (Throwable unused) {
            return false;
        }
    }

    public static void b(String str, String str2, Throwable th, Object... objArr) {
        if (a && !a(Level.D, str, str2, th, objArr)) {
            Log.d(str, f(str2, objArr), th);
        }
    }

    public static void c(String str, String str2, Object... objArr) {
        b(str, str2, null, objArr);
    }

    public static void d(String str, String str2, Throwable th, Object... objArr) {
        if (a(Level.E, str, str2, th, objArr)) {
            return;
        }
        Log.e(str, f(str2, objArr), th);
    }

    public static void e(String str, String str2, Object... objArr) {
        d(str, str2, null, objArr);
    }

    public static String f(String str, Object[] objArr) {
        if (str == null) {
            return "";
        }
        if (objArr == null || objArr.length == 0) {
            return str;
        }
        try {
            return String.format(Locale.US, str, objArr);
        } catch (Throwable unused) {
            return str;
        }
    }

    public static void g(String str, String str2, Throwable th, Object... objArr) {
        if (a(Level.I, str, str2, th, objArr)) {
            return;
        }
        Log.i(str, f(str2, objArr), th);
    }

    public static void h(String str, String str2, Object... objArr) {
        g(str, str2, null, objArr);
    }

    public static void i(boolean z) {
        if (b) {
            return;
        }
        a = z;
    }

    public static void j(boolean z) {
        b = true;
        a = z;
    }

    public static void k(@Nullable fs9 fs9Var) {
        b = true;
        f19847c = fs9Var;
    }

    public static void l(String str, String str2, Throwable th, Object... objArr) {
        if (a && !a(Level.V, str, str2, th, objArr)) {
            Log.v(str, f(str2, objArr), th);
        }
    }

    public static void m(String str, String str2, Object... objArr) {
        l(str, str2, null, objArr);
    }

    public static void n(String str, String str2, Throwable th, Object... objArr) {
        if (a(Level.W, str, str2, th, objArr)) {
            return;
        }
        Log.w(str, f(str2, objArr), th);
    }

    public static void o(String str, String str2, Object... objArr) {
        n(str, str2, null, objArr);
    }
}
