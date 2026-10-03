package com.oplus.aiunit.vision;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes13.dex */
public class p0j implements Closeable {
    public final InputStream i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Charset f15135j;
    public byte[] k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f15136l;
    public int m;

    public class a extends ByteArrayOutputStream {
        public a(int i) {
            super(i);
        }

        @Override // java.io.ByteArrayOutputStream
        public String toString() {
            int i = ((ByteArrayOutputStream) this).count;
            if (i > 0 && ((ByteArrayOutputStream) this).buf[i - 1] == 13) {
                i--;
            }
            try {
                return new String(((ByteArrayOutputStream) this).buf, 0, i, p0j.this.f15135j.name());
            } catch (UnsupportedEncodingException e2) {
                throw new AssertionError(e2);
            }
        }
    }

    public p0j(InputStream inputStream, Charset charset) {
        this(inputStream, 8192, charset);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        synchronized (this.i) {
            if (this.k != null) {
                this.k = null;
                this.i.close();
            }
        }
    }

    public final void g() throws IOException {
        InputStream inputStream = this.i;
        byte[] bArr = this.k;
        int i = inputStream.read(bArr, 0, bArr.length);
        if (i == -1) {
            throw new EOFException();
        }
        this.f15136l = 0;
        this.m = i;
    }

    public boolean h() {
        return this.m == -1;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x002b  */
    public String i() throws IOException {
        int i;
        byte[] bArr;
        int i2;
        synchronized (this.i) {
            if (this.k == null) {
                throw new IOException("LineReader is closed");
            }
            if (this.f15136l >= this.m) {
                g();
            }
            for (int i3 = this.f15136l; i3 != this.m; i3++) {
                byte[] bArr2 = this.k;
                if (bArr2[i3] == 10) {
                    int i4 = this.f15136l;
                    if (i3 != i4) {
                        i2 = i3 - 1;
                        if (bArr2[i2] != 13) {
                            i2 = i3;
                        }
                    } else {
                        i2 = i3;
                    }
                    String str = new String(bArr2, i4, i2 - i4, this.f15135j.name());
                    this.f15136l = i3 + 1;
                    return str;
                }
            }
            a aVar = new a((this.m - this.f15136l) + 80);
            loop1: while (true) {
                byte[] bArr3 = this.k;
                int i5 = this.f15136l;
                aVar.write(bArr3, i5, this.m - i5);
                this.m = -1;
                g();
                i = this.f15136l;
                while (i != this.m) {
                    bArr = this.k;
                    if (bArr[i] == 10) {
                        break loop1;
                    }
                    i++;
                }
            }
            int i6 = this.f15136l;
            if (i != i6) {
                aVar.write(bArr, i6, i - i6);
            }
            this.f15136l = i + 1;
            return aVar.toString();
        }
    }

    public p0j(InputStream inputStream, int i, Charset charset) {
        if (inputStream == null || charset == null) {
            throw null;
        }
        if (i < 0) {
            throw new IllegalArgumentException("capacity <= 0");
        }
        if (!charset.equals(brk.a)) {
            throw new IllegalArgumentException("Unsupported encoding");
        }
        this.i = inputStream;
        this.f15135j = charset;
        this.k = new byte[i];
    }
}
