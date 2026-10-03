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
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
final class ObservableConcatMap$SourceObserver<T, U> extends AtomicInteger implements bed<T>, cv5 {
    private static final long serialVersionUID = 8828587559905699186L;
    volatile boolean active;
    final int bufferSize;
    volatile boolean disposed;
    volatile boolean done;
    final bed<? super U> downstream;
    int fusionMode;
    final InnerObserver<U> inner;
    final j08<? super T, ? extends kdd<? extends U>> mapper;
    g4h<T> queue;
    cv5 upstream;

    public static final class InnerObserver<U> extends AtomicReference<cv5> implements bed<U> {
        private static final long serialVersionUID = -7449079488798789337L;
        final bed<? super U> downstream;
        final ObservableConcatMap$SourceObserver<?, ?> parent;

        public InnerObserver(bed<? super U> bedVar, ObservableConcatMap$SourceObserver<?, ?> observableConcatMap$SourceObserver) {
            this.downstream = bedVar;
            this.parent = observableConcatMap$SourceObserver;
        }

        public void dispose() {
            DisposableHelper.dispose(this);
        }

        @Override // com.oplus.aiunit.vision.bed
        public void onComplete() {
            this.parent.innerComplete();
        }

        @Override // com.oplus.aiunit.vision.bed
        public void onError(Throwable th) {
            this.parent.dispose();
            this.downstream.onError(th);
        }

        @Override // com.oplus.aiunit.vision.bed
        public void onNext(U u) {
            this.downstream.onNext(u);
        }

        @Override // com.oplus.aiunit.vision.bed
        public void onSubscribe(cv5 cv5Var) {
            DisposableHelper.replace(this, cv5Var);
        }
    }

    public ObservableConcatMap$SourceObserver(bed<? super U> bedVar, j08<? super T, ? extends kdd<? extends U>> j08Var, int i) {
        this.downstream = bedVar;
        this.mapper = j08Var;
        this.bufferSize = i;
        this.inner = new InnerObserver<>(bedVar, this);
    }

    @Override // com.oplus.aiunit.vision.cv5
    public void dispose() {
        this.disposed = true;
        this.inner.dispose();
        this.upstream.dispose();
        if (getAndIncrement() == 0) {
            this.queue.clear();
        }
    }

    public void drain() {
        if (getAndIncrement() != 0) {
            return;
        }
        while (!this.disposed) {
            if (!this.active) {
                boolean z = this.done;
                try {
                    T tPoll = this.queue.poll();
                    boolean z2 = tPoll == null;
                    if (z && z2) {
                        this.disposed = true;
                        this.downstream.onComplete();
                        return;
                    } else if (!z2) {
                        try {
                            kdd kddVar = (kdd) abd.d(this.mapper.apply(tPoll), "The mapper returned a null ObservableSource");
                            this.active = true;
                            kddVar.subscribe(this.inner);
                        } catch (Throwable th) {
                            iu6.b(th);
                            dispose();
                            this.queue.clear();
                            this.downstream.onError(th);
                            return;
                        }
                    }
                } catch (Throwable th2) {
                    iu6.b(th2);
                    dispose();
                    this.queue.clear();
                    this.downstream.onError(th2);
                    return;
                }
            }
            if (decrementAndGet() == 0) {
                return;
            }
        }
        this.queue.clear();
    }

    public void innerComplete() {
        this.active = false;
        drain();
    }

    @Override // com.oplus.aiunit.vision.cv5
    public boolean isDisposed() {
        return this.disposed;
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
            return;
        }
        this.done = true;
        dispose();
        this.downstream.onError(th);
    }

    @Override // com.oplus.aiunit.vision.bed
    public void onNext(T t) {
        if (this.done) {
            return;
        }
        if (this.fusionMode == 0) {
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
                    this.fusionMode = iRequestFusion;
                    this.queue = b7fVar;
                    this.done = true;
                    this.downstream.onSubscribe(this);
                    drain();
                    return;
                }
                if (iRequestFusion == 2) {
                    this.fusionMode = iRequestFusion;
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
