package com.omron.lib;

/* JADX INFO: loaded from: classes5.dex */
public class b {
    private static final String a;
    static final String b;

    static {
        String property = System.getProperty("file.separator");
        a = property;
        b = property + "omron_ble_file" + property;
    }
}
