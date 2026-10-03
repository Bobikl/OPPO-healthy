package com.oplus.aiunit.vision;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes11.dex */
public class to4 implements eb3 {
    public BigInteger i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public BigInteger f17089j;
    public BigInteger k;

    public to4(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        this.i = bigInteger3;
        this.k = bigInteger;
        this.f17089j = bigInteger2;
    }

    public BigInteger a() {
        return this.i;
    }

    public BigInteger b() {
        return this.k;
    }

    public BigInteger c() {
        return this.f17089j;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof to4)) {
            return false;
        }
        to4 to4Var = (to4) obj;
        return to4Var.b().equals(this.k) && to4Var.c().equals(this.f17089j) && to4Var.a().equals(this.i);
    }

    public int hashCode() {
        return a().hashCode() ^ (b().hashCode() ^ c().hashCode());
    }
}
