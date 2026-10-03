package io.reactivex.internal.operators.observable;

import O0O.O00;
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
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.util.AtomicThrowable;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
final class ObservableConcatMap$ConcatMapDelayErrorObserver<T, R> extends AtomicInteger implements bed<T>, cv5 {
    private static final long serialVersionUID = -6951100001833242599L;
    volatile boolean active;
    final int bufferSize;
    volatile boolean cancelled;
    volatile boolean done;
    final bed<? super R> downstream;
    final AtomicThrowable error = new AtomicThrowable();
    final j08<? super T, ? extends kdd<? extends R>> mapper;
    final DelayErrorInnerObserver<R> observer;
    g4h<T> queue;
    int sourceMode;
    final boolean tillTheEnd;
    cv5 upstream;

    public static final class DelayErrorInnerObserver<R> extends AtomicReference<cv5> implements bed<R> {
        private static final long serialVersionUID = 2620149119579502636L;
        final bed<? super R> downstream;
        final ObservableConcatMap$ConcatMapDelayErrorObserver<?, R> parent;

        public DelayErrorInnerObserver(bed<? super R> bedVar, ObservableConcatMap$ConcatMapDelayErrorObserver<?, R> observableConcatMap$ConcatMapDelayErrorObserver) {
            this.downstream = bedVar;
            this.parent = observableConcatMap$ConcatMapDelayErrorObserver;
        }

        public void dispose() {
            DisposableHelper.dispose(this);
        }

        @Override // com.oplus.aiunit.vision.bed
        public void onComplete() {
            ObservableConcatMap$ConcatMapDelayErrorObserver<?, R> observableConcatMap$ConcatMapDelayErrorObserver = this.parent;
            observableConcatMap$ConcatMapDelayErrorObserver.active = false;
            observableConcatMap$ConcatMapDelayErrorObserver.drain();
        }

        @Override // com.oplus.aiunit.vision.bed
        public void onError(Throwable th) {
            ObservableConcatMap$ConcatMapDelayErrorObserver<?, R> observableConcatMap$ConcatMapDelayErrorObserver = this.parent;
            if (!observableConcatMap$ConcatMapDelayErrorObserver.error.addThrowable(th)) {
                h4g.r(th);
                return;
            }
            if (!observableConcatMap$ConcatMapDelayErrorObserver.tillTheEnd) {
                observableConcatMap$ConcatMapDelayErrorObserver.upstream.dispose();
            }
            observableConcatMap$ConcatMapDelayErrorObserver.active = false;
            observableConcatMap$ConcatMapDelayErrorObserver.drain();
        }

        @Override // com.oplus.aiunit.vision.bed
        public void onNext(R r) {
            this.downstream.onNext(r);
        }

        @Override // com.oplus.aiunit.vision.bed
        public void onSubscribe(cv5 cv5Var) {
            DisposableHelper.replace(this, cv5Var);
        }
    }

    public ObservableConcatMap$ConcatMapDelayErrorObserver(bed<? super R> bedVar, j08<? super T, ? extends kdd<? extends R>> j08Var, int i, boolean z) {
        this.downstream = bedVar;
        this.mapper = j08Var;
        this.bufferSize = i;
        this.tillTheEnd = z;
        this.observer = new DelayErrorInnerObserver<>(bedVar, this);
    }

    @Override // com.oplus.aiunit.vision.cv5
    public void dispose() {
        this.cancelled = true;
        this.upstream.dispose();
        this.observer.dispose();
    }

    public void drain() {
        if (getAndIncrement() != 0) {
            return;
        }
        bed<? super R> bedVar = this.downstream;
        g4h<T> g4hVar = this.queue;
        AtomicThrowable atomicThrowable = this.error;
        while (true) {
            if (!this.active) {
                if (this.cancelled) {
                    g4hVar.clear();
                    return;
                }
                if (!this.tillTheEnd && atomicThrowable.get() != null) {
                    g4hVar.clear();
                    this.cancelled = true;
                    bedVar.onError(atomicThrowable.terminate());
                    return;
                }
                boolean z = this.done;
                try {
                    T tPoll = g4hVar.poll();
                    boolean z2 = tPoll == null;
                    if (z && z2) {
                        this.cancelled = true;
                        Throwable thTerminate = atomicThrowable.terminate();
                        if (thTerminate != null) {
                            bedVar.onError(thTerminate);
                            return;
                        } else {
                            bedVar.onComplete();
                            return;
                        }
                    }
                    if (!z2) {
                        try {
                            kdd kddVar = (kdd) abd.d(this.mapper.apply(tPoll), "The mapper returned a null ObservableSource");
                            if (kddVar instanceof Callable) {
                                try {
                                    O00 o00 = (Object) ((Callable) kddVar).call();
                                    if (o00 != null && !this.cancelled) {
                                        bedVar.onNext(o00);
                                    }
                                } catch (Throwable th) {
                                    iu6.b(th);
                                    atomicThrowable.addThrowable(th);
                                }
                            } else {
                                this.active = true;
                                kddVar.subscribe(this.observer);
                            }
                        } catch (Throwable th2) {
                            iu6.b(th2);
                            this.cancelled = true;
                            this.upstream.dispose();
                            g4hVar.clear();
                            atomicThrowable.addThrowable(th2);
                            bedVar.onError(atomicThrowable.terminate());
                            return;
                        }
                    }
                } catch (Throwable th3) {
                    iu6.b(th3);
                    this.cancelled = true;
                    this.upstream.dispose();
                    atomicThrowable.addThrowable(th3);
                    bedVar.onError(atomicThrowable.terminate());
                    return;
                }
            }
            if (decrementAndGet() == 0) {
                return;
            }
        }
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
            this.queue = new yki(this.bufferSize);
            this.downstream.onSubscribe(this);
        }
    }
}
