package io.reactivex.rxjava3.internal.subscribers;

import com.oplus.aiunit.vision.Cdo;
import com.oplus.aiunit.vision.c3j;
import com.oplus.aiunit.vision.g4g;
import com.oplus.aiunit.vision.hu6;
import com.oplus.aiunit.vision.mpe;
import com.oplus.aiunit.vision.o14;
import com.oplus.aiunit.vision.vu7;
import io.reactivex.rxjava3.disposables.a;
import io.reactivex.rxjava3.exceptions.CompositeException;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
public final class ForEachWhileSubscriber<T> extends AtomicReference<c3j> implements vu7<T>, a {
    private static final long serialVersionUID = -4403180040475402120L;
    boolean done;
    final Cdo onComplete;
    final o14<? super Throwable> onError;
    final mpe<? super T> onNext;

    public ForEachWhileSubscriber(mpe<? super T> mpeVar, o14<? super Throwable> o14Var, Cdo cdo) {
        this.onNext = mpeVar;
        this.onError = o14Var;
        this.onComplete = cdo;
    }

    @Override // io.reactivex.rxjava3.disposables.a
    public void dispose() {
        SubscriptionHelper.cancel(this);
    }

    @Override // io.reactivex.rxjava3.disposables.a
    public boolean isDisposed() {
        return get() == SubscriptionHelper.CANCELLED;
    }

    @Override // com.oplus.aiunit.vision.v2j
    public void onComplete() {
        if (this.done) {
            return;
        }
        this.done = true;
        try {
            this.onComplete.run();
        } catch (Throwable th) {
            hu6.b(th);
            g4g.u(th);
        }
    }

    @Override // com.oplus.aiunit.vision.v2j
    public void onError(Throwable th) {
        if (this.done) {
            g4g.u(th);
            return;
        }
        this.done = true;
        try {
            this.onError.accept(th);
        } catch (Throwable th2) {
            hu6.b(th2);
            g4g.u(new CompositeException(th, th2));
        }
    }

    @Override // com.oplus.aiunit.vision.v2j
    public void onNext(T t) {
        if (this.done) {
            return;
        }
        try {
            if (this.onNext.test(t)) {
                return;
            }
            dispose();
            onComplete();
        } catch (Throwable th) {
            hu6.b(th);
            dispose();
            onError(th);
        }
    }

    @Override // com.oplus.aiunit.vision.vu7, com.oplus.aiunit.vision.v2j
    public void onSubscribe(c3j c3jVar) {
        SubscriptionHelper.setOnce(this, c3jVar, Long.MAX_VALUE);
    }
}
