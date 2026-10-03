package com.lifesense.android.bluetooth.core.tools;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes4.dex */
public class b {
    public static int a(byte[] bArr) {
        return a(bArr, ByteOrder.BIG_ENDIAN);
    }

    public static int a(byte[] bArr, ByteOrder byteOrder) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(bArr.length);
        byteBufferAllocate.order(byteOrder);
        byteBufferAllocate.put(bArr);
        byteBufferAllocate.flip();
        return byteBufferAllocate.getInt();
    }

    public static byte[] a(int i) {
        return a(i, ByteOrder.LITTLE_ENDIAN, 4);
    }

    public static byte[] a(int i, int i2) {
        return a(i, ByteOrder.LITTLE_ENDIAN, i2);
    }

    public static byte[] a(int i, ByteOrder byteOrder, int i2) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
        byteBufferAllocate.order(byteOrder);
        byteBufferAllocate.putInt(i);
        byteBufferAllocate.flip();
        byte[] bArr = new byte[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            if (byteBufferAllocate.remaining() > 0) {
                bArr[i3] = byteBufferAllocate.get();
            }
        }
        return bArr;
    }

    public static byte[] a(byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return bArr2;
    }

    public static byte[] a(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = new byte[bArr.length + bArr2.length];
        System.arraycopy(bArr, 0, bArr3, 0, bArr.length);
        System.arraycopy(bArr2, 0, bArr3, bArr.length, bArr2.length);
        return bArr3;
    }
}
