package com.oplus.aiunit.vision;

import com.oplus.anim.EffectiveAnimationDrawable;

/* JADX INFO: loaded from: classes19.dex */
public class xyg implements k84 {
    public final String a;
    public final int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final s40 f18801c;
    public final boolean d;

    public xyg(String str, int i, s40 s40Var, boolean z) {
        this.a = str;
        this.b = i;
        this.f18801c = s40Var;
        this.d = z;
    }

    @Override // com.oplus.aiunit.vision.k84
    public d74 a(EffectiveAnimationDrawable effectiveAnimationDrawable, wg6 wg6Var, com.oplus.anim.model.layer.a aVar) {
        return new cyg(effectiveAnimationDrawable, aVar, this);
    }

    public String b() {
        return this.a;
    }

    public s40 c() {
        return this.f18801c;
    }

    public boolean d() {
        return this.d;
    }

    public String toString() {
        return "ShapePath{name=" + this.a + ", index=" + this.b + '}';
    }
}
