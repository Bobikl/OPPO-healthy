package io.reactivex.rxjava3.internal.operators.flowable;

import com.oplus.aiunit.vision.c3j;
import com.oplus.aiunit.vision.c7f;
import com.oplus.aiunit.vision.f4j;
import com.oplus.aiunit.vision.g4g;
import com.oplus.aiunit.vision.hu6;
import com.oplus.aiunit.vision.v2j;
import com.oplus.aiunit.vision.vr0;
import com.oplus.aiunit.vision.vu7;
import com.oplus.aiunit.vision.y12;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes10.dex */
final class FlowableBuffer$PublisherBufferOverlappingSubscriber<T, C extends Collection<? super T>> extends AtomicLong implements vu7<T>, c3j, y12 {
    private static final long serialVersionUID = -7370244972039324525L;
    final f4j<C> bufferSupplier;
    volatile boolean cancelled;
    boolean done;
    final v2j<? super C> downstream;
    int index;
    long produced;
    final int size;
    final int skip;
    c3j upstream;
    final AtomicBoolean once = new AtomicBoolean();
    final ArrayDeque<C> buffers = new ArrayDeque<>();

    public FlowableBuffer$PublisherBufferOverlappingSubscriber(v2j<? super C> v2jVar, int i, int i2, f4j<C> f4jVar) {
        this.downstream = v2jVar;
        this.size = i;
        this.skip = i2;
        this.bufferSupplier = f4jVar;
    }

    @Override // com.oplus.aiunit.vision.c3j
    public void cancel() {
        this.cancelled = true;
        this.upstream.cancel();
    }

    @Override // com.oplus.aiunit.vision.y12
    public boolean getAsBoolean() {
        return this.cancelled;
    }

    @Override // com.oplus.aiunit.vision.v2j
    public void onComplete() {
        if (this.done) {
            return;
        }
        this.done = true;
        long j2 = this.produced;
        if (j2 != 0) {
            vr0.e(this, j2);
        }
        c7f.c(this.downstream, this.buffers, this, this);
    }

    @Override // com.oplus.aiunit.vision.v2j
    public void onError(Throwable th) {
        if (this.done) {
            g4g.u(th);
            return;
        }
        this.done = true;
        this.buffers.clear();
        this.downstream.onError(th);
    }

    @Override // com.oplus.aiunit.vision.v2j
    public void onNext(T t) {
        if (this.done) {
            return;
        }
        ArrayDeque<C> arrayDeque = this.buffers;
        int i = this.index;
        int i2 = i + 1;
        if (i == 0) {
            try {
                C c2 = this.bufferSupplier.get();
                Objects.requireNonNull(c2, "The bufferSupplier returned a null buffer");
                arrayDeque.offer(c2);
            } catch (Throwable th) {
                hu6.b(th);
                cancel();
                onError(th);
                return;
            }
        }
        Collection collection = (Collection) arrayDeque.peek();
        if (collection.size() + 1 == this.size) {
            arrayDeque.poll();
            collection.add(t);
            this.produced++;
            this.downstream.onNext(collection);
        }
        Iterator it = arrayDeque.iterator();
        while (it.hasNext()) {
            ((Collection) it.next()).add(t);
        }
        if (i2 == this.skip) {
            i2 = 0;
        }
        this.index = i2;
    }

    @Override // com.oplus.aiunit.vision.vu7, com.oplus.aiunit.vision.v2j
    public void onSubscribe(c3j c3jVar) {
        if (SubscriptionHelper.validate(this.upstream, c3jVar)) {
            this.upstream = c3jVar;
            this.downstream.onSubscribe(this);
        }
    }

    @Override // com.oplus.aiunit.vision.c3j
    public void request(long j2) {
        if (!SubscriptionHelper.validate(j2) || c7f.e(j2, this.downstream, this.buffers, this, this)) {
            return;
        }
        if (this.once.get() || !this.once.compareAndSet(false, true)) {
            this.upstream.request(vr0.d(this.skip, j2));
        } else {
            this.upstream.request(vr0.c(this.size, vr0.d(this.skip, j2 - 1)));
        }
    }
}
