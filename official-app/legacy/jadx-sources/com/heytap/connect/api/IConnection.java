package com.heytap.connect.api;

import com.heytap.connect.netty.tcp.TCPChannelInitializer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0004H&¢\u0006\u0004\b\t\u0010\bJ\u0017\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH&¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u0010\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000f\u001a\u00020\u000eH&¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H&¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/heytap/connect/api/IConnection;", "", "Lcom/heytap/connect/netty/tcp/TCPChannelInitializer;", "tcpChannelInitializer", "", "connectTCP", "(Lcom/heytap/connect/netty/tcp/TCPChannelInitializer;)V", "connectQUIC", "()V", "close", "", "cmd", "handleHttpDnsCmd", "(Ljava/lang/String;)V", "", "connectType", "getIpAddress", "(I)Ljava/lang/String;", "", "isActive", "()Z", "connect_release"}, k = 1, mv = {1, 5, 1})
public interface IConnection {
    void close();

    void connectQUIC();

    void connectTCP(@Nullable TCPChannelInitializer tcpChannelInitializer);

    @Nullable
    String getIpAddress(int connectType);

    void handleHttpDnsCmd(@NotNull String cmd);

    boolean isActive();
}
