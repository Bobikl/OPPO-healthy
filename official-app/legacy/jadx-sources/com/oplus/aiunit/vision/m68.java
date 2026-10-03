package com.oplus.aiunit.vision;

import android.content.Context;
import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import com.bumptech.glide.load.resource.gif.GifDrawable;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes13.dex */
public class m68 implements x9k<GifDrawable> {
    public final x9k<Bitmap> a;

    public m68(x9k<Bitmap> x9kVar) {
        this.a = (x9k) cpe.d(x9kVar);
    }

    @Override // com.oplus.aiunit.vision.ona
    public boolean equals(Object obj) {
        if (obj instanceof m68) {
            return this.a.equals(((m68) obj).a);
        }
        return false;
    }

    @Override // com.oplus.aiunit.vision.ona
    public int hashCode() {
        return this.a.hashCode();
    }

    @Override // com.oplus.aiunit.vision.x9k
    @NonNull
    public usf<GifDrawable> transform(@NonNull Context context, @NonNull usf<GifDrawable> usfVar, int i, int i2) {
        GifDrawable gifDrawable = usfVar.get();
        usf<Bitmap> mf1Var = new mf1(gifDrawable.e(), com.bumptech.glide.a.d(context).g());
        usf<Bitmap> usfVarTransform = this.a.transform(context, mf1Var, i, i2);
        if (!mf1Var.equals(usfVarTransform)) {
            mf1Var.recycle();
        }
        gifDrawable.m(this.a, usfVarTransform.get());
        return usfVar;
    }

    @Override // com.oplus.aiunit.vision.ona
    public void updateDiskCacheKey(@NonNull MessageDigest messageDigest) {
        this.a.updateDiskCacheKey(messageDigest);
    }
}
