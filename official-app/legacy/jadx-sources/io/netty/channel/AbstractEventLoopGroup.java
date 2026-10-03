package io.netty.channel;

import io.netty.util.concurrent.AbstractEventExecutorGroup;

/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractEventLoopGroup extends AbstractEventExecutorGroup implements EventLoopGroup {
    @Override // io.netty.util.concurrent.EventExecutorGroup, io.netty.channel.EventLoopGroup
    public abstract EventLoop next();
}
