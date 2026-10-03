package io.reactivex.internal.operators.flowable;

import com.oplus.aiunit.vision.c3j;
import com.oplus.aiunit.vision.v2j;
import com.oplus.aiunit.vision.wr0;
import com.oplus.aiunit.vision.wu7;
import com.oplus.aiunit.vision.yki;
import com.oplus.aiunit.vision.zeg;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes10.dex */
final class FlowableTakeLastTimed$TakeLastTimedSubscriber<T> extends AtomicInteger implements wu7<T>, c3j {
    private static final long serialVersionUID = -5677354903406201275L;
    volatile boolean cancelled;
    final long count;
    final boolean delayError;
    volatile boolean done;
    final v2j<? super T> downstream;
    Throwable error;
    final yki<Object> queue;
    final AtomicLong requested = new AtomicLong();
    final zeg scheduler;
    final long time;
    final TimeUnit unit;
    c3j upstream;

    public FlowableTakeLastTimed$TakeLastTimedSubscriber(v2j<? super T> v2jVar, long j2, long j3, TimeUnit timeUnit, zeg zegVar, int i, boolean z) {
        this.downstream = v2jVar;
        this.count = j2;
        this.time = j3;
        this.unit = timeUnit;
        this.scheduler = zegVar;
        this.queue = new yki<>(i);
        this.delayError = z;
    }

    @Override // com.oplus.aiunit.vision.c3j
    public void cancel() {
        if (this.cancelled) {
            return;
        }
        this.cancelled = true;
        this.upstream.cancel();
        if (getAndIncrement() == 0) {
            this.queue.clear();
        }
    }

    public boolean checkTerminated(boolean z, v2j<? super T> v2jVar, boolean z2) {
        if (this.cancelled) {
            this.queue.clear();
            return true;
        }
        if (z2) {
            if (!z) {
                return false;
            }
            Throwable th = this.error;
            if (th != null) {
                v2jVar.onError(th);
            } else {
                v2jVar.onComplete();
            }
            return true;
        }
        Throwable th2 = this.error;
        if (th2 != null) {
            this.queue.clear();
            v2jVar.onError(th2);
            return true;
        }
        if (!z) {
            return false;
        }
        v2jVar.onComplete();
        return true;
    }

    public void drain() {
        if (getAndIncrement() != 0) {
            return;
        }
        v2j<? super T> v2jVar = this.downstream;
        yki<Object> ykiVar = this.queue;
        boolean z = this.delayError;
        int iAddAndGet = 1;
        do {
            if (this.done) {
                if (checkTerminated(ykiVar.isEmpty(), v2jVar, z)) {
                    return;
                }
                long j2 = this.requested.get();
                long j3 = 0;
                while (true) {
                    if (checkTerminated(ykiVar.peek() == null, v2jVar, z)) {
                        return;
                    }
                    if (j2 == j3) {
                        if (j3 == 0) {
                            break;
                        }
                        wr0.e(this.requested, j3);
                        break;
                    } else {
                        ykiVar.poll();
                        v2jVar.onNext(ykiVar.poll());
                        j3++;
                    }
                }
            }
            iAddAndGet = addAndGet(-iAddAndGet);
        } while (iAddAndGet != 0);
    }

    @Override // com.oplus.aiunit.vision.v2j
    public void onComplete() {
        trim(this.scheduler.b(this.unit), this.queue);
        this.done = true;
        drain();
    }

    @Override // com.oplus.aiunit.vision.v2j
    public void onError(Throwable th) {
        if (this.delayError) {
            trim(this.scheduler.b(this.unit), this.queue);
        }
        this.error = th;
        this.done = true;
        drain();
    }

    @Override // com.oplus.aiunit.vision.v2j
    public void onNext(T t) {
        yki<Object> ykiVar = this.queue;
        long jB = this.scheduler.b(this.unit);
        ykiVar.l(Long.valueOf(jB), t);
        trim(jB, ykiVar);
    }

    @Override // com.oplus.aiunit.vision.wu7, com.oplus.aiunit.vision.v2j
    public void onSubscribe(c3j c3jVar) {
        if (SubscriptionHelper.validate(this.upstream, c3jVar)) {
            this.upstream = c3jVar;
            this.downstream.onSubscribe(this);
            c3jVar.request(Long.MAX_VALUE);
        }
    }

    @Override // com.oplus.aiunit.vision.c3j
    public void request(long j2) {
        if (SubscriptionHelper.validate(j2)) {
            wr0.a(this.requested, j2);
            drain();
        }
    }

    public void trim(long j2, yki<Object> ykiVar) {
        long j3 = this.time;
        long j4 = this.count;
        boolean z = j4 == Long.MAX_VALUE;
        while (!ykiVar.isEmpty()) {
            if (((Long) ykiVar.peek()).longValue() >= j2 - j3 && (z || (ykiVar.n() >> 1) <= j4)) {
                return;
            }
            ykiVar.poll();
            ykiVar.poll();
        }
    }
}
