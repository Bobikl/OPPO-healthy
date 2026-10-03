package com.oplus.aiunit.vision;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: classes13.dex */
public class z72 {
    public static final int BYTE_BASE64_CODEC_BUFFER = 3;
    public static final int BYTE_READ_IO_BUFFER = 0;
    public static final int BYTE_WRITE_CONCAT_BUFFER = 2;
    public static final int BYTE_WRITE_ENCODING_BUFFER = 1;
    public static final int CHAR_CONCAT_BUFFER = 1;
    public static final int CHAR_NAME_COPY_BUFFER = 3;
    public static final int CHAR_TEXT_BUFFER = 2;
    public static final int CHAR_TOKEN_BUFFER = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int[] f19304c = {8000, 8000, 2000, 2000};
    public static final int[] d = {4000, 4000, 200, 200};
    public final AtomicReferenceArray<byte[]> a;
    public final AtomicReferenceArray<char[]> b;

    public z72() {
        this(4, 4);
    }

    public final byte[] a(int i) {
        return b(i, 0);
    }

    public byte[] b(int i, int i2) {
        int iF = f(i);
        if (i2 < iF) {
            i2 = iF;
        }
        byte[] andSet = this.a.getAndSet(i, null);
        return (andSet == null || andSet.length < i2) ? e(i2) : andSet;
    }

    public final char[] c(int i) {
        return d(i, 0);
    }

    public char[] d(int i, int i2) {
        int iH = h(i);
        if (i2 < iH) {
            i2 = iH;
        }
        char[] andSet = this.b.getAndSet(i, null);
        return (andSet == null || andSet.length < i2) ? g(i2) : andSet;
    }

    public byte[] e(int i) {
        return new byte[i];
    }

    public int f(int i) {
        return f19304c[i];
    }

    public char[] g(int i) {
        return new char[i];
    }

    public int h(int i) {
        return d[i];
    }

    public void i(int i, byte[] bArr) {
        this.a.set(i, bArr);
    }

    public void j(int i, char[] cArr) {
        this.b.set(i, cArr);
    }

    public z72(int i, int i2) {
        this.a = new AtomicReferenceArray<>(i);
        this.b = new AtomicReferenceArray<>(i2);
    }
}
