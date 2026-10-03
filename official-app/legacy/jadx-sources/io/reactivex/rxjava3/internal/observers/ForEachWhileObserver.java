package io.reactivex.rxjava3.internal.observers;

import com.oplus.aiunit.vision.Cdo;
import com.oplus.aiunit.vision.aed;
import com.oplus.aiunit.vision.g4g;
import com.oplus.aiunit.vision.hu6;
import com.oplus.aiunit.vision.mpe;
import com.oplus.aiunit.vision.o14;
import io.reactivex.rxjava3.disposables.a;
import io.reactivex.rxjava3.exceptions.CompositeException;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
public final class ForEachWhileObserver<T> extends AtomicReference<a> implements aed<T>, a {
    private static final long serialVersionUID = -4403180040475402120L;
    boolean done;
    final Cdo onComplete;
    final o14<? super Throwable> onError;
    final mpe<? super T> onNext;

    public ForEachWhileObserver(mpe<? super T> mpeVar, o14<? super Throwable> o14Var, Cdo cdo) {
        this.onNext = mpeVar;
        this.onError = o14Var;
        this.onComplete = cdo;
    }

    @Override // io.reactivex.rxjava3.disposables.a
    public void dispose() {
        DisposableHelper.dispose(this);
    }

    @Override // io.reactivex.rxjava3.disposables.a
    public boolean isDisposed() {
        return DisposableHelper.isDisposed(get());
    }

    @Override // com.oplus.aiunit.vision.aed
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

    @Override // com.oplus.aiunit.vision.aed
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

    @Override // com.oplus.aiunit.vision.aed
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

    @Override // com.oplus.aiunit.vision.aed
    public void onSubscribe(a aVar) {
        DisposableHelper.setOnce(this, aVar);
    }
}
