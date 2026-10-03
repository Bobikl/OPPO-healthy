package com.heytap.theme.watch.domain.dto.response;

import io.protostuff.Tag;

/* JADX INFO: loaded from: classes17.dex */
public class BulletinDto {

    @Tag(1)
    private String bulletinUrl;

    @Tag(2)
    private String explainIPUrl;

    @Tag(10)
    private String historyUserAgreeUrl;

    @Tag(5)
    private String notesUrl;

    @Tag(3)
    private String priPolicyUrl;

    @Tag(7)
    private String themeWatchH5Url;

    @Tag(4)
    private String userAgreeUrl;

    @Tag(9)
    private long userAgreeUrlVersion;

    @Tag(6)
    private String vipNotesUrl;

    public String getBulletinUrl() {
        return this.bulletinUrl;
    }

    public String getExplainIPUrl() {
        return this.explainIPUrl;
    }

    public String getHistoryUserAgreeUrl() {
        return this.historyUserAgreeUrl;
    }

    public String getNotesUrl() {
        return this.notesUrl;
    }

    public String getPriPolicyUrl() {
        return this.priPolicyUrl;
    }

    public String getThemeWatchH5Url() {
        return this.themeWatchH5Url;
    }

    public String getUserAgreeUrl() {
        return this.userAgreeUrl;
    }

    public long getUserAgreeUrlVersion() {
        return this.userAgreeUrlVersion;
    }

    public String getVipNotesUrl() {
        return this.vipNotesUrl;
    }

    public void setBulletinUrl(String str) {
        this.bulletinUrl = str;
    }

    public void setExplainIPUrl(String str) {
        this.explainIPUrl = str;
    }

    public void setHistoryUserAgreeUrl(String str) {
        this.historyUserAgreeUrl = str;
    }

    public void setNotesUrl(String str) {
        this.notesUrl = str;
    }

    public void setPriPolicyUrl(String str) {
        this.priPolicyUrl = str;
    }

    public void setThemeWatchH5Url(String str) {
        this.themeWatchH5Url = str;
    }

    public void setUserAgreeUrl(String str) {
        this.userAgreeUrl = str;
    }

    public void setUserAgreeUrlVersion(long j2) {
        this.userAgreeUrlVersion = j2;
    }

    public void setVipNotesUrl(String str) {
        this.vipNotesUrl = str;
    }

    public String toString() {
        return "BulletinDto{bulletinUrl='" + this.bulletinUrl + "', explainIPUrl='" + this.explainIPUrl + "', priPolicyUrl='" + this.priPolicyUrl + "', userAgreeUrl='" + this.userAgreeUrl + "', notesUrl='" + this.notesUrl + "', vipNotesUrl='" + this.vipNotesUrl + "', themeWatchH5Url='" + this.themeWatchH5Url + "', userAgreeUrlVersion='" + this.userAgreeUrlVersion + "', historyUserAgreeUrl='" + this.historyUserAgreeUrl + "'}";
    }
}
