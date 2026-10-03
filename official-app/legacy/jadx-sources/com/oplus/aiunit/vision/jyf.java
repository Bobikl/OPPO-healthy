package com.oplus.aiunit.vision;

import androidx.annotation.Nullable;
import com.airbnb.lottie.LottieDrawable;

/* JADX INFO: loaded from: classes12.dex */
public class jyf implements l84 {
    public final String a;
    public final j50<Float, Float> b;

    public jyf(String str, j50<Float, Float> j50Var) {
        this.a = str;
        this.b = j50Var;
    }

    @Override // com.oplus.aiunit.vision.l84
    @Nullable
    public e74 a(LottieDrawable lottieDrawable, k9b k9bVar, com.airbnb.lottie.model.layer.a aVar) {
        return new lyf(lottieDrawable, aVar, this);
    }

    public j50<Float, Float> b() {
        return this.b;
    }

    public String c() {
        return this.a;
    }
}
