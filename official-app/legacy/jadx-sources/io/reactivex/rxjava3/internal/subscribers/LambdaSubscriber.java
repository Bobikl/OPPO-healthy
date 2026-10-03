package io.reactivex.rxjava3.internal.subscribers;

import com.oplus.aiunit.vision.Cdo;
import com.oplus.aiunit.vision.c3j;
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
public final class LambdaSubscriber<T> extends AtomicReference<c3j> implements vu7<T>, c3j, a {
    private static final long serialVersionUID = -7251123623727029452L;
    final Cdo onComplete;
    final o14<? super Throwable> onError;
    final o14<? super T> onNext;
    final o14<? super c3j> onSubscribe;

    public LambdaSubscriber(o14<? super T> o14Var, o14<? super Throwable> o14Var2, Cdo cdo, o14<? super c3j> o14Var3) {
        this.onNext = o14Var;
        this.onError = o14Var2;
        this.onComplete = cdo;
        this.onSubscribe = o14Var3;
    }

    @Override // com.oplus.aiunit.vision.c3j
    public void cancel() {
        SubscriptionHelper.cancel(this);
    }

    @Override // io.reactivex.rxjava3.disposables.a
    public void dispose() {
        cancel();
    }

    public boolean hasCustomOnError() {
        return this.onError != Functions.ON_ERROR_MISSING;
    }

    @Override // io.reactivex.rxjava3.disposables.a
    public boolean isDisposed() {
        return get() == SubscriptionHelper.CANCELLED;
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
    }

    @Override // com.oplus.aiunit.vision.v2j
    public void onError(Throwable th) {
        c3j c3jVar = get();
        SubscriptionHelper subscriptionHelper = SubscriptionHelper.CANCELLED;
        if (c3jVar == subscriptionHelper) {
            g4g.u(th);
            return;
        }
        lazySet(subscriptionHelper);
        try {
            this.onError.accept(th);
        } catch (Throwable th2) {
            hu6.b(th2);
            g4g.u(new CompositeException(th, th2));
        }
    }

    @Override // com.oplus.aiunit.vision.v2j
    public void onNext(T t) {
        if (isDisposed()) {
            return;
        }
        try {
            this.onNext.accept(t);
        } catch (Throwable th) {
            hu6.b(th);
            get().cancel();
            onError(th);
        }
    }

    @Override // com.oplus.aiunit.vision.vu7, com.oplus.aiunit.vision.v2j
    public void onSubscribe(c3j c3jVar) {
        if (SubscriptionHelper.setOnce(this, c3jVar)) {
            try {
                this.onSubscribe.accept(this);
            } catch (Throwable th) {
                hu6.b(th);
                c3jVar.cancel();
                onError(th);
            }
        }
    }

    @Override // com.oplus.aiunit.vision.c3j
    public void request(long j2) {
        get().request(j2);
    }
}
