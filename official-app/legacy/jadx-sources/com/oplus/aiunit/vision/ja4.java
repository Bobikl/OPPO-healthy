package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes19.dex */
public class ja4 {
    public static String a(int i, boolean z) {
        String hexString = Integer.toHexString((i & 255) | ((-16777216) & i) | (16711680 & i) | (65280 & i));
        if (!z) {
            hexString = hexString.substring(2);
        }
        return ("#" + hexString).toUpperCase();
    }
}
