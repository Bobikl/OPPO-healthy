package io.netty.channel.nio;

import com.oplus.aiunit.vision.dj8;
import io.netty.channel.ChannelException;
import io.netty.channel.EventLoopException;
import io.netty.channel.EventLoopTaskQueueFactory;
import io.netty.channel.SelectStrategy;
import io.netty.channel.SingleThreadEventLoop;
import io.netty.util.IntSupplier;
import io.netty.util.concurrent.AbstractScheduledEventExecutor;
import io.netty.util.concurrent.RejectedExecutionHandler;
import io.netty.util.internal.ObjectUtil;
import io.netty.util.internal.PlatformDependent;
import io.netty.util.internal.ReflectionUtil;
import io.netty.util.internal.SystemPropertyUtil;
import io.netty.util.internal.logging.InternalLogger;
import io.netty.util.internal.logging.InternalLoggerFactory;
import java.io.IOException;
import java.lang.reflect.Field;
import java.nio.channels.CancelledKeyException;
import java.nio.channels.SelectableChannel;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.spi.AbstractSelector;
import java.nio.channels.spi.SelectorProvider;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes10.dex */
public final class NioEventLoop extends SingleThreadEventLoop {
    private static final long AWAKE = -1;
    private static final int CLEANUP_INTERVAL = 256;
    private static final int MIN_PREMATURE_SELECTOR_RETURNS = 3;
    private static final long NONE = Long.MAX_VALUE;
    private static final int SELECTOR_AUTO_REBUILD_THRESHOLD;
    private int cancelledKeys;
    private volatile int ioRatio;
    private boolean needsToSelectAgain;
    private final AtomicLong nextWakeupNanos;
    private final SelectorProvider provider;
    private final IntSupplier selectNowSupplier;
    private final SelectStrategy selectStrategy;
    private SelectedSelectionKeySet selectedKeys;
    private Selector selector;
    private Selector unwrappedSelector;
    private static final InternalLogger logger = InternalLoggerFactory.getInstance((Class<?>) NioEventLoop.class);
    private static final boolean DISABLE_KEY_SET_OPTIMIZATION = SystemPropertyUtil.getBoolean("io.netty.noKeySetOptimization", false);

    static {
        if (PlatformDependent.javaVersion() < 7 && SystemPropertyUtil.get("sun.nio.ch.bugLevel") == null) {
            try {
                AccessController.doPrivileged(new PrivilegedAction<Void>() { // from class: io.netty.channel.nio.NioEventLoop.2
                    @Override // java.security.PrivilegedAction
                    public Void run() {
                        System.setProperty("sun.nio.ch.bugLevel", "");
                        return null;
                    }
                });
            } catch (SecurityException e2) {
                logger.debug("Unable to get/set System Property: sun.nio.ch.bugLevel", (Throwable) e2);
            }
        }
        int i = SystemPropertyUtil.getInt("io.netty.selectorAutoRebuildThreshold", 512);
        int i2 = i >= 3 ? i : 0;
        SELECTOR_AUTO_REBUILD_THRESHOLD = i2;
        InternalLogger internalLogger = logger;
        if (internalLogger.isDebugEnabled()) {
            internalLogger.debug("-Dio.netty.noKeySetOptimization: {}", Boolean.valueOf(DISABLE_KEY_SET_OPTIMIZATION));
            internalLogger.debug("-Dio.netty.selectorAutoRebuildThreshold: {}", Integer.valueOf(i2));
        }
    }

    public NioEventLoop(NioEventLoopGroup nioEventLoopGroup, Executor executor, SelectorProvider selectorProvider, SelectStrategy selectStrategy, RejectedExecutionHandler rejectedExecutionHandler, EventLoopTaskQueueFactory eventLoopTaskQueueFactory, EventLoopTaskQueueFactory eventLoopTaskQueueFactory2) {
        super(nioEventLoopGroup, executor, false, newTaskQueue(eventLoopTaskQueueFactory), newTaskQueue(eventLoopTaskQueueFactory2), rejectedExecutionHandler);
        this.selectNowSupplier = new IntSupplier() { // from class: io.netty.channel.nio.NioEventLoop.1
            @Override // io.netty.util.IntSupplier
            public int get() throws Exception {
                return NioEventLoop.this.selectNow();
            }
        };
        this.nextWakeupNanos = new AtomicLong(-1L);
        this.ioRatio = 50;
        this.provider = (SelectorProvider) ObjectUtil.checkNotNull(selectorProvider, "selectorProvider");
        this.selectStrategy = (SelectStrategy) ObjectUtil.checkNotNull(selectStrategy, "selectStrategy");
        SelectorTuple selectorTupleOpenSelector = openSelector();
        this.selector = selectorTupleOpenSelector.selector;
        this.unwrappedSelector = selectorTupleOpenSelector.unwrappedSelector;
    }

