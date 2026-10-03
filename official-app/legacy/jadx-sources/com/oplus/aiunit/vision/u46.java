package com.oplus.aiunit.vision;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.load.resource.gif.GifDrawable;

/* JADX INFO: loaded from: classes13.dex */
public final class u46 implements mtf<Drawable, byte[]> {
    public final kf1 a;
    public final mtf<Bitmap, byte[]> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final mtf<GifDrawable, byte[]> f17288c;

    public u46(@NonNull kf1 kf1Var, @NonNull mtf<Bitmap, byte[]> mtfVar, @NonNull mtf<GifDrawable, byte[]> mtfVar2) {
        this.a = kf1Var;
        this.b = mtfVar;
        this.f17288c = mtfVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NonNull
    public static usf<GifDrawable> b(@NonNull usf<Drawable> usfVar) {
        return usfVar;
    }

    @Override // com.oplus.aiunit.vision.mtf
    @Nullable
    public usf<byte[]> a(@NonNull usf<Drawable> usfVar, @NonNull erd erdVar) {
        Drawable drawable = usfVar.get();
        if (drawable instanceof BitmapDrawable) {
            return this.b.a(mf1.c(((BitmapDrawable) drawable).getBitmap(), this.a), erdVar);
        }
        if (drawable instanceof GifDrawable) {
            return this.f17288c.a(b(usfVar), erdVar);
        }
        return null;
    }
}
