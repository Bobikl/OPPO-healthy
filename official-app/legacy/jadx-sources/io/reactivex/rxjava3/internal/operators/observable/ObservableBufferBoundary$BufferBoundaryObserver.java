package io.reactivex.rxjava3.internal.operators.observable;

import com.oplus.aiunit.vision.aed;
import com.oplus.aiunit.vision.d08;
import com.oplus.aiunit.vision.f4j;
import com.oplus.aiunit.vision.hu6;
import com.oplus.aiunit.vision.jdd;
import com.oplus.aiunit.vision.lbd;
import com.oplus.aiunit.vision.xki;
import com.oplus.aiunit.vision.xs3;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.util.AtomicThrowable;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
final class ObservableBufferBoundary$BufferBoundaryObserver<T, C extends Collection<? super T>, Open, Close> extends AtomicInteger implements aed<T>, io.reactivex.rxjava3.disposables.a {
    private static final long serialVersionUID = -8466418554264089604L;
    final d08<? super Open, ? extends jdd<? extends Close>> bufferClose;
    final jdd<? extends Open> bufferOpen;
    final f4j<C> bufferSupplier;
    volatile boolean cancelled;
    volatile boolean done;
    final aed<? super C> downstream;
    long index;
    final xki<C> queue = new xki<>(lbd.j());
    final xs3 observers = new xs3();
    final AtomicReference<io.reactivex.rxjava3.disposables.a> upstream = new AtomicReference<>();
    Map<Long, C> buffers = new LinkedHashMap();
    final AtomicThrowable errors = new AtomicThrowable();

    public static final class BufferOpenObserver<Open> extends AtomicReference<io.reactivex.rxjava3.disposables.a> implements aed<Open>, io.reactivex.rxjava3.disposables.a {
        private static final long serialVersionUID = -8498650778633225126L;
        final ObservableBufferBoundary$BufferBoundaryObserver<?, ?, Open, ?> parent;

        public BufferOpenObserver(ObservableBufferBoundary$BufferBoundaryObserver<?, ?, Open, ?> observableBufferBoundary$BufferBoundaryObserver) {
            this.parent = observableBufferBoundary$BufferBoundaryObserver;
        }

        @Override // io.reactivex.rxjava3.disposables.a
        public void dispose() {
            DisposableHelper.dispose(this);
        }

        @Override // io.reactivex.rxjava3.disposables.a
        public boolean isDisposed() {
            return get() == DisposableHelper.DISPOSED;
        }

        @Override // com.oplus.aiunit.vision.aed
        public void onComplete() {
            lazySet(DisposableHelper.DISPOSED);
            this.parent.openComplete(this);
        }

        @Override // com.oplus.aiunit.vision.aed
        public void onError(Throwable th) {
            lazySet(DisposableHelper.DISPOSED);
            this.parent.boundaryError(this, th);
        }

        @Override // com.oplus.aiunit.vision.aed
        public void onNext(Open open) {
            this.parent.open(open);
        }

        @Override // com.oplus.aiunit.vision.aed
        public void onSubscribe(io.reactivex.rxjava3.disposables.a aVar) {
            DisposableHelper.setOnce(this, aVar);
        }
    }

    public ObservableBufferBoundary$BufferBoundaryObserver(aed<? super C> aedVar, jdd<? extends Open> jddVar, d08<? super Open, ? extends jdd<? extends Close>> d08Var, f4j<C> f4jVar) {
        this.downstream = aedVar;
        this.bufferSupplier = f4jVar;
        this.bufferOpen = jddVar;
        this.bufferClose = d08Var;
    }

    public void boundaryError(io.reactivex.rxjava3.disposables.a aVar, Throwable th) {
        DisposableHelper.dispose(this.upstream);
        this.observers.b(aVar);
        onError(th);
    }

    public void close(ObservableBufferBoundary$BufferCloseObserver<T, C> observableBufferBoundary$BufferCloseObserver, long j2) {
        boolean z;
        this.observers.b(observableBufferBoundary$BufferCloseObserver);
        if (this.observers.h() == 0) {
            DisposableHelper.dispose(this.upstream);
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

    @Override // io.reactivex.rxjava3.disposables.a
    public void dispose() {
        if (DisposableHelper.dispose(this.upstream)) {
            this.cancelled = true;
            this.observers.dispose();
            synchronized (this) {
                this.buffers = null;
            }
            if (getAndIncrement() != 0) {
                this.queue.clear();
            }
        }
    }

    public void drain() {
        if (getAndIncrement() != 0) {
            return;
        }
        aed<? super C> aedVar = this.downstream;
        xki<C> xkiVar = this.queue;
        int iAddAndGet = 1;
        while (!this.cancelled) {
            boolean z = this.done;
            if (z && this.errors.get() != null) {
                xkiVar.clear();
                this.errors.tryTerminateConsumer(aedVar);
                return;
            }
            C cPoll = xkiVar.poll();
            boolean z2 = cPoll == null;
            if (z && z2) {
                aedVar.onComplete();
                return;
            } else if (z2) {
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            } else {
                aedVar.onNext(cPoll);
            }
        }
        xkiVar.clear();
    }

    @Override // io.reactivex.rxjava3.disposables.a
    public boolean isDisposed() {
        return DisposableHelper.isDisposed(this.upstream.get());
    }

    @Override // com.oplus.aiunit.vision.aed
    public void onComplete() {
        this.observers.dispose();
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

    @Override // com.oplus.aiunit.vision.aed
    public void onError(Throwable th) {
        if (this.errors.tryAddThrowableOrReport(th)) {
            this.observers.dispose();
            synchronized (this) {
                this.buffers = null;
            }
            this.done = true;
            drain();
        }
    }

    @Override // com.oplus.aiunit.vision.aed
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

    @Override // com.oplus.aiunit.vision.aed
    public void onSubscribe(io.reactivex.rxjava3.disposables.a aVar) {
        if (DisposableHelper.setOnce(this.upstream, aVar)) {
            BufferOpenObserver bufferOpenObserver = new BufferOpenObserver(this);
            this.observers.a(bufferOpenObserver);
            this.bufferOpen.subscribe(bufferOpenObserver);
        }
    }

    public void open(Open open) {
        try {
            C c2 = this.bufferSupplier.get();
            Objects.requireNonNull(c2, "The bufferSupplier returned a null Collection");
            C c3 = c2;
            jdd<? extends Close> jddVarApply = this.bufferClose.apply(open);
            Objects.requireNonNull(jddVarApply, "The bufferClose returned a null ObservableSource");
            jdd<? extends Close> jddVar = jddVarApply;
            long j2 = this.index;
            this.index = 1 + j2;
            synchronized (this) {
                Map<Long, C> map = this.buffers;
                if (map == null) {
                    return;
                }
                map.put(Long.valueOf(j2), c3);
                ObservableBufferBoundary$BufferCloseObserver observableBufferBoundary$BufferCloseObserver = new ObservableBufferBoundary$BufferCloseObserver(this, j2);
                this.observers.a(observableBufferBoundary$BufferCloseObserver);
                jddVar.subscribe(observableBufferBoundary$BufferCloseObserver);
            }
        } catch (Throwable th) {
            hu6.b(th);
            DisposableHelper.dispose(this.upstream);
            onError(th);
        }
    }

    public void openComplete(BufferOpenObserver<Open> bufferOpenObserver) {
        this.observers.b(bufferOpenObserver);
        if (this.observers.h() == 0) {
            DisposableHelper.dispose(this.upstream);
            this.done = true;
            drain();
        }
    }
}
