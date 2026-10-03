package io.reactivex.internal.operators.mixed;

import com.oplus.aiunit.vision.abd;
import com.oplus.aiunit.vision.c3j;
import com.oplus.aiunit.vision.c4h;
import com.oplus.aiunit.vision.cv5;
import com.oplus.aiunit.vision.h4g;
import com.oplus.aiunit.vision.iu6;
import com.oplus.aiunit.vision.j08;
import com.oplus.aiunit.vision.m6h;
import com.oplus.aiunit.vision.t6h;
import com.oplus.aiunit.vision.v2j;
import com.oplus.aiunit.vision.wr0;
import com.oplus.aiunit.vision.wu7;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.ErrorMode;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
final class FlowableConcatMapSingle$ConcatMapSingleSubscriber<T, R> extends AtomicInteger implements wu7<T>, c3j {
    static final int STATE_ACTIVE = 1;
    static final int STATE_INACTIVE = 0;
    static final int STATE_RESULT_VALUE = 2;
    private static final long serialVersionUID = -9140123220065488293L;
    volatile boolean cancelled;
    int consumed;
    volatile boolean done;
    final v2j<? super R> downstream;
    long emitted;
    final ErrorMode errorMode;
    R item;
    final j08<? super T, ? extends t6h<? extends R>> mapper;
    final int prefetch;
    final c4h<T> queue;
    volatile int state;
    c3j upstream;
    final AtomicLong requested = new AtomicLong();
    final AtomicThrowable errors = new AtomicThrowable();
    final ConcatMapSingleObserver<R> inner = new ConcatMapSingleObserver<>(this);

    public static final class ConcatMapSingleObserver<R> extends AtomicReference<cv5> implements m6h<R> {
        private static final long serialVersionUID = -3051469169682093892L;
        final FlowableConcatMapSingle$ConcatMapSingleSubscriber<?, R> parent;

        public ConcatMapSingleObserver(FlowableConcatMapSingle$ConcatMapSingleSubscriber<?, R> flowableConcatMapSingle$ConcatMapSingleSubscriber) {
            this.parent = flowableConcatMapSingle$ConcatMapSingleSubscriber;
        }

        public void dispose() {
            DisposableHelper.dispose(this);
        }

        @Override // com.oplus.aiunit.vision.m6h
        public void onError(Throwable th) {
            this.parent.innerError(th);
        }

        @Override // com.oplus.aiunit.vision.m6h
        public void onSubscribe(cv5 cv5Var) {
            DisposableHelper.replace(this, cv5Var);
        }

        @Override // com.oplus.aiunit.vision.m6h
        public void onSuccess(R r) {
            this.parent.innerSuccess(r);
        }
    }

    public FlowableConcatMapSingle$ConcatMapSingleSubscriber(v2j<? super R> v2jVar, j08<? super T, ? extends t6h<? extends R>> j08Var, int i, ErrorMode errorMode) {
        this.downstream = v2jVar;
        this.mapper = j08Var;
        this.prefetch = i;
        this.errorMode = errorMode;
        this.queue = new SpscArrayQueue(i);
    }

    @Override // com.oplus.aiunit.vision.c3j
    public void cancel() {
        this.cancelled = true;
        this.upstream.cancel();
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
        v2j<? super R> v2jVar = this.downstream;
        ErrorMode errorMode = this.errorMode;
        c4h<T> c4hVar = this.queue;
        AtomicThrowable atomicThrowable = this.errors;
        AtomicLong atomicLong = this.requested;
        int i = this.prefetch;
        int i2 = i - (i >> 1);
        int iAddAndGet = 1;
        while (true) {
            if (!this.cancelled) {
                int i3 = this.state;
                if (atomicThrowable.get() != null && (errorMode == ErrorMode.IMMEDIATE || (errorMode == ErrorMode.BOUNDARY && i3 == 0))) {
                    break;
                }
                if (i3 == 0) {
                    boolean z = this.done;
                    T tPoll = c4hVar.poll();
                    boolean z2 = tPoll == null;
                    if (z && z2) {
                        Throwable thTerminate = atomicThrowable.terminate();
                        if (thTerminate == null) {
                            v2jVar.onComplete();
                            return;
                        } else {
                            v2jVar.onError(thTerminate);
                            return;
                        }
                    }
                    if (!z2) {
                        int i4 = this.consumed + 1;
                        if (i4 == i2) {
                            this.consumed = 0;
                            this.upstream.request(i2);
                        } else {
                            this.consumed = i4;
                        }
                        try {
                            t6h t6hVar = (t6h) abd.d(this.mapper.apply(tPoll), "The mapper returned a null SingleSource");
                            this.state = 1;
                            t6hVar.a(this.inner);
                        } catch (Throwable th) {
                            iu6.b(th);
                            this.upstream.cancel();
                            c4hVar.clear();
                            atomicThrowable.addThrowable(th);
                            v2jVar.onError(atomicThrowable.terminate());
                            return;
                        }
                    }
                } else if (i3 == 2) {
                    long j2 = this.emitted;
                    if (j2 != atomicLong.get()) {
                        R r = this.item;
                        this.item = null;
                        v2jVar.onNext(r);
                        this.emitted = j2 + 1;
                        this.state = 0;
                    }
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
        v2jVar.onError(atomicThrowable.terminate());
    }

    public void innerError(Throwable th) {
        if (!this.errors.addThrowable(th)) {
            h4g.r(th);
            return;
        }
        if (this.errorMode != ErrorMode.END) {
            this.upstream.cancel();
        }
        this.state = 0;
        drain();
    }

    public void innerSuccess(R r) {
        this.item = r;
        this.state = 2;
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
        if (this.errorMode == ErrorMode.IMMEDIATE) {
            this.inner.dispose();
        }
        this.done = true;
        drain();
    }

    @Override // com.oplus.aiunit.vision.v2j
    public void onNext(T t) {
        if (this.queue.offer(t)) {
            drain();
        } else {
            this.upstream.cancel();
            onError(new MissingBackpressureException("queue full?!"));
        }
    }

    @Override // com.oplus.aiunit.vision.wu7, com.oplus.aiunit.vision.v2j
    public void onSubscribe(c3j c3jVar) {
        if (SubscriptionHelper.validate(this.upstream, c3jVar)) {
            this.upstream = c3jVar;
            this.downstream.onSubscribe(this);
            c3jVar.request(this.prefetch);
        }
    }

    @Override // com.oplus.aiunit.vision.c3j
    public void request(long j2) {
        wr0.a(this.requested, j2);
        drain();
    }
}
