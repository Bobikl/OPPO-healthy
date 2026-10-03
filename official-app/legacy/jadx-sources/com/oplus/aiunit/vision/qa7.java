package com.oplus.aiunit.vision;

import com.garmin.fit.Profile$Type;

/* JADX INFO: loaded from: classes13.dex */
public class qa7 extends bxb {
    public static final int HardwareVersionFieldNum = 1;
    public static final int SoftwareVersionFieldNum = 0;
    public static final bxb h;

    static {
        bxb bxbVar = new bxb("file_creator", 49);
        h = bxbVar;
        bxbVar.e(new w97("software_version", 0, 132, 1.0d, 0.0d, "", false, Profile$Type.UINT16));
        bxbVar.e(new w97("hardware_version", 1, 2, 1.0d, 0.0d, "", false, Profile$Type.UINT8));
    }

    public qa7(bxb bxbVar) {
        super(bxbVar);
    }
}
