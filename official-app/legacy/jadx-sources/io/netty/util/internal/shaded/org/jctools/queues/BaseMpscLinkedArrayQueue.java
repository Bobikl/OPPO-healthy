package io.netty.util.internal.shaded.org.jctools.queues;

import com.oplus.deepthinker.sdk.app.aidl.eventfountain.EventType;
import io.netty.util.internal.shaded.org.jctools.util.PortableJvmInfo;
import io.netty.util.internal.shaded.org.jctools.util.Pow2;
import io.netty.util.internal.shaded.org.jctools.util.RangeUtil;
import io.netty.util.internal.shaded.org.jctools.util.UnsafeRefArrayAccess;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes10.dex */
abstract class BaseMpscLinkedArrayQueue<E> extends BaseMpscLinkedArrayQueueColdProducerFields<E> implements MessagePassingQueue<E>, QueueProgressIndicators {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final int CONTINUE_TO_P_INDEX_CAS = 0;
    private static final int QUEUE_FULL = 2;
    private static final int QUEUE_RESIZE = 3;
    private static final int RETRY = 1;
    private static final Object JUMP = new Object();
    private static final Object BUFFER_CONSUMED = new Object();

    public static class WeakIterator<E> implements Iterator<E> {
        private E[] currentBuffer;
        private int mask;
        private E nextElement;
        private long nextIndex;
        private final long pIndex;

        public WeakIterator(E[] eArr, long j2, long j3) {
            this.pIndex = j3 >> 1;
            this.nextIndex = j2 >> 1;
            setBuffer(eArr);
            this.nextElement = getNext();
        }

        /* JADX WARN: Multi-variable type inference failed */
        private E getNext() {
            while (true) {
                long j2 = this.nextIndex;
                if (j2 >= this.pIndex) {
                    break;
                }
                this.nextIndex = 1 + j2;
                E e2 = (E) UnsafeRefArrayAccess.lvRefElement(this.currentBuffer, UnsafeRefArrayAccess.calcCircularRefElementOffset(j2, this.mask));
                if (e2 != null) {
                    if (e2 != BaseMpscLinkedArrayQueue.JUMP) {
                        return e2;
                    }
                    Object objLvRefElement = UnsafeRefArrayAccess.lvRefElement(this.currentBuffer, UnsafeRefArrayAccess.calcRefElementOffset(this.mask + 1));
                    if (objLvRefElement == BaseMpscLinkedArrayQueue.BUFFER_CONSUMED || objLvRefElement == null) {
                        break;
                    }
                    setBuffer((Object[]) objLvRefElement);
                    E e3 = (E) UnsafeRefArrayAccess.lvRefElement(this.currentBuffer, UnsafeRefArrayAccess.calcCircularRefElementOffset(j2, this.mask));
                    if (e3 != null) {
                        return e3;
                    }
                }
            }
            return null;
        }

        private void setBuffer(E[] eArr) {
            this.currentBuffer = eArr;
            this.mask = LinkedArrayQueueUtil.length(eArr) - 2;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.nextElement != null;
        }

        @Override // java.util.Iterator
        public E next() {
            E e2 = this.nextElement;
            if (e2 == null) {
                throw new NoSuchElementException();
            }
            this.nextElement = getNext();
            return e2;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException(EventType.STATE_PACKAGE_CHANGED_REMOVE);
        }
    }

    public BaseMpscLinkedArrayQueue(int i) {
        RangeUtil.checkGreaterThanOrEqual(i, 2, "initialCapacity");
        int iRoundToPowerOfTwo = Pow2.roundToPowerOfTwo(i);
        long j2 = (iRoundToPowerOfTwo - 1) << 1;
        E[] eArr = (E[]) UnsafeRefArrayAccess.allocateRefArray(iRoundToPowerOfTwo + 1);
        this.producerBuffer = eArr;
        this.producerMask = j2;
        this.consumerBuffer = eArr;
        this.consumerMask = j2;
        soProducerLimit(j2);
    }

    private E newBufferPeek(E[] eArr, long j2) {
        E e2 = (E) UnsafeRefArrayAccess.lvRefElement(eArr, LinkedArrayQueueUtil.modifiedCalcCircularRefElementOffset(j2, this.consumerMask));
        if (e2 != null) {
            return e2;
        }
        throw new IllegalStateException("new buffer must have at least one element");
    }

