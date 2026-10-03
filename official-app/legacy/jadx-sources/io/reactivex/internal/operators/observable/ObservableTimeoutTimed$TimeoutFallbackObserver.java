package io.reactivex.internal.operators.observable;

import com.oplus.aiunit.vision.bed;
import com.oplus.aiunit.vision.cv5;
import com.oplus.aiunit.vision.h4g;
import com.oplus.aiunit.vision.kdd;
import com.oplus.aiunit.vision.sdd;
import com.oplus.aiunit.vision.tdd;
import com.oplus.aiunit.vision.udd;
import com.oplus.aiunit.vision.zeg;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.SequentialDisposable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
final class ObservableTimeoutTimed$TimeoutFallbackObserver<T> extends AtomicReference<cv5> implements bed<T>, cv5, tdd {
    private static final long serialVersionUID = 3764492702657003550L;
    final bed<? super T> downstream;
    kdd<? extends T> fallback;
    final long timeout;
    final TimeUnit unit;
    final zeg.c worker;
    final SequentialDisposable task = new SequentialDisposable();
    final AtomicLong index = new AtomicLong();
    final AtomicReference<cv5> upstream = new AtomicReference<>();

    public ObservableTimeoutTimed$TimeoutFallbackObserver(bed<? super T> bedVar, long j2, TimeUnit timeUnit, zeg.c cVar, kdd<? extends T> kddVar) {
        this.downstream = bedVar;
        this.timeout = j2;
        this.unit = timeUnit;
        this.worker = cVar;
        this.fallback = kddVar;
    }

    @Override // com.oplus.aiunit.vision.cv5
    public void dispose() {
        DisposableHelper.dispose(this.upstream);
        DisposableHelper.dispose(this);
        this.worker.dispose();
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
            this.worker.dispose();
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
        this.worker.dispose();
    }

    @Override // com.oplus.aiunit.vision.bed
    public void onNext(T t) {
        long j2 = this.index.get();
        if (j2 != Long.MAX_VALUE) {
            long j3 = 1 + j2;
            if (this.index.compareAndSet(j2, j3)) {
                this.task.get().dispose();
                this.downstream.onNext(t);
                startTimeout(j3);
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
            this.worker.dispose();
        }
    }

    public void startTimeout(long j2) {
        this.task.replace(this.worker.c(new udd(j2, this), this.timeout, this.unit));
    }
}
