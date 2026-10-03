package io.netty.util.internal.shaded.org.jctools.queues.atomic;

import io.netty.util.internal.shaded.org.jctools.queues.MessagePassingQueue;
import io.netty.util.internal.shaded.org.jctools.queues.MessagePassingQueueUtil;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: classes10.dex */
public class MpscAtomicArrayQueue<E> extends MpscAtomicArrayQueueL3Pad<E> {
    public MpscAtomicArrayQueue(int i) {
        super(i);
    }

    @Override // io.netty.util.internal.shaded.org.jctools.queues.atomic.AtomicReferenceArrayQueue, java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection, io.netty.util.internal.shaded.org.jctools.queues.MessagePassingQueue
    public /* bridge */ /* synthetic */ void clear() {
        super.clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.netty.util.internal.shaded.org.jctools.queues.MessagePassingQueue
    public int drain(MessagePassingQueue.Consumer<E> consumer, int i) {
        if (consumer == 0) {
            throw new IllegalArgumentException("c is null");
        }
        if (i < 0) {
            throw new IllegalArgumentException("limit is negative: " + i);
        }
        if (i == 0) {
            return 0;
        }
        AtomicReferenceArray<E> atomicReferenceArray = this.buffer;
        int i2 = this.mask;
        long jLpConsumerIndex = lpConsumerIndex();
        for (int i3 = 0; i3 < i; i3++) {
            long j2 = ((long) i3) + jLpConsumerIndex;
            int iCalcCircularRefElementOffset = AtomicQueueUtil.calcCircularRefElementOffset(j2, i2);
            Object objLvRefElement = AtomicQueueUtil.lvRefElement(atomicReferenceArray, iCalcCircularRefElementOffset);
            if (objLvRefElement == null) {
                return i3;
            }
            AtomicQueueUtil.spRefElement(atomicReferenceArray, iCalcCircularRefElementOffset, null);
            soConsumerIndex(j2 + 1);
            consumer.accept(objLvRefElement);
        }
        return i;
    }

    public final int failFastOffer(E e2) {
        e2.getClass();
        int i = this.mask;
        long j2 = i + 1;
        long jLvProducerIndex = lvProducerIndex();
        if (jLvProducerIndex >= lvProducerLimit()) {
            long jLvConsumerIndex = lvConsumerIndex() + j2;
            if (jLvProducerIndex >= jLvConsumerIndex) {
                return 1;
            }
            soProducerLimit(jLvConsumerIndex);
        }
        if (!casProducerIndex(jLvProducerIndex, 1 + jLvProducerIndex)) {
            return -1;
        }
        AtomicQueueUtil.soRefElement(this.buffer, AtomicQueueUtil.calcCircularRefElementOffset(jLvProducerIndex, i), e2);
        return 0;
    }

    @Override // io.netty.util.internal.shaded.org.jctools.queues.MessagePassingQueue
    public int fill(MessagePassingQueue.Supplier<E> supplier, int i) {
        long jLvProducerIndex;
        int iMin;
        if (supplier == null) {
            throw new IllegalArgumentException("supplier is null");
        }
        if (i < 0) {
            throw new IllegalArgumentException("limit is negative:" + i);
        }
        if (i == 0) {
            return 0;
        }
        int i2 = this.mask;
        long j2 = i2 + 1;
        long jLvProducerLimit = lvProducerLimit();
        do {
            jLvProducerIndex = lvProducerIndex();
            long j3 = jLvProducerLimit - jLvProducerIndex;
            if (j3 <= 0) {
                jLvProducerLimit = lvConsumerIndex() + j2;
                j3 = jLvProducerLimit - jLvProducerIndex;
                if (j3 <= 0) {
                    return 0;
                }
                soProducerLimit(jLvProducerLimit);
            }
            iMin = Math.min((int) j3, i);
        } while (!casProducerIndex(jLvProducerIndex, ((long) iMin) + jLvProducerIndex));
        AtomicReferenceArray<E> atomicReferenceArray = this.buffer;
        for (int i3 = 0; i3 < iMin; i3++) {
            AtomicQueueUtil.soRefElement(atomicReferenceArray, AtomicQueueUtil.calcCircularRefElementOffset(((long) i3) + jLvProducerIndex, i2), supplier.get());
        }
        return iMin;
    }

    @Override // java.util.Queue, io.netty.util.internal.shaded.org.jctools.queues.MessagePassingQueue
    public boolean offer(E e2) {
        long jLvProducerIndex;
        e2.getClass();
        int i = this.mask;
        long jLvProducerLimit = lvProducerLimit();
        do {
            jLvProducerIndex = lvProducerIndex();
            if (jLvProducerIndex >= jLvProducerLimit) {
                jLvProducerLimit = lvConsumerIndex() + ((long) i) + 1;
                if (jLvProducerIndex >= jLvProducerLimit) {
                    return false;
                }
                soProducerLimit(jLvProducerLimit);
            }
        } while (!casProducerIndex(jLvProducerIndex, 1 + jLvProducerIndex));
        AtomicQueueUtil.soRefElement(this.buffer, AtomicQueueUtil.calcCircularRefElementOffset(jLvProducerIndex, i), e2);
        return true;
    }

    public boolean offerIfBelowThreshold(E e2, int i) {
        long jLvProducerIndex;
        e2.getClass();
        int i2 = this.mask;
        long j2 = i2 + 1;
        long jLvProducerLimit = lvProducerLimit();
        do {
            jLvProducerIndex = lvProducerIndex();
            long j3 = i;
            if (j2 - (jLvProducerLimit - jLvProducerIndex) >= j3) {
                long jLvConsumerIndex = lvConsumerIndex();
                if (jLvProducerIndex - jLvConsumerIndex >= j3) {
                    return false;
                }
                jLvProducerLimit = jLvConsumerIndex + j2;
                soProducerLimit(jLvProducerLimit);
            }
        } while (!casProducerIndex(jLvProducerIndex, 1 + jLvProducerIndex));
        AtomicQueueUtil.soRefElement(this.buffer, AtomicQueueUtil.calcCircularRefElementOffset(jLvProducerIndex, i2), e2);
        return true;
    }

    @Override // java.util.Queue, io.netty.util.internal.shaded.org.jctools.queues.MessagePassingQueue
    public E peek() {
        AtomicReferenceArray<E> atomicReferenceArray = this.buffer;
        long jLpConsumerIndex = lpConsumerIndex();
        int iCalcCircularRefElementOffset = AtomicQueueUtil.calcCircularRefElementOffset(jLpConsumerIndex, this.mask);
        E e2 = (E) AtomicQueueUtil.lvRefElement(atomicReferenceArray, iCalcCircularRefElementOffset);
        if (e2 == null) {
            if (jLpConsumerIndex == lvProducerIndex()) {
                return null;
            }
            do {
                e2 = (E) AtomicQueueUtil.lvRefElement(atomicReferenceArray, iCalcCircularRefElementOffset);
            } while (e2 == null);
        }
        return e2;
    }

    @Override // java.util.Queue, io.netty.util.internal.shaded.org.jctools.queues.MessagePassingQueue
    public E poll() {
        long jLpConsumerIndex = lpConsumerIndex();
        int iCalcCircularRefElementOffset = AtomicQueueUtil.calcCircularRefElementOffset(jLpConsumerIndex, this.mask);
        AtomicReferenceArray<E> atomicReferenceArray = this.buffer;
        E e2 = (E) AtomicQueueUtil.lvRefElement(atomicReferenceArray, iCalcCircularRefElementOffset);
        if (e2 == null) {
            if (jLpConsumerIndex == lvProducerIndex()) {
                return null;
            }
            do {
                e2 = (E) AtomicQueueUtil.lvRefElement(atomicReferenceArray, iCalcCircularRefElementOffset);
            } while (e2 == null);
        }
        AtomicQueueUtil.spRefElement(atomicReferenceArray, iCalcCircularRefElementOffset, null);
        soConsumerIndex(jLpConsumerIndex + 1);
        return e2;
    }

    @Override // io.netty.util.internal.shaded.org.jctools.queues.MessagePassingQueue
    public boolean relaxedOffer(E e2) {
        return offer(e2);
    }

    @Override // io.netty.util.internal.shaded.org.jctools.queues.MessagePassingQueue
    public E relaxedPeek() {
        return (E) AtomicQueueUtil.lvRefElement(this.buffer, AtomicQueueUtil.calcCircularRefElementOffset(lpConsumerIndex(), this.mask));
    }

    @Override // io.netty.util.internal.shaded.org.jctools.queues.MessagePassingQueue
    public E relaxedPoll() {
        AtomicReferenceArray<E> atomicReferenceArray = this.buffer;
        long jLpConsumerIndex = lpConsumerIndex();
        int iCalcCircularRefElementOffset = AtomicQueueUtil.calcCircularRefElementOffset(jLpConsumerIndex, this.mask);
        E e2 = (E) AtomicQueueUtil.lvRefElement(atomicReferenceArray, iCalcCircularRefElementOffset);
        if (e2 == null) {
            return null;
        }
        AtomicQueueUtil.spRefElement(atomicReferenceArray, iCalcCircularRefElementOffset, null);
        soConsumerIndex(jLpConsumerIndex + 1);
        return e2;
    }

    @Override // io.netty.util.internal.shaded.org.jctools.queues.atomic.AtomicReferenceArrayQueue, java.util.AbstractCollection
    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }

    @Deprecated
    public int weakOffer(E e2) {
        return failFastOffer(e2);
    }

    @Override // io.netty.util.internal.shaded.org.jctools.queues.MessagePassingQueue
    public int drain(MessagePassingQueue.Consumer<E> consumer) {
        return drain(consumer, capacity());
    }

    @Override // io.netty.util.internal.shaded.org.jctools.queues.MessagePassingQueue
    public void drain(MessagePassingQueue.Consumer<E> consumer, MessagePassingQueue.WaitStrategy waitStrategy, MessagePassingQueue.ExitCondition exitCondition) {
        MessagePassingQueueUtil.drain(this, consumer, waitStrategy, exitCondition);
    }

    @Override // io.netty.util.internal.shaded.org.jctools.queues.MessagePassingQueue
    public int fill(MessagePassingQueue.Supplier<E> supplier) {
        return MessagePassingQueueUtil.fillBounded(this, supplier);
    }

    @Override // io.netty.util.internal.shaded.org.jctools.queues.MessagePassingQueue
    public void fill(MessagePassingQueue.Supplier<E> supplier, MessagePassingQueue.WaitStrategy waitStrategy, MessagePassingQueue.ExitCondition exitCondition) {
        MessagePassingQueueUtil.fill(this, supplier, waitStrategy, exitCondition);
    }
}
