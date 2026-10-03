package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes8.dex */
public final class y6m {
    public static String a(String str, int i) {
        byte[] bytes = str.getBytes();
        int length = bytes.length;
        for (int i2 = 0; i2 < length; i2++) {
            bytes[i2] = (byte) (bytes[i2] ^ i);
        }
        return new String(bytes);
    }
}
