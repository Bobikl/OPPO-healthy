package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes8.dex */
public class wfk {
    public static volatile wfk a;

    public static wfk a() {
        if (a == null) {
            synchronized (wfk.class) {
                if (a == null) {
                    a = new wfk();
                }
            }
        }
        return a;
    }

    public sw9 b() {
        return null;
    }
}
