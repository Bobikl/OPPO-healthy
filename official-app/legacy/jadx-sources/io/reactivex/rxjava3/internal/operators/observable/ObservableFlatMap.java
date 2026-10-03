package io.reactivex.rxjava3.internal.operators.observable;

import com.oplus.aiunit.vision.a7f;
import com.oplus.aiunit.vision.aed;
import com.oplus.aiunit.vision.b4h;
import com.oplus.aiunit.vision.d08;
import com.oplus.aiunit.vision.f4h;
import com.oplus.aiunit.vision.f4j;
import com.oplus.aiunit.vision.fue;
import com.oplus.aiunit.vision.g4g;
import com.oplus.aiunit.vision.hu6;
import com.oplus.aiunit.vision.jdd;
import com.oplus.aiunit.vision.m6;
import com.oplus.aiunit.vision.xki;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.queue.SpscArrayQueue;
import io.reactivex.rxjava3.internal.util.AtomicThrowable;
import java.util.ArrayDeque;
import java.util.Objects;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
public final class ObservableFlatMap<T, U> extends m6<T, U> {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final d08<? super T, ? extends jdd<? extends U>> f20563j;
    public final boolean k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f20564l;
    public final int m;

    public static final class InnerObserver<T, U> extends AtomicReference<io.reactivex.rxjava3.disposables.a> implements aed<U> {
        private static final long serialVersionUID = -4606175640614850599L;
        volatile boolean done;
        int fusionMode;
        final long id;
        final MergeObserver<T, U> parent;
        volatile f4h<U> queue;

        public InnerObserver(MergeObserver<T, U> mergeObserver, long j2) {
            this.id = j2;
            this.parent = mergeObserver;
        }

        public void dispose() {
            DisposableHelper.dispose(this);
        }

        @Override // com.oplus.aiunit.vision.aed
        public void onComplete() {
            this.done = true;
            this.parent.drain();
        }

        @Override // com.oplus.aiunit.vision.aed
        public void onError(Throwable th) {
            if (this.parent.errors.tryAddThrowableOrReport(th)) {
                MergeObserver<T, U> mergeObserver = this.parent;
                if (!mergeObserver.delayErrors) {
                    mergeObserver.disposeAll();
                }
                this.done = true;
                this.parent.drain();
            }
        }

        @Override // com.oplus.aiunit.vision.aed
        public void onNext(U u) {
            if (this.fusionMode == 0) {
                this.parent.tryEmit(u, this);
            } else {
                this.parent.drain();
            }
        }

        @Override // com.oplus.aiunit.vision.aed
        public void onSubscribe(io.reactivex.rxjava3.disposables.a aVar) {
            if (DisposableHelper.setOnce(this, aVar) && (aVar instanceof a7f)) {
                a7f a7fVar = (a7f) aVar;
                int iRequestFusion = a7fVar.requestFusion(7);
                if (iRequestFusion == 1) {
                    this.fusionMode = iRequestFusion;
                    this.queue = a7fVar;
                    this.done = true;
                    this.parent.drain();
                    return;
                }
                if (iRequestFusion == 2) {
                    this.fusionMode = iRequestFusion;
                    this.queue = a7fVar;
                }
            }
        }
    }

    public static final class MergeObserver<T, U> extends AtomicInteger implements io.reactivex.rxjava3.disposables.a, aed<T> {
        private static final long serialVersionUID = -2117620485640801370L;
        final int bufferSize;
        final boolean delayErrors;
        volatile boolean disposed;
        volatile boolean done;
        final aed<? super U> downstream;
        final AtomicThrowable errors = new AtomicThrowable();
        int lastIndex;
        final d08<? super T, ? extends jdd<? extends U>> mapper;
        final int maxConcurrency;
        final AtomicReference<InnerObserver<?, ?>[]> observers;
        volatile b4h<U> queue;
        Queue<jdd<? extends U>> sources;
        long uniqueId;
        io.reactivex.rxjava3.disposables.a upstream;
        int wip;
        static final InnerObserver<?, ?>[] EMPTY = new InnerObserver[0];
        static final InnerObserver<?, ?>[] CANCELLED = new InnerObserver[0];

        public MergeObserver(aed<? super U> aedVar, d08<? super T, ? extends jdd<? extends U>> d08Var, boolean z, int i, int i2) {
            this.downstream = aedVar;
            this.mapper = d08Var;
            this.delayErrors = z;
            this.maxConcurrency = i;
            this.bufferSize = i2;
            if (i != Integer.MAX_VALUE) {
                this.sources = new ArrayDeque(i);
            }
            this.observers = new AtomicReference<>(EMPTY);
        }

        public boolean addInner(InnerObserver<T, U> innerObserver) {
            InnerObserver<?, ?>[] innerObserverArr;
            InnerObserver[] innerObserverArr2;
            do {
                innerObserverArr = this.observers.get();
                if (innerObserverArr == CANCELLED) {
                    innerObserver.dispose();
                    return false;
                }
                int length = innerObserverArr.length;
                innerObserverArr2 = new InnerObserver[length + 1];
                System.arraycopy(innerObserverArr, 0, innerObserverArr2, 0, length);
                innerObserverArr2[length] = innerObserver;
            } while (!fue.a(this.observers, innerObserverArr, innerObserverArr2));
            return true;
        }

