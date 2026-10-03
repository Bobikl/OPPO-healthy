package com.oplus.aiunit.vision;

import android.graphics.PointF;
import com.airbnb.lottie.LottieDrawable;

/* JADX INFO: loaded from: classes12.dex */
public class gjf implements l84 {
    public final String a;
    public final j50<PointF, PointF> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j50<PointF, PointF> f11787c;
    public final f40 d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f11788e;

    public gjf(String str, j50<PointF, PointF> j50Var, j50<PointF, PointF> j50Var2, f40 f40Var, boolean z) {
        this.a = str;
        this.b = j50Var;
        this.f11787c = j50Var2;
        this.d = f40Var;
        this.f11788e = z;
    }

    @Override // com.oplus.aiunit.vision.l84
    public e74 a(LottieDrawable lottieDrawable, k9b k9bVar, com.airbnb.lottie.model.layer.a aVar) {
        return new ejf(lottieDrawable, aVar, this);
    }

    public f40 b() {
        return this.d;
    }

    public String c() {
        return this.a;
    }

    public j50<PointF, PointF> d() {
        return this.b;
    }

    public j50<PointF, PointF> e() {
        return this.f11787c;
    }

    public boolean f() {
        return this.f11788e;
    }

    public String toString() {
        return "RectangleShape{position=" + this.b + ", size=" + this.f11787c + '}';
    }
}
