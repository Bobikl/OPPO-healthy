package com.oplus.accountsdk.open.core.net.bean;

import androidx.annotation.Keep;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
@Keep
public class AcVerifyUrlConfigResponse {
    private Map<String, String> businessUrlConfig;
    private String version;

    public Map<String, String> getBusinessUrlConfig() {
        return this.businessUrlConfig;
    }

    public String getVersion() {
        return this.version;
    }

    public void setBusinessUrlConfig(Map<String, String> map) {
        this.businessUrlConfig = map;
    }

    public void setVersion(String str) {
        this.version = str;
    }

    public String toString() {
        return "AcVerifyUrlConfigResponse{version='" + this.version + "', urlConfigurations=" + this.businessUrlConfig + '}';
    }
}
