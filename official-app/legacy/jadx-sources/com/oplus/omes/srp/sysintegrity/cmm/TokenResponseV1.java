package com.oplus.omes.srp.sysintegrity.cmm;

import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes8.dex */
@Keep
public class TokenResponseV1 extends BaseResponse {
    private long addTime;
    private String token;
    private long validTime;

    public long getAddTime() {
        return this.addTime;
    }

    @Override // com.oplus.omes.srp.sysintegrity.cmm.BaseResponse
    public int getCode() {
        return this.code.intValue();
    }

    @Override // com.oplus.omes.srp.sysintegrity.cmm.BaseResponse
    public String getMessage() {
        return this.message;
    }

    public String getToken() {
        return this.token;
    }

    public long getValidTime() {
        return this.validTime;
    }

    public void setAddTime(long j2) {
        this.addTime = j2;
    }

    @Override // com.oplus.omes.srp.sysintegrity.cmm.BaseResponse
    public void setCode(int i) {
        this.code = Integer.valueOf(i);
    }

    @Override // com.oplus.omes.srp.sysintegrity.cmm.BaseResponse
    public void setMessage(String str) {
        this.message = str;
    }

    public void setToken(String str) {
        this.token = str;
    }

    public void setValidTime(long j2) {
        this.validTime = j2;
    }
}
