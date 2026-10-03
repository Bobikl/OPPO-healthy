package com.oplus.aiunit.vision;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes11.dex */
public class xmg extends h86 {
    public static final BigInteger Q = vmg.q;
    public int[] a;

    public xmg(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(Q) >= 0) {
            throw new IllegalArgumentException("x value invalid for SecP521R1FieldElement");
        }
        this.a = wmg.c(bigInteger);
    }

    @Override // com.oplus.aiunit.vision.h86
    public h86 a(h86 h86Var) {
        int[] iArrI = gfc.i(17);
        wmg.a(this.a, ((xmg) h86Var).a, iArrI);
        return new xmg(iArrI);
    }

    @Override // com.oplus.aiunit.vision.h86
    public h86 b() {
        int[] iArrI = gfc.i(17);
        wmg.b(this.a, iArrI);
        return new xmg(iArrI);
    }

    @Override // com.oplus.aiunit.vision.h86
    public h86 d(h86 h86Var) {
        int[] iArrI = gfc.i(17);
        c2c.d(wmg.a, ((xmg) h86Var).a, iArrI);
        wmg.f(iArrI, this.a, iArrI);
        return new xmg(iArrI);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof xmg) {
            return gfc.m(17, this.a, ((xmg) obj).a);
        }
        return false;
    }

    @Override // com.oplus.aiunit.vision.h86
    public int f() {
        return Q.bitLength();
    }

    @Override // com.oplus.aiunit.vision.h86
    public h86 g() {
        int[] iArrI = gfc.i(17);
        c2c.d(wmg.a, this.a, iArrI);
        return new xmg(iArrI);
    }

    @Override // com.oplus.aiunit.vision.h86
    public boolean h() {
        return gfc.u(17, this.a);
    }

    public int hashCode() {
        return eh0.s(this.a, 0, 17) ^ Q.hashCode();
    }

    @Override // com.oplus.aiunit.vision.h86
    public boolean i() {
        return gfc.v(17, this.a);
    }

    @Override // com.oplus.aiunit.vision.h86
    public h86 j(h86 h86Var) {
        int[] iArrI = gfc.i(17);
        wmg.f(this.a, ((xmg) h86Var).a, iArrI);
        return new xmg(iArrI);
    }

    @Override // com.oplus.aiunit.vision.h86
    public h86 m() {
        int[] iArrI = gfc.i(17);
        wmg.g(this.a, iArrI);
        return new xmg(iArrI);
    }

    @Override // com.oplus.aiunit.vision.h86
    public h86 n() {
        int[] iArr = this.a;
        if (gfc.v(17, iArr) || gfc.u(17, iArr)) {
            return this;
        }
        int[] iArrI = gfc.i(17);
        int[] iArrI2 = gfc.i(17);
        wmg.k(iArr, k18.GL_ALWAYS, iArrI);
        wmg.j(iArrI, iArrI2);
        if (gfc.m(17, iArr, iArrI2)) {
            return new xmg(iArrI);
        }
        return null;
    }

    @Override // com.oplus.aiunit.vision.h86
    public h86 o() {
        int[] iArrI = gfc.i(17);
        wmg.j(this.a, iArrI);
        return new xmg(iArrI);
    }

    @Override // com.oplus.aiunit.vision.h86
    public h86 r(h86 h86Var) {
        int[] iArrI = gfc.i(17);
        wmg.l(this.a, ((xmg) h86Var).a, iArrI);
        return new xmg(iArrI);
    }

    @Override // com.oplus.aiunit.vision.h86
    public boolean s() {
        return gfc.o(this.a, 0) == 1;
    }

    @Override // com.oplus.aiunit.vision.h86
    public BigInteger t() {
        return gfc.O(17, this.a);
    }

    public xmg() {
        this.a = gfc.i(17);
    }

    public xmg(int[] iArr) {
        this.a = iArr;
    }
}
