package io.reactivex.rxjava3.internal.operators.observable;

import com.oplus.aiunit.vision.aed;
import com.oplus.aiunit.vision.d08;
import com.oplus.aiunit.vision.g4g;
import com.oplus.aiunit.vision.hu6;
import com.oplus.aiunit.vision.jdd;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.disposables.SequentialDisposable;
import java.util.Objects;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
final class ObservableTimeout$TimeoutObserver<T> extends AtomicLong implements aed<T>, io.reactivex.rxjava3.disposables.a, g {
    private static final long serialVersionUID = 3764492702657003550L;
    final aed<? super T> downstream;
    final d08<? super T, ? extends jdd<?>> itemTimeoutIndicator;
    final SequentialDisposable task = new SequentialDisposable();
    final AtomicReference<io.reactivex.rxjava3.disposables.a> upstream = new AtomicReference<>();

    public ObservableTimeout$TimeoutObserver(aed<? super T> aedVar, d08<? super T, ? extends jdd<?>> d08Var) {
        this.downstream = aedVar;
        this.itemTimeoutIndicator = d08Var;
    }

    @Override // io.reactivex.rxjava3.disposables.a
    public void dispose() {
        DisposableHelper.dispose(this.upstream);
        this.task.dispose();
    }

    @Override // io.reactivex.rxjava3.disposables.a
    public boolean isDisposed() {
        return DisposableHelper.isDisposed(this.upstream.get());
    }

    @Override // com.oplus.aiunit.vision.aed
    public void onComplete() {
        if (getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
            this.task.dispose();
            this.downstream.onComplete();
        }
    }

    @Override // com.oplus.aiunit.vision.aed
    public void onError(Throwable th) {
        if (getAndSet(Long.MAX_VALUE) == Long.MAX_VALUE) {
            g4g.u(th);
        } else {
            this.task.dispose();
            this.downstream.onError(th);
        }
    }

    @Override // com.oplus.aiunit.vision.aed
    public void onNext(T t) {
        long j2 = get();
        if (j2 != Long.MAX_VALUE) {
            long j3 = 1 + j2;
            if (compareAndSet(j2, j3)) {
                io.reactivex.rxjava3.disposables.a aVar = this.task.get();
                if (aVar != null) {
                    aVar.dispose();
                }
                this.downstream.onNext(t);
                try {
                    jdd<?> jddVarApply = this.itemTimeoutIndicator.apply(t);
                    Objects.requireNonNull(jddVarApply, "The itemTimeoutIndicator returned a null ObservableSource.");
                    jdd<?> jddVar = jddVarApply;
                    ObservableTimeout$TimeoutConsumer observableTimeout$TimeoutConsumer = new ObservableTimeout$TimeoutConsumer(j3, this);
                    if (this.task.replace(observableTimeout$TimeoutConsumer)) {
                        jddVar.subscribe(observableTimeout$TimeoutConsumer);
                    }
                } catch (Throwable th) {
                    hu6.b(th);
                    this.upstream.get().dispose();
                    getAndSet(Long.MAX_VALUE);
                    this.downstream.onError(th);
                }
            }
        }
    }

    @Override // com.oplus.aiunit.vision.aed
    public void onSubscribe(io.reactivex.rxjava3.disposables.a aVar) {
        DisposableHelper.setOnce(this.upstream, aVar);
    }

    @Override // io.reactivex.rxjava3.internal.operators.observable.ObservableTimeoutTimed.b
    public void onTimeout(long j2) {
        if (compareAndSet(j2, Long.MAX_VALUE)) {
            DisposableHelper.dispose(this.upstream);
            this.downstream.onError(new TimeoutException());
        }
    }

    @Override // io.reactivex.rxjava3.internal.operators.observable.g
    public void onTimeoutError(long j2, Throwable th) {
        if (!compareAndSet(j2, Long.MAX_VALUE)) {
            g4g.u(th);
        } else {
            DisposableHelper.dispose(this.upstream);
            this.downstream.onError(th);
        }
    }

    public void startFirstTimeout(jdd<?> jddVar) {
        if (jddVar != null) {
            ObservableTimeout$TimeoutConsumer observableTimeout$TimeoutConsumer = new ObservableTimeout$TimeoutConsumer(0L, this);
            if (this.task.replace(observableTimeout$TimeoutConsumer)) {
                jddVar.subscribe(observableTimeout$TimeoutConsumer);
            }
        }
    }
}
