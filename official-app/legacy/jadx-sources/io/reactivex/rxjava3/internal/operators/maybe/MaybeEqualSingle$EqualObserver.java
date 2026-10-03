package io.reactivex.rxjava3.internal.operators.maybe;

import com.oplus.aiunit.vision.lob;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
final class MaybeEqualSingle$EqualObserver<T> extends AtomicReference<io.reactivex.rxjava3.disposables.a> implements lob<T> {
    private static final long serialVersionUID = -3031974433025990931L;
    final MaybeEqualSingle$EqualCoordinator<T> parent;
    Object value;

    public MaybeEqualSingle$EqualObserver(MaybeEqualSingle$EqualCoordinator<T> maybeEqualSingle$EqualCoordinator) {
        this.parent = maybeEqualSingle$EqualCoordinator;
    }

    public void dispose() {
        DisposableHelper.dispose(this);
    }

    @Override // com.oplus.aiunit.vision.lob
    public void onComplete() {
        this.parent.done();
    }

    @Override // com.oplus.aiunit.vision.lob
    public void onError(Throwable th) {
        this.parent.error(this, th);
    }

    @Override // com.oplus.aiunit.vision.lob
    public void onSubscribe(io.reactivex.rxjava3.disposables.a aVar) {
        DisposableHelper.setOnce(this, aVar);
    }

    @Override // com.oplus.aiunit.vision.lob, com.oplus.aiunit.vision.l6h
    public void onSuccess(T t) {
        this.value = t;
        this.parent.done();
    }
}
