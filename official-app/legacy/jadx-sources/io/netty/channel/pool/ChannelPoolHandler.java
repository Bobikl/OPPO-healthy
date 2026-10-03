package io.netty.channel.pool;

import io.netty.channel.Channel;

/* JADX INFO: loaded from: classes10.dex */
public interface ChannelPoolHandler {
    void channelAcquired(Channel channel) throws Exception;

    void channelCreated(Channel channel) throws Exception;

    void channelReleased(Channel channel) throws Exception;
}
