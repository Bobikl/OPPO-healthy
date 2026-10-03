package com.oplus.aiunit.vision;

import java.io.IOException;

/* JADX INFO: loaded from: classes11.dex */
public abstract class b1 extends r1 {
    public final boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f9546j;
    public final byte[] k;

    public b1(boolean z, int i, byte[] bArr) {
        this.i = z;
        this.f9546j = i;
        this.k = eh0.e(bArr);
    }

    @Override // com.oplus.aiunit.vision.r1
    public boolean f(r1 r1Var) {
        if (!(r1Var instanceof b1)) {
            return false;
        }
        b1 b1Var = (b1) r1Var;
        return this.i == b1Var.i && this.f9546j == b1Var.f9546j && eh0.a(this.k, b1Var.k);
    }

    @Override // com.oplus.aiunit.vision.r1
    public void g(q1 q1Var) throws IOException {
        q1Var.f(this.i ? 96 : 64, this.f9546j, this.k);
    }

    @Override // com.oplus.aiunit.vision.r1
    public int h() throws IOException {
        return lwi.b(this.f9546j) + lwi.a(this.k.length) + this.k.length;
    }

    @Override // com.oplus.aiunit.vision.r1, com.oplus.aiunit.vision.m1
    public int hashCode() {
        boolean z = this.i;
        return eh0.p(this.k) ^ ((z ? 1 : 0) ^ this.f9546j);
    }

    @Override // com.oplus.aiunit.vision.r1
    public boolean j() {
        return this.i;
    }

    public int m() {
        return this.f9546j;
    }
}