    private void closeAll() {
        selectAgain();
        Set<SelectionKey> setKeys = this.selector.keys();
        ArrayList<AbstractNioChannel> arrayList = new ArrayList(setKeys.size());
        for (SelectionKey selectionKey : setKeys) {
            Object objAttachment = selectionKey.attachment();
            if (objAttachment instanceof AbstractNioChannel) {
                arrayList.add((AbstractNioChannel) objAttachment);
            } else {
                selectionKey.cancel();
                invokeChannelUnregistered((NioTask) objAttachment, selectionKey, null);
            }
        }
        for (AbstractNioChannel abstractNioChannel : arrayList) {
            abstractNioChannel.unsafe().close(abstractNioChannel.unsafe().voidPromise());
        }
    }

    private static void handleLoopException(Throwable th) {
        logger.warn("Unexpected exception in the selector loop.", th);
        try {
            Thread.sleep(1000L);
        } catch (InterruptedException unused) {
        }
    }

    private static void invokeChannelUnregistered(NioTask<SelectableChannel> nioTask, SelectionKey selectionKey, Throwable th) {
        try {
            nioTask.channelUnregistered(selectionKey.channel(), th);
        } catch (Exception e2) {
            logger.warn("Unexpected exception while running NioTask.channelUnregistered()", (Throwable) e2);
        }
    }

    private static Queue<Runnable> newTaskQueue(EventLoopTaskQueueFactory eventLoopTaskQueueFactory) {
        return eventLoopTaskQueueFactory == null ? newTaskQueue0(SingleThreadEventLoop.DEFAULT_MAX_PENDING_TASKS) : eventLoopTaskQueueFactory.newTaskQueue(SingleThreadEventLoop.DEFAULT_MAX_PENDING_TASKS);
    }

    private static Queue<Runnable> newTaskQueue0(int i) {
        return i == Integer.MAX_VALUE ? PlatformDependent.newMpscQueue() : PlatformDependent.newMpscQueue(i);
    }

