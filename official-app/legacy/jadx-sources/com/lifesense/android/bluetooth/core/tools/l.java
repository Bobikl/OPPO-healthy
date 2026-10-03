package com.lifesense.android.bluetooth.core.tools;

import java.util.UUID;

/* JADX INFO: loaded from: classes4.dex */
public class l {
    public static String a() {
        return UUID.randomUUID().toString().replace("-", "");
    }

    public static String a(String str) {
        return str.replaceAll(":", "");
    }
}
