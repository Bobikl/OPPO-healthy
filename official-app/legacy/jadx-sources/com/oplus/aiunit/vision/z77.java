package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes11.dex */
public class z77 extends t22 {
    public int m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f19306n;
    public float o;
    public float p;

    public z77(int i, float f, float f2, float f3, boolean z) {
        this.m = i;
        this.d = (i * (f2 + f3)) + (2.0f * f3);
        this.f16854e = f;
        this.f = 0.0f;
        this.f19306n = z;
        this.o = f3;
        this.p = f2;
    }

    @Override // com.oplus.aiunit.vision.t22
    public void c(tb8 tb8Var, float f, float f2) {
        qq transform = tb8Var.getTransform();
        l1j l1jVarO = tb8Var.o();
        double d = transform.d();
        double dE = transform.e();
        if (d == dE) {
            qq qqVarClone = transform.clone();
            qqVarClone.j(1.0d / d, 1.0d / dE);
            tb8Var.a(qqVarClone);
        } else {
            d = 1.0d;
        }
        int i = 0;
        tb8Var.j(new cc1((float) (((double) this.p) * d), 0, 0));
        float f3 = this.p / 2.0f;
        rwa rwaVar = new rwa();
        float f4 = this.o;
        int iRound = (int) Math.round(((double) (f4 + this.p)) * d);
        float f5 = (float) ((((double) (f + f4)) * d) + (((double) (f4 / 2.0f)) * d));
        while (i < this.m) {
            double d2 = (((double) f3) * d) + ((double) f5);
            float f6 = f3;
            int i2 = iRound;
            qq qqVar = transform;
            rwa rwaVar2 = rwaVar;
            rwaVar.a(d2, ((double) (f2 - this.f16854e)) * d, d2, ((double) f2) * d);
            tb8Var.l(rwaVar2);
            f5 += i2;
            i++;
            rwaVar = rwaVar2;
            iRound = i2;
            f3 = f6;
            l1jVarO = l1jVarO;
            transform = qqVar;
        }
        qq qqVar2 = transform;
        l1j l1jVar = l1jVarO;
        float f7 = f5;
        rwa rwaVar3 = rwaVar;
        if (this.f19306n) {
            float f8 = this.o;
            float f9 = this.f16854e;
            rwaVar3.a(((double) (f + f8)) * d, ((double) (f2 - (f9 / 2.0f))) * d, ((double) f7) - ((((double) f8) * d) / 2.0d), ((double) (f2 - (f9 / 2.0f))) * d);
            tb8Var.l(rwaVar3);
        }
        tb8Var.a(qqVar2);
        tb8Var.j(l1jVar);
    }

    @Override // com.oplus.aiunit.vision.t22
    public int i() {
        return -1;
    }
}
