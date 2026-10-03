package io.reactivex.internal.operators.mixed;

import com.oplus.aiunit.vision.abd;
import com.oplus.aiunit.vision.c3j;
import com.oplus.aiunit.vision.cv5;
import com.oplus.aiunit.vision.fue;
import com.oplus.aiunit.vision.h4g;
import com.oplus.aiunit.vision.iu6;
import com.oplus.aiunit.vision.j08;
import com.oplus.aiunit.vision.m6h;
import com.oplus.aiunit.vision.t6h;
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
final class FlowableSwitchMapSingle$SwitchMapSingleSubscriber<T, R> extends AtomicInteger implements wu7<T>, c3j {
    static final SwitchMapSingleObserver<Object> INNER_DISPOSED = new SwitchMapSingleObserver<>(null);
    private static final long serialVersionUID = -5402190102429853762L;
    volatile boolean cancelled;
    final boolean delayErrors;
    volatile boolean done;
    final v2j<? super R> downstream;
    long emitted;
    final j08<? super T, ? extends t6h<? extends R>> mapper;
    c3j upstream;
    final AtomicThrowable errors = new AtomicThrowable();
    final AtomicLong requested = new AtomicLong();
    final AtomicReference<SwitchMapSingleObserver<R>> inner = new AtomicReference<>();

    public static final class SwitchMapSingleObserver<R> extends AtomicReference<cv5> implements m6h<R> {
        private static final long serialVersionUID = 8042919737683345351L;
        volatile R item;
        final FlowableSwitchMapSingle$SwitchMapSingleSubscriber<?, R> parent;

        public SwitchMapSingleObserver(FlowableSwitchMapSingle$SwitchMapSingleSubscriber<?, R> flowableSwitchMapSingle$SwitchMapSingleSubscriber) {
            this.parent = flowableSwitchMapSingle$SwitchMapSingleSubscriber;
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

    public FlowableSwitchMapSingle$SwitchMapSingleSubscriber(v2j<? super R> v2jVar, j08<? super T, ? extends t6h<? extends R>> j08Var, boolean z) {
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
        v2j<? super R> v2jVar = this.downstream;
        AtomicThrowable atomicThrowable = this.errors;
        AtomicReference<SwitchMapSingleObserver<R>> atomicReference = this.inner;
        AtomicLong atomicLong = this.requested;
        long j2 = this.emitted;
        int iAddAndGet = 1;
        while (!this.cancelled) {
            if (atomicThrowable.get() != null && !this.delayErrors) {
                v2jVar.onError(atomicThrowable.terminate());
                return;
            }
            boolean z = this.done;
            SwitchMapSingleObserver<R> switchMapSingleObserver = atomicReference.get();
            boolean z2 = switchMapSingleObserver == null;
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
            if (z2 || switchMapSingleObserver.item == null || j2 == atomicLong.get()) {
                this.emitted = j2;
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            } else {
                fue.a(atomicReference, switchMapSingleObserver, null);
                v2jVar.onNext(switchMapSingleObserver.item);
                j2++;
            }
        }
    }

    public void innerError(SwitchMapSingleObserver<R> switchMapSingleObserver, Throwable th) {
        if (!fue.a(this.inner, switchMapSingleObserver, null) || !this.errors.addThrowable(th)) {
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
            this.upstream.cancel();
            this.inner.getAndSet((SwitchMapSingleObserver<R>) INNER_DISPOSED);
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
