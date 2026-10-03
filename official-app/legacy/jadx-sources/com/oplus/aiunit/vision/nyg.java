package com.oplus.aiunit.vision;

import com.airbnb.lottie.LottieDrawable;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class nyg implements l84 {
    public final String a;
    public final List<l84> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f14693c;

    public nyg(String str, List<l84> list, boolean z) {
        this.a = str;
        this.b = list;
        this.f14693c = z;
    }

    @Override // com.oplus.aiunit.vision.l84
    public e74 a(LottieDrawable lottieDrawable, k9b k9bVar, com.airbnb.lottie.model.layer.a aVar) {
        return new j74(lottieDrawable, aVar, this, k9bVar);
    }

    public List<l84> b() {
        return this.b;
    }

    public String c() {
        return this.a;
    }

    public boolean d() {
        return this.f14693c;
    }

    public String toString() {
        return "ShapeGroup{name='" + this.a + "' Shapes: " + Arrays.toString(this.b.toArray()) + '}';
    }
}