    private E newBufferPoll(E[] eArr, long j2) {
        long jModifiedCalcCircularRefElementOffset = LinkedArrayQueueUtil.modifiedCalcCircularRefElementOffset(j2, this.consumerMask);
        E e2 = (E) UnsafeRefArrayAccess.lvRefElement(eArr, jModifiedCalcCircularRefElementOffset);
        if (e2 == null) {
            throw new IllegalStateException("new buffer must have at least one element");
        }
        UnsafeRefArrayAccess.soRefElement(eArr, jModifiedCalcCircularRefElementOffset, null);
        soConsumerIndex(j2 + 2);
        return e2;
    }

    private static long nextArrayOffset(long j2) {
        return LinkedArrayQueueUtil.modifiedCalcCircularRefElementOffset(j2 + 2, Long.MAX_VALUE);
    }

    private E[] nextBuffer(E[] eArr, long j2) {
        long jNextArrayOffset = nextArrayOffset(j2);
        E[] eArr2 = (E[]) ((Object[]) UnsafeRefArrayAccess.lvRefElement(eArr, jNextArrayOffset));
        this.consumerBuffer = eArr2;
        this.consumerMask = (LinkedArrayQueueUtil.length(eArr2) - 2) << 1;
        UnsafeRefArrayAccess.soRefElement(eArr, jNextArrayOffset, BUFFER_CONSUMED);
        return eArr2;
    }

    private int offerSlowPath(long j2, long j3, long j4) {
        long jLvConsumerIndex = lvConsumerIndex();
        long currentBufferCapacity = getCurrentBufferCapacity(j2) + jLvConsumerIndex;
        if (currentBufferCapacity > j3) {
            return !casProducerLimit(j4, currentBufferCapacity) ? 1 : 0;
        }
        if (availableInQueue(j3, jLvConsumerIndex) <= 0) {
            return 2;
        }
        return casProducerIndex(j3, 1 + j3) ? 3 : 1;
    }

    private void resize(long j2, E[] eArr, long j3, E e2, MessagePassingQueue.Supplier<E> supplier) {
        int nextBufferSize = getNextBufferSize(eArr);
        try {
            E[] eArr2 = (E[]) UnsafeRefArrayAccess.allocateRefArray(nextBufferSize);
            this.producerBuffer = eArr2;
            long j4 = (nextBufferSize - 2) << 1;
            this.producerMask = j4;
            long jModifiedCalcCircularRefElementOffset = LinkedArrayQueueUtil.modifiedCalcCircularRefElementOffset(j3, j2);
            long jModifiedCalcCircularRefElementOffset2 = LinkedArrayQueueUtil.modifiedCalcCircularRefElementOffset(j3, j4);
            if (e2 == null) {
                e2 = supplier.get();
            }
            UnsafeRefArrayAccess.soRefElement(eArr2, jModifiedCalcCircularRefElementOffset2, e2);
            UnsafeRefArrayAccess.soRefElement(eArr, nextArrayOffset(j2), eArr2);
            long jAvailableInQueue = availableInQueue(j3, lvConsumerIndex());
            RangeUtil.checkPositive(jAvailableInQueue, "availableInQueue");
            soProducerLimit(Math.min(j4, jAvailableInQueue) + j3);
            soProducerIndex(j3 + 2);
            UnsafeRefArrayAccess.soRefElement(eArr, jModifiedCalcCircularRefElementOffset, JUMP);
        } catch (OutOfMemoryError e3) {
            soProducerIndex(j3);
            throw e3;
        }
    }

    public abstract long availableInQueue(long j2, long j3);

    @Override // io.netty.util.internal.shaded.org.jctools.queues.IndexedQueueSizeUtil.IndexedQueue, io.netty.util.internal.shaded.org.jctools.queues.MessagePassingQueue
    public abstract int capacity();

    @Override // io.netty.util.internal.shaded.org.jctools.queues.QueueProgressIndicators
    public long currentConsumerIndex() {
        return lvConsumerIndex() / 2;
    }

    @Override // io.netty.util.internal.shaded.org.jctools.queues.QueueProgressIndicators
    public long currentProducerIndex() {
        return lvProducerIndex() / 2;
    }

    @Override // io.netty.util.internal.shaded.org.jctools.queues.MessagePassingQueue
    public int drain(MessagePassingQueue.Consumer<E> consumer) {
        return drain(consumer, capacity());
    }

    @Override // io.netty.util.internal.shaded.org.jctools.queues.MessagePassingQueue
    public int fill(MessagePassingQueue.Supplier<E> supplier) {
        int iCapacity = capacity();
        long j2 = 0;
        do {
            int iFill = fill(supplier, PortableJvmInfo.RECOMENDED_OFFER_BATCH);
            if (iFill == 0) {
                return (int) j2;
            }
            j2 += (long) iFill;
        } while (j2 <= iCapacity);
        return (int) j2;
    }

