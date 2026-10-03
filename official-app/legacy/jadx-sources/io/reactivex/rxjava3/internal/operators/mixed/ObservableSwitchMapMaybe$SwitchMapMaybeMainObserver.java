package io.reactivex.rxjava3.internal.operators.mixed;

import com.oplus.aiunit.vision.aed;
import com.oplus.aiunit.vision.d08;
import com.oplus.aiunit.vision.fue;
import com.oplus.aiunit.vision.g4g;
import com.oplus.aiunit.vision.hu6;
import com.oplus.aiunit.vision.lob;
import com.oplus.aiunit.vision.pob;
import io.reactivex.rxjava3.disposables.a;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.util.AtomicThrowable;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
final class ObservableSwitchMapMaybe$SwitchMapMaybeMainObserver<T, R> extends AtomicInteger implements aed<T>, a {
    static final SwitchMapMaybeObserver<Object> INNER_DISPOSED = new SwitchMapMaybeObserver<>(null);
    private static final long serialVersionUID = -5402190102429853762L;
    volatile boolean cancelled;
    final boolean delayErrors;
    volatile boolean done;
    final aed<? super R> downstream;
    final AtomicThrowable errors = new AtomicThrowable();
    final AtomicReference<SwitchMapMaybeObserver<R>> inner = new AtomicReference<>();
    final d08<? super T, ? extends pob<? extends R>> mapper;
    a upstream;

    public static final class SwitchMapMaybeObserver<R> extends AtomicReference<a> implements lob<R> {
        private static final long serialVersionUID = 8042919737683345351L;
        volatile R item;
        final ObservableSwitchMapMaybe$SwitchMapMaybeMainObserver<?, R> parent;

        public SwitchMapMaybeObserver(ObservableSwitchMapMaybe$SwitchMapMaybeMainObserver<?, R> observableSwitchMapMaybe$SwitchMapMaybeMainObserver) {
            this.parent = observableSwitchMapMaybe$SwitchMapMaybeMainObserver;
        }

        public void dispose() {
            DisposableHelper.dispose(this);
        }

        @Override // com.oplus.aiunit.vision.lob
        public void onComplete() {
            this.parent.innerComplete(this);
        }

        @Override // com.oplus.aiunit.vision.lob
        public void onError(Throwable th) {
            this.parent.innerError(this, th);
        }

        @Override // com.oplus.aiunit.vision.lob
        public void onSubscribe(a aVar) {
            DisposableHelper.setOnce(this, aVar);
        }

        @Override // com.oplus.aiunit.vision.lob, com.oplus.aiunit.vision.l6h
        public void onSuccess(R r) {
            this.item = r;
            this.parent.drain();
        }
    }

    public ObservableSwitchMapMaybe$SwitchMapMaybeMainObserver(aed<? super R> aedVar, d08<? super T, ? extends pob<? extends R>> d08Var, boolean z) {
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
        AtomicReference<SwitchMapMaybeObserver<R>> atomicReference = this.inner;
        SwitchMapMaybeObserver<Object> switchMapMaybeObserver = INNER_DISPOSED;
        SwitchMapMaybeObserver<R> andSet = atomicReference.getAndSet((SwitchMapMaybeObserver<R>) switchMapMaybeObserver);
        if (andSet == null || andSet == switchMapMaybeObserver) {
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
        AtomicReference<SwitchMapMaybeObserver<R>> atomicReference = this.inner;
        int iAddAndGet = 1;
        while (!this.cancelled) {
            if (atomicThrowable.get() != null && !this.delayErrors) {
                atomicThrowable.tryTerminateConsumer(aedVar);
                return;
            }
            boolean z = this.done;
            SwitchMapMaybeObserver<R> switchMapMaybeObserver = atomicReference.get();
            boolean z2 = switchMapMaybeObserver == null;
            if (z && z2) {
                atomicThrowable.tryTerminateConsumer(aedVar);
                return;
            } else if (z2 || switchMapMaybeObserver.item == null) {
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            } else {
                fue.a(atomicReference, switchMapMaybeObserver, null);
                aedVar.onNext(switchMapMaybeObserver.item);
            }
        }
    }

    public void innerComplete(SwitchMapMaybeObserver<R> switchMapMaybeObserver) {
        if (fue.a(this.inner, switchMapMaybeObserver, null)) {
            drain();
        }
    }

    public void innerError(SwitchMapMaybeObserver<R> switchMapMaybeObserver, Throwable th) {
        if (!fue.a(this.inner, switchMapMaybeObserver, null)) {
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
        SwitchMapMaybeObserver<R> switchMapMaybeObserver;
        SwitchMapMaybeObserver<R> switchMapMaybeObserver2 = this.inner.get();
        if (switchMapMaybeObserver2 != null) {
            switchMapMaybeObserver2.dispose();
        }
        try {
            pob<? extends R> pobVarApply = this.mapper.apply(t);
            Objects.requireNonNull(pobVarApply, "The mapper returned a null MaybeSource");
            pob<? extends R> pobVar = pobVarApply;
            SwitchMapMaybeObserver switchMapMaybeObserver3 = new SwitchMapMaybeObserver(this);
            do {
                switchMapMaybeObserver = this.inner.get();
                if (switchMapMaybeObserver == INNER_DISPOSED) {
                    return;
                }
            } while (!fue.a(this.inner, switchMapMaybeObserver, switchMapMaybeObserver3));
            pobVar.a(switchMapMaybeObserver3);
        } catch (Throwable th) {
            hu6.b(th);
            this.upstream.dispose();
            this.inner.getAndSet((SwitchMapMaybeObserver<R>) INNER_DISPOSED);
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
