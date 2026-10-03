package io.reactivex.rxjava3.internal.operators.observable;

import com.oplus.aiunit.vision.a7f;
import com.oplus.aiunit.vision.aed;
import com.oplus.aiunit.vision.cfg;
import com.oplus.aiunit.vision.d08;
import com.oplus.aiunit.vision.f4h;
import com.oplus.aiunit.vision.g4g;
import com.oplus.aiunit.vision.hu6;
import com.oplus.aiunit.vision.jdd;
import com.oplus.aiunit.vision.xki;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
final class ObservableConcatMapScheduler$ConcatMapObserver<T, U> extends AtomicInteger implements aed<T>, io.reactivex.rxjava3.disposables.a, Runnable {
    private static final long serialVersionUID = 8828587559905699186L;
    volatile boolean active;
    final int bufferSize;
    volatile boolean disposed;
    volatile boolean done;
    final aed<? super U> downstream;
    int fusionMode;
    final InnerObserver<U> inner;
    final d08<? super T, ? extends jdd<? extends U>> mapper;
    f4h<T> queue;
    io.reactivex.rxjava3.disposables.a upstream;
    final cfg.c worker;

    public static final class InnerObserver<U> extends AtomicReference<io.reactivex.rxjava3.disposables.a> implements aed<U> {
        private static final long serialVersionUID = -7449079488798789337L;
        final aed<? super U> downstream;
        final ObservableConcatMapScheduler$ConcatMapObserver<?, ?> parent;

        public InnerObserver(aed<? super U> aedVar, ObservableConcatMapScheduler$ConcatMapObserver<?, ?> observableConcatMapScheduler$ConcatMapObserver) {
            this.downstream = aedVar;
            this.parent = observableConcatMapScheduler$ConcatMapObserver;
        }

        public void dispose() {
            DisposableHelper.dispose(this);
        }

        @Override // com.oplus.aiunit.vision.aed
        public void onComplete() {
            this.parent.innerComplete();
        }

        @Override // com.oplus.aiunit.vision.aed
        public void onError(Throwable th) {
            this.parent.dispose();
            this.downstream.onError(th);
        }

        @Override // com.oplus.aiunit.vision.aed
        public void onNext(U u) {
            this.downstream.onNext(u);
        }

        @Override // com.oplus.aiunit.vision.aed
        public void onSubscribe(io.reactivex.rxjava3.disposables.a aVar) {
            DisposableHelper.replace(this, aVar);
        }
    }

    public ObservableConcatMapScheduler$ConcatMapObserver(aed<? super U> aedVar, d08<? super T, ? extends jdd<? extends U>> d08Var, int i, cfg.c cVar) {
        this.downstream = aedVar;
        this.mapper = d08Var;
        this.bufferSize = i;
        this.inner = new InnerObserver<>(aedVar, this);
        this.worker = cVar;
    }

    @Override // io.reactivex.rxjava3.disposables.a
    public void dispose() {
        this.disposed = true;
        this.inner.dispose();
        this.upstream.dispose();
        this.worker.dispose();
        if (getAndIncrement() == 0) {
            this.queue.clear();
        }
    }

    public void drain() {
        if (getAndIncrement() != 0) {
            return;
        }
        this.worker.b(this);
    }

    public void innerComplete() {
        this.active = false;
        drain();
    }

    @Override // io.reactivex.rxjava3.disposables.a
    public boolean isDisposed() {
        return this.disposed;
    }

    @Override // com.oplus.aiunit.vision.aed
    public void onComplete() {
        if (this.done) {
            return;
        }
        this.done = true;
        drain();
    }

    @Override // com.oplus.aiunit.vision.aed
    public void onError(Throwable th) {
        if (this.done) {
            g4g.u(th);
            return;
        }
        this.done = true;
        dispose();
        this.downstream.onError(th);
    }

    @Override // com.oplus.aiunit.vision.aed
    public void onNext(T t) {
        if (this.done) {
            return;
        }
        if (this.fusionMode == 0) {
            this.queue.offer(t);
        }
        drain();
    }

    @Override // com.oplus.aiunit.vision.aed
    public void onSubscribe(io.reactivex.rxjava3.disposables.a aVar) {
        if (DisposableHelper.validate(this.upstream, aVar)) {
            this.upstream = aVar;
            if (aVar instanceof a7f) {
                a7f a7fVar = (a7f) aVar;
                int iRequestFusion = a7fVar.requestFusion(3);
                if (iRequestFusion == 1) {
                    this.fusionMode = iRequestFusion;
                    this.queue = a7fVar;
                    this.done = true;
                    this.downstream.onSubscribe(this);
                    drain();
                    return;
                }
                if (iRequestFusion == 2) {
                    this.fusionMode = iRequestFusion;
                    this.queue = a7fVar;
                    this.downstream.onSubscribe(this);
                    return;
                }
            }
            this.queue = new xki(this.bufferSize);
            this.downstream.onSubscribe(this);
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        while (!this.disposed) {
            if (!this.active) {
                boolean z = this.done;
                try {
                    T tPoll = this.queue.poll();
                    boolean z2 = tPoll == null;
                    if (z && z2) {
                        this.disposed = true;
                        this.downstream.onComplete();
                        this.worker.dispose();
                        return;
                    } else if (!z2) {
                        try {
                            jdd<? extends U> jddVarApply = this.mapper.apply(tPoll);
                            Objects.requireNonNull(jddVarApply, "The mapper returned a null ObservableSource");
                            jdd<? extends U> jddVar = jddVarApply;
                            this.active = true;
                            jddVar.subscribe(this.inner);
                        } catch (Throwable th) {
                            hu6.b(th);
                            dispose();
                            this.queue.clear();
                            this.downstream.onError(th);
                            this.worker.dispose();
                            return;
                        }
                    }
                } catch (Throwable th2) {
                    hu6.b(th2);
                    dispose();
                    this.queue.clear();
                    this.downstream.onError(th2);
                    this.worker.dispose();
                    return;
                }
            }
            if (decrementAndGet() == 0) {
                return;
            }
        }
        this.queue.clear();
    }
}
