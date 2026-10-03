package com.oplus.aiunit.vision;

import org.apache.commons.codec.digest.MessageDigestAlgorithms;

/* JADX INFO: loaded from: classes11.dex */
public class z5g extends i48 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int[] f19270n = {1116352408, 1899447441, -1245643825, -373957723, 961987163, 1508970993, -1841331548, -1424204075, -670586216, 310598401, 607225278, 1426881987, 1925078388, -2132889090, -1680079193, -1046744716, -459576895, -272742522, 264347078, 604807628, 770255983, 1249150122, 1555081692, 1996064986, -1740746414, -1473132947, -1341970488, -1084653625, -958395405, -710438585, 113926993, 338241895, 666307205, 773529912, 1294757372, 1396182291, 1695183700, 1986661051, -2117940946, -1838011259, -1564481375, -1474664885, -1035236496, -949202525, -778901479, -694614492, -200395387, 275423344, 430227734, 506948616, 659060556, 883997877, 958139571, 1322822218, 1537002063, 1747873779, 1955562222, 2024104815, -2067236844, -1933114872, -1866530822, -1538233109, -1090935817, -965641998};
    public int d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f19271e;
    public int f;
    public int g;
    public int h;
    public int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f19272j;
    public int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int[] f19273l;
    public int m;

    public z5g() {
        this.f19273l = new int[64];
        reset();
    }

    @Override // com.oplus.aiunit.vision.ns5
    public int a(byte[] bArr, int i) {
        i();
        h2e.c(this.d, bArr, i);
        h2e.c(this.f19271e, bArr, i + 4);
        h2e.c(this.f, bArr, i + 8);
        h2e.c(this.g, bArr, i + 12);
        h2e.c(this.h, bArr, i + 16);
        h2e.c(this.i, bArr, i + 20);
        h2e.c(this.f19272j, bArr, i + 24);
        reset();
        return 28;
    }

    @Override // com.oplus.aiunit.vision.ns5
    public String c() {
        return MessageDigestAlgorithms.SHA_224;
    }

    @Override // com.oplus.aiunit.vision.gsb
    public gsb copy() {
        return new z5g(this);
    }

    @Override // com.oplus.aiunit.vision.gsb
    public void d(gsb gsbVar) {
        s((z5g) gsbVar);
    }

    @Override // com.oplus.aiunit.vision.ns5
    public int f() {
        return 28;
    }

    @Override // com.oplus.aiunit.vision.i48
    public void j() {
        for (int i = 16; i <= 63; i++) {
            int[] iArr = this.f19273l;
            int iR = r(iArr[i - 2]);
            int[] iArr2 = this.f19273l;
            iArr[i] = iR + iArr2[i - 7] + q(iArr2[i - 15]) + this.f19273l[i - 16];
        }
        int iO = this.d;
        int iO2 = this.f19271e;
        int iO3 = this.f;
        int iO4 = this.g;
        int i2 = this.h;
        int i3 = this.i;
        int i4 = this.f19272j;
        int i5 = this.k;
        int i6 = 0;
        for (int i7 = 0; i7 < 8; i7++) {
            int iP = p(i2) + m(i2, i3, i4);
            int[] iArr3 = f19270n;
            int i8 = i5 + iP + iArr3[i6] + this.f19273l[i6];
            int i9 = iO4 + i8;
            int iO5 = i8 + o(iO) + n(iO, iO2, iO3);
            int i10 = i6 + 1;
            int iP2 = i4 + p(i9) + m(i9, i2, i3) + iArr3[i10] + this.f19273l[i10];
            int i11 = iO3 + iP2;
            int iO6 = iP2 + o(iO5) + n(iO5, iO, iO2);
            int i12 = i10 + 1;
            int iP3 = i3 + p(i11) + m(i11, i9, i2) + iArr3[i12] + this.f19273l[i12];
            int i13 = iO2 + iP3;
            int iO7 = iP3 + o(iO6) + n(iO6, iO5, iO);
            int i14 = i12 + 1;
            int iP4 = i2 + p(i13) + m(i13, i11, i9) + iArr3[i14] + this.f19273l[i14];
            int i15 = iO + iP4;
            int iO8 = iP4 + o(iO7) + n(iO7, iO6, iO5);
            int i16 = i14 + 1;
            int iP5 = i9 + p(i15) + m(i15, i13, i11) + iArr3[i16] + this.f19273l[i16];
            i5 = iO5 + iP5;
            iO4 = iP5 + o(iO8) + n(iO8, iO7, iO6);
            int i17 = i16 + 1;
            int iP6 = i11 + p(i5) + m(i5, i15, i13) + iArr3[i17] + this.f19273l[i17];
            i4 = iO6 + iP6;
            iO3 = iP6 + o(iO4) + n(iO4, iO8, iO7);
            int i18 = i17 + 1;
            int iP7 = i13 + p(i4) + m(i4, i5, i15) + iArr3[i18] + this.f19273l[i18];
            i3 = iO7 + iP7;
            iO2 = iP7 + o(iO3) + n(iO3, iO4, iO8);
            int i19 = i18 + 1;
            int iP8 = i15 + p(i3) + m(i3, i4, i5) + iArr3[i19] + this.f19273l[i19];
            i2 = iO8 + iP8;
            iO = iP8 + o(iO2) + n(iO2, iO3, iO4);
            i6 = i19 + 1;
        }
        this.d += iO;
        this.f19271e += iO2;
        this.f += iO3;
        this.g += iO4;
        this.h += i2;
        this.i += i3;
        this.f19272j += i4;
        this.k += i5;
        this.m = 0;
        for (int i20 = 0; i20 < 16; i20++) {
            this.f19273l[i20] = 0;
        }
    }

    @Override // com.oplus.aiunit.vision.i48
    public void k(long j2) {
        if (this.m > 14) {
            j();
        }
        int[] iArr = this.f19273l;
        iArr[14] = (int) (j2 >>> 32);
        iArr[15] = (int) (j2 & (-1));
    }

    @Override // com.oplus.aiunit.vision.i48
    public void l(byte[] bArr, int i) {
        int i2 = bArr[i] << 24;
        int i3 = i + 1;
        int i4 = i2 | ((bArr[i3] & 255) << 16);
        int i5 = i3 + 1;
        int i6 = (bArr[i5 + 1] & 255) | i4 | ((bArr[i5] & 255) << 8);
        int[] iArr = this.f19273l;
        int i7 = this.m;
        iArr[i7] = i6;
        int i8 = i7 + 1;
        this.m = i8;
        if (i8 == 16) {
            j();
        }
    }

    public final int m(int i, int i2, int i3) {
        return (i & i2) ^ ((~i) & i3);
    }

    public final int n(int i, int i2, int i3) {
        return ((i & i2) ^ (i & i3)) ^ (i2 & i3);
    }

    public final int o(int i) {
        return (((i >>> 2) | (i << 30)) ^ ((i >>> 13) | (i << 19))) ^ ((i << 10) | (i >>> 22));
    }

    public final int p(int i) {
        return (((i >>> 6) | (i << 26)) ^ ((i >>> 11) | (i << 21))) ^ ((i << 7) | (i >>> 25));
    }

    public final int q(int i) {
        return (((i >>> 7) | (i << 25)) ^ ((i >>> 18) | (i << 14))) ^ (i >>> 3);
    }

    public final int r(int i) {
        return (((i >>> 17) | (i << 15)) ^ ((i >>> 19) | (i << 13))) ^ (i >>> 10);
    }

    @Override // com.oplus.aiunit.vision.i48, com.oplus.aiunit.vision.ns5
    public void reset() {
        super.reset();
        this.d = -1056596264;
        this.f19271e = 914150663;
        this.f = 812702999;
        this.g = -150054599;
        this.h = -4191439;
        this.i = 1750603025;
        this.f19272j = 1694076839;
        this.k = -1090891868;
        this.m = 0;
        int i = 0;
        while (true) {
            int[] iArr = this.f19273l;
            if (i == iArr.length) {
                return;
            }
            iArr[i] = 0;
            i++;
        }
    }

    public final void s(z5g z5gVar) {
        super.h(z5gVar);
        this.d = z5gVar.d;
        this.f19271e = z5gVar.f19271e;
        this.f = z5gVar.f;
        this.g = z5gVar.g;
        this.h = z5gVar.h;
        this.i = z5gVar.i;
        this.f19272j = z5gVar.f19272j;
        this.k = z5gVar.k;
        int[] iArr = z5gVar.f19273l;
        System.arraycopy(iArr, 0, this.f19273l, 0, iArr.length);
        this.m = z5gVar.m;
    }

    public z5g(z5g z5gVar) {
        super(z5gVar);
        this.f19273l = new int[64];
        s(z5gVar);
    }
}
