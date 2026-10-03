package io.netty.handler.traffic;

import com.heytap.voiceassistant.sdk.tts.constant.SpeechConstant;
import com.oplus.aiunit.vision.xx0;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.ByteBufHolder;
import io.netty.channel.Channel;
import io.netty.channel.ChannelConfig;
import io.netty.channel.ChannelDuplexHandler;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelOutboundBuffer;
import io.netty.channel.ChannelPromise;
import io.netty.channel.FileRegion;
import io.netty.util.Attribute;
import io.netty.util.AttributeKey;
import io.netty.util.internal.ObjectUtil;
import io.netty.util.internal.logging.InternalLogger;
import io.netty.util.internal.logging.InternalLoggerFactory;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractTrafficShapingHandler extends ChannelDuplexHandler {
    static final int CHANNEL_DEFAULT_USER_DEFINED_WRITABILITY_INDEX = 1;
    public static final long DEFAULT_CHECK_INTERVAL = 1000;
    static final long DEFAULT_MAX_SIZE = 4194304;
    public static final long DEFAULT_MAX_TIME = 15000;
    static final int GLOBALCHANNEL_DEFAULT_USER_DEFINED_WRITABILITY_INDEX = 3;
    static final int GLOBAL_DEFAULT_USER_DEFINED_WRITABILITY_INDEX = 2;
    static final long MINIMAL_WAIT = 10;
    protected volatile long checkInterval;
    protected volatile long maxTime;
    volatile long maxWriteDelay;
    volatile long maxWriteSize;
    private volatile long readLimit;
    protected TrafficCounter trafficCounter;
    final int userDefinedWritabilityIndex;
    private volatile long writeLimit;
    private static final InternalLogger logger = InternalLoggerFactory.getInstance((Class<?>) AbstractTrafficShapingHandler.class);
    static final AttributeKey<Boolean> READ_SUSPENDED = AttributeKey.valueOf(AbstractTrafficShapingHandler.class.getName() + ".READ_SUSPENDED");
    static final AttributeKey<Runnable> REOPEN_TASK = AttributeKey.valueOf(AbstractTrafficShapingHandler.class.getName() + ".REOPEN_TASK");

    public static final class ReopenReadTimerTask implements Runnable {
        final ChannelHandlerContext ctx;

        public ReopenReadTimerTask(ChannelHandlerContext channelHandlerContext) {
            this.ctx = channelHandlerContext;
        }

        @Override // java.lang.Runnable
        public void run() {
            Channel channel = this.ctx.channel();
            ChannelConfig channelConfigConfig = channel.config();
            if (channelConfigConfig.isAutoRead() || !AbstractTrafficShapingHandler.isHandlerActive(this.ctx)) {
                if (AbstractTrafficShapingHandler.logger.isDebugEnabled()) {
                    if (!channelConfigConfig.isAutoRead() || AbstractTrafficShapingHandler.isHandlerActive(this.ctx)) {
                        if (AbstractTrafficShapingHandler.logger.isDebugEnabled()) {
                            AbstractTrafficShapingHandler.logger.debug("Normal unsuspend: " + channelConfigConfig.isAutoRead() + ':' + AbstractTrafficShapingHandler.isHandlerActive(this.ctx));
                        }
                    } else if (AbstractTrafficShapingHandler.logger.isDebugEnabled()) {
                        AbstractTrafficShapingHandler.logger.debug("Unsuspend: " + channelConfigConfig.isAutoRead() + ':' + AbstractTrafficShapingHandler.isHandlerActive(this.ctx));
                    }
                }
                channel.attr(AbstractTrafficShapingHandler.READ_SUSPENDED).set(Boolean.FALSE);
                channelConfigConfig.setAutoRead(true);
                channel.read();
            } else {
                if (AbstractTrafficShapingHandler.logger.isDebugEnabled()) {
                    AbstractTrafficShapingHandler.logger.debug("Not unsuspend: " + channelConfigConfig.isAutoRead() + ':' + AbstractTrafficShapingHandler.isHandlerActive(this.ctx));
                }
                channel.attr(AbstractTrafficShapingHandler.READ_SUSPENDED).set(Boolean.FALSE);
            }
            if (AbstractTrafficShapingHandler.logger.isDebugEnabled()) {
                AbstractTrafficShapingHandler.logger.debug("Unsuspend final status => " + channelConfigConfig.isAutoRead() + ':' + AbstractTrafficShapingHandler.isHandlerActive(this.ctx));
            }
        }
    }

    public AbstractTrafficShapingHandler(long j2, long j3, long j4, long j5) {
        this.maxTime = 15000L;
        this.checkInterval = 1000L;
        this.maxWriteDelay = xx0.SCROLL_DELAYED;
        this.maxWriteSize = DEFAULT_MAX_SIZE;
        this.maxTime = ObjectUtil.checkPositive(j5, "maxTime");
        this.userDefinedWritabilityIndex = userDefinedWritabilityIndex();
        this.writeLimit = j2;
        this.readLimit = j3;
        this.checkInterval = j4;
    }

    public static boolean isHandlerActive(ChannelHandlerContext channelHandlerContext) {
        Boolean bool = (Boolean) channelHandlerContext.channel().attr(READ_SUSPENDED).get();
        return bool == null || Boolean.FALSE.equals(bool);
    }

    public long calculateSize(Object obj) {
        if (obj instanceof ByteBuf) {
            return ((ByteBuf) obj).readableBytes();
        }
        if (obj instanceof ByteBufHolder) {
            return ((ByteBufHolder) obj).content().readableBytes();
        }
        if (obj instanceof FileRegion) {
            return ((FileRegion) obj).count();
        }
        return -1L;
    }

    @Override // io.netty.channel.ChannelInboundHandlerAdapter, io.netty.channel.ChannelInboundHandler
    public void channelRead(ChannelHandlerContext channelHandlerContext, Object obj) throws Exception {
        long jCalculateSize = calculateSize(obj);
        long jMilliSecondFromNano = TrafficCounter.milliSecondFromNano();
        if (jCalculateSize > 0) {
            long jCheckWaitReadTime = checkWaitReadTime(channelHandlerContext, this.trafficCounter.readTimeToWait(jCalculateSize, this.readLimit, this.maxTime, jMilliSecondFromNano), jMilliSecondFromNano);
            if (jCheckWaitReadTime >= 10) {
                Channel channel = channelHandlerContext.channel();
                ChannelConfig channelConfigConfig = channel.config();
                InternalLogger internalLogger = logger;
                if (internalLogger.isDebugEnabled()) {
                    internalLogger.debug("Read suspend: " + jCheckWaitReadTime + ':' + channelConfigConfig.isAutoRead() + ':' + isHandlerActive(channelHandlerContext));
                }
                if (channelConfigConfig.isAutoRead() && isHandlerActive(channelHandlerContext)) {
                    channelConfigConfig.setAutoRead(false);
                    channel.attr(READ_SUSPENDED).set(Boolean.TRUE);
                    Attribute attributeAttr = channel.attr(REOPEN_TASK);
                    Runnable reopenReadTimerTask = (Runnable) attributeAttr.get();
                    if (reopenReadTimerTask == null) {
                        reopenReadTimerTask = new ReopenReadTimerTask(channelHandlerContext);
                        attributeAttr.set(reopenReadTimerTask);
                    }
                    channelHandlerContext.executor().schedule(reopenReadTimerTask, jCheckWaitReadTime, TimeUnit.MILLISECONDS);
                    if (internalLogger.isDebugEnabled()) {
                        internalLogger.debug("Suspend final status => " + channelConfigConfig.isAutoRead() + ':' + isHandlerActive(channelHandlerContext) + " will reopened at: " + jCheckWaitReadTime);
                    }
                }
            }
        }
        informReadOperation(channelHandlerContext, jMilliSecondFromNano);
        channelHandlerContext.fireChannelRead(obj);
    }

    @Override // io.netty.channel.ChannelInboundHandlerAdapter, io.netty.channel.ChannelInboundHandler
    public void channelRegistered(ChannelHandlerContext channelHandlerContext) throws Exception {
        setUserDefinedWritability(channelHandlerContext, true);
        super.channelRegistered(channelHandlerContext);
    }

    public long checkWaitReadTime(ChannelHandlerContext channelHandlerContext, long j2, long j3) {
        return j2;
    }

    public void checkWriteSuspend(ChannelHandlerContext channelHandlerContext, long j2, long j3) {
        if (j3 > this.maxWriteSize || j2 > this.maxWriteDelay) {
            setUserDefinedWritability(channelHandlerContext, false);
        }
    }

    public void configure(long j2, long j3, long j4) {
        configure(j2, j3);
        configure(j4);
    }

    public void doAccounting(TrafficCounter trafficCounter) {
    }

    public long getCheckInterval() {
        return this.checkInterval;
    }

    public long getMaxTimeWait() {
        return this.maxTime;
    }

    public long getMaxWriteDelay() {
        return this.maxWriteDelay;
    }

    public long getMaxWriteSize() {
        return this.maxWriteSize;
    }

    public long getReadLimit() {
        return this.readLimit;
    }

    public long getWriteLimit() {
        return this.writeLimit;
    }

    @Override // io.netty.channel.ChannelHandlerAdapter, io.netty.channel.ChannelHandler
    public void handlerRemoved(ChannelHandlerContext channelHandlerContext) throws Exception {
        Channel channel = channelHandlerContext.channel();
        AttributeKey<Runnable> attributeKey = REOPEN_TASK;
        if (channel.hasAttr(attributeKey)) {
            channel.attr(attributeKey).set(null);
        }
        super.handlerRemoved(channelHandlerContext);
    }

    public void informReadOperation(ChannelHandlerContext channelHandlerContext, long j2) {
    }

    @Override // io.netty.channel.ChannelDuplexHandler, io.netty.channel.ChannelOutboundHandler
    public void read(ChannelHandlerContext channelHandlerContext) {
        if (isHandlerActive(channelHandlerContext)) {
            channelHandlerContext.read();
        }
    }

    public void releaseReadSuspended(ChannelHandlerContext channelHandlerContext) {
        Channel channel = channelHandlerContext.channel();
        channel.attr(READ_SUSPENDED).set(Boolean.FALSE);
        channel.config().setAutoRead(true);
    }

    public void releaseWriteSuspended(ChannelHandlerContext channelHandlerContext) {
        setUserDefinedWritability(channelHandlerContext, true);
    }

    public void setCheckInterval(long j2) {
        this.checkInterval = j2;
        TrafficCounter trafficCounter = this.trafficCounter;
        if (trafficCounter != null) {
            trafficCounter.configure(j2);
        }
    }

    public void setMaxTimeWait(long j2) {
        this.maxTime = ObjectUtil.checkPositive(j2, "maxTime");
    }

    public void setMaxWriteDelay(long j2) {
        this.maxWriteDelay = ObjectUtil.checkPositive(j2, "maxWriteDelay");
    }

    public void setMaxWriteSize(long j2) {
        this.maxWriteSize = j2;
    }

    public void setReadLimit(long j2) {
        this.readLimit = j2;
        TrafficCounter trafficCounter = this.trafficCounter;
        if (trafficCounter != null) {
            trafficCounter.resetAccounting(TrafficCounter.milliSecondFromNano());
        }
    }

    public void setTrafficCounter(TrafficCounter trafficCounter) {
        this.trafficCounter = trafficCounter;
    }

    public void setUserDefinedWritability(ChannelHandlerContext channelHandlerContext, boolean z) {
        ChannelOutboundBuffer channelOutboundBufferOutboundBuffer = channelHandlerContext.channel().unsafe().outboundBuffer();
        if (channelOutboundBufferOutboundBuffer != null) {
            channelOutboundBufferOutboundBuffer.setUserDefinedWritability(this.userDefinedWritabilityIndex, z);
        }
    }

    public void setWriteLimit(long j2) {
        this.writeLimit = j2;
        TrafficCounter trafficCounter = this.trafficCounter;
        if (trafficCounter != null) {
            trafficCounter.resetAccounting(TrafficCounter.milliSecondFromNano());
        }
    }

    public abstract void submitWrite(ChannelHandlerContext channelHandlerContext, Object obj, long j2, long j3, long j4, ChannelPromise channelPromise);

    @Deprecated
    public void submitWrite(ChannelHandlerContext channelHandlerContext, Object obj, long j2, ChannelPromise channelPromise) {
        submitWrite(channelHandlerContext, obj, calculateSize(obj), j2, TrafficCounter.milliSecondFromNano(), channelPromise);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(290);
        sb.append("TrafficShaping with Write Limit: ");
        sb.append(this.writeLimit);
        sb.append(" Read Limit: ");
        sb.append(this.readLimit);
        sb.append(" CheckInterval: ");
        sb.append(this.checkInterval);
        sb.append(" maxDelay: ");
        sb.append(this.maxWriteDelay);
        sb.append(" maxSize: ");
        sb.append(this.maxWriteSize);
        sb.append(" and Counter: ");
        TrafficCounter trafficCounter = this.trafficCounter;
        if (trafficCounter != null) {
            sb.append(trafficCounter);
        } else {
            sb.append(SpeechConstant.ENGINE_TYPE_NONE);
        }
        return sb.toString();
    }

    public TrafficCounter trafficCounter() {
        return this.trafficCounter;
    }

    public int userDefinedWritabilityIndex() {
        return 1;
    }

    @Override // io.netty.channel.ChannelDuplexHandler, io.netty.channel.ChannelOutboundHandler
    public void write(ChannelHandlerContext channelHandlerContext, Object obj, ChannelPromise channelPromise) throws Exception {
        long jCalculateSize = calculateSize(obj);
        long jMilliSecondFromNano = TrafficCounter.milliSecondFromNano();
        if (jCalculateSize > 0) {
            long jWriteTimeToWait = this.trafficCounter.writeTimeToWait(jCalculateSize, this.writeLimit, this.maxTime, jMilliSecondFromNano);
            if (jWriteTimeToWait >= 10) {
                InternalLogger internalLogger = logger;
                if (internalLogger.isDebugEnabled()) {
                    internalLogger.debug("Write suspend: " + jWriteTimeToWait + ':' + channelHandlerContext.channel().config().isAutoRead() + ':' + isHandlerActive(channelHandlerContext));
                }
                submitWrite(channelHandlerContext, obj, jCalculateSize, jWriteTimeToWait, jMilliSecondFromNano, channelPromise);
                return;
            }
        }
        submitWrite(channelHandlerContext, obj, jCalculateSize, 0L, jMilliSecondFromNano, channelPromise);
    }

    public void configure(long j2, long j3) {
        this.writeLimit = j2;
        this.readLimit = j3;
        TrafficCounter trafficCounter = this.trafficCounter;
        if (trafficCounter != null) {
            trafficCounter.resetAccounting(TrafficCounter.milliSecondFromNano());
        }
    }

    public void configure(long j2) {
        this.checkInterval = j2;
        TrafficCounter trafficCounter = this.trafficCounter;
        if (trafficCounter != null) {
            trafficCounter.configure(this.checkInterval);
        }
    }

    public AbstractTrafficShapingHandler(long j2, long j3, long j4) {
        this(j2, j3, j4, 15000L);
    }

    public AbstractTrafficShapingHandler(long j2, long j3) {
        this(j2, j3, 1000L, 15000L);
    }

    public AbstractTrafficShapingHandler() {
        this(0L, 0L, 1000L, 15000L);
    }

    public AbstractTrafficShapingHandler(long j2) {
        this(0L, 0L, j2, 15000L);
    }
}
