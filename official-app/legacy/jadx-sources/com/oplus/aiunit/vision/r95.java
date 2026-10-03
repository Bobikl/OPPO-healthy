package com.oplus.aiunit.vision;

import com.garmin.fit.Profile$Type;

/* JADX INFO: loaded from: classes13.dex */
public class r95 extends bxb {
    public static final int ApplicationIdFieldNum = 1;
    public static final int ApplicationVersionFieldNum = 4;
    public static final int DeveloperDataIndexFieldNum = 3;
    public static final int DeveloperIdFieldNum = 0;
    public static final int ManufacturerIdFieldNum = 2;
    public static final bxb h;

    static {
        bxb bxbVar = new bxb("developer_data_id", 207);
        h = bxbVar;
        Profile$Type profile$Type = Profile$Type.BYTE;
        bxbVar.e(new w97("developer_id", 0, 13, 1.0d, 0.0d, "", false, profile$Type));
        bxbVar.e(new w97("application_id", 1, 13, 1.0d, 0.0d, "", false, profile$Type));
        bxbVar.e(new w97("manufacturer_id", 2, 132, 1.0d, 0.0d, "", false, Profile$Type.MANUFACTURER));
        bxbVar.e(new w97("developer_data_index", 3, 2, 1.0d, 0.0d, "", false, Profile$Type.UINT8));
        bxbVar.e(new w97("application_version", 4, 134, 1.0d, 0.0d, "", false, Profile$Type.UINT32));
    }

    public r95() {
        super(w07.b(207));
    }

    public Short z() {
        return n(3, 0, 65535);
    }

    public r95(bxb bxbVar) {
        super(bxbVar);
    }
}
