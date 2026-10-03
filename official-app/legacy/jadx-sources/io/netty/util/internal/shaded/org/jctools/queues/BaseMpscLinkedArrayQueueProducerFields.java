package io.netty.util.internal.shaded.org.jctools.queues;

import io.netty.util.internal.shaded.org.jctools.util.UnsafeAccess;

/* JADX INFO: loaded from: classes10.dex */
abstract class BaseMpscLinkedArrayQueueProducerFields<E> extends BaseMpscLinkedArrayQueuePad1<E> {
    private static final long P_INDEX_OFFSET = UnsafeAccess.fieldOffset(BaseMpscLinkedArrayQueueProducerFields.class, "producerIndex");
    private volatile long producerIndex;

    final boolean casProducerIndex(long j2, long j3) {
        return UnsafeAccess.UNSAFE.compareAndSwapLong(this, P_INDEX_OFFSET, j2, j3);
    }

    @Override // io.netty.util.internal.shaded.org.jctools.queues.IndexedQueueSizeUtil.IndexedQueue
    public final long lvProducerIndex() {
        return this.producerIndex;
    }

    final void soProducerIndex(long j2) {
        UnsafeAccess.UNSAFE.putOrderedLong(this, P_INDEX_OFFSET, j2);
    }
}
