package com.heytap.store.base.widget.blur;

import android.content.Context;
import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes3.dex */
public class EmptyBlurImpl implements BlurImpl {
    @Override // com.heytap.store.base.widget.blur.BlurImpl
    public void blur(Bitmap bitmap, Bitmap bitmap2) {
    }

    @Override // com.heytap.store.base.widget.blur.BlurImpl
    public boolean prepare(Context context, Bitmap bitmap, float f) {
        return false;
    }

    @Override // com.heytap.store.base.widget.blur.BlurImpl
    public void release() {
    }
}
