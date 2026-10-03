package io.reactivex.internal.operators.maybe;

import com.oplus.aiunit.vision.cv5;
import com.oplus.aiunit.vision.mob;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
final class MaybeZipArray$ZipMaybeObserver<T> extends AtomicReference<cv5> implements mob<T> {
    private static final long serialVersionUID = 3323743579927613702L;
    final int index;
    final MaybeZipArray$ZipCoordinator<T, ?> parent;

    public MaybeZipArray$ZipMaybeObserver(MaybeZipArray$ZipCoordinator<T, ?> maybeZipArray$ZipCoordinator, int i) {
        this.parent = maybeZipArray$ZipCoordinator;
        this.index = i;
    }

    public void dispose() {
        DisposableHelper.dispose(this);
    }

    @Override // com.oplus.aiunit.vision.mob
    public void onComplete() {
        this.parent.innerComplete(this.index);
    }

    @Override // com.oplus.aiunit.vision.mob
    public void onError(Throwable th) {
        this.parent.innerError(th, this.index);
    }

    @Override // com.oplus.aiunit.vision.mob
    public void onSubscribe(cv5 cv5Var) {
        DisposableHelper.setOnce(this, cv5Var);
    }

    @Override // com.oplus.aiunit.vision.mob
    public void onSuccess(T t) {
        this.parent.innerSuccess(t, this.index);
    }
}
