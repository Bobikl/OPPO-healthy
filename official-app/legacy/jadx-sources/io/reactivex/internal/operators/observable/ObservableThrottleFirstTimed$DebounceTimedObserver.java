package io.reactivex.internal.operators.observable;

import com.oplus.aiunit.vision.bed;
import com.oplus.aiunit.vision.cv5;
import com.oplus.aiunit.vision.h4g;
import com.oplus.aiunit.vision.zeg;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
final class ObservableThrottleFirstTimed$DebounceTimedObserver<T> extends AtomicReference<cv5> implements bed<T>, cv5, Runnable {
    private static final long serialVersionUID = 786994795061867455L;
    boolean done;
    final bed<? super T> downstream;
    volatile boolean gate;
    final long timeout;
    final TimeUnit unit;
    cv5 upstream;
    final zeg.c worker;

    public ObservableThrottleFirstTimed$DebounceTimedObserver(bed<? super T> bedVar, long j2, TimeUnit timeUnit, zeg.c cVar) {
        this.downstream = bedVar;
        this.timeout = j2;
        this.unit = timeUnit;
        this.worker = cVar;
    }

    @Override // com.oplus.aiunit.vision.cv5
    public void dispose() {
        this.upstream.dispose();
        this.worker.dispose();
    }

    @Override // com.oplus.aiunit.vision.cv5
    public boolean isDisposed() {
        return this.worker.isDisposed();
    }

    @Override // com.oplus.aiunit.vision.bed
    public void onComplete() {
        if (this.done) {
            return;
        }
        this.done = true;
        this.downstream.onComplete();
        this.worker.dispose();
    }

    @Override // com.oplus.aiunit.vision.bed
    public void onError(Throwable th) {
        if (this.done) {
            h4g.r(th);
            return;
        }
        this.done = true;
        this.downstream.onError(th);
        this.worker.dispose();
    }

    @Override // com.oplus.aiunit.vision.bed
    public void onNext(T t) {
        if (this.gate || this.done) {
            return;
        }
        this.gate = true;
        this.downstream.onNext(t);
        cv5 cv5Var = get();
        if (cv5Var != null) {
            cv5Var.dispose();
        }
        DisposableHelper.replace(this, this.worker.c(this, this.timeout, this.unit));
    }

    @Override // com.oplus.aiunit.vision.bed
    public void onSubscribe(cv5 cv5Var) {
        if (DisposableHelper.validate(this.upstream, cv5Var)) {
            this.upstream = cv5Var;
            this.downstream.onSubscribe(this);
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        this.gate = false;
    }
}
