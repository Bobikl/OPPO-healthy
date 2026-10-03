package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes16.dex */
public class bs5 {
    public static final String SP_KEY_HOME_SPACE_INTERVAL = "homeSpaceInterval";
    public static final String SP_KEY_SHOW_HOME_SPACE_TIME = "showHomeSpaceTime";
    public static final String SP_KEY_SHOW_SPACE_TIME = "showSpaceTime";
    public static final String SP_KEY_SPACE_INTERVAL = "spaceInterval";
    public static final String SP_NAME = "app_dialog_section_limit";

    public static boolean a(long j2, int i) {
        boolean z = System.currentTimeMillis() - j2 > ((((long) i) * 60) * 60) * 1000;
        StringBuilder sb = new StringBuilder();
        sb.append("isShowSpace: ");
        sb.append(z);
        sb.append(" lastTime: ");
        sb.append(j2);
        sb.append(" interval: ");
        sb.append(i);
        return z;
    }

    public static boolean b() {
        return a(v9g.x(SP_NAME).B(SP_KEY_SHOW_HOME_SPACE_TIME, 0L), v9g.x(SP_NAME).z(SP_KEY_HOME_SPACE_INTERVAL, 72));
    }

    public static boolean c() {
        return a(v9g.x(SP_NAME).B(SP_KEY_SHOW_SPACE_TIME, 0L), v9g.x(SP_NAME).z(SP_KEY_SPACE_INTERVAL, 72));
    }

    public static void d(int i) {
        v9g.x(SP_NAME).S(SP_KEY_HOME_SPACE_INTERVAL, i);
    }

    public static void e(long j2) {
        v9g.x(SP_NAME).T(SP_KEY_SHOW_HOME_SPACE_TIME, j2);
    }

    public static void f(long j2) {
        v9g.x(SP_NAME).T(SP_KEY_SHOW_SPACE_TIME, j2);
    }

    public static void g(int i) {
        v9g.x(SP_NAME).S(SP_KEY_SPACE_INTERVAL, i);
    }
}
