package io.reactivex.internal.subscribers;

import com.oplus.aiunit.vision.c3j;
import com.oplus.aiunit.vision.cv5;
import com.oplus.aiunit.vision.eo;
import com.oplus.aiunit.vision.h4g;
import com.oplus.aiunit.vision.iu6;
import com.oplus.aiunit.vision.p14;
import com.oplus.aiunit.vision.wu7;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.internal.functions.Functions;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
public final class LambdaSubscriber<T> extends AtomicReference<c3j> implements wu7<T>, c3j, cv5 {
    private static final long serialVersionUID = -7251123623727029452L;
    final eo onComplete;
    final p14<? super Throwable> onError;
    final p14<? super T> onNext;
    final p14<? super c3j> onSubscribe;

    public LambdaSubscriber(p14<? super T> p14Var, p14<? super Throwable> p14Var2, eo eoVar, p14<? super c3j> p14Var3) {
        this.onNext = p14Var;
        this.onError = p14Var2;
        this.onComplete = eoVar;
        this.onSubscribe = p14Var3;
    }

    @Override // com.oplus.aiunit.vision.c3j
    public void cancel() {
        SubscriptionHelper.cancel(this);
    }

    @Override // com.oplus.aiunit.vision.cv5
    public void dispose() {
        cancel();
    }

    public boolean hasCustomOnError() {
        return this.onError != Functions.ON_ERROR_MISSING;
    }

    @Override // com.oplus.aiunit.vision.cv5
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
                iu6.b(th);
                h4g.r(th);
            }
        }
    }

    @Override // com.oplus.aiunit.vision.v2j
    public void onError(Throwable th) {
        c3j c3jVar = get();
        SubscriptionHelper subscriptionHelper = SubscriptionHelper.CANCELLED;
        if (c3jVar == subscriptionHelper) {
            h4g.r(th);
            return;
        }
        lazySet(subscriptionHelper);
        try {
            this.onError.accept(th);
        } catch (Throwable th2) {
            iu6.b(th2);
            h4g.r(new CompositeException(th, th2));
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
            iu6.b(th);
            get().cancel();
            onError(th);
        }
    }

    @Override // com.oplus.aiunit.vision.wu7, com.oplus.aiunit.vision.v2j
    public void onSubscribe(c3j c3jVar) {
        if (SubscriptionHelper.setOnce(this, c3jVar)) {
            try {
                this.onSubscribe.accept(this);
            } catch (Throwable th) {
                iu6.b(th);
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
