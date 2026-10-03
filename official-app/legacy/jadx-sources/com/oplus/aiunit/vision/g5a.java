package com.oplus.aiunit.vision;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public abstract class g5a<Z> extends c1l<ImageView, Z> implements oak.a {

    @Nullable
    private Animatable animatable;

    public g5a(ImageView imageView) {
        super(imageView);
    }

    private void maybeUpdateAnimatable(@Nullable Z z) {
        if (!(z instanceof Animatable)) {
            this.animatable = null;
            return;
        }
        Animatable animatable = (Animatable) z;
        this.animatable = animatable;
        animatable.start();
    }

    private void setResourceInternal(@Nullable Z z) {
        setResource(z);
        maybeUpdateAnimatable(z);
    }

    @Override // com.oplus.aiunit.vision.oak.a
    @Nullable
    public Drawable getCurrentDrawable() {
        return ((ImageView) this.view).getDrawable();
    }

    @Override // com.oplus.aiunit.vision.c1l, com.oplus.aiunit.vision.k91, com.oplus.aiunit.vision.boj
    public void onLoadCleared(@Nullable Drawable drawable) {
        super.onLoadCleared(drawable);
        Animatable animatable = this.animatable;
        if (animatable != null) {
            animatable.stop();
        }
        setResourceInternal(null);
        setDrawable(drawable);
    }

    @Override // com.oplus.aiunit.vision.k91, com.oplus.aiunit.vision.boj
    public void onLoadFailed(@Nullable Drawable drawable) {
        super.onLoadFailed(drawable);
        setResourceInternal(null);
        setDrawable(drawable);
    }

    @Override // com.oplus.aiunit.vision.c1l, com.oplus.aiunit.vision.k91, com.oplus.aiunit.vision.boj
    public void onLoadStarted(@Nullable Drawable drawable) {
        super.onLoadStarted(drawable);
        setResourceInternal(null);
        setDrawable(drawable);
    }

    @Override // com.oplus.aiunit.vision.boj
    public void onResourceReady(@NonNull Z z, @Nullable oak<? super Z> oakVar) {
        if (oakVar == null || !oakVar.a(z, this)) {
            setResourceInternal(z);
        } else {
            maybeUpdateAnimatable(z);
        }
    }

    @Override // com.oplus.aiunit.vision.k91, com.oplus.aiunit.vision.bwa
    public void onStart() {
        Animatable animatable = this.animatable;
        if (animatable != null) {
            animatable.start();
        }
    }

    @Override // com.oplus.aiunit.vision.k91, com.oplus.aiunit.vision.bwa
    public void onStop() {
        Animatable animatable = this.animatable;
        if (animatable != null) {
            animatable.stop();
        }
    }

    @Override // com.oplus.aiunit.vision.oak.a
    public void setDrawable(Drawable drawable) {
        ((ImageView) this.view).setImageDrawable(drawable);
    }

    public abstract void setResource(@Nullable Z z);

    @Deprecated
    public g5a(ImageView imageView, boolean z) {
        super(imageView, z);
    }
}
