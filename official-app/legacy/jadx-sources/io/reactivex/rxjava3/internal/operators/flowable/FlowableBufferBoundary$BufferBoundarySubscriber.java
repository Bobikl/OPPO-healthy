package io.reactivex.rxjava3.internal.operators.flowable;

import com.oplus.aiunit.vision.c3j;
import com.oplus.aiunit.vision.d08;
import com.oplus.aiunit.vision.f4j;
import com.oplus.aiunit.vision.hu6;
import com.oplus.aiunit.vision.k3f;
import com.oplus.aiunit.vision.v2j;
import com.oplus.aiunit.vision.vr0;
import com.oplus.aiunit.vision.vu7;
import com.oplus.aiunit.vision.wt7;
import com.oplus.aiunit.vision.xki;
import com.oplus.aiunit.vision.xs3;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.internal.util.AtomicThrowable;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
final class FlowableBufferBoundary$BufferBoundarySubscriber<T, C extends Collection<? super T>, Open, Close> extends AtomicInteger implements vu7<T>, c3j {
    private static final long serialVersionUID = -8466418554264089604L;
    final d08<? super Open, ? extends k3f<? extends Close>> bufferClose;
    final k3f<? extends Open> bufferOpen;
    final f4j<C> bufferSupplier;
    volatile boolean cancelled;
    volatile boolean done;
    final v2j<? super C> downstream;
    long emitted;
    long index;
    final xki<C> queue = new xki<>(wt7.a());
    final xs3 subscribers = new xs3();
    final AtomicLong requested = new AtomicLong();
    final AtomicReference<c3j> upstream = new AtomicReference<>();
    Map<Long, C> buffers = new LinkedHashMap();
    final AtomicThrowable errors = new AtomicThrowable();

    public static final class BufferOpenSubscriber<Open> extends AtomicReference<c3j> implements vu7<Open>, io.reactivex.rxjava3.disposables.a {
        private static final long serialVersionUID = -8498650778633225126L;
        final FlowableBufferBoundary$BufferBoundarySubscriber<?, ?, Open, ?> parent;

        public BufferOpenSubscriber(FlowableBufferBoundary$BufferBoundarySubscriber<?, ?, Open, ?> flowableBufferBoundary$BufferBoundarySubscriber) {
            this.parent = flowableBufferBoundary$BufferBoundarySubscriber;
        }

        @Override // io.reactivex.rxjava3.disposables.a
        public void dispose() {
            SubscriptionHelper.cancel(this);
        }

        @Override // io.reactivex.rxjava3.disposables.a
        public boolean isDisposed() {
            return get() == SubscriptionHelper.CANCELLED;
        }

        @Override // com.oplus.aiunit.vision.v2j
        public void onComplete() {
            lazySet(SubscriptionHelper.CANCELLED);
            this.parent.openComplete(this);
        }

        @Override // com.oplus.aiunit.vision.v2j
        public void onError(Throwable th) {
            lazySet(SubscriptionHelper.CANCELLED);
            this.parent.boundaryError(this, th);
        }

        @Override // com.oplus.aiunit.vision.v2j
        public void onNext(Open open) {
            this.parent.open(open);
        }

        @Override // com.oplus.aiunit.vision.vu7, com.oplus.aiunit.vision.v2j
        public void onSubscribe(c3j c3jVar) {
            SubscriptionHelper.setOnce(this, c3jVar, Long.MAX_VALUE);
        }
    }

    public FlowableBufferBoundary$BufferBoundarySubscriber(v2j<? super C> v2jVar, k3f<? extends Open> k3fVar, d08<? super Open, ? extends k3f<? extends Close>> d08Var, f4j<C> f4jVar) {
        this.downstream = v2jVar;
        this.bufferSupplier = f4jVar;
        this.bufferOpen = k3fVar;
        this.bufferClose = d08Var;
    }

    public void boundaryError(io.reactivex.rxjava3.disposables.a aVar, Throwable th) {
        SubscriptionHelper.cancel(this.upstream);
        this.subscribers.b(aVar);
        onError(th);
    }

    @Override // com.oplus.aiunit.vision.c3j
    public void cancel() {
        if (SubscriptionHelper.cancel(this.upstream)) {
            this.cancelled = true;
            this.subscribers.dispose();
            synchronized (this) {
                this.buffers = null;
            }
            if (getAndIncrement() != 0) {
                this.queue.clear();
            }
        }
    }

    public void close(FlowableBufferBoundary$BufferCloseSubscriber<T, C> flowableBufferBoundary$BufferCloseSubscriber, long j2) {
        boolean z;
        this.subscribers.b(flowableBufferBoundary$BufferCloseSubscriber);
        if (this.subscribers.h() == 0) {
            SubscriptionHelper.cancel(this.upstream);
            z = true;
        } else {
            z = false;
        }
        synchronized (this) {
            Map<Long, C> map = this.buffers;
            if (map == null) {
                return;
            }
            this.queue.offer(map.remove(Long.valueOf(j2)));
            if (z) {
                this.done = true;
            }
            drain();
        }
    }

