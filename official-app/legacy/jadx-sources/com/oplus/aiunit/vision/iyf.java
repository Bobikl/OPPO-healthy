package com.oplus.aiunit.vision;

import androidx.annotation.Nullable;
import com.oplus.anim.EffectiveAnimationDrawable;

/* JADX INFO: loaded from: classes19.dex */
public class iyf implements k84 {
    public final String a;
    public final i50<Float, Float> b;

    public iyf(String str, i50<Float, Float> i50Var) {
        this.a = str;
        this.b = i50Var;
    }

    @Override // com.oplus.aiunit.vision.k84
    @Nullable
    public d74 a(EffectiveAnimationDrawable effectiveAnimationDrawable, wg6 wg6Var, com.oplus.anim.model.layer.a aVar) {
        return new kyf(effectiveAnimationDrawable, aVar, this);
    }

    public i50<Float, Float> b() {
        return this.b;
    }

    public String c() {
        return this.a;
    }
}
