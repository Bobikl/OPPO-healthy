package io.reactivex.internal.operators.mixed;

import com.oplus.aiunit.vision.abd;
import com.oplus.aiunit.vision.bed;
import com.oplus.aiunit.vision.cv5;
import com.oplus.aiunit.vision.fue;
import com.oplus.aiunit.vision.h4g;
import com.oplus.aiunit.vision.iu6;
import com.oplus.aiunit.vision.j08;
import com.oplus.aiunit.vision.m6h;
import com.oplus.aiunit.vision.t6h;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.util.AtomicThrowable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
final class ObservableSwitchMapSingle$SwitchMapSingleMainObserver<T, R> extends AtomicInteger implements bed<T>, cv5 {
    static final SwitchMapSingleObserver<Object> INNER_DISPOSED = new SwitchMapSingleObserver<>(null);
    private static final long serialVersionUID = -5402190102429853762L;
    volatile boolean cancelled;
    final boolean delayErrors;
    volatile boolean done;
    final bed<? super R> downstream;
    final AtomicThrowable errors = new AtomicThrowable();
    final AtomicReference<SwitchMapSingleObserver<R>> inner = new AtomicReference<>();
    final j08<? super T, ? extends t6h<? extends R>> mapper;
    cv5 upstream;

    public static final class SwitchMapSingleObserver<R> extends AtomicReference<cv5> implements m6h<R> {
        private static final long serialVersionUID = 8042919737683345351L;
        volatile R item;
        final ObservableSwitchMapSingle$SwitchMapSingleMainObserver<?, R> parent;

        public SwitchMapSingleObserver(ObservableSwitchMapSingle$SwitchMapSingleMainObserver<?, R> observableSwitchMapSingle$SwitchMapSingleMainObserver) {
            this.parent = observableSwitchMapSingle$SwitchMapSingleMainObserver;
        }

        public void dispose() {
            DisposableHelper.dispose(this);
        }

        @Override // com.oplus.aiunit.vision.m6h
        public void onError(Throwable th) {
            this.parent.innerError(this, th);
        }

        @Override // com.oplus.aiunit.vision.m6h
        public void onSubscribe(cv5 cv5Var) {
            DisposableHelper.setOnce(this, cv5Var);
        }

        @Override // com.oplus.aiunit.vision.m6h
        public void onSuccess(R r) {
            this.item = r;
            this.parent.drain();
        }
    }

    public ObservableSwitchMapSingle$SwitchMapSingleMainObserver(bed<? super R> bedVar, j08<? super T, ? extends t6h<? extends R>> j08Var, boolean z) {
        this.downstream = bedVar;
        this.mapper = j08Var;
        this.delayErrors = z;
    }

    @Override // com.oplus.aiunit.vision.cv5
    public void dispose() {
        this.cancelled = true;
        this.upstream.dispose();
        disposeInner();
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
        bed<? super R> bedVar = this.downstream;
        AtomicThrowable atomicThrowable = this.errors;
        AtomicReference<SwitchMapSingleObserver<R>> atomicReference = this.inner;
        int iAddAndGet = 1;
        while (!this.cancelled) {
            if (atomicThrowable.get() != null && !this.delayErrors) {
                bedVar.onError(atomicThrowable.terminate());
                return;
            }
            boolean z = this.done;
            SwitchMapSingleObserver<R> switchMapSingleObserver = atomicReference.get();
            boolean z2 = switchMapSingleObserver == null;
            if (z && z2) {
                Throwable thTerminate = atomicThrowable.terminate();
                if (thTerminate != null) {
                    bedVar.onError(thTerminate);
                    return;
                } else {
                    bedVar.onComplete();
                    return;
                }
            }
            if (z2 || switchMapSingleObserver.item == null) {
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            } else {
                fue.a(atomicReference, switchMapSingleObserver, null);
                bedVar.onNext(switchMapSingleObserver.item);
            }
        }
    }

    public void innerError(SwitchMapSingleObserver<R> switchMapSingleObserver, Throwable th) {
        if (!fue.a(this.inner, switchMapSingleObserver, null) || !this.errors.addThrowable(th)) {
            h4g.r(th);
            return;
        }
        if (!this.delayErrors) {
            this.upstream.dispose();
            disposeInner();
        }
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
        if (!this.delayErrors) {
            disposeInner();
        }
        this.done = true;
        drain();
    }

    @Override // com.oplus.aiunit.vision.bed
    public void onNext(T t) {
        SwitchMapSingleObserver<R> switchMapSingleObserver;
        SwitchMapSingleObserver<R> switchMapSingleObserver2 = this.inner.get();
        if (switchMapSingleObserver2 != null) {
            switchMapSingleObserver2.dispose();
        }
        try {
            t6h t6hVar = (t6h) abd.d(this.mapper.apply(t), "The mapper returned a null SingleSource");
            SwitchMapSingleObserver switchMapSingleObserver3 = new SwitchMapSingleObserver(this);
            do {
                switchMapSingleObserver = this.inner.get();
                if (switchMapSingleObserver == INNER_DISPOSED) {
                    return;
                }
            } while (!fue.a(this.inner, switchMapSingleObserver, switchMapSingleObserver3));
            t6hVar.a(switchMapSingleObserver3);
        } catch (Throwable th) {
            iu6.b(th);
            this.upstream.dispose();
            this.inner.getAndSet((SwitchMapSingleObserver<R>) INNER_DISPOSED);
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
}
