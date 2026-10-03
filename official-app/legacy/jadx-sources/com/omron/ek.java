package com.omron;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Locale;

/* JADX INFO: loaded from: classes5.dex */
public class ek {
    public static float a(byte[] bArr, int i, boolean z) {
        return a(bArr, i, z, 2).getShort();
    }

    public static int b(byte[] bArr, int i, boolean z) {
        return a(bArr, i, z, 2).getShort();
    }

    public static em c(byte[] bArr, int i, boolean z) {
        return em.c(a(bArr, i, z, 2).getShort());
    }

    public static short d(byte[] bArr, int i, boolean z) {
        return a(bArr, i, z, 2).getShort();
    }

    public static int e(byte[] bArr, int i, boolean z) {
        return a(bArr, i, z, 4).getInt();
    }

    public static long f(byte[] bArr, int i, boolean z) {
        return a(bArr, i, z, 4).getInt();
    }

    public static String g(byte[] bArr, int i, boolean z) {
        byte[] bArr2 = new byte[2];
        System.arraycopy(bArr, i, bArr2, 0, 2);
        int i2 = i + 2;
        int iB = b(bArr2, 0, z);
        int i3 = i2 + 1;
        int i4 = i3 + 1;
        int i5 = i4 + 1;
        int i6 = i5 + 1;
        return String.format(Locale.US, "%04d-%02d-%02d %02d:%02d:%02d", Integer.valueOf(iB), Integer.valueOf(bArr[i2]), Integer.valueOf(bArr[i3]), Integer.valueOf(bArr[i4]), Integer.valueOf(bArr[i5]), Integer.valueOf(bArr[i6]));
    }

    public static String a(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("0x");
        for (byte b : bArr) {
            sb.append(String.format(Locale.US, "%02x", Byte.valueOf(b)));
        }
        return sb.toString();
    }

    private static ByteBuffer a(byte[] bArr, int i, boolean z, int i2) {
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr2);
        byteBufferWrap.order(z ? ByteOrder.LITTLE_ENDIAN : ByteOrder.BIG_ENDIAN);
        return byteBufferWrap;
    }
}
