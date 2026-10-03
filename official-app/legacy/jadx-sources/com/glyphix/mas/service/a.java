package com.glyphix.mas.service;

/* JADX INFO: loaded from: classes13.dex */
public enum a {
    OK(200),
    NoPermission(1001),
    NotSupportApp(1002),
    NotAutoApp(1003),
    ReplyFailed(1004),
    AutoExit(1005),
    UnknownError(1100);

    private final int a;

    a(int i2) {
        this.a = i2;
    }

    public int b() {
        return this.a;
    }
}
