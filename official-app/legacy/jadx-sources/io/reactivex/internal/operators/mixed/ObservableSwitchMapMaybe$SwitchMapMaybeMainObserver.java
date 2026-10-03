package io.reactivex.internal.operators.mixed;

import com.oplus.aiunit.vision.abd;
import com.oplus.aiunit.vision.bed;
import com.oplus.aiunit.vision.cv5;
import com.oplus.aiunit.vision.fue;
import com.oplus.aiunit.vision.h4g;
import com.oplus.aiunit.vision.iu6;
import com.oplus.aiunit.vision.j08;
import com.oplus.aiunit.vision.mob;
import com.oplus.aiunit.vision.qob;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.util.AtomicThrowable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
final class ObservableSwitchMapMaybe$SwitchMapMaybeMainObserver<T, R> extends AtomicInteger implements bed<T>, cv5 {
    static final SwitchMapMaybeObserver<Object> INNER_DISPOSED = new SwitchMapMaybeObserver<>(null);
    private static final long serialVersionUID = -5402190102429853762L;
    volatile boolean cancelled;
    final boolean delayErrors;
    volatile boolean done;
    final bed<? super R> downstream;
    final AtomicThrowable errors = new AtomicThrowable();
    final AtomicReference<SwitchMapMaybeObserver<R>> inner = new AtomicReference<>();
    final j08<? super T, ? extends qob<? extends R>> mapper;
    cv5 upstream;

    public static final class SwitchMapMaybeObserver<R> extends AtomicReference<cv5> implements mob<R> {
        private static final long serialVersionUID = 8042919737683345351L;
        volatile R item;
        final ObservableSwitchMapMaybe$SwitchMapMaybeMainObserver<?, R> parent;

        public SwitchMapMaybeObserver(ObservableSwitchMapMaybe$SwitchMapMaybeMainObserver<?, R> observableSwitchMapMaybe$SwitchMapMaybeMainObserver) {
            this.parent = observableSwitchMapMaybe$SwitchMapMaybeMainObserver;
        }

        public void dispose() {
            DisposableHelper.dispose(this);
        }

        @Override // com.oplus.aiunit.vision.mob
        public void onComplete() {
            this.parent.innerComplete(this);
        }

        @Override // com.oplus.aiunit.vision.mob
        public void onError(Throwable th) {
            this.parent.innerError(this, th);
        }

        @Override // com.oplus.aiunit.vision.mob
        public void onSubscribe(cv5 cv5Var) {
            DisposableHelper.setOnce(this, cv5Var);
        }

        @Override // com.oplus.aiunit.vision.mob
        public void onSuccess(R r) {
            this.item = r;
            this.parent.drain();
        }
    }

    public ObservableSwitchMapMaybe$SwitchMapMaybeMainObserver(bed<? super R> bedVar, j08<? super T, ? extends qob<? extends R>> j08Var, boolean z) {
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
        bed<? super R> bedVar = this.downstream;
        AtomicThrowable atomicThrowable = this.errors;
        AtomicReference<SwitchMapMaybeObserver<R>> atomicReference = this.inner;
        int iAddAndGet = 1;
        while (!this.cancelled) {
            if (atomicThrowable.get() != null && !this.delayErrors) {
                bedVar.onError(atomicThrowable.terminate());
                return;
            }
            boolean z = this.done;
            SwitchMapMaybeObserver<R> switchMapMaybeObserver = atomicReference.get();
            boolean z2 = switchMapMaybeObserver == null;
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
            if (z2 || switchMapMaybeObserver.item == null) {
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            } else {
                fue.a(atomicReference, switchMapMaybeObserver, null);
                bedVar.onNext(switchMapMaybeObserver.item);
            }
        }
    }

    public void innerComplete(SwitchMapMaybeObserver<R> switchMapMaybeObserver) {
        if (fue.a(this.inner, switchMapMaybeObserver, null)) {
            drain();
        }
    }

    public void innerError(SwitchMapMaybeObserver<R> switchMapMaybeObserver, Throwable th) {
        if (!fue.a(this.inner, switchMapMaybeObserver, null) || !this.errors.addThrowable(th)) {
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
        SwitchMapMaybeObserver<R> switchMapMaybeObserver;
        SwitchMapMaybeObserver<R> switchMapMaybeObserver2 = this.inner.get();
        if (switchMapMaybeObserver2 != null) {
            switchMapMaybeObserver2.dispose();
        }
        try {
            qob qobVar = (qob) abd.d(this.mapper.apply(t), "The mapper returned a null MaybeSource");
            SwitchMapMaybeObserver switchMapMaybeObserver3 = new SwitchMapMaybeObserver(this);
            do {
                switchMapMaybeObserver = this.inner.get();
                if (switchMapMaybeObserver == INNER_DISPOSED) {
                    return;
                }
            } while (!fue.a(this.inner, switchMapMaybeObserver, switchMapMaybeObserver3));
            qobVar.a(switchMapMaybeObserver3);
        } catch (Throwable th) {
            iu6.b(th);
            this.upstream.dispose();
            this.inner.getAndSet((SwitchMapMaybeObserver<R>) INNER_DISPOSED);
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
