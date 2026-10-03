package io.reactivex.rxjava3.internal.operators.flowable;

import com.oplus.aiunit.vision.as3;
import com.oplus.aiunit.vision.c3j;
import com.oplus.aiunit.vision.v2j;
import com.oplus.aiunit.vision.vu7;
import com.oplus.aiunit.vision.yf8;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.internal.util.AtomicThrowable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
final class FlowableMergeWithCompletable$MergeWithSubscriber<T> extends AtomicInteger implements vu7<T>, c3j {
    private static final long serialVersionUID = -4592979584110982903L;
    final v2j<? super T> downstream;
    volatile boolean mainDone;
    volatile boolean otherDone;
    final AtomicReference<c3j> mainSubscription = new AtomicReference<>();
    final OtherObserver otherObserver = new OtherObserver(this);
    final AtomicThrowable errors = new AtomicThrowable();
    final AtomicLong requested = new AtomicLong();

    public static final class OtherObserver extends AtomicReference<io.reactivex.rxjava3.disposables.a> implements as3 {
        private static final long serialVersionUID = -2935427570954647017L;
        final FlowableMergeWithCompletable$MergeWithSubscriber<?> parent;

        public OtherObserver(FlowableMergeWithCompletable$MergeWithSubscriber<?> flowableMergeWithCompletable$MergeWithSubscriber) {
            this.parent = flowableMergeWithCompletable$MergeWithSubscriber;
        }

        @Override // com.oplus.aiunit.vision.as3
        public void onComplete() {
            this.parent.otherComplete();
        }

        @Override // com.oplus.aiunit.vision.as3
        public void onError(Throwable th) {
            this.parent.otherError(th);
        }

        @Override // com.oplus.aiunit.vision.as3
        public void onSubscribe(io.reactivex.rxjava3.disposables.a aVar) {
            DisposableHelper.setOnce(this, aVar);
        }
    }

    public FlowableMergeWithCompletable$MergeWithSubscriber(v2j<? super T> v2jVar) {
        this.downstream = v2jVar;
    }

    @Override // com.oplus.aiunit.vision.c3j
    public void cancel() {
        SubscriptionHelper.cancel(this.mainSubscription);
        DisposableHelper.dispose(this.otherObserver);
        this.errors.tryTerminateAndReport();
    }

    @Override // com.oplus.aiunit.vision.v2j
    public void onComplete() {
        this.mainDone = true;
        if (this.otherDone) {
            yf8.b(this.downstream, this, this.errors);
        }
    }

    @Override // com.oplus.aiunit.vision.v2j
    public void onError(Throwable th) {
        DisposableHelper.dispose(this.otherObserver);
        yf8.d(this.downstream, th, this, this.errors);
    }

    @Override // com.oplus.aiunit.vision.v2j
    public void onNext(T t) {
        yf8.f(this.downstream, t, this, this.errors);
    }

    @Override // com.oplus.aiunit.vision.vu7, com.oplus.aiunit.vision.v2j
    public void onSubscribe(c3j c3jVar) {
        SubscriptionHelper.deferredSetOnce(this.mainSubscription, this.requested, c3jVar);
    }

    public void otherComplete() {
        this.otherDone = true;
        if (this.mainDone) {
            yf8.b(this.downstream, this, this.errors);
        }
    }

    public void otherError(Throwable th) {
        SubscriptionHelper.cancel(this.mainSubscription);
        yf8.d(this.downstream, th, this, this.errors);
    }

    @Override // com.oplus.aiunit.vision.c3j
    public void request(long j2) {
        SubscriptionHelper.deferredRequest(this.mainSubscription, this.requested, j2);
    }
}
