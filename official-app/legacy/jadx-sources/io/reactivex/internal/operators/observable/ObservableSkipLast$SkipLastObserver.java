package io.reactivex.internal.operators.observable;

import com.oplus.aiunit.vision.bed;
import com.oplus.aiunit.vision.cv5;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.ArrayDeque;

/* JADX INFO: loaded from: classes10.dex */
final class ObservableSkipLast$SkipLastObserver<T> extends ArrayDeque<T> implements bed<T>, cv5 {
    private static final long serialVersionUID = -3807491841935125653L;
    final bed<? super T> downstream;
    final int skip;
    cv5 upstream;

    public ObservableSkipLast$SkipLastObserver(bed<? super T> bedVar, int i) {
        super(i);
        this.downstream = bedVar;
        this.skip = i;
    }

    @Override // com.oplus.aiunit.vision.cv5
    public void dispose() {
        this.upstream.dispose();
    }

    @Override // com.oplus.aiunit.vision.cv5
    public boolean isDisposed() {
        return this.upstream.isDisposed();
    }

    @Override // com.oplus.aiunit.vision.bed
    public void onComplete() {
        this.downstream.onComplete();
    }

    @Override // com.oplus.aiunit.vision.bed
    public void onError(Throwable th) {
        this.downstream.onError(th);
    }

    @Override // com.oplus.aiunit.vision.bed
    public void onNext(T t) {
        if (this.skip == size()) {
            this.downstream.onNext(poll());
        }
        offer(t);
    }

    @Override // com.oplus.aiunit.vision.bed
    public void onSubscribe(cv5 cv5Var) {
        if (DisposableHelper.validate(this.upstream, cv5Var)) {
            this.upstream = cv5Var;
            this.downstream.onSubscribe(this);
        }
    }
}
