package com.oplus.aiunit.vision;

import com.garmin.fit.Profile$Type;
import com.tencent.mm.opensdk.constants.ConstantsAPI;

/* JADX INFO: loaded from: classes13.dex */
public class lrg extends bxb {
    public static final int ActivityIdFieldNum = 3;
    public static final int ActivityIdStringFieldNum = 5;
    public static final int GroupPrimaryKeyFieldNum = 2;
    public static final int MessageIndexFieldNum = 254;
    public static final int NameFieldNum = 0;
    public static final int SegmentTimeFieldNum = 4;
    public static final int TypeFieldNum = 1;
    public static final bxb h;

    static {
        bxb bxbVar = new bxb("segment_leaderboard_entry", 149);
        h = bxbVar;
        bxbVar.e(new w97("message_index", 254, 132, 1.0d, 0.0d, "", false, Profile$Type.MESSAGE_INDEX));
        Profile$Type profile$Type = Profile$Type.STRING;
        bxbVar.e(new w97("name", 0, 7, 1.0d, 0.0d, "", false, profile$Type));
        bxbVar.e(new w97("type", 1, 0, 1.0d, 0.0d, "", false, Profile$Type.SEGMENT_LEADERBOARD_TYPE));
        Profile$Type profile$Type2 = Profile$Type.UINT32;
        bxbVar.e(new w97("group_primary_key", 2, 134, 1.0d, 0.0d, "", false, profile$Type2));
        bxbVar.e(new w97(ConstantsAPI.WXWebPage.KEY_ACTIVITY_ID, 3, 134, 1.0d, 0.0d, "", false, profile$Type2));
        bxbVar.e(new w97("segment_time", 4, 134, 1000.0d, 0.0d, "s", false, profile$Type2));
        bxbVar.e(new w97("activity_id_string", 5, 7, 1.0d, 0.0d, "", false, profile$Type));
    }

    public lrg(bxb bxbVar) {
        super(bxbVar);
    }
}
