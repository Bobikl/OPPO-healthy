package io.reactivex.internal.operators.maybe;

import com.oplus.aiunit.vision.c3j;
import com.oplus.aiunit.vision.cv5;
import com.oplus.aiunit.vision.h4g;
import com.oplus.aiunit.vision.mob;
import com.oplus.aiunit.vision.wu7;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
final class MaybeTakeUntilPublisher$TakeUntilMainMaybeObserver<T, U> extends AtomicReference<cv5> implements mob<T>, cv5 {
    private static final long serialVersionUID = -2187421758664251153L;
    final mob<? super T> downstream;
    final TakeUntilOtherMaybeObserver<U> other = new TakeUntilOtherMaybeObserver<>(this);

    public static final class TakeUntilOtherMaybeObserver<U> extends AtomicReference<c3j> implements wu7<U> {
        private static final long serialVersionUID = -1266041316834525931L;
        final MaybeTakeUntilPublisher$TakeUntilMainMaybeObserver<?, U> parent;

        public TakeUntilOtherMaybeObserver(MaybeTakeUntilPublisher$TakeUntilMainMaybeObserver<?, U> maybeTakeUntilPublisher$TakeUntilMainMaybeObserver) {
            this.parent = maybeTakeUntilPublisher$TakeUntilMainMaybeObserver;
        }

        @Override // com.oplus.aiunit.vision.v2j
        public void onComplete() {
            this.parent.otherComplete();
        }

        @Override // com.oplus.aiunit.vision.v2j
        public void onError(Throwable th) {
            this.parent.otherError(th);
        }

        @Override // com.oplus.aiunit.vision.v2j
        public void onNext(Object obj) {
            SubscriptionHelper.cancel(this);
            this.parent.otherComplete();
        }

        @Override // com.oplus.aiunit.vision.wu7, com.oplus.aiunit.vision.v2j
        public void onSubscribe(c3j c3jVar) {
            SubscriptionHelper.setOnce(this, c3jVar, Long.MAX_VALUE);
        }
    }

    public MaybeTakeUntilPublisher$TakeUntilMainMaybeObserver(mob<? super T> mobVar) {
        this.downstream = mobVar;
    }

    @Override // com.oplus.aiunit.vision.cv5
    public void dispose() {
        DisposableHelper.dispose(this);
        SubscriptionHelper.cancel(this.other);
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
            this.downstream.onComplete();
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
