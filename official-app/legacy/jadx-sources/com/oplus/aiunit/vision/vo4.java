package com.oplus.aiunit.vision;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes11.dex */
public class vo4 extends ro4 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final BigInteger f17940l = BigInteger.valueOf(1);
    public static final BigInteger m = BigInteger.valueOf(2);
    public BigInteger k;

    public vo4(BigInteger bigInteger, to4 to4Var) {
        super(false, to4Var);
        this.k = d(bigInteger, to4Var);
    }

    public BigInteger c() {
        return this.k;
    }

    public final BigInteger d(BigInteger bigInteger, to4 to4Var) {
        if (to4Var == null) {
            return bigInteger;
        }
        BigInteger bigInteger2 = m;
        if (bigInteger2.compareTo(bigInteger) > 0 || to4Var.b().subtract(bigInteger2).compareTo(bigInteger) < 0 || !f17940l.equals(bigInteger.modPow(to4Var.c(), to4Var.b()))) {
            throw new IllegalArgumentException("y value does not appear to be in correct group");
        }
        return bigInteger;
    }
}
