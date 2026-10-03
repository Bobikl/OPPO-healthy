package com.oplus.aiunit.vision;

import com.garmin.fit.Profile$Type;
import com.oplus.smartenginehelper.entity.ViewEntity;

/* JADX INFO: loaded from: classes13.dex */
public class frg extends bxb {
    public static final int DefaultRaceLeaderFieldNum = 11;
    public static final int EnabledFieldNum = 3;
    public static final int FileUuidFieldNum = 1;
    public static final int LeaderActivityIdFieldNum = 9;
    public static final int LeaderActivityIdStringFieldNum = 10;
    public static final int LeaderGroupPrimaryKeyFieldNum = 8;
    public static final int LeaderTypeFieldNum = 7;
    public static final int MessageIndexFieldNum = 254;
    public static final int UserProfilePrimaryKeyFieldNum = 4;
    public static final bxb h;

    static {
        bxb bxbVar = new bxb("segment_file", 151);
        h = bxbVar;
        bxbVar.e(new w97("message_index", 254, 132, 1.0d, 0.0d, "", false, Profile$Type.MESSAGE_INDEX));
        Profile$Type profile$Type = Profile$Type.STRING;
        bxbVar.e(new w97("file_uuid", 1, 7, 1.0d, 0.0d, "", false, profile$Type));
        bxbVar.e(new w97(ViewEntity.ENABLED, 3, 0, 1.0d, 0.0d, "", false, Profile$Type.BOOL));
        Profile$Type profile$Type2 = Profile$Type.UINT32;
        bxbVar.e(new w97("user_profile_primary_key", 4, 134, 1.0d, 0.0d, "", false, profile$Type2));
        bxbVar.e(new w97("leader_type", 7, 0, 1.0d, 0.0d, "", false, Profile$Type.SEGMENT_LEADERBOARD_TYPE));
        bxbVar.e(new w97("leader_group_primary_key", 8, 134, 1.0d, 0.0d, "", false, profile$Type2));
        bxbVar.e(new w97("leader_activity_id", 9, 134, 1.0d, 0.0d, "", false, profile$Type2));
        bxbVar.e(new w97("leader_activity_id_string", 10, 7, 1.0d, 0.0d, "", false, profile$Type));
        bxbVar.e(new w97("default_race_leader", 11, 2, 1.0d, 0.0d, "", false, Profile$Type.UINT8));
    }

    public frg(bxb bxbVar) {
        super(bxbVar);
    }
}
