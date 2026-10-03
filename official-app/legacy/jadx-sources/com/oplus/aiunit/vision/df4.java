package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes11.dex */
public class df4 extends rb6.b {
    public df4(a86 a86Var, h86 h86Var, h86 h86Var2) {
        this(a86Var, h86Var, h86Var2, false);
    }

    @Override // com.oplus.aiunit.vision.rb6
    public rb6 E() {
        return (t() || this.f16149c.i()) ? this : K(false).a(this);
    }

    @Override // com.oplus.aiunit.vision.rb6
    public rb6 G() {
        if (t()) {
            return this;
        }
        return this.f16149c.i() ? i().t() : K(true);
    }

    @Override // com.oplus.aiunit.vision.rb6
    public rb6 H(rb6 rb6Var) {
        if (this == rb6Var) {
            return E();
        }
        if (t()) {
            return rb6Var;
        }
        if (rb6Var.t()) {
            return G();
        }
        return this.f16149c.i() ? rb6Var : K(false).a(rb6Var);
    }

    public cf4 I(cf4 cf4Var, int[] iArr) {
        cf4 cf4Var2 = (cf4) i().n();
        if (cf4Var.h()) {
            return cf4Var2;
        }
        cf4 cf4Var3 = new cf4();
        if (iArr == null) {
            iArr = cf4Var3.a;
            bf4.j(cf4Var.a, iArr);
        }
        bf4.j(iArr, cf4Var3.a);
        int[] iArr2 = cf4Var3.a;
        bf4.e(iArr2, cf4Var2.a, iArr2);
        return cf4Var3;
    }

    public cf4 J() {
        h86[] h86VarArr = this.d;
        cf4 cf4Var = (cf4) h86VarArr[1];
        if (cf4Var != null) {
            return cf4Var;
        }
        cf4 cf4VarI = I((cf4) h86VarArr[0], null);
        h86VarArr[1] = cf4VarI;
        return cf4VarI;
    }

    public df4 K(boolean z) {
        cf4 cf4Var;
        cf4 cf4Var2 = (cf4) this.b;
        cf4 cf4Var3 = (cf4) this.f16149c;
        cf4 cf4Var4 = (cf4) this.d[0];
        cf4 cf4VarJ = J();
        int[] iArrF = afc.f();
        bf4.j(cf4Var2.a, iArrF);
        bf4.i(afc.b(iArrF, iArrF, iArrF) + afc.d(cf4VarJ.a, iArrF), iArrF);
        int[] iArrF2 = afc.f();
        bf4.o(cf4Var3.a, iArrF2);
        int[] iArrF3 = afc.f();
        bf4.e(iArrF2, cf4Var3.a, iArrF3);
        int[] iArrF4 = afc.f();
        bf4.e(iArrF3, cf4Var2.a, iArrF4);
        bf4.o(iArrF4, iArrF4);
        int[] iArrF5 = afc.f();
        bf4.j(iArrF3, iArrF5);
        bf4.o(iArrF5, iArrF5);
        cf4 cf4Var5 = new cf4(iArrF3);
        bf4.j(iArrF, cf4Var5.a);
        int[] iArr = cf4Var5.a;
        bf4.n(iArr, iArrF4, iArr);
        int[] iArr2 = cf4Var5.a;
        bf4.n(iArr2, iArrF4, iArr2);
        cf4 cf4Var6 = new cf4(iArrF4);
        bf4.n(iArrF4, cf4Var5.a, cf4Var6.a);
        int[] iArr3 = cf4Var6.a;
        bf4.e(iArr3, iArrF, iArr3);
        int[] iArr4 = cf4Var6.a;
        bf4.n(iArr4, iArrF5, iArr4);
        cf4 cf4Var7 = new cf4(iArrF2);
        if (!afc.r(cf4Var4.a)) {
            int[] iArr5 = cf4Var7.a;
            bf4.e(iArr5, cf4Var4.a, iArr5);
        }
        if (z) {
            cf4Var = new cf4(iArrF5);
            int[] iArr6 = cf4Var.a;
            bf4.e(iArr6, cf4VarJ.a, iArr6);
            int[] iArr7 = cf4Var.a;
            bf4.o(iArr7, iArr7);
        } else {
            cf4Var = null;
        }
        return new df4(i(), cf4Var5, cf4Var6, new h86[]{cf4Var7, cf4Var}, this.f16150e);
    }

