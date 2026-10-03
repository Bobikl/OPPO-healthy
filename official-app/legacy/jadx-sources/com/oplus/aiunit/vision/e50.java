package com.oplus.aiunit.vision;

import android.graphics.PointF;
import androidx.annotation.Nullable;
import com.oplus.anim.EffectiveAnimationDrawable;

/* JADX INFO: loaded from: classes19.dex */
public class e50 implements k84 {

    @Nullable
    public final k40 a;

    @Nullable
    public final i50<PointF, PointF> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final q40 f10785c;

    @Nullable
    public final e40 d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public final i40 f10786e;

    @Nullable
    public final e40 f;

    @Nullable
    public final e40 g;

    @Nullable
    public final e40 h;

    @Nullable
    public final e40 i;

    public e50() {
        this(null, null, null, null, null, null, null, null, null);
    }

    @Override // com.oplus.aiunit.vision.k84
    @Nullable
    public d74 a(EffectiveAnimationDrawable effectiveAnimationDrawable, wg6 wg6Var, com.oplus.anim.model.layer.a aVar) {
        return null;
    }

    public u9k b() {
        return new u9k(this);
    }

    @Nullable
    public k40 c() {
        return this.a;
    }

    @Nullable
    public e40 d() {
        return this.i;
    }

    @Nullable
    public i40 e() {
        return this.f10786e;
    }

    @Nullable
    public i50<PointF, PointF> f() {
        return this.b;
    }

    @Nullable
    public e40 g() {
        return this.d;
    }

    @Nullable
    public q40 h() {
        return this.f10785c;
    }

    @Nullable
    public e40 i() {
        return this.f;
    }

    @Nullable
    public e40 j() {
        return this.g;
    }

    @Nullable
    public e40 k() {
        return this.h;
    }

    public e50(@Nullable k40 k40Var, @Nullable i50<PointF, PointF> i50Var, @Nullable q40 q40Var, @Nullable e40 e40Var, @Nullable i40 i40Var, @Nullable e40 e40Var2, @Nullable e40 e40Var3, @Nullable e40 e40Var4, @Nullable e40 e40Var5) {
        this.a = k40Var;
        this.b = i50Var;
        this.f10785c = q40Var;
        this.d = e40Var;
        this.f10786e = i40Var;
        this.h = e40Var2;
        this.i = e40Var3;
        this.f = e40Var4;
        this.g = e40Var5;
    }
}
