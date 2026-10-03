package io.netty.util.internal.shaded.org.jctools.queues;

import io.netty.util.internal.shaded.org.jctools.util.UnsafeAccess;

/* JADX INFO: loaded from: classes10.dex */
abstract class BaseMpscLinkedArrayQueueColdProducerFields<E> extends BaseMpscLinkedArrayQueuePad3<E> {
    private static final long P_LIMIT_OFFSET = UnsafeAccess.fieldOffset(BaseMpscLinkedArrayQueueColdProducerFields.class, "producerLimit");
    protected E[] producerBuffer;
    private volatile long producerLimit;
    protected long producerMask;

    final boolean casProducerLimit(long j2, long j3) {
        return UnsafeAccess.UNSAFE.compareAndSwapLong(this, P_LIMIT_OFFSET, j2, j3);
    }

    final long lvProducerLimit() {
        return this.producerLimit;
    }

    final void soProducerLimit(long j2) {
        UnsafeAccess.UNSAFE.putOrderedLong(this, P_LIMIT_OFFSET, j2);
    }
}
