package io.reactivex.internal.operators.observable;

import com.oplus.aiunit.vision.abd;
import com.oplus.aiunit.vision.b7f;
import com.oplus.aiunit.vision.bed;
import com.oplus.aiunit.vision.cv5;
import com.oplus.aiunit.vision.g4h;
import com.oplus.aiunit.vision.h4g;
import com.oplus.aiunit.vision.iu6;
import com.oplus.aiunit.vision.j08;
import com.oplus.aiunit.vision.kdd;
import com.oplus.aiunit.vision.yki;
import com.oplus.aiunit.vision.z8a;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.observers.InnerQueuedObserver;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.ErrorMode;
import java.util.ArrayDeque;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes10.dex */
final class ObservableConcatMapEager$ConcatMapEagerMainObserver<T, R> extends AtomicInteger implements bed<T>, cv5, z8a<R> {
    private static final long serialVersionUID = 8080567949447303262L;
    int activeCount;
    volatile boolean cancelled;
    InnerQueuedObserver<R> current;
    volatile boolean done;
    final bed<? super R> downstream;
    final ErrorMode errorMode;
    final j08<? super T, ? extends kdd<? extends R>> mapper;
    final int maxConcurrency;
    final int prefetch;
    g4h<T> queue;
    int sourceMode;
    cv5 upstream;
    final AtomicThrowable error = new AtomicThrowable();
    final ArrayDeque<InnerQueuedObserver<R>> observers = new ArrayDeque<>();

    public ObservableConcatMapEager$ConcatMapEagerMainObserver(bed<? super R> bedVar, j08<? super T, ? extends kdd<? extends R>> j08Var, int i, int i2, ErrorMode errorMode) {
        this.downstream = bedVar;
        this.mapper = j08Var;
        this.maxConcurrency = i;
        this.prefetch = i2;
        this.errorMode = errorMode;
    }