    public abstract long getCurrentBufferCapacity(long j2);

    public abstract int getNextBufferSize(E[] eArr);

    @Override // java.util.AbstractCollection, java.util.Collection, io.netty.util.internal.shaded.org.jctools.queues.MessagePassingQueue
    public boolean isEmpty() {
        return lvConsumerIndex() == lvProducerIndex();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public Iterator<E> iterator() {
        return new WeakIterator(this.consumerBuffer, lvConsumerIndex(), lvProducerIndex());
    }

    @Override // java.util.Queue, io.netty.util.internal.shaded.org.jctools.queues.MessagePassingQueue
    public boolean offer(E e2) {
        e2.getClass();
        while (true) {
            long jLvProducerLimit = lvProducerLimit();
            long jLvProducerIndex = lvProducerIndex();
            if ((jLvProducerIndex & 1) != 1) {
                long j2 = this.producerMask;
                E[] eArr = this.producerBuffer;
                if (jLvProducerLimit <= jLvProducerIndex) {
                    int iOfferSlowPath = offerSlowPath(j2, jLvProducerIndex, jLvProducerLimit);
                    if (iOfferSlowPath == 1) {
                        continue;
                    } else {
                        if (iOfferSlowPath == 2) {
                            return false;
                        }
                        if (iOfferSlowPath == 3) {
                            resize(j2, eArr, jLvProducerIndex, e2, null);
                            return true;
                        }
                    }
                }
                if (casProducerIndex(jLvProducerIndex, 2 + jLvProducerIndex)) {
                    UnsafeRefArrayAccess.soRefElement(eArr, LinkedArrayQueueUtil.modifiedCalcCircularRefElementOffset(jLvProducerIndex, j2), e2);
                    return true;
                }
            }
        }
    }

    @Override // java.util.Queue, io.netty.util.internal.shaded.org.jctools.queues.MessagePassingQueue
    public E peek() {
        E[] eArr = this.consumerBuffer;
        long jLpConsumerIndex = lpConsumerIndex();
        long j2 = this.consumerMask;
        long jModifiedCalcCircularRefElementOffset = LinkedArrayQueueUtil.modifiedCalcCircularRefElementOffset(jLpConsumerIndex, j2);
        E e2 = (E) UnsafeRefArrayAccess.lvRefElement(eArr, jModifiedCalcCircularRefElementOffset);
        if (e2 == null && jLpConsumerIndex != lvProducerIndex()) {
            do {
                e2 = (E) UnsafeRefArrayAccess.lvRefElement(eArr, jModifiedCalcCircularRefElementOffset);
            } while (e2 == null);
        }
        return e2 == JUMP ? newBufferPeek(nextBuffer(eArr, j2), jLpConsumerIndex) : e2;
    }

    @Override // java.util.Queue, io.netty.util.internal.shaded.org.jctools.queues.MessagePassingQueue
    public E poll() {
        E[] eArr = this.consumerBuffer;
        long jLpConsumerIndex = lpConsumerIndex();
        long j2 = this.consumerMask;
        long jModifiedCalcCircularRefElementOffset = LinkedArrayQueueUtil.modifiedCalcCircularRefElementOffset(jLpConsumerIndex, j2);
        E e2 = (E) UnsafeRefArrayAccess.lvRefElement(eArr, jModifiedCalcCircularRefElementOffset);
        if (e2 == null) {
            if (jLpConsumerIndex == lvProducerIndex()) {
                return null;
            }
            do {
                e2 = (E) UnsafeRefArrayAccess.lvRefElement(eArr, jModifiedCalcCircularRefElementOffset);
            } while (e2 == null);
        }
        if (e2 == JUMP) {
            return newBufferPoll(nextBuffer(eArr, j2), jLpConsumerIndex);
        }
        UnsafeRefArrayAccess.soRefElement(eArr, jModifiedCalcCircularRefElementOffset, null);
        soConsumerIndex(jLpConsumerIndex + 2);
        return e2;
    }

    @Override // io.netty.util.internal.shaded.org.jctools.queues.MessagePassingQueue
    public boolean relaxedOffer(E e2) {
        return offer(e2);
    }

    @Override // io.netty.util.internal.shaded.org.jctools.queues.MessagePassingQueue
    public E relaxedPeek() {
        E[] eArr = this.consumerBuffer;
        long jLpConsumerIndex = lpConsumerIndex();
        long j2 = this.consumerMask;
        E e2 = (E) UnsafeRefArrayAccess.lvRefElement(eArr, LinkedArrayQueueUtil.modifiedCalcCircularRefElementOffset(jLpConsumerIndex, j2));
        return e2 == JUMP ? newBufferPeek(nextBuffer(eArr, j2), jLpConsumerIndex) : e2;
    }

    @Override // io.netty.util.internal.shaded.org.jctools.queues.MessagePassingQueue
    public E relaxedPoll() {
        E[] eArr = this.consumerBuffer;
        long jLpConsumerIndex = lpConsumerIndex();
        long j2 = this.consumerMask;
        long jModifiedCalcCircularRefElementOffset = LinkedArrayQueueUtil.modifiedCalcCircularRefElementOffset(jLpConsumerIndex, j2);
        E e2 = (E) UnsafeRefArrayAccess.lvRefElement(eArr, jModifiedCalcCircularRefElementOffset);
        if (e2 == null) {
            return null;
        }
        if (e2 == JUMP) {
            return newBufferPoll(nextBuffer(eArr, j2), jLpConsumerIndex);
        }
        UnsafeRefArrayAccess.soRefElement(eArr, jModifiedCalcCircularRefElementOffset, null);
        soConsumerIndex(jLpConsumerIndex + 2);
        return e2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, io.netty.util.internal.shaded.org.jctools.queues.MessagePassingQueue
    public int size() {
        long jLvProducerIndex;
        long jLvConsumerIndex;
        long jLvConsumerIndex2 = lvConsumerIndex();
        while (true) {
            jLvProducerIndex = lvProducerIndex();
            jLvConsumerIndex = lvConsumerIndex();
            if (jLvConsumerIndex2 == jLvConsumerIndex) {
                break;
            }
            jLvConsumerIndex2 = jLvConsumerIndex;
        }
        long j2 = (jLvProducerIndex - jLvConsumerIndex) >> 1;
        if (j2 > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        return (int) j2;
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        return getClass().getName();
    }

    @Override // io.netty.util.internal.shaded.org.jctools.queues.MessagePassingQueue
    public int drain(MessagePassingQueue.Consumer<E> consumer, int i) {
        return MessagePassingQueueUtil.drain(this, consumer, i);
    }

    @Override // io.netty.util.internal.shaded.org.jctools.queues.MessagePassingQueue
    public void drain(MessagePassingQueue.Consumer<E> consumer, MessagePassingQueue.WaitStrategy waitStrategy, MessagePassingQueue.ExitCondition exitCondition) {
        MessagePassingQueueUtil.drain(this, consumer, waitStrategy, exitCondition);
    }

    @Override // io.netty.util.internal.shaded.org.jctools.queues.MessagePassingQueue
    public int fill(MessagePassingQueue.Supplier<E> supplier, int i) {
        long j2;
        if (supplier == null) {
            throw new IllegalArgumentException("supplier is null");
        }
        if (i < 0) {
            throw new IllegalArgumentException("limit is negative:" + i);
        }
        if (i == 0) {
            return 0;
        }
        while (true) {
            long jLvProducerLimit = lvProducerLimit();
            long jLvProducerIndex = lvProducerIndex();
            if ((jLvProducerIndex & 1) != 1) {
                long j3 = this.producerMask;
                E[] eArr = this.producerBuffer;
                long jMin = Math.min(jLvProducerLimit, (((long) i) * 2) + jLvProducerIndex);
                if (jLvProducerIndex >= jLvProducerLimit) {
                    int iOfferSlowPath = offerSlowPath(j3, jLvProducerIndex, jLvProducerLimit);
                    if (iOfferSlowPath != 0 && iOfferSlowPath != 1) {
                        if (iOfferSlowPath == 2) {
                            return 0;
                        }
                        if (iOfferSlowPath == 3) {
                            resize(j3, eArr, jLvProducerIndex, null, supplier);
                            return 1;
                        }
                        j2 = jMin;
                    }
                } else {
                    j2 = jMin;
                }
                if (casProducerIndex(jLvProducerIndex, j2)) {
                    int i2 = (int) ((j2 - jLvProducerIndex) / 2);
                    for (int i3 = 0; i3 < i2; i3++) {
                        UnsafeRefArrayAccess.soRefElement(eArr, LinkedArrayQueueUtil.modifiedCalcCircularRefElementOffset((((long) i3) * 2) + jLvProducerIndex, j3), supplier.get());
                    }
                    return i2;
                }
            }
        }
    }

    @Override // io.netty.util.internal.shaded.org.jctools.queues.MessagePassingQueue
    public void fill(MessagePassingQueue.Supplier<E> supplier, MessagePassingQueue.WaitStrategy waitStrategy, MessagePassingQueue.ExitCondition exitCondition) {
        MessagePassingQueueUtil.fill(this, supplier, waitStrategy, exitCondition);
    }
}
