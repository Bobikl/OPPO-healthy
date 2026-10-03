package com.oplus.aiunit.vision;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes11.dex */
public class lj4 extends r1 {
    public n1 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public k1 f13720j;
    public r1 k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f13721l;
    public r1 m;

    public lj4(g1 g1Var) {
        int i = 0;
        r1 r1VarM = m(g1Var, 0);
        if (r1VarM instanceof n1) {
            this.i = (n1) r1VarM;
            r1VarM = m(g1Var, 1);
            i = 1;
        }
        if (r1VarM instanceof k1) {
            this.f13720j = (k1) r1VarM;
            i++;
            r1VarM = m(g1Var, i);
        }
        if (!(r1VarM instanceof y1)) {
            this.k = r1VarM;
            i++;
            r1VarM = m(g1Var, i);
        }
        if (g1Var.c() != i + 1) {
            throw new IllegalArgumentException("input vector too large");
        }
        if (!(r1VarM instanceof y1)) {
            throw new IllegalArgumentException("No tagged object found in vector. Structure doesn't seem to be of type External");
        }
        y1 y1Var = (y1) r1VarM;
        n(y1Var.o());
        this.m = y1Var.n();
    }

    @Override // com.oplus.aiunit.vision.r1
    public boolean f(r1 r1Var) {
        r1 r1Var2;
        k1 k1Var;
        n1 n1Var;
        if (!(r1Var instanceof lj4)) {
            return false;
        }
        if (this == r1Var) {
            return true;
        }
        lj4 lj4Var = (lj4) r1Var;
        n1 n1Var2 = this.i;
        if (n1Var2 != null && ((n1Var = lj4Var.i) == null || !n1Var.equals(n1Var2))) {
            return false;
        }
        k1 k1Var2 = this.f13720j;
        if (k1Var2 != null && ((k1Var = lj4Var.f13720j) == null || !k1Var.equals(k1Var2))) {
            return false;
        }
        r1 r1Var3 = this.k;
        if (r1Var3 == null || ((r1Var2 = lj4Var.k) != null && r1Var2.equals(r1Var3))) {
            return this.m.equals(lj4Var.m);
        }
        return false;
    }

    @Override // com.oplus.aiunit.vision.r1
    public void g(q1 q1Var) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        n1 n1Var = this.i;
        if (n1Var != null) {
            byteArrayOutputStream.write(n1Var.e("DER"));
        }
        k1 k1Var = this.f13720j;
        if (k1Var != null) {
            byteArrayOutputStream.write(k1Var.e("DER"));
        }
        r1 r1Var = this.k;
        if (r1Var != null) {
            byteArrayOutputStream.write(r1Var.e("DER"));
        }
        byteArrayOutputStream.write(new ck4(true, this.f13721l, this.m).e("DER"));
        q1Var.f(32, 8, byteArrayOutputStream.toByteArray());
    }

    @Override // com.oplus.aiunit.vision.r1
    public int h() throws IOException {
        return d().length;
    }

    @Override // com.oplus.aiunit.vision.r1, com.oplus.aiunit.vision.m1
    public int hashCode() {
        n1 n1Var = this.i;
        int iHashCode = n1Var != null ? n1Var.hashCode() : 0;
        k1 k1Var = this.f13720j;
        if (k1Var != null) {
            iHashCode ^= k1Var.hashCode();
        }
        r1 r1Var = this.k;
        if (r1Var != null) {
            iHashCode ^= r1Var.hashCode();
        }
        return this.m.hashCode() ^ iHashCode;
    }

    @Override // com.oplus.aiunit.vision.r1
    public boolean j() {
        return true;
    }

    public final r1 m(g1 g1Var, int i) {
        if (g1Var.c() > i) {
            return g1Var.b(i).c();
        }
        throw new IllegalArgumentException("too few objects in input vector");
    }

    public final void n(int i) {
        if (i >= 0 && i <= 2) {
            this.f13721l = i;
            return;
        }
        throw new IllegalArgumentException("invalid encoding value: " + i);
    }
}
