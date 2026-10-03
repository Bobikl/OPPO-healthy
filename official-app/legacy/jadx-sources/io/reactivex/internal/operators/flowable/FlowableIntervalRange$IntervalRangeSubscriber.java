package io.reactivex.internal.operators.flowable;

import com.oplus.aiunit.vision.c3j;
import com.oplus.aiunit.vision.cv5;
import com.oplus.aiunit.vision.v2j;
import com.oplus.aiunit.vision.wr0;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
final class FlowableIntervalRange$IntervalRangeSubscriber extends AtomicLong implements c3j, Runnable {
    private static final long serialVersionUID = -2809475196591179431L;
    long count;
    final v2j<? super Long> downstream;
    final long end;
    final AtomicReference<cv5> resource = new AtomicReference<>();

    public FlowableIntervalRange$IntervalRangeSubscriber(v2j<? super Long> v2jVar, long j2, long j3) {
        this.downstream = v2jVar;
        this.count = j2;
        this.end = j3;
    }

    @Override // com.oplus.aiunit.vision.c3j
    public void cancel() {
        DisposableHelper.dispose(this.resource);
    }

    @Override // com.oplus.aiunit.vision.c3j
    public void request(long j2) {
        if (SubscriptionHelper.validate(j2)) {
            wr0.a(this, j2);
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        cv5 cv5Var = this.resource.get();
        DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
        if (cv5Var != disposableHelper) {
            long j2 = get();
            if (j2 == 0) {
                this.downstream.onError(new MissingBackpressureException("Can't deliver value " + this.count + " due to lack of requests"));
                DisposableHelper.dispose(this.resource);
                return;
            }
            long j3 = this.count;
            this.downstream.onNext(Long.valueOf(j3));
            if (j3 == this.end) {
                if (this.resource.get() != disposableHelper) {
                    this.downstream.onComplete();
                }
                DisposableHelper.dispose(this.resource);
            } else {
                this.count = j3 + 1;
                if (j2 != Long.MAX_VALUE) {
                    decrementAndGet();
                }
            }
        }
    }

    public void setResource(cv5 cv5Var) {
        DisposableHelper.setOnce(this.resource, cv5Var);
    }
}
