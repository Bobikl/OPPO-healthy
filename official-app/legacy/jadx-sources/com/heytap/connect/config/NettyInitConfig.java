package com.heytap.connect.config;

import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\f\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\f\u0010\rR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\b¨\u0006\u000e"}, d2 = {"Lcom/heytap/connect/config/NettyInitConfig;", "", "", "connectTimeOut", "I", "getConnectTimeOut", "()I", "setConnectTimeOut", "(I)V", "maxBytesInMessage", "getMaxBytesInMessage", "setMaxBytesInMessage", "<init>", "()V", "connect_release"}, k = 1, mv = {1, 5, 1})
public final class NettyInitConfig {
    private int connectTimeOut = 5000;
    private int maxBytesInMessage = 1048576;

    public final int getConnectTimeOut() {
        return this.connectTimeOut;
    }

    public final int getMaxBytesInMessage() {
        return this.maxBytesInMessage;
    }

    public final void setConnectTimeOut(int i) {
        this.connectTimeOut = i;
    }

    public final void setMaxBytesInMessage(int i) {
        this.maxBytesInMessage = i;
    }
}
