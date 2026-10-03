package io.reactivex.internal.operators.flowable;

import com.oplus.aiunit.vision.c3j;
import com.oplus.aiunit.vision.cv5;
import com.oplus.aiunit.vision.h4g;
import com.oplus.aiunit.vision.v2j;
import com.oplus.aiunit.vision.wr0;
import com.oplus.aiunit.vision.wu7;
import com.oplus.aiunit.vision.zeg;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes10.dex */
final class FlowableDebounceTimed$DebounceTimedSubscriber<T> extends AtomicLong implements wu7<T>, c3j {
    private static final long serialVersionUID = -9102637559663639004L;
    boolean done;
    final v2j<? super T> downstream;
    volatile long index;
    final long timeout;
    cv5 timer;
    final TimeUnit unit;
    c3j upstream;
    final zeg.c worker;

    public FlowableDebounceTimed$DebounceTimedSubscriber(v2j<? super T> v2jVar, long j2, TimeUnit timeUnit, zeg.c cVar) {
        this.downstream = v2jVar;
        this.timeout = j2;
        this.unit = timeUnit;
        this.worker = cVar;
    }

    @Override // com.oplus.aiunit.vision.c3j
    public void cancel() {
        this.upstream.cancel();
        this.worker.dispose();
    }

    public void emit(long j2, T t, FlowableDebounceTimed$DebounceEmitter<T> flowableDebounceTimed$DebounceEmitter) {
        if (j2 == this.index) {
            if (get() == 0) {
                cancel();
                this.downstream.onError(new MissingBackpressureException("Could not deliver value due to lack of requests"));
            } else {
                this.downstream.onNext(t);
                wr0.e(this, 1L);
                flowableDebounceTimed$DebounceEmitter.dispose();
            }
        }
    }

    @Override // com.oplus.aiunit.vision.v2j
    public void onComplete() {
        if (this.done) {
            return;
        }
        this.done = true;
        cv5 cv5Var = this.timer;
        if (cv5Var != null) {
            cv5Var.dispose();
        }
        FlowableDebounceTimed$DebounceEmitter flowableDebounceTimed$DebounceEmitter = (FlowableDebounceTimed$DebounceEmitter) cv5Var;
        if (flowableDebounceTimed$DebounceEmitter != null) {
            flowableDebounceTimed$DebounceEmitter.emit();
        }
        this.downstream.onComplete();
        this.worker.dispose();
    }

    @Override // com.oplus.aiunit.vision.v2j
    public void onError(Throwable th) {
        if (this.done) {
            h4g.r(th);
            return;
        }
        this.done = true;
        cv5 cv5Var = this.timer;
        if (cv5Var != null) {
            cv5Var.dispose();
        }
        this.downstream.onError(th);
        this.worker.dispose();
    }

    @Override // com.oplus.aiunit.vision.v2j
    public void onNext(T t) {
        if (this.done) {
            return;
        }
        long j2 = this.index + 1;
        this.index = j2;
        cv5 cv5Var = this.timer;
        if (cv5Var != null) {
            cv5Var.dispose();
        }
        FlowableDebounceTimed$DebounceEmitter flowableDebounceTimed$DebounceEmitter = new FlowableDebounceTimed$DebounceEmitter(t, j2, this);
        this.timer = flowableDebounceTimed$DebounceEmitter;
        flowableDebounceTimed$DebounceEmitter.setResource(this.worker.c(flowableDebounceTimed$DebounceEmitter, this.timeout, this.unit));
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
