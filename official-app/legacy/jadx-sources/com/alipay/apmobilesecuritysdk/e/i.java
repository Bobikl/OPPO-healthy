package com.alipay.apmobilesecuritysdk.e;

import android.content.Context;
import com.oplus.aiunit.vision.vam;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes12.dex */
public final class i {
    public static String a = "";
    public static String b = "";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static String f573c = "";
    public static String d = "";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static String f574e = "";
    public static Map<String, String> f = new HashMap();

    public static synchronized String a(String str) {
        String str2 = "apdidTokenCache" + str;
        if (f.containsKey(str2)) {
            String str3 = f.get(str2);
            if (vam.f(str3)) {
                return str3;
            }
        }
        return "";
    }

    public static synchronized String b() {
        return a;
    }

    public static synchronized String c() {
        return b;
    }

    public static synchronized String d() {
        return d;
    }

    public static synchronized String e() {
        return f574e;
    }

    public static synchronized String f() {
        return f573c;
    }

    public static synchronized c g() {
        return new c(a, b, f573c, d, f574e);
    }

    public static void h() {
        f.clear();
        a = "";
        b = "";
        d = "";
        f574e = "";
        f573c = "";
    }

    public static synchronized void a() {
    }

    public static void b(String str) {
        a = str;
    }

    public static void c(String str) {
        b = str;
    }

    public static void d(String str) {
        f573c = str;
    }

    public static void e(String str) {
        d = str;
    }

    public static void f(String str) {
        f574e = str;
    }

    public static synchronized void a(b bVar) {
        if (bVar != null) {
            a = bVar.a;
            b = bVar.b;
            f573c = bVar.f568c;
        }
    }

    public static synchronized void a(c cVar) {
        if (cVar != null) {
            a = cVar.a;
            b = cVar.b;
            d = cVar.d;
            f574e = cVar.f570e;
            f573c = cVar.f569c;
        }
    }

    public static synchronized void a(String str, String str2) {
        String str3 = "apdidTokenCache" + str;
        if (f.containsKey(str3)) {
            f.remove(str3);
        }
        f.put(str3, str2);
    }

    public static synchronized boolean a(Context context, String str) {
        long jA;
        try {
            jA = h.a(context);
            if (jA < 0) {
                jA = 86400000;
            }
        } catch (Throwable unused) {
        }
        try {
            if (Math.abs(System.currentTimeMillis() - h.h(context, str)) < jA) {
                return true;
            }
        } catch (Throwable th) {
            com.alipay.apmobilesecuritysdk.c.a.a(th);
        }
        return false;
    }
}
