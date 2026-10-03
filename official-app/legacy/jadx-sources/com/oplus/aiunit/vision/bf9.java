package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes11.dex */
public class bf9 extends t22 {
    public lk3 m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f9733n;

    public bf9(float f, float f2, float f3) {
        this.m = null;
        this.f9733n = 0.0f;
        this.f16854e = f;
        this.d = f2;
        this.g = f3;
    }

    @Override // com.oplus.aiunit.vision.t22
    public void c(tb8 tb8Var, float f, float f2) {
        lk3 color = tb8Var.getColor();
        lk3 lk3Var = this.m;
        if (lk3Var != null) {
            tb8Var.t(lk3Var);
        }
        float f3 = this.f9733n;
        if (f3 == 0.0f) {
            float f4 = this.f16854e;
            tb8Var.b(new cjf.a(f, f2 - f4, this.d, f4));
        } else {
            float f5 = this.f16854e;
            tb8Var.b(new cjf.a(f, (f2 - f5) + f3, this.d, f5));
        }
        tb8Var.t(color);
    }

    @Override // com.oplus.aiunit.vision.t22
    public int i() {
        return -1;
    }

    public bf9(float f, float f2, float f3, boolean z) {
        this.m = null;
        this.f9733n = 0.0f;
        this.f16854e = f;
        this.d = f2;
        if (z) {
            this.g = f3;
        } else {
            this.g = 0.0f;
            this.f9733n = f3;
        }
    }
}
