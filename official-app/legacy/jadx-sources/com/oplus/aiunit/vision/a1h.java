package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes2.dex */
public class a1h {
    public static final String FITNESS_SHARE = "6";
    public static final String RUN_SHARE = "4";
    public static final String SHARE_INDOOR_BTN = "3";
    public static final String SHARE_RUN_BTN = "1";
    public static final String SHARE_WALK_BTN = "2";
    public static final String WALK_SHARE = "5";
    public static final String YOGA_SHARE = "7";

    public static String a(int i) {
        if (oei.j(i)) {
            return "4";
        }
        if (oei.m(i)) {
            return "5";
        }
        if (oei.d(i)) {
            return "6";
        }
        return i == 12 ? "7" : "";
    }
}
