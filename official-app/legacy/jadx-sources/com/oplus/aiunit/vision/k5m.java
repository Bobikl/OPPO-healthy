package com.oplus.aiunit.vision;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes11.dex */
public class k5m extends m1 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static m5m f13163j = new m5m();
    public h86 i;

    public k5m(h86 h86Var) {
        this.i = h86Var;
    }

    @Override // com.oplus.aiunit.vision.m1, com.oplus.aiunit.vision.f1
    public r1 c() {
        return new tj4(f13163j.c(this.i.t(), f13163j.b(this.i)));
    }

    public h86 f() {
        return this.i;
    }

    public k5m(BigInteger bigInteger, o1 o1Var) {
        this(new h86.b(bigInteger, new BigInteger(1, o1Var.o())));
    }

    public k5m(int i, int i2, int i3, int i4, o1 o1Var) {
        this(new h86.a(i, i2, i3, i4, new BigInteger(1, o1Var.o())));
    }
}