    public void drain() {
        if (getAndIncrement() != 0) {
            return;
        }
        long j2 = this.emitted;
        v2j<? super C> v2jVar = this.downstream;
        xki<C> xkiVar = this.queue;
        int iAddAndGet = 1;
        do {
            long j3 = this.requested.get();
            while (j2 != j3) {
                if (this.cancelled) {
                    xkiVar.clear();
                    return;
                }
                boolean z = this.done;
                if (z && this.errors.get() != null) {
                    xkiVar.clear();
                    this.errors.tryTerminateConsumer(v2jVar);
                    return;
                }
                C cPoll = xkiVar.poll();
                boolean z2 = cPoll == null;
                if (z && z2) {
                    v2jVar.onComplete();
                    return;
                } else {
                    if (z2) {
                        break;
                    }
                    v2jVar.onNext(cPoll);
                    j2++;
                }
            }
            if (j2 == j3) {
                if (this.cancelled) {
                    xkiVar.clear();
                    return;
                }
                if (this.done) {
                    if (this.errors.get() != null) {
                        xkiVar.clear();
                        this.errors.tryTerminateConsumer(v2jVar);
                        return;
                    } else if (xkiVar.isEmpty()) {
                        v2jVar.onComplete();
                        return;
                    }
                }
            }
            this.emitted = j2;
            iAddAndGet = addAndGet(-iAddAndGet);
        } while (iAddAndGet != 0);
    }

    @Override // com.oplus.aiunit.vision.v2j
    public void onComplete() {
        this.subscribers.dispose();
        synchronized (this) {
            Map<Long, C> map = this.buffers;
            if (map == null) {
                return;
            }
            Iterator<C> it = map.values().iterator();
            while (it.hasNext()) {
                this.queue.offer(it.next());
            }
            this.buffers = null;
            this.done = true;
            drain();
        }
    }

    @Override // com.oplus.aiunit.vision.v2j
    public void onError(Throwable th) {
        if (this.errors.tryAddThrowableOrReport(th)) {
            this.subscribers.dispose();
            synchronized (this) {
                this.buffers = null;
            }
            this.done = true;
            drain();
        }
    }

    @Override // com.oplus.aiunit.vision.v2j
    public void onNext(T t) {
        synchronized (this) {
            Map<Long, C> map = this.buffers;
            if (map == null) {
                return;
            }
            Iterator<C> it = map.values().iterator();
            while (it.hasNext()) {
                it.next().add(t);
            }
        }
    }

    @Override // com.oplus.aiunit.vision.vu7, com.oplus.aiunit.vision.v2j
    public void onSubscribe(c3j c3jVar) {
        if (SubscriptionHelper.setOnce(this.upstream, c3jVar)) {
            BufferOpenSubscriber bufferOpenSubscriber = new BufferOpenSubscriber(this);
            this.subscribers.a(bufferOpenSubscriber);
            this.bufferOpen.subscribe(bufferOpenSubscriber);
            c3jVar.request(Long.MAX_VALUE);
        }
    }

    public void open(Open open) {
        try {
            C c2 = this.bufferSupplier.get();
            Objects.requireNonNull(c2, "The bufferSupplier returned a null Collection");
            C c3 = c2;
            k3f<? extends Close> k3fVarApply = this.bufferClose.apply(open);
            Objects.requireNonNull(k3fVarApply, "The bufferClose returned a null Publisher");
            k3f<? extends Close> k3fVar = k3fVarApply;
            long j2 = this.index;
            this.index = 1 + j2;
            synchronized (this) {
                Map<Long, C> map = this.buffers;
                if (map == null) {
                    return;
                }
                map.put(Long.valueOf(j2), c3);
                FlowableBufferBoundary$BufferCloseSubscriber flowableBufferBoundary$BufferCloseSubscriber = new FlowableBufferBoundary$BufferCloseSubscriber(this, j2);
                this.subscribers.a(flowableBufferBoundary$BufferCloseSubscriber);
                k3fVar.subscribe(flowableBufferBoundary$BufferCloseSubscriber);
            }
        } catch (Throwable th) {
            hu6.b(th);
            SubscriptionHelper.cancel(this.upstream);
            onError(th);
        }
    }

    public void openComplete(BufferOpenSubscriber<Open> bufferOpenSubscriber) {
        this.subscribers.b(bufferOpenSubscriber);
        if (this.subscribers.h() == 0) {
            SubscriptionHelper.cancel(this.upstream);
            this.done = true;
            drain();
        }
    }

    @Override // com.oplus.aiunit.vision.c3j
    public void request(long j2) {
        vr0.a(this.requested, j2);
        drain();
    }
}
