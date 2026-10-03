package com.oplus.aiunit.vision;

import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes15.dex */
public class qu0 {
    public String a;
    public byte b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Map<String, Object> f15942c;

    public qu0(byte[] bArr) throws Exception {
        if (bArr == null || bArr.length < 2) {
            throw new Exception("BandEvent parse error!");
        }
        this.b = bArr[0];
        this.f15942c = new HashMap();
        int i = 0;
        int i2 = 1;
        while (true) {
            int i3 = i2 + 1;
            if (i3 >= bArr.length) {
                return;
            }
            String[] strArrB = yw0.a().b(this.b, i);
            if (strArrB != null) {
                this.a = strArrB[0];
                int i4 = bArr[i2];
                int i5 = i4 & 3;
                int i6 = i4 >> 2;
                byte[] bArr2 = new byte[i6];
                System.arraycopy(bArr, i3, bArr2, 0, i6);
                this.f15942c.put(strArrB[1], c(i5, bArr2));
                i2 += i6 + 1;
                i++;
            }
        }
    }

    public static double a(byte[] bArr, boolean z) {
        long j2 = 0;
        if (z) {
            for (int i = 0; i < 8; i++) {
                j2 |= ((long) (bArr[i] & 255)) << (i * 8);
            }
        } else {
            for (int i2 = 7; i2 >= 0; i2--) {
                j2 |= ((long) (bArr[i2] & 255)) << (i2 * 8);
            }
        }
        return Double.longBitsToDouble(j2);
    }

    public static long b(byte[] bArr, boolean z) {
        if (bArr == null) {
            throw new IllegalArgumentException("byte array is null!");
        }
        if (bArr.length > 8) {
            throw new IllegalArgumentException("byte array size > 8 !");
        }
        long j2 = 0;
        if (z) {
            for (byte b : bArr) {
                j2 = (j2 << 8) | ((long) (b & 255));
            }
        } else {
            for (int length = bArr.length - 1; length >= 0; length--) {
                j2 = (j2 << 8) | ((long) (bArr[length] & 255));
            }
        }
        return j2;
    }

    public final String c(int i, byte[] bArr) {
        if (i == 2) {
            return new String(bArr, Charset.forName("ASCII"));
        }
        if (i == 0) {
            return String.valueOf(b(bArr, false));
        }
        return i == 1 ? String.valueOf(a(bArr, false)) : "";
    }
}
