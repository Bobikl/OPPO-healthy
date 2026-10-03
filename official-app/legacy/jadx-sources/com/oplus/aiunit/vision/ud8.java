package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes19.dex */
@Deprecated
public class ud8 implements w7e {
    public static ud8 a;

    public static ud8 a() {
        if (a == null) {
            synchronized (ud8.class) {
                if (a == null) {
                    a = new ud8();
                }
            }
        }
        return a;
    }
}
