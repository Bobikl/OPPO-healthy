package io.reactivex.internal.observers;

import com.oplus.aiunit.vision.bs3;
import com.oplus.aiunit.vision.cv5;
import com.oplus.aiunit.vision.eo;
import com.oplus.aiunit.vision.h4g;
import com.oplus.aiunit.vision.iu6;
import com.oplus.aiunit.vision.p14;
import io.reactivex.exceptions.OnErrorNotImplementedException;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
public final class CallbackCompletableObserver extends AtomicReference<cv5> implements bs3, cv5, p14<Throwable> {
    private static final long serialVersionUID = -4361286194466301354L;
    final eo onComplete;
    final p14<? super Throwable> onError;

    public CallbackCompletableObserver(eo eoVar) {
        this.onError = this;
        this.onComplete = eoVar;
    }

    @Override // com.oplus.aiunit.vision.cv5
    public void dispose() {
        DisposableHelper.dispose(this);
    }

    public boolean hasCustomOnError() {
        return this.onError != this;
    }

    @Override // com.oplus.aiunit.vision.cv5
    public boolean isDisposed() {
        return get() == DisposableHelper.DISPOSED;
    }

    @Override // com.oplus.aiunit.vision.bs3
    public void onComplete() {
        try {
            this.onComplete.run();
        } catch (Throwable th) {
            iu6.b(th);
            h4g.r(th);
        }
        lazySet(DisposableHelper.DISPOSED);
    }

    @Override // com.oplus.aiunit.vision.bs3
    public void onError(Throwable th) {
        try {
            this.onError.accept(th);
        } catch (Throwable th2) {
            iu6.b(th2);
            h4g.r(th2);
        }
        lazySet(DisposableHelper.DISPOSED);
    }

    @Override // com.oplus.aiunit.vision.bs3
    public void onSubscribe(cv5 cv5Var) {
        DisposableHelper.setOnce(this, cv5Var);
    }

    @Override // com.oplus.aiunit.vision.p14
    public void accept(Throwable th) {
        h4g.r(new OnErrorNotImplementedException(th));
    }

    public CallbackCompletableObserver(p14<? super Throwable> p14Var, eo eoVar) {
        this.onError = p14Var;
        this.onComplete = eoVar;
    }
}
