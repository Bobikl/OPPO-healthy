package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes11.dex */
public class mia extends t22 {
    public static bw7 o = new bw7("Serif", 0, 10);
    public btj m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f14083n;

    public mia(String str, int i, float f, bw7 bw7Var, boolean z) {
        this.f14083n = f;
        btj btjVar = new btj(str, bw7Var.d(i), null);
        this.m = btjVar;
        cjf cjfVarB = btjVar.b();
        this.f16854e = ((-cjfVarB.d()) * f) / 10.0f;
        this.f = ((cjfVarB.a() * f) / 10.0f) - this.f16854e;
        this.d = (((cjfVarB.b() + cjfVarB.c()) + 0.4f) * f) / 10.0f;
    }

    public static void r(String str) {
        o = new bw7(str, 0, 10);
    }

    @Override // com.oplus.aiunit.vision.t22
    public void c(tb8 tb8Var, float f, float f2) {
        d(tb8Var, f, f2);
        tb8Var.c(f, f2);
        float f3 = this.f14083n;
        tb8Var.m(((double) f3) * 0.1d, ((double) f3) * 0.1d);
        this.m.a(tb8Var, 0, 0);
        float f4 = this.f14083n;
        tb8Var.m(10.0f / f4, 10.0f / f4);
        tb8Var.c(-f, -f2);
    }

    @Override // com.oplus.aiunit.vision.t22
    public int i() {
        return 0;
    }

    public mia(String str, int i, float f) {
        this(str, i, f, o, true);
    }
}
