package com.oplus.aiunit.vision;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes11.dex */
public class z75 extends qwa {
    public static final byte[] m = new byte[0];
    public final int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f19305l;

    public z75(InputStream inputStream, int i) {
        super(inputStream, i);
        if (i < 0) {
            throw new IllegalArgumentException("negative lengths not allowed");
        }
        this.k = i;
        this.f19305l = i;
        if (i == 0) {
            g(true);
        }
    }

    @Override // com.oplus.aiunit.vision.qwa
    public int a() {
        return this.f19305l;
    }

    public byte[] h() throws IOException {
        int i = this.f19305l;
        if (i == 0) {
            return m;
        }
        byte[] bArr = new byte[i];
        int iC = i - pwi.c(this.i, bArr);
        this.f19305l = iC;
        if (iC == 0) {
            g(true);
            return bArr;
        }
        throw new EOFException("DEF length " + this.k + " object truncated by " + this.f19305l);
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        if (this.f19305l == 0) {
            return -1;
        }
        int i = this.i.read();
        if (i >= 0) {
            int i2 = this.f19305l - 1;
            this.f19305l = i2;
            if (i2 == 0) {
                g(true);
            }
            return i;
        }
        throw new EOFException("DEF length " + this.k + " object truncated by " + this.f19305l);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this.f19305l;
        if (i3 == 0) {
            return -1;
        }
        int i4 = this.i.read(bArr, i, Math.min(i2, i3));
        if (i4 >= 0) {
            int i5 = this.f19305l - i4;
            this.f19305l = i5;
            if (i5 == 0) {
                g(true);
            }
            return i4;
        }
        throw new EOFException("DEF length " + this.k + " object truncated by " + this.f19305l);
    }
}