        public boolean checkTerminate() {
            if (this.disposed) {
                return true;
            }
            Throwable th = this.errors.get();
            if (this.delayErrors || th == null) {
                return false;
            }
            disposeAll();
            this.errors.tryTerminateConsumer(this.downstream);
            return true;
        }

        @Override // io.reactivex.rxjava3.disposables.a
        public void dispose() {
            this.disposed = true;
            if (disposeAll()) {
                this.errors.tryTerminateAndReport();
            }
        }

        public boolean disposeAll() {
            this.upstream.dispose();
            AtomicReference<InnerObserver<?, ?>[]> atomicReference = this.observers;
            InnerObserver<?, ?>[] innerObserverArr = CANCELLED;
            InnerObserver<?, ?>[] andSet = atomicReference.getAndSet(innerObserverArr);
            if (andSet == innerObserverArr) {
                return false;
            }
            for (InnerObserver<?, ?> innerObserver : andSet) {
                innerObserver.dispose();
            }
            return true;
        }

        public void drain() {
            if (getAndIncrement() == 0) {
                drainLoop();
            }
        }

        /* JADX WARN: Code duplicated, block: B:104:0x00c5 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:67:0x00c4 A[PHI: r4
  0x00c4: PHI (r4v6 int) = (r4v4 int), (r4v7 int) binds: [B:57:0x00aa, B:66:0x00c2] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Multi-variable type inference failed */
        public void drainLoop() {
            int size;
            boolean z;
            aed<? super U> aedVar = this.downstream;
            int iAddAndGet = 1;
            while (!checkTerminate()) {
                b4h<U> b4hVar = this.queue;
                int i = 0;
                if (b4hVar != null) {
                    while (!checkTerminate()) {
                        U uPoll = b4hVar.poll();
                        if (uPoll != null) {
                            aedVar.onNext(uPoll);
                            i++;
                        }
                    }
                    return;
                }
                if (i == 0) {
                    boolean z2 = this.done;
                    b4h<U> b4hVar2 = this.queue;
                    InnerObserver<?, ?>[] innerObserverArr = this.observers.get();
                    int length = innerObserverArr.length;
                    if (this.maxConcurrency != Integer.MAX_VALUE) {
                        synchronized (this) {
                            size = this.sources.size();
                        }
                    } else {
                        size = 0;
                    }
                    if (z2 && ((b4hVar2 == null || b4hVar2.isEmpty()) && length == 0 && size == 0)) {
                        this.errors.tryTerminateConsumer(this.downstream);
                        return;
                    }
                    if (length != 0) {
                        int iMin = Math.min(length - 1, this.lastIndex);
                        for (int i2 = 0; i2 < length; i2++) {
                            if (checkTerminate()) {
                                return;
                            }
                            InnerObserver<T, U> innerObserver = innerObserverArr[iMin];
                            f4h<U> f4hVar = innerObserver.queue;
                            if (f4hVar != null) {
                                do {
                                    try {
                                        U uPoll2 = f4hVar.poll();
                                        if (uPoll2 == null) {
                                            z = innerObserver.done;
                                            f4h<U> f4hVar2 = innerObserver.queue;
                                            if (z && (f4hVar2 == null || f4hVar2.isEmpty())) {
                                                removeInner(innerObserver);
                                                i++;
                                            }
                                            iMin++;
                                            if (iMin == length) {
                                                iMin = 0;
                                            }
                                        } else {
                                            aedVar.onNext(uPoll2);
                                        }
                                    } catch (Throwable th) {
                                        hu6.b(th);
                                        innerObserver.dispose();
                                        this.errors.tryAddThrowableOrReport(th);
                                        if (checkTerminate()) {
                                            return;
                                        }
                                        removeInner(innerObserver);
                                        i++;
                                        iMin++;
                                        if (iMin == length) {
                                        }
                                    }
                                } while (!checkTerminate());
                                return;
                            }
                            z = innerObserver.done;
                            f4h<U> f4hVar3 = innerObserver.queue;
                            if (z) {
                                removeInner(innerObserver);
                                i++;
                            }
                            iMin++;
                            if (iMin == length) {
                                iMin = 0;
                            }
                        }
                        this.lastIndex = iMin;
                    }
                    if (i == 0) {
                        iAddAndGet = addAndGet(-iAddAndGet);
                        if (iAddAndGet == 0) {
                            return;
                        }
                    } else if (this.maxConcurrency != Integer.MAX_VALUE) {
                        subscribeMore(i);
                    }
                } else if (this.maxConcurrency != Integer.MAX_VALUE) {
                    subscribeMore(i);
                }
            }
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
            } else if (this.errors.tryAddThrowableOrReport(th)) {
                this.done = true;
                drain();
            }
        }

