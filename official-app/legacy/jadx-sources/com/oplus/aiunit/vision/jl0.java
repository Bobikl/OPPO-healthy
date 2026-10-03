package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes18.dex */
public class jl0 {
    public static final int WATCH_ROUTE_BLUETOOTH = 4;
    public static final int WATCH_ROUTE_EARPIECE = 1;
    public static final int WATCH_ROUTE_SPEAKER = 2;
    public static final int WATCH_ROUTE_UNKNOWN = 0;
    public static final int WATCH_ROUTE_WATCH = 3;
    public static final int WATCH_WIRED_HEADSET = 5;

    public static int a(int i) {
        if (i == 1) {
            return 1;
        }
        if (i == 2) {
            return 8;
        }
        if (i == 3 || i == 4) {
            return 2;
        }
        return i != 5 ? 0 : 4;
    }

    public static int b(int i) {
        if (i == 1) {
            return 1;
        }
        if (i == 2) {
            return 4;
        }
        if (i == 4 || i == 5) {
            return 5;
        }
        return i != 8 ? 0 : 2;
    }
}
