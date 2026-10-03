package com.oplus.aiunit.vision;

import p010kotlin.jvm.internal.ByteCompanionObject;

/* JADX INFO: loaded from: classes11.dex */
public class yma implements nz6 {
    public static long[] g = r();
    public static int[] h = q();
    public long[] a = new long[25];
    public byte[] b = new byte[192];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f19066c;
    public int d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f19067e;
    public boolean f;

    public yma(int i) {
        n(i);
    }

    public static boolean j(byte[] bArr) {
        byte b = bArr[0];
        boolean z = (b & 1) != 0;
        if ((b & ByteCompanionObject.MIN_VALUE) != 0) {
            bArr[0] = (byte) ((b << 1) ^ 113);
        } else {
            bArr[0] = (byte) (b << 1);
        }
        return z;
    }

    public static void m(long[] jArr) {
        int i = 0;
        while (i < 25) {
            int i2 = i + 0;
            long j2 = jArr[i2];
            int i3 = i + 1;
            long j3 = jArr[i3];
            long j4 = ~j3;
            int i4 = i + 2;
            long j5 = jArr[i4];
            long j6 = (j4 & j5) ^ j2;
            long j7 = ~j5;
            int i5 = i + 3;
            long j8 = jArr[i5];
            long j9 = (j7 & j8) ^ j3;
            long j10 = ~j8;
            int i6 = i + 4;
            int i7 = i;
            long j11 = jArr[i6];
            long j12 = j5 ^ (j10 & j11);
            long j13 = j8 ^ ((~j11) & j2);
            long j14 = j11 ^ ((~j2) & j3);
            jArr[i2] = j6;
            jArr[i3] = j9;
            jArr[i4] = j12;
            jArr[i5] = j13;
            jArr[i6] = j14;
            i = i7 + 5;
        }
    }

    public static void p(long[] jArr, int i) {
        jArr[0] = jArr[0] ^ g[i];
    }

    public static int[] q() {
        int[] iArr = new int[25];
        int i = 0;
        iArr[0] = 0;
        int i2 = 1;
        int i3 = 0;
        while (i < 24) {
            int i4 = i + 1;
            iArr[(i2 % 5) + ((i3 % 5) * 5)] = (((i + 2) * i4) / 2) % 64;
            int i5 = ((i2 * 0) + (i3 * 1)) % 5;
            i3 = ((i2 * 2) + (i3 * 3)) % 5;
            i2 = i5;
            i = i4;
        }
        return iArr;
    }

    public static long[] r() {
        long[] jArr = new long[24];
        byte[] bArr = {1};
        for (int i = 0; i < 24; i++) {
            jArr[i] = 0;
            for (int i2 = 0; i2 < 7; i2++) {
                int i3 = (1 << i2) - 1;
                if (j(bArr)) {
                    jArr[i] = jArr[i] ^ (1 << i3);
                }
            }
        }
        return jArr;
    }

    public static long s(long j2, int i) {
        return (j2 >>> (-i)) | (j2 << i);
    }

    public static void u(long[] jArr) {
        long j2 = jArr[1];
        jArr[1] = jArr[6];
        jArr[6] = jArr[9];
        jArr[9] = jArr[22];
        jArr[22] = jArr[14];
        jArr[14] = jArr[20];
        jArr[20] = jArr[2];
        jArr[2] = jArr[12];
        jArr[12] = jArr[13];
        jArr[13] = jArr[19];
        jArr[19] = jArr[23];
        jArr[23] = jArr[15];
        jArr[15] = jArr[4];
        jArr[4] = jArr[24];
        jArr[24] = jArr[21];
        jArr[21] = jArr[8];
        jArr[8] = jArr[16];
        jArr[16] = jArr[5];
        jArr[5] = jArr[3];
        jArr[3] = jArr[18];
        jArr[18] = jArr[17];
        jArr[17] = jArr[11];
        jArr[11] = jArr[7];
        jArr[7] = jArr[10];
        jArr[10] = j2;
    }

