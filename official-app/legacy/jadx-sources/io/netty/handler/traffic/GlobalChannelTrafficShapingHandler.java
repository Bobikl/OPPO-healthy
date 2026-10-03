package io.netty.handler.traffic;

import io.netty.buffer.ByteBuf;
import io.netty.channel.Channel;
import io.netty.channel.ChannelConfig;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelPromise;
import io.netty.util.Attribute;
import io.netty.util.internal.ObjectUtil;
import io.netty.util.internal.PlatformDependent;
import io.netty.util.internal.logging.InternalLogger;
import io.netty.util.internal.logging.InternalLoggerFactory;
import java.util.AbstractCollection;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes10.dex */
@ChannelHandler.Sharable
public class GlobalChannelTrafficShapingHandler extends AbstractTrafficShapingHandler {
    private static final float DEFAULT_ACCELERATION = -0.1f;
    private static final float DEFAULT_DEVIATION = 0.1f;
    private static final float DEFAULT_SLOWDOWN = 0.4f;
    private static final float MAX_DEVIATION = 0.4f;
    private static final InternalLogger logger = InternalLoggerFactory.getInstance((Class<?>) GlobalChannelTrafficShapingHandler.class);
    private volatile float accelerationFactor;
    final ConcurrentMap<Integer, PerChannel> channelQueues;
    private final AtomicLong cumulativeReadBytes;
    private final AtomicLong cumulativeWrittenBytes;
    private volatile float maxDeviation;
    volatile long maxGlobalWriteSize;
    private final AtomicLong queuesSize;
    private volatile long readChannelLimit;
    private volatile boolean readDeviationActive;
    private volatile float slowDownFactor;
    private volatile long writeChannelLimit;
    private volatile boolean writeDeviationActive;

    public static final class PerChannel {
        TrafficCounter channelTrafficCounter;
        long lastReadTimestamp;
        long lastWriteTimestamp;
        ArrayDeque<ToSend> messagesQueue;
        long queueSize;
    }

    public static final class ToSend {
        final ChannelPromise promise;
        final long relativeTimeAction;
        final long size;
        final Object toSend;

        private ToSend(long j2, Object obj, long j3, ChannelPromise channelPromise) {
            this.relativeTimeAction = j2;
            this.toSend = obj;
            this.size = j3;
            this.promise = channelPromise;
        }
    }

    public GlobalChannelTrafficShapingHandler(ScheduledExecutorService scheduledExecutorService, long j2, long j3, long j4, long j5, long j6, long j7) {
        super(j2, j3, j6, j7);
        this.channelQueues = PlatformDependent.newConcurrentHashMap();
        this.queuesSize = new AtomicLong();
        this.cumulativeWrittenBytes = new AtomicLong();
        this.cumulativeReadBytes = new AtomicLong();
        this.maxGlobalWriteSize = 419430400L;
        createGlobalTrafficCounter(scheduledExecutorService);
        this.writeChannelLimit = j4;
        this.readChannelLimit = j5;
    }

    private long computeBalancedWait(float f, float f2, long j2) {
        float f3;
        if (f2 == 0.0f) {
            return j2;
        }
        float f4 = f / f2;
        if (f4 <= this.maxDeviation) {
            f3 = this.accelerationFactor;
        } else {
            if (f4 < 1.0f - this.maxDeviation) {
                return j2;
            }
            f3 = this.slowDownFactor;
            if (j2 < 10) {
                j2 = 10;
            }
        }
        return (long) (j2 * f3);
    }

    private void computeDeviationCumulativeBytes() {
        long j2 = 0;
        long j3 = Long.MAX_VALUE;
        long j4 = Long.MAX_VALUE;
        long j5 = 0;
        for (PerChannel perChannel : this.channelQueues.values()) {
            long jCumulativeWrittenBytes = perChannel.channelTrafficCounter.cumulativeWrittenBytes();
            if (j2 < jCumulativeWrittenBytes) {
                j2 = jCumulativeWrittenBytes;
            }
            if (j3 > jCumulativeWrittenBytes) {
                j3 = jCumulativeWrittenBytes;
            }
            long jCumulativeReadBytes = perChannel.channelTrafficCounter.cumulativeReadBytes();
            if (j5 < jCumulativeReadBytes) {
                j5 = jCumulativeReadBytes;
            }
            if (j4 > jCumulativeReadBytes) {
                j4 = jCumulativeReadBytes;
            }
        }
        boolean z = false;
        boolean z2 = this.channelQueues.size() > 1;
        this.readDeviationActive = z2 && j4 < j5 / 2;
        if (z2 && j3 < j2 / 2) {
            z = true;
        }
        this.writeDeviationActive = z;
        this.cumulativeWrittenBytes.set(j2);
        this.cumulativeReadBytes.set(j5);
    }

