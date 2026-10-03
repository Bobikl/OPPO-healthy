package com.oplus.aiunit.vision;

import com.garmin.fit.Profile$Type;

/* JADX INFO: loaded from: classes13.dex */
public class n60 extends bxb {
    public static final int ChannelNumberFieldNum = 0;
    public static final int DeviceIndexFieldNum = 4;
    public static final int DeviceNumberFieldNum = 2;
    public static final int DeviceTypeFieldNum = 1;
    public static final int TransmissionTypeFieldNum = 3;
    public static final bxb h;

    static {
        bxb bxbVar = new bxb("ant_channel_id", 82);
        h = bxbVar;
        bxbVar.e(new w97("channel_number", 0, 2, 1.0d, 0.0d, "", false, Profile$Type.UINT8));
        Profile$Type profile$Type = Profile$Type.UINT8Z;
        bxbVar.e(new w97("device_type", 1, 10, 1.0d, 0.0d, "", false, profile$Type));
        bxbVar.e(new w97("device_number", 2, 139, 1.0d, 0.0d, "", false, Profile$Type.UINT16Z));
        bxbVar.e(new w97("transmission_type", 3, 10, 1.0d, 0.0d, "", false, profile$Type));
        bxbVar.e(new w97("device_index", 4, 2, 1.0d, 0.0d, "", false, Profile$Type.DEVICE_INDEX));
    }

    public n60(bxb bxbVar) {
        super(bxbVar);
    }
}
