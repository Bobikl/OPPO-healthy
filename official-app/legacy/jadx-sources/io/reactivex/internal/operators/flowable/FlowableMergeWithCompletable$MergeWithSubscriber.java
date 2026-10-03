package io.reactivex.internal.operators.flowable;

import com.oplus.aiunit.vision.bs3;
import com.oplus.aiunit.vision.c3j;
import com.oplus.aiunit.vision.cv5;
import com.oplus.aiunit.vision.v2j;
import com.oplus.aiunit.vision.wu7;
import com.oplus.aiunit.vision.zf8;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AtomicThrowable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
final class FlowableMergeWithCompletable$MergeWithSubscriber<T> extends AtomicInteger implements wu7<T>, c3j {
    private static final long serialVersionUID = -4592979584110982903L;
    final v2j<? super T> downstream;
    volatile boolean mainDone;
    volatile boolean otherDone;
    final AtomicReference<c3j> mainSubscription = new AtomicReference<>();
    final OtherObserver otherObserver = new OtherObserver(this);
    final AtomicThrowable error = new AtomicThrowable();
    final AtomicLong requested = new AtomicLong();

    public static final class OtherObserver extends AtomicReference<cv5> implements bs3 {
        private static final long serialVersionUID = -2935427570954647017L;
        final FlowableMergeWithCompletable$MergeWithSubscriber<?> parent;

        public OtherObserver(FlowableMergeWithCompletable$MergeWithSubscriber<?> flowableMergeWithCompletable$MergeWithSubscriber) {
            this.parent = flowableMergeWithCompletable$MergeWithSubscriber;
        }

        @Override // com.oplus.aiunit.vision.bs3
        public void onComplete() {
            this.parent.otherComplete();
        }

        @Override // com.oplus.aiunit.vision.bs3
        public void onError(Throwable th) {
            this.parent.otherError(th);
        }

        @Override // com.oplus.aiunit.vision.bs3
        public void onSubscribe(cv5 cv5Var) {
            DisposableHelper.setOnce(this, cv5Var);
        }
    }

    public FlowableMergeWithCompletable$MergeWithSubscriber(v2j<? super T> v2jVar) {
        this.downstream = v2jVar;
    }

    @Override // com.oplus.aiunit.vision.c3j
    public void cancel() {
        SubscriptionHelper.cancel(this.mainSubscription);
        DisposableHelper.dispose(this.otherObserver);
    }

    @Override // com.oplus.aiunit.vision.v2j
    public void onComplete() {
        this.mainDone = true;
        if (this.otherDone) {
            zf8.b(this.downstream, this, this.error);
        }
    }

    @Override // com.oplus.aiunit.vision.v2j
    public void onError(Throwable th) {
        SubscriptionHelper.cancel(this.mainSubscription);
        zf8.d(this.downstream, th, this, this.error);
    }

    @Override // com.oplus.aiunit.vision.v2j
    public void onNext(T t) {
        zf8.f(this.downstream, t, this, this.error);
    }

    @Override // com.oplus.aiunit.vision.wu7, com.oplus.aiunit.vision.v2j
    public void onSubscribe(c3j c3jVar) {
        SubscriptionHelper.deferredSetOnce(this.mainSubscription, this.requested, c3jVar);
    }

    public void otherComplete() {
        this.otherDone = true;
        if (this.mainDone) {
            zf8.b(this.downstream, this, this.error);
        }
    }

    public void otherError(Throwable th) {
        SubscriptionHelper.cancel(this.mainSubscription);
        zf8.d(this.downstream, th, this, this.error);
    }

    @Override // com.oplus.aiunit.vision.c3j
    public void request(long j2) {
        SubscriptionHelper.deferredRequest(this.mainSubscription, this.requested, j2);
    }
}
