package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes10.dex */
public final class h0n {

    /* JADX INFO: renamed from: do, reason: not valid java name */
    public static int f133do = -1;

    /* JADX INFO: renamed from: for, reason: not valid java name */
    public static int f134for = -1;

    /* JADX INFO: renamed from: if, reason: not valid java name */
    public static boolean f135if;

    public static int a(int i) {
        int i2;
        if (f133do < 0) {
            try {
                i2 = b94.a().getPackageManager().getPackageInfo("com.oplus.onet", 0).versionCode;
            } catch (Exception e2) {
                d3d.c("EnvUtils", "getVersionCodeByPkgName:Exception:" + e2);
                i2 = 0;
            }
            d3d.b("EnvUtils", "setServiceVersionCode:versionCode=" + i2);
            f133do = i2;
        }
        int i3 = f133do;
        if (i3 == i) {
            return 0;
        }
        return i3 > i ? 1 : -1;
    }

    public static boolean b() {
        if (f134for < 0) {
            if ("com.oplus.onet".equals(b94.a().getPackageName())) {
                f135if = true;
            } else {
                f135if = false;
            }
            f134for = 1;
        }
        return f135if;
    }
}
