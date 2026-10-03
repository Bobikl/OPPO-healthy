package com.oplus.aiunit.vision;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public class ok9 {
    public static final int HTTP_DATA_HEAD_LEN = 15;
    public short a;
    public long b;
    public byte c;
    public int d;
    public byte[] e;
    public int f = 2;

    public ok9(short s, long j, byte b, int i, byte[] bArr) {
        this.a = s;
        this.b = j;
        this.c = b;
        this.d = i;
        this.e = bArr;
    }

    public static int a(byte[] bArr) {
        return ((bArr[0] & 255) << 24) | (bArr[3] & 255) | ((bArr[2] & 255) << 8) | ((bArr[1] & 255) << 16);
    }

    public static short b(byte[] bArr) {
        return (short) (((bArr[0] & 255) << 8) | (bArr[1] & 255));
    }

    public static long c(byte[] bArr) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
        byteBufferAllocate.put(bArr, 0, bArr.length);
        byteBufferAllocate.flip();
        long j = byteBufferAllocate.getLong();
        byteBufferAllocate.clear();
        return j;
    }

    public static byte[] d(InputStream inputStream) throws IOException {
        o5f.a("HttpData", " getBytesFromSocket  start read");
        int i = inputStream.read();
        o5f.a("HttpData", " getBytesFromSocket   read  firstChar = " + i);
        if (i == -1) {
            o5f.b("HttpData", "getBytesFromSocket  inputStream is end");
            return null;
        }
        int iAvailable = inputStream.available();
        if (iAvailable > 10240) {
            iAvailable = 10240;
        }
        int i2 = iAvailable + 1;
        byte[] bArr = new byte[i2];
        bArr[0] = (byte) i;
        inputStream.read(bArr, 1, iAvailable);
        o5f.a("HttpData", " getBytesFromSocket  return array.length = " + i2);
        return bArr;
    }

    public static byte g(byte[] bArr) {
        return bArr[10];
    }

    public static long j(byte[] bArr) {
        byte[] bArr2 = new byte[8];
        System.arraycopy(bArr, 2, bArr2, 0, 8);
        o5f.a("lidg", "dest.length>>>>8");
        return c(bArr2);
    }

    public static short m(byte[] bArr) {
        byte[] bArr2 = new byte[2];
        System.arraycopy(bArr, 0, bArr2, 0, 2);
        return b(bArr2);
    }

    public static int n(byte[] bArr) {
        byte[] bArr2 = new byte[4];
        System.arraycopy(bArr, 11, bArr2, 0, 4);
        return a(bArr2);
    }

    public static void o(long j, byte[] bArr, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            bArr[((i + i2) - i3) - 1] = (byte) ((j >> (i3 * 8)) & 255);
        }
    }

    public byte[] e() {
        return this.e;
    }

    public byte f() {
        return this.c;
    }

    public byte[] h() {
        byte[] bArr = new byte[15];
        o(this.a, bArr, 0, 2);
        o(this.b, bArr, 2, 8);
        o(this.c, bArr, 10, 1);
        o(this.d, bArr, 11, 4);
        return bArr;
    }

    public long i() {
        return this.b;
    }

    public int k() {
        return this.d;
    }

    public short l() {
        return this.a;
    }
}
