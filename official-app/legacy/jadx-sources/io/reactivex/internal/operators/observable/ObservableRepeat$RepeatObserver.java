package io.reactivex.internal.operators.observable;

import com.oplus.aiunit.vision.bed;
import com.oplus.aiunit.vision.cv5;
import com.oplus.aiunit.vision.kdd;
import io.reactivex.internal.disposables.SequentialDisposable;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes10.dex */
final class ObservableRepeat$RepeatObserver<T> extends AtomicInteger implements bed<T> {
    private static final long serialVersionUID = -7098360935104053232L;
    final bed<? super T> downstream;
    long remaining;
    final SequentialDisposable sd;
    final kdd<? extends T> source;

    public ObservableRepeat$RepeatObserver(bed<? super T> bedVar, long j2, SequentialDisposable sequentialDisposable, kdd<? extends T> kddVar) {
        this.downstream = bedVar;
        this.sd = sequentialDisposable;
        this.source = kddVar;
        this.remaining = j2;
    }

    @Override // com.oplus.aiunit.vision.bed
    public void onComplete() {
        long j2 = this.remaining;
        if (j2 != Long.MAX_VALUE) {
            this.remaining = j2 - 1;
        }
        if (j2 != 0) {
            subscribeNext();
        } else {
            this.downstream.onComplete();
        }
    }

    @Override // com.oplus.aiunit.vision.bed
    public void onError(Throwable th) {
        this.downstream.onError(th);
    }

    @Override // com.oplus.aiunit.vision.bed
    public void onNext(T t) {
        this.downstream.onNext(t);
    }

    @Override // com.oplus.aiunit.vision.bed
    public void onSubscribe(cv5 cv5Var) {
        this.sd.replace(cv5Var);
    }

    public void subscribeNext() {
        if (getAndIncrement() == 0) {
            int iAddAndGet = 1;
            while (!this.sd.isDisposed()) {
                this.source.subscribe(this);
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
        }
    }
}
