package com.oplus.aiunit.vision;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes13.dex */
public final class o68 implements btf<i68, Bitmap> {
    public final kf1 a;

    public o68(kf1 kf1Var) {
        this.a = kf1Var;
    }

    @Override // com.oplus.aiunit.vision.btf
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public usf<Bitmap> a(@NonNull i68 i68Var, int i, int i2, @NonNull erd erdVar) {
        return mf1.c(i68Var.e(), this.a);
    }

    @Override // com.oplus.aiunit.vision.btf
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean b(@NonNull i68 i68Var, @NonNull erd erdVar) {
        return true;
    }
}
