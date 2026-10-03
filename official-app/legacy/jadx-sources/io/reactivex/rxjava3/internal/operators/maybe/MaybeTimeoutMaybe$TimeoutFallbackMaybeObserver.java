package io.reactivex.rxjava3.internal.operators.maybe;

import com.oplus.aiunit.vision.lob;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
final class MaybeTimeoutMaybe$TimeoutFallbackMaybeObserver<T> extends AtomicReference<io.reactivex.rxjava3.disposables.a> implements lob<T> {
    private static final long serialVersionUID = 8663801314800248617L;
    final lob<? super T> downstream;

    public MaybeTimeoutMaybe$TimeoutFallbackMaybeObserver(lob<? super T> lobVar) {
        this.downstream = lobVar;
    }

    @Override // com.oplus.aiunit.vision.lob
    public void onComplete() {
        this.downstream.onComplete();
    }

    @Override // com.oplus.aiunit.vision.lob
    public void onError(Throwable th) {
        this.downstream.onError(th);
    }

    @Override // com.oplus.aiunit.vision.lob
    public void onSubscribe(io.reactivex.rxjava3.disposables.a aVar) {
        DisposableHelper.setOnce(this, aVar);
    }

    @Override // com.oplus.aiunit.vision.lob, com.oplus.aiunit.vision.l6h
    public void onSuccess(T t) {
        this.downstream.onSuccess(t);
    }
}
