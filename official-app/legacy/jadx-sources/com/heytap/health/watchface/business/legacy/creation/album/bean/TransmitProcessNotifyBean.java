package com.heytap.health.watchface.business.legacy.creation.album.bean;

import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes19.dex */
@Keep
public class TransmitProcessNotifyBean {
    public static final int TYPE_CUSTOM = 0;
    public static final int TYPE_MEMORY = 1;
    private boolean mIsNeedRefresh;
    private int mSuccessCount;
    private int mTotal;
    private int mType;

    public TransmitProcessNotifyBean(int i, int i2, int i3, boolean z) {
        this.mType = i;
        this.mTotal = i2;
        this.mSuccessCount = i3;
        this.mIsNeedRefresh = z;
    }

    public String getProcess() {
        return this.mSuccessCount + "/" + this.mTotal;
    }

    public int getSuccessCount() {
        return this.mSuccessCount;
    }

    public int getTotal() {
        return this.mTotal;
    }

    public int getType() {
        return this.mType;
    }

    public boolean isNeedRefresh() {
        return this.mIsNeedRefresh;
    }

    public void setNeedRefresh(boolean z) {
        this.mIsNeedRefresh = z;
    }

    public void setSuccessCount(int i) {
        this.mSuccessCount = i;
    }

    public void setTotal(int i) {
        this.mTotal = i;
    }

    public void setType(int i) {
        this.mType = i;
    }

    public String toString() {
        return "TransmitProcessNotifyBean{mType=" + this.mType + ", mTotal=" + this.mTotal + ", mSuccessCount=" + this.mSuccessCount + ", mIsNeedRefresh=" + this.mIsNeedRefresh + '}';
    }

    public TransmitProcessNotifyBean(int i, int i2, int i3) {
        this(i, i2, i3, true);
    }
}
