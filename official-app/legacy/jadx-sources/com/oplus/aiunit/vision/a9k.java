package com.oplus.aiunit.vision;

import com.garmin.fit.Profile$Type;

/* JADX INFO: loaded from: classes13.dex */
public class a9k extends bxb {
    public static final int ManufacturerFieldNum = 1;
    public static final int ProductFieldNum = 2;
    public static final int SerialNumberFieldNum = 3;
    public static final int TimeCreatedFieldNum = 4;
    public static final int TimestampFieldNum = 253;
    public static final int TypeFieldNum = 0;
    public static final bxb h;

    static {
        bxb bxbVar = new bxb("training_file", 72);
        h = bxbVar;
        Profile$Type profile$Type = Profile$Type.DATE_TIME;
        bxbVar.e(new w97("timestamp", 253, 134, 1.0d, 0.0d, "", false, profile$Type));
        bxbVar.e(new w97("type", 0, 0, 1.0d, 0.0d, "", false, Profile$Type.FILE));
        bxbVar.e(new w97("manufacturer", 1, 132, 1.0d, 0.0d, "", false, Profile$Type.MANUFACTURER));
        bxbVar.e(new w97("product", 2, 132, 1.0d, 0.0d, "", false, Profile$Type.UINT16));
        bxbVar.d.get(3).k.add(new p2j("favero_product", 132, 1.0d, 0.0d, ""));
        bxbVar.d.get(3).k.get(0).b(1, 263L);
        bxbVar.d.get(3).k.add(new p2j("garmin_product", 132, 1.0d, 0.0d, ""));
        bxbVar.d.get(3).k.get(1).b(1, 1L);
        bxbVar.d.get(3).k.get(1).b(1, 15L);
        bxbVar.d.get(3).k.get(1).b(1, 13L);
        bxbVar.d.get(3).k.get(1).b(1, 89L);
        bxbVar.e(new w97("serial_number", 3, 140, 1.0d, 0.0d, "", false, Profile$Type.UINT32Z));
        bxbVar.e(new w97("time_created", 4, 134, 1.0d, 0.0d, "", false, profile$Type));
    }

    public a9k(bxb bxbVar) {
        super(bxbVar);
    }
}
