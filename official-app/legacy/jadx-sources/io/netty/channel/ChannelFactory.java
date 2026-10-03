package io.netty.channel;

import io.netty.channel.Channel;

/* JADX INFO: loaded from: classes10.dex */
public interface ChannelFactory<T extends Channel> extends io.netty.bootstrap.ChannelFactory<T> {
    @Override // io.netty.bootstrap.ChannelFactory
    T newChannel();
}
