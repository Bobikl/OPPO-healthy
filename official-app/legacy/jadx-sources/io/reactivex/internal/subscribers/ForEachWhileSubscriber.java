package io.reactivex.internal.subscribers;

import com.oplus.aiunit.vision.c3j;
import com.oplus.aiunit.vision.cv5;
import com.oplus.aiunit.vision.eo;
import com.oplus.aiunit.vision.h4g;
import com.oplus.aiunit.vision.iu6;
import com.oplus.aiunit.vision.npe;
import com.oplus.aiunit.vision.p14;
import com.oplus.aiunit.vision.wu7;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
public final class ForEachWhileSubscriber<T> extends AtomicReference<c3j> implements wu7<T>, cv5 {
    private static final long serialVersionUID = -4403180040475402120L;
    boolean done;
    final eo onComplete;
    final p14<? super Throwable> onError;
    final npe<? super T> onNext;

    public ForEachWhileSubscriber(npe<? super T> npeVar, p14<? super Throwable> p14Var, eo eoVar) {
        this.onNext = npeVar;
        this.onError = p14Var;
        this.onComplete = eoVar;
    }

    @Override // com.oplus.aiunit.vision.cv5
    public void dispose() {
        SubscriptionHelper.cancel(this);
    }

    @Override // com.oplus.aiunit.vision.cv5
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
            iu6.b(th);
            h4g.r(th);
        }
    }

    @Override // com.oplus.aiunit.vision.v2j
    public void onError(Throwable th) {
        if (this.done) {
            h4g.r(th);
            return;
        }
        this.done = true;
        try {
            this.onError.accept(th);
        } catch (Throwable th2) {
            iu6.b(th2);
            h4g.r(new CompositeException(th, th2));
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
            iu6.b(th);
            dispose();
            onError(th);
        }
    }

    @Override // com.oplus.aiunit.vision.wu7, com.oplus.aiunit.vision.v2j
    public void onSubscribe(c3j c3jVar) {
        SubscriptionHelper.setOnce(this, c3jVar, Long.MAX_VALUE);
    }
}
