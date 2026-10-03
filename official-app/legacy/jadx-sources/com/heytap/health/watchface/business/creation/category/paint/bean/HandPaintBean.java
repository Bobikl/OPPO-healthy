package com.heytap.health.watchface.business.creation.category.paint.bean;

import android.graphics.Bitmap;
import java.io.Serializable;

/* JADX INFO: loaded from: classes19.dex */
public class HandPaintBean implements Serializable {
    private String mAnimationPath;
    private Bitmap mBitmapFinished;

    public String getAnimationPath() {
        return this.mAnimationPath;
    }

    public Bitmap getBitmapFinished() {
        return this.mBitmapFinished;
    }

    public void setAnimationPath(String str) {
        this.mAnimationPath = str;
    }

    public void setBitmapFinished(Bitmap bitmap) {
        this.mBitmapFinished = bitmap;
    }
}
