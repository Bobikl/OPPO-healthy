package com.oplus.aiunit.vision;

import java.security.MessageDigest;
import org.apache.commons.codec.digest.MessageDigestAlgorithms;

/* JADX INFO: loaded from: classes12.dex */
public final class fhm {
    public static String a(String str) {
        try {
            if (vam.c(str)) {
                return null;
            }
            MessageDigest messageDigest = MessageDigest.getInstance(MessageDigestAlgorithms.SHA_1);
            messageDigest.update(str.getBytes("UTF-8"));
            byte[] bArrDigest = messageDigest.digest();
            StringBuilder sb = new StringBuilder();
            for (byte b : bArrDigest) {
                sb.append(String.format("%02x", Byte.valueOf(b)));
            }
            return sb.toString();
        } catch (Exception unused) {
            return null;
        }
    }
}
