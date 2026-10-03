package com.oplus.aiunit.vision;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes13.dex */
public final class axb extends InputStream {
    public final ht9 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final InputStream f9516j;
    public byte[] k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f9517l;
    public final int m;

    public axb(ht9 ht9Var, InputStream inputStream, byte[] bArr, int i, int i2) {
        this.i = ht9Var;
        this.f9516j = inputStream;
        this.k = bArr;
        this.f9517l = i;
        this.m = i2;
    }

    public final void a() {
        byte[] bArr = this.k;
        if (bArr != null) {
            this.k = null;
            ht9 ht9Var = this.i;
            if (ht9Var != null) {
                ht9Var.r(bArr);
            }
        }
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        return this.k != null ? this.m - this.f9517l : this.f9516j.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        a();
        this.f9516j.close();
    }

    @Override // java.io.InputStream
    public synchronized void mark(int i) {
        if (this.k == null) {
            this.f9516j.mark(i);
        }
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return this.k == null && this.f9516j.markSupported();
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        byte[] bArr = this.k;
        if (bArr == null) {
            return this.f9516j.read();
        }
        int i = this.f9517l;
        int i2 = i + 1;
        this.f9517l = i2;
        int i3 = bArr[i] & 255;
        if (i2 >= this.m) {
            a();
        }
        return i3;
    }

    @Override // java.io.InputStream
    public synchronized void reset() throws IOException {
        if (this.k == null) {
            this.f9516j.reset();
        }
    }

    @Override // java.io.InputStream
    public long skip(long j2) throws IOException {
        long j3;
        if (this.k != null) {
            int i = this.m;
            int i2 = this.f9517l;
            long j4 = i - i2;
            if (j4 > j2) {
                this.f9517l = i2 + ((int) j2);
                return j2;
            }
            a();
            j3 = j4 + 0;
            j2 -= j4;
        } else {
            j3 = 0;
        }
        return j2 > 0 ? j3 + this.f9516j.skip(j2) : j3;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        byte[] bArr2 = this.k;
        if (bArr2 != null) {
            int i3 = this.m;
            int i4 = this.f9517l;
            int i5 = i3 - i4;
            if (i2 > i5) {
                i2 = i5;
            }
            System.arraycopy(bArr2, i4, bArr, i, i2);
            int i6 = this.f9517l + i2;
            this.f9517l = i6;
            if (i6 >= this.m) {
                a();
            }
            return i2;
        }
        return this.f9516j.read(bArr, i, i2);
    }
}