    @Override // com.oplus.aiunit.vision.rb6
    public rb6 a(rb6 rb6Var) {
        int[] iArr;
        int[] iArr2;
        int[] iArr3;
        int[] iArr4;
        if (t()) {
            return rb6Var;
        }
        if (rb6Var.t()) {
            return this;
        }
        if (this == rb6Var) {
            return G();
        }
        a86 a86VarI = i();
        cf4 cf4Var = (cf4) this.b;
        cf4 cf4Var2 = (cf4) this.f16149c;
        cf4 cf4Var3 = (cf4) this.d[0];
        cf4 cf4Var4 = (cf4) rb6Var.q();
        cf4 cf4Var5 = (cf4) rb6Var.r();
        cf4 cf4Var6 = (cf4) rb6Var.s(0);
        int[] iArrH = afc.h();
        int[] iArrF = afc.f();
        int[] iArrF2 = afc.f();
        int[] iArrF3 = afc.f();
        boolean zH = cf4Var3.h();
        if (zH) {
            iArr = cf4Var4.a;
            iArr2 = cf4Var5.a;
        } else {
            bf4.j(cf4Var3.a, iArrF2);
            bf4.e(iArrF2, cf4Var4.a, iArrF);
            bf4.e(iArrF2, cf4Var3.a, iArrF2);
            bf4.e(iArrF2, cf4Var5.a, iArrF2);
            iArr = iArrF;
            iArr2 = iArrF2;
        }
        boolean zH2 = cf4Var6.h();
        if (zH2) {
            iArr3 = cf4Var.a;
            iArr4 = cf4Var2.a;
        } else {
            bf4.j(cf4Var6.a, iArrF3);
            bf4.e(iArrF3, cf4Var.a, iArrH);
            bf4.e(iArrF3, cf4Var6.a, iArrF3);
            bf4.e(iArrF3, cf4Var2.a, iArrF3);
            iArr3 = iArrH;
            iArr4 = iArrF3;
        }
        int[] iArrF4 = afc.f();
        bf4.n(iArr3, iArr, iArrF4);
        bf4.n(iArr4, iArr2, iArrF);
        if (afc.t(iArrF4)) {
            return afc.t(iArrF) ? G() : a86VarI.t();
        }
        int[] iArrF5 = afc.f();
        bf4.j(iArrF4, iArrF5);
        int[] iArrF6 = afc.f();
        bf4.e(iArrF5, iArrF4, iArrF6);
        bf4.e(iArrF5, iArr3, iArrF2);
        bf4.g(iArrF6, iArrF6);
        afc.w(iArr4, iArrF6, iArrH);
        bf4.i(afc.b(iArrF2, iArrF2, iArrF6), iArrF6);
        cf4 cf4Var7 = new cf4(iArrF3);
        bf4.j(iArrF, cf4Var7.a);
        int[] iArr5 = cf4Var7.a;
        bf4.n(iArr5, iArrF6, iArr5);
        cf4 cf4Var8 = new cf4(iArrF6);
        bf4.n(iArrF2, cf4Var7.a, cf4Var8.a);
        bf4.f(cf4Var8.a, iArrF, iArrH);
        bf4.h(iArrH, cf4Var8.a);
        cf4 cf4Var9 = new cf4(iArrF4);
        if (!zH) {
            int[] iArr6 = cf4Var9.a;
            bf4.e(iArr6, cf4Var3.a, iArr6);
        }
        if (!zH2) {
            int[] iArr7 = cf4Var9.a;
            bf4.e(iArr7, cf4Var6.a, iArr7);
        }
        if (!zH || !zH2) {
            iArrF5 = null;
        }
        return new df4(a86VarI, cf4Var7, cf4Var8, new h86[]{cf4Var9, I(cf4Var9, iArrF5)}, this.f16150e);
    }

    @Override // com.oplus.aiunit.vision.rb6
    public rb6 d() {
        return new df4(null, f(), g());
    }

    @Override // com.oplus.aiunit.vision.rb6
    public h86 s(int i) {
        return i == 1 ? J() : super.s(i);
    }

    @Override // com.oplus.aiunit.vision.rb6
    public rb6 x() {
        return t() ? this : new df4(i(), this.b, this.f16149c.m(), this.d, this.f16150e);
    }

    public df4(a86 a86Var, h86 h86Var, h86 h86Var2, boolean z) {
        super(a86Var, h86Var, h86Var2);
        if ((h86Var == null) != (h86Var2 == null)) {
            throw new IllegalArgumentException("Exactly one of the field elements is null");
        }
        this.f16150e = z;
    }

    public df4(a86 a86Var, h86 h86Var, h86 h86Var2, h86[] h86VarArr, boolean z) {
        super(a86Var, h86Var, h86Var2, h86VarArr);
        this.f16150e = z;
    }
}
