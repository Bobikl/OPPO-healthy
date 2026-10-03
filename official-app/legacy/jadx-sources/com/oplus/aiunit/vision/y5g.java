package com.oplus.aiunit.vision;

import org.apache.commons.codec.digest.MessageDigestAlgorithms;

/* JADX INFO: loaded from: classes11.dex */
public class y5g extends i48 {
    public int d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f18881e;
    public int f;
    public int g;
    public int h;
    public int[] i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f18882j;

    public y5g() {
        this.i = new int[80];
        reset();
    }

    @Override // com.oplus.aiunit.vision.ns5
    public int a(byte[] bArr, int i) {
        i();
        h2e.c(this.d, bArr, i);
        h2e.c(this.f18881e, bArr, i + 4);
        h2e.c(this.f, bArr, i + 8);
        h2e.c(this.g, bArr, i + 12);
        h2e.c(this.h, bArr, i + 16);
        reset();
        return 20;
    }

    @Override // com.oplus.aiunit.vision.ns5
    public String c() {
        return MessageDigestAlgorithms.SHA_1;
    }

    @Override // com.oplus.aiunit.vision.gsb
    public gsb copy() {
        return new y5g(this);
    }

    @Override // com.oplus.aiunit.vision.gsb
    public void d(gsb gsbVar) {
        y5g y5gVar = (y5g) gsbVar;
        super.h(y5gVar);
        m(y5gVar);
    }

    @Override // com.oplus.aiunit.vision.ns5
    public int f() {
        return 20;
    }

    @Override // com.oplus.aiunit.vision.i48
    public void j() {
        for (int i = 16; i < 80; i++) {
            int[] iArr = this.i;
            int i2 = ((iArr[i - 3] ^ iArr[i - 8]) ^ iArr[i - 14]) ^ iArr[i - 16];
            iArr[i] = (i2 >>> 31) | (i2 << 1);
        }
        int iP = this.d;
        int iP2 = this.f18881e;
        int i3 = this.f;
        int i4 = this.g;
        int i5 = this.h;
        int i6 = 0;
        int i7 = 0;
        while (i6 < 4) {
            int i8 = i7 + 1;
            int iN = i5 + ((iP << 5) | (iP >>> 27)) + n(iP2, i3, i4) + this.i[i7] + 1518500249;
            int i9 = (iP2 >>> 2) | (iP2 << 30);
            int i10 = i8 + 1;
            int iN2 = i4 + ((iN << 5) | (iN >>> 27)) + n(iP, i9, i3) + this.i[i8] + 1518500249;
            int i11 = (iP >>> 2) | (iP << 30);
            int i12 = i10 + 1;
            int iN3 = i3 + ((iN2 << 5) | (iN2 >>> 27)) + n(iN, i11, i9) + this.i[i10] + 1518500249;
            i5 = (iN >>> 2) | (iN << 30);
            int i13 = i12 + 1;
            iP2 = i9 + ((iN3 << 5) | (iN3 >>> 27)) + n(iN2, i5, i11) + this.i[i12] + 1518500249;
            i4 = (iN2 >>> 2) | (iN2 << 30);
            iP = i11 + ((iP2 << 5) | (iP2 >>> 27)) + n(iN3, i4, i5) + this.i[i13] + 1518500249;
            i3 = (iN3 >>> 2) | (iN3 << 30);
            i6++;
            i7 = i13 + 1;
        }
        int i14 = 0;
        while (i14 < 4) {
            int i15 = i7 + 1;
            int iP3 = i5 + ((iP << 5) | (iP >>> 27)) + p(iP2, i3, i4) + this.i[i7] + 1859775393;
            int i16 = (iP2 >>> 2) | (iP2 << 30);
            int i17 = i15 + 1;
            int iP4 = i4 + ((iP3 << 5) | (iP3 >>> 27)) + p(iP, i16, i3) + this.i[i15] + 1859775393;
            int i18 = (iP >>> 2) | (iP << 30);
            int i19 = i17 + 1;
            int iP5 = i3 + ((iP4 << 5) | (iP4 >>> 27)) + p(iP3, i18, i16) + this.i[i17] + 1859775393;
            i5 = (iP3 >>> 2) | (iP3 << 30);
            int i20 = i19 + 1;
            iP2 = i16 + ((iP5 << 5) | (iP5 >>> 27)) + p(iP4, i5, i18) + this.i[i19] + 1859775393;
            i4 = (iP4 >>> 2) | (iP4 << 30);
            iP = i18 + ((iP2 << 5) | (iP2 >>> 27)) + p(iP5, i4, i5) + this.i[i20] + 1859775393;
            i3 = (iP5 >>> 2) | (iP5 << 30);
            i14++;
            i7 = i20 + 1;
        }
        int i21 = 0;
        while (i21 < 4) {
            int i22 = i7 + 1;
            int iO = i5 + (((((iP << 5) | (iP >>> 27)) + o(iP2, i3, i4)) + this.i[i7]) - 1894007588);
            int i23 = (iP2 >>> 2) | (iP2 << 30);
            int i24 = i22 + 1;
            int iO2 = i4 + (((((iO << 5) | (iO >>> 27)) + o(iP, i23, i3)) + this.i[i22]) - 1894007588);
            int i25 = (iP >>> 2) | (iP << 30);
            int i26 = i24 + 1;
            int iO3 = i3 + (((((iO2 << 5) | (iO2 >>> 27)) + o(iO, i25, i23)) + this.i[i24]) - 1894007588);
            i5 = (iO >>> 2) | (iO << 30);
            int i27 = i26 + 1;
            iP2 = i23 + (((((iO3 << 5) | (iO3 >>> 27)) + o(iO2, i5, i25)) + this.i[i26]) - 1894007588);
            i4 = (iO2 >>> 2) | (iO2 << 30);
            iP = i25 + (((((iP2 << 5) | (iP2 >>> 27)) + o(iO3, i4, i5)) + this.i[i27]) - 1894007588);
            i3 = (iO3 >>> 2) | (iO3 << 30);
            i21++;
            i7 = i27 + 1;
        }
        int i28 = 0;
        while (i28 <= 3) {
            int i29 = i7 + 1;
            int iP6 = i5 + (((((iP << 5) | (iP >>> 27)) + p(iP2, i3, i4)) + this.i[i7]) - 899497514);
            int i30 = (iP2 >>> 2) | (iP2 << 30);
            int i31 = i29 + 1;
            int iP7 = i4 + (((((iP6 << 5) | (iP6 >>> 27)) + p(iP, i30, i3)) + this.i[i29]) - 899497514);
            int i32 = (iP >>> 2) | (iP << 30);
            int i33 = i31 + 1;
            int iP8 = i3 + (((((iP7 << 5) | (iP7 >>> 27)) + p(iP6, i32, i30)) + this.i[i31]) - 899497514);
            i5 = (iP6 >>> 2) | (iP6 << 30);
            int i34 = i33 + 1;
            iP2 = i30 + (((((iP8 << 5) | (iP8 >>> 27)) + p(iP7, i5, i32)) + this.i[i33]) - 899497514);
            i4 = (iP7 >>> 2) | (iP7 << 30);
            iP = i32 + (((((iP2 << 5) | (iP2 >>> 27)) + p(iP8, i4, i5)) + this.i[i34]) - 899497514);
            i3 = (iP8 >>> 2) | (iP8 << 30);
            i28++;
            i7 = i34 + 1;
        }
        this.d += iP;
        this.f18881e += iP2;
        this.f += i3;
        this.g += i4;
        this.h += i5;
        this.f18882j = 0;
        for (int i35 = 0; i35 < 16; i35++) {
            this.i[i35] = 0;
        }
    }

