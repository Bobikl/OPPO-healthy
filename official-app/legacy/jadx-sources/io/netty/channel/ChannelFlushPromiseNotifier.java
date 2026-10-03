package io.netty.channel;

import io.netty.util.internal.ObjectUtil;
import java.util.ArrayDeque;
import java.util.Queue;

/* JADX INFO: loaded from: classes10.dex */
public final class ChannelFlushPromiseNotifier {
    private final Queue<FlushCheckpoint> flushCheckpoints;
    private final boolean tryNotify;
    private long writeCounter;

    public static class DefaultFlushCheckpoint implements FlushCheckpoint {
        private long checkpoint;
        private final ChannelPromise future;

        public DefaultFlushCheckpoint(long j2, ChannelPromise channelPromise) {
            this.checkpoint = j2;
            this.future = channelPromise;
        }

        @Override // io.netty.channel.ChannelFlushPromiseNotifier.FlushCheckpoint
        public long flushCheckpoint() {
            return this.checkpoint;
        }

        @Override // io.netty.channel.ChannelFlushPromiseNotifier.FlushCheckpoint
        public ChannelPromise promise() {
            return this.future;
        }

        @Override // io.netty.channel.ChannelFlushPromiseNotifier.FlushCheckpoint
        public void flushCheckpoint(long j2) {
            this.checkpoint = j2;
        }
    }

    public interface FlushCheckpoint {
        long flushCheckpoint();

        void flushCheckpoint(long j2);

        ChannelPromise promise();
    }

    public ChannelFlushPromiseNotifier(boolean z) {
        this.flushCheckpoints = new ArrayDeque();
        this.tryNotify = z;
    }

    private void notifyPromises0(Throwable th) {
        if (this.flushCheckpoints.isEmpty()) {
            this.writeCounter = 0L;
            return;
        }
        long j2 = this.writeCounter;
        while (true) {
            FlushCheckpoint flushCheckpointPeek = this.flushCheckpoints.peek();
            if (flushCheckpointPeek == null) {
                this.writeCounter = 0L;
                break;
            }
            if (flushCheckpointPeek.flushCheckpoint() > j2) {
                if (j2 > 0 && this.flushCheckpoints.size() == 1) {
                    this.writeCounter = 0L;
                    flushCheckpointPeek.flushCheckpoint(flushCheckpointPeek.flushCheckpoint() - j2);
                    break;
                } else {
                    break;
                    break;
                }
            }
            this.flushCheckpoints.remove();
            ChannelPromise channelPromisePromise = flushCheckpointPeek.promise();
            if (th == null) {
                if (this.tryNotify) {
                    channelPromisePromise.trySuccess();
                } else {
                    channelPromisePromise.setSuccess();
                }
            } else if (this.tryNotify) {
                channelPromisePromise.tryFailure(th);
            } else {
                channelPromisePromise.setFailure(th);
            }
        }
        long j3 = this.writeCounter;
        if (j3 >= 549755813888L) {
            this.writeCounter = 0L;
            for (FlushCheckpoint flushCheckpoint : this.flushCheckpoints) {
                flushCheckpoint.flushCheckpoint(flushCheckpoint.flushCheckpoint() - j3);
            }
        }
    }

    @Deprecated
    public ChannelFlushPromiseNotifier add(ChannelPromise channelPromise, int i) {
        return add(channelPromise, i);
    }

    public ChannelFlushPromiseNotifier increaseWriteCounter(long j2) {
        ObjectUtil.checkPositiveOrZero(j2, "delta");
        this.writeCounter += j2;
        return this;
    }

    @Deprecated
    public ChannelFlushPromiseNotifier notifyFlushFutures() {
        return notifyPromises();
    }

    public ChannelFlushPromiseNotifier notifyPromises() {
        notifyPromises0(null);
        return this;
    }

    public long writeCounter() {
        return this.writeCounter;
    }

    public ChannelFlushPromiseNotifier add(ChannelPromise channelPromise, long j2) {
        ObjectUtil.checkNotNull(channelPromise, "promise");
        ObjectUtil.checkPositiveOrZero(j2, "pendingDataSize");
        long j3 = this.writeCounter + j2;
        if (channelPromise instanceof FlushCheckpoint) {
            FlushCheckpoint flushCheckpoint = (FlushCheckpoint) channelPromise;
            flushCheckpoint.flushCheckpoint(j3);
            this.flushCheckpoints.add(flushCheckpoint);
        } else {
            this.flushCheckpoints.add(new DefaultFlushCheckpoint(j3, channelPromise));
        }
        return this;
    }

    @Deprecated
    public ChannelFlushPromiseNotifier notifyFlushFutures(Throwable th) {
        return notifyPromises(th);
    }

    public ChannelFlushPromiseNotifier notifyPromises(Throwable th) {
        notifyPromises();
        while (true) {
            FlushCheckpoint flushCheckpointPoll = this.flushCheckpoints.poll();
            if (flushCheckpointPoll == null) {
                return this;
            }
            if (this.tryNotify) {
                flushCheckpointPoll.promise().tryFailure(th);
            } else {
                flushCheckpointPoll.promise().setFailure(th);
            }
        }
    }

    @Deprecated
    public ChannelFlushPromiseNotifier notifyFlushFutures(Throwable th, Throwable th2) {
        return notifyPromises(th, th2);
    }

    public ChannelFlushPromiseNotifier() {
        this(false);
    }

    public ChannelFlushPromiseNotifier notifyPromises(Throwable th, Throwable th2) {
        notifyPromises0(th);
        while (true) {
            FlushCheckpoint flushCheckpointPoll = this.flushCheckpoints.poll();
            if (flushCheckpointPoll == null) {
                return this;
            }
            if (this.tryNotify) {
                flushCheckpointPoll.promise().tryFailure(th2);
            } else {
                flushCheckpointPoll.promise().setFailure(th2);
            }
        }
    }
}
