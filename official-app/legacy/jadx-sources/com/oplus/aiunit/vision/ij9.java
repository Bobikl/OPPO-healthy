package com.oplus.aiunit.vision;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes9.dex */
public class ij9 {
    public static final int HTTP_DATA_HEAD_LEN = 15;
    public short a;
    public long b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public byte f12561c;
    public int d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public byte[] f12562e;
    public int f = 2;

    public ij9(short s, long j2, byte b, int i, byte[] bArr) {
        this.a = s;
        this.b = j2;
        this.f12561c = b;
        this.d = i;
        this.f12562e = bArr;
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
        long j2 = byteBufferAllocate.getLong();
        byteBufferAllocate.clear();
        return j2;
    }

    public static byte[] d(InputStream inputStream) throws IOException {
        c3f.a("HttpData", " getBytesFromSocket  start read");
        int i = inputStream.read();
        c3f.a("HttpData", " getBytesFromSocket   read  firstChar = " + i);
        if (i == -1) {
            c3f.b("HttpData", "getBytesFromSocket  inputStream is end");
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
        c3f.a("HttpData", " getBytesFromSocket  return array.length = " + i2);
        return bArr;
    }

    public static byte g(byte[] bArr) {
        return bArr[10];
    }

    public static long j(byte[] bArr) {
        byte[] bArr2 = new byte[8];
        System.arraycopy(bArr, 2, bArr2, 0, 8);
        c3f.a("lidg", "dest.length>>>>8");
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

    public static void o(long j2, byte[] bArr, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            bArr[((i + i2) - i3) - 1] = (byte) ((j2 >> (i3 * 8)) & 255);
        }
    }

    public byte[] e() {
        return this.f12562e;
    }

    public byte f() {
        return this.f12561c;
    }

    public byte[] h() {
        byte[] bArr = new byte[15];
        o(this.a, bArr, 0, 2);
        o(this.b, bArr, 2, 8);
        o(this.f12561c, bArr, 10, 1);
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
