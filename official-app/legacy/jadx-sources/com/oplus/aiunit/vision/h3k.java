package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes15.dex */
public class h3k {
    public static final int MAIN_ACTIVITY_TAB_DEVICE = 4;
    public static final int MAIN_ACTIVITY_TAB_HEALTH = 1;
    public static final int MAIN_ACTIVITY_TAB_HOME = 0;
    public static int a = -1;

    public static boolean a(String str) {
        boolean z = str.startsWith("com.heytap.health") || str.startsWith("com.heytap.device") || str.startsWith("com.heytap.wsport") || str.startsWith("com.heytap.sporthealth") || str.startsWith("com.heytap.sports") || str.startsWith("com.heytap.wearable");
        a7b.f("TouristInterceptChooser", "isAppRoutes:" + z);
        StringBuilder sb = new StringBuilder();
        sb.append("isAppRoutes destination:");
        sb.append(str);
        return z;
    }

    public static boolean b() {
        return a != 4;
    }

    public static boolean c(String str) {
        try {
            boolean zIsAssignableFrom = s3k.class.isAssignableFrom(Class.forName(str));
            a7b.f("TouristInterceptChooser", "isTrueSubClass:" + zIsAssignableFrom);
            return zIsAssignableFrom;
        } catch (ClassNotFoundException e2) {
            a7b.b("TouristInterceptChooser", "needInterceptRouter classCastException:" + e2.getMessage());
            return false;
        }
    }

    public static boolean d() {
        return f() || e();
    }

    public static boolean e() {
        a7b.f("TouristInterceptChooser", "needInterceptByLogin granted:" + m3k.f());
        return m3k.d() && !m3k.f();
    }

    public static boolean f() {
        boolean zB = b();
        boolean zH = m3k.h();
        boolean zG = m3k.g();
        a7b.f("TouristInterceptChooser", "needInterceptByProto needIntercept hasAgreeDevice:" + zG + ",hasAgreeHealth:" + zH + ",isInHealthPage:" + zB);
        boolean z = ((zB && zH) || zG) ? false : true;
        a7b.f("TouristInterceptChooser", "needInterceptByProto final needIntercept:" + z);
        return m3k.d() && z;
    }

    public static boolean g() {
        return !m3k.i();
    }

    public static void h(int i) {
        a7b.f("TouristInterceptChooser", "setMainActivityTab:" + i);
        a = i;
    }
}
