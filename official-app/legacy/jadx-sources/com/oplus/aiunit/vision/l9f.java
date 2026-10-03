package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes11.dex */
public class l9f extends m1 {
    public k1 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public n1 f13594j;
    public byte[][] k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public byte[] f13595l;
    public byte[][] m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public byte[] f13596n;
    public byte[] o;
    public rua[] p;

    public l9f(s1 s1Var) {
        int i = 0;
        if (s1Var.p(0) instanceof k1) {
            this.i = k1.m(s1Var.p(0));
        } else {
            this.f13594j = n1.s(s1Var.p(0));
        }
        s1 s1Var2 = (s1) s1Var.p(1);
        this.k = new byte[s1Var2.size()][];
        for (int i2 = 0; i2 < s1Var2.size(); i2++) {
            this.k[i2] = ((o1) s1Var2.p(i2)).o();
        }
        this.f13595l = ((o1) ((s1) s1Var.p(2)).p(0)).o();
        s1 s1Var3 = (s1) s1Var.p(3);
        this.m = new byte[s1Var3.size()][];
        for (int i3 = 0; i3 < s1Var3.size(); i3++) {
            this.m[i3] = ((o1) s1Var3.p(i3)).o();
        }
        this.f13596n = ((o1) ((s1) s1Var.p(4)).p(0)).o();
        this.o = ((o1) ((s1) s1Var.p(5)).p(0)).o();
        s1 s1Var4 = (s1) s1Var.p(6);
        byte[][][][] bArr = new byte[s1Var4.size()][][][];
        byte[][][][] bArr2 = new byte[s1Var4.size()][][][];
        byte[][][] bArr3 = new byte[s1Var4.size()][][];
        byte[][] bArr4 = new byte[s1Var4.size()][];
        int i4 = 0;
        while (i4 < s1Var4.size()) {
            s1 s1Var5 = (s1) s1Var4.p(i4);
            s1 s1Var6 = (s1) s1Var5.p(i);
            bArr[i4] = new byte[s1Var6.size()][][];
            for (int i5 = i; i5 < s1Var6.size(); i5++) {
                s1 s1Var7 = (s1) s1Var6.p(i5);
                bArr[i4][i5] = new byte[s1Var7.size()][];
                for (int i6 = 0; i6 < s1Var7.size(); i6++) {
                    bArr[i4][i5][i6] = ((o1) s1Var7.p(i6)).o();
                }
            }
            s1 s1Var8 = (s1) s1Var5.p(1);
            bArr2[i4] = new byte[s1Var8.size()][][];
            for (int i7 = 0; i7 < s1Var8.size(); i7++) {
                s1 s1Var9 = (s1) s1Var8.p(i7);
                bArr2[i4][i7] = new byte[s1Var9.size()][];
                for (int i8 = 0; i8 < s1Var9.size(); i8++) {
                    bArr2[i4][i7][i8] = ((o1) s1Var9.p(i8)).o();
                }
            }
            s1 s1Var10 = (s1) s1Var5.p(2);
            bArr3[i4] = new byte[s1Var10.size()][];
            for (int i9 = 0; i9 < s1Var10.size(); i9++) {
                bArr3[i4][i9] = ((o1) s1Var10.p(i9)).o();
            }
            bArr4[i4] = ((o1) s1Var5.p(3)).o();
            i4++;
            i = 0;
        }
        int length = this.o.length - 1;
        this.p = new rua[length];
        int i10 = 0;
        while (i10 < length) {
            byte[] bArr5 = this.o;
            int i11 = i10 + 1;
            this.p[i10] = new rua(bArr5[i10], bArr5[i11], r9f.f(bArr[i10]), r9f.f(bArr2[i10]), r9f.d(bArr3[i10]), r9f.b(bArr4[i10]));
            i10 = i11;
        }
    }

    public static l9f h(Object obj) {
        if (obj instanceof l9f) {
            return (l9f) obj;
        }
        if (obj != null) {
            return new l9f(s1.n(obj));
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
            g1Var.a(this.f13594j);
        }
        g1 g1Var2 = new g1();
        int i = 0;
        while (true) {
            byte[][] bArr = this.k;
            if (i >= bArr.length) {
                break;
            }
            g1Var2.a(new tj4(bArr[i]));
            i++;
        }
        g1Var.a(new xj4(g1Var2));
        g1 g1Var3 = new g1();
        g1Var3.a(new tj4(this.f13595l));
        g1Var.a(new xj4(g1Var3));
        g1 g1Var4 = new g1();
        int i2 = 0;
        while (true) {
            byte[][] bArr2 = this.m;
            if (i2 >= bArr2.length) {
                break;
            }
            g1Var4.a(new tj4(bArr2[i2]));
            i2++;
        }
        g1Var.a(new xj4(g1Var4));
        g1 g1Var5 = new g1();
        g1Var5.a(new tj4(this.f13596n));
        g1Var.a(new xj4(g1Var5));
        g1 g1Var6 = new g1();
        g1Var6.a(new tj4(this.o));
        g1Var.a(new xj4(g1Var6));
        g1 g1Var7 = new g1();
        for (int i3 = 0; i3 < this.p.length; i3++) {
            g1 g1Var8 = new g1();
            byte[][][] bArrE = r9f.e(this.p[i3].a());
            g1 g1Var9 = new g1();
            for (byte[][] bArr3 : bArrE) {
                g1 g1Var10 = new g1();
                int i4 = 0;
                while (true) {
                    if (i4 < bArr3.length) {
                        g1Var10.a(new tj4(bArr3[i4]));
                        i4++;
                    }
                }
                g1Var9.a(new xj4(g1Var10));
            }
            g1Var8.a(new xj4(g1Var9));
            byte[][][] bArrE2 = r9f.e(this.p[i3].b());
            g1 g1Var11 = new g1();
            for (byte[][] bArr4 : bArrE2) {
                g1 g1Var12 = new g1();
                int i5 = 0;
                while (true) {
                    if (i5 < bArr4.length) {
                        g1Var12.a(new tj4(bArr4[i5]));
                        i5++;
                    }
                }
                g1Var11.a(new xj4(g1Var12));
            }
            g1Var8.a(new xj4(g1Var11));
            byte[][] bArrC = r9f.c(this.p[i3].d());
            g1 g1Var13 = new g1();
            for (byte[] bArr5 : bArrC) {
                g1Var13.a(new tj4(bArr5));
            }
            g1Var8.a(new xj4(g1Var13));
            g1Var8.a(new tj4(r9f.a(this.p[i3].c())));
            g1Var7.a(new xj4(g1Var8));
        }
        g1Var.a(new xj4(g1Var7));
        return new xj4(g1Var);
    }

    public short[] f() {
        return r9f.b(this.f13595l);
    }

    public short[] g() {
        return r9f.b(this.f13596n);
    }

    public short[][] i() {
        return r9f.d(this.k);
    }

    public short[][] j() {
        return r9f.d(this.m);
    }

    public rua[] k() {
        return this.p;
    }

    public int[] l() {
        return r9f.g(this.o);
    }

    public l9f(short[][] sArr, short[] sArr2, short[][] sArr3, short[] sArr4, int[] iArr, rua[] ruaVarArr) {
        this.i = new k1(1L);
        this.k = r9f.c(sArr);
        this.f13595l = r9f.a(sArr2);
        this.m = r9f.c(sArr3);
        this.f13596n = r9f.a(sArr4);
        this.o = r9f.h(iArr);
        this.p = ruaVarArr;
    }
}
