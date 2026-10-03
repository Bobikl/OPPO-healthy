package com.oplus.aiunit.vision;

import java.io.IOException;

/* JADX INFO: loaded from: classes11.dex */
public class h1 extends r1 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static h1[] f11957j = new h1[12];
    public final byte[] i;

    public h1(byte[] bArr) {
        if (!wye.c("org.spongycastle.asn1.allow_unsafe_integer") && k1.p(bArr)) {
            throw new IllegalArgumentException("malformed enumerated");
        }
        this.i = eh0.e(bArr);
    }

    public static h1 m(byte[] bArr) {
        if (bArr.length > 1) {
            return new h1(bArr);
        }
        if (bArr.length == 0) {
            throw new IllegalArgumentException("ENUMERATED has zero length");
        }
        int i = bArr[0] & 255;
        h1[] h1VarArr = f11957j;
        if (i >= h1VarArr.length) {
            return new h1(eh0.e(bArr));
        }
        h1 h1Var = h1VarArr[i];
        if (h1Var != null) {
            return h1Var;
        }
        h1 h1Var2 = new h1(eh0.e(bArr));
        h1VarArr[i] = h1Var2;
        return h1Var2;
    }

    @Override // com.oplus.aiunit.vision.r1
    public boolean f(r1 r1Var) {
        if (r1Var instanceof h1) {
            return eh0.a(this.i, ((h1) r1Var).i);
        }
        return false;
    }

    @Override // com.oplus.aiunit.vision.r1
    public void g(q1 q1Var) throws IOException {
        q1Var.g(10, this.i);
    }

    @Override // com.oplus.aiunit.vision.r1
    public int h() {
        return lwi.a(this.i.length) + 1 + this.i.length;
    }

    @Override // com.oplus.aiunit.vision.r1, com.oplus.aiunit.vision.m1
    public int hashCode() {
        return eh0.p(this.i);
    }

    @Override // com.oplus.aiunit.vision.r1
    public boolean j() {
        return false;
    }
}
