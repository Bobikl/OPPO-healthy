package com.heytap.health.wallet.bean;

import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes18.dex */
@Keep
public class PrivacyBean {
    private String appPackName;
    private String content;
    private int contentType;
    private long id;
    private String langCode;
    private long validTime;
    private long version;

    public String getAppPackName() {
        return this.appPackName;
    }

    public String getContent() {
        return this.content;
    }

    public int getContentType() {
        return this.contentType;
    }

    public long getId() {
        return this.id;
    }

    public String getLangCode() {
        return this.langCode;
    }

    public long getValidTime() {
        return this.validTime;
    }

    public long getVersion() {
        return this.version;
    }

    public void setAppPackName(String str) {
        this.appPackName = str;
    }

    public void setContent(String str) {
        this.content = str;
    }

    public void setContentType(int i) {
        this.contentType = i;
    }

    public void setId(long j2) {
        this.id = j2;
    }

    public void setLangCode(String str) {
        this.langCode = str;
    }

    public void setValidTime(long j2) {
        this.validTime = j2;
    }

    public void setVersion(long j2) {
        this.version = j2;
    }
}
