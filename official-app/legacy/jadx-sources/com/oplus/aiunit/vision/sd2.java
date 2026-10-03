package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes15.dex */
public class sd2 {
    public static final byte[] EMPTY_BYTES = new byte[0];

    public static String a(byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        if (!b(bArr)) {
            for (byte b : bArr) {
                sb.append(String.format("%02X", Byte.valueOf(b)));
            }
        }
        return sb.toString();
    }

    public static boolean b(byte[] bArr) {
        return bArr == null || bArr.length == 0;
    }
}
