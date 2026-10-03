package io.reactivex.internal.observers;

import com.oplus.aiunit.vision.bed;
import com.oplus.aiunit.vision.cv5;
import io.reactivex.internal.disposables.DisposableHelper;

/* JADX INFO: loaded from: classes10.dex */
public abstract class DeferredScalarObserver<T, R> extends DeferredScalarDisposable<R> implements bed<T> {
    private static final long serialVersionUID = -266195175408988651L;
    protected cv5 upstream;

    public DeferredScalarObserver(bed<? super R> bedVar) {
        super(bedVar);
    }

    @Override // io.reactivex.internal.observers.DeferredScalarDisposable, io.reactivex.internal.observers.BasicIntQueueDisposable, com.oplus.aiunit.vision.cv5
    public void dispose() {
        super.dispose();
        this.upstream.dispose();
    }

    @Override // com.oplus.aiunit.vision.bed
    public void onComplete() {
        T t = this.value;
        if (t == null) {
            complete();
        } else {
            this.value = null;
            complete(t);
        }
    }

    @Override // com.oplus.aiunit.vision.bed
    public void onError(Throwable th) {
        this.value = null;
        error(th);
    }

    @Override // com.oplus.aiunit.vision.bed
    public abstract /* synthetic */ void onNext(Object obj);

    @Override // com.oplus.aiunit.vision.bed
    public void onSubscribe(cv5 cv5Var) {
        if (DisposableHelper.validate(this.upstream, cv5Var)) {
            this.upstream = cv5Var;
            this.downstream.onSubscribe(this);
        }
    }
}
