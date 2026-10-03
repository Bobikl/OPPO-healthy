package io.reactivex.rxjava3.internal.operators.mixed;

import com.oplus.aiunit.vision.as3;
import com.oplus.aiunit.vision.d08;
import com.oplus.aiunit.vision.ds3;
import com.oplus.aiunit.vision.f4h;
import com.oplus.aiunit.vision.hu6;
import io.reactivex.rxjava3.disposables.a;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.util.AtomicThrowable;
import io.reactivex.rxjava3.internal.util.ErrorMode;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
final class ObservableConcatMapCompletable$ConcatMapCompletableObserver<T> extends ConcatMapXMainObserver<T> {
    private static final long serialVersionUID = 3610901111000061034L;
    volatile boolean active;
    final as3 downstream;
    final ConcatMapInnerObserver inner;
    final d08<? super T, ? extends ds3> mapper;

    public static final class ConcatMapInnerObserver extends AtomicReference<a> implements as3 {
        private static final long serialVersionUID = 5638352172918776687L;
        final ObservableConcatMapCompletable$ConcatMapCompletableObserver<?> parent;

        public ConcatMapInnerObserver(ObservableConcatMapCompletable$ConcatMapCompletableObserver<?> observableConcatMapCompletable$ConcatMapCompletableObserver) {
            this.parent = observableConcatMapCompletable$ConcatMapCompletableObserver;
        }

        public void dispose() {
            DisposableHelper.dispose(this);
        }

        @Override // com.oplus.aiunit.vision.as3
        public void onComplete() {
            this.parent.innerComplete();
        }

        @Override // com.oplus.aiunit.vision.as3
        public void onError(Throwable th) {
            this.parent.innerError(th);
        }

        @Override // com.oplus.aiunit.vision.as3
        public void onSubscribe(a aVar) {
            DisposableHelper.replace(this, aVar);
        }
    }

    public ObservableConcatMapCompletable$ConcatMapCompletableObserver(as3 as3Var, d08<? super T, ? extends ds3> d08Var, ErrorMode errorMode, int i) {
        super(i, errorMode);
        this.downstream = as3Var;
        this.mapper = d08Var;
        this.inner = new ConcatMapInnerObserver(this);
    }

    @Override // io.reactivex.rxjava3.internal.operators.mixed.ConcatMapXMainObserver
    public void disposeInner() {
        this.inner.dispose();
    }

    @Override // io.reactivex.rxjava3.internal.operators.mixed.ConcatMapXMainObserver
    public void drain() {
        ds3 ds3Var;
        boolean z;
        if (getAndIncrement() != 0) {
            return;
        }
        AtomicThrowable atomicThrowable = this.errors;
        ErrorMode errorMode = this.errorMode;
        f4h<T> f4hVar = this.queue;
        while (!this.disposed) {
            if (atomicThrowable.get() != null && (errorMode == ErrorMode.IMMEDIATE || (errorMode == ErrorMode.BOUNDARY && !this.active))) {
                this.disposed = true;
                f4hVar.clear();
                atomicThrowable.tryTerminateConsumer(this.downstream);
                return;
            }
            if (!this.active) {
                boolean z2 = this.done;
                try {
                    T tPoll = f4hVar.poll();
                    if (tPoll != null) {
                        ds3 ds3VarApply = this.mapper.apply(tPoll);
                        Objects.requireNonNull(ds3VarApply, "The mapper returned a null CompletableSource");
                        ds3Var = ds3VarApply;
                        z = false;
                    } else {
                        ds3Var = null;
                        z = true;
                    }
                    if (z2 && z) {
                        this.disposed = true;
                        atomicThrowable.tryTerminateConsumer(this.downstream);
                        return;
                    } else if (!z) {
                        this.active = true;
                        ds3Var.a(this.inner);
                    }
                } catch (Throwable th) {
                    hu6.b(th);
                    this.disposed = true;
                    f4hVar.clear();
                    this.upstream.dispose();
                    atomicThrowable.tryAddThrowableOrReport(th);
                    atomicThrowable.tryTerminateConsumer(this.downstream);
                    return;
                }
            }
            if (decrementAndGet() == 0) {
                return;
            }
        }
        f4hVar.clear();
    }

    public void innerComplete() {
        this.active = false;
        drain();
    }

    public void innerError(Throwable th) {
        if (this.errors.tryAddThrowableOrReport(th)) {
            if (this.errorMode != ErrorMode.END) {
                this.upstream.dispose();
            }
            this.active = false;
            drain();
        }
    }

    @Override // io.reactivex.rxjava3.internal.operators.mixed.ConcatMapXMainObserver
    public void onSubscribeDownstream() {
        this.downstream.onSubscribe(this);
    }
}
