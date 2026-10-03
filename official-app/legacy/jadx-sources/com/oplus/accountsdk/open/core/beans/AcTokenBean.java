package com.oplus.accountsdk.open.core.beans;

import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes6.dex */
@Keep
public class AcTokenBean {
    private String accessToken;
    private Long accessTokenExp;
    private Long accessTokenRfAdv;
    private String idToken;
    private String refreshToken;
    private Long refreshTokenExp;
    private Long refreshTokenRfAdv;

    public AcTokenBean(String str, String str2, String str3, Long l2, Long l3, Long l4, Long l5) {
        this.idToken = str;
        this.accessToken = str2;
        this.refreshToken = str3;
        this.accessTokenExp = l2;
        this.refreshTokenExp = l3;
        this.accessTokenRfAdv = l4;
        this.refreshTokenRfAdv = l5;
    }

    public String getAccessToken() {
        return this.accessToken;
    }

    public Long getAccessTokenExp() {
        return this.accessTokenExp;
    }

    public Long getAccessTokenRfAdv() {
        return this.accessTokenRfAdv;
    }

    public String getIdToken() {
        return this.idToken;
    }

    public String getRefreshToken() {
        return this.refreshToken;
    }

    public Long getRefreshTokenExp() {
        return this.refreshTokenExp;
    }

    public Long getRefreshTokenRfAdv() {
        return this.refreshTokenRfAdv;
    }

    public void setAccessToken(String str) {
        this.accessToken = str;
    }

    public void setAccessTokenExp(Long l2) {
        this.accessTokenExp = l2;
    }

    public void setAccessTokenRfAdv(Long l2) {
        this.accessTokenRfAdv = l2;
    }

    public void setIdToken(String str) {
        this.idToken = str;
    }

    public void setRefreshToken(String str) {
        this.refreshToken = str;
    }

    public void setRefreshTokenExp(Long l2) {
        this.refreshTokenExp = l2;
    }

    public void setRefreshTokenRfAdv(Long l2) {
        this.refreshTokenRfAdv = l2;
    }
}
