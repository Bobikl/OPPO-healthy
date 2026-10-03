package com.oplus.aiunit.vision;

import com.garmin.fit.Profile$Type;

/* JADX INFO: loaded from: classes13.dex */
public class xeg extends bxb {
    public static final int CompletedFieldNum = 4;
    public static final int ManufacturerFieldNum = 0;
    public static final int ProductFieldNum = 1;
    public static final int ScheduledTimeFieldNum = 6;
    public static final int SerialNumberFieldNum = 2;
    public static final int TimeCreatedFieldNum = 3;
    public static final int TypeFieldNum = 5;
    public static final bxb h;

    static {
        bxb bxbVar = new bxb("schedule", 28);
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
        bxbVar.e(new w97("serial_number", 2, 140, 1.0d, 0.0d, "", false, Profile$Type.UINT32Z));
        bxbVar.e(new w97("time_created", 3, 134, 1.0d, 0.0d, "", false, Profile$Type.DATE_TIME));
        bxbVar.e(new w97("completed", 4, 0, 1.0d, 0.0d, "", false, Profile$Type.BOOL));
        bxbVar.e(new w97("type", 5, 0, 1.0d, 0.0d, "", false, Profile$Type.SCHEDULE));
        bxbVar.e(new w97("scheduled_time", 6, 134, 1.0d, 0.0d, "", false, Profile$Type.LOCAL_DATE_TIME));
    }

    public xeg(bxb bxbVar) {
        super(bxbVar);
    }
}
