package io.reactivex.rxjava3.internal.operators.observable;

import O0O.O00;
import com.oplus.aiunit.vision.a7f;
import com.oplus.aiunit.vision.aed;
import com.oplus.aiunit.vision.cfg;
import com.oplus.aiunit.vision.d08;
import com.oplus.aiunit.vision.f4h;
import com.oplus.aiunit.vision.f4j;
import com.oplus.aiunit.vision.hu6;
import com.oplus.aiunit.vision.jdd;
import com.oplus.aiunit.vision.xki;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.util.AtomicThrowable;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
final class ObservableConcatMapScheduler$ConcatMapDelayErrorObserver<T, R> extends AtomicInteger implements aed<T>, io.reactivex.rxjava3.disposables.a, Runnable {
    private static final long serialVersionUID = -6951100001833242599L;
    volatile boolean active;
    final int bufferSize;
    volatile boolean cancelled;
    volatile boolean done;
    final aed<? super R> downstream;
    final AtomicThrowable errors = new AtomicThrowable();
    final d08<? super T, ? extends jdd<? extends R>> mapper;
    final DelayErrorInnerObserver<R> observer;
    f4h<T> queue;
    int sourceMode;
    final boolean tillTheEnd;
    io.reactivex.rxjava3.disposables.a upstream;
    final cfg.c worker;

    public static final class DelayErrorInnerObserver<R> extends AtomicReference<io.reactivex.rxjava3.disposables.a> implements aed<R> {
        private static final long serialVersionUID = 2620149119579502636L;
        final aed<? super R> downstream;
        final ObservableConcatMapScheduler$ConcatMapDelayErrorObserver<?, R> parent;

        public DelayErrorInnerObserver(aed<? super R> aedVar, ObservableConcatMapScheduler$ConcatMapDelayErrorObserver<?, R> observableConcatMapScheduler$ConcatMapDelayErrorObserver) {
            this.downstream = aedVar;
            this.parent = observableConcatMapScheduler$ConcatMapDelayErrorObserver;
        }

        public void dispose() {
            DisposableHelper.dispose(this);
        }

        @Override // com.oplus.aiunit.vision.aed
        public void onComplete() {
            ObservableConcatMapScheduler$ConcatMapDelayErrorObserver<?, R> observableConcatMapScheduler$ConcatMapDelayErrorObserver = this.parent;
            observableConcatMapScheduler$ConcatMapDelayErrorObserver.active = false;
            observableConcatMapScheduler$ConcatMapDelayErrorObserver.drain();
        }

        @Override // com.oplus.aiunit.vision.aed
        public void onError(Throwable th) {
            ObservableConcatMapScheduler$ConcatMapDelayErrorObserver<?, R> observableConcatMapScheduler$ConcatMapDelayErrorObserver = this.parent;
            if (observableConcatMapScheduler$ConcatMapDelayErrorObserver.errors.tryAddThrowableOrReport(th)) {
                if (!observableConcatMapScheduler$ConcatMapDelayErrorObserver.tillTheEnd) {
                    observableConcatMapScheduler$ConcatMapDelayErrorObserver.upstream.dispose();
                }
                observableConcatMapScheduler$ConcatMapDelayErrorObserver.active = false;
                observableConcatMapScheduler$ConcatMapDelayErrorObserver.drain();
            }
        }

        @Override // com.oplus.aiunit.vision.aed
        public void onNext(R r) {
            this.downstream.onNext(r);
        }

        @Override // com.oplus.aiunit.vision.aed
        public void onSubscribe(io.reactivex.rxjava3.disposables.a aVar) {
            DisposableHelper.replace(this, aVar);
        }
    }

    public ObservableConcatMapScheduler$ConcatMapDelayErrorObserver(aed<? super R> aedVar, d08<? super T, ? extends jdd<? extends R>> d08Var, int i, boolean z, cfg.c cVar) {
        this.downstream = aedVar;
        this.mapper = d08Var;
        this.bufferSize = i;
        this.tillTheEnd = z;
        this.observer = new DelayErrorInnerObserver<>(aedVar, this);
        this.worker = cVar;
    }

    @Override // io.reactivex.rxjava3.disposables.a
    public void dispose() {
        this.cancelled = true;
        this.upstream.dispose();
        this.observer.dispose();
        this.worker.dispose();
        this.errors.tryTerminateAndReport();
    }

    public void drain() {
        if (getAndIncrement() != 0) {
            return;
        }
        this.worker.b(this);
    }

    @Override // io.reactivex.rxjava3.disposables.a
    public boolean isDisposed() {
        return this.cancelled;
    }

    @Override // com.oplus.aiunit.vision.aed
    public void onComplete() {
        this.done = true;
        drain();
    }

    @Override // com.oplus.aiunit.vision.aed
    public void onError(Throwable th) {
        if (this.errors.tryAddThrowableOrReport(th)) {
            this.done = true;
            drain();
        }
    }

    @Override // com.oplus.aiunit.vision.aed
    public void onNext(T t) {
        if (this.sourceMode == 0) {
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
                    this.sourceMode = iRequestFusion;
                    this.queue = a7fVar;
                    this.done = true;
                    this.downstream.onSubscribe(this);
                    drain();
                    return;
                }
                if (iRequestFusion == 2) {
                    this.sourceMode = iRequestFusion;
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
        aed<? super R> aedVar = this.downstream;
        f4h<T> f4hVar = this.queue;
        AtomicThrowable atomicThrowable = this.errors;
        while (true) {
            if (!this.active) {
                if (this.cancelled) {
                    f4hVar.clear();
                    return;
                }
                if (!this.tillTheEnd && atomicThrowable.get() != null) {
                    f4hVar.clear();
                    this.cancelled = true;
                    atomicThrowable.tryTerminateConsumer(aedVar);
                    this.worker.dispose();
                    return;
                }
                boolean z = this.done;
                try {
                    T tPoll = f4hVar.poll();
                    boolean z2 = tPoll == null;
                    if (z && z2) {
                        this.cancelled = true;
                        atomicThrowable.tryTerminateConsumer(aedVar);
                        this.worker.dispose();
                        return;
                    }
                    if (!z2) {
                        try {
                            jdd<? extends R> jddVarApply = this.mapper.apply(tPoll);
                            Objects.requireNonNull(jddVarApply, "The mapper returned a null ObservableSource");
                            jdd<? extends R> jddVar = jddVarApply;
                            if (jddVar instanceof f4j) {
                                try {
                                    O00 o00 = (Object) ((f4j) jddVar).get();
                                    if (o00 != null && !this.cancelled) {
                                        aedVar.onNext(o00);
                                    }
                                } catch (Throwable th) {
                                    hu6.b(th);
                                    atomicThrowable.tryAddThrowableOrReport(th);
                                }
                            } else {
                                this.active = true;
                                jddVar.subscribe(this.observer);
                            }
                        } catch (Throwable th2) {
                            hu6.b(th2);
                            this.cancelled = true;
                            this.upstream.dispose();
                            f4hVar.clear();
                            atomicThrowable.tryAddThrowableOrReport(th2);
                            atomicThrowable.tryTerminateConsumer(aedVar);
                            this.worker.dispose();
                            return;
                        }
                    }
                } catch (Throwable th3) {
                    hu6.b(th3);
                    this.cancelled = true;
                    this.upstream.dispose();
                    atomicThrowable.tryAddThrowableOrReport(th3);
                    atomicThrowable.tryTerminateConsumer(aedVar);
                    this.worker.dispose();
                    return;
                }
            }
            if (decrementAndGet() == 0) {
                return;
            }
        }
    }
}
