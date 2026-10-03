package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes10.dex */
public final class ksm extends zpm {
    public static volatile ksm g;

    public static ksm h() {
        if (g == null) {
            synchronized (ksm.class) {
                if (g == null) {
                    g = new ksm();
                }
            }
        }
        return g;
    }
}
