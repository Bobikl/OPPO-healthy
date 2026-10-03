package com.oplus.aiunit.vision;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes11.dex */
public class r18 extends e6 {
    public final a86 a;
    public final q18 b;

    public r18(a86 a86Var, q18 q18Var) {
        if (a86Var == null || a86Var.v() == null) {
            throw new IllegalArgumentException("Need curve with known group order");
        }
        this.a = a86Var;
        this.b = q18Var;
    }

    @Override // com.oplus.aiunit.vision.e6
    public rb6 b(rb6 rb6Var, BigInteger bigInteger) {
        if (!this.a.l(rb6Var.i())) {
            throw new IllegalStateException();
        }
        BigInteger[] bigIntegerArrA = this.b.a(bigInteger.mod(rb6Var.i().v()));
        BigInteger bigInteger2 = bigIntegerArrA[0];
        BigInteger bigInteger3 = bigIntegerArrA[1];
        sb6 sb6VarC = this.b.c();
        return this.b.b() ? y76.b(rb6Var, bigInteger2, sb6VarC, bigInteger3) : y76.a(rb6Var, bigInteger2, sb6VarC.a(rb6Var), bigInteger3);
    }
}
