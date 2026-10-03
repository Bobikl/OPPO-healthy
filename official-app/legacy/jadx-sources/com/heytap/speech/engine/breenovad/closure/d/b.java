package com.heytap.speech.engine.breenovad.closure.d;

import java.io.UnsupportedEncodingException;

/* JADX INFO: loaded from: classes2.dex */
public class b {
    public static double a(short[] sArr) {
        double d = 0.0d;
        for (short s : sArr) {
            double d2 = ((double) s) / 32768.0d;
            d += d2 * d2;
        }
        double dSqrt = Math.sqrt(d / ((double) sArr.length));
        if (dSqrt <= 0.001d) {
            return 0.0d;
        }
        return (Math.log10(dSqrt) * 20.0d) + 100.0d;
    }

    public static short[] b(byte[] bArr) {
        int length = bArr.length / 2;
        short[] sArr = new short[length];
        for (int i = 0; i < length; i++) {
            sArr[i] = (short) ((bArr[i << 1] & 255) | ((bArr[(i * 2) + 1] & 255) << 8));
        }
        return sArr;
    }

    public static String a(byte[] bArr) {
        try {
            return new String(bArr, "UTF-8");
        } catch (UnsupportedEncodingException e2) {
            e2.printStackTrace();
            return new String(bArr);
        }
    }
}
