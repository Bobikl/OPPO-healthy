package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes18.dex */
public final class ps5 {
    public static String a(String str) {
        byte[] bytes = str.getBytes();
        int length = bytes.length;
        for (int i = 0; i < length; i++) {
            bytes[i] = (byte) (bytes[i] ^ 8);
        }
        return new String(bytes);
    }
}
