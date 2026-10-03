package com.heytap.health.wallet.entrance.model.detail;

import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes18.dex */
@Keep
public class BaseDetailModel {
    private String aid;
    private String appGuideUrl;
    private String cardName;
    private String cardUrl;
    private boolean isSupportShare;
    private String message;
    private String pkgName;
    private String shareTips;
    private String status;
    private String userTipsUrl;

    public String getAid() {
        return this.aid;
    }

    public String getAppGuideUrl() {
        return this.appGuideUrl;
    }

    public String getCardName() {
        return this.cardName;
    }

    public String getCardUrl() {
        return this.cardUrl;
    }

    public String getMessage() {
        return this.message;
    }

    public String getPkgName() {
        return this.pkgName;
    }

    public String getStatus() {
        return this.status;
    }

    public void setAid(String str) {
        this.aid = str;
    }

    public void setAppGuideUrl(String str) {
        this.appGuideUrl = str;
    }

    public void setCardName(String str) {
        this.cardName = str;
    }

    public void setCardUrl(String str) {
        this.cardUrl = str;
    }

    public void setMessage(String str) {
        this.message = str;
    }

    public void setPkgName(String str) {
        this.pkgName = str;
    }

    public void setShareTips(String str) {
        this.shareTips = str;
    }

    public void setStatus(String str) {
        this.status = str;
    }

    public void setSupportShare(boolean z) {
        this.isSupportShare = z;
    }

    public void setUserTipsUrl(String str) {
        this.userTipsUrl = str;
    }

    public String toString() {
        return "BaseDetailModel{aid='" + this.aid + "', cardUrl='" + this.cardUrl + "', cardName='" + this.cardName + "', message='" + this.message + "', userTipsUrl='" + this.userTipsUrl + "', isSupportShare=" + this.isSupportShare + ", status='" + this.status + "', shareTips='" + this.shareTips + "', pkgName='" + this.pkgName + "', appGuideUrl='" + this.appGuideUrl + "'}";
    }
}
