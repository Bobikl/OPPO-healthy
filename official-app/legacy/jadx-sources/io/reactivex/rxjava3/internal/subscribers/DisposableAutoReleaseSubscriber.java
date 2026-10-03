package io.reactivex.rxjava3.internal.subscribers;

import com.oplus.aiunit.vision.Cdo;
import com.oplus.aiunit.vision.c3j;
import com.oplus.aiunit.vision.fv5;
import com.oplus.aiunit.vision.g4g;
import com.oplus.aiunit.vision.hu6;
import com.oplus.aiunit.vision.o14;
import com.oplus.aiunit.vision.vu7;
import io.reactivex.rxjava3.disposables.a;
import io.reactivex.rxjava3.exceptions.CompositeException;
import io.reactivex.rxjava3.internal.functions.Functions;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
public final class DisposableAutoReleaseSubscriber<T> extends AtomicReference<c3j> implements vu7<T>, a {
    private static final long serialVersionUID = 8924480688481408726L;
    final AtomicReference<fv5> composite;
    final Cdo onComplete;
    final o14<? super Throwable> onError;
    final o14<? super T> onNext;

    public DisposableAutoReleaseSubscriber(fv5 fv5Var, o14<? super T> o14Var, o14<? super Throwable> o14Var2, Cdo cdo) {
        this.onNext = o14Var;
        this.onError = o14Var2;
        this.onComplete = cdo;
        this.composite = new AtomicReference<>(fv5Var);
    }

    @Override // io.reactivex.rxjava3.disposables.a
    public void dispose() {
        SubscriptionHelper.cancel(this);
        removeSelf();
    }

    public boolean hasCustomOnError() {
        return this.onError != Functions.ON_ERROR_MISSING;
    }

    @Override // io.reactivex.rxjava3.disposables.a
    public boolean isDisposed() {
        return SubscriptionHelper.CANCELLED == get();
    }

    @Override // com.oplus.aiunit.vision.v2j
    public void onComplete() {
        c3j c3jVar = get();
        SubscriptionHelper subscriptionHelper = SubscriptionHelper.CANCELLED;
        if (c3jVar != subscriptionHelper) {
            lazySet(subscriptionHelper);
            try {
                this.onComplete.run();
            } catch (Throwable th) {
                hu6.b(th);
                g4g.u(th);
            }
        }
        removeSelf();
    }

    @Override // com.oplus.aiunit.vision.v2j
    public void onError(Throwable th) {
        c3j c3jVar = get();
        SubscriptionHelper subscriptionHelper = SubscriptionHelper.CANCELLED;
        if (c3jVar != subscriptionHelper) {
            lazySet(subscriptionHelper);
            try {
                this.onError.accept(th);
            } catch (Throwable th2) {
                hu6.b(th2);
                g4g.u(new CompositeException(th, th2));
            }
        } else {
            g4g.u(th);
        }
        removeSelf();
    }

    @Override // com.oplus.aiunit.vision.v2j
    public void onNext(T t) {
        if (get() != SubscriptionHelper.CANCELLED) {
            try {
                this.onNext.accept(t);
            } catch (Throwable th) {
                hu6.b(th);
                get().cancel();
                onError(th);
            }
        }
    }

    @Override // com.oplus.aiunit.vision.vu7, com.oplus.aiunit.vision.v2j
    public void onSubscribe(c3j c3jVar) {
        if (SubscriptionHelper.setOnce(this, c3jVar)) {
            c3jVar.request(Long.MAX_VALUE);
        }
    }

    public void removeSelf() {
        fv5 andSet = this.composite.getAndSet(null);
        if (andSet != null) {
            andSet.b(this);
        }
    }
}
