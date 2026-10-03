package com.oplus.aiunit.vision;

import com.garmin.fit.Profile$Type;
import com.oplus.drs.rom.sdk.comm.db.ClientDataEntity;

/* JADX INFO: loaded from: classes13.dex */
public class di9 extends bxb {
    public static final int DataFieldNum = 0;
    public static final int DataSizeFieldNum = 1;
    public static final int TimestampFieldNum = 253;
    public static final bxb h;

    static {
        bxb bxbVar = new bxb("hsa_configuration_data", ixb.HSA_CONFIGURATION_DATA);
        h = bxbVar;
        bxbVar.e(new w97("timestamp", 253, 134, 1.0d, 0.0d, "s", false, Profile$Type.DATE_TIME));
        bxbVar.e(new w97("data", 0, 13, 1.0d, 0.0d, "", false, Profile$Type.BYTE));
        bxbVar.e(new w97(ClientDataEntity.COL_DATA_SIZE, 1, 2, 1.0d, 0.0d, "", false, Profile$Type.UINT8));
    }

    public di9(bxb bxbVar) {
        super(bxbVar);
    }
}
