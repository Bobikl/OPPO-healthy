package io.reactivex.rxjava3.internal.observers;

import com.oplus.aiunit.vision.as3;
import com.oplus.aiunit.vision.g4g;
import io.reactivex.rxjava3.disposables.a;
import io.reactivex.rxjava3.exceptions.OnErrorNotImplementedException;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
public final class EmptyCompletableObserver extends AtomicReference<a> implements as3, a {
    private static final long serialVersionUID = -7545121636549663526L;

    @Override // io.reactivex.rxjava3.disposables.a
    public void dispose() {
        DisposableHelper.dispose(this);
    }

    public boolean hasCustomOnError() {
        return false;
    }

    @Override // io.reactivex.rxjava3.disposables.a
    public boolean isDisposed() {
        return get() == DisposableHelper.DISPOSED;
    }

    @Override // com.oplus.aiunit.vision.as3
    public void onComplete() {
        lazySet(DisposableHelper.DISPOSED);
    }

    @Override // com.oplus.aiunit.vision.as3
    public void onError(Throwable th) {
        lazySet(DisposableHelper.DISPOSED);
        g4g.u(new OnErrorNotImplementedException(th));
    }

    @Override // com.oplus.aiunit.vision.as3
    public void onSubscribe(a aVar) {
        DisposableHelper.setOnce(this, aVar);
    }
}
