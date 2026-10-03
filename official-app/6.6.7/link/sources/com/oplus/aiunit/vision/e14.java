package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public class e14 {
    public static final String APP_CORE_SERVICE_PACKAGE_NAME = "com.oplus.appcoreservice";
    public static final int BINDER_TRANSACTION_transact = 1;
    public static final String METHOD_SEND_BINDER = "sendBinder";
    public static final String WINDOW_SERVICE_INNER = "windowInner";

    public static String a() {
        if (gzk.a()) {
            return d14.APP_PLATFORM_PACKAGE_NAME;
        }
        String str = (String) b();
        return str == null ? "" : str;
    }

    public static Object b() {
        return i14.a();
    }

    public static String c() {
        return gzk.a() ? "com.oplus.epona.binder" : (String) d();
    }

    public static Object d() {
        return i14.b();
    }

    public static String e() {
        return gzk.a() ? "com.oplus.epona.ext_binder" : (String) f();
    }

    public static Object f() {
        return i14.c();
    }
}
