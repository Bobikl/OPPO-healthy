package com.oplus.aiunit.vision;

import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public final class iuc extends z46<Drawable> {
    public iuc(Drawable drawable) {
        super(drawable);
    }

    @Nullable
    public static usf<Drawable> c(@Nullable Drawable drawable) {
        if (drawable != null) {
            return new iuc(drawable);
        }
        return null;
    }

    @Override // com.oplus.aiunit.vision.usf
    @NonNull
    public Class<Drawable> a() {
        return this.i.getClass();
    }

    @Override // com.oplus.aiunit.vision.usf
    public int getSize() {
        return Math.max(1, this.i.getIntrinsicWidth() * this.i.getIntrinsicHeight() * 4);
    }

    @Override // com.oplus.aiunit.vision.usf
    public void recycle() {
    }
}
