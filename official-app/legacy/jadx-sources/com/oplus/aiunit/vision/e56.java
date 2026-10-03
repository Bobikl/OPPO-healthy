package com.oplus.aiunit.vision;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes13.dex */
public class e56 implements x9k<Drawable> {
    public final x9k<Bitmap> a;
    public final boolean b;

    public e56(x9k<Bitmap> x9kVar, boolean z) {
        this.a = x9kVar;
        this.b = z;
    }

    public x9k<BitmapDrawable> a() {
        return this;
    }

    public final usf<Drawable> b(Context context, usf<Bitmap> usfVar) {
        return xua.c(context.getResources(), usfVar);
    }

    @Override // com.oplus.aiunit.vision.ona
    public boolean equals(Object obj) {
        if (obj instanceof e56) {
            return this.a.equals(((e56) obj).a);
        }
        return false;
    }

    @Override // com.oplus.aiunit.vision.ona
    public int hashCode() {
        return this.a.hashCode();
    }

    @Override // com.oplus.aiunit.vision.x9k
    @NonNull
    public usf<Drawable> transform(@NonNull Context context, @NonNull usf<Drawable> usfVar, int i, int i2) {
        kf1 kf1VarG = com.bumptech.glide.a.d(context).g();
        Drawable drawable = usfVar.get();
        usf<Bitmap> usfVarA = d56.a(kf1VarG, drawable, i, i2);
        if (usfVarA != null) {
            usf<Bitmap> usfVarTransform = this.a.transform(context, usfVarA, i, i2);
            if (!usfVarTransform.equals(usfVarA)) {
                return b(context, usfVarTransform);
            }
            usfVarTransform.recycle();
            return usfVar;
        }
        if (!this.b) {
            return usfVar;
        }
        throw new IllegalArgumentException("Unable to convert " + drawable + " to a Bitmap");
    }

    @Override // com.oplus.aiunit.vision.ona
    public void updateDiskCacheKey(@NonNull MessageDigest messageDigest) {
        this.a.updateDiskCacheKey(messageDigest);
    }
}
