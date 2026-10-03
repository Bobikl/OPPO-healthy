package com.oplus.aiunit.vision;

import com.badlogic.gdx.graphics.Texture;

/* JADX INFO: loaded from: classes13.dex */
public class uki extends xtj {
    public final float[] h;
    public final mk3 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f17510j;
    public float k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f17511l;
    public float m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f17512n;
    public float o;
    public float p;
    public float q;
    public float r;
    public float s;
    public boolean t;

    public uki() {
        this.h = new float[20];
        this.i = new mk3(1.0f, 1.0f, 1.0f, 1.0f);
        this.f17510j = mk3.WHITE_FLOAT_BITS;
        this.r = 1.0f;
        this.s = 1.0f;
        this.t = true;
        y(1.0f, 1.0f, 1.0f, 1.0f);
    }

    public void A(float f, float f2) {
        this.o = f;
        this.p = f2;
        this.t = true;
    }

    public void B() {
        this.o = this.m / 2.0f;
        this.p = this.f17512n / 2.0f;
        this.t = true;
    }

    public void C(float f, float f2) {
        this.k = f;
        this.f17511l = f2;
        if (this.t) {
            return;
        }
        if (this.q != 0.0f || this.r != 1.0f || this.s != 1.0f) {
            this.t = true;
            return;
        }
        float f3 = this.m + f;
        float f4 = this.f17512n + f2;
        float[] fArr = this.h;
        fArr[0] = f;
        fArr[1] = f2;
        fArr[5] = f;
        fArr[6] = f4;
        fArr[10] = f3;
        fArr[11] = f4;
        fArr[15] = f3;
        fArr[16] = f2;
    }

    public void D(float f) {
        this.q = f;
        this.t = true;
    }

    public void E(float f, float f2) {
        this.m = f;
        this.f17512n = f2;
        if (this.t) {
            return;
        }
        if (this.q != 0.0f || this.r != 1.0f || this.s != 1.0f) {
            this.t = true;
            return;
        }
        float f3 = this.k;
        float f4 = f + f3;
        float f5 = this.f17511l;
        float f6 = f2 + f5;
        float[] fArr = this.h;
        fArr[0] = f3;
        fArr[1] = f5;
        fArr[5] = f3;
        fArr[6] = f6;
        fArr[10] = f4;
        fArr[11] = f6;
        fArr[15] = f4;
        fArr[16] = f5;
    }

    public void F(float f) {
        this.k = f;
        if (this.t) {
            return;
        }
        if (this.q != 0.0f || this.r != 1.0f || this.s != 1.0f) {
            this.t = true;
            return;
        }
        float f2 = this.m + f;
        float[] fArr = this.h;
        fArr[0] = f;
        fArr[5] = f;
        fArr[10] = f2;
        fArr[15] = f2;
    }

    public void G(float f) {
        this.f17511l = f;
        if (this.t) {
            return;
        }
        if (this.q != 0.0f || this.r != 1.0f || this.s != 1.0f) {
            this.t = true;
            return;
        }
        float f2 = this.f17512n + f;
        float[] fArr = this.h;
        fArr[1] = f;
        fArr[6] = f2;
        fArr[11] = f2;
        fArr[16] = f;
    }

    public void H(float f, float f2) {
        this.k += f;
        this.f17511l += f2;
        if (this.t) {
            return;
        }
        if (this.q != 0.0f || this.r != 1.0f || this.s != 1.0f) {
            this.t = true;
            return;
        }
        float[] fArr = this.h;
        fArr[0] = fArr[0] + f;
        fArr[1] = fArr[1] + f2;
        fArr[5] = fArr[5] + f;
        fArr[6] = fArr[6] + f2;
        fArr[10] = fArr[10] + f;
        fArr[11] = fArr[11] + f2;
        fArr[15] = fArr[15] + f;
        fArr[16] = fArr[16] + f2;
    }

