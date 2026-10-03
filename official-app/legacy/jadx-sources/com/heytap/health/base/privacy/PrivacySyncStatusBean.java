package com.heytap.health.base.privacy;

import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes15.dex */
@Keep
public class PrivacySyncStatusBean {
    private String avatar;
    private long modifiedTime;
    private String privacySyncStatus;
    private String sex;
    private String userName;

    public String getAvatar() {
        return this.avatar;
    }

    public long getModifiedTime() {
        return this.modifiedTime;
    }

    public String getPrivacySyncStatus() {
        return this.privacySyncStatus;
    }

    public String getSex() {
        return this.sex;
    }

    public String getUserName() {
        return this.userName;
    }

    public void setAvatar(String str) {
        this.avatar = str;
    }

    public void setModifiedTime(long j2) {
        this.modifiedTime = j2;
    }

    public void setPrivacySyncStatus(String str) {
        this.privacySyncStatus = str;
    }

    public void setSex(String str) {
        this.sex = str;
    }

    public void setUserName(String str) {
        this.userName = str;
    }

    public String toString() {
        return "PrivacySyncStatusBean{, userName='" + this.userName + "', sex='" + this.sex + "', avatar='" + this.avatar + "', privacySyncStatus='" + this.privacySyncStatus + "', modifiedTime=" + this.modifiedTime + '}';
    }
}
