package com.heytap.connect.netty.tcp;

import io.netty.channel.ChannelPipeline;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/heytap/connect/netty/tcp/AddChannelHandlerCallBack;", "", "Lio/netty/channel/ChannelPipeline;", "channelPipeline", "", "onAddChannelHandler", "(Lio/netty/channel/ChannelPipeline;)V", "connect_release"}, k = 1, mv = {1, 5, 1})
public interface AddChannelHandlerCallBack {
    void onAddChannelHandler(@NotNull ChannelPipeline channelPipeline);
}
