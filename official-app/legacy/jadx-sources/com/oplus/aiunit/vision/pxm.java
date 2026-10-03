package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes12.dex */
public final class pxm {
    public static final String[] a = {"com.amap.api.services", "com.amap.api.search.admic"};

    public static v0n a(boolean z) {
        try {
            return new v0n.a("sea", "9.7.4", "AMAP SDK Android Search 9.7.4").c(a).b(z).a("9.7.4").d();
        } catch (com.amap.api.col.p0003sl.ik e2) {
            qxm.g(e2, "ConfigableConst", "getSDKInfo");
            return null;
        }
    }

    public static String b() {
        return qvg.b().d() == 1 ? "http://restsdk.amap.com/v3" : "https://restsdk.amap.com/v3";
    }
}
