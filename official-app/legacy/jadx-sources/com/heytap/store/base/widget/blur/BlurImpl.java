package com.heytap.store.base.widget.blur;

import android.content.Context;
import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes3.dex */
interface BlurImpl {
    void blur(Bitmap bitmap, Bitmap bitmap2);

    boolean prepare(Context context, Bitmap bitmap, float f);

    void release();
}
