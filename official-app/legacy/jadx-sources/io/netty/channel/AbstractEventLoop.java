package io.netty.channel;

import io.netty.util.concurrent.AbstractEventExecutor;

/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractEventLoop extends AbstractEventExecutor implements EventLoop {
    public AbstractEventLoop() {
    }

    public AbstractEventLoop(EventLoopGroup eventLoopGroup) {
        super(eventLoopGroup);
    }

    @Override // io.netty.util.concurrent.AbstractEventExecutor, io.netty.util.concurrent.EventExecutor, io.netty.util.concurrent.EventExecutorGroup, io.netty.channel.EventLoopGroup
    public EventLoop next() {
        return (EventLoop) super.next();
    }

    @Override // io.netty.util.concurrent.AbstractEventExecutor, io.netty.util.concurrent.EventExecutor, io.netty.channel.EventLoop
    public EventLoopGroup parent() {
        return (EventLoopGroup) super.parent();
    }
}
