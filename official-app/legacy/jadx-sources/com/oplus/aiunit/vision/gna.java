package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes17.dex */
public class gna {
    public static boolean a() {
        return v9g.x("SpKeyKeepAliveSettings").q("SpKeyAutoStart");
    }

    public static boolean b() {
        return v9g.x("SpKeyKeepAliveSettings").q("SpKeyMistakeClean");
    }

    public static boolean c() {
        return e() == 0;
    }

    public static boolean d() {
        return v9g.x("SpKeyKeepAliveSettings").q("SpKeyBatteryManagerClose");
    }

    public static int e() {
        return v9g.x("SpKeyKeepAliveSettings").z("SpKeyKeepUndoneStep", -1);
    }
}
