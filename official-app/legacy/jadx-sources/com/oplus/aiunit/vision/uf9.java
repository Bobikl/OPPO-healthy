package com.oplus.aiunit.vision;

import com.garmin.fit.Profile$Type;
import com.oplus.smartenginehelper.entity.ViewEntity;

/* JADX INFO: loaded from: classes13.dex */
public class uf9 extends bxb {
    public static final int EnabledFieldNum = 0;
    public static final int HrmAntIdFieldNum = 1;
    public static final int HrmAntIdTransTypeFieldNum = 3;
    public static final int LogHrvFieldNum = 2;
    public static final int MessageIndexFieldNum = 254;
    public static final bxb h;

    static {
        bxb bxbVar = new bxb("hrm_profile", 4);
        h = bxbVar;
        bxbVar.e(new w97("message_index", 254, 132, 1.0d, 0.0d, "", false, Profile$Type.MESSAGE_INDEX));
        Profile$Type profile$Type = Profile$Type.BOOL;
        bxbVar.e(new w97(ViewEntity.ENABLED, 0, 0, 1.0d, 0.0d, "", false, profile$Type));
        bxbVar.e(new w97("hrm_ant_id", 1, 139, 1.0d, 0.0d, "", false, Profile$Type.UINT16Z));
        bxbVar.e(new w97("log_hrv", 2, 0, 1.0d, 0.0d, "", false, profile$Type));
        bxbVar.e(new w97("hrm_ant_id_trans_type", 3, 10, 1.0d, 0.0d, "", false, Profile$Type.UINT8Z));
    }

    public uf9(bxb bxbVar) {
        super(bxbVar);
    }
}