    @Override // com.oplus.aiunit.vision.i48
    public void k(long j2) {
        if (this.f18882j > 14) {
            j();
        }
        int[] iArr = this.i;
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
        int[] iArr = this.i;
        int i7 = this.f18882j;
        iArr[i7] = i6;
        int i8 = i7 + 1;
        this.f18882j = i8;
        if (i8 == 16) {
            j();
        }
    }

    public final void m(y5g y5gVar) {
        this.d = y5gVar.d;
        this.f18881e = y5gVar.f18881e;
        this.f = y5gVar.f;
        this.g = y5gVar.g;
        this.h = y5gVar.h;
        int[] iArr = y5gVar.i;
        System.arraycopy(iArr, 0, this.i, 0, iArr.length);
        this.f18882j = y5gVar.f18882j;
    }

    public final int n(int i, int i2, int i3) {
        return (i & i2) | ((~i) & i3);
    }

    public final int o(int i, int i2, int i3) {
        return (i & i2) | (i & i3) | (i2 & i3);
    }

    public final int p(int i, int i2, int i3) {
        return (i ^ i2) ^ i3;
    }

    @Override // com.oplus.aiunit.vision.i48, com.oplus.aiunit.vision.ns5
    public void reset() {
        super.reset();
        this.d = 1732584193;
        this.f18881e = -271733879;
        this.f = -1732584194;
        this.g = 271733878;
        this.h = -1009589776;
        this.f18882j = 0;
        int i = 0;
        while (true) {
            int[] iArr = this.i;
            if (i == iArr.length) {
                return;
            }
            iArr[i] = 0;
            i++;
        }
    }

    public y5g(y5g y5gVar) {
        super(y5gVar);
        this.i = new int[80];
        m(y5gVar);
    }
}
