package com.oplus.aiunit.vision;

import android.graphics.PointF;
import androidx.annotation.Nullable;
import java.util.Collections;

/* JADX INFO: loaded from: classes12.dex */
public class g7i extends v51<PointF, PointF> {
    public final PointF i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final PointF f11663j;
    public final v51<Float, Float> k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final v51<Float, Float> f11664l;

    @Nullable
    public mbb<Float> m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Nullable
    public mbb<Float> f11665n;

    public g7i(v51<Float, Float> v51Var, v51<Float, Float> v51Var2) {
        super(Collections.emptyList());
        this.i = new PointF();
        this.f11663j = new PointF();
        this.k = v51Var;
        this.f11664l = v51Var2;
        n(f());
    }

    @Override // com.oplus.aiunit.vision.v51
    public void n(float f) {
        this.k.n(f);
        this.f11664l.n(f);
        this.i.set(this.k.h().floatValue(), this.f11664l.h().floatValue());
        for (int i = 0; i < this.a.size(); i++) {
            this.a.get(i).d();
        }
    }

    @Override // com.oplus.aiunit.vision.v51
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public PointF h() {
        return i(null, 0.0f);
    }

    @Override // com.oplus.aiunit.vision.v51
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public PointF i(yoa<PointF> yoaVar, float f) {
        Float fB;
        yoa<Float> yoaVarB;
        yoa<Float> yoaVarB2;
        Float fB2 = null;
        if (this.m == null || (yoaVarB2 = this.k.b()) == null) {
            fB = null;
        } else {
            float fD = this.k.d();
            Float f2 = yoaVarB2.h;
            mbb<Float> mbbVar = this.m;
            float f3 = yoaVarB2.g;
            fB = mbbVar.b(f3, f2 == null ? f3 : f2.floatValue(), yoaVarB2.b, yoaVarB2.f19086c, f, f, fD);
        }
        if (this.f11665n != null && (yoaVarB = this.f11664l.b()) != null) {
            float fD2 = this.f11664l.d();
            Float f4 = yoaVarB.h;
            mbb<Float> mbbVar2 = this.f11665n;
            float f5 = yoaVarB.g;
            fB2 = mbbVar2.b(f5, f4 == null ? f5 : f4.floatValue(), yoaVarB.b, yoaVarB.f19086c, f, f, fD2);
        }
        if (fB == null) {
            this.f11663j.set(this.i.x, 0.0f);
        } else {
            this.f11663j.set(fB.floatValue(), 0.0f);
        }
        if (fB2 == null) {
            PointF pointF = this.f11663j;
            pointF.set(pointF.x, this.i.y);
        } else {
            PointF pointF2 = this.f11663j;
            pointF2.set(pointF2.x, fB2.floatValue());
        }
        return this.f11663j;
    }

    public void s(@Nullable mbb<Float> mbbVar) {
        mbb<Float> mbbVar2 = this.m;
        if (mbbVar2 != null) {
            mbbVar2.c(null);
        }
        this.m = mbbVar;
        if (mbbVar != null) {
            mbbVar.c(this);
        }
    }

    public void t(@Nullable mbb<Float> mbbVar) {
        mbb<Float> mbbVar2 = this.f11665n;
        if (mbbVar2 != null) {
            mbbVar2.c(null);
        }
        this.f11665n = mbbVar;
        if (mbbVar != null) {
            mbbVar.c(this);
        }
    }
}
