package com.oplus.aiunit.vision;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes11.dex */
public class dmg extends h86 {
    public static final BigInteger Q = bmg.q;
    public static final int[] b = {868209154, -587542221, 579297866, -1014948952, -1470801668, 514782679, -1897982644};
    public int[] a;

    public dmg(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(Q) >= 0) {
            throw new IllegalArgumentException("x value invalid for SecP224K1FieldElement");
        }
        this.a = cmg.c(bigInteger);
    }

    @Override // com.oplus.aiunit.vision.h86
    public h86 a(h86 h86Var) {
        int[] iArrD = zec.d();
        cmg.a(this.a, ((dmg) h86Var).a, iArrD);
        return new dmg(iArrD);
    }

    @Override // com.oplus.aiunit.vision.h86
    public h86 b() {
        int[] iArrD = zec.d();
        cmg.b(this.a, iArrD);
        return new dmg(iArrD);
    }

    @Override // com.oplus.aiunit.vision.h86
    public h86 d(h86 h86Var) {
        int[] iArrD = zec.d();
        c2c.d(cmg.a, ((dmg) h86Var).a, iArrD);
        cmg.d(iArrD, this.a, iArrD);
        return new dmg(iArrD);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dmg) {
            return zec.f(this.a, ((dmg) obj).a);
        }
        return false;
    }

    @Override // com.oplus.aiunit.vision.h86
    public int f() {
        return Q.bitLength();
    }

    @Override // com.oplus.aiunit.vision.h86
    public h86 g() {
        int[] iArrD = zec.d();
        c2c.d(cmg.a, this.a, iArrD);
        return new dmg(iArrD);
    }

    @Override // com.oplus.aiunit.vision.h86
    public boolean h() {
        return zec.j(this.a);
    }

    public int hashCode() {
        return eh0.s(this.a, 0, 7) ^ Q.hashCode();
    }

    @Override // com.oplus.aiunit.vision.h86
    public boolean i() {
        return zec.k(this.a);
    }

    @Override // com.oplus.aiunit.vision.h86
    public h86 j(h86 h86Var) {
        int[] iArrD = zec.d();
        cmg.d(this.a, ((dmg) h86Var).a, iArrD);
        return new dmg(iArrD);
    }

    @Override // com.oplus.aiunit.vision.h86
    public h86 m() {
        int[] iArrD = zec.d();
        cmg.f(this.a, iArrD);
        return new dmg(iArrD);
    }

    @Override // com.oplus.aiunit.vision.h86
    public h86 n() {
        int[] iArr = this.a;
        if (zec.k(iArr) || zec.j(iArr)) {
            return this;
        }
        int[] iArrD = zec.d();
        cmg.i(iArr, iArrD);
        cmg.d(iArrD, iArr, iArrD);
        cmg.i(iArrD, iArrD);
        cmg.d(iArrD, iArr, iArrD);
        int[] iArrD2 = zec.d();
        cmg.i(iArrD, iArrD2);
        cmg.d(iArrD2, iArr, iArrD2);
        int[] iArrD3 = zec.d();
        cmg.j(iArrD2, 4, iArrD3);
        cmg.d(iArrD3, iArrD2, iArrD3);
        int[] iArrD4 = zec.d();
        cmg.j(iArrD3, 3, iArrD4);
        cmg.d(iArrD4, iArrD, iArrD4);
        cmg.j(iArrD4, 8, iArrD4);
        cmg.d(iArrD4, iArrD3, iArrD4);
        cmg.j(iArrD4, 4, iArrD3);
        cmg.d(iArrD3, iArrD2, iArrD3);
        cmg.j(iArrD3, 19, iArrD2);
        cmg.d(iArrD2, iArrD4, iArrD2);
        int[] iArrD5 = zec.d();
        cmg.j(iArrD2, 42, iArrD5);
        cmg.d(iArrD5, iArrD2, iArrD5);
        cmg.j(iArrD5, 23, iArrD2);
        cmg.d(iArrD2, iArrD3, iArrD2);
        cmg.j(iArrD2, 84, iArrD3);
        cmg.d(iArrD3, iArrD5, iArrD3);
        cmg.j(iArrD3, 20, iArrD3);
        cmg.d(iArrD3, iArrD4, iArrD3);
        cmg.j(iArrD3, 3, iArrD3);
        cmg.d(iArrD3, iArr, iArrD3);
        cmg.j(iArrD3, 2, iArrD3);
        cmg.d(iArrD3, iArr, iArrD3);
        cmg.j(iArrD3, 4, iArrD3);
        cmg.d(iArrD3, iArrD, iArrD3);
        cmg.i(iArrD3, iArrD3);
        cmg.i(iArrD3, iArrD5);
        if (zec.f(iArr, iArrD5)) {
            return new dmg(iArrD3);
        }
        cmg.d(iArrD3, b, iArrD3);
        cmg.i(iArrD3, iArrD5);
        if (zec.f(iArr, iArrD5)) {
            return new dmg(iArrD3);
        }
        return null;
    }

    @Override // com.oplus.aiunit.vision.h86
    public h86 o() {
        int[] iArrD = zec.d();
        cmg.i(this.a, iArrD);
        return new dmg(iArrD);
    }

    @Override // com.oplus.aiunit.vision.h86
    public h86 r(h86 h86Var) {
        int[] iArrD = zec.d();
        cmg.k(this.a, ((dmg) h86Var).a, iArrD);
        return new dmg(iArrD);
    }

    @Override // com.oplus.aiunit.vision.h86
    public boolean s() {
        return zec.h(this.a, 0) == 1;
    }

    @Override // com.oplus.aiunit.vision.h86
    public BigInteger t() {
        return zec.t(this.a);
    }

    public dmg() {
        this.a = zec.d();
    }

    public dmg(int[] iArr) {
        this.a = iArr;
    }
}
