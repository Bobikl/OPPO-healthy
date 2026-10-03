package com.oplus.aiunit.vision;

import com.oplus.anim.EffectiveAnimationDrawable;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public class myg implements k84 {
    public final String a;
    public final List<k84> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f14268c;

    public myg(String str, List<k84> list, boolean z) {
        this.a = str;
        this.b = list;
        this.f14268c = z;
    }

    @Override // com.oplus.aiunit.vision.k84
    public d74 a(EffectiveAnimationDrawable effectiveAnimationDrawable, wg6 wg6Var, com.oplus.anim.model.layer.a aVar) {
        return new i74(effectiveAnimationDrawable, aVar, this, wg6Var);
    }

    public List<k84> b() {
        return this.b;
    }

    public String c() {
        return this.a;
    }

    public boolean d() {
        return this.f14268c;
    }

    public String toString() {
        return "ShapeGroup{name='" + this.a + "' Shapes: " + Arrays.toString(this.b.toArray()) + '}';
    }
}