    @Override // com.oplus.aiunit.vision.xtj
    public void g(float f, float f2, float f3, float f4) {
        super.g(f, f2, f3, f4);
        float[] fArr = this.h;
        fArr[3] = f;
        fArr[4] = f4;
        fArr[8] = f;
        fArr[9] = f2;
        fArr[13] = f3;
        fArr[14] = f2;
        fArr[18] = f3;
        fArr[19] = f4;
    }

    public void k(fc1 fc1Var) {
        fc1Var.j(this.a, o(), 0, 20);
    }

    public float l() {
        return this.f17512n;
    }

    public float m() {
        return this.o;
    }

    public float n() {
        return this.p;
    }

    public float[] o() {
        if (this.t) {
            this.t = false;
            float[] fArr = this.h;
            float f = -this.o;
            float f2 = -this.p;
            float f3 = this.m + f;
            float f4 = this.f17512n + f2;
            float f5 = this.k - f;
            float f6 = this.f17511l - f2;
            float f7 = this.r;
            if (f7 != 1.0f || this.s != 1.0f) {
                f *= f7;
                float f8 = this.s;
                f2 *= f8;
                f3 *= f7;
                f4 *= f8;
            }
            float f9 = this.q;
            if (f9 != 0.0f) {
                float f10 = onb.f(f9);
                float fQ = onb.q(this.q);
                float f11 = f * f10;
                float f12 = f * fQ;
                float f13 = f2 * f10;
                float f14 = f3 * f10;
                float f15 = f10 * f4;
                float f16 = f4 * fQ;
                float f17 = (f11 - (f2 * fQ)) + f5;
                float f18 = f13 + f12 + f6;
                fArr[0] = f17;
                fArr[1] = f18;
                float f19 = (f11 - f16) + f5;
                float f20 = f12 + f15 + f6;
                fArr[5] = f19;
                fArr[6] = f20;
                float f21 = (f14 - f16) + f5;
                float f22 = f15 + (f3 * fQ) + f6;
                fArr[10] = f21;
                fArr[11] = f22;
                fArr[15] = f17 + (f21 - f19);
                fArr[16] = f22 - (f20 - f18);
            } else {
                float f23 = f + f5;
                float f24 = f2 + f6;
                float f25 = f3 + f5;
                float f26 = f4 + f6;
                fArr[0] = f23;
                fArr[1] = f24;
                fArr[5] = f23;
                fArr[6] = f26;
                fArr[10] = f25;
                fArr[11] = f26;
                fArr[15] = f25;
                fArr[16] = f24;
            }
        }
        return this.h;
    }

    public float p() {
        return this.m;
    }

    public float q() {
        return this.k;
    }

    public float r() {
        return this.f17511l;
    }

    public void s(boolean z) {
        float[] fArr = this.h;
        if (z) {
            float f = fArr[4];
            fArr[4] = fArr[19];
            fArr[19] = fArr[14];
            fArr[14] = fArr[9];
            fArr[9] = f;
            float f2 = fArr[3];
            fArr[3] = fArr[18];
            fArr[18] = fArr[13];
            fArr[13] = fArr[8];
            fArr[8] = f2;
            return;
        }
        float f3 = fArr[4];
        fArr[4] = fArr[9];
        fArr[9] = fArr[14];
        fArr[14] = fArr[19];
        fArr[19] = f3;
        float f4 = fArr[3];
        fArr[3] = fArr[8];
        fArr[8] = fArr[13];
        fArr[13] = fArr[18];
        fArr[18] = f4;
    }

    public void t(uki ukiVar) {
        if (ukiVar == null) {
            throw new IllegalArgumentException("sprite cannot be null.");
        }
        System.arraycopy(ukiVar.h, 0, this.h, 0, 20);
        this.a = ukiVar.a;
        this.b = ukiVar.b;
        this.f18762c = ukiVar.f18762c;
        this.d = ukiVar.d;
        this.f18763e = ukiVar.f18763e;
        this.k = ukiVar.k;
        this.f17511l = ukiVar.f17511l;
        this.m = ukiVar.m;
        this.f17512n = ukiVar.f17512n;
        this.f = ukiVar.f;
        this.g = ukiVar.g;
        this.o = ukiVar.o;
        this.p = ukiVar.p;
        this.q = ukiVar.q;
        this.r = ukiVar.r;
        this.s = ukiVar.s;
        this.i.e(ukiVar.i);
        this.t = ukiVar.t;
    }