        @Override // com.oplus.aiunit.vision.aed
        public void onNext(T t) {
            if (this.done) {
                return;
            }
            try {
                jdd<? extends U> jddVarApply = this.mapper.apply(t);
                Objects.requireNonNull(jddVarApply, "The mapper returned a null ObservableSource");
                jdd<? extends U> jddVar = jddVarApply;
                if (this.maxConcurrency != Integer.MAX_VALUE) {
                    synchronized (this) {
                        int i = this.wip;
                        if (i == this.maxConcurrency) {
                            this.sources.offer(jddVar);
                            return;
                        }
                        this.wip = i + 1;
                    }
                }
                subscribeInner(jddVar);
            } catch (Throwable th) {
                hu6.b(th);
                this.upstream.dispose();
                onError(th);
            }
        }

        @Override // com.oplus.aiunit.vision.aed
        public void onSubscribe(io.reactivex.rxjava3.disposables.a aVar) {
            if (DisposableHelper.validate(this.upstream, aVar)) {
                this.upstream = aVar;
                this.downstream.onSubscribe(this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public void removeInner(InnerObserver<T, U> innerObserver) {
            InnerObserver<?, ?>[] innerObserverArr;
            InnerObserver<?, ?>[] innerObserverArr2;
            do {
                innerObserverArr = this.observers.get();
                int length = innerObserverArr.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        i = -1;
                        break;
                    } else if (innerObserverArr[i] == innerObserver) {
                        break;
                    } else {
                        i++;
                    }
                }
                if (i < 0) {
                    return;
                }
                if (length == 1) {
                    innerObserverArr2 = EMPTY;
                } else {
                    InnerObserver<?, ?>[] innerObserverArr3 = new InnerObserver[length - 1];
                    System.arraycopy(innerObserverArr, 0, innerObserverArr3, 0, i);
                    System.arraycopy(innerObserverArr, i + 1, innerObserverArr3, i, (length - i) - 1);
                    innerObserverArr2 = innerObserverArr3;
                }
            } while (!fue.a(this.observers, innerObserverArr, innerObserverArr2));
        }

        public void subscribeInner(jdd<? extends U> jddVar) {
            boolean z;
            while (jddVar instanceof f4j) {
                if (!tryEmitScalar((f4j) jddVar) || this.maxConcurrency == Integer.MAX_VALUE) {
                    return;
                }
                synchronized (this) {
                    jddVar = this.sources.poll();
                    if (jddVar == null) {
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
            InnerObserver<T, U> innerObserver = new InnerObserver<>(this, j2);
            if (addInner(innerObserver)) {
                jddVar.subscribe(innerObserver);
            }
        }

        public void subscribeMore(int i) {
            while (true) {
                int i2 = i - 1;
                if (i == 0) {
                    return;
                }
                synchronized (this) {
                    jdd<? extends U> jddVarPoll = this.sources.poll();
                    if (jddVarPoll == null) {
                        this.wip--;
                    } else {
                        subscribeInner(jddVarPoll);
                    }
                }
                i = i2;
            }
        }

        public void tryEmit(U u, InnerObserver<T, U> innerObserver) {
            if (get() == 0 && compareAndSet(0, 1)) {
                this.downstream.onNext(u);
                if (decrementAndGet() == 0) {
                    return;
                }
            } else {
                f4h xkiVar = innerObserver.queue;
                if (xkiVar == null) {
                    xkiVar = new xki(this.bufferSize);
                    innerObserver.queue = xkiVar;
                }
                xkiVar.offer(u);
                if (getAndIncrement() != 0) {
                    return;
                }
            }
            drainLoop();
        }

        public boolean tryEmitScalar(f4j<? extends U> f4jVar) {
            try {
                U u = f4jVar.get();
                if (u == null) {
                    return true;
                }
                if (get() == 0 && compareAndSet(0, 1)) {
                    this.downstream.onNext(u);
                    if (decrementAndGet() == 0) {
                        return true;
                    }
                } else {
                    b4h<U> xkiVar = this.queue;
                    if (xkiVar == null) {
                        xkiVar = this.maxConcurrency == Integer.MAX_VALUE ? new xki<>(this.bufferSize) : new SpscArrayQueue<>(this.maxConcurrency);
                        this.queue = xkiVar;
                    }
                    xkiVar.offer(u);
                    if (getAndIncrement() != 0) {
                        return false;
                    }
                }
                drainLoop();
                return true;
            } catch (Throwable th) {
                hu6.b(th);
                this.errors.tryAddThrowableOrReport(th);
                drain();
                return true;
            }
        }
    }

    public ObservableFlatMap(jdd<T> jddVar, d08<? super T, ? extends jdd<? extends U>> d08Var, boolean z, int i, int i2) {
        super(jddVar);
        this.f20563j = d08Var;
        this.k = z;
        this.f20564l = i;
        this.m = i2;
    }

    @Override // com.oplus.aiunit.vision.lbd
    public void K0(aed<? super U> aedVar) {
        if (ObservableScalarXMap.b(this.i, aedVar, this.f20563j)) {
            return;
        }
        this.i.subscribe(new MergeObserver(aedVar, this.f20563j, this.k, this.f20564l, this.m));
    }
}
