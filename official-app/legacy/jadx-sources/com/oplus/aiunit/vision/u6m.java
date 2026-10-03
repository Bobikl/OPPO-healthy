package com.oplus.aiunit.vision;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes11.dex */
public class u6m extends m1 {
    public final int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final byte[] f17324j;
    public final byte[] k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final byte[] f17325l;
    public final byte[] m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final byte[] f17326n;

    public u6m(int i, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        this.i = i;
        this.f17324j = eh0.e(bArr);
        this.k = eh0.e(bArr2);
        this.f17325l = eh0.e(bArr3);
        this.m = eh0.e(bArr4);
        this.f17326n = eh0.e(bArr5);
    }

    public static u6m h(Object obj) {
        if (obj instanceof u6m) {
            return (u6m) obj;
        }
        if (obj != null) {
            return new u6m(s1.n(obj));
        }
        return null;
    }

    @Override // com.oplus.aiunit.vision.m1, com.oplus.aiunit.vision.f1
    public r1 c() {
        g1 g1Var = new g1();
        g1Var.a(new k1(0L));
        g1 g1Var2 = new g1();
        g1Var2.a(new k1(this.i));
        g1Var2.a(new tj4(this.f17324j));
        g1Var2.a(new tj4(this.k));
        g1Var2.a(new tj4(this.f17325l));
        g1Var2.a(new tj4(this.m));
        g1Var.a(new xj4(g1Var2));
        g1Var.a(new ck4(true, 0, new tj4(this.f17326n)));
        return new xj4(g1Var);
    }

    public byte[] f() {
        return eh0.e(this.f17326n);
    }

    public int g() {
        return this.i;
    }

    public byte[] i() {
        return eh0.e(this.f17325l);
    }

    public byte[] j() {
        return eh0.e(this.m);
    }

    public byte[] k() {
        return eh0.e(this.k);
    }

    public byte[] l() {
        return eh0.e(this.f17324j);
    }

    public u6m(s1 s1Var) {
        if (k1.m(s1Var.p(0)).o().equals(BigInteger.valueOf(0L))) {
            if (s1Var.size() != 2 && s1Var.size() != 3) {
                throw new IllegalArgumentException("key sequence wrong size");
            }
            s1 s1VarN = s1.n(s1Var.p(1));
            this.i = k1.m(s1VarN.p(0)).o().intValue();
            this.f17324j = eh0.e(o1.n(s1VarN.p(1)).o());
            this.k = eh0.e(o1.n(s1VarN.p(2)).o());
            this.f17325l = eh0.e(o1.n(s1VarN.p(3)).o());
            this.m = eh0.e(o1.n(s1VarN.p(4)).o());
            if (s1Var.size() == 3) {
                this.f17326n = eh0.e(o1.m(y1.m(s1Var.p(2)), true).o());
                return;
            } else {
                this.f17326n = null;
                return;
            }
        }
        throw new IllegalArgumentException("unknown version of sequence");
    }
}
