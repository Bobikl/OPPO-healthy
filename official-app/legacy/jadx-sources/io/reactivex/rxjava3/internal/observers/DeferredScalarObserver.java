package io.reactivex.rxjava3.internal.observers;

import com.oplus.aiunit.vision.aed;
import io.reactivex.rxjava3.disposables.a;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;

/* JADX INFO: loaded from: classes10.dex */
public abstract class DeferredScalarObserver<T, R> extends DeferredScalarDisposable<R> implements aed<T> {
    private static final long serialVersionUID = -266195175408988651L;
    protected a upstream;

    public DeferredScalarObserver(aed<? super R> aedVar) {
        super(aedVar);
    }

    @Override // io.reactivex.rxjava3.internal.observers.DeferredScalarDisposable, io.reactivex.rxjava3.internal.observers.BasicIntQueueDisposable, io.reactivex.rxjava3.disposables.a
    public void dispose() {
        super.dispose();
        this.upstream.dispose();
    }

    @Override // com.oplus.aiunit.vision.aed
    public void onComplete() {
        T t = this.value;
        if (t == null) {
            complete();
        } else {
            this.value = null;
            complete(t);
        }
    }

    @Override // com.oplus.aiunit.vision.aed
    public void onError(Throwable th) {
        this.value = null;
        error(th);
    }

    @Override // com.oplus.aiunit.vision.aed
    public abstract /* synthetic */ void onNext(Object obj);

    @Override // com.oplus.aiunit.vision.aed
    public void onSubscribe(a aVar) {
        if (DisposableHelper.validate(this.upstream, aVar)) {
            this.upstream = aVar;
            this.downstream.onSubscribe(this);
        }
    }
}