    @Override // com.oplus.aiunit.vision.cv5
    public void dispose() {
        if (this.cancelled) {
            return;
        }
        this.cancelled = true;
        this.upstream.dispose();
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

    @Override // com.oplus.aiunit.vision.z8a
    public void drain() {
        if (getAndIncrement() != 0) {
            return;
        }
        g4h<T> g4hVar = this.queue;
        ArrayDeque<InnerQueuedObserver<R>> arrayDeque = this.observers;
        bed<? super R> bedVar = this.downstream;
        ErrorMode errorMode = this.errorMode;
        int iAddAndGet = 1;
        while (true) {
            int i = this.activeCount;
            while (i != this.maxConcurrency) {
                if (this.cancelled) {
                    g4hVar.clear();
                    disposeAll();
                    return;
                }
                if (errorMode == ErrorMode.IMMEDIATE && this.error.get() != null) {
                    g4hVar.clear();
                    disposeAll();
                    bedVar.onError(this.error.terminate());
                    return;
                }
                try {
                    T tPoll = g4hVar.poll();
                    if (tPoll == null) {
                        break;
                    }
                    kdd kddVar = (kdd) abd.d(this.mapper.apply(tPoll), "The mapper returned a null ObservableSource");
                    InnerQueuedObserver<R> innerQueuedObserver = new InnerQueuedObserver<>(this, this.prefetch);
                    arrayDeque.offer(innerQueuedObserver);
                    kddVar.subscribe(innerQueuedObserver);
                    i++;
                } catch (Throwable th) {
                    iu6.b(th);
                    this.upstream.dispose();
                    g4hVar.clear();
                    disposeAll();
                    this.error.addThrowable(th);
                    bedVar.onError(this.error.terminate());
                    return;
                }
            }
            this.activeCount = i;
            if (this.cancelled) {
                g4hVar.clear();
                disposeAll();
                return;
            }
            if (errorMode == ErrorMode.IMMEDIATE && this.error.get() != null) {
                g4hVar.clear();
                disposeAll();
                bedVar.onError(this.error.terminate());
                return;
            }
            InnerQueuedObserver<R> innerQueuedObserver2 = this.current;
            if (innerQueuedObserver2 == null) {
                if (errorMode == ErrorMode.BOUNDARY && this.error.get() != null) {
                    g4hVar.clear();
                    disposeAll();
                    bedVar.onError(this.error.terminate());
                    return;
                }
                boolean z = this.done;
                InnerQueuedObserver<R> innerQueuedObserverPoll = arrayDeque.poll();
                boolean z2 = innerQueuedObserverPoll == null;
                if (z && z2) {
                    if (this.error.get() == null) {
                        bedVar.onComplete();
                        return;
                    }
                    g4hVar.clear();
                    disposeAll();
                    bedVar.onError(this.error.terminate());
                    return;
                }
                if (!z2) {
                    this.current = innerQueuedObserverPoll;
                }
                innerQueuedObserver2 = innerQueuedObserverPoll;
            }
            if (innerQueuedObserver2 != null) {
                g4h<R> g4hVarQueue = innerQueuedObserver2.queue();
                while (true) {
                    if (this.cancelled) {
                        g4hVar.clear();
                        disposeAll();
                        return;
                    }
                    boolean zIsDone = innerQueuedObserver2.isDone();
                    if (errorMode == ErrorMode.IMMEDIATE && this.error.get() != null) {
                        g4hVar.clear();
                        disposeAll();
                        bedVar.onError(this.error.terminate());
                        return;
                    }
                    try {
                        R rPoll = g4hVarQueue.poll();
                        boolean z3 = rPoll == null;
                        if (zIsDone && z3) {
                            this.current = null;
                            this.activeCount--;
                        } else if (!z3) {
                            bedVar.onNext(rPoll);
                        }
                    } catch (Throwable th2) {
                        iu6.b(th2);
                        this.error.addThrowable(th2);
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

    @Override // com.oplus.aiunit.vision.z8a
    public void innerComplete(InnerQueuedObserver<R> innerQueuedObserver) {
        innerQueuedObserver.setDone();
        drain();
    }

    @Override // com.oplus.aiunit.vision.z8a
    public void innerError(InnerQueuedObserver<R> innerQueuedObserver, Throwable th) {
        if (!this.error.addThrowable(th)) {
            h4g.r(th);
            return;
        }
        if (this.errorMode == ErrorMode.IMMEDIATE) {
            this.upstream.dispose();
        }
        innerQueuedObserver.setDone();
        drain();
    }

    @Override // com.oplus.aiunit.vision.z8a
    public void innerNext(InnerQueuedObserver<R> innerQueuedObserver, R r) {
        innerQueuedObserver.queue().offer(r);
        drain();
    }

    @Override // com.oplus.aiunit.vision.cv5
    public boolean isDisposed() {
        return this.cancelled;
    }

    @Override // com.oplus.aiunit.vision.bed
    public void onComplete() {
        this.done = true;
        drain();
    }

    @Override // com.oplus.aiunit.vision.bed
    public void onError(Throwable th) {
        if (!this.error.addThrowable(th)) {
            h4g.r(th);
        } else {
            this.done = true;
            drain();
        }
    }

    @Override // com.oplus.aiunit.vision.bed
    public void onNext(T t) {
        if (this.sourceMode == 0) {
            this.queue.offer(t);
        }
        drain();
    }

    @Override // com.oplus.aiunit.vision.bed
    public void onSubscribe(cv5 cv5Var) {
        if (DisposableHelper.validate(this.upstream, cv5Var)) {
            this.upstream = cv5Var;
            if (cv5Var instanceof b7f) {
                b7f b7fVar = (b7f) cv5Var;
                int iRequestFusion = b7fVar.requestFusion(3);
                if (iRequestFusion == 1) {
                    this.sourceMode = iRequestFusion;
                    this.queue = b7fVar;
                    this.done = true;
                    this.downstream.onSubscribe(this);
                    drain();
                    return;
                }
                if (iRequestFusion == 2) {
                    this.sourceMode = iRequestFusion;
                    this.queue = b7fVar;
                    this.downstream.onSubscribe(this);
                    return;
                }
            }
            this.queue = new yki(this.prefetch);
            this.downstream.onSubscribe(this);
        }
    }
}
