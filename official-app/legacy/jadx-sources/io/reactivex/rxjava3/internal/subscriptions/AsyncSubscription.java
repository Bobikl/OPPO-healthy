package io.reactivex.rxjava3.internal.subscriptions;

import com.oplus.aiunit.vision.c3j;
import io.reactivex.rxjava3.disposables.a;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
public final class AsyncSubscription extends AtomicLong implements c3j, a {
    private static final long serialVersionUID = 7028635084060361255L;
    final AtomicReference<c3j> actual;
    final AtomicReference<a> resource;

    public AsyncSubscription() {
        this.resource = new AtomicReference<>();
        this.actual = new AtomicReference<>();
    }

    @Override // com.oplus.aiunit.vision.c3j
    public void cancel() {
        dispose();
    }

    @Override // io.reactivex.rxjava3.disposables.a
    public void dispose() {
        SubscriptionHelper.cancel(this.actual);
        DisposableHelper.dispose(this.resource);
    }

    @Override // io.reactivex.rxjava3.disposables.a
    public boolean isDisposed() {
        return this.actual.get() == SubscriptionHelper.CANCELLED;
    }

    public boolean replaceResource(a aVar) {
        return DisposableHelper.replace(this.resource, aVar);
    }

    @Override // com.oplus.aiunit.vision.c3j
    public void request(long j2) {
        SubscriptionHelper.deferredRequest(this.actual, this, j2);
    }

    public boolean setResource(a aVar) {
        return DisposableHelper.set(this.resource, aVar);
    }

    public void setSubscription(c3j c3jVar) {
        SubscriptionHelper.deferredSetOnce(this.actual, this, c3jVar);
    }

    public AsyncSubscription(a aVar) {
        this();
        this.resource.lazySet(aVar);
    }
}
