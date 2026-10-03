package com.heytap.health.watchface.business.legacy.creation.outfits.transfor.bean;

import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes19.dex */
@Keep
public class ColorStatisticsBean {
    private String mColor;
    private int mColumn;
    private int mCount;
    private int mRow;

    public ColorStatisticsBean(String str, int i, int i2, int i3) {
        this.mColor = str;
        this.mCount = i;
        this.mRow = i2;
        this.mColumn = i3;
    }

    public String getColor() {
        return this.mColor;
    }

    public int getColumn() {
        return this.mColumn;
    }

    public int getCount() {
        return this.mCount;
    }

    public int getRow() {
        return this.mRow;
    }

    public void setColor(String str) {
        this.mColor = str;
    }

    public void setColumn(int i) {
        this.mColumn = i;
    }

    public void setCount(int i) {
        this.mCount = i;
    }

    public void setRow(int i) {
        this.mRow = i;
    }

    public String toString() {
        return "{mColor='" + this.mColor + "', mCount=" + this.mCount + ", mRow=" + this.mRow + ", mColumn=" + this.mColumn + '}';
    }
}
