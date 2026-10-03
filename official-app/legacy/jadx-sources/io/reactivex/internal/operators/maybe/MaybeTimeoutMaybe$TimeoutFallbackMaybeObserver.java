package io.reactivex.internal.operators.maybe;

import com.oplus.aiunit.vision.cv5;
import com.oplus.aiunit.vision.mob;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
final class MaybeTimeoutMaybe$TimeoutFallbackMaybeObserver<T> extends AtomicReference<cv5> implements mob<T> {
    private static final long serialVersionUID = 8663801314800248617L;
    final mob<? super T> downstream;

    public MaybeTimeoutMaybe$TimeoutFallbackMaybeObserver(mob<? super T> mobVar) {
        this.downstream = mobVar;
    }

    @Override // com.oplus.aiunit.vision.mob
    public void onComplete() {
        this.downstream.onComplete();
    }

    @Override // com.oplus.aiunit.vision.mob
    public void onError(Throwable th) {
        this.downstream.onError(th);
    }

    @Override // com.oplus.aiunit.vision.mob
    public void onSubscribe(cv5 cv5Var) {
        DisposableHelper.setOnce(this, cv5Var);
    }

    @Override // com.oplus.aiunit.vision.mob
    public void onSuccess(T t) {
        this.downstream.onSuccess(t);
    }
}
