package io.reactivex.rxjava3.internal.operators.mixed;

import com.oplus.aiunit.vision.aed;
import com.oplus.aiunit.vision.d08;
import com.oplus.aiunit.vision.f4h;
import com.oplus.aiunit.vision.hu6;
import com.oplus.aiunit.vision.lob;
import com.oplus.aiunit.vision.pob;
import io.reactivex.rxjava3.disposables.a;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.util.AtomicThrowable;
import io.reactivex.rxjava3.internal.util.ErrorMode;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
final class ObservableConcatMapMaybe$ConcatMapMaybeMainObserver<T, R> extends ConcatMapXMainObserver<T> {
    static final int STATE_ACTIVE = 1;
    static final int STATE_INACTIVE = 0;
    static final int STATE_RESULT_VALUE = 2;
    private static final long serialVersionUID = -9140123220065488293L;
    final aed<? super R> downstream;
    final ConcatMapMaybeObserver<R> inner;
    R item;
    final d08<? super T, ? extends pob<? extends R>> mapper;
    volatile int state;

    public static final class ConcatMapMaybeObserver<R> extends AtomicReference<a> implements lob<R> {
        private static final long serialVersionUID = -3051469169682093892L;
        final ObservableConcatMapMaybe$ConcatMapMaybeMainObserver<?, R> parent;

        public ConcatMapMaybeObserver(ObservableConcatMapMaybe$ConcatMapMaybeMainObserver<?, R> observableConcatMapMaybe$ConcatMapMaybeMainObserver) {
            this.parent = observableConcatMapMaybe$ConcatMapMaybeMainObserver;
        }

        public void dispose() {
            DisposableHelper.dispose(this);
        }

        @Override // com.oplus.aiunit.vision.lob
        public void onComplete() {
            this.parent.innerComplete();
        }

        @Override // com.oplus.aiunit.vision.lob
        public void onError(Throwable th) {
            this.parent.innerError(th);
        }

        @Override // com.oplus.aiunit.vision.lob
        public void onSubscribe(a aVar) {
            DisposableHelper.replace(this, aVar);
        }

        @Override // com.oplus.aiunit.vision.lob, com.oplus.aiunit.vision.l6h
        public void onSuccess(R r) {
            this.parent.innerSuccess(r);
        }
    }

    public ObservableConcatMapMaybe$ConcatMapMaybeMainObserver(aed<? super R> aedVar, d08<? super T, ? extends pob<? extends R>> d08Var, int i, ErrorMode errorMode) {
        super(i, errorMode);
        this.downstream = aedVar;
        this.mapper = d08Var;
        this.inner = new ConcatMapMaybeObserver<>(this);
    }

    @Override // io.reactivex.rxjava3.internal.operators.mixed.ConcatMapXMainObserver
    public void clearValue() {
        this.item = null;
    }

    @Override // io.reactivex.rxjava3.internal.operators.mixed.ConcatMapXMainObserver
    public void disposeInner() {
        this.inner.dispose();
    }

    @Override // io.reactivex.rxjava3.internal.operators.mixed.ConcatMapXMainObserver
    public void drain() {
        if (getAndIncrement() != 0) {
            return;
        }
        aed<? super R> aedVar = this.downstream;
        ErrorMode errorMode = this.errorMode;
        f4h<T> f4hVar = this.queue;
        AtomicThrowable atomicThrowable = this.errors;
        int iAddAndGet = 1;
        while (true) {
            if (!this.disposed) {
                int i = this.state;
                if (atomicThrowable.get() != null && (errorMode == ErrorMode.IMMEDIATE || (errorMode == ErrorMode.BOUNDARY && i == 0))) {
                    break;
                }
                if (i == 0) {
                    boolean z = this.done;
                    try {
                        T tPoll = f4hVar.poll();
                        boolean z2 = tPoll == null;
                        if (z && z2) {
                            atomicThrowable.tryTerminateConsumer(aedVar);
                            return;
                        }
                        if (!z2) {
                            try {
                                pob<? extends R> pobVarApply = this.mapper.apply(tPoll);
                                Objects.requireNonNull(pobVarApply, "The mapper returned a null MaybeSource");
                                pob<? extends R> pobVar = pobVarApply;
                                this.state = 1;
                                pobVar.a(this.inner);
                            } catch (Throwable th) {
                                hu6.b(th);
                                this.upstream.dispose();
                                f4hVar.clear();
                                atomicThrowable.tryAddThrowableOrReport(th);
                                atomicThrowable.tryTerminateConsumer(aedVar);
                                return;
                            }
                        }
                    } catch (Throwable th2) {
                        hu6.b(th2);
                        this.disposed = true;
                        this.upstream.dispose();
                        atomicThrowable.tryAddThrowableOrReport(th2);
                        atomicThrowable.tryTerminateConsumer(aedVar);
                        return;
                    }
                } else if (i == 2) {
                    R r = this.item;
                    this.item = null;
                    aedVar.onNext(r);
                    this.state = 0;
                }
            } else {
                f4hVar.clear();
                this.item = null;
            }
            iAddAndGet = addAndGet(-iAddAndGet);
            if (iAddAndGet == 0) {
                return;
            }
        }
        f4hVar.clear();
        this.item = null;
        atomicThrowable.tryTerminateConsumer(aedVar);
    }

    public void innerComplete() {
        this.state = 0;
        drain();
    }

    public void innerError(Throwable th) {
        if (this.errors.tryAddThrowableOrReport(th)) {
            if (this.errorMode != ErrorMode.END) {
                this.upstream.dispose();
            }
            this.state = 0;
            drain();
        }
    }

    public void innerSuccess(R r) {
        this.item = r;
        this.state = 2;
        drain();
    }

    @Override // io.reactivex.rxjava3.internal.operators.mixed.ConcatMapXMainObserver
    public void onSubscribeDownstream() {
        this.downstream.onSubscribe(this);
    }
}
