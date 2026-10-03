package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public final class nt5 {
    public static String a(String str) {
        byte[] bytes = str.getBytes();
        int length = bytes.length;
        for (int i = 0; i < length; i++) {
            bytes[i] = (byte) (bytes[i] ^ 8);
        }
        return new String(bytes);
    }
}
