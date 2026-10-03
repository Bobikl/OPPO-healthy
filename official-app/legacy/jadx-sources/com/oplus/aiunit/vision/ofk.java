package com.oplus.aiunit.vision;

import java.io.CharConversionException;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;

/* JADX INFO: loaded from: classes13.dex */
public class ofk extends Reader {
    public final ht9 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public InputStream f14928j;
    public byte[] k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f14929l;
    public int m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f14930n;
    public char o = 0;
    public int p;
    public int q;
    public final boolean r;
    public char[] s;

    public ofk(ht9 ht9Var, InputStream inputStream, byte[] bArr, int i, int i2, boolean z) {
        this.i = ht9Var;
        this.f14928j = inputStream;
        this.k = bArr;
        this.f14929l = i;
        this.m = i2;
        this.f14930n = z;
        this.r = inputStream != null;
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

    @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        InputStream inputStream = this.f14928j;
        if (inputStream != null) {
            this.f14928j = null;
            a();
            inputStream.close();
        }
    }

    public final boolean g(int i) throws IOException {
        byte[] bArr;
        InputStream inputStream = this.f14928j;
        if (inputStream == null || (bArr = this.k) == null) {
            return false;
        }
        this.q += this.m - i;
        if (i > 0) {
            int i2 = this.f14929l;
            if (i2 > 0) {
                System.arraycopy(bArr, i2, bArr, 0, i);
                this.f14929l = 0;
            }
            this.m = i;
        } else {
            this.f14929l = 0;
            int i3 = inputStream.read(bArr);
            if (i3 < 1) {
                this.m = 0;
                if (i3 < 0) {
                    if (this.r) {
                        a();
                    }
                    return false;
                }
                l();
            }
            this.m = i3;
        }
        while (true) {
            int i4 = this.m;
            if (i4 >= 4) {
                return true;
            }
            InputStream inputStream2 = this.f14928j;
            byte[] bArr2 = this.k;
            int i5 = inputStream2.read(bArr2, i4, bArr2.length - i4);
            if (i5 < 1) {
                if (i5 < 0) {
                    if (this.r) {
                        a();
                    }
                    m(this.m, 4);
                }
                l();
            }
            this.m += i5;
        }
    }

    public final void h(char[] cArr, int i, int i2) throws IOException {
        throw new ArrayIndexOutOfBoundsException(String.format("read(buf,%d,%d), cbuf[%d]", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(cArr.length)));
    }

    public final void i(int i, int i2, String str) throws IOException {
        int i3 = (this.q + this.f14929l) - 1;
        throw new CharConversionException("Invalid UTF-32 character 0x" + Integer.toHexString(i) + str + " at char #" + (this.p + i2) + ", byte #" + i3 + ")");
    }

    public final void l() throws IOException {
        throw new IOException("Strange I/O stream, returned 0 bytes on read");
    }

    public final void m(int i, int i2) throws IOException {
        int i3 = this.q + i;
        throw new CharConversionException("Unexpected EOF in the middle of a 4-byte UTF-32 char: got " + i + ", needed " + i2 + ", at char #" + this.p + ", byte #" + i3 + ")");
    }

    @Override // java.io.Reader
    public int read() throws IOException {
        if (this.s == null) {
            this.s = new char[1];
        }
        if (read(this.s, 0, 1) < 1) {
            return -1;
        }
        return this.s[0];
    }

    @Override // java.io.Reader
    public int read(char[] cArr, int i, int i2) throws IOException {
        int i3;
        int i4;
        int i5;
        if (this.k == null) {
            return -1;
        }
        if (i2 < 1) {
            return i2;
        }
        if (i < 0 || i + i2 > cArr.length) {
            h(cArr, i, i2);
        }
        int i6 = i2 + i;
        char c2 = this.o;
        if (c2 != 0) {
            i3 = i + 1;
            cArr[i] = c2;
            this.o = (char) 0;
        } else {
            int i7 = this.m - this.f14929l;
            if (i7 < 4 && !g(i7)) {
                if (i7 == 0) {
                    return -1;
                }
                m(this.m - this.f14929l, 4);
            }
            i3 = i;
        }
        int i8 = this.m - 4;
        while (i3 < i6) {
            int i9 = this.f14929l;
            if (i9 > i8) {
                break;
            }
            if (this.f14930n) {
                byte[] bArr = this.k;
                i4 = (bArr[i9] << 8) | (bArr[i9 + 1] & 255);
                i5 = (bArr[i9 + 3] & 255) | ((bArr[i9 + 2] & 255) << 8);
            } else {
                byte[] bArr2 = this.k;
                int i10 = (bArr2[i9] & 255) | ((bArr2[i9 + 1] & 255) << 8);
                i4 = (bArr2[i9 + 3] << 8) | (bArr2[i9 + 2] & 255);
                i5 = i10;
            }
            this.f14929l = i9 + 4;
            if (i4 != 0) {
                int i11 = 65535 & i4;
                int i12 = i5 | ((i11 - 1) << 16);
                if (i11 > 16) {
                    i(i12, i3 - i, String.format(" (above 0x%08x)", 1114111));
                }
                int i13 = i3 + 1;
                cArr[i3] = (char) ((i12 >> 10) + u48.SURR1_FIRST);
                int i14 = (i12 & 1023) | 56320;
                if (i13 >= i6) {
                    this.o = (char) i12;
                    i3 = i13;
                    break;
                }
                i5 = i14;
                i3 = i13;
            }
            cArr[i3] = (char) i5;
            i3++;
        }
        int i15 = i3 - i;
        this.p += i15;
        return i15;
    }
}
