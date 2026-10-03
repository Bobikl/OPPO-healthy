package com.oplus.omes.srp.sysintegrity.cmm;

import android.content.Context;
import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes8.dex */
@Keep
public class TokenRequestParamV1 extends BaseRequestParam {
    private String appId;
    private String customDgst;
    private String nonce;
    private String pkgName;
    private String sdkVersion;
    private long connectTimeout = 0;
    private boolean retry = false;
    private boolean teeCompat = false;
    private boolean forceToken = false;
    private boolean certsHash = false;

    public static String build(Context context, String str, String str2, long j2, boolean z, String str3, boolean z2, boolean z3) {
        TokenRequestParamV1 tokenRequestParamV1 = new TokenRequestParamV1();
        tokenRequestParamV1.connectTimeout = j2;
        tokenRequestParamV1.retry = z;
        tokenRequestParamV1.sdkVersion = str3;
        tokenRequestParamV1.action = "token";
        tokenRequestParamV1.nonce = str;
        tokenRequestParamV1.appId = str2;
        tokenRequestParamV1.pkgName = context.getPackageName();
        tokenRequestParamV1.forceToken = z2;
        tokenRequestParamV1.certsHash = z3;
        return tokenRequestParamV1.toJson();
    }

    public String getAppId() {
        return this.appId;
    }

    public long getConnectTimeout() {
        return this.connectTimeout;
    }

    public String getNonce() {
        return this.nonce;
    }

    public String getSdkVersion() {
        return this.sdkVersion;
    }

    public boolean isCertsHash() {
        return this.certsHash;
    }

    public boolean isForceToken() {
        return this.forceToken;
    }

    public boolean isRetry() {
        return this.retry;
    }

    public void setAppId(String str) {
        this.appId = str;
    }

    public void setCertsHash(boolean z) {
        this.certsHash = z;
    }

    public void setConnectTimeout(long j2) {
        this.connectTimeout = j2;
    }

    public void setForceToken(boolean z) {
        this.forceToken = z;
    }

    public void setNonce(String str) {
        this.nonce = str;
    }

    public void setRetry(boolean z) {
        this.retry = z;
    }

    public void setSdkVersion(String str) {
        this.sdkVersion = str;
    }

    public static String build(Context context, String str, String str2, String str3, boolean z) {
        TokenRequestParamV1 tokenRequestParamV1 = new TokenRequestParamV1();
        tokenRequestParamV1.sdkVersion = str3;
        tokenRequestParamV1.action = BaseRequestParam.ACTION_GET_CERTS;
        tokenRequestParamV1.customDgst = str2;
        tokenRequestParamV1.nonce = str;
        tokenRequestParamV1.pkgName = context.getPackageName();
        tokenRequestParamV1.teeCompat = z;
        return tokenRequestParamV1.toJson();
    }
}
