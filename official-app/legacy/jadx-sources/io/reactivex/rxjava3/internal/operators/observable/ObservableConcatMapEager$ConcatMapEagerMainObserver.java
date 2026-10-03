package io.reactivex.rxjava3.internal.operators.observable;

import com.oplus.aiunit.vision.a7f;
import com.oplus.aiunit.vision.aed;
import com.oplus.aiunit.vision.d08;
import com.oplus.aiunit.vision.f4h;
import com.oplus.aiunit.vision.hu6;
import com.oplus.aiunit.vision.jdd;
import com.oplus.aiunit.vision.xki;
import com.oplus.aiunit.vision.y8a;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.observers.InnerQueuedObserver;
import io.reactivex.rxjava3.internal.util.AtomicThrowable;
import io.reactivex.rxjava3.internal.util.ErrorMode;
import java.util.ArrayDeque;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes10.dex */
final class ObservableConcatMapEager$ConcatMapEagerMainObserver<T, R> extends AtomicInteger implements aed<T>, io.reactivex.rxjava3.disposables.a, y8a<R> {
    private static final long serialVersionUID = 8080567949447303262L;
    int activeCount;
    volatile boolean cancelled;
    InnerQueuedObserver<R> current;
    volatile boolean done;
    final aed<? super R> downstream;
    final ErrorMode errorMode;
    final d08<? super T, ? extends jdd<? extends R>> mapper;
    final int maxConcurrency;
    final int prefetch;
    f4h<T> queue;
    int sourceMode;
    io.reactivex.rxjava3.disposables.a upstream;
    final AtomicThrowable errors = new AtomicThrowable();
    final ArrayDeque<InnerQueuedObserver<R>> observers = new ArrayDeque<>();

    public ObservableConcatMapEager$ConcatMapEagerMainObserver(aed<? super R> aedVar, d08<? super T, ? extends jdd<? extends R>> d08Var, int i, int i2, ErrorMode errorMode) {
        this.downstream = aedVar;
        this.mapper = d08Var;
        this.maxConcurrency = i;
        this.prefetch = i2;
        this.errorMode = errorMode;
    }

    @Override // io.reactivex.rxjava3.disposables.a
    public void dispose() {
        if (this.cancelled) {
            return;
        }
        this.cancelled = true;
        this.upstream.dispose();
        this.errors.tryTerminateAndReport();
        drainAndDispose();
    }

    public void disposeAll() {
        InnerQueuedObserver<R> innerQueuedObserver = this.current;
        if (innerQueuedObserver != null) {
            innerQueuedObserver.dispose();
        }
        while (true) {
            InnerQueuedObserver<R> innerQueuedObserverPoll = this.observers.poll();
            if (innerQueuedObserverPoll == null) {
                return;
            } else {
                innerQueuedObserverPoll.dispose();
            }
        }
    }

