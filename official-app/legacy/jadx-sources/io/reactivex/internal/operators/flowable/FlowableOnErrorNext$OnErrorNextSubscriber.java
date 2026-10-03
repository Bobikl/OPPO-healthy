package io.reactivex.internal.operators.flowable;

import com.oplus.aiunit.vision.abd;
import com.oplus.aiunit.vision.c3j;
import com.oplus.aiunit.vision.h4g;
import com.oplus.aiunit.vision.iu6;
import com.oplus.aiunit.vision.j08;
import com.oplus.aiunit.vision.k3f;
import com.oplus.aiunit.vision.v2j;
import com.oplus.aiunit.vision.wu7;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.internal.subscriptions.SubscriptionArbiter;

/* JADX INFO: loaded from: classes10.dex */
final class FlowableOnErrorNext$OnErrorNextSubscriber<T> extends SubscriptionArbiter implements wu7<T> {
    private static final long serialVersionUID = 4063763155303814625L;
    final boolean allowFatal;
    boolean done;
    final v2j<? super T> downstream;
    final j08<? super Throwable, ? extends k3f<? extends T>> nextSupplier;
    boolean once;
    long produced;

    public FlowableOnErrorNext$OnErrorNextSubscriber(v2j<? super T> v2jVar, j08<? super Throwable, ? extends k3f<? extends T>> j08Var, boolean z) {
        super(false);
        this.downstream = v2jVar;
        this.nextSupplier = j08Var;
        this.allowFatal = z;
    }

    @Override // com.oplus.aiunit.vision.v2j
    public void onComplete() {
        if (this.done) {
            return;
        }
        this.done = true;
        this.once = true;
        this.downstream.onComplete();
    }

    @Override // com.oplus.aiunit.vision.v2j
    public void onError(Throwable th) {
        if (this.once) {
            if (this.done) {
                h4g.r(th);
                return;
            } else {
                this.downstream.onError(th);
                return;
            }
        }
        this.once = true;
        if (this.allowFatal && !(th instanceof Exception)) {
            this.downstream.onError(th);
            return;
        }
        try {
            k3f k3fVar = (k3f) abd.d(this.nextSupplier.apply(th), "The nextSupplier returned a null Publisher");
            long j2 = this.produced;
            if (j2 != 0) {
                produced(j2);
            }
            k3fVar.subscribe(this);
        } catch (Throwable th2) {
            iu6.b(th2);
            this.downstream.onError(new CompositeException(th, th2));
        }
    }

    @Override // com.oplus.aiunit.vision.v2j
    public void onNext(T t) {
        if (this.done) {
            return;
        }
        if (!this.once) {
            this.produced++;
        }
        this.downstream.onNext(t);
    }

    @Override // com.oplus.aiunit.vision.wu7, com.oplus.aiunit.vision.v2j
    public void onSubscribe(c3j c3jVar) {
        setSubscription(c3jVar);
    }
}
