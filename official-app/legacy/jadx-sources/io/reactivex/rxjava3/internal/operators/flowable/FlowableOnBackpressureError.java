package io.reactivex.rxjava3.internal.operators.flowable;

import com.oplus.aiunit.vision.c3j;
import com.oplus.aiunit.vision.f6;
import com.oplus.aiunit.vision.g4g;
import com.oplus.aiunit.vision.v2j;
import com.oplus.aiunit.vision.vr0;
import com.oplus.aiunit.vision.vu7;
import com.oplus.aiunit.vision.wt7;
import io.reactivex.rxjava3.exceptions.MissingBackpressureException;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes10.dex */
public final class FlowableOnBackpressureError<T> extends f6<T, T> {

    public static final class BackpressureErrorSubscriber<T> extends AtomicLong implements vu7<T>, c3j {
        private static final long serialVersionUID = -3176480756392482682L;
        boolean done;
        final v2j<? super T> downstream;
        c3j upstream;

        public BackpressureErrorSubscriber(v2j<? super T> v2jVar) {
            this.downstream = v2jVar;
        }

        @Override // com.oplus.aiunit.vision.c3j
        public void cancel() {
            this.upstream.cancel();
        }

        @Override // com.oplus.aiunit.vision.v2j
        public void onComplete() {
            if (this.done) {
                return;
            }
            this.done = true;
            this.downstream.onComplete();
        }

        @Override // com.oplus.aiunit.vision.v2j
        public void onError(Throwable th) {
            if (this.done) {
                g4g.u(th);
            } else {
                this.done = true;
                this.downstream.onError(th);
            }
        }

        @Override // com.oplus.aiunit.vision.v2j
        public void onNext(T t) {
            if (this.done) {
                return;
            }
            if (get() != 0) {
                this.downstream.onNext(t);
                vr0.e(this, 1L);
            } else {
                this.upstream.cancel();
                onError(new MissingBackpressureException("could not emit value due to lack of requests"));
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

    public FlowableOnBackpressureError(wt7<T> wt7Var) {
        super(wt7Var);
    }

    @Override // com.oplus.aiunit.vision.wt7
    public void z(v2j<? super T> v2jVar) {
        this.f11230j.y(new BackpressureErrorSubscriber(v2jVar));
    }
}
