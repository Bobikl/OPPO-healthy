package com.oplus.aiunit.vision;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public class y46 extends g5a<Drawable> {
    public y46(ImageView imageView) {
        super(imageView);
    }

    @Override // com.oplus.aiunit.vision.g5a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void setResource(@Nullable Drawable drawable) {
        ((ImageView) this.view).setImageDrawable(drawable);
    }
}
