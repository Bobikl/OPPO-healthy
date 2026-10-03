package com.bumptech.glide.load.resource.bitmap;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.oplus.aiunit.vision.ch0;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes13.dex */
public class RecyclableBufferedInputStream extends FilterInputStream {
    public volatile byte[] i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f1401j;
    public int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f1402l;
    public int m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ch0 f1403n;

    public static class InvalidMarkException extends IOException {
        private static final long serialVersionUID = -4338378848813561757L;

        public InvalidMarkException(String str) {
            super(str);
        }
    }

    public RecyclableBufferedInputStream(@NonNull InputStream inputStream, @NonNull ch0 ch0Var) {
        this(inputStream, ch0Var, 65536);
    }

    public static IOException h() throws IOException {
        throw new IOException("BufferedInputStream is closed");
    }

    public final int a(InputStream inputStream, byte[] bArr) throws IOException {
        int i = this.f1402l;
        if (i != -1) {
            int i2 = this.m - i;
            int i3 = this.k;
            if (i2 < i3) {
                if (i == 0 && i3 > bArr.length && this.f1401j == bArr.length) {
                    int length = bArr.length * 2;
                    if (length <= i3) {
                        i3 = length;
                    }
                    byte[] bArr2 = (byte[]) this.f1403n.b(i3, byte[].class);
                    System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                    this.i = bArr2;
                    this.f1403n.put(bArr);
                    bArr = bArr2;
                } else if (i > 0) {
                    System.arraycopy(bArr, i, bArr, 0, bArr.length - i);
                }
                int i4 = this.m - this.f1402l;
                this.m = i4;
                this.f1402l = 0;
                this.f1401j = 0;
                int i5 = inputStream.read(bArr, i4, bArr.length - i4);
                int i6 = this.m;
                if (i5 > 0) {
                    i6 += i5;
                }
                this.f1401j = i6;
                return i5;
            }
        }
        int i7 = inputStream.read(bArr);
        if (i7 > 0) {
            this.f1402l = -1;
            this.m = 0;
            this.f1401j = i7;
        }
        return i7;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int available() throws IOException {
        InputStream inputStream;
        inputStream = ((FilterInputStream) this).in;
        if (this.i == null || inputStream == null) {
            throw h();
        }
        return (this.f1401j - this.m) + inputStream.available();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.i != null) {
            this.f1403n.put(this.i);
            this.i = null;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        ((FilterInputStream) this).in = null;
        if (inputStream != null) {
            inputStream.close();
        }
    }

    public synchronized void g() {
        this.k = this.i.length;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void mark(int i) {
        this.k = Math.max(this.k, i);
        this.f1402l = this.m;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
        return true;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read() throws IOException {
        byte[] bArr = this.i;
        InputStream inputStream = ((FilterInputStream) this).in;
        if (bArr == null || inputStream == null) {
            throw h();
        }
        if (this.m >= this.f1401j && a(inputStream, bArr) == -1) {
            return -1;
        }
        if (bArr != this.i && (bArr = this.i) == null) {
            throw h();
        }
        int i = this.f1401j;
        int i2 = this.m;
        if (i - i2 <= 0) {
            return -1;
        }
        this.m = i2 + 1;
        return bArr[i2] & 255;
    }

    public synchronized void release() {
        if (this.i != null) {
            this.f1403n.put(this.i);
            this.i = null;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void reset() throws IOException {
        if (this.i == null) {
            throw new IOException("Stream is closed");
        }
        int i = this.f1402l;
        if (-1 == i) {
            throw new InvalidMarkException("Mark has been invalidated, pos: " + this.m + " markLimit: " + this.k);
        }
        this.m = i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized long skip(long j2) throws IOException {
        if (j2 < 1) {
            return 0L;
        }
        byte[] bArr = this.i;
        if (bArr == null) {
            throw h();
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        if (inputStream == null) {
            throw h();
        }
        int i = this.f1401j;
        int i2 = this.m;
        if (i - i2 >= j2) {
            this.m = (int) (((long) i2) + j2);
            return j2;
        }
        long j3 = ((long) i) - ((long) i2);
        this.m = i;
        if (this.f1402l == -1 || j2 > this.k) {
            long jSkip = inputStream.skip(j2 - j3);
            if (jSkip > 0) {
                this.f1402l = -1;
            }
            return j3 + jSkip;
        }
        if (a(inputStream, bArr) == -1) {
            return j3;
        }
        int i3 = this.f1401j;
        int i4 = this.m;
        if (i3 - i4 >= j2 - j3) {
            this.m = (int) ((((long) i4) + j2) - j3);
            return j2;
        }
        long j4 = (j3 + ((long) i3)) - ((long) i4);
        this.m = i3;
        return j4;
    }

    @VisibleForTesting
    public RecyclableBufferedInputStream(@NonNull InputStream inputStream, @NonNull ch0 ch0Var, int i) {
        super(inputStream);
        this.f1402l = -1;
        this.f1403n = ch0Var;
        this.i = (byte[]) ch0Var.b(i, byte[].class);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read(@NonNull byte[] bArr, int i, int i2) throws IOException {
        int i3;
        int i4;
        byte[] bArr2 = this.i;
        if (bArr2 == null) {
            throw h();
        }
        if (i2 == 0) {
            return 0;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        if (inputStream != null) {
            int i5 = this.m;
            int i6 = this.f1401j;
            if (i5 < i6) {
                int i7 = i6 - i5 >= i2 ? i2 : i6 - i5;
                System.arraycopy(bArr2, i5, bArr, i, i7);
                this.m += i7;
                if (i7 == i2 || inputStream.available() == 0) {
                    return i7;
                }
                i += i7;
                i3 = i2 - i7;
            } else {
                i3 = i2;
            }
            while (true) {
                if (this.f1402l == -1 && i3 >= bArr2.length) {
                    i4 = inputStream.read(bArr, i, i3);
                    if (i4 == -1) {
                        return i3 != i2 ? i2 - i3 : -1;
                    }
                } else {
                    if (a(inputStream, bArr2) == -1) {
                        return i3 != i2 ? i2 - i3 : -1;
                    }
                    if (bArr2 != this.i && (bArr2 = this.i) == null) {
                        throw h();
                    }
                    int i8 = this.f1401j;
                    int i9 = this.m;
                    i4 = i8 - i9 >= i3 ? i3 : i8 - i9;
                    System.arraycopy(bArr2, i9, bArr, i, i4);
                    this.m += i4;
                }
                i3 -= i4;
                if (i3 == 0) {
                    return i2;
                }
                if (inputStream.available() == 0) {
                    return i2 - i3;
                }
                i += i4;
            }
        } else {
            throw h();
        }
    }
}
