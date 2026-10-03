package io.netty.util.concurrent;

import io.netty.util.internal.DefaultPriorityQueue;
import io.netty.util.internal.PriorityQueueNode;
import io.netty.util.internal.StringUtil;
import java.util.concurrent.Callable;
import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes10.dex */
final class ScheduledFutureTask<V> extends PromiseTask<V> implements ScheduledFuture<V>, PriorityQueueNode {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private long deadlineNanos;
    private long id;
    private final long periodNanos;
    private int queueIndex;

    public ScheduledFutureTask(AbstractScheduledEventExecutor abstractScheduledEventExecutor, Runnable runnable, long j2) {
        super(abstractScheduledEventExecutor, runnable);
        this.queueIndex = -1;
        this.deadlineNanos = j2;
        this.periodNanos = 0L;
    }

    public static long deadlineToDelayNanos(long j2, long j3) {
        if (j3 == 0) {
            return 0L;
        }
        return Math.max(0L, j3 - j2);
    }

    private AbstractScheduledEventExecutor scheduledExecutor() {
        return (AbstractScheduledEventExecutor) executor();
    }

    private static long validatePeriod(long j2) {
        if (j2 != 0) {
            return j2;
        }
        throw new IllegalArgumentException("period: 0 (expected: != 0)");
    }

    @Override // io.netty.util.concurrent.PromiseTask, io.netty.util.concurrent.DefaultPromise, io.netty.util.concurrent.Future, java.util.concurrent.Future
    public boolean cancel(boolean z) {
        boolean zCancel = super.cancel(z);
        if (zCancel) {
            scheduledExecutor().removeScheduled(this);
        }
        return zCancel;
    }

    public boolean cancelWithoutRemove(boolean z) {
        return super.cancel(z);
    }

    public long deadlineNanos() {
        return this.deadlineNanos;
    }

    public long delayNanos() {
        return delayNanos(scheduledExecutor().getCurrentTimeNanos());
    }

    @Override // io.netty.util.concurrent.DefaultPromise
    public EventExecutor executor() {
        return super.executor();
    }

    @Override // java.util.concurrent.Delayed
    public long getDelay(TimeUnit timeUnit) {
        return timeUnit.convert(delayNanos(), TimeUnit.NANOSECONDS);
    }

    @Override // io.netty.util.internal.PriorityQueueNode
    public int priorityQueueIndex(DefaultPriorityQueue<?> defaultPriorityQueue) {
        return this.queueIndex;
    }

    @Override // io.netty.util.concurrent.PromiseTask, java.util.concurrent.RunnableFuture, java.lang.Runnable
    public void run() {
        try {
            if (delayNanos() > 0) {
                if (isCancelled()) {
                    scheduledExecutor().scheduledTaskQueue().removeTyped(this);
                    return;
                } else {
                    scheduledExecutor().scheduleFromEventLoop(this);
                    return;
                }
            }
            if (this.periodNanos == 0) {
                if (setUncancellableInternal()) {
                    setSuccessInternal(runTask());
                }
            } else {
                if (isCancelled()) {
                    return;
                }
                runTask();
                if (executor().isShutdown()) {
                    return;
                }
                long j2 = this.periodNanos;
                if (j2 > 0) {
                    this.deadlineNanos += j2;
                } else {
                    this.deadlineNanos = scheduledExecutor().getCurrentTimeNanos() - this.periodNanos;
                }
                if (isCancelled()) {
                    return;
                }
                scheduledExecutor().scheduledTaskQueue().add(this);
            }
        } catch (Throwable th) {
            setFailureInternal(th);
        }
    }

    public void setConsumed() {
        if (this.periodNanos == 0) {
            this.deadlineNanos = 0L;
        }
    }

    public ScheduledFutureTask<V> setId(long j2) {
        if (this.id == 0) {
            this.id = j2;
        }
        return this;
    }

    @Override // io.netty.util.concurrent.PromiseTask, io.netty.util.concurrent.DefaultPromise
    public StringBuilder toStringBuilder() {
        StringBuilder stringBuilder = super.toStringBuilder();
        stringBuilder.setCharAt(stringBuilder.length() - 1, StringUtil.COMMA);
        stringBuilder.append(" deadline: ");
        stringBuilder.append(this.deadlineNanos);
        stringBuilder.append(", period: ");
        stringBuilder.append(this.periodNanos);
        stringBuilder.append(')');
        return stringBuilder;
    }

    @Override // java.lang.Comparable
    public int compareTo(Delayed delayed) {
        if (this == delayed) {
            return 0;
        }
        ScheduledFutureTask scheduledFutureTask = (ScheduledFutureTask) delayed;
        long jDeadlineNanos = deadlineNanos() - scheduledFutureTask.deadlineNanos();
        if (jDeadlineNanos < 0) {
            return -1;
        }
        return (jDeadlineNanos <= 0 && this.id < scheduledFutureTask.id) ? -1 : 1;
    }

    public long delayNanos(long j2) {
        return deadlineToDelayNanos(j2, this.deadlineNanos);
    }

    @Override // io.netty.util.internal.PriorityQueueNode
    public void priorityQueueIndex(DefaultPriorityQueue<?> defaultPriorityQueue, int i) {
        this.queueIndex = i;
    }

    public ScheduledFutureTask(AbstractScheduledEventExecutor abstractScheduledEventExecutor, Runnable runnable, long j2, long j3) {
        super(abstractScheduledEventExecutor, runnable);
        this.queueIndex = -1;
        this.deadlineNanos = j2;
        this.periodNanos = validatePeriod(j3);
    }

    public ScheduledFutureTask(AbstractScheduledEventExecutor abstractScheduledEventExecutor, Callable<V> callable, long j2, long j3) {
        super(abstractScheduledEventExecutor, callable);
        this.queueIndex = -1;
        this.deadlineNanos = j2;
        this.periodNanos = validatePeriod(j3);
    }

    public ScheduledFutureTask(AbstractScheduledEventExecutor abstractScheduledEventExecutor, Callable<V> callable, long j2) {
        super(abstractScheduledEventExecutor, callable);
        this.queueIndex = -1;
        this.deadlineNanos = j2;
        this.periodNanos = 0L;
    }
}
