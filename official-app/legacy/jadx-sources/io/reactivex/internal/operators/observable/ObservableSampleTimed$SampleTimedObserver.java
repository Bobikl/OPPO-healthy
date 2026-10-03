package io.reactivex.internal.operators.observable;

import com.oplus.aiunit.vision.bed;
import com.oplus.aiunit.vision.cv5;
import com.oplus.aiunit.vision.zeg;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
abstract class ObservableSampleTimed$SampleTimedObserver<T> extends AtomicReference<T> implements bed<T>, cv5, Runnable {
    private static final long serialVersionUID = -3517602651313910099L;
    final bed<? super T> downstream;
    final long period;
    final zeg scheduler;
    final AtomicReference<cv5> timer = new AtomicReference<>();
    final TimeUnit unit;
    cv5 upstream;

    public ObservableSampleTimed$SampleTimedObserver(bed<? super T> bedVar, long j2, TimeUnit timeUnit, zeg zegVar) {
        this.downstream = bedVar;
        this.period = j2;
        this.unit = timeUnit;
        this.scheduler = zegVar;
    }

    public void cancelTimer() {
        DisposableHelper.dispose(this.timer);
    }

    public abstract void complete();

    @Override // com.oplus.aiunit.vision.cv5
    public void dispose() {
        cancelTimer();
        this.upstream.dispose();
    }

    public void emit() {
        T andSet = getAndSet(null);
        if (andSet != null) {
            this.downstream.onNext(andSet);
        }
    }

    @Override // com.oplus.aiunit.vision.cv5
    public boolean isDisposed() {
        return this.upstream.isDisposed();
    }

    @Override // com.oplus.aiunit.vision.bed
    public void onComplete() {
        cancelTimer();
        complete();
    }

    @Override // com.oplus.aiunit.vision.bed
    public void onError(Throwable th) {
        cancelTimer();
        this.downstream.onError(th);
    }

    @Override // com.oplus.aiunit.vision.bed
    public void onNext(T t) {
        lazySet(t);
    }

    @Override // com.oplus.aiunit.vision.bed
    public void onSubscribe(cv5 cv5Var) {
        if (DisposableHelper.validate(this.upstream, cv5Var)) {
            this.upstream = cv5Var;
            this.downstream.onSubscribe(this);
            zeg zegVar = this.scheduler;
            long j2 = this.period;
            DisposableHelper.replace(this.timer, zegVar.e(this, j2, j2, this.unit));
        }
    }
}
