package com.oplus.aiunit.vision;

import android.graphics.Path;
import androidx.annotation.Nullable;
import com.airbnb.lottie.LottieDrawable;

/* JADX INFO: loaded from: classes12.dex */
public class jyg implements l84 {
    public final boolean a;
    public final Path.FillType b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f13086c;

    @Nullable
    public final d40 d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public final j40 f13087e;
    public final boolean f;

    public jyg(String str, boolean z, Path.FillType fillType, @Nullable d40 d40Var, @Nullable j40 j40Var, boolean z2) {
        this.f13086c = str;
        this.a = z;
        this.b = fillType;
        this.d = d40Var;
        this.f13087e = j40Var;
        this.f = z2;
    }

    @Override // com.oplus.aiunit.vision.l84
    public e74 a(LottieDrawable lottieDrawable, k9b k9bVar, com.airbnb.lottie.model.layer.a aVar) {
        return new be7(lottieDrawable, aVar, this);
    }

    @Nullable
    public d40 b() {
        return this.d;
    }

    public Path.FillType c() {
        return this.b;
    }

    public String d() {
        return this.f13086c;
    }

    @Nullable
    public j40 e() {
        return this.f13087e;
    }

    public boolean f() {
        return this.f;
    }

    public String toString() {
        return "ShapeFill{color=, fillEnabled=" + this.a + '}';
    }
}
