package com.heytap.health.watchface.business.legacy.main.bean;

import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes19.dex */
@Keep
public class WatchIdInfo {
    private String mBgUrl;
    private String mIdFilePath;
    private int mRoundRadius;
    private String mSku;

    public WatchIdInfo() {
    }

    public String getBgUrl() {
        return this.mBgUrl;
    }

    public String getIdFilePath() {
        return this.mIdFilePath;
    }

    public int getRoundRadius() {
        return this.mRoundRadius;
    }

    public String getSku() {
        return this.mSku;
    }

    public void setBgUrl(String str) {
        this.mBgUrl = str;
    }

    public void setIdFilePath(String str) {
        this.mIdFilePath = str;
    }

    public void setRoundRadius(int i) {
        this.mRoundRadius = i;
    }

    public void setSku(String str) {
        this.mSku = str;
    }

    public String toString() {
        return "WatchIdInfo{mBgUrl='" + this.mBgUrl + "', mRoundRadius=" + this.mRoundRadius + ", mIdFilePath='" + this.mIdFilePath + "'}";
    }

    public WatchIdInfo(String str) {
        this.mBgUrl = str;
    }
}
