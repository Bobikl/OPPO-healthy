package io.reactivex.rxjava3.internal.operators.mixed;

import com.oplus.aiunit.vision.aed;
import com.oplus.aiunit.vision.d08;
import com.oplus.aiunit.vision.fue;
import com.oplus.aiunit.vision.g4g;
import com.oplus.aiunit.vision.hu6;
import com.oplus.aiunit.vision.l6h;
import com.oplus.aiunit.vision.s6h;
import io.reactivex.rxjava3.disposables.a;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.util.AtomicThrowable;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
final class ObservableSwitchMapSingle$SwitchMapSingleMainObserver<T, R> extends AtomicInteger implements aed<T>, a {
    static final SwitchMapSingleObserver<Object> INNER_DISPOSED = new SwitchMapSingleObserver<>(null);
    private static final long serialVersionUID = -5402190102429853762L;
    volatile boolean cancelled;
    final boolean delayErrors;
    volatile boolean done;
    final aed<? super R> downstream;
    final AtomicThrowable errors = new AtomicThrowable();
    final AtomicReference<SwitchMapSingleObserver<R>> inner = new AtomicReference<>();
    final d08<? super T, ? extends s6h<? extends R>> mapper;
    a upstream;

    public static final class SwitchMapSingleObserver<R> extends AtomicReference<a> implements l6h<R> {
        private static final long serialVersionUID = 8042919737683345351L;
        volatile R item;
        final ObservableSwitchMapSingle$SwitchMapSingleMainObserver<?, R> parent;

        public SwitchMapSingleObserver(ObservableSwitchMapSingle$SwitchMapSingleMainObserver<?, R> observableSwitchMapSingle$SwitchMapSingleMainObserver) {
            this.parent = observableSwitchMapSingle$SwitchMapSingleMainObserver;
        }

        public void dispose() {
            DisposableHelper.dispose(this);
        }

        @Override // com.oplus.aiunit.vision.l6h
        public void onError(Throwable th) {
            this.parent.innerError(this, th);
        }

        @Override // com.oplus.aiunit.vision.l6h
        public void onSubscribe(a aVar) {
            DisposableHelper.setOnce(this, aVar);
        }

        @Override // com.oplus.aiunit.vision.l6h
        public void onSuccess(R r) {
            this.item = r;
            this.parent.drain();
        }
    }

    public ObservableSwitchMapSingle$SwitchMapSingleMainObserver(aed<? super R> aedVar, d08<? super T, ? extends s6h<? extends R>> d08Var, boolean z) {
        this.downstream = aedVar;
        this.mapper = d08Var;
        this.delayErrors = z;
    }

    @Override // io.reactivex.rxjava3.disposables.a
    public void dispose() {
        this.cancelled = true;
        this.upstream.dispose();
        disposeInner();
        this.errors.tryTerminateAndReport();
    }

    public void disposeInner() {
        AtomicReference<SwitchMapSingleObserver<R>> atomicReference = this.inner;
        SwitchMapSingleObserver<Object> switchMapSingleObserver = INNER_DISPOSED;
        SwitchMapSingleObserver<R> andSet = atomicReference.getAndSet((SwitchMapSingleObserver<R>) switchMapSingleObserver);
        if (andSet == null || andSet == switchMapSingleObserver) {
            return;
        }
        andSet.dispose();
    }

    public void drain() {
        if (getAndIncrement() != 0) {
            return;
        }
        aed<? super R> aedVar = this.downstream;
        AtomicThrowable atomicThrowable = this.errors;
        AtomicReference<SwitchMapSingleObserver<R>> atomicReference = this.inner;
        int iAddAndGet = 1;
        while (!this.cancelled) {
            if (atomicThrowable.get() != null && !this.delayErrors) {
                atomicThrowable.tryTerminateConsumer(aedVar);
                return;
            }
            boolean z = this.done;
            SwitchMapSingleObserver<R> switchMapSingleObserver = atomicReference.get();
            boolean z2 = switchMapSingleObserver == null;
            if (z && z2) {
                atomicThrowable.tryTerminateConsumer(aedVar);
                return;
            } else if (z2 || switchMapSingleObserver.item == null) {
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            } else {
                fue.a(atomicReference, switchMapSingleObserver, null);
                aedVar.onNext(switchMapSingleObserver.item);
            }
        }
    }

    public void innerError(SwitchMapSingleObserver<R> switchMapSingleObserver, Throwable th) {
        if (!fue.a(this.inner, switchMapSingleObserver, null)) {
            g4g.u(th);
        } else if (this.errors.tryAddThrowableOrReport(th)) {
            if (!this.delayErrors) {
                this.upstream.dispose();
                disposeInner();
            }
            drain();
        }
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
            if (!this.delayErrors) {
                disposeInner();
            }
            this.done = true;
            drain();
        }
    }

    @Override // com.oplus.aiunit.vision.aed
    public void onNext(T t) {
        SwitchMapSingleObserver<R> switchMapSingleObserver;
        SwitchMapSingleObserver<R> switchMapSingleObserver2 = this.inner.get();
        if (switchMapSingleObserver2 != null) {
            switchMapSingleObserver2.dispose();
        }
        try {
            s6h<? extends R> s6hVarApply = this.mapper.apply(t);
            Objects.requireNonNull(s6hVarApply, "The mapper returned a null SingleSource");
            s6h<? extends R> s6hVar = s6hVarApply;
            SwitchMapSingleObserver switchMapSingleObserver3 = new SwitchMapSingleObserver(this);
            do {
                switchMapSingleObserver = this.inner.get();
                if (switchMapSingleObserver == INNER_DISPOSED) {
                    return;
                }
            } while (!fue.a(this.inner, switchMapSingleObserver, switchMapSingleObserver3));
            s6hVar.b(switchMapSingleObserver3);
        } catch (Throwable th) {
            hu6.b(th);
            this.upstream.dispose();
            this.inner.getAndSet((SwitchMapSingleObserver<R>) INNER_DISPOSED);
            onError(th);
        }
    }

    @Override // com.oplus.aiunit.vision.aed
    public void onSubscribe(a aVar) {
        if (DisposableHelper.validate(this.upstream, aVar)) {
            this.upstream = aVar;
            this.downstream.onSubscribe(this);
        }
    }
}
