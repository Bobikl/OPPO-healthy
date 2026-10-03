package io.reactivex.internal.operators.completable;

import com.oplus.aiunit.vision.bs3;
import com.oplus.aiunit.vision.cv5;
import com.oplus.aiunit.vision.es3;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.SequentialDisposable;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
final class CompletableSubscribeOn$SubscribeOnObserver extends AtomicReference<cv5> implements bs3, cv5, Runnable {
    private static final long serialVersionUID = 7000911171163930287L;
    final bs3 downstream;
    final es3 source;
    final SequentialDisposable task = new SequentialDisposable();

    public CompletableSubscribeOn$SubscribeOnObserver(bs3 bs3Var, es3 es3Var) {
        this.downstream = bs3Var;
        this.source = es3Var;
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

    @Override // com.oplus.aiunit.vision.bs3
    public void onComplete() {
        this.downstream.onComplete();
    }

    @Override // com.oplus.aiunit.vision.bs3
    public void onError(Throwable th) {
        this.downstream.onError(th);
    }

    @Override // com.oplus.aiunit.vision.bs3
    public void onSubscribe(cv5 cv5Var) {
        DisposableHelper.setOnce(this, cv5Var);
    }

    @Override // java.lang.Runnable
    public void run() {
        this.source.a(this);
    }
}