    public static void v(long[] jArr) {
        for (int i = 1; i < 25; i++) {
            jArr[i] = s(jArr[i], h[i]);
        }
    }

    public static void x(long[] jArr) {
        long j2 = (((jArr[0] ^ jArr[5]) ^ jArr[10]) ^ jArr[15]) ^ jArr[20];
        long j3 = (((jArr[1] ^ jArr[6]) ^ jArr[11]) ^ jArr[16]) ^ jArr[21];
        long j4 = (((jArr[2] ^ jArr[7]) ^ jArr[12]) ^ jArr[17]) ^ jArr[22];
        long j5 = (((jArr[3] ^ jArr[8]) ^ jArr[13]) ^ jArr[18]) ^ jArr[23];
        long j6 = (((jArr[4] ^ jArr[9]) ^ jArr[14]) ^ jArr[19]) ^ jArr[24];
        long jS = s(j3, 1) ^ j6;
        jArr[0] = jArr[0] ^ jS;
        jArr[5] = jArr[5] ^ jS;
        jArr[10] = jArr[10] ^ jS;
        jArr[15] = jArr[15] ^ jS;
        jArr[20] = jArr[20] ^ jS;
        long jS2 = s(j4, 1) ^ j2;
        jArr[1] = jArr[1] ^ jS2;
        jArr[6] = jArr[6] ^ jS2;
        jArr[11] = jArr[11] ^ jS2;
        jArr[16] = jArr[16] ^ jS2;
        jArr[21] = jS2 ^ jArr[21];
        long jS3 = s(j5, 1) ^ j3;
        jArr[2] = jArr[2] ^ jS3;
        jArr[7] = jArr[7] ^ jS3;
        jArr[12] = jArr[12] ^ jS3;
        jArr[17] = jArr[17] ^ jS3;
        jArr[22] = jS3 ^ jArr[22];
        long jS4 = s(j6, 1) ^ j4;
        jArr[3] = jArr[3] ^ jS4;
        jArr[8] = jArr[8] ^ jS4;
        jArr[13] = jArr[13] ^ jS4;
        jArr[18] = jArr[18] ^ jS4;
        jArr[23] = jS4 ^ jArr[23];
        long jS5 = s(j2, 1) ^ j5;
        jArr[4] = jArr[4] ^ jS5;
        jArr[9] = jArr[9] ^ jS5;
        jArr[14] = jArr[14] ^ jS5;
        jArr[19] = jArr[19] ^ jS5;
        jArr[24] = jS5 ^ jArr[24];
    }

    @Override // com.oplus.aiunit.vision.ns5
    public void b(byte b) {
        k(new byte[]{b}, 0, 1);
    }

    public final void d(byte[] bArr, int i) {
        int i2 = this.f19066c >> 6;
        for (int i3 = 0; i3 < i2; i3++) {
            long[] jArr = this.a;
            jArr[i3] = jArr[i3] ^ h2e.f(bArr, i);
            i += 8;
        }
        i();
    }

    @Override // com.oplus.aiunit.vision.ns5
    public int f() {
        return this.f19067e / 8;
    }

    @Override // com.oplus.aiunit.vision.nz6
    public int g() {
        return this.f19066c / 8;
    }

    public final void h() {
        h2e.k(this.a, 0, this.f19066c >> 6, this.b, 0);
    }

    public final void i() {
        for (int i = 0; i < 24; i++) {
            x(this.a);
            v(this.a);
            u(this.a);
            m(this.a);
            p(this.a, i);
        }
    }

