package com.oplus.aiunit.vision;

import android.graphics.PointF;
import androidx.annotation.FloatRange;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class fyg {
    public final List<xe4> a;
    public PointF b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f11571c;

    public fyg(PointF pointF, boolean z, List<xe4> list) {
        this.b = pointF;
        this.f11571c = z;
        this.a = new ArrayList(list);
    }

    public List<xe4> a() {
        return this.a;
    }

    public PointF b() {
        return this.b;
    }

    public void c(fyg fygVar, fyg fygVar2, @FloatRange(from = 0.0d, to = 1.0d) float f) {
        if (this.b == null) {
            this.b = new PointF();
        }
        this.f11571c = fygVar.d() || fygVar2.d();
        if (fygVar.a().size() != fygVar2.a().size()) {
            o7b.c("Curves must have the same number of control points. Shape 1: " + fygVar.a().size() + "\tShape 2: " + fygVar2.a().size());
        }
        int iMin = Math.min(fygVar.a().size(), fygVar2.a().size());
        if (this.a.size() < iMin) {
            for (int size = this.a.size(); size < iMin; size++) {
                this.a.add(new xe4());
            }
        } else if (this.a.size() > iMin) {
            for (int size2 = this.a.size() - 1; size2 >= iMin; size2--) {
                List<xe4> list = this.a;
                list.remove(list.size() - 1);
            }
        }
        PointF pointFB = fygVar.b();
        PointF pointFB2 = fygVar2.b();
        f(m0c.i(pointFB.x, pointFB2.x, f), m0c.i(pointFB.y, pointFB2.y, f));
        for (int size3 = this.a.size() - 1; size3 >= 0; size3--) {
            xe4 xe4Var = fygVar.a().get(size3);
            xe4 xe4Var2 = fygVar2.a().get(size3);
            PointF pointFA = xe4Var.a();
            PointF pointFB3 = xe4Var.b();
            PointF pointFC = xe4Var.c();
            PointF pointFA2 = xe4Var2.a();
            PointF pointFB4 = xe4Var2.b();
            PointF pointFC2 = xe4Var2.c();
            this.a.get(size3).d(m0c.i(pointFA.x, pointFA2.x, f), m0c.i(pointFA.y, pointFA2.y, f));
            this.a.get(size3).e(m0c.i(pointFB3.x, pointFB4.x, f), m0c.i(pointFB3.y, pointFB4.y, f));
            this.a.get(size3).f(m0c.i(pointFC.x, pointFC2.x, f), m0c.i(pointFC.y, pointFC2.y, f));
        }
    }

    public boolean d() {
        return this.f11571c;
    }

    public void e(boolean z) {
        this.f11571c = z;
    }

    public void f(float f, float f2) {
        if (this.b == null) {
            this.b = new PointF();
        }
        this.b.set(f, f2);
    }

    public String toString() {
        return "ShapeData{numCurves=" + this.a.size() + "closed=" + this.f11571c + '}';
    }

    public fyg() {
        this.a = new ArrayList();
    }
}
