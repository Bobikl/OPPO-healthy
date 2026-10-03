package com.heytap.okhttp.extension.track.bean;

import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u0002\u001a\u00020\u0003R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/heytap/okhttp/extension/track/bean/CallStage;", "", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "UNKNWON", "NDS", "SOKCET_CONNECT", "TLS_CONNECT", "WRITE_HEADER", "READ_HEADER", "WRITE_BODY", "READ_BODY", "okhttp4_extension_release"}, k = 1, mv = {1, 4, 0})
public enum CallStage {
    UNKNWON("unknown"),
    NDS("dns"),
    SOKCET_CONNECT("socket_connect"),
    TLS_CONNECT("tls_connect"),
    WRITE_HEADER("write_header"),
    READ_HEADER("read_header"),
    WRITE_BODY("write_body"),
    READ_BODY("read_body");

    private final String value;

    CallStage(String str) {
        this.value = str;
    }

    @NotNull
    /* JADX INFO: renamed from: value, reason: from getter */
    public final String getValue() {
        return this.value;
    }
}
