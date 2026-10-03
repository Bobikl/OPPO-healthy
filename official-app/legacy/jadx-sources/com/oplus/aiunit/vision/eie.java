package com.oplus.aiunit.vision;

import android.os.Build;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes18.dex */
public final class eie {
    public static String a() {
        return Build.VERSION.SDK_INT >= 30 ? ps5.a("kge&gxd}{&g{&Gxd}{J}adl") : ps5.a("kge&kgdgz&g{&KgdgzJ}adl");
    }

    public static long b() {
        return Build.TIME;
    }

    public static String c() {
        return d();
    }

    public static String d() {
        String strA = alj.a(m(), "");
        return TextUtils.isEmpty(strA) ? alj.a(n(), "") : strA;
    }

    public static String e() {
        String strA = alj.a(l(), "");
        if (strA.isEmpty()) {
            strA = alj.a(j(), "CN");
        }
        return strA.equalsIgnoreCase("OC") ? "CN" : strA;
    }

    public static int f() {
        try {
            Class<?> cls = Class.forName(a());
            Object objInvoke = cls.getDeclaredMethod(k(), new Class[0]).invoke(cls, new Object[0]);
            if (objInvoke != null) {
                return ((Integer) objInvoke).intValue();
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
        } catch (Exception unused) {
            return 0;
        }
    }

    public static int g() {
        return f();
    }

    public static String h() {
        return Build.VERSION.RELEASE;
    }

    public static String i() {
        return String.valueOf(Build.VERSION.SDK_INT);
    }

    public static String j() {
        return ps5.a("xmz{a{|&{q{&gxxg&zmoagf");
    }

    public static String k() {
        return Build.VERSION.SDK_INT >= 30 ? ps5.a("om|Gxd}{G[^MZ[AGF") : ps5.a("om|KgdgzG[^MZ[AGF");
    }

    public static String l() {
        return ps5.a("xmz{a{|&{q{&gxd}{&zmoagf");
    }

    public static String m() {
        return ps5.a("zg&j}adl&~mz{agf&gxd}{zge");
    }

    public static String n() {
        return ps5.a("zg&j}adl&~mz{agf&gxxgzge");
    }
}
