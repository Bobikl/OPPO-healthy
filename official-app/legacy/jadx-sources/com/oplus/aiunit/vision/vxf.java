package com.oplus.aiunit.vision;

import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public class vxf extends gj0 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public gj0 f18027l;
    public double m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f18028n;
    public int o;
    public int p;
    public float q;
    public float r;

    public vxf(gj0 gj0Var, double d, String str) {
        this.f18028n = -1;
        this.i = gj0Var.i;
        this.f18027l = gj0Var;
        this.m = d;
        Map<String, String> mapA = y7e.a(str);
        if (mapA.containsKey("origin")) {
            this.f18028n = wxf.s(mapA.get("origin"));
            return;
        }
        if (mapA.containsKey("x")) {
            float[] fArrJ = d4i.j(mapA.get("x"));
            this.o = (int) fArrJ[0];
            this.q = fArrJ[1];
        } else {
            this.o = 3;
            this.q = 0.0f;
        }
        if (!mapA.containsKey("y")) {
            this.p = 3;
            this.r = 0.0f;
        } else {
            float[] fArrJ2 = d4i.j(mapA.get("y"));
            this.p = (int) fArrJ2[0];
            this.r = fArrJ2[1];
        }
    }

    @Override // com.oplus.aiunit.vision.gj0
    public t22 c(rpj rpjVar) {
        return this.f18028n != -1 ? new wxf(this.f18027l.c(rpjVar), this.m, this.f18028n) : new wxf(this.f18027l.c(rpjVar), this.m, this.q * d4i.i(this.o, rpjVar), this.r * d4i.i(this.p, rpjVar));
    }
}
