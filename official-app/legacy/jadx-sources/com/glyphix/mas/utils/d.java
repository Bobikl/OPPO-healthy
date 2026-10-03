package com.glyphix.mas.utils;

/* JADX INFO: loaded from: classes13.dex */
public enum d {
    Success(200, "success"),
    Unknown(1000, "unknown error"),
    MobileAppNotInstall(1001, "mobile app not install"),
    ClientClose(1002, "wear engine client disconnect"),
    DeviceNotConnect(1006, "not connect device"),
    AuthFailed(1007, "authenticate failed"),
    DeviceNoSupport(1008, "device not support feature");

    private final int a;
    private final String b;

    d(int i, String str) {
        this.a = i;
        this.b = str;
    }

    public int b() {
        return this.a;
    }

    public String c() {
        return this.b;
    }
}
