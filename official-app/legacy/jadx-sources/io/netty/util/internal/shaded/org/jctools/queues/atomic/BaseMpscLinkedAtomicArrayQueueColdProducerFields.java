package io.netty.util.internal.shaded.org.jctools.queues.atomic;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: classes10.dex */
abstract class BaseMpscLinkedAtomicArrayQueueColdProducerFields<E> extends BaseMpscLinkedAtomicArrayQueuePad3<E> {
    private static final AtomicLongFieldUpdater<BaseMpscLinkedAtomicArrayQueueColdProducerFields> P_LIMIT_UPDATER = AtomicLongFieldUpdater.newUpdater(BaseMpscLinkedAtomicArrayQueueColdProducerFields.class, "producerLimit");
    protected AtomicReferenceArray<E> producerBuffer;
    private volatile long producerLimit;
    protected long producerMask;

    final boolean casProducerLimit(long j2, long j3) {
        return P_LIMIT_UPDATER.compareAndSet(this, j2, j3);
    }

    final long lvProducerLimit() {
        return this.producerLimit;
    }

    final void soProducerLimit(long j2) {
        P_LIMIT_UPDATER.lazySet(this, j2);
    }
}
