package io.netty.channel;

import java.util.concurrent.Executor;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: loaded from: classes10.dex */
public class DefaultEventLoopGroup extends MultithreadEventLoopGroup {
    public DefaultEventLoopGroup() {
        this(0);
    }

    public DefaultEventLoopGroup(int i) {
        this(i, (ThreadFactory) null);
    }

    @Override // io.netty.channel.MultithreadEventLoopGroup, io.netty.util.concurrent.MultithreadEventExecutorGroup
    public EventLoop newChild(Executor executor, Object... objArr) throws Exception {
        return new DefaultEventLoop(this, executor);
    }

    public DefaultEventLoopGroup(ThreadFactory threadFactory) {
        this(0, threadFactory);
    }

    public DefaultEventLoopGroup(int i, ThreadFactory threadFactory) {
        super(i, threadFactory, new Object[0]);
    }

    public DefaultEventLoopGroup(int i, Executor executor) {
        super(i, executor, new Object[0]);
    }
}
