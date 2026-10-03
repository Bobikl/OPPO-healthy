package com.oplus.aiunit.vision;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes11.dex */
public class lk4 implements eb3 {
    public BigInteger i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public BigInteger f13738j;
    public BigInteger k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public BigInteger f13739l;
    public int m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f13740n;
    public ok4 o;

    public lk4(BigInteger bigInteger, BigInteger bigInteger2) {
        this(bigInteger, bigInteger2, null, 0);
    }

    public static int a(int i) {
        if (i != 0 && i < 160) {
            return i;
        }
        return 160;
    }

    public BigInteger b() {
        return this.i;
    }

    public int c() {
        return this.f13740n;
    }

    public BigInteger d() {
        return this.f13738j;
    }

    public BigInteger e() {
        return this.k;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof lk4)) {
            return false;
        }
        lk4 lk4Var = (lk4) obj;
        if (e() != null) {
            if (!e().equals(lk4Var.e())) {
                return false;
            }
        } else if (lk4Var.e() != null) {
            return false;
        }
        return lk4Var.d().equals(this.f13738j) && lk4Var.b().equals(this.i);
    }

    public int hashCode() {
        return (e() != null ? e().hashCode() : 0) ^ (d().hashCode() ^ b().hashCode());
    }

    public lk4(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, int i) {
        this(bigInteger, bigInteger2, bigInteger3, a(i), i, null, null);
    }

    public lk4(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4, ok4 ok4Var) {
        this(bigInteger, bigInteger2, bigInteger3, 160, 0, bigInteger4, ok4Var);
    }

    public lk4(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, int i, int i2, BigInteger bigInteger4, ok4 ok4Var) {
        if (i2 != 0) {
            if (i2 > bigInteger.bitLength()) {
                throw new IllegalArgumentException("when l value specified, it must satisfy 2^(l-1) <= p");
            }
            if (i2 < i) {
                throw new IllegalArgumentException("when l value specified, it may not be less than m value");
            }
        }
        this.i = bigInteger2;
        this.f13738j = bigInteger;
        this.k = bigInteger3;
        this.m = i;
        this.f13740n = i2;
        this.f13739l = bigInteger4;
        this.o = ok4Var;
    }
}
