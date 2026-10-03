package io.reactivex.rxjava3.internal.operators.observable;

import com.oplus.aiunit.vision.aed;
import com.oplus.aiunit.vision.jdd;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
abstract class ObservableSampleWithObservable$SampleMainObserver<T> extends AtomicReference<T> implements aed<T>, io.reactivex.rxjava3.disposables.a {
    private static final long serialVersionUID = -3517602651313910099L;
    final aed<? super T> downstream;
    final AtomicReference<io.reactivex.rxjava3.disposables.a> other = new AtomicReference<>();
    final jdd<?> sampler;
    io.reactivex.rxjava3.disposables.a upstream;

    public ObservableSampleWithObservable$SampleMainObserver(aed<? super T> aedVar, jdd<?> jddVar) {
        this.downstream = aedVar;
        this.sampler = jddVar;
    }

    public void complete() {
        this.upstream.dispose();
        completion();
    }

    public abstract void completion();

    @Override // io.reactivex.rxjava3.disposables.a
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

    @Override // io.reactivex.rxjava3.disposables.a
    public boolean isDisposed() {
        return this.other.get() == DisposableHelper.DISPOSED;
    }

    @Override // com.oplus.aiunit.vision.aed
    public void onComplete() {
        DisposableHelper.dispose(this.other);
        completion();
    }

    @Override // com.oplus.aiunit.vision.aed
    public void onError(Throwable th) {
        DisposableHelper.dispose(this.other);
        this.downstream.onError(th);
    }

    @Override // com.oplus.aiunit.vision.aed
    public void onNext(T t) {
        lazySet(t);
    }

    @Override // com.oplus.aiunit.vision.aed
    public void onSubscribe(io.reactivex.rxjava3.disposables.a aVar) {
        if (DisposableHelper.validate(this.upstream, aVar)) {
            this.upstream = aVar;
            this.downstream.onSubscribe(this);
            if (this.other.get() == null) {
                this.sampler.subscribe(new d(this));
            }
        }
    }

    public abstract void run();

    public boolean setOther(io.reactivex.rxjava3.disposables.a aVar) {
        return DisposableHelper.setOnce(this.other, aVar);
    }
}
