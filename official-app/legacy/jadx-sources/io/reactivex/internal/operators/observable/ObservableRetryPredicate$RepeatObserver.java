package io.reactivex.internal.operators.observable;

import com.oplus.aiunit.vision.bed;
import com.oplus.aiunit.vision.cv5;
import com.oplus.aiunit.vision.iu6;
import com.oplus.aiunit.vision.kdd;
import com.oplus.aiunit.vision.npe;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.internal.disposables.SequentialDisposable;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes10.dex */
final class ObservableRetryPredicate$RepeatObserver<T> extends AtomicInteger implements bed<T> {
    private static final long serialVersionUID = -7098360935104053232L;
    final bed<? super T> downstream;
    final npe<? super Throwable> predicate;
    long remaining;
    final kdd<? extends T> source;
    final SequentialDisposable upstream;

    public ObservableRetryPredicate$RepeatObserver(bed<? super T> bedVar, long j2, npe<? super Throwable> npeVar, SequentialDisposable sequentialDisposable, kdd<? extends T> kddVar) {
        this.downstream = bedVar;
        this.upstream = sequentialDisposable;
        this.source = kddVar;
        this.predicate = npeVar;
        this.remaining = j2;
    }

    @Override // com.oplus.aiunit.vision.bed
    public void onComplete() {
        this.downstream.onComplete();
    }

    @Override // com.oplus.aiunit.vision.bed
    public void onError(Throwable th) {
        long j2 = this.remaining;
        if (j2 != Long.MAX_VALUE) {
            this.remaining = j2 - 1;
        }
        if (j2 == 0) {
            this.downstream.onError(th);
            return;
        }
        try {
            if (this.predicate.test(th)) {
                subscribeNext();
            } else {
                this.downstream.onError(th);
            }
        } catch (Throwable th2) {
            iu6.b(th2);
            this.downstream.onError(new CompositeException(th, th2));
        }
    }

    @Override // com.oplus.aiunit.vision.bed
    public void onNext(T t) {
        this.downstream.onNext(t);
    }

    @Override // com.oplus.aiunit.vision.bed
    public void onSubscribe(cv5 cv5Var) {
        this.upstream.replace(cv5Var);
    }

    public void subscribeNext() {
        if (getAndIncrement() == 0) {
            int iAddAndGet = 1;
            while (!this.upstream.isDisposed()) {
                this.source.subscribe(this);
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
        }
    }
}
