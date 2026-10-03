package io.protostuff;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes10.dex */
public final class LimitedInputStream extends FilterInputStream {
    private int limit;

    public LimitedInputStream(InputStream inputStream) {
        super(inputStream);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int available() throws IOException {
        return Math.min(super.available(), this.limit);
    }

    public LimitedInputStream limit(int i) {
        this.limit = i;
        return this;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        if (this.limit <= 0) {
            return -1;
        }
        int i = super.read();
        if (i >= 0) {
            this.limit--;
        }
        return i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j2) throws IOException {
        long jSkip = super.skip(Math.min(j2, this.limit));
        if (jSkip >= 0) {
            this.limit = (int) (((long) this.limit) - jSkip);
        }
        return jSkip;
    }

    public LimitedInputStream(InputStream inputStream, int i) {
        super(inputStream);
        this.limit = i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this.limit;
        if (i3 <= 0) {
            return -1;
        }
        int i4 = super.read(bArr, i, Math.min(i2, i3));
        if (i4 >= 0) {
            this.limit -= i4;
        }
        return i4;
    }
}
