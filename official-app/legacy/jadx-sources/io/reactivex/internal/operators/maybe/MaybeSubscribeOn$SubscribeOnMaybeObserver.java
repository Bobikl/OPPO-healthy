package io.reactivex.internal.operators.maybe;

import com.oplus.aiunit.vision.cv5;
import com.oplus.aiunit.vision.mob;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.SequentialDisposable;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
final class MaybeSubscribeOn$SubscribeOnMaybeObserver<T> extends AtomicReference<cv5> implements mob<T>, cv5 {
    private static final long serialVersionUID = 8571289934935992137L;
    final mob<? super T> downstream;
    final SequentialDisposable task = new SequentialDisposable();

    public MaybeSubscribeOn$SubscribeOnMaybeObserver(mob<? super T> mobVar) {
        this.downstream = mobVar;
    }

    @Override // com.oplus.aiunit.vision.cv5
    public void dispose() {
        DisposableHelper.dispose(this);
        this.task.dispose();
    }

    @Override // com.oplus.aiunit.vision.cv5
    public boolean isDisposed() {
        return DisposableHelper.isDisposed(get());
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
