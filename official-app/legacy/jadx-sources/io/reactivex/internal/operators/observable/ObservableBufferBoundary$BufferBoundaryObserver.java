package io.reactivex.internal.operators.observable;

import com.oplus.aiunit.vision.abd;
import com.oplus.aiunit.vision.bed;
import com.oplus.aiunit.vision.cv5;
import com.oplus.aiunit.vision.h4g;
import com.oplus.aiunit.vision.iu6;
import com.oplus.aiunit.vision.j08;
import com.oplus.aiunit.vision.kbd;
import com.oplus.aiunit.vision.kdd;
import com.oplus.aiunit.vision.yki;
import com.oplus.aiunit.vision.ys3;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.util.AtomicThrowable;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
final class ObservableBufferBoundary$BufferBoundaryObserver<T, C extends Collection<? super T>, Open, Close> extends AtomicInteger implements bed<T>, cv5 {
    private static final long serialVersionUID = -8466418554264089604L;
    final j08<? super Open, ? extends kdd<? extends Close>> bufferClose;
    final kdd<? extends Open> bufferOpen;
    final Callable<C> bufferSupplier;
    volatile boolean cancelled;
    volatile boolean done;
    final bed<? super C> downstream;
    long index;
    final yki<C> queue = new yki<>(kbd.a());
    final ys3 observers = new ys3();
    final AtomicReference<cv5> upstream = new AtomicReference<>();
    Map<Long, C> buffers = new LinkedHashMap();
    final AtomicThrowable errors = new AtomicThrowable();

    public static final class BufferOpenObserver<Open> extends AtomicReference<cv5> implements bed<Open>, cv5 {
        private static final long serialVersionUID = -8498650778633225126L;
        final ObservableBufferBoundary$BufferBoundaryObserver<?, ?, Open, ?> parent;

        public BufferOpenObserver(ObservableBufferBoundary$BufferBoundaryObserver<?, ?, Open, ?> observableBufferBoundary$BufferBoundaryObserver) {
            this.parent = observableBufferBoundary$BufferBoundaryObserver;
        }

        @Override // com.oplus.aiunit.vision.cv5
        public void dispose() {
            DisposableHelper.dispose(this);
        }

        @Override // com.oplus.aiunit.vision.cv5
        public boolean isDisposed() {
            return get() == DisposableHelper.DISPOSED;
        }

        @Override // com.oplus.aiunit.vision.bed
        public void onComplete() {
            lazySet(DisposableHelper.DISPOSED);
            this.parent.openComplete(this);
        }

        @Override // com.oplus.aiunit.vision.bed
        public void onError(Throwable th) {
            lazySet(DisposableHelper.DISPOSED);
            this.parent.boundaryError(this, th);
        }

        @Override // com.oplus.aiunit.vision.bed
        public void onNext(Open open) {
            this.parent.open(open);
        }

        @Override // com.oplus.aiunit.vision.bed
        public void onSubscribe(cv5 cv5Var) {
            DisposableHelper.setOnce(this, cv5Var);
        }
    }

    public ObservableBufferBoundary$BufferBoundaryObserver(bed<? super C> bedVar, kdd<? extends Open> kddVar, j08<? super Open, ? extends kdd<? extends Close>> j08Var, Callable<C> callable) {
        this.downstream = bedVar;
        this.bufferSupplier = callable;
        this.bufferOpen = kddVar;
        this.bufferClose = j08Var;
    }

    public void boundaryError(cv5 cv5Var, Throwable th) {
        DisposableHelper.dispose(this.upstream);
        this.observers.b(cv5Var);
        onError(th);
    }

    public void close(ObservableBufferBoundary$BufferCloseObserver<T, C> observableBufferBoundary$BufferCloseObserver, long j2) {
        boolean z;
        this.observers.b(observableBufferBoundary$BufferCloseObserver);
        if (this.observers.e() == 0) {
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

    @Override // com.oplus.aiunit.vision.cv5
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
        bed<? super C> bedVar = this.downstream;
        yki<C> ykiVar = this.queue;
        int iAddAndGet = 1;
        while (!this.cancelled) {
            boolean z = this.done;
            if (z && this.errors.get() != null) {
                ykiVar.clear();
                bedVar.onError(this.errors.terminate());
                return;
            }
            C cPoll = ykiVar.poll();
            boolean z2 = cPoll == null;
            if (z && z2) {
                bedVar.onComplete();
                return;
            } else if (z2) {
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            } else {
                bedVar.onNext(cPoll);
            }
        }
        ykiVar.clear();
    }

    @Override // com.oplus.aiunit.vision.cv5
    public boolean isDisposed() {
        return DisposableHelper.isDisposed(this.upstream.get());
    }

    @Override // com.oplus.aiunit.vision.bed
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

    @Override // com.oplus.aiunit.vision.bed
    public void onError(Throwable th) {
        if (!this.errors.addThrowable(th)) {
            h4g.r(th);
            return;
        }
        this.observers.dispose();
        synchronized (this) {
            this.buffers = null;
        }
        this.done = true;
        drain();
    }

    @Override // com.oplus.aiunit.vision.bed
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

    @Override // com.oplus.aiunit.vision.bed
    public void onSubscribe(cv5 cv5Var) {
        if (DisposableHelper.setOnce(this.upstream, cv5Var)) {
            BufferOpenObserver bufferOpenObserver = new BufferOpenObserver(this);
            this.observers.a(bufferOpenObserver);
            this.bufferOpen.subscribe(bufferOpenObserver);
        }
    }

    public void open(Open open) {
        try {
            Collection collection = (Collection) abd.d(this.bufferSupplier.call(), "The bufferSupplier returned a null Collection");
            kdd kddVar = (kdd) abd.d(this.bufferClose.apply(open), "The bufferClose returned a null ObservableSource");
            long j2 = this.index;
            this.index = 1 + j2;
            synchronized (this) {
                Map<Long, C> map = this.buffers;
                if (map == null) {
                    return;
                }
                map.put(Long.valueOf(j2), (C) collection);
                ObservableBufferBoundary$BufferCloseObserver observableBufferBoundary$BufferCloseObserver = new ObservableBufferBoundary$BufferCloseObserver(this, j2);
                this.observers.a(observableBufferBoundary$BufferCloseObserver);
                kddVar.subscribe(observableBufferBoundary$BufferCloseObserver);
            }
        } catch (Throwable th) {
            iu6.b(th);
            DisposableHelper.dispose(this.upstream);
            onError(th);
        }
    }

    public void openComplete(BufferOpenObserver<Open> bufferOpenObserver) {
        this.observers.b(bufferOpenObserver);
        if (this.observers.e() == 0) {
            DisposableHelper.dispose(this.upstream);
            this.done = true;
            drain();
        }
    }
}
