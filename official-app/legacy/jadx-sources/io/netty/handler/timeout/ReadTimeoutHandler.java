package io.netty.handler.timeout;

import io.netty.channel.ChannelHandlerContext;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes10.dex */
public class ReadTimeoutHandler extends IdleStateHandler {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private boolean closed;

    public ReadTimeoutHandler(int i) {
        this(i, TimeUnit.SECONDS);
    }

    @Override // io.netty.handler.timeout.IdleStateHandler
    public final void channelIdle(ChannelHandlerContext channelHandlerContext, IdleStateEvent idleStateEvent) throws Exception {
        readTimedOut(channelHandlerContext);
    }

    public void readTimedOut(ChannelHandlerContext channelHandlerContext) throws Exception {
        if (this.closed) {
            return;
        }
        channelHandlerContext.fireExceptionCaught((Throwable) ReadTimeoutException.INSTANCE);
        channelHandlerContext.close();
        this.closed = true;
    }

    public ReadTimeoutHandler(long j2, TimeUnit timeUnit) {
        super(j2, 0L, 0L, timeUnit);
    }
}
