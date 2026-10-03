package io.reactivex.internal.operators.maybe;

import com.oplus.aiunit.vision.abd;
import com.oplus.aiunit.vision.kob;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: classes10.dex */
final class MaybeMergeArray$MpscFillOnceSimpleQueue<T> extends AtomicReferenceArray<T> implements kob<T> {
    private static final long serialVersionUID = -7969063454040569579L;
    int consumerIndex;
    final AtomicInteger producerIndex;

    public MaybeMergeArray$MpscFillOnceSimpleQueue(int i) {
        super(i);
        this.producerIndex = new AtomicInteger();
    }

    @Override // com.oplus.aiunit.vision.g4h
    public void clear() {
        while (poll() != null && !isEmpty()) {
        }
    }

    @Override // com.oplus.aiunit.vision.kob
    public int consumerIndex() {
        return this.consumerIndex;
    }

    @Override // com.oplus.aiunit.vision.kob
    public void drop() {
        int i = this.consumerIndex;
        lazySet(i, null);
        this.consumerIndex = i + 1;
    }

    @Override // com.oplus.aiunit.vision.g4h
    public boolean isEmpty() {
        return this.consumerIndex == producerIndex();
    }

    @Override // com.oplus.aiunit.vision.g4h
    public boolean offer(T t) {
        abd.d(t, "value is null");
        int andIncrement = this.producerIndex.getAndIncrement();
        if (andIncrement >= length()) {
            return false;
        }
        lazySet(andIncrement, t);
        return true;
    }

    @Override // com.oplus.aiunit.vision.kob
    public T peek() {
        int i = this.consumerIndex;
        if (i == length()) {
            return null;
        }
        return get(i);
    }

    @Override // com.oplus.aiunit.vision.kob, com.oplus.aiunit.vision.g4h
    public T poll() {
        int i = this.consumerIndex;
        if (i == length()) {
            return null;
        }
        AtomicInteger atomicInteger = this.producerIndex;
        do {
            T t = get(i);
            if (t != null) {
                this.consumerIndex = i + 1;
                lazySet(i, null);
                return t;
            }
        } while (atomicInteger.get() != i);
        return null;
    }

    @Override // com.oplus.aiunit.vision.kob
    public int producerIndex() {
        return this.producerIndex.get();
    }

    public boolean offer(T t, T t2) {
        throw new UnsupportedOperationException();
    }
}
