package com.oplus.aiunit.vision;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes11.dex */
public class hlg extends h86 {
    public static final BigInteger Q = flg.q;
    public int[] a;

    public hlg(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(Q) >= 0) {
            throw new IllegalArgumentException("x value invalid for SecP128R1FieldElement");
        }
        this.a = glg.d(bigInteger);
    }

    @Override // com.oplus.aiunit.vision.h86
    public h86 a(h86 h86Var) {
        int[] iArrC = wec.c();
        glg.a(this.a, ((hlg) h86Var).a, iArrC);
        return new hlg(iArrC);
    }

    @Override // com.oplus.aiunit.vision.h86
    public h86 b() {
        int[] iArrC = wec.c();
        glg.b(this.a, iArrC);
        return new hlg(iArrC);
    }

    @Override // com.oplus.aiunit.vision.h86
    public h86 d(h86 h86Var) {
        int[] iArrC = wec.c();
        c2c.d(glg.a, ((hlg) h86Var).a, iArrC);
        glg.e(iArrC, this.a, iArrC);
        return new hlg(iArrC);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof hlg) {
            return wec.g(this.a, ((hlg) obj).a);
        }
        return false;
    }

    @Override // com.oplus.aiunit.vision.h86
    public int f() {
        return Q.bitLength();
    }

    @Override // com.oplus.aiunit.vision.h86
    public h86 g() {
        int[] iArrC = wec.c();
        c2c.d(glg.a, this.a, iArrC);
        return new hlg(iArrC);
    }

    @Override // com.oplus.aiunit.vision.h86
    public boolean h() {
        return wec.m(this.a);
    }

    public int hashCode() {
        return eh0.s(this.a, 0, 4) ^ Q.hashCode();
    }

    @Override // com.oplus.aiunit.vision.h86
    public boolean i() {
        return wec.o(this.a);
    }

    @Override // com.oplus.aiunit.vision.h86
    public h86 j(h86 h86Var) {
        int[] iArrC = wec.c();
        glg.e(this.a, ((hlg) h86Var).a, iArrC);
        return new hlg(iArrC);
    }

    @Override // com.oplus.aiunit.vision.h86
    public h86 m() {
        int[] iArrC = wec.c();
        glg.g(this.a, iArrC);
        return new hlg(iArrC);
    }

    @Override // com.oplus.aiunit.vision.h86
    public h86 n() {
        int[] iArr = this.a;
        if (wec.o(iArr) || wec.m(iArr)) {
            return this;
        }
        int[] iArrC = wec.c();
        glg.j(iArr, iArrC);
        glg.e(iArrC, iArr, iArrC);
        int[] iArrC2 = wec.c();
        glg.k(iArrC, 2, iArrC2);
        glg.e(iArrC2, iArrC, iArrC2);
        int[] iArrC3 = wec.c();
        glg.k(iArrC2, 4, iArrC3);
        glg.e(iArrC3, iArrC2, iArrC3);
        glg.k(iArrC3, 2, iArrC2);
        glg.e(iArrC2, iArrC, iArrC2);
        glg.k(iArrC2, 10, iArrC);
        glg.e(iArrC, iArrC2, iArrC);
        glg.k(iArrC, 10, iArrC3);
        glg.e(iArrC3, iArrC2, iArrC3);
        glg.j(iArrC3, iArrC2);
        glg.e(iArrC2, iArr, iArrC2);
        glg.k(iArrC2, 95, iArrC2);
        glg.j(iArrC2, iArrC3);
        if (wec.g(iArr, iArrC3)) {
            return new hlg(iArrC2);
        }
        return null;
    }

    @Override // com.oplus.aiunit.vision.h86
    public h86 o() {
        int[] iArrC = wec.c();
        glg.j(this.a, iArrC);
        return new hlg(iArrC);
    }

    @Override // com.oplus.aiunit.vision.h86
    public h86 r(h86 h86Var) {
        int[] iArrC = wec.c();
        glg.m(this.a, ((hlg) h86Var).a, iArrC);
        return new hlg(iArrC);
    }

    @Override // com.oplus.aiunit.vision.h86
    public boolean s() {
        return wec.k(this.a, 0) == 1;
    }

    @Override // com.oplus.aiunit.vision.h86
    public BigInteger t() {
        return wec.v(this.a);
    }

    public hlg() {
        this.a = wec.c();
    }

    public hlg(int[] iArr) {
        this.a = iArr;
    }
}
