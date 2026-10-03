package com.oplus.aiunit.vision;

import java.util.UUID;

/* JADX INFO: loaded from: classes6.dex */
public class xvg {
    public static String a;

    public static String a() {
        if (a == null) {
            a = UUID.randomUUID().toString();
        }
        return a;
    }
}
