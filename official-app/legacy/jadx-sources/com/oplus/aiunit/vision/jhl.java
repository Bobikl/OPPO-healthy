package com.oplus.aiunit.vision;

import com.garmin.fit.Profile$Type;
import com.oplus.smartenginehelper.ParserTag;

/* JADX INFO: loaded from: classes13.dex */
public class jhl extends bxb {
    public static final int LayoutFieldNum = 1;
    public static final int MessageIndexFieldNum = 254;
    public static final int ModeFieldNum = 0;
    public static final bxb h;

    static {
        bxb bxbVar = new bxb("watchface_settings", 159);
        h = bxbVar;
        bxbVar.e(new w97("message_index", 254, 132, 1.0d, 0.0d, "", false, Profile$Type.MESSAGE_INDEX));
        bxbVar.e(new w97("mode", 0, 0, 1.0d, 0.0d, "", false, Profile$Type.WATCHFACE_MODE));
        bxbVar.e(new w97(ParserTag.CHILD_LAYOUT, 1, 13, 1.0d, 0.0d, "", false, Profile$Type.BYTE));
        bxbVar.d.get(2).k.add(new p2j("digital_layout", 0, 1.0d, 0.0d, ""));
        bxbVar.d.get(2).k.get(0).b(0, 0L);
        bxbVar.d.get(2).k.add(new p2j("analog_layout", 0, 1.0d, 0.0d, ""));
        bxbVar.d.get(2).k.get(1).b(0, 1L);
    }

    public jhl(bxb bxbVar) {
        super(bxbVar);
    }
}
