package io.reactivex.internal.operators.flowable;

import com.oplus.aiunit.vision.abd;
import com.oplus.aiunit.vision.c3j;
import com.oplus.aiunit.vision.d7f;
import com.oplus.aiunit.vision.h4g;
import com.oplus.aiunit.vision.iu6;
import com.oplus.aiunit.vision.v2j;
import com.oplus.aiunit.vision.wr0;
import com.oplus.aiunit.vision.wu7;
import com.oplus.aiunit.vision.z12;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes10.dex */
final class FlowableBuffer$PublisherBufferOverlappingSubscriber<T, C extends Collection<? super T>> extends AtomicLong implements wu7<T>, c3j, z12 {
    private static final long serialVersionUID = -7370244972039324525L;
    final Callable<C> bufferSupplier;
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

    public FlowableBuffer$PublisherBufferOverlappingSubscriber(v2j<? super C> v2jVar, int i, int i2, Callable<C> callable) {
        this.downstream = v2jVar;
        this.size = i;
        this.skip = i2;
        this.bufferSupplier = callable;
    }

    @Override // com.oplus.aiunit.vision.c3j
    public void cancel() {
        this.cancelled = true;
        this.upstream.cancel();
    }

    @Override // com.oplus.aiunit.vision.z12
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
            wr0.e(this, j2);
        }
        d7f.c(this.downstream, this.buffers, this, this);
    }

    @Override // com.oplus.aiunit.vision.v2j
    public void onError(Throwable th) {
        if (this.done) {
            h4g.r(th);
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
                arrayDeque.offer((C) ((Collection) abd.d(this.bufferSupplier.call(), "The bufferSupplier returned a null buffer")));
            } catch (Throwable th) {
                iu6.b(th);
                cancel();
                onError(th);
                return;
            }
        }
        C cPeek = arrayDeque.peek();
        if (cPeek != null && cPeek.size() + 1 == this.size) {
            arrayDeque.poll();
            cPeek.add(t);
            this.produced++;
            this.downstream.onNext(cPeek);
        }
        Iterator<C> it = arrayDeque.iterator();
        while (it.hasNext()) {
            it.next().add(t);
        }
        if (i2 == this.skip) {
            i2 = 0;
        }
        this.index = i2;
    }

    @Override // com.oplus.aiunit.vision.wu7, com.oplus.aiunit.vision.v2j
    public void onSubscribe(c3j c3jVar) {
        if (SubscriptionHelper.validate(this.upstream, c3jVar)) {
            this.upstream = c3jVar;
            this.downstream.onSubscribe(this);
        }
    }

    @Override // com.oplus.aiunit.vision.c3j
    public void request(long j2) {
        if (!SubscriptionHelper.validate(j2) || d7f.e(j2, this.downstream, this.buffers, this, this)) {
            return;
        }
        if (this.once.get() || !this.once.compareAndSet(false, true)) {
            this.upstream.request(wr0.d(this.skip, j2));
        } else {
            this.upstream.request(wr0.c(this.size, wr0.d(this.skip, j2 - 1)));
        }
    }
}
