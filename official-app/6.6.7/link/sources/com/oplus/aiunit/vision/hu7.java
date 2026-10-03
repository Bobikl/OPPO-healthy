package com.oplus.aiunit.vision;

import android.graphics.RectF;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public class hu7 extends k14 {
    public float w;
    public float x;
    public boolean y;

    public hu7() {
        this(0, (RectF) null);
    }

    @Override // com.oplus.aiunit.vision.k14, com.oplus.aiunit.vision.r01
    public void B() {
        super.B();
        float f = this.x;
        if (f != vr3.UNSET) {
            pv1 pv1Var = this.k;
            this.w = pv1Var.t;
            pv1Var.n(f);
            pv1 pv1Var2 = this.p;
            if (pv1Var2 != null) {
                pv1Var2.n(this.x);
            }
        }
    }

    @Override // com.oplus.aiunit.vision.k14, com.oplus.aiunit.vision.r01
    public boolean C() {
        float f = this.w;
        if (f != vr3.UNSET) {
            this.k.n(f);
            pv1 pv1Var = this.p;
            if (pv1Var != null) {
                pv1Var.n(this.w);
            }
        }
        return super.C();
    }

    @Override // com.oplus.aiunit.vision.r01
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

    public hu7 j0(float f) {
        this.x = f;
        return this;
    }

    public void k0() {
        B();
    }

    public void l0(float f) {
        m0(f, vr3.UNSET);
    }

    public void m0(float f, float f2) {
        if (z25.b()) {
            z25.c("FlingBehavior : Fling : start : xVel =:" + f + ",yVel =:" + f2);
        }
        this.y = true;
        this.k.d().d(vr3.d(f), vr3.d(f2));
        k0();
        this.y = false;
    }

    public void n0() {
        C();
    }

    @Override // com.oplus.aiunit.vision.k14, com.oplus.aiunit.vision.r01
    public int r() {
        return 2;
    }

    public hu7(float f, float f2) {
        this(3, f, f2);
    }

    public hu7(int i, float f, float f2) {
        this(i, new RectF(f, f, f2, f2));
    }

    public hu7(int i, RectF rectF) {
        super(i, rectF);
        this.w = vr3.UNSET;
        this.x = vr3.UNSET;
        this.y = false;
    }
}
