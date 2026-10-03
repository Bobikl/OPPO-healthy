package com.oplus.aiunit.vision;

import android.graphics.RectF;

/* JADX INFO: loaded from: classes8.dex */
public class ft7 extends x04 {
    public float w;
    public float x;
    public boolean y;

    public ft7() {
        this(0, (RectF) null);
    }

    @Override // com.oplus.aiunit.vision.x04, com.oplus.aiunit.vision.d01
    public void B() {
        super.B();
        float f = this.x;
        if (f != 0.0f) {
            bv1 bv1Var = this.k;
            this.w = bv1Var.t;
            bv1Var.n(f);
            bv1 bv1Var2 = this.p;
            if (bv1Var2 != null) {
                bv1Var2.n(this.x);
            }
        }
    }

    @Override // com.oplus.aiunit.vision.x04, com.oplus.aiunit.vision.d01
    public boolean C() {
        float f = this.w;
        if (f != 0.0f) {
            this.k.n(f);
            bv1 bv1Var = this.p;
            if (bv1Var != null) {
                bv1Var.n(this.w);
            }
        }
        return super.C();
    }

    @Override // com.oplus.aiunit.vision.d01
    public void H() {
        if (this.y) {
            return;
        }
        super.H();
    }

    public void h0(float f, float f2) {
        i0(new RectF(f, f, f2, f2));
    }

    public void i0(RectF rectF) {
        super.f0(rectF);
    }

    public ft7 j0(float f) {
        this.x = f;
        return this;
    }

    public void k0() {
        B();
    }

    public void l0(float f) {
        m0(f, 0.0f);
    }

    public void m0(float f, float f2) {
        if (g25.b()) {
            g25.c("FlingBehavior : Fling : start : xVel =:" + f + ",yVel =:" + f2);
        }
        this.y = true;
        this.k.d().d(hr3.d(f), hr3.d(f2));
        k0();
        this.y = false;
    }

    public void n0() {
        C();
    }

    @Override // com.oplus.aiunit.vision.x04, com.oplus.aiunit.vision.d01
    public int r() {
        return 2;
    }

    public ft7(float f, float f2) {
        this(3, f, f2);
    }

    public ft7(int i, float f, float f2) {
        this(i, new RectF(f, f, f2, f2));
    }

    public ft7(int i, RectF rectF) {
        super(i, rectF);
        this.w = 0.0f;
        this.x = 0.0f;
        this.y = false;
    }
}
