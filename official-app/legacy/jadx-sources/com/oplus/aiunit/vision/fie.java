package com.oplus.aiunit.vision;

import android.os.Build;
import android.text.TextUtils;
import com.oplus.pay.opensdk.statistic.helper.DigestHelper;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class fie {
    @NotNull
    public static String a() {
        return Build.VERSION.SDK_INT >= 30 ? DigestHelper.g("kge&gxd}{&g{&Gxd}{J}adl") : DigestHelper.g("kge&kgdgz&g{&KgdgzJ}adl");
    }

    public static long b() {
        return Build.TIME;
    }

    public static String c() {
        return d();
    }

    public static String d() {
        String strA = rkj.a(m());
        return TextUtils.isEmpty(strA) ? rkj.a(n()) : strA;
    }

    public static String e() {
        String strA = rkj.a(l());
        if (strA.isEmpty()) {
            strA = rkj.b(j(), "CN");
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
        return DigestHelper.g("xmz{a{|&{q{&gxxg&zmoagf");
    }

    public static String k() {
        return Build.VERSION.SDK_INT >= 30 ? DigestHelper.g("om|Gxd}{G[^MZ[AGF") : DigestHelper.g("om|KgdgzG[^MZ[AGF");
    }

    public static String l() {
        return DigestHelper.g("xmz{a{|&{q{&gxd}{&zmoagf");
    }

    public static String m() {
        return DigestHelper.g("zg&j}adl&~mz{agf&gxd}{zge");
    }

    public static String n() {
        return DigestHelper.g("zg&j}adl&~mz{agf&gxxgzge");
    }
}
