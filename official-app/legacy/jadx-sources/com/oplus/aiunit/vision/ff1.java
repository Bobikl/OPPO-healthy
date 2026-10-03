package com.oplus.aiunit.vision;

import android.graphics.Bitmap;
import android.widget.ImageView;

/* JADX INFO: loaded from: classes13.dex */
public class ff1 extends g5a<Bitmap> {
    public ff1(ImageView imageView) {
        super(imageView);
    }

    @Deprecated
    public ff1(ImageView imageView, boolean z) {
        super(imageView, z);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.oplus.aiunit.vision.g5a
    public void setResource(Bitmap bitmap) {
        ((ImageView) this.view).setImageBitmap(bitmap);
    }
}
