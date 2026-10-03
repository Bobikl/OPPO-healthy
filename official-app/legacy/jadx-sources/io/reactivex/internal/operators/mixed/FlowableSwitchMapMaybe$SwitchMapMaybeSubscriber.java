package io.reactivex.internal.operators.mixed;

import com.oplus.aiunit.vision.abd;
import com.oplus.aiunit.vision.c3j;
import com.oplus.aiunit.vision.cv5;
import com.oplus.aiunit.vision.fue;
import com.oplus.aiunit.vision.h4g;
import com.oplus.aiunit.vision.iu6;
import com.oplus.aiunit.vision.j08;
import com.oplus.aiunit.vision.mob;
import com.oplus.aiunit.vision.qob;
import com.oplus.aiunit.vision.v2j;
import com.oplus.aiunit.vision.wr0;
import com.oplus.aiunit.vision.wu7;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AtomicThrowable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
final class FlowableSwitchMapMaybe$SwitchMapMaybeSubscriber<T, R> extends AtomicInteger implements wu7<T>, c3j {
    static final SwitchMapMaybeObserver<Object> INNER_DISPOSED = new SwitchMapMaybeObserver<>(null);
    private static final long serialVersionUID = -5402190102429853762L;
    volatile boolean cancelled;
    final boolean delayErrors;
    volatile boolean done;
    final v2j<? super R> downstream;
    long emitted;
    final j08<? super T, ? extends qob<? extends R>> mapper;
    c3j upstream;
    final AtomicThrowable errors = new AtomicThrowable();
    final AtomicLong requested = new AtomicLong();
    final AtomicReference<SwitchMapMaybeObserver<R>> inner = new AtomicReference<>();

    public static final class SwitchMapMaybeObserver<R> extends AtomicReference<cv5> implements mob<R> {
        private static final long serialVersionUID = 8042919737683345351L;
        volatile R item;
        final FlowableSwitchMapMaybe$SwitchMapMaybeSubscriber<?, R> parent;

        public SwitchMapMaybeObserver(FlowableSwitchMapMaybe$SwitchMapMaybeSubscriber<?, R> flowableSwitchMapMaybe$SwitchMapMaybeSubscriber) {
            this.parent = flowableSwitchMapMaybe$SwitchMapMaybeSubscriber;
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

    public FlowableSwitchMapMaybe$SwitchMapMaybeSubscriber(v2j<? super R> v2jVar, j08<? super T, ? extends qob<? extends R>> j08Var, boolean z) {
        this.downstream = v2jVar;
        this.mapper = j08Var;
        this.delayErrors = z;
    }

    @Override // com.oplus.aiunit.vision.c3j
    public void cancel() {
        this.cancelled = true;
        this.upstream.cancel();
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
        v2j<? super R> v2jVar = this.downstream;
        AtomicThrowable atomicThrowable = this.errors;
        AtomicReference<SwitchMapMaybeObserver<R>> atomicReference = this.inner;
        AtomicLong atomicLong = this.requested;
        long j2 = this.emitted;
        int iAddAndGet = 1;
        while (!this.cancelled) {
            if (atomicThrowable.get() != null && !this.delayErrors) {
                v2jVar.onError(atomicThrowable.terminate());
                return;
            }
            boolean z = this.done;
            SwitchMapMaybeObserver<R> switchMapMaybeObserver = atomicReference.get();
            boolean z2 = switchMapMaybeObserver == null;
            if (z && z2) {
                Throwable thTerminate = atomicThrowable.terminate();
                if (thTerminate != null) {
                    v2jVar.onError(thTerminate);
                    return;
                } else {
                    v2jVar.onComplete();
                    return;
                }
            }
            if (z2 || switchMapMaybeObserver.item == null || j2 == atomicLong.get()) {
                this.emitted = j2;
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            } else {
                fue.a(atomicReference, switchMapMaybeObserver, null);
                v2jVar.onNext(switchMapMaybeObserver.item);
                j2++;
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
            this.upstream.cancel();
            disposeInner();
        }
        drain();
    }

    @Override // com.oplus.aiunit.vision.v2j
    public void onComplete() {
        this.done = true;
        drain();
    }

    @Override // com.oplus.aiunit.vision.v2j
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

    @Override // com.oplus.aiunit.vision.v2j
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
            this.upstream.cancel();
            this.inner.getAndSet((SwitchMapMaybeObserver<R>) INNER_DISPOSED);
            onError(th);
        }
    }

    @Override // com.oplus.aiunit.vision.wu7, com.oplus.aiunit.vision.v2j
    public void onSubscribe(c3j c3jVar) {
        if (SubscriptionHelper.validate(this.upstream, c3jVar)) {
            this.upstream = c3jVar;
            this.downstream.onSubscribe(this);
            c3jVar.request(Long.MAX_VALUE);
        }
    }

    @Override // com.oplus.aiunit.vision.c3j
    public void request(long j2) {
        wr0.a(this.requested, j2);
        drain();
    }
}
