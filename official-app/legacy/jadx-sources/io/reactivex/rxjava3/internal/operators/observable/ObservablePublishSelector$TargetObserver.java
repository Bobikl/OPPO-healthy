package io.reactivex.rxjava3.internal.operators.observable;

import com.oplus.aiunit.vision.aed;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
final class ObservablePublishSelector$TargetObserver<R> extends AtomicReference<io.reactivex.rxjava3.disposables.a> implements aed<R>, io.reactivex.rxjava3.disposables.a {
    private static final long serialVersionUID = 854110278590336484L;
    final aed<? super R> downstream;
    io.reactivex.rxjava3.disposables.a upstream;

    public ObservablePublishSelector$TargetObserver(aed<? super R> aedVar) {
        this.downstream = aedVar;
    }

    @Override // io.reactivex.rxjava3.disposables.a
    public void dispose() {
        this.upstream.dispose();
        DisposableHelper.dispose(this);
    }

    @Override // io.reactivex.rxjava3.disposables.a
    public boolean isDisposed() {
        return this.upstream.isDisposed();
    }

    @Override // com.oplus.aiunit.vision.aed
    public void onComplete() {
        DisposableHelper.dispose(this);
        this.downstream.onComplete();
    }

    @Override // com.oplus.aiunit.vision.aed
    public void onError(Throwable th) {
        DisposableHelper.dispose(this);
        this.downstream.onError(th);
    }

    @Override // com.oplus.aiunit.vision.aed
    public void onNext(R r) {
        this.downstream.onNext(r);
    }

    @Override // com.oplus.aiunit.vision.aed
    public void onSubscribe(io.reactivex.rxjava3.disposables.a aVar) {
        if (DisposableHelper.validate(this.upstream, aVar)) {
            this.upstream = aVar;
            this.downstream.onSubscribe(this);
        }
    }
}
