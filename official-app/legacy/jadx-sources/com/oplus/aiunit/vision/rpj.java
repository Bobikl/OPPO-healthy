package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes11.dex */
public class rpj {
    public lk3 a;
    public lk3 b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f16297c;
    public spj d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f16298e;
    public float f;
    public String g;
    public boolean h;
    public float i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f16299j;
    public float k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f16300l;

    public rpj(int i, spj spjVar) {
        this(i, spjVar, (lk3) null, (lk3) null);
    }

    public void A(String str) {
        this.g = str;
    }

    public rpj B() {
        rpj rpjVarA = a();
        rpjVarA.f16297c = ((this.f16297c / 4) * 2) + 4 + 1;
        return rpjVarA;
    }

    public rpj C() {
        rpj rpjVarA = a();
        int i = this.f16297c;
        rpjVarA.f16297c = ((i / 4) * 2) + 4 + (i % 2);
        return rpjVarA;
    }

    public rpj a() {
        return new rpj(this.f16297c, this.i, this.d, this.a, this.b, this.g, this.h);
    }

    public rpj b(spj spjVar) {
        rpj rpjVar = new rpj(this.f16297c, this.i, spjVar, this.a, this.b, this.g, this.h);
        rpjVar.f = this.f;
        rpjVar.k = this.k;
        rpjVar.f16299j = this.f16299j;
        return rpjVar;
    }

    public rpj c() {
        rpj rpjVarA = a();
        int i = this.f16297c;
        if (i % 2 != 1) {
            i++;
        }
        rpjVarA.f16297c = i;
        return rpjVarA;
    }

    public rpj d() {
        rpj rpjVarA = a();
        int i = this.f16297c;
        rpjVarA.f16297c = ((((i / 2) * 2) + 1) + 2) - ((i / 6) * 2);
        return rpjVarA;
    }

    public lk3 e() {
        return this.a;
    }

    public lk3 f() {
        return this.b;
    }

    public float g() {
        return this.k * d4i.i(this.f16299j, this);
    }

    public int h() {
        int i = this.f16298e;
        return i == -1 ? this.d.L() : i;
    }

    public float i() {
        return this.i;
    }

    public float j() {
        return this.d.getSize();
    }

    public boolean k() {
        return this.h;
    }

    public float l() {
        return this.d.e(this.f16297c) * this.d.getScaleFactor();
    }

    public int m() {
        return this.f16297c;
    }

    public spj n() {
        return this.d;
    }

    public String o() {
        return this.g;
    }

    public float p() {
        return this.f;
    }

    public rpj q() {
        rpj rpjVarA = a();
        int i = this.f16297c;
        rpjVarA.f16297c = (i + 2) - ((i / 6) * 2);
        return rpjVarA;
    }

    public void r() {
        this.b = null;
        this.a = null;
    }

    public rpj s() {
        rpj rpjVarA = a();
        rpjVarA.f16297c = 6;
        return rpjVarA;
    }

    public void t(lk3 lk3Var) {
        this.a = lk3Var;
    }

    public void u(lk3 lk3Var) {
        this.b = lk3Var;
    }

    public void v(int i, float f) {
        this.k = f;
        this.f16299j = i;
    }

    public void w(int i) {
        this.f16298e = i;
    }

    public void x(float f) {
        this.i = f;
    }

    public void y(boolean z) {
        this.h = z;
    }

    public void z(int i) {
        this.f16297c = i;
    }

    public rpj(int i, spj spjVar, int i2, float f) {
        this(i, spjVar, (lk3) null, (lk3) null);
        this.f = f * d4i.i(i2, this);
    }

    public rpj(int i, spj spjVar, lk3 lk3Var, lk3 lk3Var2) {
        this.f16298e = -1;
        this.f = Float.POSITIVE_INFINITY;
        this.i = 1.0f;
        this.f16300l = false;
        this.f16297c = i;
        this.d = spjVar;
        this.a = lk3Var;
        this.b = lk3Var2;
        v(1, 1.0f);
    }

    public rpj(int i, float f, spj spjVar, lk3 lk3Var, lk3 lk3Var2, String str, boolean z) {
        this.f16298e = -1;
        this.f = Float.POSITIVE_INFINITY;
        this.f16300l = false;
        this.f16297c = i;
        this.i = f;
        this.d = spjVar;
        this.g = str;
        this.h = z;
        this.a = lk3Var;
        this.b = lk3Var2;
        v(1, 1.0f);
    }
}
