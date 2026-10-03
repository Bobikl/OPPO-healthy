package com.oplus.aiunit.vision;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: loaded from: classes8.dex */
public final class qhm {
    public static String a(String str) {
        try {
            byte[] bArrDigest = MessageDigest.getInstance("MD5").digest(str.getBytes(StandardCharsets.UTF_8));
            StringBuilder sb = new StringBuilder(40);
            for (byte b : bArrDigest) {
                int i = b & 255;
                if ((i >> 4) == 0) {
                    sb.append("0");
                    sb.append(Integer.toHexString(i));
                } else {
                    sb.append(Integer.toHexString(i));
                }
            }
            return sb.toString();
        } catch (NoSuchAlgorithmException e2) {
            e2.printStackTrace();
            return "";
        }
    }
}
