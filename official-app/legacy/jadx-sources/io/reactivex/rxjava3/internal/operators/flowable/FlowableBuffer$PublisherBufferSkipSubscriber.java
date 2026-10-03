package io.reactivex.rxjava3.internal.operators.flowable;

import com.oplus.aiunit.vision.c3j;
import com.oplus.aiunit.vision.f4j;
import com.oplus.aiunit.vision.g4g;
import com.oplus.aiunit.vision.hu6;
import com.oplus.aiunit.vision.v2j;
import com.oplus.aiunit.vision.vr0;
import com.oplus.aiunit.vision.vu7;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import java.util.Collection;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes10.dex */
final class FlowableBuffer$PublisherBufferSkipSubscriber<T, C extends Collection<? super T>> extends AtomicInteger implements vu7<T>, c3j {
    private static final long serialVersionUID = -5616169793639412593L;
    C buffer;
    final f4j<C> bufferSupplier;
    boolean done;
    final v2j<? super C> downstream;
    int index;
    final int size;
    final int skip;
    c3j upstream;

    public FlowableBuffer$PublisherBufferSkipSubscriber(v2j<? super C> v2jVar, int i, int i2, f4j<C> f4jVar) {
        this.downstream = v2jVar;
        this.size = i;
        this.skip = i2;
        this.bufferSupplier = f4jVar;
    }

    @Override // com.oplus.aiunit.vision.c3j
    public void cancel() {
        this.upstream.cancel();
    }

    @Override // com.oplus.aiunit.vision.v2j
    public void onComplete() {
        if (this.done) {
            return;
        }
        this.done = true;
        C c2 = this.buffer;
        this.buffer = null;
        if (c2 != null) {
            this.downstream.onNext(c2);
        }
        this.downstream.onComplete();
    }

    @Override // com.oplus.aiunit.vision.v2j
    public void onError(Throwable th) {
        if (this.done) {
            g4g.u(th);
            return;
        }
        this.done = true;
        this.buffer = null;
        this.downstream.onError(th);
    }

    @Override // com.oplus.aiunit.vision.v2j
    public void onNext(T t) {
        if (this.done) {
            return;
        }
        C c2 = this.buffer;
        int i = this.index;
        int i2 = i + 1;
        if (i == 0) {
            try {
                C c3 = this.bufferSupplier.get();
                Objects.requireNonNull(c3, "The bufferSupplier returned a null buffer");
                c2 = c3;
                this.buffer = c2;
            } catch (Throwable th) {
                hu6.b(th);
                cancel();
                onError(th);
                return;
            }
        }
        if (c2 != null) {
            c2.add(t);
            if (c2.size() == this.size) {
                this.buffer = null;
                this.downstream.onNext(c2);
            }
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
        if (SubscriptionHelper.validate(j2)) {
            if (get() != 0 || !compareAndSet(0, 1)) {
                this.upstream.request(vr0.d(this.skip, j2));
                return;
            }
            this.upstream.request(vr0.c(vr0.d(j2, this.size), vr0.d(this.skip - this.size, j2 - 1)));
        }
    }
}
