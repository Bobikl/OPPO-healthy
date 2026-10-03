package com.heytap.health.watchface.provider.omoji;

import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes19.dex */
@Keep
public class OmojiDeviceInfo {
    private float mScale;
    private int mScreenHeight;
    private int mScreenRadius;
    private int mScreenType;
    private int mScreenWidth;
    private double mSupportVideoRate;
    private int mYOffset;

    public float getScale() {
        return this.mScale;
    }

    public int getScreenHeight() {
        return this.mScreenHeight;
    }

    public int getScreenRadius() {
        return this.mScreenRadius;
    }

    public int getScreenType() {
        return this.mScreenType;
    }

    public int getScreenWidth() {
        return this.mScreenWidth;
    }

    public double getSupportVideoRate() {
        return this.mSupportVideoRate;
    }

    public int getYOffset() {
        return this.mYOffset;
    }

    public void setScale(float f) {
        this.mScale = f;
    }

    public void setScreenHeight(int i) {
        this.mScreenHeight = i;
    }

    public void setScreenRadius(int i) {
        this.mScreenRadius = i;
    }

    public void setScreenType(int i) {
        this.mScreenType = i;
    }

    public void setScreenWidth(int i) {
        this.mScreenWidth = i;
    }

    public void setSupportVideoRate(double d) {
        this.mSupportVideoRate = d;
    }

    public void setYOffset(int i) {
        this.mYOffset = i;
    }
}
