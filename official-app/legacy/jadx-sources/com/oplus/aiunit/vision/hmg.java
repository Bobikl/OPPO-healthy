package com.oplus.aiunit.vision;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes11.dex */
public class hmg extends h86 {
    public static final BigInteger Q = fmg.q;
    public int[] a;

    public hmg(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(Q) >= 0) {
            throw new IllegalArgumentException("x value invalid for SecP224R1FieldElement");
        }
        this.a = gmg.d(bigInteger);
    }

    public static void u(int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4, int[] iArr5, int[] iArr6, int[] iArr7) {
        gmg.e(iArr5, iArr3, iArr7);
        gmg.e(iArr7, iArr, iArr7);
        gmg.e(iArr4, iArr2, iArr6);
        gmg.a(iArr6, iArr7, iArr6);
        gmg.e(iArr4, iArr3, iArr7);
        zec.c(iArr6, iArr4);
        gmg.e(iArr5, iArr2, iArr5);
        gmg.a(iArr5, iArr7, iArr5);
        gmg.j(iArr5, iArr6);
        gmg.e(iArr6, iArr, iArr6);
    }

    public static void v(int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4, int[] iArr5) {
        zec.c(iArr, iArr4);
        int[] iArrD = zec.d();
        int[] iArrD2 = zec.d();
        for (int i = 0; i < 7; i++) {
            zec.c(iArr2, iArrD);
            zec.c(iArr3, iArrD2);
            int i2 = 1 << i;
            while (true) {
                i2--;
                if (i2 >= 0) {
                    w(iArr2, iArr3, iArr4, iArr5);
                }
            }
            u(iArr, iArrD, iArrD2, iArr2, iArr3, iArr4, iArr5);
        }
    }

    public static void w(int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4) {
        gmg.e(iArr2, iArr, iArr2);
        gmg.n(iArr2, iArr2);
        gmg.j(iArr, iArr4);
        gmg.a(iArr3, iArr4, iArr);
        gmg.e(iArr3, iArr4, iArr3);
        gmg.i(gfc.F(7, iArr3, 2, 0), iArr3);
    }

    public static boolean x(int[] iArr) {
        int[] iArrD = zec.d();
        int[] iArrD2 = zec.d();
        zec.c(iArr, iArrD);
        for (int i = 0; i < 7; i++) {
            zec.c(iArrD, iArrD2);
            gmg.k(iArrD, 1 << i, iArrD);
            gmg.e(iArrD, iArrD2, iArrD);
        }
        gmg.k(iArrD, 95, iArrD);
        return zec.j(iArrD);
    }

    public static boolean y(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] iArrD = zec.d();
        zec.c(iArr2, iArrD);
        int[] iArrD2 = zec.d();
        iArrD2[0] = 1;
        int[] iArrD3 = zec.d();
        v(iArr, iArrD, iArrD2, iArrD3, iArr3);
        int[] iArrD4 = zec.d();
        int[] iArrD5 = zec.d();
        for (int i = 1; i < 96; i++) {
            zec.c(iArrD, iArrD4);
            zec.c(iArrD2, iArrD5);
            w(iArrD, iArrD2, iArrD3, iArr3);
            if (zec.k(iArrD)) {
                c2c.d(gmg.a, iArrD5, iArr3);
                gmg.e(iArr3, iArrD4, iArr3);
                return true;
            }
        }
        return false;
    }

    @Override // com.oplus.aiunit.vision.h86
    public h86 a(h86 h86Var) {
        int[] iArrD = zec.d();
        gmg.a(this.a, ((hmg) h86Var).a, iArrD);
        return new hmg(iArrD);
    }

    @Override // com.oplus.aiunit.vision.h86
    public h86 b() {
        int[] iArrD = zec.d();
        gmg.b(this.a, iArrD);
        return new hmg(iArrD);
    }

    @Override // com.oplus.aiunit.vision.h86
    public h86 d(h86 h86Var) {
        int[] iArrD = zec.d();
        c2c.d(gmg.a, ((hmg) h86Var).a, iArrD);
        gmg.e(iArrD, this.a, iArrD);
        return new hmg(iArrD);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof hmg) {
            return zec.f(this.a, ((hmg) obj).a);
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
        c2c.d(gmg.a, this.a, iArrD);
        return new hmg(iArrD);
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
        gmg.e(this.a, ((hmg) h86Var).a, iArrD);
        return new hmg(iArrD);
    }

    @Override // com.oplus.aiunit.vision.h86
    public h86 m() {
        int[] iArrD = zec.d();
        gmg.g(this.a, iArrD);
        return new hmg(iArrD);
    }

    @Override // com.oplus.aiunit.vision.h86
    public h86 n() {
        int[] iArr = this.a;
        if (zec.k(iArr) || zec.j(iArr)) {
            return this;
        }
        int[] iArrD = zec.d();
        gmg.g(iArr, iArrD);
        int[] iArrE = c2c.e(gmg.a);
        int[] iArrD2 = zec.d();
        if (!x(iArr)) {
            return null;
        }
        while (!y(iArrD, iArrE, iArrD2)) {
            gmg.b(iArrE, iArrE);
        }
        gmg.j(iArrD2, iArrE);
        if (zec.f(iArr, iArrE)) {
            return new hmg(iArrD2);
        }
        return null;
    }

    @Override // com.oplus.aiunit.vision.h86
    public h86 o() {
        int[] iArrD = zec.d();
        gmg.j(this.a, iArrD);
        return new hmg(iArrD);
    }

    @Override // com.oplus.aiunit.vision.h86
    public h86 r(h86 h86Var) {
        int[] iArrD = zec.d();
        gmg.m(this.a, ((hmg) h86Var).a, iArrD);
        return new hmg(iArrD);
    }

    @Override // com.oplus.aiunit.vision.h86
    public boolean s() {
        return zec.h(this.a, 0) == 1;
    }

    @Override // com.oplus.aiunit.vision.h86
    public BigInteger t() {
        return zec.t(this.a);
    }

    public hmg() {
        this.a = zec.d();
    }

    public hmg(int[] iArr) {
        this.a = iArr;
    }
}
