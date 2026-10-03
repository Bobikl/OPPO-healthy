package io.reactivex.internal.operators.observable;

import com.oplus.aiunit.vision.bed;
import com.oplus.aiunit.vision.cv5;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.ArrayDeque;

/* JADX INFO: loaded from: classes10.dex */
final class ObservableTakeLast$TakeLastObserver<T> extends ArrayDeque<T> implements bed<T>, cv5 {
    private static final long serialVersionUID = 7240042530241604978L;
    volatile boolean cancelled;
    final int count;
    final bed<? super T> downstream;
    cv5 upstream;

    public ObservableTakeLast$TakeLastObserver(bed<? super T> bedVar, int i) {
        this.downstream = bedVar;
        this.count = i;
    }

    @Override // com.oplus.aiunit.vision.cv5
    public void dispose() {
        if (this.cancelled) {
            return;
        }
        this.cancelled = true;
        this.upstream.dispose();
    }

    @Override // com.oplus.aiunit.vision.cv5
    public boolean isDisposed() {
        return this.cancelled;
    }

    @Override // com.oplus.aiunit.vision.bed
    public void onComplete() {
        bed<? super T> bedVar = this.downstream;
        while (!this.cancelled) {
            T tPoll = poll();
            if (tPoll == null) {
                if (this.cancelled) {
                    return;
                }
                bedVar.onComplete();
                return;
            }
            bedVar.onNext(tPoll);
        }
    }

    @Override // com.oplus.aiunit.vision.bed
    public void onError(Throwable th) {
        this.downstream.onError(th);
    }

    @Override // com.oplus.aiunit.vision.bed
    public void onNext(T t) {
        if (this.count == size()) {
            poll();
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
