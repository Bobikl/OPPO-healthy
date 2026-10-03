package io.reactivex.internal.operators.single;

import com.oplus.aiunit.vision.cv5;
import com.oplus.aiunit.vision.m6h;
import com.oplus.aiunit.vision.t6h;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.SequentialDisposable;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
final class SingleSubscribeOn$SubscribeOnObserver<T> extends AtomicReference<cv5> implements m6h<T>, cv5, Runnable {
    private static final long serialVersionUID = 7000911171163930287L;
    final m6h<? super T> downstream;
    final t6h<? extends T> source;
    final SequentialDisposable task = new SequentialDisposable();

    public SingleSubscribeOn$SubscribeOnObserver(m6h<? super T> m6hVar, t6h<? extends T> t6hVar) {
        this.downstream = m6hVar;
        this.source = t6hVar;
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

    @Override // com.oplus.aiunit.vision.m6h
    public void onError(Throwable th) {
        this.downstream.onError(th);
    }

    @Override // com.oplus.aiunit.vision.m6h
    public void onSubscribe(cv5 cv5Var) {
        DisposableHelper.setOnce(this, cv5Var);
    }

    @Override // com.oplus.aiunit.vision.m6h
    public void onSuccess(T t) {
        this.downstream.onSuccess(t);
    }

    @Override // java.lang.Runnable
    public void run() {
        this.source.a(this);
    }
}
