package io.reactivex.internal.operators.maybe;

import com.oplus.aiunit.vision.cv5;
import com.oplus.aiunit.vision.h4g;
import com.oplus.aiunit.vision.mob;
import com.oplus.aiunit.vision.qob;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
final class MaybeTimeoutPublisher$TimeoutMainMaybeObserver<T, U> extends AtomicReference<cv5> implements mob<T>, cv5 {
    private static final long serialVersionUID = -5955289211445418871L;
    final mob<? super T> downstream;
    final qob<? extends T> fallback;
    final MaybeTimeoutPublisher$TimeoutOtherMaybeObserver<T, U> other = new MaybeTimeoutPublisher$TimeoutOtherMaybeObserver<>(this);
    final MaybeTimeoutPublisher$TimeoutFallbackMaybeObserver<T> otherObserver;

    public MaybeTimeoutPublisher$TimeoutMainMaybeObserver(mob<? super T> mobVar, qob<? extends T> qobVar) {
        this.downstream = mobVar;
        this.fallback = qobVar;
        this.otherObserver = qobVar != null ? new MaybeTimeoutPublisher$TimeoutFallbackMaybeObserver<>(mobVar) : null;
    }

    @Override // com.oplus.aiunit.vision.cv5
    public void dispose() {
        DisposableHelper.dispose(this);
        SubscriptionHelper.cancel(this.other);
        MaybeTimeoutPublisher$TimeoutFallbackMaybeObserver<T> maybeTimeoutPublisher$TimeoutFallbackMaybeObserver = this.otherObserver;
        if (maybeTimeoutPublisher$TimeoutFallbackMaybeObserver != null) {
            DisposableHelper.dispose(maybeTimeoutPublisher$TimeoutFallbackMaybeObserver);
        }
    }

    @Override // com.oplus.aiunit.vision.cv5
    public boolean isDisposed() {
        return DisposableHelper.isDisposed(get());
    }

    @Override // com.oplus.aiunit.vision.mob
    public void onComplete() {
        SubscriptionHelper.cancel(this.other);
        DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
        if (getAndSet(disposableHelper) != disposableHelper) {
            this.downstream.onComplete();
        }
    }

    @Override // com.oplus.aiunit.vision.mob
    public void onError(Throwable th) {
        SubscriptionHelper.cancel(this.other);
        DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
        if (getAndSet(disposableHelper) != disposableHelper) {
            this.downstream.onError(th);
        } else {
            h4g.r(th);
        }
    }

    @Override // com.oplus.aiunit.vision.mob
    public void onSubscribe(cv5 cv5Var) {
        DisposableHelper.setOnce(this, cv5Var);
    }

    @Override // com.oplus.aiunit.vision.mob
    public void onSuccess(T t) {
        SubscriptionHelper.cancel(this.other);
        DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
        if (getAndSet(disposableHelper) != disposableHelper) {
            this.downstream.onSuccess(t);
        }
    }

    public void otherComplete() {
        if (DisposableHelper.dispose(this)) {
            qob<? extends T> qobVar = this.fallback;
            if (qobVar == null) {
                this.downstream.onError(new TimeoutException());
            } else {
                qobVar.a(this.otherObserver);
            }
        }
    }

    public void otherError(Throwable th) {
        if (DisposableHelper.dispose(this)) {
            this.downstream.onError(th);
        } else {
            h4g.r(th);
        }
    }
}
