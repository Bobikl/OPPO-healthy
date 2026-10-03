package com.oplus.aiunit.vision;

import android.content.Context;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes17.dex */
public class ikk {
    public static int a(Context context) {
        return b(context, rqk.j(context) + "p.ignore.version", 0);
    }

    public static int b(Context context, String str, int i) {
        return h().z(str, i);
    }

    public static String c(Context context) {
        return g(context, rqk.j(context) + "p.last.show.day", "");
    }

    public static int d(Context context) {
        return b(context, "p.last.upgrade.version", 0);
    }

    public static int e(Context context) {
        return b(context, "p.remind.times", 0);
    }

    public static boolean f() {
        return h().r("key_sau_upgrade_state", false);
    }

    public static String g(Context context, String str, String str2) {
        return h().E(str, str2);
    }

    public static v9g h() {
        return v9g.x("upgrade_info");
    }

    public static void i(Context context, String str, int i) {
        h().S(str, i);
    }

    public static void j(Context context, String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        h().U(str, str2);
    }

    public static void k(Context context) {
        m(context, rqk.j(context) + "p.ignore.version");
    }

    public static void l(Context context) {
        m(context, "p.remind.times");
    }

    public static void m(Context context, String str) {
        h().a0(str);
    }

    public static void n(Context context, int i) {
        i(context, rqk.j(context) + "p.ignore.version", i);
    }

    public static void o(Context context, String str) {
        j(context, rqk.j(context) + "p.last.show.day", str);
    }

    public static void p(Context context, int i) {
        i(context, "p.last.upgrade.version", i);
    }

    public static void q(Context context, int i) {
        i(context, "p.remind.times", i);
    }

    public static void r(boolean z) {
        h().W("key_sau_upgrade_state", z);
    }
}
