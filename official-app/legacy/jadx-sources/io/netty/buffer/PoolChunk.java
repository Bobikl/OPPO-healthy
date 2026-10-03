package io.netty.buffer;

import com.oplus.aiunit.vision.mla;
import io.netty.util.internal.LongCounter;
import io.netty.util.internal.PlatformDependent;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes10.dex */
final class PoolChunk<T> implements PoolChunkMetric {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final int BITMAP_IDX_BIT_LENGTH = 32;
    private static final int INUSED_BIT_LENGTH = 1;
    static final int IS_SUBPAGE_SHIFT = 32;
    static final int IS_USED_SHIFT = 33;
    static final int RUN_OFFSET_SHIFT = 49;
    private static final int SIZE_BIT_LENGTH = 15;
    static final int SIZE_SHIFT = 34;
    private static final int SUBPAGE_BIT_LENGTH = 1;
    final PoolArena<T> arena;
    final Object base;
    private final Deque<ByteBuffer> cachedNioBuffers;
    private final int chunkSize;
    int freeBytes;
    final T memory;
    PoolChunk<T> next;
    private final int pageShifts;
    private final int pageSize;
    PoolChunkList<T> parent;
    private final LongCounter pinnedBytes;
    PoolChunk<T> prev;
    private final LongPriorityQueue[] runsAvail;
    private final ReentrantLock runsAvailLock;
    private final LongLongHashMap runsAvailMap;
    private final PoolSubpage<T>[] subpages;
    final boolean unpooled;

    public PoolChunk(PoolArena<T> poolArena, Object obj, T t, int i, int i2, int i3, int i4) {
        this.pinnedBytes = PlatformDependent.newLongCounter();
        this.unpooled = false;
        this.arena = poolArena;
        this.base = obj;
        this.memory = t;
        this.pageSize = i;
        this.pageShifts = i2;
        this.chunkSize = i3;
        this.freeBytes = i3;
        this.runsAvail = newRunsAvailqueueArray(i4);
        this.runsAvailLock = new ReentrantLock();
        this.runsAvailMap = new LongLongHashMap(-1L);
        int i5 = i3 >> i2;
        this.subpages = new PoolSubpage[i5];
        insertAvailRun(0, i5, ((long) i5) << 34);
        this.cachedNioBuffers = new ArrayDeque(8);
    }

    private long allocateRun(int i) {
        int i2 = i >> this.pageShifts;
        int iPages2pageIdx = this.arena.pages2pageIdx(i2);
        this.runsAvailLock.lock();
        try {
            int iRunFirstBestFit = runFirstBestFit(iPages2pageIdx);
            if (iRunFirstBestFit == -1) {
                return -1L;
            }
            LongPriorityQueue longPriorityQueue = this.runsAvail[iRunFirstBestFit];
            long jPoll = longPriorityQueue.poll();
            removeAvailRun(longPriorityQueue, jPoll);
            if (jPoll != -1) {
                jPoll = splitLargeRun(jPoll, i2);
            }
            this.freeBytes -= runSize(this.pageShifts, jPoll);
            return jPoll;
        } finally {
            this.runsAvailLock.unlock();
        }
    }

    private long allocateSubpage(int i) {
        PoolSubpage<T> poolSubpageFindSubpagePoolHead = this.arena.findSubpagePoolHead(i);
        poolSubpageFindSubpagePoolHead.lock();
        try {
            long jAllocateRun = allocateRun(calculateRunSize(i));
            if (jAllocateRun < 0) {
                return -1L;
            }
            int iRunOffset = runOffset(jAllocateRun);
            int iSizeIdx2size = this.arena.sizeIdx2size(i);
            int i2 = this.pageShifts;
            PoolSubpage<T> poolSubpage = new PoolSubpage<>(poolSubpageFindSubpagePoolHead, this, i2, iRunOffset, runSize(i2, jAllocateRun), iSizeIdx2size);
            this.subpages[iRunOffset] = poolSubpage;
            return poolSubpage.allocate();
        } finally {
            poolSubpageFindSubpagePoolHead.unlock();
        }
    }

    public static int bitmapIdx(long j2) {
        return (int) j2;
    }

    private int calculateRunSize(int i) {
        int i2;
        int i3 = 1 << (this.pageShifts - 4);
        int iSizeIdx2size = this.arena.sizeIdx2size(i);
        int i4 = 0;
        do {
            i4 += this.pageSize;
            i2 = i4 / iSizeIdx2size;
            if (i2 >= i3) {
                break;
            }
        } while (i4 != i2 * iSizeIdx2size);
        while (i2 > i3) {
            i4 -= this.pageSize;
            i2 = i4 / iSizeIdx2size;
        }
        return i4;
    }

