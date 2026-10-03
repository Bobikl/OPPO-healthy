package io.reactivex.rxjava3.internal.jdk8;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes10.dex */
final class ParallelCollector$SlotPair<T> extends AtomicInteger {
    private static final long serialVersionUID = 473971317683868662L;
    T first;
    final AtomicInteger releaseIndex = new AtomicInteger();
    T second;

    public boolean releaseSlot() {
        return this.releaseIndex.incrementAndGet() == 2;
    }

    public int tryAcquireSlot() {
        int i;
        do {
            i = get();
            if (i >= 2) {
                return -1;
            }
        } while (!compareAndSet(i, i + 1));
        return i;
    }
}
