package com.oplus.aiunit.vision;

import java.math.BigInteger;
import java.security.spec.AlgorithmParameterSpec;

/* JADX INFO: loaded from: classes11.dex */
public class qb6 implements AlgorithmParameterSpec {
    public a86 a;
    public byte[] b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public rb6 f15726c;
    public BigInteger d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public BigInteger f15727e;

    public qb6(a86 a86Var, rb6 rb6Var, BigInteger bigInteger) {
        this.a = a86Var;
        this.f15726c = rb6Var.y();
        this.d = bigInteger;
        this.f15727e = BigInteger.valueOf(1L);
        this.b = null;
    }

    public a86 a() {
        return this.a;
    }

    public rb6 b() {
        return this.f15726c;
    }

    public BigInteger c() {
        return this.f15727e;
    }

    public BigInteger d() {
        return this.d;
    }

    public byte[] e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof qb6)) {
            return false;
        }
        qb6 qb6Var = (qb6) obj;
        return a().l(qb6Var.a()) && b().e(qb6Var.b());
    }

    public int hashCode() {
        return b().hashCode() ^ a().hashCode();
    }

    public qb6(a86 a86Var, rb6 rb6Var, BigInteger bigInteger, BigInteger bigInteger2, byte[] bArr) {
        this.a = a86Var;
        this.f15726c = rb6Var.y();
        this.d = bigInteger;
        this.f15727e = bigInteger2;
        this.b = bArr;
    }
}
