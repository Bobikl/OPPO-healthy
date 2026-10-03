package com.oplus.aiunit.vision;

import android.text.TextUtils;
import com.heytap.store.base.core.http.HttpUtils;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public class yha {
    public static final String a;
    public static String b;

    static {
        String strN = qe0.n();
        int iLastIndexOf = strN.lastIndexOf("_");
        if (iLastIndexOf > -1) {
            a = strN.substring(iLastIndexOf);
        } else {
            a = String.valueOf(qe0.m());
        }
        String strC = gxe.c();
        if (TextUtils.isEmpty(strC)) {
            b = "";
        }
        int iLastIndexOf2 = strC.lastIndexOf(58);
        if (iLastIndexOf2 > -1) {
            b = strC.substring(iLastIndexOf2 + 1);
        } else {
            b = "main";
        }
    }

    public static void a(Object... objArr) {
        d("DFJ.HEITAG", objArr);
    }

    public static void b(Object... objArr) {
        e("DFJ.HEITAG", objArr);
    }

    public static void c(Object... objArr) {
        g("DFJ.HEITAG", objArr);
    }

    public static void d(String str, Object... objArr) {
        a7b.f(str, i(objArr));
    }

    public static void e(String str, Object... objArr) {
        i(objArr);
    }

    public static void f(String str, String str2, Object... objArr) {
        a7b.f(str, i(String.format(str2, TextUtils.join(", ", objArr))));
    }

    public static void g(String str, Object... objArr) {
        a7b.m(str, i(objArr));
    }

    public static void h(String str, Throwable th) {
        if (qe0.w()) {
            a7b.b(str, i(a7b.e(th)));
        } else {
            a7b.b(str, i(th.getMessage()));
        }
    }

    @NotNull
    public static String i(Object... objArr) {
        return k() + " =>> " + TextUtils.join(", ", objArr);
    }

    public static void j(Throwable th) {
        h("DFJ.HEITAG", th);
    }

    @NotNull
    public static String k() {
        return Thread.currentThread().getId() + HttpUtils.EQUAL_SIGN + b + a;
    }
}
