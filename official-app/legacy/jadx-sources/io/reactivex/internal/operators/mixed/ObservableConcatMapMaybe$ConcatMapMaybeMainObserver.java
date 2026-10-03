package io.reactivex.internal.operators.mixed;

import com.oplus.aiunit.vision.abd;
import com.oplus.aiunit.vision.bed;
import com.oplus.aiunit.vision.c4h;
import com.oplus.aiunit.vision.cv5;
import com.oplus.aiunit.vision.h4g;
import com.oplus.aiunit.vision.iu6;
import com.oplus.aiunit.vision.j08;
import com.oplus.aiunit.vision.mob;
import com.oplus.aiunit.vision.qob;
import com.oplus.aiunit.vision.yki;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.ErrorMode;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
final class ObservableConcatMapMaybe$ConcatMapMaybeMainObserver<T, R> extends AtomicInteger implements bed<T>, cv5 {
    static final int STATE_ACTIVE = 1;
    static final int STATE_INACTIVE = 0;
    static final int STATE_RESULT_VALUE = 2;
    private static final long serialVersionUID = -9140123220065488293L;
    volatile boolean cancelled;
    volatile boolean done;
    final bed<? super R> downstream;
    final ErrorMode errorMode;
    final AtomicThrowable errors = new AtomicThrowable();
    final ConcatMapMaybeObserver<R> inner = new ConcatMapMaybeObserver<>(this);
    R item;
    final j08<? super T, ? extends qob<? extends R>> mapper;
    final c4h<T> queue;
    volatile int state;
    cv5 upstream;

    public static final class ConcatMapMaybeObserver<R> extends AtomicReference<cv5> implements mob<R> {
        private static final long serialVersionUID = -3051469169682093892L;
        final ObservableConcatMapMaybe$ConcatMapMaybeMainObserver<?, R> parent;

        public ConcatMapMaybeObserver(ObservableConcatMapMaybe$ConcatMapMaybeMainObserver<?, R> observableConcatMapMaybe$ConcatMapMaybeMainObserver) {
            this.parent = observableConcatMapMaybe$ConcatMapMaybeMainObserver;
        }

        public void dispose() {
            DisposableHelper.dispose(this);
        }

        @Override // com.oplus.aiunit.vision.mob
        public void onComplete() {
            this.parent.innerComplete();
        }

        @Override // com.oplus.aiunit.vision.mob
        public void onError(Throwable th) {
            this.parent.innerError(th);
        }

        @Override // com.oplus.aiunit.vision.mob
        public void onSubscribe(cv5 cv5Var) {
            DisposableHelper.replace(this, cv5Var);
        }

        @Override // com.oplus.aiunit.vision.mob
        public void onSuccess(R r) {
            this.parent.innerSuccess(r);
        }
    }

    public ObservableConcatMapMaybe$ConcatMapMaybeMainObserver(bed<? super R> bedVar, j08<? super T, ? extends qob<? extends R>> j08Var, int i, ErrorMode errorMode) {
        this.downstream = bedVar;
        this.mapper = j08Var;
        this.errorMode = errorMode;
        this.queue = new yki(i);
    }

    @Override // com.oplus.aiunit.vision.cv5
    public void dispose() {
        this.cancelled = true;
        this.upstream.dispose();
        this.inner.dispose();
        if (getAndIncrement() == 0) {
            this.queue.clear();
            this.item = null;
        }
    }

    public void drain() {
        if (getAndIncrement() != 0) {
            return;
        }
        bed<? super R> bedVar = this.downstream;
        ErrorMode errorMode = this.errorMode;
        c4h<T> c4hVar = this.queue;
        AtomicThrowable atomicThrowable = this.errors;
        int iAddAndGet = 1;
        while (true) {
            if (!this.cancelled) {
                int i = this.state;
                if (atomicThrowable.get() != null && (errorMode == ErrorMode.IMMEDIATE || (errorMode == ErrorMode.BOUNDARY && i == 0))) {
                    break;
                }
                if (i == 0) {
                    boolean z = this.done;
                    T tPoll = c4hVar.poll();
                    boolean z2 = tPoll == null;
                    if (z && z2) {
                        Throwable thTerminate = atomicThrowable.terminate();
                        if (thTerminate == null) {
                            bedVar.onComplete();
                            return;
                        } else {
                            bedVar.onError(thTerminate);
                            return;
                        }
                    }
                    if (!z2) {
                        try {
                            qob qobVar = (qob) abd.d(this.mapper.apply(tPoll), "The mapper returned a null MaybeSource");
                            this.state = 1;
                            qobVar.a(this.inner);
                        } catch (Throwable th) {
                            iu6.b(th);
                            this.upstream.dispose();
                            c4hVar.clear();
                            atomicThrowable.addThrowable(th);
                            bedVar.onError(atomicThrowable.terminate());
                            return;
                        }
                    }
                } else if (i == 2) {
                    R r = this.item;
                    this.item = null;
                    bedVar.onNext(r);
                    this.state = 0;
                }
            } else {
                c4hVar.clear();
                this.item = null;
            }
            iAddAndGet = addAndGet(-iAddAndGet);
            if (iAddAndGet == 0) {
                return;
            }
        }
        c4hVar.clear();
        this.item = null;
        bedVar.onError(atomicThrowable.terminate());
    }

    public void innerComplete() {
        this.state = 0;
        drain();
    }

    public void innerError(Throwable th) {
        if (!this.errors.addThrowable(th)) {
            h4g.r(th);
            return;
        }
        if (this.errorMode != ErrorMode.END) {
            this.upstream.dispose();
        }
        this.state = 0;
        drain();
    }

    public void innerSuccess(R r) {
        this.item = r;
        this.state = 2;
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
        if (!this.errors.addThrowable(th)) {
            h4g.r(th);
            return;
        }
        if (this.errorMode == ErrorMode.IMMEDIATE) {
            this.inner.dispose();
        }
        this.done = true;
        drain();
    }

    @Override // com.oplus.aiunit.vision.bed
    public void onNext(T t) {
        this.queue.offer(t);
        drain();
    }

    @Override // com.oplus.aiunit.vision.bed
    public void onSubscribe(cv5 cv5Var) {
        if (DisposableHelper.validate(this.upstream, cv5Var)) {
            this.upstream = cv5Var;
            this.downstream.onSubscribe(this);
        }
    }
}
