package com.oplus.aiunit.vision;

import com.garmin.fit.Profile$Type;
import com.heytap.log.formatter.LogFieldKey;
import com.oplus.smartenginehelper.entity.ViewEntity;

/* JADX INFO: loaded from: classes13.dex */
public class vjg extends bxb {
    public static final int EnabledFieldNum = 0;
    public static final int MessageIndexFieldNum = 254;
    public static final int OdometerFieldNum = 3;
    public static final int OdometerRolloverFieldNum = 7;
    public static final int SdmAntIdFieldNum = 1;
    public static final int SdmAntIdTransTypeFieldNum = 5;
    public static final int SdmCalFactorFieldNum = 2;
    public static final int SpeedSourceFieldNum = 4;
    public static final bxb h;

    static {
        bxb bxbVar = new bxb("sdm_profile", 5);
        h = bxbVar;
        bxbVar.e(new w97("message_index", 254, 132, 1.0d, 0.0d, "", false, Profile$Type.MESSAGE_INDEX));
        Profile$Type profile$Type = Profile$Type.BOOL;
        bxbVar.e(new w97(ViewEntity.ENABLED, 0, 0, 1.0d, 0.0d, "", false, profile$Type));
        bxbVar.e(new w97("sdm_ant_id", 1, 139, 1.0d, 0.0d, "", false, Profile$Type.UINT16Z));
        bxbVar.e(new w97("sdm_cal_factor", 2, 132, 10.0d, 0.0d, "%", false, Profile$Type.UINT16));
        bxbVar.e(new w97("odometer", 3, 134, 100.0d, 0.0d, LogFieldKey.MESSAGE_KEY, false, Profile$Type.UINT32));
        bxbVar.e(new w97("speed_source", 4, 0, 1.0d, 0.0d, "", false, profile$Type));
        bxbVar.e(new w97("sdm_ant_id_trans_type", 5, 10, 1.0d, 0.0d, "", false, Profile$Type.UINT8Z));
        bxbVar.e(new w97("odometer_rollover", 7, 2, 1.0d, 0.0d, "", false, Profile$Type.UINT8));
    }

    public vjg(bxb bxbVar) {
        super(bxbVar);
    }
}
