package com.oplus.aiunit.vision;

import java.security.MessageDigest;
import org.apache.commons.codec.digest.MessageDigestAlgorithms;

/* JADX INFO: loaded from: classes19.dex */
public class g6g {
    public static final char[] a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public static String a(String str) throws Exception {
        MessageDigest messageDigest = MessageDigest.getInstance(MessageDigestAlgorithms.SHA_256);
        messageDigest.update(str.getBytes());
        return new String(b(messageDigest.digest(), a));
    }

    public static char[] b(byte[] bArr, char[] cArr) {
        char[] cArr2 = new char[bArr.length << 1];
        int i = 0;
        for (byte b : bArr) {
            int i2 = i + 1;
            cArr2[i] = cArr[(b & 240) >>> 4];
            i = i2 + 1;
            cArr2[i2] = cArr[b & 15];
        }
        return cArr2;
    }
}
