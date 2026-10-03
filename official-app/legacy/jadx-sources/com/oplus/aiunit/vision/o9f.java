package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes11.dex */
public class o9f extends m1 {
    public k1 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public n1 f14852j;
    public k1 k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public byte[][] f14853l;
    public byte[][] m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public byte[] f14854n;

    public o9f(s1 s1Var) {
        if (s1Var.p(0) instanceof k1) {
            this.i = k1.m(s1Var.p(0));
        } else {
            this.f14852j = n1.s(s1Var.p(0));
        }
        this.k = k1.m(s1Var.p(1));
        s1 s1VarN = s1.n(s1Var.p(2));
        this.f14853l = new byte[s1VarN.size()][];
        for (int i = 0; i < s1VarN.size(); i++) {
            this.f14853l[i] = o1.n(s1VarN.p(i)).o();
        }
        s1 s1Var2 = (s1) s1Var.p(3);
        this.m = new byte[s1Var2.size()][];
        for (int i2 = 0; i2 < s1Var2.size(); i2++) {
            this.m[i2] = o1.n(s1Var2.p(i2)).o();
        }
        this.f14854n = o1.n(((s1) s1Var.p(4)).p(0)).o();
    }

    public static o9f j(Object obj) {
        if (obj instanceof o9f) {
            return (o9f) obj;
        }
        if (obj != null) {
            return new o9f(s1.n(obj));
        }
        return null;
    }

    @Override // com.oplus.aiunit.vision.m1, com.oplus.aiunit.vision.f1
    public r1 c() {
        g1 g1Var = new g1();
        k1 k1Var = this.i;
        if (k1Var != null) {
            g1Var.a(k1Var);
        } else {
            g1Var.a(this.f14852j);
        }
        g1Var.a(this.k);
        g1 g1Var2 = new g1();
        int i = 0;
        int i2 = 0;
        while (true) {
            byte[][] bArr = this.f14853l;
            if (i2 >= bArr.length) {
                break;
            }
            g1Var2.a(new tj4(bArr[i2]));
            i2++;
        }
        g1Var.a(new xj4(g1Var2));
        g1 g1Var3 = new g1();
        while (true) {
            byte[][] bArr2 = this.m;
            if (i >= bArr2.length) {
                g1Var.a(new xj4(g1Var3));
                g1 g1Var4 = new g1();
                g1Var4.a(new tj4(this.f14854n));
                g1Var.a(new xj4(g1Var4));
                return new xj4(g1Var);
            }
            g1Var3.a(new tj4(bArr2[i]));
            i++;
        }
    }

    public short[][] f() {
        return r9f.d(this.f14853l);
    }

    public short[] g() {
        return r9f.b(this.f14854n);
    }

    public short[][] h() {
        return r9f.d(this.m);
    }

    public int i() {
        return this.k.o().intValue();
    }

    public o9f(int i, short[][] sArr, short[][] sArr2, short[] sArr3) {
        this.i = new k1(0L);
        this.k = new k1(i);
        this.f14853l = r9f.c(sArr);
        this.m = r9f.c(sArr2);
        this.f14854n = r9f.a(sArr3);
    }
}
