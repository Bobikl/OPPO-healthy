package com.oplus.aiunit.vision;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes11.dex */
public class v6m extends m1 {
    public final byte[] i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final byte[] f17738j;

    public v6m(byte[] bArr, byte[] bArr2) {
        this.i = eh0.e(bArr);
        this.f17738j = eh0.e(bArr2);
    }

    public static v6m f(Object obj) {
        if (obj instanceof v6m) {
            return (v6m) obj;
        }
        if (obj != null) {
            return new v6m(s1.n(obj));
        }
        return null;
    }

    @Override // com.oplus.aiunit.vision.m1, com.oplus.aiunit.vision.f1
    public r1 c() {
        g1 g1Var = new g1();
        g1Var.a(new k1(0L));
        g1Var.a(new tj4(this.i));
        g1Var.a(new tj4(this.f17738j));
        return new xj4(g1Var);
    }

    public byte[] g() {
        return eh0.e(this.i);
    }

    public byte[] h() {
        return eh0.e(this.f17738j);
    }

    public v6m(s1 s1Var) {
        if (k1.m(s1Var.p(0)).o().equals(BigInteger.valueOf(0L))) {
            this.i = eh0.e(o1.n(s1Var.p(1)).o());
            this.f17738j = eh0.e(o1.n(s1Var.p(2)).o());
            return;
        }
        throw new IllegalArgumentException("unknown version of sequence");
    }
}
