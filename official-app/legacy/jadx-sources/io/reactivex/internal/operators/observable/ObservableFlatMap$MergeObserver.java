package io.reactivex.internal.operators.observable;

import com.oplus.aiunit.vision.abd;
import com.oplus.aiunit.vision.bed;
import com.oplus.aiunit.vision.c4h;
import com.oplus.aiunit.vision.cv5;
import com.oplus.aiunit.vision.fue;
import com.oplus.aiunit.vision.g4h;
import com.oplus.aiunit.vision.h4g;
import com.oplus.aiunit.vision.iu6;
import com.oplus.aiunit.vision.j08;
import com.oplus.aiunit.vision.kdd;
import com.oplus.aiunit.vision.yki;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.ExceptionHelper;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
final class ObservableFlatMap$MergeObserver<T, U> extends AtomicInteger implements cv5, bed<T> {
    private static final long serialVersionUID = -2117620485640801370L;
    final int bufferSize;
    volatile boolean cancelled;
    final boolean delayErrors;
    volatile boolean done;
    final bed<? super U> downstream;
    final AtomicThrowable errors = new AtomicThrowable();
    long lastId;
    int lastIndex;
    final j08<? super T, ? extends kdd<? extends U>> mapper;
    final int maxConcurrency;
    final AtomicReference<ObservableFlatMap$InnerObserver<?, ?>[]> observers;
    volatile c4h<U> queue;
    Queue<kdd<? extends U>> sources;
    long uniqueId;
    cv5 upstream;
    int wip;
    static final ObservableFlatMap$InnerObserver<?, ?>[] EMPTY = new ObservableFlatMap$InnerObserver[0];
    static final ObservableFlatMap$InnerObserver<?, ?>[] CANCELLED = new ObservableFlatMap$InnerObserver[0];

    public ObservableFlatMap$MergeObserver(bed<? super U> bedVar, j08<? super T, ? extends kdd<? extends U>> j08Var, boolean z, int i, int i2) {
        this.downstream = bedVar;
        this.mapper = j08Var;
        this.delayErrors = z;
        this.maxConcurrency = i;
        this.bufferSize = i2;
        if (i != Integer.MAX_VALUE) {
            this.sources = new ArrayDeque(i);
        }
        this.observers = new AtomicReference<>(EMPTY);
    }

    public boolean addInner(ObservableFlatMap$InnerObserver<T, U> observableFlatMap$InnerObserver) {
        ObservableFlatMap$InnerObserver<?, ?>[] observableFlatMap$InnerObserverArr;
        ObservableFlatMap$InnerObserver[] observableFlatMap$InnerObserverArr2;
        do {
            observableFlatMap$InnerObserverArr = this.observers.get();
            if (observableFlatMap$InnerObserverArr == CANCELLED) {
                observableFlatMap$InnerObserver.dispose();
                return false;
            }
            int length = observableFlatMap$InnerObserverArr.length;
            observableFlatMap$InnerObserverArr2 = new ObservableFlatMap$InnerObserver[length + 1];
            System.arraycopy(observableFlatMap$InnerObserverArr, 0, observableFlatMap$InnerObserverArr2, 0, length);
            observableFlatMap$InnerObserverArr2[length] = observableFlatMap$InnerObserver;
        } while (!fue.a(this.observers, observableFlatMap$InnerObserverArr, observableFlatMap$InnerObserverArr2));
        return true;
    }

    public boolean checkTerminate() {
        if (this.cancelled) {
            return true;
        }
        Throwable th = this.errors.get();
        if (this.delayErrors || th == null) {
            return false;
        }
        disposeAll();
        Throwable thTerminate = this.errors.terminate();
        if (thTerminate != ExceptionHelper.TERMINATED) {
            this.downstream.onError(thTerminate);
        }
        return true;
    }

