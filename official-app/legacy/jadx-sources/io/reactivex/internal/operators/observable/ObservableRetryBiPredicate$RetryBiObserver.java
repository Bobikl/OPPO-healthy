package io.reactivex.internal.operators.observable;

import com.oplus.aiunit.vision.bed;
import com.oplus.aiunit.vision.cv5;
import com.oplus.aiunit.vision.iu6;
import com.oplus.aiunit.vision.kdd;
import com.oplus.aiunit.vision.pd1;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.internal.disposables.SequentialDisposable;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes10.dex */
final class ObservableRetryBiPredicate$RetryBiObserver<T> extends AtomicInteger implements bed<T> {
    private static final long serialVersionUID = -7098360935104053232L;
    final bed<? super T> downstream;
    final pd1<? super Integer, ? super Throwable> predicate;
    int retries;
    final kdd<? extends T> source;
    final SequentialDisposable upstream;

    public ObservableRetryBiPredicate$RetryBiObserver(bed<? super T> bedVar, pd1<? super Integer, ? super Throwable> pd1Var, SequentialDisposable sequentialDisposable, kdd<? extends T> kddVar) {
        this.downstream = bedVar;
        this.upstream = sequentialDisposable;
        this.source = kddVar;
        this.predicate = pd1Var;
    }

    @Override // com.oplus.aiunit.vision.bed
    public void onComplete() {
        this.downstream.onComplete();
    }

    @Override // com.oplus.aiunit.vision.bed
    public void onError(Throwable th) {
        try {
            pd1<? super Integer, ? super Throwable> pd1Var = this.predicate;
            int i = this.retries + 1;
            this.retries = i;
            if (pd1Var.a(Integer.valueOf(i), th)) {
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
