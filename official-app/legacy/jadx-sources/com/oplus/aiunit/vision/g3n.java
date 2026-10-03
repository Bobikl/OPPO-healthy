package com.oplus.aiunit.vision;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import org.apache.commons.codec.CharEncoding;

/* JADX INFO: loaded from: classes12.dex */
public final class g3n implements Closeable {
    public static final Charset a = Charset.forName(CharEncoding.US_ASCII);
    public final InputStream i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Charset f11619j;
    public byte[] k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f11620l;
    public int m;

    public class a extends ByteArrayOutputStream {
        public a(int i) {
            super(i);
        }

        @Override // java.io.ByteArrayOutputStream
        public final String toString() {
            int i = ((ByteArrayOutputStream) this).count;
            if (i > 0 && ((ByteArrayOutputStream) this).buf[i - 1] == 13) {
                i--;
            }
            try {
                return new String(((ByteArrayOutputStream) this).buf, 0, i, g3n.this.f11619j.name());
            } catch (UnsupportedEncodingException e2) {
                throw new AssertionError(e2);
            }
        }
    }

    public g3n(InputStream inputStream, Charset charset) {
        this(inputStream, charset, (byte) 0);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x002b  */
    public final String a() throws IOException {
        int i;
        byte[] bArr;
        int i2;
        synchronized (this.i) {
            if (this.k == null) {
                throw new IOException("LineReader is closed");
            }
            if (this.f11620l >= this.m) {
                h();
            }
            for (int i3 = this.f11620l; i3 != this.m; i3++) {
                byte[] bArr2 = this.k;
                if (bArr2[i3] == 10) {
                    int i4 = this.f11620l;
                    if (i3 != i4) {
                        i2 = i3 - 1;
                        if (bArr2[i2] != 13) {
                            i2 = i3;
                        }
                    } else {
                        i2 = i3;
                    }
                    String str = new String(bArr2, i4, i2 - i4, this.f11619j.name());
                    this.f11620l = i3 + 1;
                    return str;
                }
            }
            a aVar = new a((this.m - this.f11620l) + 80);
            loop1: while (true) {
                byte[] bArr3 = this.k;
                int i5 = this.f11620l;
                aVar.write(bArr3, i5, this.m - i5);
                this.m = -1;
                h();
                i = this.f11620l;
                while (i != this.m) {
                    bArr = this.k;
                    if (bArr[i] == 10) {
                        break loop1;
                    }
                    i++;
                }
            }
            int i6 = this.f11620l;
            if (i != i6) {
                aVar.write(bArr, i6, i - i6);
            }
            this.f11620l = i + 1;
            return aVar.toString();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        synchronized (this.i) {
            if (this.k != null) {
                this.k = null;
                this.i.close();
            }
        }
    }

    public final void h() throws IOException {
        InputStream inputStream = this.i;
        byte[] bArr = this.k;
        int i = inputStream.read(bArr, 0, bArr.length);
        if (i == -1) {
            throw new EOFException();
        }
        this.f11620l = 0;
        this.m = i;
    }

    public g3n(InputStream inputStream, Charset charset, byte b) {
        if (inputStream == null || charset == null) {
            throw null;
        }
        if (!charset.equals(a)) {
            throw new IllegalArgumentException("Unsupported encoding");
        }
        this.i = inputStream;
        this.f11619j = charset;
        this.k = new byte[8192];
    }
}
