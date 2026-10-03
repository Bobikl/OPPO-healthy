package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes13.dex */
public class mki {
    public static mki defaultConfig = b(40.0d, 7.0d);
    public double a;
    public double b;

    public mki(double d, double d2) {
        this.b = d;
        this.a = d2;
    }

    public static mki a(double d, double d2) {
        r22 r22Var = new r22(d2, d);
        return b(r22Var.f(), r22Var.e());
    }

    public static mki b(double d, double d2) {
        return new mki(qrd.d(d), qrd.a(d2));
    }
}
