package com.oplus.aiunit.vision;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import com.bumptech.glide.load.resource.gif.GifDrawable;

/* JADX INFO: loaded from: classes13.dex */
public abstract class z46<T extends Drawable> implements usf<T>, z7a {
    public final T i;

    public z46(T t) {
        this.i = (T) cpe.d(t);
    }

    @Override // com.oplus.aiunit.vision.usf
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final T get() {
        Drawable.ConstantState constantState = this.i.getConstantState();
        return constantState == null ? this.i : (T) constantState.newDrawable();
    }

    public void initialize() {
        T t = this.i;
        if (t instanceof BitmapDrawable) {
            ((BitmapDrawable) t).getBitmap().prepareToDraw();
        } else if (t instanceof GifDrawable) {
            ((GifDrawable) t).e().prepareToDraw();
        }
    }
}
