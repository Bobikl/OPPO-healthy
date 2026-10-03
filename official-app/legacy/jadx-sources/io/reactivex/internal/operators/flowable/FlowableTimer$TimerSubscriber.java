package io.reactivex.internal.operators.flowable;

import com.oplus.aiunit.vision.c3j;
import com.oplus.aiunit.vision.cv5;
import com.oplus.aiunit.vision.v2j;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
final class FlowableTimer$TimerSubscriber extends AtomicReference<cv5> implements c3j, Runnable {
    private static final long serialVersionUID = -2809475196591179431L;
    final v2j<? super Long> downstream;
    volatile boolean requested;

    public FlowableTimer$TimerSubscriber(v2j<? super Long> v2jVar) {
        this.downstream = v2jVar;
    }

    @Override // com.oplus.aiunit.vision.c3j
    public void cancel() {
        DisposableHelper.dispose(this);
    }

    @Override // com.oplus.aiunit.vision.c3j
    public void request(long j2) {
        if (SubscriptionHelper.validate(j2)) {
            this.requested = true;
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        if (get() != DisposableHelper.DISPOSED) {
            if (!this.requested) {
                lazySet(EmptyDisposable.INSTANCE);
                this.downstream.onError(new MissingBackpressureException("Can't deliver value due to lack of requests"));
            } else {
                this.downstream.onNext(0L);
                lazySet(EmptyDisposable.INSTANCE);
                this.downstream.onComplete();
            }
        }
    }

    public void setResource(cv5 cv5Var) {
        DisposableHelper.trySet(this, cv5Var);
    }
}
