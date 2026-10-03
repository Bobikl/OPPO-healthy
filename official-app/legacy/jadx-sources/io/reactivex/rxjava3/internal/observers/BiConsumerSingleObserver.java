package io.reactivex.rxjava3.internal.observers;

import com.oplus.aiunit.vision.g4g;
import com.oplus.aiunit.vision.hu6;
import com.oplus.aiunit.vision.kd1;
import com.oplus.aiunit.vision.l6h;
import io.reactivex.rxjava3.disposables.a;
import io.reactivex.rxjava3.exceptions.CompositeException;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
public final class BiConsumerSingleObserver<T> extends AtomicReference<a> implements l6h<T>, a {
    private static final long serialVersionUID = 4943102778943297569L;
    final kd1<? super T, ? super Throwable> onCallback;

    public BiConsumerSingleObserver(kd1<? super T, ? super Throwable> kd1Var) {
        this.onCallback = kd1Var;
    }

    @Override // io.reactivex.rxjava3.disposables.a
    public void dispose() {
        DisposableHelper.dispose(this);
    }

    @Override // io.reactivex.rxjava3.disposables.a
    public boolean isDisposed() {
        return get() == DisposableHelper.DISPOSED;
    }

    @Override // com.oplus.aiunit.vision.l6h
    public void onError(Throwable th) {
        try {
            lazySet(DisposableHelper.DISPOSED);
            this.onCallback.accept(null, th);
        } catch (Throwable th2) {
            hu6.b(th2);
            g4g.u(new CompositeException(th, th2));
        }
    }

    @Override // com.oplus.aiunit.vision.l6h
    public void onSubscribe(a aVar) {
        DisposableHelper.setOnce(this, aVar);
    }

    @Override // com.oplus.aiunit.vision.l6h
    public void onSuccess(T t) {
        try {
            lazySet(DisposableHelper.DISPOSED);
            this.onCallback.accept(t, null);
        } catch (Throwable th) {
            hu6.b(th);
            g4g.u(th);
        }
    }
}
