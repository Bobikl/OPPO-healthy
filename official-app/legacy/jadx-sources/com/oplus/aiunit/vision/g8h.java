package com.oplus.aiunit.vision;

import com.garmin.fit.Profile$Type;

/* JADX INFO: loaded from: classes13.dex */
public class g8h extends bxb {
    public static final int ManufacturerFieldNum = 0;
    public static final int ProductFieldNum = 1;
    public static final bxb h;

    static {
        bxb bxbVar = new bxb("slave_device", 106);
        h = bxbVar;
        bxbVar.e(new w97("manufacturer", 0, 132, 1.0d, 0.0d, "", false, Profile$Type.MANUFACTURER));
        bxbVar.e(new w97("product", 1, 132, 1.0d, 0.0d, "", false, Profile$Type.UINT16));
        bxbVar.d.get(1).k.add(new p2j("favero_product", 132, 1.0d, 0.0d, ""));
        bxbVar.d.get(1).k.get(0).b(0, 263L);
        bxbVar.d.get(1).k.add(new p2j("garmin_product", 132, 1.0d, 0.0d, ""));
        bxbVar.d.get(1).k.get(1).b(0, 1L);
        bxbVar.d.get(1).k.get(1).b(0, 15L);
        bxbVar.d.get(1).k.get(1).b(0, 13L);
        bxbVar.d.get(1).k.get(1).b(0, 89L);
    }

    public g8h(bxb bxbVar) {
        super(bxbVar);
    }
}
