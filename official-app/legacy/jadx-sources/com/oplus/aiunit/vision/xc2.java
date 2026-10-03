package com.oplus.aiunit.vision;

import java.io.OutputStream;
import java.util.LinkedList;

/* JADX INFO: loaded from: classes13.dex */
public final class xc2 extends OutputStream {
    public static final byte[] NO_BYTES = new byte[0];
    public final z72 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final LinkedList<byte[]> f18572j;
    public int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public byte[] f18573l;
    public int m;

    public xc2() {
        this((z72) null);
    }

    public static xc2 n(byte[] bArr, int i) {
        return new xc2(null, bArr, i);
    }

    public final void a() {
        int length = this.k + this.f18573l.length;
        if (length < 0) {
            throw new IllegalStateException("Maximum Java array size (2GB) exceeded by `ByteArrayBuilder`");
        }
        this.k = length;
        int iMax = Math.max(length >> 1, 1000);
        if (iMax > 131072) {
            iMax = 131072;
        }
        this.f18572j.add(this.f18573l);
        this.f18573l = new byte[iMax];
        this.m = 0;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() {
    }

    public void g(int i) {
        if (this.m >= this.f18573l.length) {
            a();
        }
        byte[] bArr = this.f18573l;
        int i2 = this.m;
        this.m = i2 + 1;
        bArr[i2] = (byte) i;
    }

    public void h(int i) {
        int i2 = this.m;
        int i3 = i2 + 2;
        byte[] bArr = this.f18573l;
        if (i3 >= bArr.length) {
            g(i >> 16);
            g(i >> 8);
            g(i);
        } else {
            int i4 = i2 + 1;
            bArr[i2] = (byte) (i >> 16);
            int i5 = i4 + 1;
            bArr[i4] = (byte) (i >> 8);
            this.m = i5 + 1;
            bArr[i5] = (byte) i;
        }
    }

    public void i(int i) {
        int i2 = this.m;
        int i3 = i2 + 1;
        byte[] bArr = this.f18573l;
        if (i3 >= bArr.length) {
            g(i >> 8);
            g(i);
        } else {
            int i4 = i2 + 1;
            bArr[i2] = (byte) (i >> 8);
            this.m = i4 + 1;
            bArr[i4] = (byte) i;
        }
    }

    public byte[] l(int i) {
        this.m = i;
        return u();
    }

    public byte[] m() {
        a();
        return this.f18573l;
    }

    public byte[] o() {
        return this.f18573l;
    }

    public int p() {
        return this.m;
    }

    public void release() {
        byte[] bArr;
        s();
        z72 z72Var = this.i;
        if (z72Var == null || (bArr = this.f18573l) == null) {
            return;
        }
        z72Var.i(2, bArr);
        this.f18573l = null;
    }

    public void s() {
        this.k = 0;
        this.m = 0;
        if (this.f18572j.isEmpty()) {
            return;
        }
        this.f18572j.clear();
    }

    public void t(int i) {
        this.m = i;
    }

    public byte[] u() {
        int i = this.k + this.m;
        if (i == 0) {
            return NO_BYTES;
        }
        byte[] bArr = new byte[i];
        int i2 = 0;
        for (byte[] bArr2 : this.f18572j) {
            int length = bArr2.length;
            System.arraycopy(bArr2, 0, bArr, i2, length);
            i2 += length;
        }
        System.arraycopy(this.f18573l, 0, bArr, i2, this.m);
        int i3 = i2 + this.m;
        if (i3 == i) {
            if (!this.f18572j.isEmpty()) {
                s();
            }
            return bArr;
        }
        throw new RuntimeException("Internal error: total len assumed to be " + i + ", copied " + i3 + " bytes");
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) {
        write(bArr, 0, bArr.length);
    }

    public xc2(z72 z72Var) {
        this(z72Var, 500);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) {
        while (true) {
            int iMin = Math.min(this.f18573l.length - this.m, i2);
            if (iMin > 0) {
                System.arraycopy(bArr, i, this.f18573l, this.m, iMin);
                i += iMin;
                this.m += iMin;
                i2 -= iMin;
            }
            if (i2 <= 0) {
                return;
            } else {
                a();
            }
        }
    }

    public xc2(int i) {
        this(null, i);
    }

    public xc2(z72 z72Var, int i) {
        this.f18572j = new LinkedList<>();
        this.i = z72Var;
        this.f18573l = z72Var == null ? new byte[i > 131072 ? 131072 : i] : z72Var.a(2);
    }

    @Override // java.io.OutputStream
    public void write(int i) {
        g(i);
    }

    public xc2(z72 z72Var, byte[] bArr, int i) {
        this.f18572j = new LinkedList<>();
        this.i = null;
        this.f18573l = bArr;
        this.m = i;
    }
}
