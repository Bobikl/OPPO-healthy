package io.netty.util.internal;

import io.netty.util.internal.logging.InternalLogger;
import io.netty.util.internal.logging.InternalLoggerFactory;
import java.security.SecureRandom;
import java.util.Random;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes10.dex */
public final class ThreadLocalRandom extends Random {
    private static final long addend = 11;
    private static volatile long initialSeedUniquifier = 0;
    private static final long mask = 281474976710655L;
    private static final long multiplier = 25214903917L;
    private static volatile long seedGeneratorEndTime = 0;
    private static final long seedGeneratorStartTime;
    private static final Thread seedGeneratorThread;
    private static final BlockingQueue<Long> seedQueue;
    private static final long serialVersionUID = -5851777807851030925L;
    boolean initialized;
    private long pad0;
    private long pad1;
    private long pad2;
    private long pad3;
    private long pad4;
    private long pad5;
    private long pad6;
    private long pad7;
    private long rnd;
    private static final InternalLogger logger = InternalLoggerFactory.getInstance((Class<?>) ThreadLocalRandom.class);
    private static final AtomicLong seedUniquifier = new AtomicLong();

    static {
        initialSeedUniquifier = SystemPropertyUtil.getLong("io.netty.initialSeedUniquifier", 0L);
        if (initialSeedUniquifier != 0) {
            seedGeneratorThread = null;
            seedQueue = null;
            seedGeneratorStartTime = 0L;
        } else {
            if (!SystemPropertyUtil.getBoolean("java.util.secureRandomSeed", false)) {
                initialSeedUniquifier = mix64(System.currentTimeMillis()) ^ mix64(System.nanoTime());
                seedGeneratorThread = null;
                seedQueue = null;
                seedGeneratorStartTime = 0L;
                return;
            }
            seedQueue = new LinkedBlockingQueue();
            seedGeneratorStartTime = System.nanoTime();
            Thread thread = new Thread("initialSeedUniquifierGenerator") { // from class: io.netty.util.internal.ThreadLocalRandom.1
                @Override // java.lang.Thread, java.lang.Runnable
                public void run() {
                    byte[] bArrGenerateSeed = new SecureRandom().generateSeed(8);
                    long unused = ThreadLocalRandom.seedGeneratorEndTime = System.nanoTime();
                    ThreadLocalRandom.seedQueue.add(Long.valueOf(((((long) bArrGenerateSeed[0]) & 255) << 56) | ((((long) bArrGenerateSeed[1]) & 255) << 48) | ((((long) bArrGenerateSeed[2]) & 255) << 40) | ((((long) bArrGenerateSeed[3]) & 255) << 32) | ((((long) bArrGenerateSeed[4]) & 255) << 24) | ((((long) bArrGenerateSeed[5]) & 255) << 16) | ((((long) bArrGenerateSeed[6]) & 255) << 8) | (((long) bArrGenerateSeed[7]) & 255)));
                }
            };
            seedGeneratorThread = thread;
            thread.setDaemon(true);
            thread.setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() { // from class: io.netty.util.internal.ThreadLocalRandom.2
                @Override // java.lang.Thread.UncaughtExceptionHandler
                public void uncaughtException(Thread thread2, Throwable th) {
                    ThreadLocalRandom.logger.debug("An exception has been raised by {}", thread2.getName(), th);
                }
            });
            thread.start();
        }
    }

    public ThreadLocalRandom() {
        super(newSeed());
        this.initialized = true;
    }

    public static ThreadLocalRandom current() {
        return InternalThreadLocalMap.get().random();
    }

    public static long getInitialSeedUniquifier() {
        Long lPoll;
        boolean z;
        long j2 = initialSeedUniquifier;
        if (j2 != 0) {
            return j2;
        }
        synchronized (ThreadLocalRandom.class) {
            long jLongValue = initialSeedUniquifier;
            if (jLongValue != 0) {
                return jLongValue;
            }
            long nanos = seedGeneratorStartTime + TimeUnit.SECONDS.toNanos(3L);
            while (true) {
                long jNanoTime = nanos - System.nanoTime();
                if (jNanoTime <= 0) {
                    try {
                        lPoll = seedQueue.poll();
                    } catch (InterruptedException unused) {
                        logger.warn("Failed to generate a seed from SecureRandom due to an InterruptedException.");
                        z = true;
                    }
                } else {
                    lPoll = seedQueue.poll(jNanoTime, TimeUnit.NANOSECONDS);
                }
                z = false;
                if (lPoll != null) {
                    jLongValue = lPoll.longValue();
                    break;
                }
                if (jNanoTime <= 0) {
                    seedGeneratorThread.interrupt();
                    logger.warn("Failed to generate a seed from SecureRandom within {} seconds. Not enough entropy?", (Object) 3L);
                    break;
                }
            }
            long jReverse = (jLongValue ^ 3627065505421648153L) ^ Long.reverse(System.nanoTime());
            initialSeedUniquifier = jReverse;
            if (z) {
                Thread.currentThread().interrupt();
                seedGeneratorThread.interrupt();
            }
            if (seedGeneratorEndTime == 0) {
                seedGeneratorEndTime = System.nanoTime();
            }
            return jReverse;
        }
    }

    private static long mix64(long j2) {
        long j3 = (j2 ^ (j2 >>> 33)) * (-49064778989728563L);
        long j4 = (j3 ^ (j3 >>> 33)) * (-4265267296055464877L);
        return j4 ^ (j4 >>> 33);
    }

    private static long newSeed() {
        AtomicLong atomicLong;
        long j2;
        long initialSeedUniquifier2;
        long j3;
        do {
            atomicLong = seedUniquifier;
            j2 = atomicLong.get();
            initialSeedUniquifier2 = j2 != 0 ? j2 : getInitialSeedUniquifier();
            j3 = 181783497276652981L * initialSeedUniquifier2;
        } while (!atomicLong.compareAndSet(j2, j3));
        if (j2 == 0) {
            InternalLogger internalLogger = logger;
            if (internalLogger.isDebugEnabled()) {
                if (seedGeneratorEndTime != 0) {
                    internalLogger.debug(String.format("-Dio.netty.initialSeedUniquifier: 0x%016x (took %d ms)", Long.valueOf(initialSeedUniquifier2), Long.valueOf(TimeUnit.NANOSECONDS.toMillis(seedGeneratorEndTime - seedGeneratorStartTime))));
                } else {
                    internalLogger.debug(String.format("-Dio.netty.initialSeedUniquifier: 0x%016x", Long.valueOf(initialSeedUniquifier2)));
                }
            }
        }
        return System.nanoTime() ^ j3;
    }

    public static void setInitialSeedUniquifier(long j2) {
        initialSeedUniquifier = j2;
    }

    @Override // java.util.Random
    public int next(int i) {
        long j2 = ((this.rnd * multiplier) + addend) & mask;
        this.rnd = j2;
        return (int) (j2 >>> (48 - i));
    }

    public double nextDouble(double d) {
        ObjectUtil.checkPositive(d, "n");
        return nextDouble() * d;
    }

    public int nextInt(int i, int i2) {
        if (i < i2) {
            return nextInt(i2 - i) + i;
        }
        throw new IllegalArgumentException();
    }

    public long nextLong(long j2) {
        ObjectUtil.checkPositive(j2, "n");
        long j3 = 0;
        while (j2 >= 2147483647L) {
            int next = next(2);
            long j4 = j2 >>> 1;
            if ((next & 2) != 0) {
                j4 = j2 - j4;
            }
            if ((next & 1) == 0) {
                j3 += j2 - j4;
            }
            j2 = j4;
        }
        return j3 + ((long) nextInt((int) j2));
    }

    @Override // java.util.Random
    public void setSeed(long j2) {
        if (this.initialized) {
            throw new UnsupportedOperationException();
        }
        this.rnd = (j2 ^ multiplier) & mask;
    }

    public double nextDouble(double d, double d2) {
        if (d < d2) {
            return (nextDouble() * (d2 - d)) + d;
        }
        throw new IllegalArgumentException();
    }

    public long nextLong(long j2, long j3) {
        if (j2 < j3) {
            return nextLong(j3 - j2) + j2;
        }
        throw new IllegalArgumentException();
    }
}
