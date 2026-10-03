package io.reactivex.internal.operators.observable;

import com.oplus.aiunit.vision.bed;
import com.oplus.aiunit.vision.cv5;
import com.oplus.aiunit.vision.kdd;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
abstract class ObservableSampleWithObservable$SampleMainObserver<T> extends AtomicReference<T> implements bed<T>, cv5 {
    private static final long serialVersionUID = -3517602651313910099L;
    final bed<? super T> downstream;
    final AtomicReference<cv5> other = new AtomicReference<>();
    final kdd<?> sampler;
    cv5 upstream;

    public ObservableSampleWithObservable$SampleMainObserver(bed<? super T> bedVar, kdd<?> kddVar) {
        this.downstream = bedVar;
        this.sampler = kddVar;
    }

    public void complete() {
        this.upstream.dispose();
        completion();
    }

    public abstract void completion();

    @Override // com.oplus.aiunit.vision.cv5
    public void dispose() {
        DisposableHelper.dispose(this.other);
        this.upstream.dispose();
    }

    public void emit() {
        T andSet = getAndSet(null);
        if (andSet != null) {
            this.downstream.onNext(andSet);
        }
    }

    public void error(Throwable th) {
        this.upstream.dispose();
        this.downstream.onError(th);
    }

    @Override // com.oplus.aiunit.vision.cv5
    public boolean isDisposed() {
        return this.other.get() == DisposableHelper.DISPOSED;
    }

    @Override // com.oplus.aiunit.vision.bed
    public void onComplete() {
        DisposableHelper.dispose(this.other);
        completion();
    }

    @Override // com.oplus.aiunit.vision.bed
    public void onError(Throwable th) {
        DisposableHelper.dispose(this.other);
        this.downstream.onError(th);
    }

    @Override // com.oplus.aiunit.vision.bed
    public void onNext(T t) {
        lazySet(t);
    }

    @Override // com.oplus.aiunit.vision.bed
    public void onSubscribe(cv5 cv5Var) {
        if (DisposableHelper.validate(this.upstream, cv5Var)) {
            this.upstream = cv5Var;
            this.downstream.onSubscribe(this);
            if (this.other.get() == null) {
                this.sampler.subscribe(new e(this));
            }
        }
    }

    public abstract void run();

    public boolean setOther(cv5 cv5Var) {
        return DisposableHelper.setOnce(this.other, cv5Var);
    }
}