    private long collapseNext(long j2) {
        while (true) {
            int iRunOffset = runOffset(j2);
            int iRunPages = runPages(j2);
            int i = iRunOffset + iRunPages;
            long availRunByOffset = getAvailRunByOffset(i);
            if (availRunByOffset == -1) {
                return j2;
            }
            int iRunOffset2 = runOffset(availRunByOffset);
            int iRunPages2 = runPages(availRunByOffset);
            if (availRunByOffset == j2 || i != iRunOffset2) {
                return j2;
            }
            removeAvailRun(availRunByOffset);
            j2 = toRunHandle(iRunOffset, iRunPages + iRunPages2, 0);
        }
    }

    private long collapsePast(long j2) {
        while (true) {
            int iRunOffset = runOffset(j2);
            int iRunPages = runPages(j2);
            long availRunByOffset = getAvailRunByOffset(iRunOffset - 1);
            if (availRunByOffset == -1) {
                return j2;
            }
            int iRunOffset2 = runOffset(availRunByOffset);
            int iRunPages2 = runPages(availRunByOffset);
            if (availRunByOffset == j2 || iRunOffset2 + iRunPages2 != iRunOffset) {
                return j2;
            }
            removeAvailRun(availRunByOffset);
            j2 = toRunHandle(iRunOffset2, iRunPages2 + iRunPages, 0);
        }
    }

    private long collapseRuns(long j2) {
        return collapseNext(collapsePast(j2));
    }

    private long getAvailRunByOffset(int i) {
        return this.runsAvailMap.get(i);
    }

    private void insertAvailRun(int i, int i2, long j2) {
        this.runsAvail[this.arena.pages2pageIdxFloor(i2)].offer(j2);
        insertAvailRun0(i, j2);
        if (i2 > 1) {
            insertAvailRun0(lastPage(i, i2), j2);
        }
    }

    private void insertAvailRun0(int i, long j2) {
        this.runsAvailMap.put(i, j2);
    }

    public static boolean isRun(long j2) {
        return !isSubpage(j2);
    }

    public static boolean isSubpage(long j2) {
        return ((j2 >> 32) & 1) == 1;
    }

    public static boolean isUsed(long j2) {
        return ((j2 >> 33) & 1) == 1;
    }

    private static int lastPage(int i, int i2) {
        return (i + i2) - 1;
    }

    private static LongPriorityQueue[] newRunsAvailqueueArray(int i) {
        LongPriorityQueue[] longPriorityQueueArr = new LongPriorityQueue[i];
        for (int i2 = 0; i2 < i; i2++) {
            longPriorityQueueArr[i2] = new LongPriorityQueue();
        }
        return longPriorityQueueArr;
    }

    private void removeAvailRun(long j2) {
        removeAvailRun(this.runsAvail[this.arena.pages2pageIdxFloor(runPages(j2))], j2);
    }