    @Override // com.oplus.aiunit.vision.cv5
    public void dispose() {
        Throwable thTerminate;
        if (this.cancelled) {
            return;
        }
        this.cancelled = true;
        if (!disposeAll() || (thTerminate = this.errors.terminate()) == null || thTerminate == ExceptionHelper.TERMINATED) {
            return;
        }
        h4g.r(thTerminate);
    }

    public boolean disposeAll() {
        ObservableFlatMap$InnerObserver<?, ?>[] andSet;
        this.upstream.dispose();
        ObservableFlatMap$InnerObserver<?, ?>[] observableFlatMap$InnerObserverArr = this.observers.get();
        ObservableFlatMap$InnerObserver<?, ?>[] observableFlatMap$InnerObserverArr2 = CANCELLED;
        if (observableFlatMap$InnerObserverArr == observableFlatMap$InnerObserverArr2 || (andSet = this.observers.getAndSet(observableFlatMap$InnerObserverArr2)) == observableFlatMap$InnerObserverArr2) {
            return false;
        }
        for (ObservableFlatMap$InnerObserver<?, ?> observableFlatMap$InnerObserver : andSet) {
            observableFlatMap$InnerObserver.dispose();
        }
        return true;
    }

    public void drain() {
        if (getAndIncrement() == 0) {
            drainLoop();
        }
    }

