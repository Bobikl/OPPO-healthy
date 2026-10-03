package com.oplus.aiunit.vision;

import com.garmin.fit.Profile$Type;
import com.oplus.utrace.db.UTraceSQLiteHelperKt;

/* JADX INFO: loaded from: classes13.dex */
public class ma7 extends bxb {
    public static final int DirectoryFieldNum = 2;
    public static final int FlagsFieldNum = 1;
    public static final int MaxCountFieldNum = 3;
    public static final int MaxSizeFieldNum = 4;
    public static final int MessageIndexFieldNum = 254;
    public static final int TypeFieldNum = 0;
    public static final bxb h;

    static {
        bxb bxbVar = new bxb("file_capabilities", 37);
        h = bxbVar;
        bxbVar.e(new w97("message_index", 254, 132, 1.0d, 0.0d, "", false, Profile$Type.MESSAGE_INDEX));
        bxbVar.e(new w97("type", 0, 0, 1.0d, 0.0d, "", false, Profile$Type.FILE));
        bxbVar.e(new w97(UTraceSQLiteHelperKt.COL_FLAGS, 1, 10, 1.0d, 0.0d, "", false, Profile$Type.FILE_FLAGS));
        bxbVar.e(new w97("directory", 2, 7, 1.0d, 0.0d, "", false, Profile$Type.STRING));
        bxbVar.e(new w97("max_count", 3, 132, 1.0d, 0.0d, "", false, Profile$Type.UINT16));
        bxbVar.e(new w97("max_size", 4, 134, 1.0d, 0.0d, "bytes", false, Profile$Type.UINT32));
    }

    public ma7(bxb bxbVar) {
        super(bxbVar);
    }
}
