package com.oplus.aiunit.vision;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.Arrays;

/* JADX INFO: loaded from: classes12.dex */
public final class x2n {
    public static byte[] b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static byte[] f18481c;
    public String a;

    public x2n(String str) {
        this.a = t0n.d(TextUtils.isDigitsOnly(str) ? "SPUtil" : str);
    }

    public static int a(Context context, String str, String str2, int i) {
        try {
            return context.getSharedPreferences(str, 0).getInt(str2, i);
        } catch (Throwable th) {
            c2n.r(th, "csp", "giv");
            return i;
        }
    }

    public static long b(Context context, String str, String str2, long j2) {
        try {
            return context.getSharedPreferences(str, 0).getLong(str2, j2);
        } catch (Throwable th) {
            c2n.r(th, "csp", "glv");
            return j2;
        }
    }

    public static SharedPreferences.Editor c(Context context, String str) {
        if (context != null) {
            try {
                if (!TextUtils.isEmpty(str)) {
                    return context.getSharedPreferences(str, 0).edit();
                }
            } catch (Throwable th) {
                a2n.e(th, "sp", "ge");
            }
        }
        return null;
    }

    public static String d(Context context, String str, String str2) {
        if (context == null) {
            return "";
        }
        try {
            return w0n.g(q(context, w0n.x(context.getSharedPreferences(str, 0).getString(str2, ""))));
        } catch (Throwable unused) {
            return "";
        }
    }

    public static void e(Context context, String str, String str2, String str3) {
        if (context == null || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            return;
        }
        try {
            SharedPreferences.Editor editorEdit = context.getSharedPreferences(str, 0).edit();
            editorEdit.putString(str2, w0n.D(n(context, w0n.n(str3))));
            f(editorEdit);
        } catch (Throwable unused) {
        }
    }

    public static void f(SharedPreferences.Editor editor) {
        if (editor == null) {
            return;
        }
        try {
            editor.apply();
        } catch (Throwable th) {
            a2n.e(th, "sp", "cm");
        }
    }

    public static void g(SharedPreferences.Editor editor, String str) {
        if (editor != null) {
            try {
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                editor.remove(str);
            } catch (Throwable th) {
                a2n.e(th, "sp", "rk");
            }
        }
    }

    public static void h(SharedPreferences.Editor editor, String str, int i) {
        try {
            editor.putInt(str, i);
        } catch (Throwable th) {
            c2n.r(th, "csp", "putPrefsInt");
        }
    }

    public static void i(SharedPreferences.Editor editor, String str, long j2) {
        if (editor == null || TextUtils.isEmpty(str)) {
            return;
        }
        try {
            editor.putLong(str, j2);
        } catch (Throwable th) {
            c2n.r(th, "csp", "plv");
        }
    }

    public static void j(SharedPreferences.Editor editor, String str, String str2) {
        if (editor != null) {
            try {
                if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
                    editor.putString(str, str2);
                }
            } catch (Throwable th) {
                a2n.e(th, "sp", "ps");
            }
        }
    }

    public static void k(SharedPreferences.Editor editor, String str, boolean z) {
        try {
            editor.putBoolean(str, z);
        } catch (Throwable th) {
            c2n.r(th, "csp", "setPrefsStr");
        }
    }

    public static boolean l(Context context, String str, String str2, boolean z) {
        try {
            return context.getSharedPreferences(str, 0).getBoolean(str2, z);
        } catch (Throwable th) {
            c2n.r(th, "csp", "gbv");
            return z;
        }
    }

    public static byte[] m(Context context) {
        if (context == null) {
            return new byte[0];
        }
        byte[] bArr = b;
        if (bArr != null && bArr.length > 0) {
            return bArr;
        }
        byte[] bytes = n0n.j(context).getBytes();
        b = bytes;
        return bytes;
    }

    public static byte[] n(Context context, byte[] bArr) {
        try {
            return q0n.h(m(context), bArr, p(context));
        } catch (Throwable unused) {
            return new byte[0];
        }
    }

    public static String o(Context context, String str, String str2, String str3) {
        if (context == null) {
            return null;
        }
        try {
            return context.getSharedPreferences(str, 0).getString(str2, str3);
        } catch (Throwable th) {
            c2n.r(th, "csp", "gsv");
            return str3;
        }
    }

    public static byte[] p(Context context) {
        byte[] bArr = f18481c;
        if (bArr != null && bArr.length > 0) {
            return bArr;
        }
        byte[] bArrCopyOfRange = Arrays.copyOfRange(m(context), 0, m(context).length / 2);
        f18481c = bArrCopyOfRange;
        return bArrCopyOfRange;
    }

    public static byte[] q(Context context, byte[] bArr) {
        try {
            return q0n.e(m(context), bArr, p(context));
        } catch (Exception unused) {
            return new byte[0];
        }
    }
}
