package com.oplus.aiunit.vision;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes11.dex */
public class nk4 extends jk4 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final BigInteger f14541l = BigInteger.valueOf(1);
    public static final BigInteger m = BigInteger.valueOf(2);
    public BigInteger k;

    public nk4(BigInteger bigInteger, lk4 lk4Var) {
        super(false, lk4Var);
        this.k = d(bigInteger, lk4Var);
    }

    public BigInteger c() {
        return this.k;
    }

    public final BigInteger d(BigInteger bigInteger, lk4 lk4Var) {
        if (bigInteger == null) {
            throw new NullPointerException("y value cannot be null");
        }
        BigInteger bigInteger2 = m;
        if (bigInteger.compareTo(bigInteger2) < 0 || bigInteger.compareTo(lk4Var.d().subtract(bigInteger2)) > 0) {
            throw new IllegalArgumentException("invalid DH public key");
        }
        if (lk4Var.e() == null || f14541l.equals(bigInteger.modPow(lk4Var.e(), lk4Var.d()))) {
            return bigInteger;
        }
        throw new IllegalArgumentException("Y value does not appear to be in correct group");
    }

    @Override // com.oplus.aiunit.vision.jk4
    public boolean equals(Object obj) {
        return (obj instanceof nk4) && ((nk4) obj).c().equals(this.k) && super.equals(obj);
    }

    @Override // com.oplus.aiunit.vision.jk4
    public int hashCode() {
        return super.hashCode() ^ this.k.hashCode();
    }
}
