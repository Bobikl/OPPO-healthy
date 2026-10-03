package com.oppo.obus.common.configmetadata.core.entity.host;

import io.protostuff.Tag;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class MinHostConfig implements Serializable {
    private static final long serialVersionUID = 6063705557518972972L;

    @Tag(4)
    private List<AppHost> app;

    @Tag(2)
    private String bizHost;

    @Tag(3)
    private String techHost;

    @Tag(1)
    private Integer v;

    public MinHostConfig() {
    }

    public MinHostConfig(Integer num, String str, String str2, List<AppHost> list) {
        this.v = num;
        this.bizHost = str;
        this.techHost = str2;
        this.app = list;
    }

    public boolean canEqual(Object obj) {
        return obj instanceof MinHostConfig;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MinHostConfig)) {
            return false;
        }
        MinHostConfig minHostConfig = (MinHostConfig) obj;
        if (!minHostConfig.canEqual(this)) {
            return false;
        }
        Integer v = getV();
        Integer v2 = minHostConfig.getV();
        if (v != null ? !v.equals(v2) : v2 != null) {
            return false;
        }
        String bizHost = getBizHost();
        String bizHost2 = minHostConfig.getBizHost();
        if (bizHost != null ? !bizHost.equals(bizHost2) : bizHost2 != null) {
            return false;
        }
        String techHost = getTechHost();
        String techHost2 = minHostConfig.getTechHost();
        if (techHost != null ? !techHost.equals(techHost2) : techHost2 != null) {
            return false;
        }
        List<AppHost> app = getApp();
        List<AppHost> app2 = minHostConfig.getApp();
        return app != null ? app.equals(app2) : app2 == null;
    }

    public List<AppHost> getApp() {
        return this.app;
    }

    public String getBizHost() {
        return this.bizHost;
    }

    public String getTechHost() {
        return this.techHost;
    }

    public Integer getV() {
        return this.v;
    }

    public int hashCode() {
        Integer v = getV();
        int iHashCode = v == null ? 43 : v.hashCode();
        String bizHost = getBizHost();
        int iHashCode2 = ((iHashCode + 59) * 59) + (bizHost == null ? 43 : bizHost.hashCode());
        String techHost = getTechHost();
        int i = iHashCode2 * 59;
        int iHashCode3 = techHost == null ? 43 : techHost.hashCode();
        List<AppHost> app = getApp();
        return ((i + iHashCode3) * 59) + (app != null ? app.hashCode() : 43);
    }

    public MinHostConfig setApp(List<AppHost> list) {
        this.app = list;
        return this;
    }

    public MinHostConfig setBizHost(String str) {
        this.bizHost = str;
        return this;
    }

    public MinHostConfig setTechHost(String str) {
        this.techHost = str;
        return this;
    }

    public MinHostConfig setV(Integer num) {
        this.v = num;
        return this;
    }

    public String toString() {
        return "MinHostConfig(v=" + getV() + ", bizHost=" + getBizHost() + ", techHost=" + getTechHost() + ", app=" + getApp() + ")";
    }
}
