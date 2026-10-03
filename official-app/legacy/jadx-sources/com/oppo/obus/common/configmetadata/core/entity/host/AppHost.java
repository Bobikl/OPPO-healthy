package com.oppo.obus.common.configmetadata.core.entity.host;

import io.protostuff.Tag;
import java.io.Serializable;

/* JADX INFO: loaded from: classes9.dex */
public class AppHost implements Serializable {
    private static final long serialVersionUID = 3155231219215579302L;

    @Tag(1)
    private String appId;

    @Tag(2)
    private String bizHost;

    @Tag(3)
    private String techHost;

    public AppHost() {
    }

    public AppHost(String str, String str2, String str3) {
        this.appId = str;
        this.bizHost = str2;
        this.techHost = str3;
    }

    public boolean canEqual(Object obj) {
        return obj instanceof AppHost;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AppHost)) {
            return false;
        }
        AppHost appHost = (AppHost) obj;
        if (!appHost.canEqual(this)) {
            return false;
        }
        String appId = getAppId();
        String appId2 = appHost.getAppId();
        if (appId != null ? !appId.equals(appId2) : appId2 != null) {
            return false;
        }
        String bizHost = getBizHost();
        String bizHost2 = appHost.getBizHost();
        if (bizHost != null ? !bizHost.equals(bizHost2) : bizHost2 != null) {
            return false;
        }
        String techHost = getTechHost();
        String techHost2 = appHost.getTechHost();
        return techHost != null ? techHost.equals(techHost2) : techHost2 == null;
    }

    public String getAppId() {
        return this.appId;
    }

    public String getBizHost() {
        return this.bizHost;
    }

    public String getTechHost() {
        return this.techHost;
    }

    public int hashCode() {
        String appId = getAppId();
        int iHashCode = appId == null ? 43 : appId.hashCode();
        String bizHost = getBizHost();
        int i = (iHashCode + 59) * 59;
        int iHashCode2 = bizHost == null ? 43 : bizHost.hashCode();
        String techHost = getTechHost();
        return ((i + iHashCode2) * 59) + (techHost != null ? techHost.hashCode() : 43);
    }

    public AppHost setAppId(String str) {
        this.appId = str;
        return this;
    }

    public AppHost setBizHost(String str) {
        this.bizHost = str;
        return this;
    }

    public AppHost setTechHost(String str) {
        this.techHost = str;
        return this;
    }

    public String toString() {
        return "AppHost(appId=" + getAppId() + ", bizHost=" + getBizHost() + ", techHost=" + getTechHost() + ")";
    }
}
