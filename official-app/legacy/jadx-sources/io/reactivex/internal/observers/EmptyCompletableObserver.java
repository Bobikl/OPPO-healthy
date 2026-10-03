package io.reactivex.internal.observers;

import com.oplus.aiunit.vision.bs3;
import com.oplus.aiunit.vision.cv5;
import com.oplus.aiunit.vision.h4g;
import io.reactivex.exceptions.OnErrorNotImplementedException;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
public final class EmptyCompletableObserver extends AtomicReference<cv5> implements bs3, cv5 {
    private static final long serialVersionUID = -7545121636549663526L;

    @Override // com.oplus.aiunit.vision.cv5
    public void dispose() {
        DisposableHelper.dispose(this);
    }

    public boolean hasCustomOnError() {
        return false;
    }

    @Override // com.oplus.aiunit.vision.cv5
    public boolean isDisposed() {
        return get() == DisposableHelper.DISPOSED;
    }

    @Override // com.oplus.aiunit.vision.bs3
    public void onComplete() {
        lazySet(DisposableHelper.DISPOSED);
    }

    @Override // com.oplus.aiunit.vision.bs3
    public void onError(Throwable th) {
        lazySet(DisposableHelper.DISPOSED);
        h4g.r(new OnErrorNotImplementedException(th));
    }

    @Override // com.oplus.aiunit.vision.bs3
    public void onSubscribe(cv5 cv5Var) {
        DisposableHelper.setOnce(this, cv5Var);
    }
}
