package com.oplus.aiunit.vision;

import android.graphics.PointF;
import com.airbnb.lottie.LottieDrawable;

/* JADX INFO: loaded from: classes12.dex */
public class ub3 implements l84 {
    public final String a;
    public final j50<PointF, PointF> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p40 f17400c;
    public final boolean d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f17401e;

    public ub3(String str, j50<PointF, PointF> j50Var, p40 p40Var, boolean z, boolean z2) {
        this.a = str;
        this.b = j50Var;
        this.f17400c = p40Var;
        this.d = z;
        this.f17401e = z2;
    }

    @Override // com.oplus.aiunit.vision.l84
    public e74 a(LottieDrawable lottieDrawable, k9b k9bVar, com.airbnb.lottie.model.layer.a aVar) {
        return new fj6(lottieDrawable, aVar, this);
    }

    public String b() {
        return this.a;
    }

    public j50<PointF, PointF> c() {
        return this.b;
    }

    public p40 d() {
        return this.f17400c;
    }

    public boolean e() {
        return this.f17401e;
    }

    public boolean f() {
        return this.d;
    }
}
