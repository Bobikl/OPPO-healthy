package io.netty.incubator.codec.quic.track.bean;

import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u0002\u001a\u00020\u0003R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lio/netty/incubator/codec/quic/track/bean/RequestStage;", "", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "UNKNWON", "DNS", "CONNECT", "SEND", "RECV", "FIRST_REQUEST", "netty-quic_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public enum RequestStage {
    UNKNWON("unknown"),
    DNS("dns"),
    CONNECT("CONNECT"),
    SEND("send"),
    RECV("recv"),
    FIRST_REQUEST("first_request");


    @NotNull
    private final String value;

    RequestStage(String str) {
        this.value = str;
    }

    @NotNull
    /* JADX INFO: renamed from: value, reason: from getter */
    public final String getValue() {
        return this.value;
    }
}
