package io.reactivex.rxjava3.internal.operators.observable;

import com.oplus.aiunit.vision.aed;
import com.oplus.aiunit.vision.g4g;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
final class ObservableTimeout$TimeoutConsumer extends AtomicReference<io.reactivex.rxjava3.disposables.a> implements aed<Object>, io.reactivex.rxjava3.disposables.a {
    private static final long serialVersionUID = 8708641127342403073L;
    final long idx;
    final g parent;

    public ObservableTimeout$TimeoutConsumer(long j2, g gVar) {
        this.idx = j2;
        this.parent = gVar;
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
        io.reactivex.rxjava3.disposables.a aVar = get();
        DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
        if (aVar != disposableHelper) {
            lazySet(disposableHelper);
            this.parent.onTimeout(this.idx);
        }
    }

    @Override // com.oplus.aiunit.vision.aed
    public void onError(Throwable th) {
        io.reactivex.rxjava3.disposables.a aVar = get();
        DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
        if (aVar == disposableHelper) {
            g4g.u(th);
        } else {
            lazySet(disposableHelper);
            this.parent.onTimeoutError(this.idx, th);
        }
    }

    @Override // com.oplus.aiunit.vision.aed
    public void onNext(Object obj) {
        io.reactivex.rxjava3.disposables.a aVar = get();
        DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
        if (aVar != disposableHelper) {
            aVar.dispose();
            lazySet(disposableHelper);
            this.parent.onTimeout(this.idx);
        }
    }

    @Override // com.oplus.aiunit.vision.aed
    public void onSubscribe(io.reactivex.rxjava3.disposables.a aVar) {
        DisposableHelper.setOnce(this, aVar);
    }
}
