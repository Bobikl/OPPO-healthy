package com.oplus.aiunit.vision;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes11.dex */
public class cf4 extends h86 {
    public static final BigInteger Q = af4.q;
    public static final int[] b = {1242472624, -991028441, -1389370248, 792926214, 1039914919, 726466713, 1338105611, 730014848};
    public int[] a;

    public cf4(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(Q) >= 0) {
            throw new IllegalArgumentException("x value invalid for Curve25519FieldElement");
        }
        this.a = bf4.d(bigInteger);
    }

    @Override // com.oplus.aiunit.vision.h86
    public h86 a(h86 h86Var) {
        int[] iArrF = afc.f();
        bf4.a(this.a, ((cf4) h86Var).a, iArrF);
        return new cf4(iArrF);
    }

    @Override // com.oplus.aiunit.vision.h86
    public h86 b() {
        int[] iArrF = afc.f();
        bf4.b(this.a, iArrF);
        return new cf4(iArrF);
    }

    @Override // com.oplus.aiunit.vision.h86
    public h86 d(h86 h86Var) {
        int[] iArrF = afc.f();
        c2c.d(bf4.a, ((cf4) h86Var).a, iArrF);
        bf4.e(iArrF, this.a, iArrF);
        return new cf4(iArrF);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cf4) {
            return afc.k(this.a, ((cf4) obj).a);
        }
        return false;
    }

    @Override // com.oplus.aiunit.vision.h86
    public int f() {
        return Q.bitLength();
    }

    @Override // com.oplus.aiunit.vision.h86
    public h86 g() {
        int[] iArrF = afc.f();
        c2c.d(bf4.a, this.a, iArrF);
        return new cf4(iArrF);
    }

    @Override // com.oplus.aiunit.vision.h86
    public boolean h() {
        return afc.r(this.a);
    }

    public int hashCode() {
        return eh0.s(this.a, 0, 8) ^ Q.hashCode();
    }

    @Override // com.oplus.aiunit.vision.h86
    public boolean i() {
        return afc.t(this.a);
    }

    @Override // com.oplus.aiunit.vision.h86
    public h86 j(h86 h86Var) {
        int[] iArrF = afc.f();
        bf4.e(this.a, ((cf4) h86Var).a, iArrF);
        return new cf4(iArrF);
    }

    @Override // com.oplus.aiunit.vision.h86
    public h86 m() {
        int[] iArrF = afc.f();
        bf4.g(this.a, iArrF);
        return new cf4(iArrF);
    }

    @Override // com.oplus.aiunit.vision.h86
    public h86 n() {
        int[] iArr = this.a;
        if (afc.t(iArr) || afc.r(iArr)) {
            return this;
        }
        int[] iArrF = afc.f();
        bf4.j(iArr, iArrF);
        bf4.e(iArrF, iArr, iArrF);
        bf4.j(iArrF, iArrF);
        bf4.e(iArrF, iArr, iArrF);
        int[] iArrF2 = afc.f();
        bf4.j(iArrF, iArrF2);
        bf4.e(iArrF2, iArr, iArrF2);
        int[] iArrF3 = afc.f();
        bf4.k(iArrF2, 3, iArrF3);
        bf4.e(iArrF3, iArrF, iArrF3);
        bf4.k(iArrF3, 4, iArrF);
        bf4.e(iArrF, iArrF2, iArrF);
        bf4.k(iArrF, 4, iArrF3);
        bf4.e(iArrF3, iArrF2, iArrF3);
        bf4.k(iArrF3, 15, iArrF2);
        bf4.e(iArrF2, iArrF3, iArrF2);
        bf4.k(iArrF2, 30, iArrF3);
        bf4.e(iArrF3, iArrF2, iArrF3);
        bf4.k(iArrF3, 60, iArrF2);
        bf4.e(iArrF2, iArrF3, iArrF2);
        bf4.k(iArrF2, 11, iArrF3);
        bf4.e(iArrF3, iArrF, iArrF3);
        bf4.k(iArrF3, 120, iArrF);
        bf4.e(iArrF, iArrF2, iArrF);
        bf4.j(iArrF, iArrF);
        bf4.j(iArrF, iArrF2);
        if (afc.k(iArr, iArrF2)) {
            return new cf4(iArrF);
        }
        bf4.e(iArrF, b, iArrF);
        bf4.j(iArrF, iArrF2);
        if (afc.k(iArr, iArrF2)) {
            return new cf4(iArrF);
        }
        return null;
    }

    @Override // com.oplus.aiunit.vision.h86
    public h86 o() {
        int[] iArrF = afc.f();
        bf4.j(this.a, iArrF);
        return new cf4(iArrF);
    }

    @Override // com.oplus.aiunit.vision.h86
    public h86 r(h86 h86Var) {
        int[] iArrF = afc.f();
        bf4.n(this.a, ((cf4) h86Var).a, iArrF);
        return new cf4(iArrF);
    }

    @Override // com.oplus.aiunit.vision.h86
    public boolean s() {
        return afc.o(this.a, 0) == 1;
    }

    @Override // com.oplus.aiunit.vision.h86
    public BigInteger t() {
        return afc.H(this.a);
    }

    public cf4() {
        this.a = afc.f();
    }

    public cf4(int[] iArr) {
        this.a = iArr;
    }
}
