package com.oplus.aiunit.vision;

import android.graphics.RectF;

/* JADX INFO: loaded from: classes8.dex */
public class bv1 {
    public static final int BODY_PROPERTY_ALPHA = 4;
    public static final int BODY_PROPERTY_CUSTOM = 0;
    public static final int BODY_PROPERTY_GROUND = 5;
    public static final int BODY_PROPERTY_POSITION = 1;
    public static final int BODY_PROPERTY_ROTATION = 3;
    public static final int BODY_PROPERTY_SCALE = 2;
    public static final int BODY_TYPE_DYNAMIC = 1;
    public static final int BODY_TYPE_STATIC = 0;
    public final nuk a;
    public final nuk b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final nuk f9864c;
    public final nuk d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final nuk f9865e;
    public final nuk f;
    public d01 g;
    public RectF h;
    public RectF i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public bv1 f9866j;
    public bv1 k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ve6 f9867l;
    public boolean m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f9868n;
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

    public bv1(nuk nukVar, int i, int i2, float f, float f2) {
        nuk nukVar2 = new nuk();
        this.a = nukVar2;
        this.b = new nuk();
        this.f9864c = new nuk();
        this.d = new nuk(0.0f, 0.0f);
        this.f9865e = new nuk();
        this.f = new nuk();
        this.g = null;
        this.m = false;
        this.f9868n = 50.0f;
        this.w = false;
        this.x = false;
        this.y = "";
        v(i);
        s(i2);
        nukVar2.e(nukVar);
        this.q = 1.0f;
        t(f, f2);
        this.w = true;
        this.f9867l = null;
        this.f9866j = null;
        this.k = null;
    }

    public void a(d01 d01Var) {
        RectF rectF = this.h;
        if (rectF == null || rectF.isEmpty() || this.g != d01Var) {
            return;
        }
        this.h = null;
        this.i = null;
        k(50.0f);
    }

    public void b(d01 d01Var) {
        d01 d01Var2;
        RectF rectF = this.i;
        if (rectF == null || (d01Var2 = this.g) == null || d01Var2 != d01Var) {
            return;
        }
        rectF.setEmpty();
    }

    public final nuk c() {
        return this.d;
    }

    public final nuk d() {
        return this.f9865e;
    }

    public final float e() {
        return this.r;
    }

    public final nuk f() {
        return this.a;
    }

    public int g() {
        return this.v;
    }

    public int h() {
        return this.u;
    }

    public final nuk i() {
        return this.f9864c;
    }

    public final void j() {
        if (this.u == 0) {
            p(1.0f);
            n(0.0f);
            return;
        }
        p(this.o * this.p * this.q);
        n(hr3.a(this.r));
        if (!this.w || this.v == 1) {
            this.b.d(this.o * 0.5f, this.p * 0.5f);
            this.f9864c.e(this.a).a(this.b);
        }
    }

    public void k(float f) {
        this.f9868n = f;
    }

    public void l(boolean z) {
        this.m = z;
    }

    public final void m(float f, float f2) {
        this.d.d(hr3.d(f), hr3.d(f2));
    }

    public final void n(float f) {
        this.t = f;
    }

    public final void o(nuk nukVar) {
        if (this.u == 0) {
            return;
        }
        this.f9865e.e(nukVar);
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
        this.h.set(hr3.d(rectF.left), hr3.d(rectF.top), hr3.d(rectF.right), hr3.d(rectF.bottom));
    }

    public final void r(nuk nukVar) {
        this.a.e(nukVar);
        this.f9864c.e(nukVar).a(this.b);
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
        return "Body{mType=" + this.u + ", mProperty=" + this.v + ", mLinearVelocity=" + this.f9865e + ", mLinearDamping=" + this.t + ", mPosition=" + this.a + ", mHookPosition=" + this.d + ", mOriginActiveRect=" + this.h + ", mActiveRect=" + this.i + ", mMassCenter='" + this.b + ", mWorldCenter='" + this.f9864c + ", mLinearVelocity='" + this.f9865e + ", mForce='" + this.f + ", mWidth='" + this.o + ", mHeight='" + this.p + ", mDensity='" + this.q + ", mMass='" + this.r + ", mInvMass='" + this.s + ", mLinearDamping='" + this.t + ", mType='" + this.u + ", mIsSolved='" + this.x + ", mTag='" + this.y + "}@" + hashCode();
    }

    public void u(String str) {
        this.y = str;
    }

    public final void v(int i) {
        this.u = i;
    }

    public void w() {
        nuk nukVar = this.a;
        nuk nukVar2 = this.f9864c;
        float f = nukVar2.a;
        nuk nukVar3 = this.b;
        nukVar.d(f - nukVar3.a, nukVar2.b - nukVar3.b);
    }

    public void x() {
        d01 d01Var;
        RectF rectF = this.i;
        if (rectF == null || rectF.isEmpty() || (d01Var = this.g) == null || d01Var.r() != 0) {
            return;
        }
        RectF rectF2 = this.i;
        float f = rectF2.left;
        float f2 = rectF2.right;
        float f3 = rectF2.top;
        float f4 = rectF2.bottom;
        nuk nukVar = this.a;
        float f5 = nukVar.a;
        if (f5 < f) {
            this.f.a = f - f5;
        } else if (f5 > f2) {
            this.f.a = f2 - f5;
        }
        float f6 = nukVar.b;
        if (f6 < f3) {
            this.f.b = f3 - f6;
        } else if (f6 > f4) {
            this.f.b = f4 - f6;
        }
        float f7 = this.f9868n * 6.2831855f;
        this.f.b(this.r * f7 * f7 * 1.0f);
    }

    public boolean y(d01 d01Var) {
        RectF rectF = this.h;
        if (rectF == null || rectF.isEmpty()) {
            return false;
        }
        this.g = d01Var;
        if (this.i == null) {
            this.i = new RectF();
        }
        RectF rectF2 = this.i;
        RectF rectF3 = this.h;
        float f = rectF3.left;
        nuk nukVar = this.d;
        float f2 = nukVar.a;
        float f3 = rectF3.top;
        float f4 = nukVar.b;
        rectF2.set(f + f2, f3 + f4, rectF3.right - (this.o - f2), rectF3.bottom - (this.p - f4));
        return true;
    }
}
