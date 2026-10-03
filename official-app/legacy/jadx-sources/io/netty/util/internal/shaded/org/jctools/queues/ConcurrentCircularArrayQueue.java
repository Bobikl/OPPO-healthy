package io.netty.util.internal.shaded.org.jctools.queues;

import com.oplus.deepthinker.sdk.app.aidl.eventfountain.EventType;
import io.netty.util.internal.shaded.org.jctools.util.Pow2;
import io.netty.util.internal.shaded.org.jctools.util.UnsafeRefArrayAccess;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes10.dex */
abstract class ConcurrentCircularArrayQueue<E> extends ConcurrentCircularArrayQueueL0Pad<E> implements MessagePassingQueue<E>, IndexedQueueSizeUtil.IndexedQueue, QueueProgressIndicators, SupportsIterator {
    protected final E[] buffer;
    protected final long mask;

    public static class WeakIterator<E> implements Iterator<E> {
        private final E[] buffer;
        private final long mask;
        private E nextElement = getNext();
        private long nextIndex;
        private final long pIndex;

        public WeakIterator(long j2, long j3, long j4, E[] eArr) {
            this.nextIndex = j2;
            this.pIndex = j3;
            this.mask = j4;
            this.buffer = eArr;
        }

        private E getNext() {
            E e2;
            do {
                long j2 = this.nextIndex;
                if (j2 >= this.pIndex) {
                    return null;
                }
                this.nextIndex = 1 + j2;
                e2 = (E) UnsafeRefArrayAccess.lvRefElement(this.buffer, UnsafeRefArrayAccess.calcCircularRefElementOffset(j2, this.mask));
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

    public ConcurrentCircularArrayQueue(int i) {
        int iRoundToPowerOfTwo = Pow2.roundToPowerOfTwo(i);
        this.mask = iRoundToPowerOfTwo - 1;
        this.buffer = (E[]) UnsafeRefArrayAccess.allocateRefArray(iRoundToPowerOfTwo);
    }

    @Override // io.netty.util.internal.shaded.org.jctools.queues.MessagePassingQueue
    public int capacity() {
        return (int) (this.mask + 1);
    }

    @Override // java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection, io.netty.util.internal.shaded.org.jctools.queues.MessagePassingQueue
    public void clear() {
        while (poll() != null) {
        }
    }

    @Override // io.netty.util.internal.shaded.org.jctools.queues.QueueProgressIndicators
    public long currentConsumerIndex() {
        return lvConsumerIndex();
    }

    @Override // io.netty.util.internal.shaded.org.jctools.queues.QueueProgressIndicators
    public long currentProducerIndex() {
        return lvProducerIndex();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, io.netty.util.internal.shaded.org.jctools.queues.MessagePassingQueue
    public boolean isEmpty() {
        return IndexedQueueSizeUtil.isEmpty(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public Iterator<E> iterator() {
        return new WeakIterator(lvConsumerIndex(), lvProducerIndex(), this.mask, this.buffer);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, io.netty.util.internal.shaded.org.jctools.queues.MessagePassingQueue
    public int size() {
        return IndexedQueueSizeUtil.size(this);
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        return getClass().getName();
    }
}
