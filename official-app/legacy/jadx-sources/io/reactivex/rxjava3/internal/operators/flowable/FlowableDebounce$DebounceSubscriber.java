package io.reactivex.rxjava3.internal.operators.flowable;

import com.oplus.aiunit.vision.c3j;
import com.oplus.aiunit.vision.d08;
import com.oplus.aiunit.vision.fue;
import com.oplus.aiunit.vision.g4g;
import com.oplus.aiunit.vision.hu6;
import com.oplus.aiunit.vision.k3f;
import com.oplus.aiunit.vision.mv5;
import com.oplus.aiunit.vision.v2j;
import com.oplus.aiunit.vision.vr0;
import com.oplus.aiunit.vision.vu7;
import io.reactivex.rxjava3.exceptions.MissingBackpressureException;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
final class FlowableDebounce$DebounceSubscriber<T, U> extends AtomicLong implements vu7<T>, c3j {
    private static final long serialVersionUID = 6725975399620862591L;
    final d08<? super T, ? extends k3f<U>> debounceSelector;
    final AtomicReference<io.reactivex.rxjava3.disposables.a> debouncer = new AtomicReference<>();
    boolean done;
    final v2j<? super T> downstream;
    volatile long index;
    c3j upstream;

    public static final class a<T, U> extends mv5<U> {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final FlowableDebounce$DebounceSubscriber<T, U> f20521j;
        public final long k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final T f20522l;
        public boolean m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final AtomicBoolean f20523n = new AtomicBoolean();

        public a(FlowableDebounce$DebounceSubscriber<T, U> flowableDebounce$DebounceSubscriber, long j2, T t) {
            this.f20521j = flowableDebounce$DebounceSubscriber;
            this.k = j2;
            this.f20522l = t;
        }

        public void c() {
            if (this.f20523n.compareAndSet(false, true)) {
                this.f20521j.emit(this.k, this.f20522l);
            }
        }

        @Override // com.oplus.aiunit.vision.v2j
        public void onComplete() {
            if (this.m) {
                return;
            }
            this.m = true;
            c();
        }

        @Override // com.oplus.aiunit.vision.v2j
        public void onError(Throwable th) {
            if (this.m) {
                g4g.u(th);
            } else {
                this.m = true;
                this.f20521j.onError(th);
            }
        }

        @Override // com.oplus.aiunit.vision.v2j
        public void onNext(U u) {
            if (this.m) {
                return;
            }
            this.m = true;
            a();
            c();
        }
    }

    public FlowableDebounce$DebounceSubscriber(v2j<? super T> v2jVar, d08<? super T, ? extends k3f<U>> d08Var) {
        this.downstream = v2jVar;
        this.debounceSelector = d08Var;
    }

    @Override // com.oplus.aiunit.vision.c3j
    public void cancel() {
        this.upstream.cancel();
        DisposableHelper.dispose(this.debouncer);
    }

    public void emit(long j2, T t) {
        if (j2 == this.index) {
            if (get() != 0) {
                this.downstream.onNext(t);
                vr0.e(this, 1L);
            } else {
                cancel();
                this.downstream.onError(new MissingBackpressureException("Could not deliver value due to lack of requests"));
            }
        }
    }

    @Override // com.oplus.aiunit.vision.v2j
    public void onComplete() {
        if (this.done) {
            return;
        }
        this.done = true;
        io.reactivex.rxjava3.disposables.a aVar = this.debouncer.get();
        if (DisposableHelper.isDisposed(aVar)) {
            return;
        }
        a aVar2 = (a) aVar;
        if (aVar2 != null) {
            aVar2.c();
        }
        DisposableHelper.dispose(this.debouncer);
        this.downstream.onComplete();
    }

    @Override // com.oplus.aiunit.vision.v2j
    public void onError(Throwable th) {
        DisposableHelper.dispose(this.debouncer);
        this.downstream.onError(th);
    }

    @Override // com.oplus.aiunit.vision.v2j
    public void onNext(T t) {
        if (this.done) {
            return;
        }
        long j2 = this.index + 1;
        this.index = j2;
        io.reactivex.rxjava3.disposables.a aVar = this.debouncer.get();
        if (aVar != null) {
            aVar.dispose();
        }
        try {
            k3f<U> k3fVarApply = this.debounceSelector.apply(t);
            Objects.requireNonNull(k3fVarApply, "The publisher supplied is null");
            k3f<U> k3fVar = k3fVarApply;
            a aVar2 = new a(this, j2, t);
            if (fue.a(this.debouncer, aVar, aVar2)) {
                k3fVar.subscribe(aVar2);
            }
        } catch (Throwable th) {
            hu6.b(th);
            cancel();
            this.downstream.onError(th);
        }
    }

    @Override // com.oplus.aiunit.vision.vu7, com.oplus.aiunit.vision.v2j
    public void onSubscribe(c3j c3jVar) {
        if (SubscriptionHelper.validate(this.upstream, c3jVar)) {
            this.upstream = c3jVar;
            this.downstream.onSubscribe(this);
            c3jVar.request(Long.MAX_VALUE);
        }
    }

    @Override // com.oplus.aiunit.vision.c3j
    public void request(long j2) {
        if (SubscriptionHelper.validate(j2)) {
            vr0.a(this, j2);
        }
    }
}
