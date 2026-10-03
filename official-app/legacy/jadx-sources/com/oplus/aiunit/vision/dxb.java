package com.oplus.aiunit.vision;

import com.garmin.fit.Profile$Type;
import com.heytap.webview.extension.protocol.Const;

/* JADX INFO: loaded from: classes13.dex */
public class dxb extends bxb {
    public static final int CountFieldNum = 3;
    public static final int CountTypeFieldNum = 2;
    public static final int FileFieldNum = 0;
    public static final int MesgNumFieldNum = 1;
    public static final int MessageIndexFieldNum = 254;
    public static final bxb h;

    static {
        bxb bxbVar = new bxb("mesg_capabilities", 38);
        h = bxbVar;
        bxbVar.e(new w97("message_index", 254, 132, 1.0d, 0.0d, "", false, Profile$Type.MESSAGE_INDEX));
        bxbVar.e(new w97(Const.Scheme.SCHEME_FILE, 0, 0, 1.0d, 0.0d, "", false, Profile$Type.FILE));
        bxbVar.e(new w97("mesg_num", 1, 132, 1.0d, 0.0d, "", false, Profile$Type.MESG_NUM));
        bxbVar.e(new w97("count_type", 2, 0, 1.0d, 0.0d, "", false, Profile$Type.MESG_COUNT));
        bxbVar.e(new w97("count", 3, 132, 1.0d, 0.0d, "", false, Profile$Type.UINT16));
        bxbVar.d.get(4).k.add(new p2j("num_per_file", 132, 1.0d, 0.0d, ""));
        bxbVar.d.get(4).k.get(0).b(2, 0L);
        bxbVar.d.get(4).k.add(new p2j("max_per_file", 132, 1.0d, 0.0d, ""));
        bxbVar.d.get(4).k.get(1).b(2, 1L);
        bxbVar.d.get(4).k.add(new p2j("max_per_file_type", 132, 1.0d, 0.0d, ""));
        bxbVar.d.get(4).k.get(2).b(2, 2L);
    }

    public dxb(bxb bxbVar) {
        super(bxbVar);
    }
}
