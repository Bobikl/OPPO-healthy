package com.oplus.aiunit.vision;

import com.garmin.fit.Profile$Type;

/* JADX INFO: loaded from: classes13.dex */
public class esb extends bxb {
    public static final int DataFieldNum = 4;
    public static final int FieldNumFieldNum = 3;
    public static final int MemoFieldNum = 0;
    public static final int MesgNumFieldNum = 1;
    public static final int ParentIndexFieldNum = 2;
    public static final int PartIndexFieldNum = 250;
    public static final bxb h;

    static {
        bxb bxbVar = new bxb("memo_glob", 145);
        h = bxbVar;
        bxbVar.e(new w97("part_index", 250, 134, 1.0d, 0.0d, "", false, Profile$Type.UINT32));
        bxbVar.e(new w97(j3n.b, 0, 13, 1.0d, 0.0d, "", false, Profile$Type.BYTE));
        bxbVar.e(new w97("mesg_num", 1, 132, 1.0d, 0.0d, "", false, Profile$Type.MESG_NUM));
        bxbVar.e(new w97("parent_index", 2, 132, 1.0d, 0.0d, "", false, Profile$Type.MESSAGE_INDEX));
        bxbVar.e(new w97("field_num", 3, 2, 1.0d, 0.0d, "", false, Profile$Type.UINT8));
        bxbVar.e(new w97("data", 4, 10, 1.0d, 0.0d, "", false, Profile$Type.UINT8Z));
    }

    public esb(bxb bxbVar) {
        super(bxbVar);
    }
}
