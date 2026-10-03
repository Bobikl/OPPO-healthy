package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes11.dex */
public class wxf extends t22 {
    public static final int BBC = 8;
    public static final int BBL = 6;
    public static final int BBR = 7;
    public static final int BC = 1;
    public static final int BL = 0;
    public static final int BR = 2;
    public static final int CC = 10;
    public static final int CL = 9;
    public static final int CR = 11;
    public static final int TC = 4;
    public static final int TL = 3;
    public static final int TR = 5;
    public double m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public t22 f18435n;
    public float o;
    public float p;
    public float q;
    public float r;
    public float s;
    public float t;

    public wxf(t22 t22Var, double d, float f, float f2) {
        this.f18435n = t22Var;
        double d2 = (3.141592653589793d * d) / 180.0d;
        this.m = d2;
        this.f16854e = t22Var.f16854e;
        this.f = t22Var.f;
        this.d = t22Var.d;
        double dSin = Math.sin(d2);
        double dCos = Math.cos(this.m);
        double d3 = f;
        double d4 = 1.0d - dCos;
        double d5 = f2;
        this.s = (float) ((d3 * d4) + (d5 * dSin));
        this.t = (float) ((d5 * d4) - (d3 * dSin));
        float f3 = this.f16854e;
        float f4 = this.f;
        float f5 = this.d;
        this.o = ((float) Math.max(((double) (-f3)) * dSin, Math.max(((double) f4) * dSin, Math.max((((double) f5) * dCos) + (((double) f4) * dSin), (((double) f5) * dCos) - (((double) f3) * dSin))))) + this.s;
        float f6 = this.f16854e;
        float f7 = this.f;
        float f8 = this.d;
        this.p = ((float) Math.min(((double) (-f6)) * dSin, Math.min(((double) f7) * dSin, Math.min((((double) f8) * dCos) + (((double) f7) * dSin), (((double) f8) * dCos) - (((double) f6) * dSin))))) + this.s;
        float f9 = this.f16854e;
        float f10 = this.f;
        float f11 = this.d;
        this.q = (float) Math.max(((double) f9) * dCos, Math.max(((double) (-f10)) * dCos, Math.max((((double) f11) * dSin) - (((double) f10) * dCos), (((double) f11) * dSin) + (((double) f9) * dCos))));
        float f12 = this.f16854e;
        float f13 = this.f;
        float f14 = this.d;
        float fMin = (float) Math.min(((double) f12) * dCos, Math.min(((double) (-f13)) * dCos, Math.min((((double) f14) * dSin) - (((double) f13) * dCos), (((double) f14) * dSin) + (((double) f12) * dCos))));
        this.r = fMin;
        this.d = this.o - this.p;
        float f15 = this.q;
        float f16 = this.t;
        this.f16854e = f15 + f16;
        this.f = (-fMin) - f16;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static ume r(t22 t22Var, int i) {
        ume umeVar = new ume(0.0f, -t22Var.f);
        switch (i) {
            case 0:
                umeVar.a = 0.0f;
                umeVar.b = -t22Var.f;
                return umeVar;
            case 1:
                umeVar.a = t22Var.d / 2.0f;
                umeVar.b = -t22Var.f;
                return umeVar;
            case 2:
                umeVar.a = t22Var.d;
                umeVar.b = -t22Var.f;
                return umeVar;
            case 3:
                umeVar.a = 0.0f;
                umeVar.b = t22Var.f16854e;
                return umeVar;
            case 4:
                umeVar.a = t22Var.d / 2.0f;
                umeVar.b = t22Var.f16854e;
                return umeVar;
            case 5:
                umeVar.a = t22Var.d;
                umeVar.b = t22Var.f16854e;
                return umeVar;
            case 6:
                umeVar.a = 0.0f;
                umeVar.b = 0.0f;
                return umeVar;
            case 7:
                umeVar.a = t22Var.d;
                umeVar.b = 0.0f;
                return umeVar;
            case 8:
                umeVar.a = t22Var.d / 2.0f;
                umeVar.b = 0.0f;
                return umeVar;
            case 9:
                umeVar.a = 0.0f;
                umeVar.b = (t22Var.f16854e - t22Var.f) / 2.0f;
                return umeVar;
            case 10:
                umeVar.a = t22Var.d / 2.0f;
                umeVar.b = (t22Var.f16854e - t22Var.f) / 2.0f;
                return umeVar;
            case 11:
                umeVar.a = t22Var.d;
                umeVar.b = (t22Var.f16854e - t22Var.f) / 2.0f;
                return umeVar;
            default:
                return umeVar;
        }
    }

    public static int s(String str) {
        if (str == null || str.length() == 0) {
            return 6;
        }
        if (str.length() == 1) {
            str = str + "c";
        }
        if (str.equals("bl") || str.equals("lb")) {
            return 0;
        }
        if (str.equals("bc") || str.equals(oea.CALLBACK)) {
            return 1;
        }
        if (str.equals("br") || str.equals("rb")) {
            return 2;
        }
        if (str.equals("cl") || str.equals("lc")) {
            return 9;
        }
        if (str.equals("cc")) {
            return 10;
        }
        if (str.equals("cr") || str.equals("cr")) {
            return 11;
        }
        if (str.equals("tl") || str.equals("lt")) {
            return 3;
        }
        if (str.equals("tc") || str.equals("ct")) {
            return 4;
        }
        if (str.equals("tr") || str.equals("rt")) {
            return 5;
        }
        if (str.equals("Bl") || str.equals("lB")) {
            return 6;
        }
        if (str.equals("Bc") || str.equals("cB")) {
            return 8;
        }
        return (str.equals("Br") || str.equals("rB")) ? 7 : 6;
    }

    @Override // com.oplus.aiunit.vision.t22
    public void c(tb8 tb8Var, float f, float f2) {
        d(tb8Var, f, f2);
        this.f18435n.e(tb8Var, f, f2, true);
        float f3 = f2 - this.t;
        float f4 = f + (this.s - this.p);
        double d = f4;
        double d2 = f3;
        tb8Var.r(-this.m, d, d2);
        this.f18435n.c(tb8Var, f4, f3);
        this.f18435n.e(tb8Var, f4, f3, true);
        tb8Var.r(this.m, d, d2);
    }

    @Override // com.oplus.aiunit.vision.t22
    public int i() {
        return this.f18435n.i();
    }

    public wxf(t22 t22Var, double d, ume umeVar) {
        this(t22Var, d, umeVar.a, umeVar.b);
    }

    public wxf(t22 t22Var, double d, int i) {
        this(t22Var, d, r(t22Var, i));
    }
}
