package io.reactivex.rxjava3.internal.operators.maybe;

import com.oplus.aiunit.vision.lob;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
final class MaybeTimeoutMaybe$TimeoutOtherMaybeObserver<T, U> extends AtomicReference<io.reactivex.rxjava3.disposables.a> implements lob<Object> {
    private static final long serialVersionUID = 8663801314800248617L;
    final MaybeTimeoutMaybe$TimeoutMainMaybeObserver<T, U> parent;

    public MaybeTimeoutMaybe$TimeoutOtherMaybeObserver(MaybeTimeoutMaybe$TimeoutMainMaybeObserver<T, U> maybeTimeoutMaybe$TimeoutMainMaybeObserver) {
        this.parent = maybeTimeoutMaybe$TimeoutMainMaybeObserver;
    }

    @Override // com.oplus.aiunit.vision.lob
    public void onComplete() {
        this.parent.otherComplete();
    }

    @Override // com.oplus.aiunit.vision.lob
    public void onError(Throwable th) {
        this.parent.otherError(th);
    }

    @Override // com.oplus.aiunit.vision.lob
    public void onSubscribe(io.reactivex.rxjava3.disposables.a aVar) {
        DisposableHelper.setOnce(this, aVar);
    }

    @Override // com.oplus.aiunit.vision.lob, com.oplus.aiunit.vision.l6h
    public void onSuccess(Object obj) {
        this.parent.otherComplete();
    }
}
