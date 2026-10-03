package com.heytap.nearx.tangramconfig.kit.bean;

import androidx.annotation.Keep;
import java.util.HashMap;

/* JADX INFO: loaded from: classes17.dex */
@Keep
public class InitIpcParamsBean {
    public HashMap<String, String> extraParmaMap = new HashMap<>();
    public String hostAppPkg;
    public String productId;
    public String sdkVersion;

    public String toString() {
        return "InitIpcParamsBean{productId='" + this.productId + "', hostAppPkg='" + this.hostAppPkg + "', sdkVersion='" + this.sdkVersion + "', extraParmaMap=" + this.extraParmaMap + '}';
    }
}
