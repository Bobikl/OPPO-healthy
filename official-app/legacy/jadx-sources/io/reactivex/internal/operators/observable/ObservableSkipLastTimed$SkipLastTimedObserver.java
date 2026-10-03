package io.reactivex.internal.operators.observable;

import com.oplus.aiunit.vision.bed;
import com.oplus.aiunit.vision.cv5;
import com.oplus.aiunit.vision.yki;
import com.oplus.aiunit.vision.zeg;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes10.dex */
final class ObservableSkipLastTimed$SkipLastTimedObserver<T> extends AtomicInteger implements bed<T>, cv5 {
    private static final long serialVersionUID = -5677354903406201275L;
    volatile boolean cancelled;
    final boolean delayError;
    volatile boolean done;
    final bed<? super T> downstream;
    Throwable error;
    final yki<Object> queue;
    final zeg scheduler;
    final long time;
    final TimeUnit unit;
    cv5 upstream;

    public ObservableSkipLastTimed$SkipLastTimedObserver(bed<? super T> bedVar, long j2, TimeUnit timeUnit, zeg zegVar, int i, boolean z) {
        this.downstream = bedVar;
        this.time = j2;
        this.unit = timeUnit;
        this.scheduler = zegVar;
        this.queue = new yki<>(i);
        this.delayError = z;
    }

    @Override // com.oplus.aiunit.vision.cv5
    public void dispose() {
        if (this.cancelled) {
            return;
        }
        this.cancelled = true;
        this.upstream.dispose();
        if (getAndIncrement() == 0) {
            this.queue.clear();
        }
    }

    public void drain() {
        if (getAndIncrement() != 0) {
            return;
        }
        bed<? super T> bedVar = this.downstream;
        yki<Object> ykiVar = this.queue;
        boolean z = this.delayError;
        TimeUnit timeUnit = this.unit;
        zeg zegVar = this.scheduler;
        long j2 = this.time;
        int iAddAndGet = 1;
        while (!this.cancelled) {
            boolean z2 = this.done;
            Long l2 = (Long) ykiVar.peek();
            boolean z3 = l2 == null;
            long jB = zegVar.b(timeUnit);
            if (!z3 && l2.longValue() > jB - j2) {
                z3 = true;
            }
            if (z2) {
                if (!z) {
                    Throwable th = this.error;
                    if (th != null) {
                        this.queue.clear();
                        bedVar.onError(th);
                        return;
                    } else if (z3) {
                        bedVar.onComplete();
                        return;
                    }
                } else if (z3) {
                    Throwable th2 = this.error;
                    if (th2 != null) {
                        bedVar.onError(th2);
                        return;
                    } else {
                        bedVar.onComplete();
                        return;
                    }
                }
            }
            if (z3) {
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            } else {
                ykiVar.poll();
                bedVar.onNext(ykiVar.poll());
            }
        }
        this.queue.clear();
    }

    @Override // com.oplus.aiunit.vision.cv5
    public boolean isDisposed() {
        return this.cancelled;
    }

    @Override // com.oplus.aiunit.vision.bed
    public void onComplete() {
        this.done = true;
        drain();
    }

    @Override // com.oplus.aiunit.vision.bed
    public void onError(Throwable th) {
        this.error = th;
        this.done = true;
        drain();
    }

    @Override // com.oplus.aiunit.vision.bed
    public void onNext(T t) {
        this.queue.l(Long.valueOf(this.scheduler.b(this.unit)), t);
        drain();
    }

    @Override // com.oplus.aiunit.vision.bed
    public void onSubscribe(cv5 cv5Var) {
        if (DisposableHelper.validate(this.upstream, cv5Var)) {
            this.upstream = cv5Var;
            this.downstream.onSubscribe(this);
        }
    }
}
