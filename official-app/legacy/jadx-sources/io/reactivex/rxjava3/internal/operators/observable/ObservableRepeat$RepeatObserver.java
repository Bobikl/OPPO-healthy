package io.reactivex.rxjava3.internal.operators.observable;

import com.oplus.aiunit.vision.aed;
import com.oplus.aiunit.vision.jdd;
import io.reactivex.rxjava3.internal.disposables.SequentialDisposable;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes10.dex */
final class ObservableRepeat$RepeatObserver<T> extends AtomicInteger implements aed<T> {
    private static final long serialVersionUID = -7098360935104053232L;
    final aed<? super T> downstream;
    long remaining;
    final SequentialDisposable sd;
    final jdd<? extends T> source;

    public ObservableRepeat$RepeatObserver(aed<? super T> aedVar, long j2, SequentialDisposable sequentialDisposable, jdd<? extends T> jddVar) {
        this.downstream = aedVar;
        this.sd = sequentialDisposable;
        this.source = jddVar;
        this.remaining = j2;
    }

    @Override // com.oplus.aiunit.vision.aed
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

    @Override // com.oplus.aiunit.vision.aed
    public void onError(Throwable th) {
        this.downstream.onError(th);
    }

    @Override // com.oplus.aiunit.vision.aed
    public void onNext(T t) {
        this.downstream.onNext(t);
    }

    @Override // com.oplus.aiunit.vision.aed
    public void onSubscribe(io.reactivex.rxjava3.disposables.a aVar) {
        this.sd.replace(aVar);
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
