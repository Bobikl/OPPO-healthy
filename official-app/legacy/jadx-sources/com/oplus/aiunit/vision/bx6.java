package com.oplus.aiunit.vision;

import androidx.annotation.NonNull;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes13.dex */
public final class bx6 extends FilterInputStream {
    public static final byte[] k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f9877l;
    public static final int m;
    public final byte i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f9878j;

    static {
        byte[] bArr = {-1, -31, 0, 28, 69, 120, 105, 102, 0, 0, 77, 77, 0, 0, 0, 0, 0, 8, 0, 1, 1, 18, 0, 2, 0, 0, 0, 1, 0};
        k = bArr;
        int length = bArr.length;
        f9877l = length;
        m = length + 2;
    }

    public bx6(InputStream inputStream, int i) {
        super(inputStream);
        if (i >= -1 && i <= 8) {
            this.i = (byte) i;
            return;
        }
        throw new IllegalArgumentException("Cannot add invalid orientation: " + i);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void mark(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        int i;
        int i2;
        int i3 = this.f9878j;
        if (i3 < 2 || i3 > (i2 = m)) {
            i = super.read();
        } else {
            i = i3 == i2 ? this.i : k[i3 - 2] & 255;
        }
        if (i != -1) {
            this.f9878j++;
        }
        return i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void reset() throws IOException {
        throw new UnsupportedOperationException();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j2) throws IOException {
        long jSkip = super.skip(j2);
        if (jSkip > 0) {
            this.f9878j = (int) (((long) this.f9878j) + jSkip);
        }
        return jSkip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(@NonNull byte[] bArr, int i, int i2) throws IOException {
        int i3;
        int i4 = this.f9878j;
        int i5 = m;
        if (i4 > i5) {
            i3 = super.read(bArr, i, i2);
        } else if (i4 == i5) {
            bArr[i] = this.i;
            i3 = 1;
        } else if (i4 < 2) {
            i3 = super.read(bArr, i, 2 - i4);
        } else {
            int iMin = Math.min(i5 - i4, i2);
            System.arraycopy(k, this.f9878j - 2, bArr, i, iMin);
            i3 = iMin;
        }
        if (i3 > 0) {
            this.f9878j += i3;
        }
        return i3;
    }
}
