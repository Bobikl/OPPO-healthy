package io.reactivex.internal.operators.maybe;

import com.oplus.aiunit.vision.cv5;
import com.oplus.aiunit.vision.mob;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
final class MaybeTimeoutMaybe$TimeoutOtherMaybeObserver<T, U> extends AtomicReference<cv5> implements mob<Object> {
    private static final long serialVersionUID = 8663801314800248617L;
    final MaybeTimeoutMaybe$TimeoutMainMaybeObserver<T, U> parent;

    public MaybeTimeoutMaybe$TimeoutOtherMaybeObserver(MaybeTimeoutMaybe$TimeoutMainMaybeObserver<T, U> maybeTimeoutMaybe$TimeoutMainMaybeObserver) {
        this.parent = maybeTimeoutMaybe$TimeoutMainMaybeObserver;
    }

    @Override // com.oplus.aiunit.vision.mob
    public void onComplete() {
        this.parent.otherComplete();
    }

    @Override // com.oplus.aiunit.vision.mob
    public void onError(Throwable th) {
        this.parent.otherError(th);
    }

    @Override // com.oplus.aiunit.vision.mob
    public void onSubscribe(cv5 cv5Var) {
        DisposableHelper.setOnce(this, cv5Var);
    }

    @Override // com.oplus.aiunit.vision.mob
    public void onSuccess(Object obj) {
        this.parent.otherComplete();
    }
}
