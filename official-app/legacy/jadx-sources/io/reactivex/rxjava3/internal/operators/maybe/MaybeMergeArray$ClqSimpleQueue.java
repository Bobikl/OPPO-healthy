package io.reactivex.rxjava3.internal.operators.maybe;

import com.oplus.aiunit.vision.job;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes10.dex */
final class MaybeMergeArray$ClqSimpleQueue<T> extends ConcurrentLinkedQueue<T> implements job<T> {
    private static final long serialVersionUID = -4025173261791142821L;
    int consumerIndex;
    final AtomicInteger producerIndex = new AtomicInteger();

    @Override // com.oplus.aiunit.vision.job
    public int consumerIndex() {
        return this.consumerIndex;
    }

    @Override // com.oplus.aiunit.vision.job
    public void drop() {
        poll();
    }

    public boolean offer(T t, T t2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.concurrent.ConcurrentLinkedQueue, java.util.Queue, com.oplus.aiunit.vision.job, com.oplus.aiunit.vision.f4h
    public T poll() {
        T t = (T) super.poll();
        if (t != null) {
            this.consumerIndex++;
        }
        return t;
    }

    @Override // com.oplus.aiunit.vision.job
    public int producerIndex() {
        return this.producerIndex.get();
    }

    @Override // java.util.concurrent.ConcurrentLinkedQueue, java.util.Queue, com.oplus.aiunit.vision.f4h
    public boolean offer(T t) {
        this.producerIndex.getAndIncrement();
        return super.offer(t);
    }
}
