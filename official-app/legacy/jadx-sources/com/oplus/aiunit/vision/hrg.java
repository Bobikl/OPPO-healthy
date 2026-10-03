package com.oplus.aiunit.vision;

import com.garmin.fit.Profile$Type;
import com.oplus.smartenginehelper.entity.ViewEntity;

/* JADX INFO: loaded from: classes13.dex */
public class hrg extends bxb {
    public static final int DefaultRaceLeaderFieldNum = 6;
    public static final int DeleteStatusFieldNum = 7;
    public static final int DeviceIdFieldNum = 5;
    public static final int EnabledFieldNum = 3;
    public static final int NameFieldNum = 0;
    public static final int SelectionTypeFieldNum = 8;
    public static final int SportFieldNum = 2;
    public static final int UserProfilePrimaryKeyFieldNum = 4;
    public static final int UuidFieldNum = 1;
    public static final bxb h;

    static {
        bxb bxbVar = new bxb("segment_id", 148);
        h = bxbVar;
        Profile$Type profile$Type = Profile$Type.STRING;
        bxbVar.e(new w97("name", 0, 7, 1.0d, 0.0d, "", false, profile$Type));
        bxbVar.e(new w97("uuid", 1, 7, 1.0d, 0.0d, "", false, profile$Type));
        bxbVar.e(new w97("sport", 2, 0, 1.0d, 0.0d, "", false, Profile$Type.SPORT));
        bxbVar.e(new w97(ViewEntity.ENABLED, 3, 0, 1.0d, 0.0d, "", false, Profile$Type.BOOL));
        Profile$Type profile$Type2 = Profile$Type.UINT32;
        bxbVar.e(new w97("user_profile_primary_key", 4, 134, 1.0d, 0.0d, "", false, profile$Type2));
        bxbVar.e(new w97("device_id", 5, 134, 1.0d, 0.0d, "", false, profile$Type2));
        bxbVar.e(new w97("default_race_leader", 6, 2, 1.0d, 0.0d, "", false, Profile$Type.UINT8));
        bxbVar.e(new w97("delete_status", 7, 0, 1.0d, 0.0d, "", false, Profile$Type.SEGMENT_DELETE_STATUS));
        bxbVar.e(new w97("selection_type", 8, 0, 1.0d, 0.0d, "", false, Profile$Type.SEGMENT_SELECTION_TYPE));
    }

    public hrg(bxb bxbVar) {
        super(bxbVar);
    }
}
