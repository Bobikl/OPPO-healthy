package com.oplus.aiunit.vision;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public final class xua implements usf<BitmapDrawable>, z7a {
    public final Resources i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final usf<Bitmap> f18767j;

    public xua(@NonNull Resources resources, @NonNull usf<Bitmap> usfVar) {
        this.i = (Resources) cpe.d(resources);
        this.f18767j = (usf) cpe.d(usfVar);
    }

    @Nullable
    public static usf<BitmapDrawable> c(@NonNull Resources resources, @Nullable usf<Bitmap> usfVar) {
        if (usfVar == null) {
            return null;
        }
        return new xua(resources, usfVar);
    }

    @Override // com.oplus.aiunit.vision.usf
    @NonNull
    public Class<BitmapDrawable> a() {
        return BitmapDrawable.class;
    }

    @Override // com.oplus.aiunit.vision.usf
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public BitmapDrawable get() {
        return new BitmapDrawable(this.i, this.f18767j.get());
    }

    @Override // com.oplus.aiunit.vision.usf
    public int getSize() {
        return this.f18767j.getSize();
    }

    @Override // com.oplus.aiunit.vision.z7a
    public void initialize() {
        usf<Bitmap> usfVar = this.f18767j;
        if (usfVar instanceof z7a) {
            ((z7a) usfVar).initialize();
        }
    }

    @Override // com.oplus.aiunit.vision.usf
    public void recycle() {
        this.f18767j.recycle();
    }
}
