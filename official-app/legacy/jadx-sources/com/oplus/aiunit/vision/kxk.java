package com.oplus.aiunit.vision;

import com.garmin.fit.Profile$Type;

/* JADX INFO: loaded from: classes13.dex */
public class kxk extends bxb {
    public static final int MessageCountFieldNum = 0;
    public static final int MessageIndexFieldNum = 254;
    public static final int TextFieldNum = 1;
    public static final bxb h;

    static {
        bxb bxbVar = new bxb("video_description", 186);
        h = bxbVar;
        bxbVar.e(new w97("message_index", 254, 132, 1.0d, 0.0d, "", false, Profile$Type.MESSAGE_INDEX));
        bxbVar.e(new w97("message_count", 0, 132, 1.0d, 0.0d, "", false, Profile$Type.UINT16));
        bxbVar.e(new w97("text", 1, 7, 1.0d, 0.0d, "", false, Profile$Type.STRING));
    }

    public kxk(bxb bxbVar) {
        super(bxbVar);
    }
}
