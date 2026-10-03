package com.oplus.aiunit.vision;

import androidx.annotation.NonNull;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes13.dex */
public final class c84 extends FilterInputStream {
    public final long i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f9982j;

    public c84(@NonNull InputStream inputStream, long j2) {
        super(inputStream);
        this.i = j2;
    }

    @NonNull
    public static InputStream g(@NonNull InputStream inputStream, long j2) {
        return new c84(inputStream, j2);
    }

    public final int a(int i) throws IOException {
        if (i >= 0) {
            this.f9982j += i;
        } else if (this.i - ((long) this.f9982j) > 0) {
            throw new IOException("Failed to read all expected data, expected: " + this.i + ", but read: " + this.f9982j);
        }
        return i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int available() throws IOException {
        return (int) Math.max(this.i - ((long) this.f9982j), ((FilterInputStream) this).in.available());
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read() throws IOException {
        int i;
        i = super.read();
        a(i >= 0 ? 1 : -1);
        return i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read(byte[] bArr, int i, int i2) throws IOException {
        return a(super.read(bArr, i, i2));
    }
}
