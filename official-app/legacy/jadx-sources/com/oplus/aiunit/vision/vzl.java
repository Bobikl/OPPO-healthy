package com.oplus.aiunit.vision;

import androidx.core.app.NotificationCompat;
import com.garmin.fit.Profile$Type;
import com.heytap.log.formatter.LogFieldKey;

/* JADX INFO: loaded from: classes13.dex */
public class vzl extends bxb {
    public static final int CapabilitiesFieldNum = 5;
    public static final int MessageIndexFieldNum = 254;
    public static final int NumValidStepsFieldNum = 6;
    public static final int PoolLengthFieldNum = 14;
    public static final int PoolLengthUnitFieldNum = 15;
    public static final int SportFieldNum = 4;
    public static final int SubSportFieldNum = 11;
    public static final int WktNameFieldNum = 8;
    public static final bxb h;

    static {
        bxb bxbVar = new bxb(NotificationCompat.CATEGORY_WORKOUT, 26);
        h = bxbVar;
        bxbVar.e(new w97("message_index", 254, 132, 1.0d, 0.0d, "", false, Profile$Type.MESSAGE_INDEX));
        bxbVar.e(new w97("sport", 4, 0, 1.0d, 0.0d, "", false, Profile$Type.SPORT));
        bxbVar.e(new w97("capabilities", 5, 140, 1.0d, 0.0d, "", false, Profile$Type.WORKOUT_CAPABILITIES));
        Profile$Type profile$Type = Profile$Type.UINT16;
        bxbVar.e(new w97("num_valid_steps", 6, 132, 1.0d, 0.0d, "", false, profile$Type));
        bxbVar.e(new w97("wkt_name", 8, 7, 1.0d, 0.0d, "", false, Profile$Type.STRING));
        bxbVar.e(new w97("sub_sport", 11, 0, 1.0d, 0.0d, "", false, Profile$Type.SUB_SPORT));
        bxbVar.e(new w97("pool_length", 14, 132, 100.0d, 0.0d, LogFieldKey.MESSAGE_KEY, false, profile$Type));
        bxbVar.e(new w97("pool_length_unit", 15, 0, 1.0d, 0.0d, "", false, Profile$Type.DISPLAY_MEASURE));
    }

    public vzl(bxb bxbVar) {
        super(bxbVar);
    }
}
