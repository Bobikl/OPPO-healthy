package com.oplus.aiunit.vision;

import com.autonavi.amap.mapcore.DPoint;

/* JADX INFO: loaded from: classes12.dex */
public final class vqm {
    public final double a;
    public final double b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final double f17959c;
    public final double d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final double f17960e;
    public final double f;

    public vqm(double d, double d2, double d3, double d4) {
        this.a = d;
        this.b = d3;
        this.f17959c = d2;
        this.d = d4;
        this.f17960e = (d + d2) / 2.0d;
        this.f = (d3 + d4) / 2.0d;
    }

    public final boolean a(double d, double d2) {
        return this.a <= d && d <= this.f17959c && this.b <= d2 && d2 <= this.d;
    }

    public final boolean b(double d, double d2, double d3, double d4) {
        return d < this.f17959c && this.a < d2 && d3 < this.d && this.b < d4;
    }

    public final boolean c(DPoint dPoint) {
        return a(dPoint.x, dPoint.y);
    }

    public final boolean d(vqm vqmVar) {
        return b(vqmVar.a, vqmVar.f17959c, vqmVar.b, vqmVar.d);
    }

    public final boolean e(vqm vqmVar) {
        return vqmVar.a >= this.a && vqmVar.f17959c <= this.f17959c && vqmVar.b >= this.b && vqmVar.d <= this.d;
    }
}
