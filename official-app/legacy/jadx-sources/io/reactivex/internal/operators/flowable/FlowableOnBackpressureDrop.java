package io.reactivex.internal.operators.flowable;

import com.oplus.aiunit.vision.c3j;
import com.oplus.aiunit.vision.g6;
import com.oplus.aiunit.vision.h4g;
import com.oplus.aiunit.vision.iu6;
import com.oplus.aiunit.vision.p14;
import com.oplus.aiunit.vision.v2j;
import com.oplus.aiunit.vision.wr0;
import com.oplus.aiunit.vision.wu7;
import com.oplus.aiunit.vision.xt7;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes10.dex */
public final class FlowableOnBackpressureDrop<T> extends g6<T, T> implements p14<T> {
    public final p14<? super T> k;

    public static final class BackpressureDropSubscriber<T> extends AtomicLong implements wu7<T>, c3j {
        private static final long serialVersionUID = -6246093802440953054L;
        boolean done;
        final v2j<? super T> downstream;
        final p14<? super T> onDrop;
        c3j upstream;

        public BackpressureDropSubscriber(v2j<? super T> v2jVar, p14<? super T> p14Var) {
            this.downstream = v2jVar;
            this.onDrop = p14Var;
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
                h4g.r(th);
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
                wr0.e(this, 1L);
                return;
            }
            try {
                this.onDrop.accept(t);
            } catch (Throwable th) {
                iu6.b(th);
                cancel();
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
            if (SubscriptionHelper.validate(j2)) {
                wr0.a(this, j2);
            }
        }
    }

    public FlowableOnBackpressureDrop(xt7<T> xt7Var) {
        super(xt7Var);
        this.k = this;
    }

    @Override // com.oplus.aiunit.vision.p14
    public void accept(T t) {
    }

    @Override // com.oplus.aiunit.vision.xt7
    public void g(v2j<? super T> v2jVar) {
        this.f11648j.f(new BackpressureDropSubscriber(v2jVar, this.k));
    }
}
