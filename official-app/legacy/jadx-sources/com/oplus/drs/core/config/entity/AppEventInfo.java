package com.oplus.drs.core.config.entity;

import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class AppEventInfo {
    private final String appId;
    private final List<String> packages;
    private final int v;

    public AppEventInfo(String str, int i, List<String> list) {
        this.appId = str;
        this.v = i;
        this.packages = list;
    }

    public String getAppId() {
        return this.appId;
    }

    public List<String> getPackages() {
        return this.packages;
    }

    public int getV() {
        return this.v;
    }
}
