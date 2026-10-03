package io.protostuff;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes10.dex */
public final class IntSerializer {
    private IntSerializer() {
    }

    public static void writeInt16(int i, byte[] bArr, int i2) {
        bArr[i2] = (byte) ((i >>> 8) & 255);
        bArr[i2 + 1] = (byte) i;
    }

    public static void writeInt16LE(int i, byte[] bArr, int i2) {
        bArr[i2] = (byte) i;
        bArr[i2 + 1] = (byte) ((i >>> 8) & 255);
    }

    public static void writeInt32(int i, byte[] bArr, int i2) {
        int i3 = i2 + 1;
        bArr[i2] = (byte) ((i >>> 24) & 255);
        int i4 = i3 + 1;
        bArr[i3] = (byte) ((i >>> 16) & 255);
        bArr[i4] = (byte) ((i >>> 8) & 255);
        bArr[i4 + 1] = (byte) ((i >>> 0) & 255);
    }

    public static void writeInt32LE(int i, byte[] bArr, int i2) {
        int i3 = i2 + 1;
        bArr[i2] = (byte) ((i >>> 0) & 255);
        int i4 = i3 + 1;
        bArr[i3] = (byte) ((i >>> 8) & 255);
        bArr[i4] = (byte) ((i >>> 16) & 255);
        bArr[i4 + 1] = (byte) ((i >>> 24) & 255);
    }

    public static void writeInt64(long j2, byte[] bArr, int i) {
        int i2 = i + 1;
        bArr[i] = (byte) (j2 >>> 56);
        int i3 = i2 + 1;
        bArr[i2] = (byte) (j2 >>> 48);
        int i4 = i3 + 1;
        bArr[i3] = (byte) (j2 >>> 40);
        int i5 = i4 + 1;
        bArr[i4] = (byte) (j2 >>> 32);
        int i6 = i5 + 1;
        bArr[i5] = (byte) (j2 >>> 24);
        int i7 = i6 + 1;
        bArr[i6] = (byte) (j2 >>> 16);
        bArr[i7] = (byte) (j2 >>> 8);
        bArr[i7 + 1] = (byte) (j2 >>> 0);
    }

    public static void writeInt64LE(long j2, byte[] bArr, int i) {
        int i2 = i + 1;
        bArr[i] = (byte) (j2 >>> 0);
        int i3 = i2 + 1;
        bArr[i2] = (byte) (j2 >>> 8);
        int i4 = i3 + 1;
        bArr[i3] = (byte) (j2 >>> 16);
        int i5 = i4 + 1;
        bArr[i4] = (byte) (j2 >>> 24);
        int i6 = i5 + 1;
        bArr[i5] = (byte) (j2 >>> 32);
        int i7 = i6 + 1;
        bArr[i6] = (byte) (j2 >>> 40);
        bArr[i7] = (byte) (j2 >>> 48);
        bArr[i7 + 1] = (byte) (j2 >>> 56);
    }

    public static void writeInt16LE(int i, ByteBuffer byteBuffer) {
        byteBuffer.put((byte) i);
        byteBuffer.put((byte) ((i >>> 8) & 255));
    }

    public static void writeInt32LE(int i, ByteBuffer byteBuffer) {
        byteBuffer.put((byte) ((i >>> 0) & 255));
        byteBuffer.put((byte) ((i >>> 8) & 255));
        byteBuffer.put((byte) ((i >>> 16) & 255));
        byteBuffer.put((byte) ((i >>> 24) & 255));
    }

    public static void writeInt64LE(long j2, ByteBuffer byteBuffer) {
        byteBuffer.put((byte) (j2 >>> 0));
        byteBuffer.put((byte) (j2 >>> 8));
        byteBuffer.put((byte) (j2 >>> 16));
        byteBuffer.put((byte) (j2 >>> 24));
        byteBuffer.put((byte) (j2 >>> 32));
        byteBuffer.put((byte) (j2 >>> 40));
        byteBuffer.put((byte) (j2 >>> 48));
        byteBuffer.put((byte) (j2 >>> 56));
    }
}
