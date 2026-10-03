package io.netty.util.concurrent;

import com.heytap.speech.engine.constant.EngineConstant;
import io.netty.util.internal.DefaultPriorityQueue;
import io.netty.util.internal.ObjectUtil;
import io.netty.util.internal.PriorityQueue;
import java.util.Comparator;
import java.util.Queue;
import java.util.concurrent.Callable;
import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractScheduledEventExecutor extends AbstractEventExecutor {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final Comparator<ScheduledFutureTask<?>> SCHEDULED_FUTURE_TASK_COMPARATOR = new Comparator<ScheduledFutureTask<?>>() { // from class: io.netty.util.concurrent.AbstractScheduledEventExecutor.1
        @Override // java.util.Comparator
        public int compare(ScheduledFutureTask<?> scheduledFutureTask, ScheduledFutureTask<?> scheduledFutureTask2) {
            return scheduledFutureTask.compareTo((Delayed) scheduledFutureTask2);
        }
    };
    private static final long START_TIME = System.nanoTime();
    static final Runnable WAKEUP_TASK = new Runnable() { // from class: io.netty.util.concurrent.AbstractScheduledEventExecutor.2
        @Override // java.lang.Runnable
        public void run() {
        }
    };
    long nextTaskId;
    PriorityQueue<ScheduledFutureTask<?>> scheduledTaskQueue;

    public AbstractScheduledEventExecutor() {
    }

    public static long deadlineNanos(long j2, long j3) {
        long j4 = j2 + j3;
        if (j4 < 0) {
            return Long.MAX_VALUE;
        }
        return j4;
    }

    public static long deadlineToDelayNanos(long j2) {
        return ScheduledFutureTask.deadlineToDelayNanos(defaultCurrentTimeNanos(), j2);
    }

    public static long defaultCurrentTimeNanos() {
        return System.nanoTime() - START_TIME;
    }

    public static long initialNanoTime() {
        return START_TIME;
    }

    private static boolean isNullOrEmpty(Queue<ScheduledFutureTask<?>> queue) {
        return queue == null || queue.isEmpty();
    }

    @Deprecated
    public static long nanoTime() {
        return defaultCurrentTimeNanos();
    }

    private void validateScheduled0(long j2, TimeUnit timeUnit) {
        validateScheduled(j2, timeUnit);
    }

    public boolean afterScheduledTaskSubmitted(long j2) {
        return true;
    }

    public boolean beforeScheduledTaskSubmitted(long j2) {
        return true;
    }

    public void cancelScheduledTasks() {
        PriorityQueue<ScheduledFutureTask<?>> priorityQueue = this.scheduledTaskQueue;
        if (isNullOrEmpty(priorityQueue)) {
            return;
        }
        for (ScheduledFutureTask scheduledFutureTask : (ScheduledFutureTask[]) priorityQueue.toArray(new ScheduledFutureTask[0])) {
            scheduledFutureTask.cancelWithoutRemove(false);
        }
        priorityQueue.clearIgnoringIndexes();
    }

    public long getCurrentTimeNanos() {
        return defaultCurrentTimeNanos();
    }

    public final boolean hasScheduledTasks() {
        ScheduledFutureTask<?> scheduledFutureTaskPeekScheduledTask = peekScheduledTask();
        return scheduledFutureTaskPeekScheduledTask != null && scheduledFutureTaskPeekScheduledTask.deadlineNanos() <= getCurrentTimeNanos();
    }

    public final long nextScheduledTaskDeadlineNanos() {
        ScheduledFutureTask<?> scheduledFutureTaskPeekScheduledTask = peekScheduledTask();
        if (scheduledFutureTaskPeekScheduledTask != null) {
            return scheduledFutureTaskPeekScheduledTask.deadlineNanos();
        }
        return -1L;
    }

    public final long nextScheduledTaskNano() {
        ScheduledFutureTask<?> scheduledFutureTaskPeekScheduledTask = peekScheduledTask();
        if (scheduledFutureTaskPeekScheduledTask != null) {
            return scheduledFutureTaskPeekScheduledTask.delayNanos();
        }
        return -1L;
    }

    public final ScheduledFutureTask<?> peekScheduledTask() {
        PriorityQueue<ScheduledFutureTask<?>> priorityQueue = this.scheduledTaskQueue;
        if (priorityQueue != null) {
            return priorityQueue.peek();
        }
        return null;
    }

    public final Runnable pollScheduledTask() {
        return pollScheduledTask(getCurrentTimeNanos());
    }

    public final void removeScheduled(ScheduledFutureTask<?> scheduledFutureTask) {
        if (inEventLoop()) {
            scheduledTaskQueue().removeTyped(scheduledFutureTask);
        } else {
            lazyExecute(scheduledFutureTask);
        }
    }

    public final void scheduleFromEventLoop(ScheduledFutureTask<?> scheduledFutureTask) {
        PriorityQueue<ScheduledFutureTask<?>> priorityQueueScheduledTaskQueue = scheduledTaskQueue();
        long j2 = this.nextTaskId + 1;
        this.nextTaskId = j2;
        priorityQueueScheduledTaskQueue.add(scheduledFutureTask.setId(j2));
    }

    public PriorityQueue<ScheduledFutureTask<?>> scheduledTaskQueue() {
        if (this.scheduledTaskQueue == null) {
            this.scheduledTaskQueue = new DefaultPriorityQueue(SCHEDULED_FUTURE_TASK_COMPARATOR, 11);
        }
        return this.scheduledTaskQueue;
    }

    @Deprecated
    public void validateScheduled(long j2, TimeUnit timeUnit) {
    }

    public AbstractScheduledEventExecutor(EventExecutorGroup eventExecutorGroup) {
        super(eventExecutorGroup);
    }

    public final Runnable pollScheduledTask(long j2) {
        ScheduledFutureTask<?> scheduledFutureTaskPeekScheduledTask = peekScheduledTask();
        if (scheduledFutureTaskPeekScheduledTask == null || scheduledFutureTaskPeekScheduledTask.deadlineNanos() - j2 > 0) {
            return null;
        }
        this.scheduledTaskQueue.remove();
        scheduledFutureTaskPeekScheduledTask.setConsumed();
        return scheduledFutureTaskPeekScheduledTask;
    }

    @Override // io.netty.util.concurrent.AbstractEventExecutor, java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture<?> scheduleAtFixedRate(Runnable runnable, long j2, long j3, TimeUnit timeUnit) {
        ObjectUtil.checkNotNull(runnable, EngineConstant.WAKEUP_TYPE_COMMAND);
        ObjectUtil.checkNotNull(timeUnit, "unit");
        if (j2 < 0) {
            throw new IllegalArgumentException(String.format("initialDelay: %d (expected: >= 0)", Long.valueOf(j2)));
        }
        if (j3 <= 0) {
            throw new IllegalArgumentException(String.format("period: %d (expected: > 0)", Long.valueOf(j3)));
        }
        validateScheduled0(j2, timeUnit);
        validateScheduled0(j3, timeUnit);
        return schedule(new ScheduledFutureTask(this, runnable, deadlineNanos(getCurrentTimeNanos(), timeUnit.toNanos(j2)), timeUnit.toNanos(j3)));
    }

    @Override // io.netty.util.concurrent.AbstractEventExecutor, java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture<?> scheduleWithFixedDelay(Runnable runnable, long j2, long j3, TimeUnit timeUnit) {
        ObjectUtil.checkNotNull(runnable, EngineConstant.WAKEUP_TYPE_COMMAND);
        ObjectUtil.checkNotNull(timeUnit, "unit");
        if (j2 < 0) {
            throw new IllegalArgumentException(String.format("initialDelay: %d (expected: >= 0)", Long.valueOf(j2)));
        }
        if (j3 <= 0) {
            throw new IllegalArgumentException(String.format("delay: %d (expected: > 0)", Long.valueOf(j3)));
        }
        validateScheduled0(j2, timeUnit);
        validateScheduled0(j3, timeUnit);
        return schedule(new ScheduledFutureTask(this, runnable, deadlineNanos(getCurrentTimeNanos(), timeUnit.toNanos(j2)), -timeUnit.toNanos(j3)));
    }

    @Override // io.netty.util.concurrent.AbstractEventExecutor, java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture<?> schedule(Runnable runnable, long j2, TimeUnit timeUnit) {
        ObjectUtil.checkNotNull(runnable, EngineConstant.WAKEUP_TYPE_COMMAND);
        ObjectUtil.checkNotNull(timeUnit, "unit");
        if (j2 < 0) {
            j2 = 0;
        }
        validateScheduled0(j2, timeUnit);
        return schedule(new ScheduledFutureTask(this, runnable, deadlineNanos(getCurrentTimeNanos(), timeUnit.toNanos(j2))));
    }

    @Override // io.netty.util.concurrent.AbstractEventExecutor, java.util.concurrent.ScheduledExecutorService
    public <V> ScheduledFuture<V> schedule(Callable<V> callable, long j2, TimeUnit timeUnit) {
        ObjectUtil.checkNotNull(callable, "callable");
        ObjectUtil.checkNotNull(timeUnit, "unit");
        if (j2 < 0) {
            j2 = 0;
        }
        validateScheduled0(j2, timeUnit);
        return schedule(new ScheduledFutureTask<>(this, callable, deadlineNanos(getCurrentTimeNanos(), timeUnit.toNanos(j2))));
    }

    private <V> ScheduledFuture<V> schedule(ScheduledFutureTask<V> scheduledFutureTask) {
        if (inEventLoop()) {
            scheduleFromEventLoop(scheduledFutureTask);
        } else {
            long jDeadlineNanos = scheduledFutureTask.deadlineNanos();
            if (beforeScheduledTaskSubmitted(jDeadlineNanos)) {
                execute(scheduledFutureTask);
            } else {
                lazyExecute(scheduledFutureTask);
                if (afterScheduledTaskSubmitted(jDeadlineNanos)) {
                    execute(WAKEUP_TASK);
                }
            }
        }
        return scheduledFutureTask;
    }
}