    private SelectorTuple openSelector() {
        try {
            final AbstractSelector abstractSelectorOpenSelector = this.provider.openSelector();
            if (DISABLE_KEY_SET_OPTIMIZATION) {
                return new SelectorTuple(abstractSelectorOpenSelector);
            }
            Object objDoPrivileged = AccessController.doPrivileged(new PrivilegedAction<Object>() { // from class: io.netty.channel.nio.NioEventLoop.3
                @Override // java.security.PrivilegedAction
                public Object run() {
                    try {
                        return Class.forName("sun.nio.ch.SelectorImpl", false, PlatformDependent.getSystemClassLoader());
                    } catch (Throwable th) {
                        return th;
                    }
                }
            });
            if (objDoPrivileged instanceof Class) {
                final Class cls = (Class) objDoPrivileged;
                if (cls.isAssignableFrom(abstractSelectorOpenSelector.getClass())) {
                    final SelectedSelectionKeySet selectedSelectionKeySet = new SelectedSelectionKeySet();
                    Object objDoPrivileged2 = AccessController.doPrivileged(new PrivilegedAction<Object>() { // from class: io.netty.channel.nio.NioEventLoop.4
                        @Override // java.security.PrivilegedAction
                        public Object run() {
                            try {
                                Field declaredField = cls.getDeclaredField("selectedKeys");
                                Field declaredField2 = cls.getDeclaredField("publicSelectedKeys");
                                if (PlatformDependent.javaVersion() >= 9 && PlatformDependent.hasUnsafe()) {
                                    long jObjectFieldOffset = PlatformDependent.objectFieldOffset(declaredField);
                                    long jObjectFieldOffset2 = PlatformDependent.objectFieldOffset(declaredField2);
                                    if (jObjectFieldOffset != -1 && jObjectFieldOffset2 != -1) {
                                        PlatformDependent.putObject(abstractSelectorOpenSelector, jObjectFieldOffset, selectedSelectionKeySet);
                                        PlatformDependent.putObject(abstractSelectorOpenSelector, jObjectFieldOffset2, selectedSelectionKeySet);
                                        return null;
                                    }
                                }
                                Throwable thTrySetAccessible = ReflectionUtil.trySetAccessible(declaredField, true);
                                if (thTrySetAccessible != null) {
                                    return thTrySetAccessible;
                                }
                                Throwable thTrySetAccessible2 = ReflectionUtil.trySetAccessible(declaredField2, true);
                                if (thTrySetAccessible2 != null) {
                                    return thTrySetAccessible2;
                                }
                                declaredField.set(abstractSelectorOpenSelector, selectedSelectionKeySet);
                                declaredField2.set(abstractSelectorOpenSelector, selectedSelectionKeySet);
                                return null;
                            } catch (IllegalAccessException e2) {
                                return e2;
                            } catch (NoSuchFieldException e3) {
                                return e3;
                            }
                        }
                    });
                    if (!(objDoPrivileged2 instanceof Exception)) {
                        this.selectedKeys = selectedSelectionKeySet;
                        logger.trace("instrumented a special java.util.Set into: {}", abstractSelectorOpenSelector);
                        return new SelectorTuple(abstractSelectorOpenSelector, new SelectedSelectionKeySetSelector(abstractSelectorOpenSelector, selectedSelectionKeySet));
                    }
                    this.selectedKeys = null;
                    logger.trace("failed to instrument a special java.util.Set into: {}", abstractSelectorOpenSelector, (Exception) objDoPrivileged2);
                    return new SelectorTuple(abstractSelectorOpenSelector);
                }
            }
            if (objDoPrivileged instanceof Throwable) {
                logger.trace("failed to instrument a special java.util.Set into: {}", abstractSelectorOpenSelector, (Throwable) objDoPrivileged);
            }
            return new SelectorTuple(abstractSelectorOpenSelector);
        } catch (IOException e2) {
            throw new ChannelException("failed to open a new selector", e2);
        }
    }

    private void processSelectedKey(SelectionKey selectionKey, AbstractNioChannel abstractNioChannel) {
        AbstractNioChannel.NioUnsafe nioUnsafeUnsafe = abstractNioChannel.unsafe();
        if (!selectionKey.isValid()) {
            try {
                if (abstractNioChannel.eventLoop() == this) {
                    nioUnsafeUnsafe.close(nioUnsafeUnsafe.voidPromise());
                    return;
                }
                return;
            } catch (Throwable unused) {
                return;
            }
        }
        try {
            int i = selectionKey.readyOps();
            if ((i & 8) != 0) {
                selectionKey.interestOps(selectionKey.interestOps() & (-9));
                nioUnsafeUnsafe.finishConnect();
            }
            if ((i & 4) != 0) {
                abstractNioChannel.unsafe().forceFlush();
            }
            if ((i & 17) != 0 || i == 0) {
                nioUnsafeUnsafe.read();
            }
        } catch (CancelledKeyException unused2) {
            nioUnsafeUnsafe.close(nioUnsafeUnsafe.voidPromise());
        }
    }

    private void processSelectedKeys() {
        if (this.selectedKeys != null) {
            processSelectedKeysOptimized();
        } else {
            processSelectedKeysPlain(this.selector.selectedKeys());
        }
    }

    private void processSelectedKeysOptimized() {
        int i = 0;
        while (true) {
            SelectedSelectionKeySet selectedSelectionKeySet = this.selectedKeys;
            if (i >= selectedSelectionKeySet.size) {
                return;
            }
            SelectionKey[] selectionKeyArr = selectedSelectionKeySet.keys;
            SelectionKey selectionKey = selectionKeyArr[i];
            selectionKeyArr[i] = null;
            Object objAttachment = selectionKey.attachment();
            if (objAttachment instanceof AbstractNioChannel) {
                processSelectedKey(selectionKey, (AbstractNioChannel) objAttachment);
            } else {
                processSelectedKey(selectionKey, (NioTask<SelectableChannel>) objAttachment);
            }
            if (this.needsToSelectAgain) {
                this.selectedKeys.reset(i + 1);
                selectAgain();
                i = -1;
            }
            i++;
        }
    }

