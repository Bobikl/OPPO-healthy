package io.reactivex.internal.operators.observable;

import com.oplus.aiunit.vision.abd;
import com.oplus.aiunit.vision.bed;
import com.oplus.aiunit.vision.cv5;
import com.oplus.aiunit.vision.h4g;
import com.oplus.aiunit.vision.iu6;
import com.oplus.aiunit.vision.j08;
import com.oplus.aiunit.vision.kdd;
import com.oplus.aiunit.vision.rdd;
import com.oplus.aiunit.vision.sdd;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.SequentialDisposable;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
final class ObservableTimeout$TimeoutFallbackObserver<T> extends AtomicReference<cv5> implements bed<T>, cv5, rdd {
    private static final long serialVersionUID = -7508389464265974549L;
    final bed<? super T> downstream;
    kdd<? extends T> fallback;
    final j08<? super T, ? extends kdd<?>> itemTimeoutIndicator;
    final SequentialDisposable task = new SequentialDisposable();
    final AtomicLong index = new AtomicLong();
    final AtomicReference<cv5> upstream = new AtomicReference<>();

    public ObservableTimeout$TimeoutFallbackObserver(bed<? super T> bedVar, j08<? super T, ? extends kdd<?>> j08Var, kdd<? extends T> kddVar) {
        this.downstream = bedVar;
        this.itemTimeoutIndicator = j08Var;
        this.fallback = kddVar;
    }

    @Override // com.oplus.aiunit.vision.cv5
    public void dispose() {
        DisposableHelper.dispose(this.upstream);
        DisposableHelper.dispose(this);
        this.task.dispose();
    }

    @Override // com.oplus.aiunit.vision.cv5
    public boolean isDisposed() {
        return DisposableHelper.isDisposed(get());
    }

    @Override // com.oplus.aiunit.vision.bed
    public void onComplete() {
        if (this.index.getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
            this.task.dispose();
            this.downstream.onComplete();
            this.task.dispose();
        }
    }

    @Override // com.oplus.aiunit.vision.bed
    public void onError(Throwable th) {
        if (this.index.getAndSet(Long.MAX_VALUE) == Long.MAX_VALUE) {
            h4g.r(th);
            return;
        }
        this.task.dispose();
        this.downstream.onError(th);
        this.task.dispose();
    }

    @Override // com.oplus.aiunit.vision.bed
    public void onNext(T t) {
        long j2 = this.index.get();
        if (j2 != Long.MAX_VALUE) {
            long j3 = 1 + j2;
            if (this.index.compareAndSet(j2, j3)) {
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
                    this.index.getAndSet(Long.MAX_VALUE);
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
        if (this.index.compareAndSet(j2, Long.MAX_VALUE)) {
            DisposableHelper.dispose(this.upstream);
            kdd<? extends T> kddVar = this.fallback;
            this.fallback = null;
            kddVar.subscribe(new sdd(this.downstream, this));
        }
    }

    @Override // com.oplus.aiunit.vision.rdd
    public void onTimeoutError(long j2, Throwable th) {
        if (!this.index.compareAndSet(j2, Long.MAX_VALUE)) {
            h4g.r(th);
        } else {
            DisposableHelper.dispose(this);
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
