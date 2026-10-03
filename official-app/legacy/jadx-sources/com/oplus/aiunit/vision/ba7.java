package com.oplus.aiunit.vision;

import com.garmin.fit.Profile$Type;
import com.heytap.webview.extension.protocol.Const;

/* JADX INFO: loaded from: classes13.dex */
public class ba7 extends bxb {
    public static final int CountFieldNum = 3;
    public static final int FieldNumFieldNum = 2;
    public static final int FileFieldNum = 0;
    public static final int MesgNumFieldNum = 1;
    public static final int MessageIndexFieldNum = 254;
    public static final bxb h;

    static {
        bxb bxbVar = new bxb("field_capabilities", 39);
        h = bxbVar;
        bxbVar.e(new w97("message_index", 254, 132, 1.0d, 0.0d, "", false, Profile$Type.MESSAGE_INDEX));
        bxbVar.e(new w97(Const.Scheme.SCHEME_FILE, 0, 0, 1.0d, 0.0d, "", false, Profile$Type.FILE));
        bxbVar.e(new w97("mesg_num", 1, 132, 1.0d, 0.0d, "", false, Profile$Type.MESG_NUM));
        bxbVar.e(new w97("field_num", 2, 2, 1.0d, 0.0d, "", false, Profile$Type.UINT8));
        bxbVar.e(new w97("count", 3, 132, 1.0d, 0.0d, "", false, Profile$Type.UINT16));
    }

    public ba7(bxb bxbVar) {
        super(bxbVar);
    }
}
