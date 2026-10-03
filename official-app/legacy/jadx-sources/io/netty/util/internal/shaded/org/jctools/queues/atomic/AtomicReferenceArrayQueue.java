package io.netty.util.internal.shaded.org.jctools.queues.atomic;

import com.oplus.deepthinker.sdk.app.aidl.eventfountain.EventType;
import io.netty.util.internal.shaded.org.jctools.queues.IndexedQueueSizeUtil;
import io.netty.util.internal.shaded.org.jctools.queues.MessagePassingQueue;
import io.netty.util.internal.shaded.org.jctools.queues.QueueProgressIndicators;
import io.netty.util.internal.shaded.org.jctools.queues.SupportsIterator;
import io.netty.util.internal.shaded.org.jctools.util.Pow2;
import java.util.AbstractQueue;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: classes10.dex */
abstract class AtomicReferenceArrayQueue<E> extends AbstractQueue<E> implements IndexedQueueSizeUtil.IndexedQueue, QueueProgressIndicators, MessagePassingQueue<E>, SupportsIterator {
    protected final AtomicReferenceArray<E> buffer;
    protected final int mask;

    public static class WeakIterator<E> implements Iterator<E> {
        private final AtomicReferenceArray<E> buffer;
        private final int mask;
        private E nextElement = getNext();
        private long nextIndex;
        private final long pIndex;

        public WeakIterator(long j2, long j3, int i, AtomicReferenceArray<E> atomicReferenceArray) {
            this.nextIndex = j2;
            this.pIndex = j3;
            this.mask = i;
            this.buffer = atomicReferenceArray;
        }

        private E getNext() {
            E e2;
            int i = this.mask;
            AtomicReferenceArray<E> atomicReferenceArray = this.buffer;
            do {
                long j2 = this.nextIndex;
                if (j2 >= this.pIndex) {
                    return null;
                }
                this.nextIndex = 1 + j2;
                e2 = (E) AtomicQueueUtil.lvRefElement(atomicReferenceArray, AtomicQueueUtil.calcCircularRefElementOffset(j2, i));
            } while (e2 == null);
            return e2;
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

    public AtomicReferenceArrayQueue(int i) {
        int iRoundToPowerOfTwo = Pow2.roundToPowerOfTwo(i);
        this.mask = iRoundToPowerOfTwo - 1;
        this.buffer = new AtomicReferenceArray<>(iRoundToPowerOfTwo);
    }

    @Override // io.netty.util.internal.shaded.org.jctools.queues.IndexedQueueSizeUtil.IndexedQueue, io.netty.util.internal.shaded.org.jctools.queues.MessagePassingQueue
    public final int capacity() {
        return this.mask + 1;
    }

    @Override // java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection, io.netty.util.internal.shaded.org.jctools.queues.MessagePassingQueue
    public void clear() {
        while (poll() != null) {
        }
    }

    @Override // io.netty.util.internal.shaded.org.jctools.queues.QueueProgressIndicators
    public final long currentConsumerIndex() {
        return lvConsumerIndex();
    }

    @Override // io.netty.util.internal.shaded.org.jctools.queues.QueueProgressIndicators
    public final long currentProducerIndex() {
        return lvProducerIndex();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, io.netty.util.internal.shaded.org.jctools.queues.MessagePassingQueue
    public final boolean isEmpty() {
        return IndexedQueueSizeUtil.isEmpty(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator<E> iterator() {
        return new WeakIterator(lvConsumerIndex(), lvProducerIndex(), this.mask, this.buffer);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, io.netty.util.internal.shaded.org.jctools.queues.MessagePassingQueue
    public final int size() {
        return IndexedQueueSizeUtil.size(this);
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        return getClass().getName();
    }
}