    @Override // com.oplus.aiunit.vision.y8a
    public void drain() {
        if (getAndIncrement() != 0) {
            return;
        }
        f4h<T> f4hVar = this.queue;
        ArrayDeque<InnerQueuedObserver<R>> arrayDeque = this.observers;
        aed<? super R> aedVar = this.downstream;
        ErrorMode errorMode = this.errorMode;
        int iAddAndGet = 1;
        while (true) {
            int i = this.activeCount;
            while (i != this.maxConcurrency) {
                if (this.cancelled) {
                    f4hVar.clear();
                    disposeAll();
                    return;
                }
                if (errorMode == ErrorMode.IMMEDIATE && this.errors.get() != null) {
                    f4hVar.clear();
                    disposeAll();
                    this.errors.tryTerminateConsumer(this.downstream);
                    return;
                }
                try {
                    T tPoll = f4hVar.poll();
                    if (tPoll == null) {
                        break;
                    }
                    jdd<? extends R> jddVarApply = this.mapper.apply(tPoll);
                    Objects.requireNonNull(jddVarApply, "The mapper returned a null ObservableSource");
                    jdd<? extends R> jddVar = jddVarApply;
                    InnerQueuedObserver<R> innerQueuedObserver = new InnerQueuedObserver<>(this, this.prefetch);
                    arrayDeque.offer(innerQueuedObserver);
                    jddVar.subscribe(innerQueuedObserver);
                    i++;
                } catch (Throwable th) {
                    hu6.b(th);
                    this.upstream.dispose();
                    f4hVar.clear();
                    disposeAll();
                    this.errors.tryAddThrowableOrReport(th);
                    this.errors.tryTerminateConsumer(this.downstream);
                    return;
                }
            }
            this.activeCount = i;
            if (this.cancelled) {
                f4hVar.clear();
                disposeAll();
                return;
            }
            if (errorMode == ErrorMode.IMMEDIATE && this.errors.get() != null) {
                f4hVar.clear();
                disposeAll();
                this.errors.tryTerminateConsumer(this.downstream);
                return;
            }
            InnerQueuedObserver<R> innerQueuedObserver2 = this.current;
            if (innerQueuedObserver2 == null) {
                if (errorMode == ErrorMode.BOUNDARY && this.errors.get() != null) {
                    f4hVar.clear();
                    disposeAll();
                    this.errors.tryTerminateConsumer(aedVar);
                    return;
                }
                boolean z = this.done;
                InnerQueuedObserver<R> innerQueuedObserverPoll = arrayDeque.poll();
                boolean z2 = innerQueuedObserverPoll == null;
                if (z && z2) {
                    if (this.errors.get() == null) {
                        aedVar.onComplete();
                        return;
                    }
                    f4hVar.clear();
                    disposeAll();
                    this.errors.tryTerminateConsumer(aedVar);
                    return;
                }
                if (!z2) {
                    this.current = innerQueuedObserverPoll;
                }
                innerQueuedObserver2 = innerQueuedObserverPoll;
            }
            if (innerQueuedObserver2 != null) {
                f4h<R> f4hVarQueue = innerQueuedObserver2.queue();
                while (true) {
                    if (this.cancelled) {
                        f4hVar.clear();
                        disposeAll();
                        return;
                    }
                    boolean zIsDone = innerQueuedObserver2.isDone();
                    if (errorMode == ErrorMode.IMMEDIATE && this.errors.get() != null) {
                        f4hVar.clear();
                        disposeAll();
                        this.errors.tryTerminateConsumer(aedVar);
                        return;
                    }
                    try {
                        R rPoll = f4hVarQueue.poll();
                        boolean z3 = rPoll == null;
                        if (zIsDone && z3) {
                            this.current = null;
                            this.activeCount--;
                        } else if (!z3) {
                            aedVar.onNext(rPoll);
                        }
                    } catch (Throwable th2) {
                        hu6.b(th2);
                        this.errors.tryAddThrowableOrReport(th2);
                        this.current = null;
                        this.activeCount--;
                    }
                }
            }
            iAddAndGet = addAndGet(-iAddAndGet);
            if (iAddAndGet == 0) {
                return;
            }
        }
    }

    public void drainAndDispose() {
        if (getAndIncrement() == 0) {
            do {
                this.queue.clear();
                disposeAll();
            } while (decrementAndGet() != 0);
        }
    }

    @Override // com.oplus.aiunit.vision.y8a
    public void innerComplete(InnerQueuedObserver<R> innerQueuedObserver) {
        innerQueuedObserver.setDone();
        drain();
    }

    @Override // com.oplus.aiunit.vision.y8a
    public void innerError(InnerQueuedObserver<R> innerQueuedObserver, Throwable th) {
        if (this.errors.tryAddThrowableOrReport(th)) {
            if (this.errorMode == ErrorMode.IMMEDIATE) {
                this.upstream.dispose();
            }
            innerQueuedObserver.setDone();
            drain();
        }
    }

    @Override // com.oplus.aiunit.vision.y8a
    public void innerNext(InnerQueuedObserver<R> innerQueuedObserver, R r) {
        innerQueuedObserver.queue().offer(r);
        drain();
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
            this.queue = new xki(this.prefetch);
            this.downstream.onSubscribe(this);
        }
    }
}
