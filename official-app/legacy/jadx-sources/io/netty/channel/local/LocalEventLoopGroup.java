package io.netty.channel.local;

import io.netty.channel.DefaultEventLoopGroup;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: loaded from: classes10.dex */
@Deprecated
public class LocalEventLoopGroup extends DefaultEventLoopGroup {
    public LocalEventLoopGroup() {
    }

    public LocalEventLoopGroup(int i) {
        super(i);
    }

    public LocalEventLoopGroup(ThreadFactory threadFactory) {
        super(0, threadFactory);
    }

    public LocalEventLoopGroup(int i, ThreadFactory threadFactory) {
        super(i, threadFactory);
    }
}
