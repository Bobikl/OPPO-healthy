package com.oplus.aiunit.vision;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes11.dex */
public abstract class e6 implements lb6 {
    @Override // com.oplus.aiunit.vision.lb6
    public rb6 a(rb6 rb6Var, BigInteger bigInteger) {
        int iSignum = bigInteger.signum();
        if (iSignum == 0 || rb6Var.t()) {
            return rb6Var.i().t();
        }
        rb6 rb6VarB = b(rb6Var, bigInteger.abs());
        if (iSignum <= 0) {
            rb6VarB = rb6VarB.x();
        }
        return y76.j(rb6VarB);
    }

    public abstract rb6 b(rb6 rb6Var, BigInteger bigInteger);
}
