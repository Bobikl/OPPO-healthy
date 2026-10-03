package com.heytap.health.watchface.utils;

import com.oplus.aiunit.vision.c0;
import com.oplus.aiunit.vision.ltl;

/* JADX INFO: loaded from: classes19.dex */
public class RsWfPacker {
    public static final int SUCCESS = 0;

    public static class a {
        public static final RsWfPacker a = new RsWfPacker();
    }

    static {
        System.loadLibrary("rs_watchface_packer");
    }

    public static RsWfPacker b() {
        return a.a;
    }

    public int a(String str, String str2) {
        ltl.a("RsWfPacker", "fileDir " + str + " outPath " + str2);
        return pack(str, str2, str, c0.SPNAME);
    }

    public native int pack(String str, String str2, String str3, String str4);

    public RsWfPacker() {
    }
}
