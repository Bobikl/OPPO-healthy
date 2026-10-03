package io.netty.channel.group;

import io.netty.channel.Channel;

/* JADX INFO: loaded from: classes10.dex */
public interface ChannelMatcher {
    boolean matches(Channel channel);
}
