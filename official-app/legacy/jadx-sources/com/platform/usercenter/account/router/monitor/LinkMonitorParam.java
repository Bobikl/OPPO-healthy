package com.platform.usercenter.account.router.monitor;

/* JADX INFO: loaded from: classes9.dex */
public class LinkMonitorParam {
    String error;
    String linkUrl;
    String stack;
    String trackId;

    public LinkMonitorParam(String str, String str2, String str3, String str4) {
        this.linkUrl = str;
        this.trackId = str2;
        this.stack = str3;
        this.error = str4;
    }
}
