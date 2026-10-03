package io.reactivex.internal.subscriptions;

import com.oplus.aiunit.vision.c3j;
import com.oplus.aiunit.vision.cv5;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
public final class AsyncSubscription extends AtomicLong implements c3j, cv5 {
    private static final long serialVersionUID = 7028635084060361255L;
    final AtomicReference<c3j> actual;
    final AtomicReference<cv5> resource;

    public AsyncSubscription() {
        this.resource = new AtomicReference<>();
        this.actual = new AtomicReference<>();
    }

    @Override // com.oplus.aiunit.vision.c3j
    public void cancel() {
        dispose();
    }

    @Override // com.oplus.aiunit.vision.cv5
    public void dispose() {
        SubscriptionHelper.cancel(this.actual);
        DisposableHelper.dispose(this.resource);
    }

    @Override // com.oplus.aiunit.vision.cv5
    public boolean isDisposed() {
        return this.actual.get() == SubscriptionHelper.CANCELLED;
    }

    public boolean replaceResource(cv5 cv5Var) {
        return DisposableHelper.replace(this.resource, cv5Var);
    }

    @Override // com.oplus.aiunit.vision.c3j
    public void request(long j2) {
        SubscriptionHelper.deferredRequest(this.actual, this, j2);
    }

    public boolean setResource(cv5 cv5Var) {
        return DisposableHelper.set(this.resource, cv5Var);
    }

    public void setSubscription(c3j c3jVar) {
        SubscriptionHelper.deferredSetOnce(this.actual, this, c3jVar);
    }

    public AsyncSubscription(cv5 cv5Var) {
        this();
        this.resource.lazySet(cv5Var);
    }
}
