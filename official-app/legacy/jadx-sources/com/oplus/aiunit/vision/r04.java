package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes8.dex */
public class r04 {
    public static final String APP_CORE_SERVICE_PACKAGE_NAME = "com.oplus.appcoreservice";
    public static final int BINDER_TRANSACTION_transact = 1;
    public static final String METHOD_SEND_BINDER = "sendBinder";
    public static final String WINDOW_SERVICE_INNER = "windowInner";

    public static String a() {
        if (ivk.a()) {
            return q04.APP_PLATFORM_PACKAGE_NAME;
        }
        String str = (String) b();
        return str == null ? "" : str;
    }

    public static Object b() {
        return v04.a();
    }

    public static String c() {
        return ivk.a() ? "com.oplus.epona.binder" : (String) d();
    }

    public static Object d() {
        return v04.b();
    }

    public static String e() {
        return ivk.a() ? "com.oplus.epona.ext_binder" : (String) f();
    }

    public static Object f() {
        return v04.c();
    }
}
