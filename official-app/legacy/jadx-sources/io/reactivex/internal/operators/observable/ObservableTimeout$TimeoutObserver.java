package io.reactivex.internal.operators.observable;

import com.oplus.aiunit.vision.abd;
import com.oplus.aiunit.vision.bed;
import com.oplus.aiunit.vision.cv5;
import com.oplus.aiunit.vision.h4g;
import com.oplus.aiunit.vision.iu6;
import com.oplus.aiunit.vision.j08;
import com.oplus.aiunit.vision.kdd;
import com.oplus.aiunit.vision.rdd;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.SequentialDisposable;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
final class ObservableTimeout$TimeoutObserver<T> extends AtomicLong implements bed<T>, cv5, rdd {
    private static final long serialVersionUID = 3764492702657003550L;
    final bed<? super T> downstream;
    final j08<? super T, ? extends kdd<?>> itemTimeoutIndicator;
    final SequentialDisposable task = new SequentialDisposable();
    final AtomicReference<cv5> upstream = new AtomicReference<>();

    public ObservableTimeout$TimeoutObserver(bed<? super T> bedVar, j08<? super T, ? extends kdd<?>> j08Var) {
        this.downstream = bedVar;
        this.itemTimeoutIndicator = j08Var;
    }

    @Override // com.oplus.aiunit.vision.cv5
    public void dispose() {
        DisposableHelper.dispose(this.upstream);
        this.task.dispose();
    }

    @Override // com.oplus.aiunit.vision.cv5
    public boolean isDisposed() {
        return DisposableHelper.isDisposed(this.upstream.get());
    }

    @Override // com.oplus.aiunit.vision.bed
    public void onComplete() {
        if (getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
            this.task.dispose();
            this.downstream.onComplete();
        }
    }

    @Override // com.oplus.aiunit.vision.bed
    public void onError(Throwable th) {
        if (getAndSet(Long.MAX_VALUE) == Long.MAX_VALUE) {
            h4g.r(th);
        } else {
            this.task.dispose();
            this.downstream.onError(th);
        }
    }

    @Override // com.oplus.aiunit.vision.bed
    public void onNext(T t) {
        long j2 = get();
        if (j2 != Long.MAX_VALUE) {
            long j3 = 1 + j2;
            if (compareAndSet(j2, j3)) {
                cv5 cv5Var = this.task.get();
                if (cv5Var != null) {
                    cv5Var.dispose();
                }
                this.downstream.onNext(t);
                try {
                    kdd kddVar = (kdd) abd.d(this.itemTimeoutIndicator.apply(t), "The itemTimeoutIndicator returned a null ObservableSource.");
                    ObservableTimeout$TimeoutConsumer observableTimeout$TimeoutConsumer = new ObservableTimeout$TimeoutConsumer(j3, this);
                    if (this.task.replace(observableTimeout$TimeoutConsumer)) {
                        kddVar.subscribe(observableTimeout$TimeoutConsumer);
                    }
                } catch (Throwable th) {
                    iu6.b(th);
                    this.upstream.get().dispose();
                    getAndSet(Long.MAX_VALUE);
                    this.downstream.onError(th);
                }
            }
        }
    }

    @Override // com.oplus.aiunit.vision.bed
    public void onSubscribe(cv5 cv5Var) {
        DisposableHelper.setOnce(this.upstream, cv5Var);
    }

    @Override // com.oplus.aiunit.vision.tdd
    public void onTimeout(long j2) {
        if (compareAndSet(j2, Long.MAX_VALUE)) {
            DisposableHelper.dispose(this.upstream);
            this.downstream.onError(new TimeoutException());
        }
    }

    @Override // com.oplus.aiunit.vision.rdd
    public void onTimeoutError(long j2, Throwable th) {
        if (!compareAndSet(j2, Long.MAX_VALUE)) {
            h4g.r(th);
        } else {
            DisposableHelper.dispose(this.upstream);
            this.downstream.onError(th);
        }
    }

    public void startFirstTimeout(kdd<?> kddVar) {
        if (kddVar != null) {
            ObservableTimeout$TimeoutConsumer observableTimeout$TimeoutConsumer = new ObservableTimeout$TimeoutConsumer(0L, this);
            if (this.task.replace(observableTimeout$TimeoutConsumer)) {
                kddVar.subscribe(observableTimeout$TimeoutConsumer);
            }
        }
    }
}
