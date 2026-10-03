package com.oplus.web.container.safe.model;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public enum HostSecurityLevel {
    NONE(0, "NONE"),
    LOW(1, "LOW"),
    MEDIUM(2, "MEDIUM"),
    HIGH(3, "HIGH"),
    CRITICAL(4, "CRITICAL");

    public final String desc;
    public final int value;

    HostSecurityLevel(int i, String str) {
        this.value = i;
        this.desc = str;
    }
}
