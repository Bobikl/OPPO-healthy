package io.reactivex.rxjava3.internal.operators.flowable;

import com.oplus.aiunit.vision.c3j;
import com.oplus.aiunit.vision.cfg;
import com.oplus.aiunit.vision.g4g;
import com.oplus.aiunit.vision.v2j;
import com.oplus.aiunit.vision.vr0;
import com.oplus.aiunit.vision.vu7;
import io.reactivex.rxjava3.exceptions.MissingBackpressureException;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes10.dex */
final class FlowableDebounceTimed$DebounceTimedSubscriber<T> extends AtomicLong implements vu7<T>, c3j {
    private static final long serialVersionUID = -9102637559663639004L;
    boolean done;
    final v2j<? super T> downstream;
    volatile long index;
    final long timeout;
    io.reactivex.rxjava3.disposables.a timer;
    final TimeUnit unit;
    c3j upstream;
    final cfg.c worker;

    public FlowableDebounceTimed$DebounceTimedSubscriber(v2j<? super T> v2jVar, long j2, TimeUnit timeUnit, cfg.c cVar) {
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
                vr0.e(this, 1L);
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
        io.reactivex.rxjava3.disposables.a aVar = this.timer;
        if (aVar != null) {
            aVar.dispose();
        }
        FlowableDebounceTimed$DebounceEmitter flowableDebounceTimed$DebounceEmitter = (FlowableDebounceTimed$DebounceEmitter) aVar;
        if (flowableDebounceTimed$DebounceEmitter != null) {
            flowableDebounceTimed$DebounceEmitter.emit();
        }
        this.downstream.onComplete();
        this.worker.dispose();
    }

    @Override // com.oplus.aiunit.vision.v2j
    public void onError(Throwable th) {
        if (this.done) {
            g4g.u(th);
            return;
        }
        this.done = true;
        io.reactivex.rxjava3.disposables.a aVar = this.timer;
        if (aVar != null) {
            aVar.dispose();
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
        io.reactivex.rxjava3.disposables.a aVar = this.timer;
        if (aVar != null) {
            aVar.dispose();
        }
        FlowableDebounceTimed$DebounceEmitter flowableDebounceTimed$DebounceEmitter = new FlowableDebounceTimed$DebounceEmitter(t, j2, this);
        this.timer = flowableDebounceTimed$DebounceEmitter;
        flowableDebounceTimed$DebounceEmitter.setResource(this.worker.c(flowableDebounceTimed$DebounceEmitter, this.timeout, this.unit));
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
