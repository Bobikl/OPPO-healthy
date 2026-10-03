package com.heytap.msp.sdk.bean;

import com.heytap.msp.sdk.base.common.util.SensitiveInfoUtils;
import java.io.Serializable;

/* JADX INFO: loaded from: classes19.dex */
public class UpgradeBean implements Serializable {
    private String md5;
    private String url;

    public String getMd5() {
        return this.md5;
    }

    public String getUrl() {
        return this.url;
    }

    public void setMd5(String str) {
        this.md5 = str;
    }

    public void setUrl(String str) {
        this.url = str;
    }

    public String toString() {
        return "UpgradeBean{url='" + SensitiveInfoUtils.getNewUrl(this.url) + "', md5='" + SensitiveInfoUtils.currencyReplace(this.md5) + "'}";
    }
}
