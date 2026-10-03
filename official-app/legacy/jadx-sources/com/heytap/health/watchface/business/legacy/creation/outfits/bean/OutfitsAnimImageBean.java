package com.heytap.health.watchface.business.legacy.creation.outfits.bean;

import android.graphics.Bitmap;
import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes19.dex */
@Keep
public class OutfitsAnimImageBean {
    private Bitmap mBitmap;
    private int mCenterX;
    private int mCenterY;
    private int mRadius;

    public OutfitsAnimImageBean(Bitmap bitmap, int i, int i2, int i3) {
        this.mBitmap = bitmap;
        this.mRadius = i;
        this.mCenterX = i2;
        this.mCenterY = i3;
    }

    public Bitmap getBitmap() {
        return this.mBitmap;
    }

    public int getCenterX() {
        return this.mCenterX;
    }

    public int getCenterY() {
        return this.mCenterY;
    }

    public int getRadius() {
        return this.mRadius;
    }
}
