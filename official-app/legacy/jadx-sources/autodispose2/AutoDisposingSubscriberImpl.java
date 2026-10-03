package autodispose2;

import com.oplus.aiunit.vision.c3j;
import com.oplus.aiunit.vision.ds3;
import com.oplus.aiunit.vision.ev5;
import com.oplus.aiunit.vision.v2j;
import com.oplus.aiunit.vision.vu7;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes12.dex */
final class AutoDisposingSubscriberImpl<T> extends AtomicInteger implements vu7, c3j, io.reactivex.rxjava3.disposables.a {
    private final v2j<? super T> delegate;
    private final ds3 scope;
    final AtomicReference<c3j> mainSubscription = new AtomicReference<>();
    final AtomicReference<io.reactivex.rxjava3.disposables.a> scopeDisposable = new AtomicReference<>();
    private final AtomicThrowable error = new AtomicThrowable();
    private final AtomicReference<c3j> ref = new AtomicReference<>();
    private final AtomicLong requested = new AtomicLong();

    public class a extends ev5 {
        public a() {
        }

        @Override // com.oplus.aiunit.vision.as3
        public void onComplete() {
            AutoDisposingSubscriberImpl.this.scopeDisposable.lazySet(AutoDisposableHelper.DISPOSED);
            AutoSubscriptionHelper.cancel(AutoDisposingSubscriberImpl.this.mainSubscription);
        }

        @Override // com.oplus.aiunit.vision.as3
        public void onError(Throwable th) {
            AutoDisposingSubscriberImpl.this.scopeDisposable.lazySet(AutoDisposableHelper.DISPOSED);
            AutoDisposingSubscriberImpl.this.onError(th);
        }
    }

    public AutoDisposingSubscriberImpl(ds3 ds3Var, v2j<? super T> v2jVar) {
        this.scope = ds3Var;
        this.delegate = v2jVar;
    }

    @Override // com.oplus.aiunit.vision.c3j
    public void cancel() {
        AutoDisposableHelper.dispose(this.scopeDisposable);
        AutoSubscriptionHelper.cancel(this.mainSubscription);
    }

    public v2j<? super T> delegateSubscriber() {
        return this.delegate;
    }

    @Override // io.reactivex.rxjava3.disposables.a
    public void dispose() {
        cancel();
    }

    @Override // io.reactivex.rxjava3.disposables.a
    public boolean isDisposed() {
        return this.mainSubscription.get() == AutoSubscriptionHelper.CANCELLED;
    }

    @Override // com.oplus.aiunit.vision.v2j
    public void onComplete() {
        if (isDisposed()) {
            return;
        }
        this.mainSubscription.lazySet(AutoSubscriptionHelper.CANCELLED);
        AutoDisposableHelper.dispose(this.scopeDisposable);
        d.b(this.delegate, this, this.error);
    }

    @Override // com.oplus.aiunit.vision.v2j
    public void onError(Throwable th) {
        if (isDisposed()) {
            return;
        }
        this.mainSubscription.lazySet(AutoSubscriptionHelper.CANCELLED);
        AutoDisposableHelper.dispose(this.scopeDisposable);
        d.d(this.delegate, th, this, this.error);
    }

    @Override // com.oplus.aiunit.vision.v2j
    public void onNext(T t) {
        if (isDisposed() || !d.f(this.delegate, t, this, this.error)) {
            return;
        }
        this.mainSubscription.lazySet(AutoSubscriptionHelper.CANCELLED);
        AutoDisposableHelper.dispose(this.scopeDisposable);
    }

    @Override // com.oplus.aiunit.vision.vu7, com.oplus.aiunit.vision.v2j
    public void onSubscribe(c3j c3jVar) {
        a aVar = new a();
        if (autodispose2.a.d(this.scopeDisposable, aVar, AutoDisposingSubscriberImpl.class)) {
            this.delegate.onSubscribe(this);
            this.scope.a(aVar);
            if (autodispose2.a.c(this.mainSubscription, c3jVar, AutoDisposingSubscriberImpl.class)) {
                AutoSubscriptionHelper.deferredSetOnce(this.ref, this.requested, c3jVar);
            }
        }
    }

    @Override // com.oplus.aiunit.vision.c3j
    public void request(long j2) {
        AutoSubscriptionHelper.deferredRequest(this.ref, this.requested, j2);
    }
}
