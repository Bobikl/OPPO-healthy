package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes19.dex */
public class b6j {
    public static final int MODE_ASSISST_SWITCH = 4;
    public static final int MODE_COMBINATION_CARD_SWITCH = 8;
    public static final int MODE_DEFAULT_CARD = 1;
    public static final int MODE_SMART_CARD_SWITCH = 16;
    public static final int MODE_TIME_POLLING = 2;
    public static final int MODE_UNKNOWN = 0;

    public static boolean a(int i) {
        return (i & 8) == 8;
    }

    public static boolean b(int i) {
        return (i & 16) == 16;
    }
}
