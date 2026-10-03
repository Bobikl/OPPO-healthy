package com.oplus.aiunit.vision;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes13.dex */
public final class oik implements btf<Bitmap, Bitmap> {

    public static final class a implements usf<Bitmap> {
        public final Bitmap i;

        public a(@NonNull Bitmap bitmap) {
            this.i = bitmap;
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

        @Override // com.oplus.aiunit.vision.usf
        public void recycle() {
        }
    }

    @Override // com.oplus.aiunit.vision.btf
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public usf<Bitmap> a(@NonNull Bitmap bitmap, int i, int i2, @NonNull erd erdVar) {
        return new a(bitmap);
    }

    @Override // com.oplus.aiunit.vision.btf
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean b(@NonNull Bitmap bitmap, @NonNull erd erdVar) {
        return true;
    }
}
