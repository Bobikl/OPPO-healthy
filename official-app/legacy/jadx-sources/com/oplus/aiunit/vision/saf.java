package com.oplus.aiunit.vision;

import com.garmin.fit.Profile$Type;
import com.oplus.smartenginehelper.entity.ClickApiEntity;

/* JADX INFO: loaded from: classes13.dex */
public class saf extends bxb {
    public static final int DataFieldNum = 1;
    public static final int GapFieldNum = 4;
    public static final int QualityFieldNum = 3;
    public static final int TimeFieldNum = 2;
    public static final int TimestampFieldNum = 253;
    public static final int TimestampMsFieldNum = 0;
    public static final bxb h;

    static {
        bxb bxbVar = new bxb("raw_bbi", ixb.RAW_BBI);
        h = bxbVar;
        bxbVar.e(new w97("timestamp", 253, 134, 1.0d, 0.0d, "", false, Profile$Type.DATE_TIME));
        Profile$Type profile$Type = Profile$Type.UINT16;
        bxbVar.e(new w97("timestamp_ms", 0, 132, 1.0d, 0.0d, "ms", false, profile$Type));
        bxbVar.e(new w97("data", 1, 132, 1.0d, 0.0d, "", false, profile$Type));
        bxbVar.d.get(2).f18167j.add(new da7(2, false, 14, 1.0d, 0.0d));
        bxbVar.d.get(2).f18167j.add(new da7(3, false, 1, 1.0d, 0.0d));
        bxbVar.d.get(2).f18167j.add(new da7(4, false, 1, 1.0d, 0.0d));
        bxbVar.d.get(2).f18167j.add(new da7(2, false, 14, 1.0d, 0.0d));
        bxbVar.d.get(2).f18167j.add(new da7(3, false, 1, 1.0d, 0.0d));
        bxbVar.d.get(2).f18167j.add(new da7(4, false, 1, 1.0d, 0.0d));
        bxbVar.d.get(2).f18167j.add(new da7(2, false, 14, 1.0d, 0.0d));
        bxbVar.d.get(2).f18167j.add(new da7(3, false, 1, 1.0d, 0.0d));
        bxbVar.d.get(2).f18167j.add(new da7(4, false, 1, 1.0d, 0.0d));
        bxbVar.d.get(2).f18167j.add(new da7(2, false, 14, 1.0d, 0.0d));
        bxbVar.d.get(2).f18167j.add(new da7(3, false, 1, 1.0d, 0.0d));
        bxbVar.d.get(2).f18167j.add(new da7(4, false, 1, 1.0d, 0.0d));
        bxbVar.d.get(2).f18167j.add(new da7(2, false, 14, 1.0d, 0.0d));
        bxbVar.d.get(2).f18167j.add(new da7(3, false, 1, 1.0d, 0.0d));
        bxbVar.d.get(2).f18167j.add(new da7(4, false, 1, 1.0d, 0.0d));
        bxbVar.d.get(2).f18167j.add(new da7(2, false, 14, 1.0d, 0.0d));
        bxbVar.d.get(2).f18167j.add(new da7(3, false, 1, 1.0d, 0.0d));
        bxbVar.d.get(2).f18167j.add(new da7(4, false, 1, 1.0d, 0.0d));
        bxbVar.d.get(2).f18167j.add(new da7(2, false, 14, 1.0d, 0.0d));
        bxbVar.d.get(2).f18167j.add(new da7(3, false, 1, 1.0d, 0.0d));
        bxbVar.d.get(2).f18167j.add(new da7(4, false, 1, 1.0d, 0.0d));
        bxbVar.d.get(2).f18167j.add(new da7(2, false, 14, 1.0d, 0.0d));
        bxbVar.d.get(2).f18167j.add(new da7(3, false, 1, 1.0d, 0.0d));
        bxbVar.d.get(2).f18167j.add(new da7(4, false, 1, 1.0d, 0.0d));
        bxbVar.d.get(2).f18167j.add(new da7(2, false, 14, 1.0d, 0.0d));
        bxbVar.d.get(2).f18167j.add(new da7(3, false, 1, 1.0d, 0.0d));
        bxbVar.d.get(2).f18167j.add(new da7(4, false, 1, 1.0d, 0.0d));
        bxbVar.d.get(2).f18167j.add(new da7(2, false, 14, 1.0d, 0.0d));
        bxbVar.d.get(2).f18167j.add(new da7(3, false, 1, 1.0d, 0.0d));
        bxbVar.d.get(2).f18167j.add(new da7(4, false, 1, 1.0d, 0.0d));
        bxbVar.d.get(2).f18167j.add(new da7(2, false, 14, 1.0d, 0.0d));
        bxbVar.d.get(2).f18167j.add(new da7(3, false, 1, 1.0d, 0.0d));
        bxbVar.d.get(2).f18167j.add(new da7(4, false, 1, 1.0d, 0.0d));
        bxbVar.d.get(2).f18167j.add(new da7(2, false, 14, 1.0d, 0.0d));
        bxbVar.d.get(2).f18167j.add(new da7(3, false, 1, 1.0d, 0.0d));
        bxbVar.d.get(2).f18167j.add(new da7(4, false, 1, 1.0d, 0.0d));
        bxbVar.d.get(2).f18167j.add(new da7(2, false, 14, 1.0d, 0.0d));
        bxbVar.d.get(2).f18167j.add(new da7(3, false, 1, 1.0d, 0.0d));
        bxbVar.d.get(2).f18167j.add(new da7(4, false, 1, 1.0d, 0.0d));
        bxbVar.d.get(2).f18167j.add(new da7(2, false, 14, 1.0d, 0.0d));
        bxbVar.d.get(2).f18167j.add(new da7(3, false, 1, 1.0d, 0.0d));
        bxbVar.d.get(2).f18167j.add(new da7(4, false, 1, 1.0d, 0.0d));
        bxbVar.d.get(2).f18167j.add(new da7(2, false, 14, 1.0d, 0.0d));
        bxbVar.d.get(2).f18167j.add(new da7(3, false, 1, 1.0d, 0.0d));
        bxbVar.d.get(2).f18167j.add(new da7(4, false, 1, 1.0d, 0.0d));
        bxbVar.e(new w97(ClickApiEntity.TIME, 2, 132, 1.0d, 0.0d, "ms", false, profile$Type));
        Profile$Type profile$Type2 = Profile$Type.UINT8;
        bxbVar.e(new w97("quality", 3, 2, 1.0d, 0.0d, "", false, profile$Type2));
        bxbVar.e(new w97("gap", 4, 2, 1.0d, 0.0d, "", false, profile$Type2));
    }

    public saf(bxb bxbVar) {
        super(bxbVar);
    }
}
