package com.oplus.aiunit.vision;

import android.graphics.PointF;
import com.oplus.anim.EffectiveAnimationDrawable;

/* JADX INFO: loaded from: classes19.dex */
public class tb3 implements k84 {
    public final String a;
    public final i50<PointF, PointF> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o40 f16953c;
    public final boolean d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f16954e;

    public tb3(String str, i50<PointF, PointF> i50Var, o40 o40Var, boolean z, boolean z2) {
        this.a = str;
        this.b = i50Var;
        this.f16953c = o40Var;
        this.d = z;
        this.f16954e = z2;
    }

    @Override // com.oplus.aiunit.vision.k84
    public d74 a(EffectiveAnimationDrawable effectiveAnimationDrawable, wg6 wg6Var, com.oplus.anim.model.layer.a aVar) {
        return new ej6(effectiveAnimationDrawable, aVar, this);
    }

    public String b() {
        return this.a;
    }

    public i50<PointF, PointF> c() {
        return this.b;
    }

    public o40 d() {
        return this.f16953c;
    }

    public boolean e() {
        return this.f16954e;
    }

    public boolean f() {
        return this.d;
    }
}
