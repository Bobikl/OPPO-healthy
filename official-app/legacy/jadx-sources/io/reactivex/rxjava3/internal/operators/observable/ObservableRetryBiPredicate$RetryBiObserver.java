package io.reactivex.rxjava3.internal.operators.observable;

import com.oplus.aiunit.vision.aed;
import com.oplus.aiunit.vision.hu6;
import com.oplus.aiunit.vision.jdd;
import com.oplus.aiunit.vision.od1;
import io.reactivex.rxjava3.exceptions.CompositeException;
import io.reactivex.rxjava3.internal.disposables.SequentialDisposable;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes10.dex */
final class ObservableRetryBiPredicate$RetryBiObserver<T> extends AtomicInteger implements aed<T> {
    private static final long serialVersionUID = -7098360935104053232L;
    final aed<? super T> downstream;
    final od1<? super Integer, ? super Throwable> predicate;
    int retries;
    final jdd<? extends T> source;
    final SequentialDisposable upstream;

    public ObservableRetryBiPredicate$RetryBiObserver(aed<? super T> aedVar, od1<? super Integer, ? super Throwable> od1Var, SequentialDisposable sequentialDisposable, jdd<? extends T> jddVar) {
        this.downstream = aedVar;
        this.upstream = sequentialDisposable;
        this.source = jddVar;
        this.predicate = od1Var;
    }

    @Override // com.oplus.aiunit.vision.aed
    public void onComplete() {
        this.downstream.onComplete();
    }

    @Override // com.oplus.aiunit.vision.aed
    public void onError(Throwable th) {
        try {
            od1<? super Integer, ? super Throwable> od1Var = this.predicate;
            int i = this.retries + 1;
            this.retries = i;
            if (od1Var.a(Integer.valueOf(i), th)) {
                subscribeNext();
            } else {
                this.downstream.onError(th);
            }
        } catch (Throwable th2) {
            hu6.b(th2);
            this.downstream.onError(new CompositeException(th, th2));
        }
    }

    @Override // com.oplus.aiunit.vision.aed
    public void onNext(T t) {
        this.downstream.onNext(t);
    }

    @Override // com.oplus.aiunit.vision.aed
    public void onSubscribe(io.reactivex.rxjava3.disposables.a aVar) {
        this.upstream.replace(aVar);
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
