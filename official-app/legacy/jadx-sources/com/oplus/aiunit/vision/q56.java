package com.oplus.aiunit.vision;

import android.graphics.Color;
import android.graphics.Paint;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes19.dex */
public class q56 implements w51.b {
    public final w51.b a;
    public final w51<Integer, Integer> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w51<Float, Float> f15630c;
    public final w51<Float, Float> d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final w51<Float, Float> f15631e;
    public final w51<Float, Float> f;
    public boolean g = true;

    public class a extends mi6<Float> {
        public final /* synthetic */ mi6 d;

        public a(mi6 mi6Var) {
            this.d = mi6Var;
        }

        @Override // com.oplus.aiunit.vision.mi6
        @Nullable
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public Float a(fi6<Float> fi6Var) {
            Float f = (Float) this.d.a(fi6Var);
            if (f == null) {
                return null;
            }
            return Float.valueOf(f.floatValue() * 2.55f);
        }
    }

    public q56(w51.b bVar, com.oplus.anim.model.layer.a aVar, m56 m56Var) {
        this.a = bVar;
        w51<Integer, Integer> w51VarA = m56Var.a().a();
        this.b = w51VarA;
        w51VarA.a(this);
        aVar.i(w51VarA);
        w51<Float, Float> w51VarA2 = m56Var.d().a();
        this.f15630c = w51VarA2;
        w51VarA2.a(this);
        aVar.i(w51VarA2);
        w51<Float, Float> w51VarA3 = m56Var.b().a();
        this.d = w51VarA3;
        w51VarA3.a(this);
        aVar.i(w51VarA3);
        w51<Float, Float> w51VarA4 = m56Var.c().a();
        this.f15631e = w51VarA4;
        w51VarA4.a(this);
        aVar.i(w51VarA4);
        w51<Float, Float> w51VarA5 = m56Var.e().a();
        this.f = w51VarA5;
        w51VarA5.a(this);
        aVar.i(w51VarA5);
    }

    public void a(Paint paint) {
        if (this.g) {
            this.g = false;
            double dFloatValue = ((double) this.d.h().floatValue()) * 0.017453292519943295d;
            float fFloatValue = this.f15631e.h().floatValue();
            float fSin = ((float) Math.sin(dFloatValue)) * fFloatValue;
            float fCos = ((float) Math.cos(dFloatValue + 3.141592653589793d)) * fFloatValue;
            int iIntValue = this.b.h().intValue();
            paint.setShadowLayer(this.f.h().floatValue(), fSin, fCos, Color.argb(Math.round(this.f15630c.h().floatValue()), Color.red(iIntValue), Color.green(iIntValue), Color.blue(iIntValue)));
        }
    }

    public void b(@Nullable mi6<Integer> mi6Var) {
        this.b.n(mi6Var);
    }

    public void c(@Nullable mi6<Float> mi6Var) {
        this.d.n(mi6Var);
    }

    @Override // com.oplus.aiunit.vision.w51.b
    public void d() {
        this.g = true;
        this.a.d();
    }

    public void e(@Nullable mi6<Float> mi6Var) {
        this.f15631e.n(mi6Var);
    }

    public void f(@Nullable mi6<Float> mi6Var) {
        if (mi6Var == null) {
            this.f15630c.n(null);
        } else {
            this.f15630c.n(new a(mi6Var));
        }
    }

    public void g(@Nullable mi6<Float> mi6Var) {
        this.f.n(mi6Var);
    }
}