    /* JADX WARN: Code duplicated, block: B:120:0x00ea A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:133:0x00f2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:82:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:85:0x00f1 A[PHI: r4
  0x00f1: PHI (r4v10 int) = (r4v8 int), (r4v11 int) binds: [B:72:0x00d0, B:84:0x00ef] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    public void drainLoop() {
        int size;
        boolean z;
        bed<? super U> bedVar = this.downstream;
        int iAddAndGet = 1;
        while (!checkTerminate()) {
            c4h<U> c4hVar = this.queue;
            if (c4hVar != null) {
                while (!checkTerminate()) {
                    U uPoll = c4hVar.poll();
                    if (uPoll != null) {
                        bedVar.onNext(uPoll);
                    }
                }
                return;
            }
            boolean z2 = this.done;
            c4h<U> c4hVar2 = this.queue;
            ObservableFlatMap$InnerObserver<?, ?>[] observableFlatMap$InnerObserverArr = this.observers.get();
            int length = observableFlatMap$InnerObserverArr.length;
            int i = 0;
            if (this.maxConcurrency != Integer.MAX_VALUE) {
                synchronized (this) {
                    size = this.sources.size();
                }
            } else {
                size = 0;
            }
            if (z2 && ((c4hVar2 == null || c4hVar2.isEmpty()) && length == 0 && size == 0)) {
                Throwable thTerminate = this.errors.terminate();
                if (thTerminate != ExceptionHelper.TERMINATED) {
                    if (thTerminate == null) {
                        bedVar.onComplete();
                        return;
                    } else {
                        bedVar.onError(thTerminate);
                        return;
                    }
                }
                return;
            }
            if (length != 0) {
                long j2 = this.lastId;
                int i2 = this.lastIndex;
                if (length <= i2 || observableFlatMap$InnerObserverArr[i2].id != j2) {
                    if (length <= i2) {
                        i2 = 0;
                    }
                    for (int i3 = 0; i3 < length && observableFlatMap$InnerObserverArr[i2].id != j2; i3++) {
                        i2++;
                        if (i2 == length) {
                            i2 = 0;
                        }
                    }
                    this.lastIndex = i2;
                    this.lastId = observableFlatMap$InnerObserverArr[i2].id;
                }
                int i4 = 0;
                for (int i5 = 0; i5 < length; i5++) {
                    if (checkTerminate()) {
                        return;
                    }
                    ObservableFlatMap$InnerObserver<T, U> observableFlatMap$InnerObserver = observableFlatMap$InnerObserverArr[i2];
                    g4h<U> g4hVar = observableFlatMap$InnerObserver.queue;
                    if (g4hVar != null) {
                        do {
                            try {
                                U uPoll2 = g4hVar.poll();
                                if (uPoll2 == null) {
                                    z = observableFlatMap$InnerObserver.done;
                                    g4h<U> g4hVar2 = observableFlatMap$InnerObserver.queue;
                                    if (z && (g4hVar2 == null || g4hVar2.isEmpty())) {
                                        removeInner(observableFlatMap$InnerObserver);
                                        if (checkTerminate()) {
                                            return;
                                        } else {
                                            i4++;
                                        }
                                    }
                                    i2++;
                                    if (i2 == length) {
                                        i2 = 0;
                                    }
                                } else {
                                    bedVar.onNext(uPoll2);
                                }
                            } catch (Throwable th) {
                                iu6.b(th);
                                observableFlatMap$InnerObserver.dispose();
                                this.errors.addThrowable(th);
                                if (checkTerminate()) {
                                    return;
                                }
                                removeInner(observableFlatMap$InnerObserver);
                                i4++;
                                i2++;
                                if (i2 == length) {
                                }
                            }
                        } while (!checkTerminate());
                        return;
                    }
                    z = observableFlatMap$InnerObserver.done;
                    g4h<U> g4hVar3 = observableFlatMap$InnerObserver.queue;
                    if (z) {
                        removeInner(observableFlatMap$InnerObserver);
                        if (checkTerminate()) {
                            return;
                        } else {
                            i4++;
                        }
                    }
                    i2++;
                    if (i2 == length) {
                        i2 = 0;
                    }
                }
                this.lastIndex = i2;
                this.lastId = observableFlatMap$InnerObserverArr[i2].id;
                i = i4;
            }
            if (i == 0) {
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            } else if (this.maxConcurrency != Integer.MAX_VALUE) {
                while (true) {
                    int i6 = i - 1;
                    if (i != 0) {
                        synchronized (this) {
                            kdd<? extends U> kddVarPoll = this.sources.poll();
                            if (kddVarPoll == null) {
                                this.wip--;
                            } else {
                                subscribeInner(kddVarPoll);
                            }
                        }
                        i = i6;
                    }
                }
            } else {
                continue;
            }
        }
    }

    @Override // com.oplus.aiunit.vision.cv5
    public boolean isDisposed() {
        return this.cancelled;
    }

    @Override // com.oplus.aiunit.vision.bed
    public void onComplete() {
        if (this.done) {
            return;
        }
        this.done = true;
        drain();
    }

    @Override // com.oplus.aiunit.vision.bed
    public void onError(Throwable th) {
        if (this.done) {
            h4g.r(th);
        } else if (!this.errors.addThrowable(th)) {
            h4g.r(th);
        } else {
            this.done = true;
            drain();
        }
    }

    @Override // com.oplus.aiunit.vision.bed
    public void onNext(T t) {
        if (this.done) {
            return;
        }
        try {
            kdd<? extends U> kddVar = (kdd) abd.d(this.mapper.apply(t), "The mapper returned a null ObservableSource");
            if (this.maxConcurrency != Integer.MAX_VALUE) {
                synchronized (this) {
                    int i = this.wip;
                    if (i == this.maxConcurrency) {
                        this.sources.offer(kddVar);
                        return;
                    }
                    this.wip = i + 1;
                }
            }
            subscribeInner(kddVar);
        } catch (Throwable th) {
            iu6.b(th);
            this.upstream.dispose();
            onError(th);
        }
    }

    @Override // com.oplus.aiunit.vision.bed
    public void onSubscribe(cv5 cv5Var) {
        if (DisposableHelper.validate(this.upstream, cv5Var)) {
            this.upstream = cv5Var;
            this.downstream.onSubscribe(this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void removeInner(ObservableFlatMap$InnerObserver<T, U> observableFlatMap$InnerObserver) {
        ObservableFlatMap$InnerObserver<?, ?>[] observableFlatMap$InnerObserverArr;
        ObservableFlatMap$InnerObserver<?, ?>[] observableFlatMap$InnerObserverArr2;
        do {
            observableFlatMap$InnerObserverArr = this.observers.get();
            int length = observableFlatMap$InnerObserverArr.length;
            if (length == 0) {
                return;
            }
            int i = 0;
            while (true) {
                if (i >= length) {
                    i = -1;
                    break;
                } else if (observableFlatMap$InnerObserverArr[i] == observableFlatMap$InnerObserver) {
                    break;
                } else {
                    i++;
                }
            }
            if (i < 0) {
                return;
            }
            if (length == 1) {
                observableFlatMap$InnerObserverArr2 = EMPTY;
            } else {
                ObservableFlatMap$InnerObserver<?, ?>[] observableFlatMap$InnerObserverArr3 = new ObservableFlatMap$InnerObserver[length - 1];
                System.arraycopy(observableFlatMap$InnerObserverArr, 0, observableFlatMap$InnerObserverArr3, 0, i);
                System.arraycopy(observableFlatMap$InnerObserverArr, i + 1, observableFlatMap$InnerObserverArr3, i, (length - i) - 1);
                observableFlatMap$InnerObserverArr2 = observableFlatMap$InnerObserverArr3;
            }
        } while (!fue.a(this.observers, observableFlatMap$InnerObserverArr, observableFlatMap$InnerObserverArr2));
    }

    public void subscribeInner(kdd<? extends U> kddVar) {
        boolean z;
        while (kddVar instanceof Callable) {
            if (!tryEmitScalar((Callable) kddVar) || this.maxConcurrency == Integer.MAX_VALUE) {
                return;
            }
            synchronized (this) {
                kddVar = this.sources.poll();
                if (kddVar == null) {
                    z = true;
                    this.wip--;
                } else {
                    z = false;
                }
            }
            if (z) {
                drain();
                return;
            }
        }
        long j2 = this.uniqueId;
        this.uniqueId = 1 + j2;
        ObservableFlatMap$InnerObserver<T, U> observableFlatMap$InnerObserver = new ObservableFlatMap$InnerObserver<>(this, j2);
        if (addInner(observableFlatMap$InnerObserver)) {
            kddVar.subscribe(observableFlatMap$InnerObserver);
        }
    }

    public void tryEmit(U u, ObservableFlatMap$InnerObserver<T, U> observableFlatMap$InnerObserver) {
        if (get() == 0 && compareAndSet(0, 1)) {
            this.downstream.onNext(u);
            if (decrementAndGet() == 0) {
                return;
            }
        } else {
            g4h ykiVar = observableFlatMap$InnerObserver.queue;
            if (ykiVar == null) {
                ykiVar = new yki(this.bufferSize);
                observableFlatMap$InnerObserver.queue = ykiVar;
            }
            ykiVar.offer(u);
            if (getAndIncrement() != 0) {
                return;
            }
        }
        drainLoop();
    }

    public boolean tryEmitScalar(Callable<? extends U> callable) {
        try {
            U uCall = callable.call();
            if (uCall == null) {
                return true;
            }
            if (get() == 0 && compareAndSet(0, 1)) {
                this.downstream.onNext(uCall);
                if (decrementAndGet() == 0) {
                    return true;
                }
            } else {
                c4h<U> ykiVar = this.queue;
                if (ykiVar == null) {
                    ykiVar = this.maxConcurrency == Integer.MAX_VALUE ? new yki<>(this.bufferSize) : new SpscArrayQueue<>(this.maxConcurrency);
                    this.queue = ykiVar;
                }
                if (!ykiVar.offer(uCall)) {
                    onError(new IllegalStateException("Scalar queue full?!"));
                    return true;
                }
                if (getAndIncrement() != 0) {
                    return false;
                }
            }
            drainLoop();
            return true;
        } catch (Throwable th) {
            iu6.b(th);
            this.errors.addThrowable(th);
            drain();
            return true;
        }
    }
}
