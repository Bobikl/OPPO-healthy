package com.oplus.aiunit.vision;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes11.dex */
public class s18 implements q18 {
    public final a86 a;
    public final t18 b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final sb6 f16439c;

    public s18(a86 a86Var, t18 t18Var) {
        this.a = a86Var;
        this.b = t18Var;
        this.f16439c = new beg(a86Var.m(t18Var.b()));
    }

    @Override // com.oplus.aiunit.vision.q18
    public BigInteger[] a(BigInteger bigInteger) {
        int iC = this.b.c();
        BigInteger bigIntegerD = d(bigInteger, this.b.d(), iC);
        BigInteger bigIntegerD2 = d(bigInteger, this.b.e(), iC);
        t18 t18Var = this.b;
        return new BigInteger[]{bigInteger.subtract(bigIntegerD.multiply(t18Var.f()).add(bigIntegerD2.multiply(t18Var.h()))), bigIntegerD.multiply(t18Var.g()).add(bigIntegerD2.multiply(t18Var.i())).negate()};
    }

    @Override // com.oplus.aiunit.vision.g86
    public boolean b() {
        return true;
    }

    @Override // com.oplus.aiunit.vision.g86
    public sb6 c() {
        return this.f16439c;
    }

    public BigInteger d(BigInteger bigInteger, BigInteger bigInteger2, int i) {
        boolean z = bigInteger2.signum() < 0;
        BigInteger bigIntegerMultiply = bigInteger.multiply(bigInteger2.abs());
        boolean zTestBit = bigIntegerMultiply.testBit(i - 1);
        BigInteger bigIntegerShiftRight = bigIntegerMultiply.shiftRight(i);
        if (zTestBit) {
            bigIntegerShiftRight = bigIntegerShiftRight.add(z76.ONE);
        }
        return z ? bigIntegerShiftRight.negate() : bigIntegerShiftRight;
    }
}
