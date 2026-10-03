package io.reactivex.rxjava3.internal.observers;

import com.oplus.aiunit.vision.Cdo;
import com.oplus.aiunit.vision.as3;
import com.oplus.aiunit.vision.g4g;
import com.oplus.aiunit.vision.hu6;
import com.oplus.aiunit.vision.o14;
import io.reactivex.rxjava3.disposables.a;
import io.reactivex.rxjava3.exceptions.OnErrorNotImplementedException;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
public final class CallbackCompletableObserver extends AtomicReference<a> implements as3, a, o14<Throwable> {
    private static final long serialVersionUID = -4361286194466301354L;
    final Cdo onComplete;
    final o14<? super Throwable> onError;

    public CallbackCompletableObserver(Cdo cdo) {
        this.onError = this;
        this.onComplete = cdo;
    }

    @Override // io.reactivex.rxjava3.disposables.a
    public void dispose() {
        DisposableHelper.dispose(this);
    }

    public boolean hasCustomOnError() {
        return this.onError != this;
    }

    @Override // io.reactivex.rxjava3.disposables.a
    public boolean isDisposed() {
        return get() == DisposableHelper.DISPOSED;
    }

    @Override // com.oplus.aiunit.vision.as3
    public void onComplete() {
        try {
            this.onComplete.run();
        } catch (Throwable th) {
            hu6.b(th);
            g4g.u(th);
        }
        lazySet(DisposableHelper.DISPOSED);
    }

    @Override // com.oplus.aiunit.vision.as3
    public void onError(Throwable th) {
        try {
            this.onError.accept(th);
        } catch (Throwable th2) {
            hu6.b(th2);
            g4g.u(th2);
        }
        lazySet(DisposableHelper.DISPOSED);
    }

    @Override // com.oplus.aiunit.vision.as3
    public void onSubscribe(a aVar) {
        DisposableHelper.setOnce(this, aVar);
    }

    @Override // com.oplus.aiunit.vision.o14
    public void accept(Throwable th) {
        g4g.u(new OnErrorNotImplementedException(th));
    }

    public CallbackCompletableObserver(o14<? super Throwable> o14Var, Cdo cdo) {
        this.onError = o14Var;
        this.onComplete = cdo;
    }
}
