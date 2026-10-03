package io.reactivex.internal.operators.observable;

import com.oplus.aiunit.vision.bed;
import com.oplus.aiunit.vision.cv5;
import com.oplus.aiunit.vision.yki;
import com.oplus.aiunit.vision.zeg;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes10.dex */
final class ObservableTakeLastTimed$TakeLastTimedObserver<T> extends AtomicBoolean implements bed<T>, cv5 {
    private static final long serialVersionUID = -5677354903406201275L;
    volatile boolean cancelled;
    final long count;
    final boolean delayError;
    final bed<? super T> downstream;
    Throwable error;
    final yki<Object> queue;
    final zeg scheduler;
    final long time;
    final TimeUnit unit;
    cv5 upstream;

    public ObservableTakeLastTimed$TakeLastTimedObserver(bed<? super T> bedVar, long j2, long j3, TimeUnit timeUnit, zeg zegVar, int i, boolean z) {
        this.downstream = bedVar;
        this.count = j2;
        this.time = j3;
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
        if (compareAndSet(false, true)) {
            this.queue.clear();
        }
    }

    public void drain() {
        Throwable th;
        if (compareAndSet(false, true)) {
            bed<? super T> bedVar = this.downstream;
            yki<Object> ykiVar = this.queue;
            boolean z = this.delayError;
            while (!this.cancelled) {
                if (!z && (th = this.error) != null) {
                    ykiVar.clear();
                    bedVar.onError(th);
                    return;
                }
                Object objPoll = ykiVar.poll();
                if (objPoll == null) {
                    Throwable th2 = this.error;
                    if (th2 != null) {
                        bedVar.onError(th2);
                        return;
                    } else {
                        bedVar.onComplete();
                        return;
                    }
                }
                Object objPoll2 = ykiVar.poll();
                if (((Long) objPoll).longValue() >= this.scheduler.b(this.unit) - this.time) {
                    bedVar.onNext(objPoll2);
                }
            }
            ykiVar.clear();
        }
    }

    @Override // com.oplus.aiunit.vision.cv5
    public boolean isDisposed() {
        return this.cancelled;
    }

    @Override // com.oplus.aiunit.vision.bed
    public void onComplete() {
        drain();
    }

    @Override // com.oplus.aiunit.vision.bed
    public void onError(Throwable th) {
        this.error = th;
        drain();
    }

    @Override // com.oplus.aiunit.vision.bed
    public void onNext(T t) {
        yki<Object> ykiVar = this.queue;
        long jB = this.scheduler.b(this.unit);
        long j2 = this.time;
        long j3 = this.count;
        boolean z = j3 == Long.MAX_VALUE;
        ykiVar.l(Long.valueOf(jB), t);
        while (!ykiVar.isEmpty()) {
            if (((Long) ykiVar.peek()).longValue() > jB - j2 && (z || (ykiVar.n() >> 1) <= j3)) {
                return;
            }
            ykiVar.poll();
            ykiVar.poll();
        }
    }

    @Override // com.oplus.aiunit.vision.bed
    public void onSubscribe(cv5 cv5Var) {
        if (DisposableHelper.validate(this.upstream, cv5Var)) {
            this.upstream = cv5Var;
            this.downstream.onSubscribe(this);
        }
    }
}
