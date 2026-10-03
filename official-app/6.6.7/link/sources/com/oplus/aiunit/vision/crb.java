package com.oplus.aiunit.vision;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public final class crb {
    public static String a(String str, String str2) {
        try {
            byte[] bArrDigest = MessageDigest.getInstance(str).digest(str2.getBytes(StandardCharsets.UTF_8));
            StringBuilder sb = new StringBuilder(str2.length() * 2);
            for (byte b : bArrDigest) {
                int i = b & 255;
                if (i < 16) {
                    sb.append('0');
                }
                sb.append(Integer.toString(i, 16));
            }
            return sb.toString();
        } catch (Exception e) {
            pce.c(e.getMessage());
            return "";
        }
    }

    public static String b(String str) {
        return a("MD5", str);
    }
}
