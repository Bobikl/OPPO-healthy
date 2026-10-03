package com.oplus.aiunit.vision;

import com.airbnb.lottie.LottieDrawable;

/* JADX INFO: loaded from: classes12.dex */
public class yyg implements l84 {
    public final String a;
    public final int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t40 f19200c;
    public final boolean d;

    public yyg(String str, int i, t40 t40Var, boolean z) {
        this.a = str;
        this.b = i;
        this.f19200c = t40Var;
        this.d = z;
    }

    @Override // com.oplus.aiunit.vision.l84
    public e74 a(LottieDrawable lottieDrawable, k9b k9bVar, com.airbnb.lottie.model.layer.a aVar) {
        return new dyg(lottieDrawable, aVar, this);
    }

    public String b() {
        return this.a;
    }

    public t40 c() {
        return this.f19200c;
    }

    public boolean d() {
        return this.d;
    }

    public String toString() {
        return "ShapePath{name=" + this.a + ", index=" + this.b + '}';
    }
}
