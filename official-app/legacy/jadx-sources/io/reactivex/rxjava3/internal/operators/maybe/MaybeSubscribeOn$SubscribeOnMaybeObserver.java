package io.reactivex.rxjava3.internal.operators.maybe;

import com.oplus.aiunit.vision.lob;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.disposables.SequentialDisposable;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
final class MaybeSubscribeOn$SubscribeOnMaybeObserver<T> extends AtomicReference<io.reactivex.rxjava3.disposables.a> implements lob<T>, io.reactivex.rxjava3.disposables.a {
    private static final long serialVersionUID = 8571289934935992137L;
    final lob<? super T> downstream;
    final SequentialDisposable task = new SequentialDisposable();

    public MaybeSubscribeOn$SubscribeOnMaybeObserver(lob<? super T> lobVar) {
        this.downstream = lobVar;
    }

    @Override // io.reactivex.rxjava3.disposables.a
    public void dispose() {
        DisposableHelper.dispose(this);
        this.task.dispose();
    }

    @Override // io.reactivex.rxjava3.disposables.a
    public boolean isDisposed() {
        return DisposableHelper.isDisposed(get());
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
