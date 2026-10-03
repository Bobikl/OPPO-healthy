package io.netty.channel.embedded;

import com.heytap.speech.engine.constant.EngineConstant;
import io.netty.channel.Channel;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelPromise;
import io.netty.channel.DefaultChannelPromise;
import io.netty.channel.EventLoop;
import io.netty.channel.EventLoopGroup;
import io.netty.util.concurrent.AbstractScheduledEventExecutor;
import io.netty.util.concurrent.Future;
import io.netty.util.internal.ObjectUtil;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes10.dex */
final class EmbeddedEventLoop extends AbstractScheduledEventExecutor implements EventLoop {
    private final Queue<Runnable> tasks = new ArrayDeque(2);

    @Override // java.util.concurrent.ExecutorService
    public boolean awaitTermination(long j2, TimeUnit timeUnit) {
        return false;
    }

    @Override // io.netty.util.concurrent.AbstractScheduledEventExecutor
    public void cancelScheduledTasks() {
        super.cancelScheduledTasks();
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.tasks.add((Runnable) ObjectUtil.checkNotNull(runnable, EngineConstant.WAKEUP_TYPE_COMMAND));
    }

    @Override // io.netty.util.concurrent.AbstractEventExecutor, io.netty.util.concurrent.EventExecutor
    public boolean inEventLoop() {
        return true;
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isShutdown() {
        return false;
    }

    @Override // io.netty.util.concurrent.EventExecutorGroup
    public boolean isShuttingDown() {
        return false;
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isTerminated() {
        return false;
    }

    public long nextScheduledTask() {
        return nextScheduledTaskNano();
    }

    @Override // io.netty.channel.EventLoopGroup
    public ChannelFuture register(Channel channel) {
        return register(new DefaultChannelPromise(channel, this));
    }

    public long runScheduledTasks() {
        long jNanoTime = AbstractScheduledEventExecutor.nanoTime();
        while (true) {
            Runnable runnablePollScheduledTask = pollScheduledTask(jNanoTime);
            if (runnablePollScheduledTask == null) {
                return nextScheduledTaskNano();
            }
            runnablePollScheduledTask.run();
        }
    }

    public void runTasks() {
        while (true) {
            Runnable runnablePoll = this.tasks.poll();
            if (runnablePoll == null) {
                return;
            } else {
                runnablePoll.run();
            }
        }
    }

    @Override // io.netty.util.concurrent.AbstractEventExecutor, java.util.concurrent.ExecutorService, io.netty.util.concurrent.EventExecutorGroup
    @Deprecated
    public void shutdown() {
        throw new UnsupportedOperationException();
    }

    @Override // io.netty.util.concurrent.EventExecutorGroup
    public Future<?> shutdownGracefully(long j2, long j3, TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    @Override // io.netty.util.concurrent.EventExecutorGroup
    public Future<?> terminationFuture() {
        throw new UnsupportedOperationException();
    }

    @Override // io.netty.util.concurrent.EventExecutor
    public boolean inEventLoop(Thread thread) {
        return true;
    }

    @Override // io.netty.util.concurrent.AbstractEventExecutor, io.netty.util.concurrent.EventExecutor, io.netty.util.concurrent.EventExecutorGroup, io.netty.channel.EventLoopGroup
    public EventLoop next() {
        return (EventLoop) super.next();
    }

    @Override // io.netty.util.concurrent.AbstractEventExecutor, io.netty.util.concurrent.EventExecutor, io.netty.channel.EventLoop
    public EventLoopGroup parent() {
        return (EventLoopGroup) super.parent();
    }

    @Override // io.netty.channel.EventLoopGroup
    public ChannelFuture register(ChannelPromise channelPromise) {
        ObjectUtil.checkNotNull(channelPromise, "promise");
        channelPromise.channel().unsafe().register(this, channelPromise);
        return channelPromise;
    }

    @Override // io.netty.channel.EventLoopGroup
    @Deprecated
    public ChannelFuture register(Channel channel, ChannelPromise channelPromise) {
        channel.unsafe().register(this, channelPromise);
        return channelPromise;
    }
}
