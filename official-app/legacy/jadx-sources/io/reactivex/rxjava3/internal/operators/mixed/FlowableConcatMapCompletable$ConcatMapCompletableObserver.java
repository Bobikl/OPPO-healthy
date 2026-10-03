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
final class FlowableConcatMapCompletable$ConcatMapCompletableObserver<T> extends ConcatMapXMainSubscriber<T> implements a {
    private static final long serialVersionUID = 3610901111000061034L;
    volatile boolean active;
    int consumed;
    final as3 downstream;
    final ConcatMapInnerObserver inner;
    final d08<? super T, ? extends ds3> mapper;

    public static final class ConcatMapInnerObserver extends AtomicReference<a> implements as3 {
        private static final long serialVersionUID = 5638352172918776687L;
        final FlowableConcatMapCompletable$ConcatMapCompletableObserver<?> parent;

        public ConcatMapInnerObserver(FlowableConcatMapCompletable$ConcatMapCompletableObserver<?> flowableConcatMapCompletable$ConcatMapCompletableObserver) {
            this.parent = flowableConcatMapCompletable$ConcatMapCompletableObserver;
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

    public FlowableConcatMapCompletable$ConcatMapCompletableObserver(as3 as3Var, d08<? super T, ? extends ds3> d08Var, ErrorMode errorMode, int i) {
        super(i, errorMode);
        this.downstream = as3Var;
        this.mapper = d08Var;
        this.inner = new ConcatMapInnerObserver(this);
    }

    @Override // io.reactivex.rxjava3.disposables.a
    public void dispose() {
        stop();
    }

    @Override // io.reactivex.rxjava3.internal.operators.mixed.ConcatMapXMainSubscriber
    public void disposeInner() {
        this.inner.dispose();
    }

    @Override // io.reactivex.rxjava3.internal.operators.mixed.ConcatMapXMainSubscriber
    public void drain() {
        if (getAndIncrement() != 0) {
            return;
        }
        ErrorMode errorMode = this.errorMode;
        f4h<T> f4hVar = this.queue;
        AtomicThrowable atomicThrowable = this.errors;
        boolean z = this.syncFused;
        while (!this.cancelled) {
            if (atomicThrowable.get() != null && (errorMode == ErrorMode.IMMEDIATE || (errorMode == ErrorMode.BOUNDARY && !this.active))) {
                f4hVar.clear();
                atomicThrowable.tryTerminateConsumer(this.downstream);
                return;
            }
            if (!this.active) {
                boolean z2 = this.done;
                try {
                    T tPoll = f4hVar.poll();
                    boolean z3 = tPoll == null;
                    if (z2 && z3) {
                        atomicThrowable.tryTerminateConsumer(this.downstream);
                        return;
                    }
                    if (!z3) {
                        int i = this.prefetch;
                        int i2 = i - (i >> 1);
                        if (!z) {
                            int i3 = this.consumed + 1;
                            if (i3 == i2) {
                                this.consumed = 0;
                                this.upstream.request(i2);
                            } else {
                                this.consumed = i3;
                            }
                        }
                        try {
                            ds3 ds3VarApply = this.mapper.apply(tPoll);
                            Objects.requireNonNull(ds3VarApply, "The mapper returned a null CompletableSource");
                            ds3 ds3Var = ds3VarApply;
                            this.active = true;
                            ds3Var.a(this.inner);
                        } catch (Throwable th) {
                            hu6.b(th);
                            f4hVar.clear();
                            this.upstream.cancel();
                            atomicThrowable.tryAddThrowableOrReport(th);
                            atomicThrowable.tryTerminateConsumer(this.downstream);
                            return;
                        }
                    }
                } catch (Throwable th2) {
                    hu6.b(th2);
                    this.upstream.cancel();
                    atomicThrowable.tryAddThrowableOrReport(th2);
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
            if (this.errorMode != ErrorMode.IMMEDIATE) {
                this.active = false;
                drain();
                return;
            }
            this.upstream.cancel();
            this.errors.tryTerminateConsumer(this.downstream);
            if (getAndIncrement() == 0) {
                this.queue.clear();
            }
        }
    }

    @Override // io.reactivex.rxjava3.disposables.a
    public boolean isDisposed() {
        return this.cancelled;
    }

    @Override // io.reactivex.rxjava3.internal.operators.mixed.ConcatMapXMainSubscriber
    public void onSubscribeDownstream() {
        this.downstream.onSubscribe(this);
    }
}
