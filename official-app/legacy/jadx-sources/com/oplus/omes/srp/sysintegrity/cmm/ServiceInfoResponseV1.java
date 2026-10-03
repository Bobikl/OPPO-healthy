package com.oplus.omes.srp.sysintegrity.cmm;

import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes8.dex */
@Keep
public class ServiceInfoResponseV1 extends BaseResponse {
    private int srpVersionCode = 0;
    private String srpVersionName = null;

    public int getSrpVersionCode() {
        return this.srpVersionCode;
    }

    public String getSrpVersionName() {
        return this.srpVersionName;
    }

    public void setSrpVersionCode(int i) {
        this.srpVersionCode = i;
    }

    public void setSrpVersionName(String str) {
        this.srpVersionName = str;
    }
}
