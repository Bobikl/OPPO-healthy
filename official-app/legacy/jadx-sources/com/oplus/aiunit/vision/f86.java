package com.oplus.aiunit.vision;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes11.dex */
public class f86 implements z76 {
    public a86 a;
    public byte[] b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public rb6 f11259c;
    public BigInteger d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public BigInteger f11260e;

    public f86(a86 a86Var, rb6 rb6Var, BigInteger bigInteger) {
        this(a86Var, rb6Var, bigInteger, z76.ONE, null);
    }

    public a86 a() {
        return this.a;
    }

    public rb6 b() {
        return this.f11259c;
    }

    public BigInteger c() {
        return this.f11260e;
    }

    public BigInteger d() {
        return this.d;
    }

    public byte[] e() {
        return eh0.e(this.b);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f86)) {
            return false;
        }
        f86 f86Var = (f86) obj;
        return this.a.l(f86Var.a) && this.f11259c.e(f86Var.f11259c) && this.d.equals(f86Var.d) && this.f11260e.equals(f86Var.f11260e);
    }

    public int hashCode() {
        return this.f11260e.hashCode() ^ (((((this.a.hashCode() * 37) ^ this.f11259c.hashCode()) * 37) ^ this.d.hashCode()) * 37);
    }

    public f86(a86 a86Var, rb6 rb6Var, BigInteger bigInteger, BigInteger bigInteger2) {
        this(a86Var, rb6Var, bigInteger, bigInteger2, null);
    }

    public f86(a86 a86Var, rb6 rb6Var, BigInteger bigInteger, BigInteger bigInteger2, byte[] bArr) {
        this.a = a86Var;
        this.f11259c = rb6Var.y();
        this.d = bigInteger;
        this.f11260e = bigInteger2;
        this.b = bArr;
    }
}
