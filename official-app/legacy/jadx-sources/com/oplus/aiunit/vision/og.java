package com.oplus.aiunit.vision;

import android.os.Build;

/* JADX INFO: loaded from: classes6.dex */
public class og {
    public static final String a = ml.b("kge&gxd}{&g{&Gxd}{J}adl", 8);
    public static final String b = ml.b("om|Gxd}{G[^MZ[AGF", 8);

    public static String a() {
        return Build.VERSION.SDK_INT >= 30 ? a : ml.a("kge&kgdgz&g{&KgdgzJ}adl");
    }

    public static String b() {
        return Build.VERSION.SDK_INT >= 30 ? b : ml.a("om|KgdgzG[^MZ[AGF");
    }
}