    public void k(byte[] bArr, int i, int i2) {
        int i3;
        int i4 = this.d;
        if (i4 % 8 != 0) {
            throw new IllegalStateException("attempt to absorb with odd length queue");
        }
        if (this.f) {
            throw new IllegalStateException("attempt to absorb while squeezing");
        }
        int i5 = i4 >> 3;
        int i6 = this.f19066c >> 3;
        int i7 = 0;
        while (i7 < i2) {
            if (i5 != 0 || i7 > (i3 = i2 - i6)) {
                int iMin = Math.min(i6 - i5, i2 - i7);
                System.arraycopy(bArr, i + i7, this.b, i5, iMin);
                i5 += iMin;
                i7 += iMin;
                if (i5 == i6) {
                    d(this.b, 0);
                    i5 = 0;
                }
            } else {
                do {
                    d(bArr, i + i7);
                    i7 += i6;
                } while (i7 <= i3);
            }
        }
        this.d = i5 << 3;
    }

    public void l(int i, int i2) {
        if (i2 < 1 || i2 > 7) {
            throw new IllegalArgumentException("'bits' must be in the range 1 to 7");
        }
        int i3 = this.d;
        if (i3 % 8 != 0) {
            throw new IllegalStateException("attempt to absorb with odd length queue");
        }
        if (this.f) {
            throw new IllegalStateException("attempt to absorb while squeezing");
        }
        this.b[i3 >> 3] = (byte) (i & ((1 << i2) - 1));
        this.d = i3 + i2;
    }

    public final void n(int i) {
        if (i != 128 && i != 224 && i != 256 && i != 288 && i != 384 && i != 512) {
            throw new IllegalArgumentException("bitLength must be one of 128, 224, 256, 288, 384, or 512.");
        }
        o(1600 - (i << 1));
    }

    public final void o(int i) {
        if (i <= 0 || i >= 1600 || i % 64 != 0) {
            throw new IllegalStateException("invalid rate value");
        }
        this.f19066c = i;
        int i2 = 0;
        while (true) {
            long[] jArr = this.a;
            if (i2 >= jArr.length) {
                eh0.n(this.b, (byte) 0);
                this.d = 0;
                this.f = false;
                this.f19067e = (1600 - i) / 2;
                return;
            }
            jArr[i2] = 0;
            i2++;
        }
    }

    @Override // com.oplus.aiunit.vision.ns5
    public void reset() {
        n(this.f19067e);
    }

    public final void t() {
        byte[] bArr = this.b;
        int i = this.d;
        int i2 = i >> 3;
        bArr[i2] = (byte) (bArr[i2] | ((byte) (1 << (i & 7))));
        int i3 = i + 1;
        this.d = i3;
        if (i3 == this.f19066c) {
            d(bArr, 0);
            this.d = 0;
        }
        int i4 = this.d;
        int i5 = i4 >> 6;
        int i6 = i4 & 63;
        int i7 = 0;
        for (int i8 = 0; i8 < i5; i8++) {
            long[] jArr = this.a;
            jArr[i8] = jArr[i8] ^ h2e.f(this.b, i7);
            i7 += 8;
        }
        if (i6 > 0) {
            long j2 = (1 << i6) - 1;
            long[] jArr2 = this.a;
            jArr2[i5] = jArr2[i5] ^ (h2e.f(this.b, i7) & j2);
        }
        long[] jArr3 = this.a;
        int i9 = (this.f19066c - 1) >> 6;
        jArr3[i9] = jArr3[i9] ^ Long.MIN_VALUE;
        i();
        h();
        this.d = this.f19066c;
        this.f = true;
    }

    @Override // com.oplus.aiunit.vision.ns5
    public void update(byte[] bArr, int i, int i2) {
        k(bArr, i, i2);
    }

    public void w(byte[] bArr, int i, long j2) {
        if (!this.f) {
            t();
        }
        long j3 = 0;
        if (j2 % 8 != 0) {
            throw new IllegalStateException("outputLength not a multiple of 8");
        }
        while (j3 < j2) {
            if (this.d == 0) {
                i();
                h();
                this.d = this.f19066c;
            }
            int iMin = (int) Math.min(this.d, j2 - j3);
            System.arraycopy(this.b, (this.f19066c - this.d) / 8, bArr, ((int) (j3 / 8)) + i, iMin / 8);
            this.d -= iMin;
            j3 += (long) iMin;
        }
    }
}
