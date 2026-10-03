package com.oplus.web.container.safe.model;

/* JADX INFO: loaded from: classes2.dex */
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
