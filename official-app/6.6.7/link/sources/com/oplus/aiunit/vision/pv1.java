package com.oplus.aiunit.vision;

import android.graphics.RectF;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public class pv1 {
    public static final int BODY_PROPERTY_ALPHA = 4;
    public static final int BODY_PROPERTY_CUSTOM = 0;
    public static final int BODY_PROPERTY_GROUND = 5;
    public static final int BODY_PROPERTY_POSITION = 1;
    public static final int BODY_PROPERTY_ROTATION = 3;
    public static final int BODY_PROPERTY_SCALE = 2;
    public static final int BODY_TYPE_DYNAMIC = 1;
    public static final int BODY_TYPE_STATIC = 0;
    public final lyk a;
    public final lyk b;
    public final lyk c;
    public final lyk d;
    public final lyk e;
    public final lyk f;
    public r01 g;
    public RectF h;
    public RectF i;
    public pv1 j;
    public pv1 k;
    public tf6 l;
    public boolean m;
    public float n;
    public float o;
    public float p;
    public float q;
    public float r;
    public float s;
    public float t;
    public int u;
    public int v;
    public boolean w;
    public boolean x;
    public String y;

    public pv1(lyk lykVar, int i, int i2, float f, float f2) {
        lyk lykVar2 = new lyk();
        this.a = lykVar2;
        this.b = new lyk();
        this.c = new lyk();
        this.d = new lyk(vr3.UNSET, vr3.UNSET);
        this.e = new lyk();
        this.f = new lyk();
        this.g = null;
        this.m = false;
        this.n = 50.0f;
        this.w = false;
        this.x = false;
        this.y = "";
        v(i);
        s(i2);
        lykVar2.e(lykVar);
        this.q = 1.0f;
        t(f, f2);
        this.w = true;
        this.l = null;
        this.j = null;
        this.k = null;
    }

    public void a(r01 r01Var) {
        RectF rectF = this.h;
        if (rectF == null || rectF.isEmpty() || this.g != r01Var) {
            return;
        }
        this.h = null;
        this.i = null;
        k(50.0f);
    }

    public void b(r01 r01Var) {
        r01 r01Var2;
        RectF rectF = this.i;
        if (rectF == null || (r01Var2 = this.g) == null || r01Var2 != r01Var) {
            return;
        }
        rectF.setEmpty();
    }

    public final lyk c() {
        return this.d;
    }

    public final lyk d() {
        return this.e;
    }

    public final float e() {
        return this.r;
    }

    public final lyk f() {
        return this.a;
    }

    public int g() {
        return this.v;
    }

    public int h() {
        return this.u;
    }

    public final lyk i() {
        return this.c;
    }

    public final void j() {
        if (this.u == 0) {
            p(1.0f);
            n(vr3.UNSET);
            return;
        }
        p(this.o * this.p * this.q);
        n(vr3.a(this.r));
        if (!this.w || this.v == 1) {
            this.b.d(this.o * 0.5f, this.p * 0.5f);
            this.c.e(this.a).a(this.b);
        }
    }

    public void k(float f) {
        this.n = f;
    }

    public void l(boolean z) {
        this.m = z;
    }

    public final void m(float f, float f2) {
        this.d.d(vr3.d(f), vr3.d(f2));
    }

    public final void n(float f) {
        this.t = f;
    }

    public final void o(lyk lykVar) {
        if (this.u == 0) {
            return;
        }
        this.e.e(lykVar);
    }

    public final void p(float f) {
        if (f < 1.0f) {
            f = 1.0f;
        }
        this.r = f;
        this.s = 1.0f / f;
    }

    public void q(RectF rectF) {
        if (rectF == null || rectF.isEmpty()) {
            return;
        }
        if (this.h == null) {
            this.h = new RectF();
        }
        this.h.set(vr3.d(rectF.left), vr3.d(rectF.top), vr3.d(rectF.right), vr3.d(rectF.bottom));
    }

    public final void r(lyk lykVar) {
        this.a.e(lykVar);
        this.c.e(lykVar).a(this.b);
    }

    public final void s(int i) {
        this.v = i;
    }

    public void t(float f, float f2) {
        this.o = f;
        this.p = f2;
        j();
    }

    public String toString() {
        return "Body{mType=" + this.u + ", mProperty=" + this.v + ", mLinearVelocity=" + this.e + ", mLinearDamping=" + this.t + ", mPosition=" + this.a + ", mHookPosition=" + this.d + ", mOriginActiveRect=" + this.h + ", mActiveRect=" + this.i + ", mMassCenter='" + this.b + ", mWorldCenter='" + this.c + ", mLinearVelocity='" + this.e + ", mForce='" + this.f + ", mWidth='" + this.o + ", mHeight='" + this.p + ", mDensity='" + this.q + ", mMass='" + this.r + ", mInvMass='" + this.s + ", mLinearDamping='" + this.t + ", mType='" + this.u + ", mIsSolved='" + this.x + ", mTag='" + this.y + "}@" + hashCode();
    }

    public void u(String str) {
        this.y = str;
    }

    public final void v(int i) {
        this.u = i;
    }

    public void w() {
        lyk lykVar = this.a;
        lyk lykVar2 = this.c;
        float f = lykVar2.a;
        lyk lykVar3 = this.b;
        lykVar.d(f - lykVar3.a, lykVar2.b - lykVar3.b);
    }

    public void x() {
        r01 r01Var;
        RectF rectF = this.i;
        if (rectF == null || rectF.isEmpty() || (r01Var = this.g) == null || r01Var.r() != 0) {
            return;
        }
        RectF rectF2 = this.i;
        float f = rectF2.left;
        float f2 = rectF2.right;
        float f3 = rectF2.top;
        float f4 = rectF2.bottom;
        lyk lykVar = this.a;
        float f5 = lykVar.a;
        if (f5 < f) {
            this.f.a = f - f5;
        } else if (f5 > f2) {
            this.f.a = f2 - f5;
        }
        float f6 = lykVar.b;
        if (f6 < f3) {
            this.f.b = f3 - f6;
        } else if (f6 > f4) {
            this.f.b = f4 - f6;
        }
        float f7 = this.n * 6.2831855f;
        this.f.b(this.r * f7 * f7 * 1.0f);
    }

    public boolean y(r01 r01Var) {
        RectF rectF = this.h;
        if (rectF == null || rectF.isEmpty()) {
            return false;
        }
        this.g = r01Var;
        if (this.i == null) {
            this.i = new RectF();
        }
        RectF rectF2 = this.i;
        RectF rectF3 = this.h;
        float f = rectF3.left;
        lyk lykVar = this.d;
        float f2 = lykVar.a;
        float f3 = rectF3.top;
        float f4 = lykVar.b;
        rectF2.set(f + f2, f3 + f4, rectF3.right - (this.o - f2), rectF3.bottom - (this.p - f4));
        return true;
    }
}
