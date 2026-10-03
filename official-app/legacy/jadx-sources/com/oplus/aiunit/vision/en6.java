package com.oplus.aiunit.vision;

import java.nio.charset.StandardCharsets;

/* JADX INFO: loaded from: classes6.dex */
public class en6 {
    public static String a(String str) {
        if (str == null || str.isEmpty()) {
            return "";
        }
        byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
        for (int i = 0; i < bytes.length; i++) {
            bytes[i] = (byte) (bytes[i] ^ 8);
        }
        return new String(bytes, StandardCharsets.UTF_8);
    }
}
