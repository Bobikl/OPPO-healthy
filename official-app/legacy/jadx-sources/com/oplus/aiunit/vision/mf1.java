package com.oplus.aiunit.vision;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public class mf1 implements usf<Bitmap>, z7a {
    public final Bitmap i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final kf1 f14043j;

    public mf1(@NonNull Bitmap bitmap, @NonNull kf1 kf1Var) {
        this.i = (Bitmap) cpe.e(bitmap, "Bitmap must not be null");
        this.f14043j = (kf1) cpe.e(kf1Var, "BitmapPool must not be null");
    }

    @Nullable
    public static mf1 c(@Nullable Bitmap bitmap, @NonNull kf1 kf1Var) {
        if (bitmap == null) {
            return null;
        }
        return new mf1(bitmap, kf1Var);
    }

    @Override // com.oplus.aiunit.vision.usf
    @NonNull
    public Class<Bitmap> a() {
        return Bitmap.class;
    }

    @Override // com.oplus.aiunit.vision.usf
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Bitmap get() {
        return this.i;
    }

    @Override // com.oplus.aiunit.vision.usf
    public int getSize() {
        return uqk.i(this.i);
    }

    @Override // com.oplus.aiunit.vision.z7a
    public void initialize() {
        this.i.prepareToDraw();
    }

    @Override // com.oplus.aiunit.vision.usf
    public void recycle() {
        this.f14043j.b(this.i);
    }
}
