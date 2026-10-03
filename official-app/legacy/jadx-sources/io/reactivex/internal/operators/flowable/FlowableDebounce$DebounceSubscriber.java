package io.reactivex.internal.operators.flowable;

import com.oplus.aiunit.vision.abd;
import com.oplus.aiunit.vision.c3j;
import com.oplus.aiunit.vision.cv5;
import com.oplus.aiunit.vision.fue;
import com.oplus.aiunit.vision.h4g;
import com.oplus.aiunit.vision.iu6;
import com.oplus.aiunit.vision.j08;
import com.oplus.aiunit.vision.k3f;
import com.oplus.aiunit.vision.lv5;
import com.oplus.aiunit.vision.v2j;
import com.oplus.aiunit.vision.wr0;
import com.oplus.aiunit.vision.wu7;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
final class FlowableDebounce$DebounceSubscriber<T, U> extends AtomicLong implements wu7<T>, c3j {
    private static final long serialVersionUID = 6725975399620862591L;
    final j08<? super T, ? extends k3f<U>> debounceSelector;
    final AtomicReference<cv5> debouncer = new AtomicReference<>();
    boolean done;
    final v2j<? super T> downstream;
    volatile long index;
    c3j upstream;

    public static final class a<T, U> extends lv5<U> {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final FlowableDebounce$DebounceSubscriber<T, U> f20466j;
        public final long k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final T f20467l;
        public boolean m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final AtomicBoolean f20468n = new AtomicBoolean();

        public a(FlowableDebounce$DebounceSubscriber<T, U> flowableDebounce$DebounceSubscriber, long j2, T t) {
            this.f20466j = flowableDebounce$DebounceSubscriber;
            this.k = j2;
            this.f20467l = t;
        }

        public void c() {
            if (this.f20468n.compareAndSet(false, true)) {
                this.f20466j.emit(this.k, this.f20467l);
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
                h4g.r(th);
            } else {
                this.m = true;
                this.f20466j.onError(th);
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

    public FlowableDebounce$DebounceSubscriber(v2j<? super T> v2jVar, j08<? super T, ? extends k3f<U>> j08Var) {
        this.downstream = v2jVar;
        this.debounceSelector = j08Var;
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
                wr0.e(this, 1L);
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
        cv5 cv5Var = this.debouncer.get();
        if (DisposableHelper.isDisposed(cv5Var)) {
            return;
        }
        ((a) cv5Var).c();
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
        cv5 cv5Var = this.debouncer.get();
        if (cv5Var != null) {
            cv5Var.dispose();
        }
        try {
            k3f k3fVar = (k3f) abd.d(this.debounceSelector.apply(t), "The publisher supplied is null");
            a aVar = new a(this, j2, t);
            if (fue.a(this.debouncer, cv5Var, aVar)) {
                k3fVar.subscribe(aVar);
            }
        } catch (Throwable th) {
            iu6.b(th);
            cancel();
            this.downstream.onError(th);
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
        if (SubscriptionHelper.validate(j2)) {
            wr0.a(this, j2);
        }
    }
}
