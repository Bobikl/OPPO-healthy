package com.oplus.aiunit.vision;

import com.garmin.fit.Profile$Type;

/* JADX INFO: loaded from: classes13.dex */
public class r60 extends bxb {
    public static final int ChannelNumberFieldNum = 3;
    public static final int DataFieldNum = 4;
    public static final int FractionalTimestampFieldNum = 0;
    public static final int MesgDataFieldNum = 2;
    public static final int MesgIdFieldNum = 1;
    public static final int TimestampFieldNum = 253;
    public static final bxb h;

    static {
        bxb bxbVar = new bxb("ant_tx", 81);
        h = bxbVar;
        bxbVar.e(new w97("timestamp", 253, 134, 1.0d, 0.0d, "s", false, Profile$Type.DATE_TIME));
        bxbVar.e(new w97("fractional_timestamp", 0, 132, 32768.0d, 0.0d, "s", false, Profile$Type.UINT16));
        Profile$Type profile$Type = Profile$Type.BYTE;
        bxbVar.e(new w97("mesg_id", 1, 13, 1.0d, 0.0d, "", false, profile$Type));
        bxbVar.e(new w97("mesg_data", 2, 13, 1.0d, 0.0d, "", false, profile$Type));
        bxbVar.d.get(3).f18167j.add(new da7(3, false, 8, 1.0d, 0.0d));
        bxbVar.d.get(3).f18167j.add(new da7(4, false, 8, 1.0d, 0.0d));
        bxbVar.d.get(3).f18167j.add(new da7(4, false, 8, 1.0d, 0.0d));
        bxbVar.d.get(3).f18167j.add(new da7(4, false, 8, 1.0d, 0.0d));
        bxbVar.d.get(3).f18167j.add(new da7(4, false, 8, 1.0d, 0.0d));
        bxbVar.d.get(3).f18167j.add(new da7(4, false, 8, 1.0d, 0.0d));
        bxbVar.d.get(3).f18167j.add(new da7(4, false, 8, 1.0d, 0.0d));
        bxbVar.d.get(3).f18167j.add(new da7(4, false, 8, 1.0d, 0.0d));
        bxbVar.d.get(3).f18167j.add(new da7(4, false, 8, 1.0d, 0.0d));
        bxbVar.e(new w97("channel_number", 3, 2, 1.0d, 0.0d, "", false, Profile$Type.UINT8));
        bxbVar.e(new w97("data", 4, 13, 1.0d, 0.0d, "", false, profile$Type));
    }

    public r60(bxb bxbVar) {
        super(bxbVar);
    }
}
