package com.oplus.aiunit.vision;

import android.graphics.PointF;
import com.oplus.anim.EffectiveAnimationDrawable;

/* JADX INFO: loaded from: classes19.dex */
public class fjf implements k84 {
    public final String a;
    public final i50<PointF, PointF> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i50<PointF, PointF> f11402c;
    public final e40 d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f11403e;

    public fjf(String str, i50<PointF, PointF> i50Var, i50<PointF, PointF> i50Var2, e40 e40Var, boolean z) {
        this.a = str;
        this.b = i50Var;
        this.f11402c = i50Var2;
        this.d = e40Var;
        this.f11403e = z;
    }

    @Override // com.oplus.aiunit.vision.k84
    public d74 a(EffectiveAnimationDrawable effectiveAnimationDrawable, wg6 wg6Var, com.oplus.anim.model.layer.a aVar) {
        return new djf(effectiveAnimationDrawable, aVar, this);
    }

    public e40 b() {
        return this.d;
    }

    public String c() {
        return this.a;
    }

    public i50<PointF, PointF> d() {
        return this.b;
    }

    public i50<PointF, PointF> e() {
        return this.f11402c;
    }

    public boolean f() {
        return this.f11403e;
    }

    public String toString() {
        return "RectangleShape{position=" + this.b + ", size=" + this.f11402c + '}';
    }
}
