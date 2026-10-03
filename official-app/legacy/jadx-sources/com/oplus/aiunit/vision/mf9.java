package com.oplus.aiunit.vision;

import com.garmin.fit.Profile$Type;

/* JADX INFO: loaded from: classes13.dex */
public class mf9 extends bxb {
    public static final int EventTimestamp12FieldNum = 10;
    public static final int EventTimestampFieldNum = 9;
    public static final int FilteredBpmFieldNum = 6;
    public static final int FractionalTimestampFieldNum = 0;
    public static final int Time256FieldNum = 1;
    public static final int TimestampFieldNum = 253;
    public static final bxb h;

    static {
        bxb bxbVar = new bxb("hr", 132);
        h = bxbVar;
        bxbVar.e(new w97("timestamp", 253, 134, 1.0d, 0.0d, "", false, Profile$Type.DATE_TIME));
        bxbVar.e(new w97("fractional_timestamp", 0, 132, 32768.0d, 0.0d, "s", false, Profile$Type.UINT16));
        Profile$Type profile$Type = Profile$Type.UINT8;
        bxbVar.e(new w97("time256", 1, 2, 256.0d, 0.0d, "s", false, profile$Type));
        bxbVar.d.get(2).f18167j.add(new da7(0, false, 8, 256.0d, 0.0d));
        bxbVar.e(new w97("filtered_bpm", 6, 2, 1.0d, 0.0d, "bpm", false, profile$Type));
        bxbVar.e(new w97("event_timestamp", 9, 134, 1024.0d, 0.0d, "s", true, Profile$Type.UINT32));
        bxbVar.e(new w97("event_timestamp_12", 10, 13, 1.0d, 0.0d, "", false, Profile$Type.BYTE));
        bxbVar.d.get(5).f18167j.add(new da7(9, true, 12, 1024.0d, 0.0d));
        bxbVar.d.get(5).f18167j.add(new da7(9, true, 12, 1024.0d, 0.0d));
        bxbVar.d.get(5).f18167j.add(new da7(9, true, 12, 1024.0d, 0.0d));
        bxbVar.d.get(5).f18167j.add(new da7(9, true, 12, 1024.0d, 0.0d));
        bxbVar.d.get(5).f18167j.add(new da7(9, true, 12, 1024.0d, 0.0d));
        bxbVar.d.get(5).f18167j.add(new da7(9, true, 12, 1024.0d, 0.0d));
        bxbVar.d.get(5).f18167j.add(new da7(9, true, 12, 1024.0d, 0.0d));
        bxbVar.d.get(5).f18167j.add(new da7(9, true, 12, 1024.0d, 0.0d));
        bxbVar.d.get(5).f18167j.add(new da7(9, true, 12, 1024.0d, 0.0d));
        bxbVar.d.get(5).f18167j.add(new da7(9, true, 12, 1024.0d, 0.0d));
    }

    public mf9(bxb bxbVar) {
        super(bxbVar);
    }

    public Short A(int i) {
        return n(6, i, 65535);
    }

    public Float B() {
        return k(0, 0, 65535);
    }

    public int C() {
        return r(9, 65535);
    }

    public int D() {
        return r(6, 65535);
    }

    public s05 getTimestamp() {
        return x(m(253, 0, 65535));
    }

    public Float z(int i) {
        return k(9, i, 65535);
    }
}
