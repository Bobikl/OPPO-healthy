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
final class FlowableInterval$IntervalSubscriber extends AtomicLong implements c3j, Runnable {
    private static final long serialVersionUID = -2809475196591179431L;
    long count;
    final v2j<? super Long> downstream;
    final AtomicReference<cv5> resource = new AtomicReference<>();

    public FlowableInterval$IntervalSubscriber(v2j<? super Long> v2jVar) {
        this.downstream = v2jVar;
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
        if (this.resource.get() != DisposableHelper.DISPOSED) {
            if (get() != 0) {
                v2j<? super Long> v2jVar = this.downstream;
                long j2 = this.count;
                this.count = j2 + 1;
                v2jVar.onNext(Long.valueOf(j2));
                wr0.e(this, 1L);
                return;
            }
            this.downstream.onError(new MissingBackpressureException("Can't deliver value " + this.count + " due to lack of requests"));
            DisposableHelper.dispose(this.resource);
        }
    }

    public void setResource(cv5 cv5Var) {
        DisposableHelper.setOnce(this.resource, cv5Var);
    }
}
