package io.netty.handler.traffic;

import io.netty.util.internal.ObjectUtil;
import io.netty.util.internal.logging.InternalLogger;
import io.netty.util.internal.logging.InternalLoggerFactory;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes10.dex */
public class TrafficCounter {
    private static final InternalLogger logger = InternalLoggerFactory.getInstance((Class<?>) TrafficCounter.class);
    final AtomicLong checkInterval;
    private final AtomicLong cumulativeReadBytes;
    private final AtomicLong cumulativeWrittenBytes;
    private final AtomicLong currentReadBytes;
    private final AtomicLong currentWrittenBytes;
    final ScheduledExecutorService executor;
    private long lastCumulativeTime;
    private volatile long lastReadBytes;
    private long lastReadThroughput;
    private volatile long lastReadingTime;
    final AtomicLong lastTime;
    private long lastWriteThroughput;
    private volatile long lastWritingTime;
    private volatile long lastWrittenBytes;
    Runnable monitor;
    volatile boolean monitorActive;
    final String name;
    private long readingTime;
    private long realWriteThroughput;
    private final AtomicLong realWrittenBytes;
    volatile ScheduledFuture<?> scheduledFuture;
    final AbstractTrafficShapingHandler trafficShapingHandler;
    private long writingTime;

    public final class TrafficMonitoringTask implements Runnable {
        private TrafficMonitoringTask() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (TrafficCounter.this.monitorActive) {
                TrafficCounter.this.resetAccounting(TrafficCounter.milliSecondFromNano());
                TrafficCounter trafficCounter = TrafficCounter.this;
                AbstractTrafficShapingHandler abstractTrafficShapingHandler = trafficCounter.trafficShapingHandler;
                if (abstractTrafficShapingHandler != null) {
                    abstractTrafficShapingHandler.doAccounting(trafficCounter);
                }
            }
        }
    }

    public TrafficCounter(ScheduledExecutorService scheduledExecutorService, String str, long j2) {
        this.currentWrittenBytes = new AtomicLong();
        this.currentReadBytes = new AtomicLong();
        this.cumulativeWrittenBytes = new AtomicLong();
        this.cumulativeReadBytes = new AtomicLong();
        this.lastTime = new AtomicLong();
        this.realWrittenBytes = new AtomicLong();
        this.checkInterval = new AtomicLong(1000L);
        this.name = (String) ObjectUtil.checkNotNull(str, "name");
        this.trafficShapingHandler = null;
        this.executor = scheduledExecutorService;
        init(j2);
    }

    private void init(long j2) {
        this.lastCumulativeTime = System.currentTimeMillis();
        long jMilliSecondFromNano = milliSecondFromNano();
        this.writingTime = jMilliSecondFromNano;
        this.readingTime = jMilliSecondFromNano;
        this.lastWritingTime = jMilliSecondFromNano;
        this.lastReadingTime = this.writingTime;
        configure(j2);
    }

    public static long milliSecondFromNano() {
        return System.nanoTime() / 1000000;
    }

    public void bytesRealWriteFlowControl(long j2) {
        this.realWrittenBytes.addAndGet(j2);
    }

    public void bytesRecvFlowControl(long j2) {
        this.currentReadBytes.addAndGet(j2);
        this.cumulativeReadBytes.addAndGet(j2);
    }

    public void bytesWriteFlowControl(long j2) {
        this.currentWrittenBytes.addAndGet(j2);
        this.cumulativeWrittenBytes.addAndGet(j2);
    }

    public long checkInterval() {
        return this.checkInterval.get();
    }

    public void configure(long j2) {
        long j3 = (j2 / 10) * 10;
        if (this.checkInterval.getAndSet(j3) != j3) {
            if (j3 <= 0) {
                stop();
                this.lastTime.set(milliSecondFromNano());
            } else {
                stop();
                start();
            }
        }
    }

    public long cumulativeReadBytes() {
        return this.cumulativeReadBytes.get();
    }

    public long cumulativeWrittenBytes() {
        return this.cumulativeWrittenBytes.get();
    }

    public long currentReadBytes() {
        return this.currentReadBytes.get();
    }

    public long currentWrittenBytes() {
        return this.currentWrittenBytes.get();
    }

    public long getRealWriteThroughput() {
        return this.realWriteThroughput;
    }

    public AtomicLong getRealWrittenBytes() {
        return this.realWrittenBytes;
    }

    public long lastCumulativeTime() {
        return this.lastCumulativeTime;
    }

    public long lastReadBytes() {
        return this.lastReadBytes;
    }

    public long lastReadThroughput() {
        return this.lastReadThroughput;
    }

    public long lastTime() {
        return this.lastTime.get();
    }

    public long lastWriteThroughput() {
        return this.lastWriteThroughput;
    }

    public long lastWrittenBytes() {
        return this.lastWrittenBytes;
    }

    public String name() {
        return this.name;
    }

    @Deprecated
    public long readTimeToWait(long j2, long j3, long j4) {
        return readTimeToWait(j2, j3, j4, milliSecondFromNano());
    }

    public synchronized void resetAccounting(long j2) {
        long andSet = j2 - this.lastTime.getAndSet(j2);
        if (andSet == 0) {
            return;
        }
        InternalLogger internalLogger = logger;
        if (internalLogger.isDebugEnabled() && andSet > (checkInterval() << 1)) {
            internalLogger.debug("Acct schedule not ok: " + andSet + " > 2*" + checkInterval() + " from " + this.name);
        }
        this.lastReadBytes = this.currentReadBytes.getAndSet(0L);
        this.lastWrittenBytes = this.currentWrittenBytes.getAndSet(0L);
        this.lastReadThroughput = (this.lastReadBytes * 1000) / andSet;
        this.lastWriteThroughput = (this.lastWrittenBytes * 1000) / andSet;
        this.realWriteThroughput = (this.realWrittenBytes.getAndSet(0L) * 1000) / andSet;
        this.lastWritingTime = Math.max(this.lastWritingTime, this.writingTime);
        this.lastReadingTime = Math.max(this.lastReadingTime, this.readingTime);
    }

    public void resetCumulativeTime() {
        this.lastCumulativeTime = System.currentTimeMillis();
        this.cumulativeReadBytes.set(0L);
        this.cumulativeWrittenBytes.set(0L);
    }

    public synchronized void start() {
        if (this.monitorActive) {
            return;
        }
        this.lastTime.set(milliSecondFromNano());
        long j2 = this.checkInterval.get();
        if (j2 > 0 && this.executor != null) {
            this.monitorActive = true;
            TrafficMonitoringTask trafficMonitoringTask = new TrafficMonitoringTask();
            this.monitor = trafficMonitoringTask;
            this.scheduledFuture = this.executor.scheduleAtFixedRate(trafficMonitoringTask, 0L, j2, TimeUnit.MILLISECONDS);
        }
    }

    public synchronized void stop() {
        if (this.monitorActive) {
            this.monitorActive = false;
            resetAccounting(milliSecondFromNano());
            AbstractTrafficShapingHandler abstractTrafficShapingHandler = this.trafficShapingHandler;
            if (abstractTrafficShapingHandler != null) {
                abstractTrafficShapingHandler.doAccounting(this);
            }
            if (this.scheduledFuture != null) {
                this.scheduledFuture.cancel(true);
            }
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(165);
        sb.append("Monitor ");
        sb.append(this.name);
        sb.append(" Current Speed Read: ");
        sb.append(this.lastReadThroughput >> 10);
        sb.append(" KB/s, ");
        sb.append("Asked Write: ");
        sb.append(this.lastWriteThroughput >> 10);
        sb.append(" KB/s, ");
        sb.append("Real Write: ");
        sb.append(this.realWriteThroughput >> 10);
        sb.append(" KB/s, ");
        sb.append("Current Read: ");
        sb.append(this.currentReadBytes.get() >> 10);
        sb.append(" KB, ");
        sb.append("Current asked Write: ");
        sb.append(this.currentWrittenBytes.get() >> 10);
        sb.append(" KB, ");
        sb.append("Current real Write: ");
        sb.append(this.realWrittenBytes.get() >> 10);
        sb.append(" KB");
        return sb.toString();
    }

    @Deprecated
    public long writeTimeToWait(long j2, long j3, long j4) {
        return writeTimeToWait(j2, j3, j4, milliSecondFromNano());
    }

    public long readTimeToWait(long j2, long j3, long j4, long j5) {
        long j6;
        long j7;
        bytesRecvFlowControl(j2);
        if (j2 == 0 || j3 == 0) {
            return 0L;
        }
        long j8 = this.lastTime.get();
        long j9 = this.currentReadBytes.get();
        long j10 = this.readingTime;
        long j11 = this.lastReadBytes;
        long j12 = j5 - j8;
        long jMax = Math.max(this.lastReadingTime - j8, 0L);
        if (j12 > 10) {
            long j13 = (((1000 * j9) / j3) - j12) + jMax;
            if (j13 <= 10) {
                this.readingTime = Math.max(j10, j5);
                return 0L;
            }
            InternalLogger internalLogger = logger;
            if (internalLogger.isDebugEnabled()) {
                internalLogger.debug("Time: " + j13 + ':' + j9 + ':' + j12 + ':' + jMax);
            }
            if (j13 > j4) {
                j7 = j10;
                if ((j5 + j13) - j7 > j4) {
                    j13 = j4;
                }
            } else {
                j7 = j10;
            }
            this.readingTime = Math.max(j7, j5 + j13);
            return j13;
        }
        long j14 = j9 + j11;
        long j15 = j12 + this.checkInterval.get();
        long j16 = (((1000 * j14) / j3) - j15) + jMax;
        if (j16 <= 10) {
            this.readingTime = Math.max(j10, j5);
            return 0L;
        }
        InternalLogger internalLogger2 = logger;
        if (internalLogger2.isDebugEnabled()) {
            internalLogger2.debug("Time: " + j16 + ':' + j14 + ':' + j15 + ':' + jMax);
        }
        if (j16 > j4) {
            j6 = j10;
            if ((j5 + j16) - j6 > j4) {
                j16 = j4;
            }
        } else {
            j6 = j10;
        }
        this.readingTime = Math.max(j6, j5 + j16);
        return j16;
    }

    public long writeTimeToWait(long j2, long j3, long j4, long j5) {
        bytesWriteFlowControl(j2);
        if (j2 == 0 || j3 == 0) {
            return 0L;
        }
        long j6 = this.lastTime.get();
        long j7 = this.currentWrittenBytes.get();
        long j8 = this.lastWrittenBytes;
        long j9 = this.writingTime;
        long jMax = Math.max(this.lastWritingTime - j6, 0L);
        long j10 = j5 - j6;
        if (j10 > 10) {
            long j11 = (((1000 * j7) / j3) - j10) + jMax;
            if (j11 <= 10) {
                this.writingTime = Math.max(j9, j5);
                return 0L;
            }
            InternalLogger internalLogger = logger;
            if (internalLogger.isDebugEnabled()) {
                internalLogger.debug("Time: " + j11 + ':' + j7 + ':' + j10 + ':' + jMax);
            }
            if (j11 > j4 && (j5 + j11) - j9 > j4) {
                j11 = j4;
            }
            this.writingTime = Math.max(j9, j5 + j11);
            return j11;
        }
        long j12 = j7 + j8;
        long j13 = j10 + this.checkInterval.get();
        long j14 = (((1000 * j12) / j3) - j13) + jMax;
        if (j14 <= 10) {
            this.writingTime = Math.max(j9, j5);
            return 0L;
        }
        InternalLogger internalLogger2 = logger;
        if (internalLogger2.isDebugEnabled()) {
            internalLogger2.debug("Time: " + j14 + ':' + j12 + ':' + j13 + ':' + jMax);
        }
        if (j14 > j4 && (j5 + j14) - j9 > j4) {
            j14 = j4;
        }
        this.writingTime = Math.max(j9, j5 + j14);
        return j14;
    }

    public TrafficCounter(AbstractTrafficShapingHandler abstractTrafficShapingHandler, ScheduledExecutorService scheduledExecutorService, String str, long j2) {
        this.currentWrittenBytes = new AtomicLong();
        this.currentReadBytes = new AtomicLong();
        this.cumulativeWrittenBytes = new AtomicLong();
        this.cumulativeReadBytes = new AtomicLong();
        this.lastTime = new AtomicLong();
        this.realWrittenBytes = new AtomicLong();
        this.checkInterval = new AtomicLong(1000L);
        this.name = (String) ObjectUtil.checkNotNull(str, "name");
        this.trafficShapingHandler = (AbstractTrafficShapingHandler) ObjectUtil.checkNotNullWithIAE(abstractTrafficShapingHandler, "trafficShapingHandler");
        this.executor = scheduledExecutorService;
        init(j2);
    }
}
