package io.reactivex.internal.operators.single;

import com.oplus.aiunit.vision.abd;
import com.oplus.aiunit.vision.cv5;
import com.oplus.aiunit.vision.dvf;
import com.oplus.aiunit.vision.iu6;
import com.oplus.aiunit.vision.j08;
import com.oplus.aiunit.vision.m6h;
import com.oplus.aiunit.vision.t6h;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
final class SingleResumeNext$ResumeMainSingleObserver<T> extends AtomicReference<cv5> implements m6h<T>, cv5 {
    private static final long serialVersionUID = -5314538511045349925L;
    final m6h<? super T> downstream;
    final j08<? super Throwable, ? extends t6h<? extends T>> nextFunction;

    public SingleResumeNext$ResumeMainSingleObserver(m6h<? super T> m6hVar, j08<? super Throwable, ? extends t6h<? extends T>> j08Var) {
        this.downstream = m6hVar;
        this.nextFunction = j08Var;
    }

    @Override // com.oplus.aiunit.vision.cv5
    public void dispose() {
        DisposableHelper.dispose(this);
    }

    @Override // com.oplus.aiunit.vision.cv5
    public boolean isDisposed() {
        return DisposableHelper.isDisposed(get());
    }

    @Override // com.oplus.aiunit.vision.m6h
    public void onError(Throwable th) {
        try {
            ((t6h) abd.d(this.nextFunction.apply(th), "The nextFunction returned a null SingleSource.")).a(new dvf(this, this.downstream));
        } catch (Throwable th2) {
            iu6.b(th2);
            this.downstream.onError(new CompositeException(th, th2));
        }
    }

    @Override // com.oplus.aiunit.vision.m6h
    public void onSubscribe(cv5 cv5Var) {
        if (DisposableHelper.setOnce(this, cv5Var)) {
            this.downstream.onSubscribe(this);
        }
    }

    @Override // com.oplus.aiunit.vision.m6h
    public void onSuccess(T t) {
        this.downstream.onSuccess(t);
    }
}
