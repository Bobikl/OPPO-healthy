package com.oplus.aiunit.vision;

import android.graphics.PointF;
import androidx.annotation.FloatRange;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public class eyg {
    public final List<we4> a;
    public PointF b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f11129c;

    public eyg(PointF pointF, boolean z, List<we4> list) {
        this.b = pointF;
        this.f11129c = z;
        this.a = new ArrayList(list);
    }

    public List<we4> a() {
        return this.a;
    }

    public PointF b() {
        return this.b;
    }

    public void c(eyg eygVar, eyg eygVar2, @FloatRange(from = 0.0d, to = 1.0d) float f) {
        if (this.b == null) {
            this.b = new PointF();
        }
        this.f11129c = eygVar.d() || eygVar2.d();
        if (eygVar.a().size() != eygVar2.a().size()) {
            u7b.c("Curves must have the same number of control points. Shape 1: " + eygVar.a().size() + "\tShape 2: " + eygVar2.a().size());
        }
        int iMin = Math.min(eygVar.a().size(), eygVar2.a().size());
        if (this.a.size() < iMin) {
            for (int size = this.a.size(); size < iMin; size++) {
                this.a.add(new we4());
            }
        } else if (this.a.size() > iMin) {
            for (int size2 = this.a.size() - 1; size2 >= iMin; size2--) {
                List<we4> list = this.a;
                list.remove(list.size() - 1);
            }
        }
        PointF pointFB = eygVar.b();
        PointF pointFB2 = eygVar2.b();
        f(l0c.i(pointFB.x, pointFB2.x, f), l0c.i(pointFB.y, pointFB2.y, f));
        for (int size3 = this.a.size() - 1; size3 >= 0; size3--) {
            we4 we4Var = eygVar.a().get(size3);
            we4 we4Var2 = eygVar2.a().get(size3);
            PointF pointFA = we4Var.a();
            PointF pointFB3 = we4Var.b();
            PointF pointFC = we4Var.c();
            PointF pointFA2 = we4Var2.a();
            PointF pointFB4 = we4Var2.b();
            PointF pointFC2 = we4Var2.c();
            this.a.get(size3).d(l0c.i(pointFA.x, pointFA2.x, f), l0c.i(pointFA.y, pointFA2.y, f));
            this.a.get(size3).e(l0c.i(pointFB3.x, pointFB4.x, f), l0c.i(pointFB3.y, pointFB4.y, f));
            this.a.get(size3).f(l0c.i(pointFC.x, pointFC2.x, f), l0c.i(pointFC.y, pointFC2.y, f));
        }
    }

    public boolean d() {
        return this.f11129c;
    }

    public void e(boolean z) {
        this.f11129c = z;
    }

    public void f(float f, float f2) {
        if (this.b == null) {
            this.b = new PointF();
        }
        this.b.set(f, f2);
    }

    public String toString() {
        return "ShapeData{numCurves=" + this.a.size() + "closed=" + this.f11129c + '}';
    }

    public eyg() {
        this.a = new ArrayList();
    }
}