    private void processSelectedKeysPlain(Set<SelectionKey> set) {
        if (set.isEmpty()) {
            return;
        }
        Iterator<SelectionKey> it = set.iterator();
        while (true) {
            SelectionKey next = it.next();
            Object objAttachment = next.attachment();
            it.remove();
            if (objAttachment instanceof AbstractNioChannel) {
                processSelectedKey(next, (AbstractNioChannel) objAttachment);
            } else {
                processSelectedKey(next, (NioTask<SelectableChannel>) objAttachment);
            }
            if (!it.hasNext()) {
                return;
            }
            if (this.needsToSelectAgain) {
                selectAgain();
                Set<SelectionKey> setSelectedKeys = this.selector.selectedKeys();
                if (setSelectedKeys.isEmpty()) {
                    return;
                } else {
                    it = setSelectedKeys.iterator();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void rebuildSelector0() {
        Selector selector = this.selector;
        if (selector == null) {
            return;
        }
        try {
            SelectorTuple selectorTupleOpenSelector = openSelector();
            int i = 0;
            for (SelectionKey selectionKey : selector.keys()) {
                Object objAttachment = selectionKey.attachment();
                try {
                    if (selectionKey.isValid() && selectionKey.channel().keyFor(selectorTupleOpenSelector.unwrappedSelector) == null) {
                        int iInterestOps = selectionKey.interestOps();
                        selectionKey.cancel();
                        SelectionKey selectionKeyRegister = selectionKey.channel().register(selectorTupleOpenSelector.unwrappedSelector, iInterestOps, objAttachment);
                        if (objAttachment instanceof AbstractNioChannel) {
                            ((AbstractNioChannel) objAttachment).selectionKey = selectionKeyRegister;
                        }
                        i++;
                    }
                } catch (Exception e2) {
                    logger.warn("Failed to re-register a Channel to the new Selector.", (Throwable) e2);
                    if (objAttachment instanceof AbstractNioChannel) {
                        AbstractNioChannel abstractNioChannel = (AbstractNioChannel) objAttachment;
                        abstractNioChannel.unsafe().close(abstractNioChannel.unsafe().voidPromise());
                    } else {
                        invokeChannelUnregistered((NioTask) objAttachment, selectionKey, e2);
                    }
                }
            }
            this.selector = selectorTupleOpenSelector.selector;
            this.unwrappedSelector = selectorTupleOpenSelector.unwrappedSelector;
            try {
                selector.close();
            } catch (Throwable th) {
                if (logger.isWarnEnabled()) {
                    logger.warn("Failed to close the old Selector.", th);
                }
            }
            InternalLogger internalLogger = logger;
            if (internalLogger.isInfoEnabled()) {
                internalLogger.info("Migrated " + i + " channel(s) to the new Selector.");
            }
        } catch (Exception e3) {
            logger.warn("Failed to create a new Selector.", (Throwable) e3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void register0(SelectableChannel selectableChannel, int i, NioTask<?> nioTask) {
        try {
            selectableChannel.register(this.unwrappedSelector, i, nioTask);
        } catch (Exception e2) {
            throw new EventLoopException("failed to register a channel", e2);
        }
    }

    private int select(long j2) throws IOException {
        if (j2 == Long.MAX_VALUE) {
            return this.selector.select();
        }
        long jDeadlineToDelayNanos = AbstractScheduledEventExecutor.deadlineToDelayNanos(j2 + 995000) / 1000000;
        Selector selector = this.selector;
        return jDeadlineToDelayNanos <= 0 ? selector.selectNow() : selector.select(jDeadlineToDelayNanos);
    }

    private void selectAgain() {
        this.needsToSelectAgain = false;
        try {
            this.selector.selectNow();
        } catch (Throwable th) {
            logger.warn("Failed to update SelectionKeys.", th);
        }
    }

    private boolean unexpectedSelectorWakeup(int i) {
        if (Thread.interrupted()) {
            InternalLogger internalLogger = logger;
            if (internalLogger.isDebugEnabled()) {
                internalLogger.debug("Selector.select() returned prematurely because Thread.currentThread().interrupt() was called. Use NioEventLoop.shutdownGracefully() to shutdown the NioEventLoop.");
            }
            return true;
        }
        int i2 = SELECTOR_AUTO_REBUILD_THRESHOLD;
        if (i2 <= 0 || i < i2) {
            return false;
        }
        logger.warn("Selector.select() returned prematurely {} times in a row; rebuilding Selector {}.", Integer.valueOf(i), this.selector);
        rebuildSelector();
        return true;
    }

    @Override // io.netty.util.concurrent.AbstractScheduledEventExecutor
    public boolean afterScheduledTaskSubmitted(long j2) {
        return j2 < this.nextWakeupNanos.get();
    }

    @Override // io.netty.util.concurrent.AbstractScheduledEventExecutor
    public boolean beforeScheduledTaskSubmitted(long j2) {
        return j2 < this.nextWakeupNanos.get();
    }

    public void cancel(SelectionKey selectionKey) {
        selectionKey.cancel();
        int i = this.cancelledKeys + 1;
        this.cancelledKeys = i;
        if (i >= 256) {
            this.cancelledKeys = 0;
            this.needsToSelectAgain = true;
        }
    }

    @Override // io.netty.util.concurrent.SingleThreadEventExecutor
    public void cleanup() {
        try {
            this.selector.close();
        } catch (IOException e2) {
            logger.warn("Failed to close a selector.", (Throwable) e2);
        }
    }

    public int getIoRatio() {
        return this.ioRatio;
    }

    public void rebuildSelector() {
        if (inEventLoop()) {
            rebuildSelector0();
        } else {
            execute(new Runnable() { // from class: io.netty.channel.nio.NioEventLoop.6
                @Override // java.lang.Runnable
                public void run() {
                    NioEventLoop.this.rebuildSelector0();
                }
            });
        }
    }

    public void register(final SelectableChannel selectableChannel, final int i, final NioTask<?> nioTask) {
        ObjectUtil.checkNotNull(selectableChannel, dj8.CHANNEL);
        if (i == 0) {
            throw new IllegalArgumentException("interestOps must be non-zero.");
        }
        if (((~selectableChannel.validOps()) & i) != 0) {
            throw new IllegalArgumentException("invalid interestOps: " + i + "(validOps: " + selectableChannel.validOps() + ')');
        }
        ObjectUtil.checkNotNull(nioTask, "task");
        if (isShutdown()) {
            throw new IllegalStateException("event loop shut down");
        }
        if (inEventLoop()) {
            register0(selectableChannel, i, nioTask);
            return;
        }
        try {
            submit(new Runnable() { // from class: io.netty.channel.nio.NioEventLoop.5
                @Override // java.lang.Runnable
                public void run() {
                    NioEventLoop.this.register0(selectableChannel, i, nioTask);
                }
            }).sync2();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }

    @Override // io.netty.channel.SingleThreadEventLoop
    public int registeredChannels() {
        return this.selector.keys().size() - this.cancelledKeys;
    }

    /* JADX WARN: Code duplicated, block: B:103:0x0124 A[Catch: all -> 0x0152, TRY_LEAVE, TryCatch #9 {all -> 0x0152, blocks: (B:92:0x0106, B:100:0x011b, B:101:0x011c, B:103:0x0124, B:4:0x0002, B:30:0x0054, B:39:0x0069, B:51:0x00a2, B:56:0x00ac, B:58:0x00b4, B:37:0x0065, B:38:0x0068, B:41:0x0070, B:43:0x0077, B:45:0x0088, B:46:0x0096, B:47:0x0097, B:21:0x002f, B:24:0x003e, B:28:0x004d, B:68:0x00d5, B:69:0x00da, B:77:0x00e2, B:78:0x00e5), top: B:132:0x0106, inners: #11 }] */
    /* JADX WARN: Code duplicated, block: B:124:0x0060 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:147:0x00d1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:149:0x00ee A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:150:0x0118 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:151:0x014f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:152:0x00f7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:155:0x0001 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:156:0x0001 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:158:0x00c8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:166:0x0146 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:167:0x010f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:171:0x0002 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:172:0x0002 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:174:0x0002 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:175:0x0002 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:176:0x0002 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:177:0x0002 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:33:0x005e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:40:0x006e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:41:0x0070 A[Catch: all -> 0x00db, Error -> 0x00dd, CancelledKeyException -> 0x00df, TRY_LEAVE, TryCatch #11 {Error -> 0x00dd, blocks: (B:4:0x0002, B:30:0x0054, B:39:0x0069, B:51:0x00a2, B:56:0x00ac, B:58:0x00b4, B:37:0x0065, B:38:0x0068, B:41:0x0070, B:43:0x0077, B:45:0x0088, B:46:0x0096, B:47:0x0097, B:21:0x002f, B:24:0x003e, B:28:0x004d, B:68:0x00d5, B:69:0x00da, B:77:0x00e2, B:78:0x00e5), top: B:135:0x0002, outer: #9 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x0097 A[Catch: all -> 0x00db, Error -> 0x00dd, CancelledKeyException -> 0x00df, TryCatch #11 {Error -> 0x00dd, blocks: (B:4:0x0002, B:30:0x0054, B:39:0x0069, B:51:0x00a2, B:56:0x00ac, B:58:0x00b4, B:37:0x0065, B:38:0x0068, B:41:0x0070, B:43:0x0077, B:45:0x0088, B:46:0x0096, B:47:0x0097, B:21:0x002f, B:24:0x003e, B:28:0x004d, B:68:0x00d5, B:69:0x00da, B:77:0x00e2, B:78:0x00e5), top: B:135:0x0002, outer: #9 }] */
    /* JADX WARN: Code duplicated, block: B:54:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:56:0x00ac A[Catch: all -> 0x00db, Error -> 0x00dd, CancelledKeyException -> 0x00df, TryCatch #11 {Error -> 0x00dd, blocks: (B:4:0x0002, B:30:0x0054, B:39:0x0069, B:51:0x00a2, B:56:0x00ac, B:58:0x00b4, B:37:0x0065, B:38:0x0068, B:41:0x0070, B:43:0x0077, B:45:0x0088, B:46:0x0096, B:47:0x0097, B:21:0x002f, B:24:0x003e, B:28:0x004d, B:68:0x00d5, B:69:0x00da, B:77:0x00e2, B:78:0x00e5), top: B:135:0x0002, outer: #9 }] */
    /* JADX WARN: Code duplicated, block: B:58:0x00b4 A[Catch: all -> 0x00db, Error -> 0x00dd, CancelledKeyException -> 0x00df, TRY_LEAVE, TryCatch #11 {Error -> 0x00dd, blocks: (B:4:0x0002, B:30:0x0054, B:39:0x0069, B:51:0x00a2, B:56:0x00ac, B:58:0x00b4, B:37:0x0065, B:38:0x0068, B:41:0x0070, B:43:0x0077, B:45:0x0088, B:46:0x0096, B:47:0x0097, B:21:0x002f, B:24:0x003e, B:28:0x004d, B:68:0x00d5, B:69:0x00da, B:77:0x00e2, B:78:0x00e5), top: B:135:0x0002, outer: #9 }] */
    /* JADX WARN: Instruction removed from duplicated block: B:103:0x0124, please report this as an issue */
    @Override // io.netty.util.concurrent.SingleThreadEventExecutor
    public void run() {
        InternalLogger internalLogger;
        int i;
        boolean zRunAllTasks;
        long jNanoTime;
        InternalLogger internalLogger2;
        long jNextScheduledTaskDeadlineNanos;
        while (true) {
            int i2 = 0;
            while (true) {
                try {
                    try {
                        try {
                            int iCalculateStrategy = this.selectStrategy.calculateStrategy(this.selectNowSupplier, hasTasks());
                            try {
                                try {
                                    try {
                                        if (iCalculateStrategy != -3) {
                                            if (iCalculateStrategy != -2) {
                                                if (iCalculateStrategy != -1) {
                                                }
                                                i2++;
                                                this.cancelledKeys = 0;
                                                this.needsToSelectAgain = false;
                                                i = this.ioRatio;
                                                if (i == 100) {
                                                    if (iCalculateStrategy > 0) {
                                                        try {
                                                            processSelectedKeys();
                                                        } catch (Throwable th) {
                                                            runAllTasks();
                                                            throw th;
                                                        }
                                                    }
                                                    zRunAllTasks = runAllTasks();
                                                } else if (iCalculateStrategy > 0) {
                                                    jNanoTime = System.nanoTime();
                                                    try {
                                                        processSelectedKeys();
                                                        zRunAllTasks = runAllTasks(((System.nanoTime() - jNanoTime) * ((long) (100 - i))) / ((long) i));
                                                    } catch (Throwable th2) {
                                                        runAllTasks(((System.nanoTime() - jNanoTime) * ((long) (100 - i))) / ((long) i));
                                                        throw th2;
                                                    }
                                                } else {
                                                    zRunAllTasks = runAllTasks(0L);
                                                }
                                                if (!zRunAllTasks || iCalculateStrategy > 0) {
                                                    if (i2 > 3) {
                                                        internalLogger2 = logger;
                                                        if (internalLogger2.isDebugEnabled()) {
                                                            internalLogger2.debug("Selector.select() returned prematurely {} times in a row for Selector {}.", Integer.valueOf(i2 - 1), this.selector);
                                                        }
                                                    }
                                                } else if (!unexpectedSelectorWakeup(i2)) {
                                                    if (isShuttingDown()) {
                                                        closeAll();
                                                        if (confirmShutdown()) {
                                                            return;
                                                        }
                                                    } else {
                                                        continue;
                                                    }
                                                }
                                                i2 = 0;
                                                if (isShuttingDown()) {
                                                    closeAll();
                                                    if (confirmShutdown()) {
                                                        return;
                                                    }
                                                } else {
                                                    continue;
                                                }
                                            } else {
                                                try {
                                                    if (isShuttingDown()) {
                                                        closeAll();
                                                        if (confirmShutdown()) {
                                                            return;
                                                        }
                                                    } else {
                                                        continue;
                                                    }
                                                } catch (Error e2) {
                                                    throw e2;
                                                }
                                            }
                                        }
                                        if (isShuttingDown()) {
                                            closeAll();
                                            if (confirmShutdown()) {
                                                return;
                                            }
                                        } else {
                                            continue;
                                        }
                                    } catch (Throwable th3) {
                                        handleLoopException(th3);
                                    }
                                } catch (Error e3) {
                                    throw e3;
                                }
                                if (!hasTasks()) {
                                    iCalculateStrategy = select(jNextScheduledTaskDeadlineNanos);
                                }
                                this.nextWakeupNanos.lazySet(-1L);
                                i2++;
                                this.cancelledKeys = 0;
                                this.needsToSelectAgain = false;
                                i = this.ioRatio;
                                if (i == 100) {
                                    if (iCalculateStrategy > 0) {
                                        processSelectedKeys();
                                    }
                                    zRunAllTasks = runAllTasks();
                                } else if (iCalculateStrategy > 0) {
                                    jNanoTime = System.nanoTime();
                                    processSelectedKeys();
                                    zRunAllTasks = runAllTasks(((System.nanoTime() - jNanoTime) * ((long) (100 - i))) / ((long) i));
                                } else {
                                    zRunAllTasks = runAllTasks(0L);
                                }
                                if (zRunAllTasks) {
                                    if (i2 > 3) {
                                        internalLogger2 = logger;
                                        if (internalLogger2.isDebugEnabled()) {
                                            internalLogger2.debug("Selector.select() returned prematurely {} times in a row for Selector {}.", Integer.valueOf(i2 - 1), this.selector);
                                        }
                                    }
                                    i2 = 0;
                                } else {
                                    if (i2 > 3) {
                                        internalLogger2 = logger;
                                        if (internalLogger2.isDebugEnabled()) {
                                            internalLogger2.debug("Selector.select() returned prematurely {} times in a row for Selector {}.", Integer.valueOf(i2 - 1), this.selector);
                                        }
                                    }
                                    i2 = 0;
                                }
                            } catch (Throwable th4) {
                                this.nextWakeupNanos.lazySet(-1L);
                                throw th4;
                            }
                            jNextScheduledTaskDeadlineNanos = nextScheduledTaskDeadlineNanos();
                            if (jNextScheduledTaskDeadlineNanos == -1) {
                                jNextScheduledTaskDeadlineNanos = Long.MAX_VALUE;
                            }
                            this.nextWakeupNanos.set(jNextScheduledTaskDeadlineNanos);
                        } catch (Error e4) {
                            throw e4;
                        }
                    } catch (IOException e5) {
                        rebuildSelector0();
                        try {
                            handleLoopException(e5);
                            if (isShuttingDown()) {
                                closeAll();
                                if (confirmShutdown()) {
                                    return;
                                }
                            } else {
                                continue;
                            }
                        } catch (CancelledKeyException e6) {
                            e = e6;
                            i2 = 0;
                            internalLogger = logger;
                            if (internalLogger.isDebugEnabled()) {
                                internalLogger.debug(CancelledKeyException.class.getSimpleName() + " raised by a Selector {} - JDK bug?", this.selector, e);
                            }
                            try {
                                if (isShuttingDown()) {
                                    closeAll();
                                    if (confirmShutdown()) {
                                        return;
                                    }
                                } else {
                                    continue;
                                }
                            } catch (Error e7) {
                                throw e7;
                            }
                        } catch (Throwable th5) {
                            th = th5;
                            i2 = 0;
                            try {
                                handleLoopException(th);
                                try {
                                    if (isShuttingDown()) {
                                        closeAll();
                                        if (confirmShutdown()) {
                                            return;
                                        }
                                    } else {
                                        continue;
                                    }
                                } catch (Error e8) {
                                    throw e8;
                                }
                            } catch (Throwable th6) {
                                try {
                                    if (isShuttingDown()) {
                                        closeAll();
                                        if (confirmShutdown()) {
                                            return;
                                        }
                                    }
                                } catch (Error e9) {
                                    throw e9;
                                } catch (Throwable th7) {
                                    handleLoopException(th7);
                                }
                                throw th6;
                            }
                        }
                    }
                } catch (CancelledKeyException e10) {
                    e = e10;
                    internalLogger = logger;
                    if (internalLogger.isDebugEnabled()) {
                        internalLogger.debug(CancelledKeyException.class.getSimpleName() + " raised by a Selector {} - JDK bug?", this.selector, e);
                    }
                    if (isShuttingDown()) {
                        closeAll();
                        if (confirmShutdown()) {
                            return;
                        }
                    } else {
                        continue;
                    }
                } catch (Throwable th8) {
                    th = th8;
                    handleLoopException(th);
                    if (isShuttingDown()) {
                        closeAll();
                        if (confirmShutdown()) {
                            return;
                        }
                    } else {
                        continue;
                    }
                }
            }
            try {
                if (isShuttingDown()) {
                    closeAll();
                    if (confirmShutdown()) {
                        return;
                    }
                } else {
                    continue;
                }
            } catch (Error e11) {
                throw e11;
            } catch (Throwable th9) {
                handleLoopException(th9);
            }
        }
    }

    public int selectNow() throws IOException {
        return this.selector.selectNow();
    }

    public SelectorProvider selectorProvider() {
        return this.provider;
    }

    public void setIoRatio(int i) {
        if (i > 0 && i <= 100) {
            this.ioRatio = i;
            return;
        }
        throw new IllegalArgumentException("ioRatio: " + i + " (expected: 0 < ioRatio <= 100)");
    }

    public Selector unwrappedSelector() {
        return this.unwrappedSelector;
    }

    @Override // io.netty.util.concurrent.SingleThreadEventExecutor
    public void wakeup(boolean z) {
        if (z || this.nextWakeupNanos.getAndSet(-1L) == -1) {
            return;
        }
        this.selector.wakeup();
    }

    public static final class SelectorTuple {
        final Selector selector;
        final Selector unwrappedSelector;

        public SelectorTuple(Selector selector) {
            this.unwrappedSelector = selector;
            this.selector = selector;
        }

        public SelectorTuple(Selector selector, Selector selector2) {
            this.unwrappedSelector = selector;
            this.selector = selector2;
        }
    }

    @Override // io.netty.util.concurrent.SingleThreadEventExecutor
    public Queue<Runnable> newTaskQueue(int i) {
        return newTaskQueue0(i);
    }

    private static void processSelectedKey(SelectionKey selectionKey, NioTask<SelectableChannel> nioTask) {
        try {
            try {
                nioTask.channelReady(selectionKey.channel(), selectionKey);
                if (!selectionKey.isValid()) {
                    invokeChannelUnregistered(nioTask, selectionKey, null);
                }
            } catch (Exception e2) {
                selectionKey.cancel();
                invokeChannelUnregistered(nioTask, selectionKey, e2);
            }
        } catch (Throwable th) {
            selectionKey.cancel();
            invokeChannelUnregistered(nioTask, selectionKey, null);
            throw th;
        }
    }
}
