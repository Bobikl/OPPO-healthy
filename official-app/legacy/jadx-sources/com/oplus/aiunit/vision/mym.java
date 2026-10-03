package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes12.dex */
public final class mym {
    public static volatile boolean a = false;

    public static synchronized void a() {
        if (!a) {
            com.amap.api.col.p0003sl.x.b().g("regeo", new com.amap.api.col.p0003sl.z("/geocode/regeo"));
            com.amap.api.col.p0003sl.x.b().g("placeAround", new com.amap.api.col.p0003sl.z("/place/around"));
            com.amap.api.col.p0003sl.x.b().g("placeText", new com.amap.api.col.p0003sl.y("/place/text"));
            com.amap.api.col.p0003sl.x.b().g("geo", new com.amap.api.col.p0003sl.y("/geocode/geo"));
            a = true;
        }
    }
}
