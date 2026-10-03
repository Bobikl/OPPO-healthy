package com.oplus.aiunit.vision;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes11.dex */
public class i28 {
    public BigInteger a;
    public BigInteger b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public BigInteger f12353c;

    public i28(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        this.a = bigInteger;
        this.b = bigInteger2;
        this.f12353c = bigInteger3;
    }

    public BigInteger a() {
        return this.f12353c;
    }

    public BigInteger b() {
        return this.a;
    }

    public BigInteger c() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof i28)) {
            return false;
        }
        i28 i28Var = (i28) obj;
        return this.f12353c.equals(i28Var.f12353c) && this.a.equals(i28Var.a) && this.b.equals(i28Var.b);
    }

    public int hashCode() {
        return this.b.hashCode() ^ (this.f12353c.hashCode() ^ this.a.hashCode());
    }
}