    private PerChannel getOrSetPerChannel(ChannelHandlerContext channelHandlerContext) {
        Integer numValueOf = Integer.valueOf(channelHandlerContext.channel().hashCode());
        PerChannel perChannel = this.channelQueues.get(numValueOf);
        if (perChannel != null) {
            return perChannel;
        }
        PerChannel perChannel2 = new PerChannel();
        perChannel2.messagesQueue = new ArrayDeque<>();
        perChannel2.channelTrafficCounter = new TrafficCounter(this, null, "ChannelTC" + channelHandlerContext.channel().hashCode(), this.checkInterval);
        perChannel2.queueSize = 0L;
        long jMilliSecondFromNano = TrafficCounter.milliSecondFromNano();
        perChannel2.lastReadTimestamp = jMilliSecondFromNano;
        perChannel2.lastWriteTimestamp = jMilliSecondFromNano;
        this.channelQueues.put(numValueOf, perChannel2);
        return perChannel2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendAllValid(ChannelHandlerContext channelHandlerContext, PerChannel perChannel, long j2) {
        synchronized (perChannel) {
            ToSend toSendPollFirst = perChannel.messagesQueue.pollFirst();
            while (toSendPollFirst != null) {
                if (toSendPollFirst.relativeTimeAction > j2) {
                    perChannel.messagesQueue.addFirst(toSendPollFirst);
                    break;
                }
                long j3 = toSendPollFirst.size;
                this.trafficCounter.bytesRealWriteFlowControl(j3);
                perChannel.channelTrafficCounter.bytesRealWriteFlowControl(j3);
                perChannel.queueSize -= j3;
                this.queuesSize.addAndGet(-j3);
                channelHandlerContext.write(toSendPollFirst.toSend, toSendPollFirst.promise);
                perChannel.lastWriteTimestamp = j2;
                toSendPollFirst = perChannel.messagesQueue.pollFirst();
            }
            if (perChannel.messagesQueue.isEmpty()) {
                releaseWriteSuspended(channelHandlerContext);
            }
        }
        channelHandlerContext.flush();
    }

    public float accelerationFactor() {
        return this.accelerationFactor;
    }

    @Override // io.netty.handler.traffic.AbstractTrafficShapingHandler, io.netty.channel.ChannelInboundHandlerAdapter, io.netty.channel.ChannelInboundHandler
    public void channelRead(ChannelHandlerContext channelHandlerContext, Object obj) throws Exception {
        long j2;
        long jCalculateSize = calculateSize(obj);
        long jMilliSecondFromNano = TrafficCounter.milliSecondFromNano();
        long jComputeBalancedWait = 0;
        if (jCalculateSize > 0) {
            long timeToWait = this.trafficCounter.readTimeToWait(jCalculateSize, getReadLimit(), this.maxTime, jMilliSecondFromNano);
            PerChannel perChannel = this.channelQueues.get(Integer.valueOf(channelHandlerContext.channel().hashCode()));
            if (perChannel != null) {
                long timeToWait2 = perChannel.channelTrafficCounter.readTimeToWait(jCalculateSize, this.readChannelLimit, this.maxTime, jMilliSecondFromNano);
                if (this.readDeviationActive) {
                    long jCumulativeReadBytes = perChannel.channelTrafficCounter.cumulativeReadBytes();
                    long j3 = this.cumulativeReadBytes.get();
                    jComputeBalancedWait = jCumulativeReadBytes > 0 ? jCumulativeReadBytes : 0L;
                    if (j3 < jComputeBalancedWait) {
                        j3 = jComputeBalancedWait;
                    }
                    jComputeBalancedWait = computeBalancedWait(jComputeBalancedWait, j3, timeToWait2);
                } else {
                    jComputeBalancedWait = timeToWait2;
                }
            }
            if (jComputeBalancedWait < timeToWait) {
                jComputeBalancedWait = timeToWait;
            }
            j2 = jMilliSecondFromNano;
            long jCheckWaitReadTime = checkWaitReadTime(channelHandlerContext, jComputeBalancedWait, jMilliSecondFromNano);
            if (jCheckWaitReadTime >= 10) {
                Channel channel = channelHandlerContext.channel();
                ChannelConfig channelConfigConfig = channel.config();
                InternalLogger internalLogger = logger;
                if (internalLogger.isDebugEnabled()) {
                    internalLogger.debug("Read Suspend: " + jCheckWaitReadTime + ':' + channelConfigConfig.isAutoRead() + ':' + AbstractTrafficShapingHandler.isHandlerActive(channelHandlerContext));
                }
                if (channelConfigConfig.isAutoRead() && AbstractTrafficShapingHandler.isHandlerActive(channelHandlerContext)) {
                    channelConfigConfig.setAutoRead(false);
                    channel.attr(AbstractTrafficShapingHandler.READ_SUSPENDED).set(Boolean.TRUE);
                    Attribute attributeAttr = channel.attr(AbstractTrafficShapingHandler.REOPEN_TASK);
                    Runnable reopenReadTimerTask = (Runnable) attributeAttr.get();
                    if (reopenReadTimerTask == null) {
                        reopenReadTimerTask = new AbstractTrafficShapingHandler.ReopenReadTimerTask(channelHandlerContext);
                        attributeAttr.set(reopenReadTimerTask);
                    }
                    channelHandlerContext.executor().schedule(reopenReadTimerTask, jCheckWaitReadTime, TimeUnit.MILLISECONDS);
                    if (internalLogger.isDebugEnabled()) {
                        internalLogger.debug("Suspend final status => " + channelConfigConfig.isAutoRead() + ':' + AbstractTrafficShapingHandler.isHandlerActive(channelHandlerContext) + " will reopened at: " + jCheckWaitReadTime);
                    }
                }
            }
        } else {
            j2 = jMilliSecondFromNano;
        }
        informReadOperation(channelHandlerContext, j2);
        channelHandlerContext.fireChannelRead(obj);
    }

    public Collection<TrafficCounter> channelTrafficCounters() {
        return new AbstractCollection<TrafficCounter>() { // from class: io.netty.handler.traffic.GlobalChannelTrafficShapingHandler.1
            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
            public Iterator<TrafficCounter> iterator() {
                return new Iterator<TrafficCounter>() { // from class: io.netty.handler.traffic.GlobalChannelTrafficShapingHandler.1.1
                    final Iterator<PerChannel> iter;

                    {
                        this.iter = GlobalChannelTrafficShapingHandler.this.channelQueues.values().iterator();
                    }

                    @Override // java.util.Iterator
                    public boolean hasNext() {
                        return this.iter.hasNext();
                    }

                    @Override // java.util.Iterator
                    public void remove() {
                        throw new UnsupportedOperationException();
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // java.util.Iterator
                    public TrafficCounter next() {
                        return this.iter.next().channelTrafficCounter;
                    }
                };
            }

            @Override // java.util.AbstractCollection, java.util.Collection
            public int size() {
                return GlobalChannelTrafficShapingHandler.this.channelQueues.size();
            }
        };
    }

    @Override // io.netty.handler.traffic.AbstractTrafficShapingHandler
    public long checkWaitReadTime(ChannelHandlerContext channelHandlerContext, long j2, long j3) {
        PerChannel perChannel = this.channelQueues.get(Integer.valueOf(channelHandlerContext.channel().hashCode()));
        return (perChannel == null || j2 <= this.maxTime || (j3 + j2) - perChannel.lastReadTimestamp <= this.maxTime) ? j2 : this.maxTime;
    }

    public void configureChannel(long j2, long j3) {
        this.writeChannelLimit = j2;
        this.readChannelLimit = j3;
        long jMilliSecondFromNano = TrafficCounter.milliSecondFromNano();
        Iterator<PerChannel> it = this.channelQueues.values().iterator();
        while (it.hasNext()) {
            it.next().channelTrafficCounter.resetAccounting(jMilliSecondFromNano);
        }
    }

    public void createGlobalTrafficCounter(ScheduledExecutorService scheduledExecutorService) {
        setMaxDeviation(0.1f, 0.4f, DEFAULT_ACCELERATION);
        ObjectUtil.checkNotNullWithIAE(scheduledExecutorService, "executor");
        GlobalChannelTrafficCounter globalChannelTrafficCounter = new GlobalChannelTrafficCounter(this, scheduledExecutorService, "GlobalChannelTC", this.checkInterval);
        setTrafficCounter(globalChannelTrafficCounter);
        globalChannelTrafficCounter.start();
    }

    @Override // io.netty.handler.traffic.AbstractTrafficShapingHandler
    public void doAccounting(TrafficCounter trafficCounter) {
        computeDeviationCumulativeBytes();
        super.doAccounting(trafficCounter);
    }

    public long getMaxGlobalWriteSize() {
        return this.maxGlobalWriteSize;
    }

    public long getReadChannelLimit() {
        return this.readChannelLimit;
    }

    public long getWriteChannelLimit() {
        return this.writeChannelLimit;
    }

    @Override // io.netty.channel.ChannelHandlerAdapter, io.netty.channel.ChannelHandler
    public void handlerAdded(ChannelHandlerContext channelHandlerContext) throws Exception {
        getOrSetPerChannel(channelHandlerContext);
        this.trafficCounter.resetCumulativeTime();
        super.handlerAdded(channelHandlerContext);
    }

    @Override // io.netty.handler.traffic.AbstractTrafficShapingHandler, io.netty.channel.ChannelHandlerAdapter, io.netty.channel.ChannelHandler
    public void handlerRemoved(ChannelHandlerContext channelHandlerContext) throws Exception {
        this.trafficCounter.resetCumulativeTime();
        Channel channel = channelHandlerContext.channel();
        PerChannel perChannelRemove = this.channelQueues.remove(Integer.valueOf(channel.hashCode()));
        if (perChannelRemove != null) {
            synchronized (perChannelRemove) {
                if (channel.isActive()) {
                    for (ToSend toSend : perChannelRemove.messagesQueue) {
                        long jCalculateSize = calculateSize(toSend.toSend);
                        this.trafficCounter.bytesRealWriteFlowControl(jCalculateSize);
                        perChannelRemove.channelTrafficCounter.bytesRealWriteFlowControl(jCalculateSize);
                        perChannelRemove.queueSize -= jCalculateSize;
                        this.queuesSize.addAndGet(-jCalculateSize);
                        channelHandlerContext.write(toSend.toSend, toSend.promise);
                    }
                } else {
                    this.queuesSize.addAndGet(-perChannelRemove.queueSize);
                    Iterator<ToSend> it = perChannelRemove.messagesQueue.iterator();
                    while (it.hasNext()) {
                        Object obj = it.next().toSend;
                        if (obj instanceof ByteBuf) {
                            ((ByteBuf) obj).release();
                        }
                    }
                }
                perChannelRemove.messagesQueue.clear();
            }
        }
        releaseWriteSuspended(channelHandlerContext);
        releaseReadSuspended(channelHandlerContext);
        super.handlerRemoved(channelHandlerContext);
    }

    @Override // io.netty.handler.traffic.AbstractTrafficShapingHandler
    public void informReadOperation(ChannelHandlerContext channelHandlerContext, long j2) {
        PerChannel perChannel = this.channelQueues.get(Integer.valueOf(channelHandlerContext.channel().hashCode()));
        if (perChannel != null) {
            perChannel.lastReadTimestamp = j2;
        }
    }

    public float maxDeviation() {
        return this.maxDeviation;
    }

    public long maximumCumulativeReadBytes() {
        return this.cumulativeReadBytes.get();
    }

    public long maximumCumulativeWrittenBytes() {
        return this.cumulativeWrittenBytes.get();
    }

    public long queuesSize() {
        return this.queuesSize.get();
    }

    public final void release() {
        this.trafficCounter.stop();
    }

    public void setMaxDeviation(float f, float f2, float f3) {
        if (f > 0.4f) {
            throw new IllegalArgumentException("maxDeviation must be <= 0.4");
        }
        ObjectUtil.checkPositiveOrZero(f2, "slowDownFactor");
        if (f3 > 0.0f) {
            throw new IllegalArgumentException("accelerationFactor must be <= 0");
        }
        this.maxDeviation = f;
        this.accelerationFactor = f3 + 1.0f;
        this.slowDownFactor = f2 + 1.0f;
    }

    public void setMaxGlobalWriteSize(long j2) {
        this.maxGlobalWriteSize = ObjectUtil.checkPositive(j2, "maxGlobalWriteSize");
    }

    public void setReadChannelLimit(long j2) {
        this.readChannelLimit = j2;
        long jMilliSecondFromNano = TrafficCounter.milliSecondFromNano();
        Iterator<PerChannel> it = this.channelQueues.values().iterator();
        while (it.hasNext()) {
            it.next().channelTrafficCounter.resetAccounting(jMilliSecondFromNano);
        }
    }

    public void setWriteChannelLimit(long j2) {
        this.writeChannelLimit = j2;
        long jMilliSecondFromNano = TrafficCounter.milliSecondFromNano();
        Iterator<PerChannel> it = this.channelQueues.values().iterator();
        while (it.hasNext()) {
            it.next().channelTrafficCounter.resetAccounting(jMilliSecondFromNano);
        }
    }

    public float slowDownFactor() {
        return this.slowDownFactor;
    }

    @Override // io.netty.handler.traffic.AbstractTrafficShapingHandler
    public void submitWrite(final ChannelHandlerContext channelHandlerContext, Object obj, long j2, long j3, long j4, ChannelPromise channelPromise) {
        PerChannel orSetPerChannel = this.channelQueues.get(Integer.valueOf(channelHandlerContext.channel().hashCode()));
        if (orSetPerChannel == null) {
            orSetPerChannel = getOrSetPerChannel(channelHandlerContext);
        }
        final PerChannel perChannel = orSetPerChannel;
        synchronized (perChannel) {
            if (j3 == 0) {
                if (perChannel.messagesQueue.isEmpty()) {
                    this.trafficCounter.bytesRealWriteFlowControl(j2);
                    perChannel.channelTrafficCounter.bytesRealWriteFlowControl(j2);
                    channelHandlerContext.write(obj, channelPromise);
                    perChannel.lastWriteTimestamp = j4;
                    return;
                }
            }
            long j5 = (j3 <= this.maxTime || (j4 + j3) - perChannel.lastWriteTimestamp <= this.maxTime) ? j3 : this.maxTime;
            ToSend toSend = new ToSend(j5 + j4, obj, j2, channelPromise);
            perChannel.messagesQueue.addLast(toSend);
            perChannel.queueSize += j2;
            this.queuesSize.addAndGet(j2);
            checkWriteSuspend(channelHandlerContext, j5, perChannel.queueSize);
            boolean z = this.queuesSize.get() > this.maxGlobalWriteSize;
            if (z) {
                setUserDefinedWritability(channelHandlerContext, false);
            }
            final long j6 = toSend.relativeTimeAction;
            channelHandlerContext.executor().schedule(new Runnable() { // from class: io.netty.handler.traffic.GlobalChannelTrafficShapingHandler.2
                @Override // java.lang.Runnable
                public void run() {
                    GlobalChannelTrafficShapingHandler.this.sendAllValid(channelHandlerContext, perChannel, j6);
                }
            }, j5, TimeUnit.MILLISECONDS);
        }
    }

    @Override // io.netty.handler.traffic.AbstractTrafficShapingHandler
    public String toString() {
        StringBuilder sb = new StringBuilder(340);
        sb.append(super.toString());
        sb.append(" Write Channel Limit: ");
        sb.append(this.writeChannelLimit);
        sb.append(" Read Channel Limit: ");
        sb.append(this.readChannelLimit);
        return sb.toString();
    }

    @Override // io.netty.handler.traffic.AbstractTrafficShapingHandler
    public int userDefinedWritabilityIndex() {
        return 3;
    }

    @Override // io.netty.handler.traffic.AbstractTrafficShapingHandler, io.netty.channel.ChannelDuplexHandler, io.netty.channel.ChannelOutboundHandler
    public void write(ChannelHandlerContext channelHandlerContext, Object obj, ChannelPromise channelPromise) throws Exception {
        long jCalculateSize = calculateSize(obj);
        long jMilliSecondFromNano = TrafficCounter.milliSecondFromNano();
        long jComputeBalancedWait = 0;
        if (jCalculateSize > 0) {
            long jWriteTimeToWait = this.trafficCounter.writeTimeToWait(jCalculateSize, getWriteLimit(), this.maxTime, jMilliSecondFromNano);
            PerChannel perChannel = this.channelQueues.get(Integer.valueOf(channelHandlerContext.channel().hashCode()));
            if (perChannel != null) {
                long jWriteTimeToWait2 = perChannel.channelTrafficCounter.writeTimeToWait(jCalculateSize, this.writeChannelLimit, this.maxTime, jMilliSecondFromNano);
                if (this.writeDeviationActive) {
                    long jCumulativeWrittenBytes = perChannel.channelTrafficCounter.cumulativeWrittenBytes();
                    long j2 = this.cumulativeWrittenBytes.get();
                    if (jCumulativeWrittenBytes <= 0) {
                        jCumulativeWrittenBytes = 0;
                    }
                    if (j2 < jCumulativeWrittenBytes) {
                        j2 = jCumulativeWrittenBytes;
                    }
                    jComputeBalancedWait = computeBalancedWait(jCumulativeWrittenBytes, j2, jWriteTimeToWait2);
                } else {
                    jComputeBalancedWait = jWriteTimeToWait2;
                }
            }
            long j3 = jComputeBalancedWait < jWriteTimeToWait ? jWriteTimeToWait : jComputeBalancedWait;
            if (j3 >= 10) {
                InternalLogger internalLogger = logger;
                if (internalLogger.isDebugEnabled()) {
                    internalLogger.debug("Write suspend: " + j3 + ':' + channelHandlerContext.channel().config().isAutoRead() + ':' + AbstractTrafficShapingHandler.isHandlerActive(channelHandlerContext));
                }
                submitWrite(channelHandlerContext, obj, jCalculateSize, j3, jMilliSecondFromNano, channelPromise);
                return;
            }
        }
        submitWrite(channelHandlerContext, obj, jCalculateSize, 0L, jMilliSecondFromNano, channelPromise);
    }

    public GlobalChannelTrafficShapingHandler(ScheduledExecutorService scheduledExecutorService, long j2, long j3, long j4, long j5, long j6) {
        super(j2, j3, j6);
        this.channelQueues = PlatformDependent.newConcurrentHashMap();
        this.queuesSize = new AtomicLong();
        this.cumulativeWrittenBytes = new AtomicLong();
        this.cumulativeReadBytes = new AtomicLong();
        this.maxGlobalWriteSize = 419430400L;
        this.writeChannelLimit = j4;
        this.readChannelLimit = j5;
        createGlobalTrafficCounter(scheduledExecutorService);
    }

    public GlobalChannelTrafficShapingHandler(ScheduledExecutorService scheduledExecutorService, long j2, long j3, long j4, long j5) {
        super(j2, j3);
        this.channelQueues = PlatformDependent.newConcurrentHashMap();
        this.queuesSize = new AtomicLong();
        this.cumulativeWrittenBytes = new AtomicLong();
        this.cumulativeReadBytes = new AtomicLong();
        this.maxGlobalWriteSize = 419430400L;
        this.writeChannelLimit = j4;
        this.readChannelLimit = j5;
        createGlobalTrafficCounter(scheduledExecutorService);
    }

    public GlobalChannelTrafficShapingHandler(ScheduledExecutorService scheduledExecutorService, long j2) {
        super(j2);
        this.channelQueues = PlatformDependent.newConcurrentHashMap();
        this.queuesSize = new AtomicLong();
        this.cumulativeWrittenBytes = new AtomicLong();
        this.cumulativeReadBytes = new AtomicLong();
        this.maxGlobalWriteSize = 419430400L;
        createGlobalTrafficCounter(scheduledExecutorService);
    }

    public GlobalChannelTrafficShapingHandler(ScheduledExecutorService scheduledExecutorService) {
        this.channelQueues = PlatformDependent.newConcurrentHashMap();
        this.queuesSize = new AtomicLong();
        this.cumulativeWrittenBytes = new AtomicLong();
        this.cumulativeReadBytes = new AtomicLong();
        this.maxGlobalWriteSize = 419430400L;
        createGlobalTrafficCounter(scheduledExecutorService);
    }
}
