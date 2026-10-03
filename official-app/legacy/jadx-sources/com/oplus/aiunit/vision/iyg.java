package com.oplus.aiunit.vision;

import android.graphics.Path;
import androidx.annotation.Nullable;
import com.oplus.anim.EffectiveAnimationDrawable;

/* JADX INFO: loaded from: classes19.dex */
public class iyg implements k84 {
    public final boolean a;
    public final Path.FillType b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f12691c;

    @Nullable
    public final c40 d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public final i40 f12692e;
    public final boolean f;

    public iyg(String str, boolean z, Path.FillType fillType, @Nullable c40 c40Var, @Nullable i40 i40Var, boolean z2) {
        this.f12691c = str;
        this.a = z;
        this.b = fillType;
        this.d = c40Var;
        this.f12692e = i40Var;
        this.f = z2;
    }

    @Override // com.oplus.aiunit.vision.k84
    public d74 a(EffectiveAnimationDrawable effectiveAnimationDrawable, wg6 wg6Var, com.oplus.anim.model.layer.a aVar) {
        return new ae7(effectiveAnimationDrawable, aVar, this);
    }

    @Nullable
    public c40 b() {
        return this.d;
    }

    public Path.FillType c() {
        return this.b;
    }

    public String d() {
        return this.f12691c;
    }

    @Nullable
    public i40 e() {
        return this.f12692e;
    }

    public boolean f() {
        return this.f;
    }

    public String toString() {
        return "ShapeFill{color=, fillEnabled=" + this.a + '}';
    }
}
