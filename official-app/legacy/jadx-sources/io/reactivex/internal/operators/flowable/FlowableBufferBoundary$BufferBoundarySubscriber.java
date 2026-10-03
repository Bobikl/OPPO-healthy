package io.reactivex.internal.operators.flowable;

import com.oplus.aiunit.vision.abd;
import com.oplus.aiunit.vision.c3j;
import com.oplus.aiunit.vision.cv5;
import com.oplus.aiunit.vision.h4g;
import com.oplus.aiunit.vision.iu6;
import com.oplus.aiunit.vision.j08;
import com.oplus.aiunit.vision.k3f;
import com.oplus.aiunit.vision.v2j;
import com.oplus.aiunit.vision.wr0;
import com.oplus.aiunit.vision.wu7;
import com.oplus.aiunit.vision.xt7;
import com.oplus.aiunit.vision.yki;
import com.oplus.aiunit.vision.ys3;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AtomicThrowable;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
final class FlowableBufferBoundary$BufferBoundarySubscriber<T, C extends Collection<? super T>, Open, Close> extends AtomicInteger implements wu7<T>, c3j {
    private static final long serialVersionUID = -8466418554264089604L;
    final j08<? super Open, ? extends k3f<? extends Close>> bufferClose;
    final k3f<? extends Open> bufferOpen;
    final Callable<C> bufferSupplier;
    volatile boolean cancelled;
    volatile boolean done;
    final v2j<? super C> downstream;
    long emitted;
    long index;
    final yki<C> queue = new yki<>(xt7.a());
    final ys3 subscribers = new ys3();
    final AtomicLong requested = new AtomicLong();
    final AtomicReference<c3j> upstream = new AtomicReference<>();
    Map<Long, C> buffers = new LinkedHashMap();
    final AtomicThrowable errors = new AtomicThrowable();

    public static final class BufferOpenSubscriber<Open> extends AtomicReference<c3j> implements wu7<Open>, cv5 {
        private static final long serialVersionUID = -8498650778633225126L;
        final FlowableBufferBoundary$BufferBoundarySubscriber<?, ?, Open, ?> parent;

        public BufferOpenSubscriber(FlowableBufferBoundary$BufferBoundarySubscriber<?, ?, Open, ?> flowableBufferBoundary$BufferBoundarySubscriber) {
            this.parent = flowableBufferBoundary$BufferBoundarySubscriber;
        }

        @Override // com.oplus.aiunit.vision.cv5
        public void dispose() {
            SubscriptionHelper.cancel(this);
        }

        @Override // com.oplus.aiunit.vision.cv5
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

        @Override // com.oplus.aiunit.vision.wu7, com.oplus.aiunit.vision.v2j
        public void onSubscribe(c3j c3jVar) {
            SubscriptionHelper.setOnce(this, c3jVar, Long.MAX_VALUE);
        }
    }

    public FlowableBufferBoundary$BufferBoundarySubscriber(v2j<? super C> v2jVar, k3f<? extends Open> k3fVar, j08<? super Open, ? extends k3f<? extends Close>> j08Var, Callable<C> callable) {
        this.downstream = v2jVar;
        this.bufferSupplier = callable;
        this.bufferOpen = k3fVar;
        this.bufferClose = j08Var;
    }

    public void boundaryError(cv5 cv5Var, Throwable th) {
        SubscriptionHelper.cancel(this.upstream);
        this.subscribers.b(cv5Var);
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
        if (this.subscribers.e() == 0) {
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
        yki<C> ykiVar = this.queue;
        int iAddAndGet = 1;
        do {
            long j3 = this.requested.get();
            while (j2 != j3) {
                if (this.cancelled) {
                    ykiVar.clear();
                    return;
                }
                boolean z = this.done;
                if (z && this.errors.get() != null) {
                    ykiVar.clear();
                    v2jVar.onError(this.errors.terminate());
                    return;
                }
                C cPoll = ykiVar.poll();
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
                    ykiVar.clear();
                    return;
                }
                if (this.done) {
                    if (this.errors.get() != null) {
                        ykiVar.clear();
                        v2jVar.onError(this.errors.terminate());
                        return;
                    } else if (ykiVar.isEmpty()) {
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
        if (!this.errors.addThrowable(th)) {
            h4g.r(th);
            return;
        }
        this.subscribers.dispose();
        synchronized (this) {
            this.buffers = null;
        }
        this.done = true;
        drain();
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

    @Override // com.oplus.aiunit.vision.wu7, com.oplus.aiunit.vision.v2j
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
            Collection collection = (Collection) abd.d(this.bufferSupplier.call(), "The bufferSupplier returned a null Collection");
            k3f k3fVar = (k3f) abd.d(this.bufferClose.apply(open), "The bufferClose returned a null Publisher");
            long j2 = this.index;
            this.index = 1 + j2;
            synchronized (this) {
                Map<Long, C> map = this.buffers;
                if (map == null) {
                    return;
                }
                map.put(Long.valueOf(j2), (C) collection);
                FlowableBufferBoundary$BufferCloseSubscriber flowableBufferBoundary$BufferCloseSubscriber = new FlowableBufferBoundary$BufferCloseSubscriber(this, j2);
                this.subscribers.a(flowableBufferBoundary$BufferCloseSubscriber);
                k3fVar.subscribe(flowableBufferBoundary$BufferCloseSubscriber);
            }
        } catch (Throwable th) {
            iu6.b(th);
            SubscriptionHelper.cancel(this.upstream);
            onError(th);
        }
    }

    public void openComplete(BufferOpenSubscriber<Open> bufferOpenSubscriber) {
        this.subscribers.b(bufferOpenSubscriber);
        if (this.subscribers.e() == 0) {
            SubscriptionHelper.cancel(this.upstream);
            this.done = true;
            drain();
        }
    }

    @Override // com.oplus.aiunit.vision.c3j
    public void request(long j2) {
        wr0.a(this.requested, j2);
        drain();
    }
}
