package com.oplus.aiunit.vision;

import android.graphics.PointF;
import androidx.annotation.Nullable;
import com.airbnb.lottie.LottieDrawable;

/* JADX INFO: loaded from: classes12.dex */
public class f50 implements l84 {

    @Nullable
    public final l40 a;

    @Nullable
    public final j50<PointF, PointF> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final r40 f11220c;

    @Nullable
    public final f40 d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public final j40 f11221e;

    @Nullable
    public final f40 f;

    @Nullable
    public final f40 g;

    @Nullable
    public final f40 h;

    @Nullable
    public final f40 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f11222j;

    public f50() {
        this(null, null, null, null, null, null, null, null, null);
    }

    @Override // com.oplus.aiunit.vision.l84
    @Nullable
    public e74 a(LottieDrawable lottieDrawable, k9b k9bVar, com.airbnb.lottie.model.layer.a aVar) {
        return null;
    }

    public v9k b() {
        return new v9k(this);
    }

    @Nullable
    public l40 c() {
        return this.a;
    }

    @Nullable
    public f40 d() {
        return this.i;
    }

    @Nullable
    public j40 e() {
        return this.f11221e;
    }

    @Nullable
    public j50<PointF, PointF> f() {
        return this.b;
    }

    @Nullable
    public f40 g() {
        return this.d;
    }

    @Nullable
    public r40 h() {
        return this.f11220c;
    }

    @Nullable
    public f40 i() {
        return this.f;
    }

    @Nullable
    public f40 j() {
        return this.g;
    }

    @Nullable
    public f40 k() {
        return this.h;
    }

    public boolean l() {
        return this.f11222j;
    }

    public void m(boolean z) {
        this.f11222j = z;
    }

    public f50(@Nullable l40 l40Var, @Nullable j50<PointF, PointF> j50Var, @Nullable r40 r40Var, @Nullable f40 f40Var, @Nullable j40 j40Var, @Nullable f40 f40Var2, @Nullable f40 f40Var3, @Nullable f40 f40Var4, @Nullable f40 f40Var5) {
        this.f11222j = false;
        this.a = l40Var;
        this.b = j50Var;
        this.f11220c = r40Var;
        this.d = f40Var;
        this.f11221e = j40Var;
        this.h = f40Var2;
        this.i = f40Var3;
        this.f = f40Var4;
        this.g = f40Var5;
    }
}
