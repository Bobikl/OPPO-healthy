package io.reactivex.internal.queue;

import com.oplus.aiunit.vision.c4h;
import com.oplus.aiunit.vision.koe;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: classes10.dex */
public final class SpscArrayQueue<E> extends AtomicReferenceArray<E> implements c4h<E> {
    private static final Integer MAX_LOOK_AHEAD_STEP = Integer.getInteger("jctools.spsc.max.lookahead.step", 4096);
    private static final long serialVersionUID = -1296597691183856449L;
    final AtomicLong consumerIndex;
    final int lookAheadStep;
    final int mask;
    final AtomicLong producerIndex;
    long producerLookAhead;

    public SpscArrayQueue(int i) {
        super(koe.a(i));
        this.mask = length() - 1;
        this.producerIndex = new AtomicLong();
        this.consumerIndex = new AtomicLong();
        this.lookAheadStep = Math.min(i / 4, MAX_LOOK_AHEAD_STEP.intValue());
    }

    public int calcElementOffset(long j2, int i) {
        return ((int) j2) & i;
    }

    @Override // com.oplus.aiunit.vision.g4h
    public void clear() {
        while (true) {
            if (poll() == null && isEmpty()) {
                return;
            }
        }
    }

    @Override // com.oplus.aiunit.vision.g4h
    public boolean isEmpty() {
        return this.producerIndex.get() == this.consumerIndex.get();
    }

    public E lvElement(int i) {
        return get(i);
    }

    @Override // com.oplus.aiunit.vision.g4h
    public boolean offer(E e2) {
        if (e2 == null) {
            throw new NullPointerException("Null is not a valid element");
        }
        int i = this.mask;
        long j2 = this.producerIndex.get();
        int iCalcElementOffset = calcElementOffset(j2, i);
        if (j2 >= this.producerLookAhead) {
            long j3 = ((long) this.lookAheadStep) + j2;
            if (lvElement(calcElementOffset(j3, i)) == null) {
                this.producerLookAhead = j3;
            } else if (lvElement(iCalcElementOffset) != null) {
                return false;
            }
        }
        soElement(iCalcElementOffset, e2);
        soProducerIndex(j2 + 1);
        return true;
    }

    @Override // com.oplus.aiunit.vision.c4h, com.oplus.aiunit.vision.g4h
    public E poll() {
        long j2 = this.consumerIndex.get();
        int iCalcElementOffset = calcElementOffset(j2);
        E eLvElement = lvElement(iCalcElementOffset);
        if (eLvElement == null) {
            return null;
        }
        soConsumerIndex(j2 + 1);
        soElement(iCalcElementOffset, null);
        return eLvElement;
    }

    public void soConsumerIndex(long j2) {
        this.consumerIndex.lazySet(j2);
    }

    public void soElement(int i, E e2) {
        lazySet(i, e2);
    }

    public void soProducerIndex(long j2) {
        this.producerIndex.lazySet(j2);
    }

    public int calcElementOffset(long j2) {
        return this.mask & ((int) j2);
    }

    public boolean offer(E e2, E e3) {
        return offer(e2) && offer(e3);
    }
}
