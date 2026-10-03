package com.oplus.aiunit.vision;

import android.graphics.Bitmap;
import android.os.Binder;

/* JADX INFO: loaded from: classes2.dex */
public class se1 extends Binder {
    public Bitmap i;

    public se1(Bitmap bitmap) {
        this.i = bitmap;
    }

    public Bitmap a() {
        return this.i;
    }
}
