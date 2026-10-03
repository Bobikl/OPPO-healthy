package com.heytap.health.watchface.business.legacy.creation.album.bean;

import android.graphics.Bitmap;
import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes19.dex */
@Keep
public class TimeStyleBitmaps {
    private Bitmap mDownBitmap;
    private Bitmap mUpBitmap;

    public TimeStyleBitmaps(Bitmap bitmap, Bitmap bitmap2) {
        this.mUpBitmap = bitmap;
        this.mDownBitmap = bitmap2;
    }

    public Bitmap getBitmap(boolean z) {
        return z ? this.mUpBitmap : this.mDownBitmap;
    }

    public Bitmap getDownBitmap() {
        return this.mDownBitmap;
    }

    public Bitmap getUpBitmap() {
        return this.mUpBitmap;
    }

    public void setDownBitmap(Bitmap bitmap) {
        this.mDownBitmap = bitmap;
    }

    public void setUpBitmap(Bitmap bitmap) {
        this.mUpBitmap = bitmap;
    }
}
