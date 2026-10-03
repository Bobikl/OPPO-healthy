package io.reactivex.rxjava3.internal.operators.mixed;

import com.oplus.aiunit.vision.c3j;
import com.oplus.aiunit.vision.d08;
import com.oplus.aiunit.vision.f4h;
import com.oplus.aiunit.vision.hu6;
import com.oplus.aiunit.vision.l6h;
import com.oplus.aiunit.vision.s6h;
import com.oplus.aiunit.vision.v2j;
import com.oplus.aiunit.vision.vr0;
import io.reactivex.rxjava3.disposables.a;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.util.AtomicThrowable;
import io.reactivex.rxjava3.internal.util.ErrorMode;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
final class FlowableConcatMapSingle$ConcatMapSingleSubscriber<T, R> extends ConcatMapXMainSubscriber<T> implements c3j {
    static final int STATE_ACTIVE = 1;
    static final int STATE_INACTIVE = 0;
    static final int STATE_RESULT_VALUE = 2;
    private static final long serialVersionUID = -9140123220065488293L;
    int consumed;
    final v2j<? super R> downstream;
    long emitted;
    final ConcatMapSingleObserver<R> inner;
    R item;
    final d08<? super T, ? extends s6h<? extends R>> mapper;
    final AtomicLong requested;
    volatile int state;

    public static final class ConcatMapSingleObserver<R> extends AtomicReference<a> implements l6h<R> {
        private static final long serialVersionUID = -3051469169682093892L;
        final FlowableConcatMapSingle$ConcatMapSingleSubscriber<?, R> parent;

        public ConcatMapSingleObserver(FlowableConcatMapSingle$ConcatMapSingleSubscriber<?, R> flowableConcatMapSingle$ConcatMapSingleSubscriber) {
            this.parent = flowableConcatMapSingle$ConcatMapSingleSubscriber;
        }

        public void dispose() {
            DisposableHelper.dispose(this);
        }

        @Override // com.oplus.aiunit.vision.l6h
        public void onError(Throwable th) {
            this.parent.innerError(th);
        }

        @Override // com.oplus.aiunit.vision.l6h
        public void onSubscribe(a aVar) {
            DisposableHelper.replace(this, aVar);
        }

        @Override // com.oplus.aiunit.vision.l6h
        public void onSuccess(R r) {
            this.parent.innerSuccess(r);
        }
    }

    public FlowableConcatMapSingle$ConcatMapSingleSubscriber(v2j<? super R> v2jVar, d08<? super T, ? extends s6h<? extends R>> d08Var, int i, ErrorMode errorMode) {
        super(i, errorMode);
        this.downstream = v2jVar;
        this.mapper = d08Var;
        this.requested = new AtomicLong();
        this.inner = new ConcatMapSingleObserver<>(this);
    }

    @Override // com.oplus.aiunit.vision.c3j
    public void cancel() {
        stop();
    }

    @Override // io.reactivex.rxjava3.internal.operators.mixed.ConcatMapXMainSubscriber
    public void clearValue() {
        this.item = null;
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
        v2j<? super R> v2jVar = this.downstream;
        ErrorMode errorMode = this.errorMode;
        f4h<T> f4hVar = this.queue;
        AtomicThrowable atomicThrowable = this.errors;
        AtomicLong atomicLong = this.requested;
        int i = this.prefetch;
        int i2 = i - (i >> 1);
        boolean z = this.syncFused;
        int iAddAndGet = 1;
        while (true) {
            if (!this.cancelled) {
                int i3 = this.state;
                if (atomicThrowable.get() != null && (errorMode == ErrorMode.IMMEDIATE || (errorMode == ErrorMode.BOUNDARY && i3 == 0))) {
                    break;
                }
                if (i3 == 0) {
                    boolean z2 = this.done;
                    try {
                        T tPoll = f4hVar.poll();
                        boolean z3 = tPoll == null;
                        if (z2 && z3) {
                            atomicThrowable.tryTerminateConsumer(v2jVar);
                            return;
                        }
                        if (!z3) {
                            if (!z) {
                                int i4 = this.consumed + 1;
                                if (i4 == i2) {
                                    this.consumed = 0;
                                    this.upstream.request(i2);
                                } else {
                                    this.consumed = i4;
                                }
                            }
                            try {
                                s6h<? extends R> s6hVarApply = this.mapper.apply(tPoll);
                                Objects.requireNonNull(s6hVarApply, "The mapper returned a null SingleSource");
                                s6h<? extends R> s6hVar = s6hVarApply;
                                this.state = 1;
                                s6hVar.b(this.inner);
                            } catch (Throwable th) {
                                hu6.b(th);
                                this.upstream.cancel();
                                f4hVar.clear();
                                atomicThrowable.tryAddThrowableOrReport(th);
                                atomicThrowable.tryTerminateConsumer(v2jVar);
                                return;
                            }
                        }
                    } catch (Throwable th2) {
                        hu6.b(th2);
                        this.upstream.cancel();
                        atomicThrowable.tryAddThrowableOrReport(th2);
                        atomicThrowable.tryTerminateConsumer(v2jVar);
                        return;
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
        atomicThrowable.tryTerminateConsumer(v2jVar);
    }

    public void innerError(Throwable th) {
        if (this.errors.tryAddThrowableOrReport(th)) {
            if (this.errorMode != ErrorMode.END) {
                this.upstream.cancel();
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

    @Override // io.reactivex.rxjava3.internal.operators.mixed.ConcatMapXMainSubscriber
    public void onSubscribeDownstream() {
        this.downstream.onSubscribe(this);
    }

    @Override // com.oplus.aiunit.vision.c3j
    public void request(long j2) {
        vr0.a(this.requested, j2);
        drain();
    }
}
