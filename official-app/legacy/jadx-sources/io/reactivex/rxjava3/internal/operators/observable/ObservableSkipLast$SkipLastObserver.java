package io.reactivex.rxjava3.internal.operators.observable;

import com.oplus.aiunit.vision.aed;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.ArrayDeque;

/* JADX INFO: loaded from: classes10.dex */
final class ObservableSkipLast$SkipLastObserver<T> extends ArrayDeque<T> implements aed<T>, io.reactivex.rxjava3.disposables.a {
    private static final long serialVersionUID = -3807491841935125653L;
    final aed<? super T> downstream;
    final int skip;
    io.reactivex.rxjava3.disposables.a upstream;

    public ObservableSkipLast$SkipLastObserver(aed<? super T> aedVar, int i) {
        super(i);
        this.downstream = aedVar;
        this.skip = i;
    }

    @Override // io.reactivex.rxjava3.disposables.a
    public void dispose() {
        this.upstream.dispose();
    }

    @Override // io.reactivex.rxjava3.disposables.a
    public boolean isDisposed() {
        return this.upstream.isDisposed();
    }

    @Override // com.oplus.aiunit.vision.aed
    public void onComplete() {
        this.downstream.onComplete();
    }

    @Override // com.oplus.aiunit.vision.aed
    public void onError(Throwable th) {
        this.downstream.onError(th);
    }

    @Override // com.oplus.aiunit.vision.aed
    public void onNext(T t) {
        if (this.skip == size()) {
            this.downstream.onNext(poll());
        }
        offer(t);
    }

    @Override // com.oplus.aiunit.vision.aed
    public void onSubscribe(io.reactivex.rxjava3.disposables.a aVar) {
        if (DisposableHelper.validate(this.upstream, aVar)) {
            this.upstream = aVar;
            this.downstream.onSubscribe(this);
        }
    }
}
