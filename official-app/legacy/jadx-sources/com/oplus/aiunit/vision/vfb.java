package com.oplus.aiunit.vision;

import androidx.annotation.NonNull;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes13.dex */
public class vfb extends FilterInputStream {
    public int i;

    public vfb(@NonNull InputStream inputStream) {
        super(inputStream);
        this.i = Integer.MIN_VALUE;
    }

    public final long a(long j2) {
        int i = this.i;
        if (i == 0) {
            return -1L;
        }
        return (i == Integer.MIN_VALUE || j2 <= ((long) i)) ? j2 : i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int available() throws IOException {
        int i = this.i;
        return i == Integer.MIN_VALUE ? super.available() : Math.min(i, super.available());
    }

    public final void g(long j2) {
        int i = this.i;
        if (i == Integer.MIN_VALUE || j2 == -1) {
            return;
        }
        this.i = (int) (((long) i) - j2);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void mark(int i) {
        super.mark(i);
        this.i = i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        if (a(1L) == -1) {
            return -1;
        }
        int i = super.read();
        g(1L);
        return i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void reset() throws IOException {
        super.reset();
        this.i = Integer.MIN_VALUE;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j2) throws IOException {
        long jA = a(j2);
        if (jA == -1) {
            return 0L;
        }
        long jSkip = super.skip(jA);
        g(jSkip);
        return jSkip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(@NonNull byte[] bArr, int i, int i2) throws IOException {
        int iA = (int) a(i2);
        if (iA == -1) {
            return -1;
        }
        int i3 = super.read(bArr, i, iA);
        g(i3);
        return i3;
    }
}
