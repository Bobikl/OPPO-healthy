package io.reactivex.internal.operators.maybe;

import com.oplus.aiunit.vision.cv5;
import com.oplus.aiunit.vision.mob;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
final class MaybeEqualSingle$EqualObserver<T> extends AtomicReference<cv5> implements mob<T> {
    private static final long serialVersionUID = -3031974433025990931L;
    final MaybeEqualSingle$EqualCoordinator<T> parent;
    Object value;

    public MaybeEqualSingle$EqualObserver(MaybeEqualSingle$EqualCoordinator<T> maybeEqualSingle$EqualCoordinator) {
        this.parent = maybeEqualSingle$EqualCoordinator;
    }

    public void dispose() {
        DisposableHelper.dispose(this);
    }

    @Override // com.oplus.aiunit.vision.mob
    public void onComplete() {
        this.parent.done();
    }

    @Override // com.oplus.aiunit.vision.mob
    public void onError(Throwable th) {
        this.parent.error(this, th);
    }

    @Override // com.oplus.aiunit.vision.mob
    public void onSubscribe(cv5 cv5Var) {
        DisposableHelper.setOnce(this, cv5Var);
    }

    @Override // com.oplus.aiunit.vision.mob
    public void onSuccess(T t) {
        this.value = t;
        this.parent.done();
    }
}
