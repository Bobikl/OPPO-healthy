package com.platform.usercenter.account.ams.ipc;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Keep
public class AcAuthResponse {

    @NonNull
    private String accessToken;

    @Nullable
    private Long accessTokenExp;

    @Nullable
    private Long accessTokenRfAdv;

    @NonNull
    private String deviceId;

    @Nullable
    private String extraDataJson;

    @NonNull
    private String host;

    @Nullable
    private String id;

    @NonNull
    private String idToken;

    @NonNull
    private String pkgSign;

    @NonNull
    private String refreshToken;

    @Nullable
    private Long refreshTokenExp;

    @Nullable
    private Long refreshTokenRfAdv;
    private long serverDiffTime;

    public AcAuthResponse(@NonNull String str, @NonNull String str2, @NonNull String str3, @NonNull String str4, @NonNull String str5, @NonNull String str6, @Nullable Long l2, @Nullable Long l3, @Nullable Long l4, @Nullable Long l5, Long l6) {
        this.idToken = str;
        this.accessToken = str2;
        this.refreshToken = str3;
        this.pkgSign = str4;
        this.deviceId = str5;
        this.host = str6;
        this.accessTokenExp = l2;
        this.refreshTokenExp = l3;
        this.accessTokenRfAdv = l4;
        this.refreshTokenRfAdv = l5;
        this.serverDiffTime = l6.longValue();
    }

    @NonNull
    public String getAccessToken() {
        return this.accessToken;
    }

    @Nullable
    public Long getAccessTokenExp() {
        return this.accessTokenExp;
    }

    @Nullable
    public Long getAccessTokenRfAdv() {
        return this.accessTokenRfAdv;
    }

    @NonNull
    public String getDeviceId() {
        return this.deviceId;
    }

    @Nullable
    public String getExtraDataJson() {
        return this.extraDataJson;
    }

    @NonNull
    public String getHost() {
        return this.host;
    }

    public String getId() {
        return this.id;
    }

    @NonNull
    public String getIdToken() {
        return this.idToken;
    }

    @NonNull
    public String getPkgSign() {
        return this.pkgSign;
    }

    @NonNull
    public String getRefreshToken() {
        return this.refreshToken;
    }

    @Nullable
    public Long getRefreshTokenExp() {
        return this.refreshTokenExp;
    }

    @Nullable
    public Long getRefreshTokenRfAdv() {
        return this.refreshTokenRfAdv;
    }

    public long getServerDiffTime() {
        return this.serverDiffTime;
    }

    public void setAccessToken(@NonNull String str) {
        this.accessToken = str;
    }

    public void setAccessTokenExp(@Nullable Long l2) {
        this.accessTokenExp = l2;
    }

    public void setAccessTokenRfAdv(@Nullable Long l2) {
        this.accessTokenRfAdv = l2;
    }

    public void setDeviceId(@NonNull String str) {
        this.deviceId = str;
    }

    public void setExtraDataJson(@Nullable String str) {
        this.extraDataJson = str;
    }

    public void setHost(@NonNull String str) {
        this.host = str;
    }

    public void setId(String str) {
        this.id = str;
    }

    public void setIdToken(@NonNull String str) {
        this.idToken = str;
    }

    public void setPkgSign(@NonNull String str) {
        this.pkgSign = str;
    }

    public void setRefreshToken(@NonNull String str) {
        this.refreshToken = str;
    }

    public void setRefreshTokenExp(@Nullable Long l2) {
        this.refreshTokenExp = l2;
    }

    public void setRefreshTokenRfAdv(Long l2) {
        this.refreshTokenRfAdv = l2;
    }

    public void setServerDiffTime(long j2) {
        this.serverDiffTime = j2;
    }

    public AcAuthResponse(@NonNull String str, @NonNull String str2, @NonNull String str3, @NonNull String str4, @NonNull String str5, @NonNull String str6, @Nullable Long l2, @Nullable Long l3, @Nullable Long l4, @Nullable Long l5) {
        this.idToken = str;
        this.accessToken = str2;
        this.refreshToken = str3;
        this.pkgSign = str4;
        this.deviceId = str5;
        this.host = str6;
        this.accessTokenExp = l2;
        this.refreshTokenExp = l3;
        this.accessTokenRfAdv = l4;
        this.refreshTokenRfAdv = l5;
    }
}