    private int runFirstBestFit(int i) {
        if (this.freeBytes == this.chunkSize) {
            return this.arena.nPSizes - 1;
        }
        while (i < this.arena.nPSizes) {
            LongPriorityQueue longPriorityQueue = this.runsAvail[i];
            if (longPriorityQueue != null && !longPriorityQueue.isEmpty()) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public static int runOffset(long j2) {
        return (int) (j2 >> 49);
    }

    public static int runPages(long j2) {
        return (int) ((j2 >> 34) & 32767);
    }

    public static int runSize(int i, long j2) {
        return runPages(j2) << i;
    }

    private long splitLargeRun(long j2, int i) {
        int iRunPages = runPages(j2) - i;
        if (iRunPages <= 0) {
            return j2 | 8589934592L;
        }
        int iRunOffset = runOffset(j2);
        int i2 = iRunOffset + i;
        insertAvailRun(i2, iRunPages, toRunHandle(i2, iRunPages, 0));
        return toRunHandle(iRunOffset, i, 1);
    }

    private static long toRunHandle(int i, int i2, int i3) {
        return (((long) i2) << 34) | (((long) i) << 49) | (((long) i3) << 33);
    }

    public boolean allocate(PooledByteBuf<T> pooledByteBuf, int i, int i2, PoolThreadCache poolThreadCache) {
        long jAllocateRun;
        PoolArena<T> poolArena = this.arena;
        if (i2 <= poolArena.smallMaxSizeIdx) {
            jAllocateRun = allocateSubpage(i2);
            if (jAllocateRun < 0) {
                return false;
            }
        } else {
            jAllocateRun = allocateRun(poolArena.sizeIdx2size(i2));
            if (jAllocateRun < 0) {
                return false;
            }
        }
        long j2 = jAllocateRun;
        Deque<ByteBuffer> deque = this.cachedNioBuffers;
        initBuf(pooledByteBuf, deque != null ? deque.pollLast() : null, j2, i, poolThreadCache);
        return true;
    }

    @Override // io.netty.buffer.PoolChunkMetric
    public int chunkSize() {
        return this.chunkSize;
    }

    public void decrementPinnedMemory(int i) {
        this.pinnedBytes.add(-i);
    }

    public void destroy() {
        this.arena.destroyChunk(this);
    }

    public void free(long j2, int i, ByteBuffer byteBuffer) {
        Deque<ByteBuffer> deque;
        int iRunSize = runSize(this.pageShifts, j2);
        if (isSubpage(j2)) {
            PoolSubpage<T> poolSubpageFindSubpagePoolHead = this.arena.findSubpagePoolHead(this.arena.size2SizeIdx(i));
            int iRunOffset = runOffset(j2);
            PoolSubpage<T> poolSubpage = this.subpages[iRunOffset];
            poolSubpageFindSubpagePoolHead.lock();
            try {
                if (poolSubpage.free(poolSubpageFindSubpagePoolHead, bitmapIdx(j2))) {
                    poolSubpageFindSubpagePoolHead.unlock();
                    return;
                } else {
                    this.subpages[iRunOffset] = null;
                    poolSubpageFindSubpagePoolHead.unlock();
                }
            } catch (Throwable th) {
                poolSubpageFindSubpagePoolHead.unlock();
                throw th;
            }
        }
        this.runsAvailLock.lock();
        try {
            long jCollapseRuns = collapseRuns(j2) & (-8589934593L) & (-4294967297L);
            insertAvailRun(runOffset(jCollapseRuns), runPages(jCollapseRuns), jCollapseRuns);
            this.freeBytes += iRunSize;
            this.runsAvailLock.unlock();
            if (byteBuffer == null || (deque = this.cachedNioBuffers) == null || deque.size() >= PooledByteBufAllocator.DEFAULT_MAX_CACHED_BYTEBUFFERS_PER_CHUNK) {
                return;
            }
            this.cachedNioBuffers.offer(byteBuffer);
        } catch (Throwable th2) {
            this.runsAvailLock.unlock();
            throw th2;
        }
    }

    @Override // io.netty.buffer.PoolChunkMetric
    public int freeBytes() {
        this.arena.lock();
        try {
            return this.freeBytes;
        } finally {
            this.arena.unlock();
        }
    }

    public void incrementPinnedMemory(int i) {
        this.pinnedBytes.add(i);
    }

    public void initBuf(PooledByteBuf<T> pooledByteBuf, ByteBuffer byteBuffer, long j2, int i, PoolThreadCache poolThreadCache) {
        if (isSubpage(j2)) {
            initBufWithSubpage(pooledByteBuf, byteBuffer, j2, i, poolThreadCache);
        } else {
            pooledByteBuf.init(this, byteBuffer, j2, runOffset(j2) << this.pageShifts, i, runSize(this.pageShifts, j2), this.arena.parent.threadCache());
        }
    }

    public void initBufWithSubpage(PooledByteBuf<T> pooledByteBuf, ByteBuffer byteBuffer, long j2, int i, PoolThreadCache poolThreadCache) {
        int iRunOffset = runOffset(j2);
        int iBitmapIdx = bitmapIdx(j2);
        PoolSubpage<T> poolSubpage = this.subpages[iRunOffset];
        int i2 = iRunOffset << this.pageShifts;
        int i3 = poolSubpage.elemSize;
        pooledByteBuf.init(this, byteBuffer, j2, i2 + (iBitmapIdx * i3), i, i3, poolThreadCache);
    }

    public int pinnedBytes() {
        return (int) this.pinnedBytes.value();
    }

    public String toString() {
        this.arena.lock();
        try {
            int i = this.freeBytes;
            this.arena.unlock();
            return "Chunk(" + Integer.toHexString(System.identityHashCode(this)) + ": " + usage(i) + "%, " + (this.chunkSize - i) + mla.SEPARATOR + this.chunkSize + ')';
        } catch (Throwable th) {
            this.arena.unlock();
            throw th;
        }
    }

    @Override // io.netty.buffer.PoolChunkMetric
    public int usage() {
        this.arena.lock();
        try {
            return usage(this.freeBytes);
        } finally {
            this.arena.unlock();
        }
    }

    private void removeAvailRun(LongPriorityQueue longPriorityQueue, long j2) {
        longPriorityQueue.remove(j2);
        int iRunOffset = runOffset(j2);
        int iRunPages = runPages(j2);
        this.runsAvailMap.remove(iRunOffset);
        if (iRunPages > 1) {
            this.runsAvailMap.remove(lastPage(iRunOffset, iRunPages));
        }
    }

    private int usage(int i) {
        if (i == 0) {
            return 100;
        }
        int i2 = (int) ((((long) i) * 100) / ((long) this.chunkSize));
        if (i2 == 0) {
            return 99;
        }
        return 100 - i2;
    }

    public PoolChunk(PoolArena<T> poolArena, Object obj, T t, int i) {
        this.pinnedBytes = PlatformDependent.newLongCounter();
        this.unpooled = true;
        this.arena = poolArena;
        this.base = obj;
        this.memory = t;
        this.pageSize = 0;
        this.pageShifts = 0;
        this.runsAvailMap = null;
        this.runsAvail = null;
        this.runsAvailLock = null;
        this.subpages = null;
        this.chunkSize = i;
        this.cachedNioBuffers = null;
    }
}
