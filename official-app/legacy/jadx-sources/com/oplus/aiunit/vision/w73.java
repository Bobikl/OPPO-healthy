package com.oplus.aiunit.vision;

import com.heytap.store.base.core.http.HttpUtils;

/* JADX INFO: loaded from: classes11.dex */
public class w73 extends t22 {
    public final x73 m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final float f18146n;
    public float o;
    public final char[] p = new char[1];

    public w73(u73 u73Var) {
        this.m = u73Var.b();
        this.f18146n = u73Var.h().d();
        this.d = u73Var.i();
        this.f16854e = u73Var.f();
        this.f = u73Var.c();
        this.o = u73Var.g();
    }

    @Override // com.oplus.aiunit.vision.t22
    public void c(tb8 tb8Var, float f, float f2) {
        d(tb8Var, f, f2);
        qq transform = tb8Var.getTransform();
        tb8Var.c(f, f2);
        bw7 bw7VarF = lw7.f(this.m.b);
        if (Math.abs(this.f18146n - tpj.FONT_SCALE_FACTOR) > 1.0E-7f) {
            float f3 = this.f18146n;
            float f4 = tpj.FONT_SCALE_FACTOR;
            tb8Var.m(f3 / f4, f3 / f4);
        }
        if (tb8Var.i() != bw7VarF) {
            tb8Var.d(bw7VarF);
        }
        char[] cArr = this.p;
        cArr[0] = this.m.a;
        tb8Var.k(cArr, 0, 1, 0, 0);
        tb8Var.a(transform);
    }

    @Override // com.oplus.aiunit.vision.t22
    public int i() {
        return this.m.b;
    }

    public void r() {
        this.d += this.o;
        this.o = 0.0f;
    }

    public String toString() {
        return super.toString() + HttpUtils.EQUAL_SIGN + this.m.a;
    }
}
