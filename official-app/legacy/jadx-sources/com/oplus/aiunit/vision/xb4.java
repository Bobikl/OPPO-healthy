package com.oplus.aiunit.vision;

import com.garmin.fit.Profile$Type;
import com.heytap.log.formatter.LogFieldKey;

/* JADX INFO: loaded from: classes13.dex */
public class xb4 extends bxb {
    public static final int DistanceFieldNum = 4;
    public static final int FavoriteFieldNum = 8;
    public static final int MessageIndexFieldNum = 254;
    public static final int NameFieldNum = 6;
    public static final int PositionLatFieldNum = 2;
    public static final int PositionLongFieldNum = 3;
    public static final int TimestampFieldNum = 1;
    public static final int TypeFieldNum = 5;
    public static final bxb h;

    static {
        bxb bxbVar = new bxb("course_point", 32);
        h = bxbVar;
        bxbVar.e(new w97("message_index", 254, 132, 1.0d, 0.0d, "", false, Profile$Type.MESSAGE_INDEX));
        bxbVar.e(new w97("timestamp", 1, 134, 1.0d, 0.0d, "", false, Profile$Type.DATE_TIME));
        Profile$Type profile$Type = Profile$Type.SINT32;
        bxbVar.e(new w97("position_lat", 2, 133, 1.0d, 0.0d, "semicircles", false, profile$Type));
        bxbVar.e(new w97("position_long", 3, 133, 1.0d, 0.0d, "semicircles", false, profile$Type));
        bxbVar.e(new w97("distance", 4, 134, 100.0d, 0.0d, LogFieldKey.MESSAGE_KEY, false, Profile$Type.UINT32));
        bxbVar.e(new w97("type", 5, 0, 1.0d, 0.0d, "", false, Profile$Type.COURSE_POINT));
        bxbVar.e(new w97("name", 6, 7, 1.0d, 0.0d, "", false, Profile$Type.STRING));
        bxbVar.e(new w97("favorite", 8, 0, 1.0d, 0.0d, "", false, Profile$Type.BOOL));
    }

    public xb4(bxb bxbVar) {
        super(bxbVar);
    }
}
