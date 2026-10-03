package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes11.dex */
public class txd extends t22 {
    public final t22 m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final t22 f17195n;
    public final t22 o;
    public final float p;
    public final boolean q;

    public txd(t22 t22Var, t22 t22Var2, t22 t22Var3, float f, boolean z) {
        this.m = t22Var;
        this.f17195n = t22Var2;
        this.o = t22Var3;
        this.p = f;
        this.q = z;
        this.d = t22Var.k();
        float f2 = 0.0f;
        this.f16854e = t22Var.f16854e + (z ? t22Var2.k() : 0.0f) + ((!z || t22Var3 == null) ? 0.0f : t22Var3.f16854e + t22Var3.f + f);
        float fK = t22Var.f + (z ? 0.0f : t22Var2.k());
        if (!z && t22Var3 != null) {
            f2 = t22Var3.f16854e + t22Var3.f + f;
        }
        this.f = fK + f2;
    }

    @Override // com.oplus.aiunit.vision.t22
    public void c(tb8 tb8Var, float f, float f2) {
        d(tb8Var, f, f2);
        this.m.c(tb8Var, f, f2);
        float fK = (f2 - this.m.f16854e) - this.f17195n.k();
        t22 t22Var = this.f17195n;
        t22Var.m(t22Var.h() + this.f17195n.g());
        this.f17195n.n(0.0f);
        if (this.q) {
            t22 t22Var2 = this.f17195n;
            qq transform = tb8Var.getTransform();
            tb8Var.c(((double) f) + (((double) (t22Var2.f16854e + t22Var2.f)) * 0.75d), fK);
            tb8Var.q(1.5707963267948966d);
            this.f17195n.c(tb8Var, 0.0f, 0.0f);
            tb8Var.a(transform);
            t22 t22Var3 = this.o;
            if (t22Var3 != null) {
                t22Var3.c(tb8Var, f, (fK - this.p) - t22Var3.f);
            }
        }
        float f3 = f2 + this.m.f;
        if (this.q) {
            return;
        }
        qq transform2 = tb8Var.getTransform();
        tb8Var.c(((double) f) + (((double) (this.f17195n.h() + this.f17195n.f)) * 0.75d), f3);
        tb8Var.q(1.5707963267948966d);
        this.f17195n.c(tb8Var, 0.0f, 0.0f);
        tb8Var.a(transform2);
        float fK2 = f3 + this.f17195n.k();
        t22 t22Var4 = this.o;
        if (t22Var4 != null) {
            t22Var4.c(tb8Var, f, fK2 + this.p + t22Var4.f16854e);
        }
    }

    @Override // com.oplus.aiunit.vision.t22
    public int i() {
        return this.m.i();
    }
}
