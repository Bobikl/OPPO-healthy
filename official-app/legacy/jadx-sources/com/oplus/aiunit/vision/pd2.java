package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes8.dex */
public class pd2 {
    public static String a(byte b) {
        String str = "";
        for (int i = 0; i < 8; i++) {
            byte b2 = (byte) (((byte) (b >> 1)) << 1);
            str = b2 == b ? "0" + str : "1" + str;
            b = (byte) (b2 >> 1);
        }
        return str;
    }
}
