package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes16.dex */
public class lp5 {
    public static long a() {
        return c().B("dm_coupon_close_time", 0L);
    }

    public static long b() {
        return c().B("dm_coupon_interval", 0L);
    }

    public static v9g c() {
        return v9g.x("dm_coupon_close_data");
    }

    public static long d(String str) {
        return f().B("dm_trade_in_close_time-" + str, 0L);
    }

    public static long e(String str) {
        return f().B("dm_trade_in_interval-" + str, 0L);
    }

    public static v9g f() {
        return v9g.x("dm_trade_in_data");
    }

    public static void g(long j2) {
        c().T("dm_coupon_close_time", j2);
    }

    public static void h(long j2) {
        c().T("dm_coupon_interval", j2);
    }

    public static void i(String str, long j2) {
        f().T("dm_trade_in_close_time-" + str, j2);
    }

    public static void j(String str, long j2) {
        f().T("dm_trade_in_interval-" + str, j2);
    }
}