    public void u(float f) {
        mk3 mk3Var = this.i;
        if (mk3Var.d != f) {
            mk3Var.d = f;
            float f2 = mk3Var.f();
            this.f17510j = f2;
            float[] fArr = this.h;
            fArr[2] = f2;
            fArr[7] = f2;
            fArr[12] = f2;
            fArr[17] = f2;
        }
    }

    public void v(float f, float f2, float f3, float f4) {
        this.k = f;
        this.f17511l = f2;
        this.m = f3;
        this.f17512n = f4;
        if (this.t) {
            return;
        }
        if (this.q != 0.0f || this.r != 1.0f || this.s != 1.0f) {
            this.t = true;
            return;
        }
        float f5 = f3 + f;
        float f6 = f4 + f2;
        float[] fArr = this.h;
        fArr[0] = f;
        fArr[1] = f2;
        fArr[5] = f;
        fArr[6] = f6;
        fArr[10] = f5;
        fArr[11] = f6;
        fArr[15] = f5;
        fArr[16] = f2;
    }

    public void w(float f) {
        F(f - (this.m / 2.0f));
    }

    public void x(float f) {
        G(f - (this.f17512n / 2.0f));
    }

    public void y(float f, float f2, float f3, float f4) {
        this.i.d(f, f2, f3, f4);
        float f5 = this.i.f();
        this.f17510j = f5;
        float[] fArr = this.h;
        fArr[2] = f5;
        fArr[7] = f5;
        fArr[12] = f5;
        fArr[17] = f5;
    }

    public void z(mk3 mk3Var) {
        this.i.e(mk3Var);
        float f = mk3Var.f();
        this.f17510j = f;
        float[] fArr = this.h;
        fArr[2] = f;
        fArr[7] = f;
        fArr[12] = f;
        fArr[17] = f;
    }

    public uki(Texture texture) {
        this(texture, 0, 0, texture.E(), texture.B());
    }

    public uki(Texture texture, int i, int i2, int i3, int i4) {
        this.h = new float[20];
        this.i = new mk3(1.0f, 1.0f, 1.0f, 1.0f);
        this.f17510j = mk3.WHITE_FLOAT_BITS;
        this.r = 1.0f;
        this.s = 1.0f;
        this.t = true;
        if (texture != null) {
            this.a = texture;
            h(i, i2, i3, i4);
            y(1.0f, 1.0f, 1.0f, 1.0f);
            E(Math.abs(i3), Math.abs(i4));
            A(this.m / 2.0f, this.f17512n / 2.0f);
            return;
        }
        throw new IllegalArgumentException("texture cannot be null.");
    }

    public uki(xtj xtjVar) {
        this.h = new float[20];
        this.i = new mk3(1.0f, 1.0f, 1.0f, 1.0f);
        this.f17510j = mk3.WHITE_FLOAT_BITS;
        this.r = 1.0f;
        this.s = 1.0f;
        this.t = true;
        i(xtjVar);
        y(1.0f, 1.0f, 1.0f, 1.0f);
        E(xtjVar.c(), xtjVar.b());
        A(this.m / 2.0f, this.f17512n / 2.0f);
    }

    public uki(uki ukiVar) {
        this.h = new float[20];
        this.i = new mk3(1.0f, 1.0f, 1.0f, 1.0f);
        this.f17510j = mk3.WHITE_FLOAT_BITS;
        this.r = 1.0f;
        this.s = 1.0f;
        this.t = true;
        t(ukiVar);
    }
}
