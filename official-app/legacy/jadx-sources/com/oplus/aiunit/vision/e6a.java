package com.oplus.aiunit.vision;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes11.dex */
public class e6a extends qwa {
    public int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f10805l;
    public boolean m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f10806n;

    public e6a(InputStream inputStream, int i) throws IOException {
        super(inputStream, i);
        this.m = false;
        this.f10806n = true;
        this.k = inputStream.read();
        int i2 = inputStream.read();
        this.f10805l = i2;
        if (i2 < 0) {
            throw new EOFException();
        }
        h();
    }

    public final boolean h() {
        if (!this.m && this.f10806n && this.k == 0 && this.f10805l == 0) {
            this.m = true;
            g(true);
        }
        return this.m;
    }

    public void i(boolean z) {
        this.f10806n = z;
        h();
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        if (this.f10806n || i2 < 3) {
            return super.read(bArr, i, i2);
        }
        if (this.m) {
            return -1;
        }
        int i3 = this.i.read(bArr, i + 2, i2 - 2);
        if (i3 < 0) {
            throw new EOFException();
        }
        bArr[i] = (byte) this.k;
        bArr[i + 1] = (byte) this.f10805l;
        this.k = this.i.read();
        int i4 = this.i.read();
        this.f10805l = i4;
        if (i4 >= 0) {
            return i3 + 2;
        }
        throw new EOFException();
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        if (h()) {
            return -1;
        }
        int i = this.i.read();
        if (i >= 0) {
            int i2 = this.k;
            this.k = this.f10805l;
            this.f10805l = i;
            return i2;
        }
        throw new EOFException();
    }
}
