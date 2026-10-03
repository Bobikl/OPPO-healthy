package com.oplus.omes.srp.sysintegrity.core;

import com.oplus.omes.srp.sysintegrity.cmm.BaseResponse;
import java.io.Serializable;

/* JADX INFO: loaded from: classes8.dex */
public class AttestResponse extends BaseResponse implements Serializable {
    public static final long serialVersionUID = 3720368547769072046L;
    private String[] advice;
    private String bizToken;
    private String certMD5;
    private String[] detail;
    private Long effectiveTime;
    private String gCerts;
    private String gDgst;
    private String nonce;
    private String[] oCerts;
    private String pkgName;
    private String reserved;
    private String signature;
    private boolean sysIntegrity;
    private String teeCerts;
    private long timestamp;

    public AttestResponse(String str, long j2, long j3) {
        this.bizToken = str;
        this.effectiveTime = Long.valueOf(j2);
        this.timestamp = j3;
    }

    public long getAddTime() {
        return this.timestamp;
    }

    public String[] getAdvice() {
        return this.advice;
    }

    public String getBizToken() {
        return this.bizToken;
    }

    public String getCertMd() {
        return this.certMD5;
    }

    public String[] getDetail() {
        return this.detail;
    }

    public String getNonce() {
        return this.nonce;
    }

    public String getPkgName() {
        return this.pkgName;
    }

    public String getReserved() {
        return this.reserved;
    }

    public String getSignature() {
        return this.signature;
    }

    public String getTeeCerts() {
        return this.teeCerts;
    }

    public String getToken() {
        return this.bizToken;
    }

    public long getValidTime() {
        return this.effectiveTime.longValue();
    }

    public String getgCerts() {
        return this.gCerts;
    }

    public String getgDgst() {
        return this.gDgst;
    }

    public String[] getoCerts() {
        return this.oCerts;
    }

    public boolean isSysIntegrity() {
        return this.sysIntegrity;
    }

    public void setAddTime(long j2) {
        this.timestamp = j2;
    }

    public void setAdvice(String[] strArr) {
        this.advice = strArr;
    }

    public void setCertMd(String str) {
        this.certMD5 = str;
    }

    public void setDetail(String[] strArr) {
        this.detail = strArr;
    }

    public void setNonce(String str) {
        this.nonce = str;
    }

    public void setPkgName(String str) {
        this.pkgName = str;
    }

    public void setReserved(String str) {
        this.reserved = str;
    }

    public void setSignature(String str) {
        this.signature = str;
    }

    public void setSysIntegrity(boolean z) {
        this.sysIntegrity = z;
    }

    public void setTeeCerts(String str) {
        this.teeCerts = str;
    }

    public void setToken(String str) {
        this.bizToken = str;
    }

    public void setValidTime(long j2) {
        this.effectiveTime = Long.valueOf(j2);
    }

    public void setgCerts(String str) {
        this.gCerts = str;
    }

    public void setgDgst(String str) {
        this.gDgst = str;
    }

    public void setoCerts(String[] strArr) {
        this.oCerts = strArr;
    }
}
