package io.reactivex.rxjava3.internal.operators.maybe;

import com.oplus.aiunit.vision.c3j;
import com.oplus.aiunit.vision.g4g;
import com.oplus.aiunit.vision.lob;
import com.oplus.aiunit.vision.vu7;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
final class MaybeTakeUntilPublisher$TakeUntilMainMaybeObserver<T, U> extends AtomicReference<io.reactivex.rxjava3.disposables.a> implements lob<T>, io.reactivex.rxjava3.disposables.a {
    private static final long serialVersionUID = -2187421758664251153L;
    final lob<? super T> downstream;
    final TakeUntilOtherMaybeObserver<U> other = new TakeUntilOtherMaybeObserver<>(this);

    public static final class TakeUntilOtherMaybeObserver<U> extends AtomicReference<c3j> implements vu7<U> {
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

        @Override // com.oplus.aiunit.vision.vu7, com.oplus.aiunit.vision.v2j
        public void onSubscribe(c3j c3jVar) {
            SubscriptionHelper.setOnce(this, c3jVar, Long.MAX_VALUE);
        }
    }

    public MaybeTakeUntilPublisher$TakeUntilMainMaybeObserver(lob<? super T> lobVar) {
        this.downstream = lobVar;
    }

    @Override // io.reactivex.rxjava3.disposables.a
    public void dispose() {
        DisposableHelper.dispose(this);
        SubscriptionHelper.cancel(this.other);
    }

    @Override // io.reactivex.rxjava3.disposables.a
    public boolean isDisposed() {
        return DisposableHelper.isDisposed(get());
    }

    @Override // com.oplus.aiunit.vision.lob
    public void onComplete() {
        SubscriptionHelper.cancel(this.other);
        DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
        if (getAndSet(disposableHelper) != disposableHelper) {
            this.downstream.onComplete();
        }
    }

    @Override // com.oplus.aiunit.vision.lob
    public void onError(Throwable th) {
        SubscriptionHelper.cancel(this.other);
        DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
        if (getAndSet(disposableHelper) != disposableHelper) {
            this.downstream.onError(th);
        } else {
            g4g.u(th);
        }
    }

    @Override // com.oplus.aiunit.vision.lob
    public void onSubscribe(io.reactivex.rxjava3.disposables.a aVar) {
        DisposableHelper.setOnce(this, aVar);
    }

    @Override // com.oplus.aiunit.vision.lob, com.oplus.aiunit.vision.l6h
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
            g4g.u(th);
        }
    }
}
