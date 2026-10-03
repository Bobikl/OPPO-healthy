package com.oplus.aiunit.vision;

import android.graphics.PointF;
import androidx.annotation.Nullable;
import java.util.Collections;

/* JADX INFO: loaded from: classes19.dex */
public class f7i extends w51<PointF, PointF> {
    public final PointF i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final PointF f11249j;
    public final w51<Float, Float> k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final w51<Float, Float> f11250l;

    @Nullable
    public mi6<Float> m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Nullable
    public mi6<Float> f11251n;

    public f7i(w51<Float, Float> w51Var, w51<Float, Float> w51Var2) {
        super(Collections.emptyList());
        this.i = new PointF();
        this.f11249j = new PointF();
        this.k = w51Var;
        this.f11250l = w51Var2;
        m(f());
    }

    @Override // com.oplus.aiunit.vision.w51
    public void m(float f) {
        this.k.m(f);
        this.f11250l.m(f);
        this.i.set(this.k.h().floatValue(), this.f11250l.h().floatValue());
        for (int i = 0; i < this.a.size(); i++) {
            this.a.get(i).d();
        }
    }

    @Override // com.oplus.aiunit.vision.w51
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public PointF h() {
        return i(null, 0.0f);
    }

    @Override // com.oplus.aiunit.vision.w51
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public PointF i(xoa<PointF> xoaVar, float f) {
        Float fB;
        xoa<Float> xoaVarB;
        xoa<Float> xoaVarB2;
        Float fB2 = null;
        if (this.m == null || (xoaVarB2 = this.k.b()) == null) {
            fB = null;
        } else {
            float fD = this.k.d();
            Float f2 = xoaVarB2.h;
            mi6<Float> mi6Var = this.m;
            float f3 = xoaVarB2.g;
            fB = mi6Var.b(f3, f2 == null ? f3 : f2.floatValue(), xoaVarB2.b, xoaVarB2.f18704c, f, f, fD);
        }
        if (this.f11251n != null && (xoaVarB = this.f11250l.b()) != null) {
            float fD2 = this.f11250l.d();
            Float f4 = xoaVarB.h;
            mi6<Float> mi6Var2 = this.f11251n;
            float f5 = xoaVarB.g;
            fB2 = mi6Var2.b(f5, f4 == null ? f5 : f4.floatValue(), xoaVarB.b, xoaVarB.f18704c, f, f, fD2);
        }
        if (fB == null) {
            this.f11249j.set(this.i.x, 0.0f);
        } else {
            this.f11249j.set(fB.floatValue(), 0.0f);
        }
        if (fB2 == null) {
            PointF pointF = this.f11249j;
            pointF.set(pointF.x, this.i.y);
        } else {
            PointF pointF2 = this.f11249j;
            pointF2.set(pointF2.x, fB2.floatValue());
        }
        return this.f11249j;
    }

    public void r(@Nullable mi6<Float> mi6Var) {
        mi6<Float> mi6Var2 = this.m;
        if (mi6Var2 != null) {
            mi6Var2.c(null);
        }
        this.m = mi6Var;
        if (mi6Var != null) {
            mi6Var.c(this);
        }
    }

    public void s(@Nullable mi6<Float> mi6Var) {
        mi6<Float> mi6Var2 = this.f11251n;
        if (mi6Var2 != null) {
            mi6Var2.c(null);
        }
        this.f11251n = mi6Var;
        if (mi6Var != null) {
            mi6Var.c(this);
        }
    }
}
