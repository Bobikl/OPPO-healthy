package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes11.dex */
public class z0g extends gj0 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f19213l;
    public int m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f19214n;
    public float o;
    public float p;
    public float q;

    public z0g(int i, float f, int i2, float f2, int i3, float f3) {
        this.f19213l = i;
        this.m = i2;
        this.f19214n = i3;
        this.o = f;
        this.p = f2;
        this.q = f3;
    }

    @Override // com.oplus.aiunit.vision.gj0
    public t22 c(rpj rpjVar) {
        return new bf9(this.p * d4i.i(this.m, rpjVar), this.o * d4i.i(this.f19213l, rpjVar), this.q * d4i.i(this.f19214n, rpjVar));
    }
}
