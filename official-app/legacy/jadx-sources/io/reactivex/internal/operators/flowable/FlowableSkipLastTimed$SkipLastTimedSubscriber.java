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
final class FlowableSkipLastTimed$SkipLastTimedSubscriber<T> extends AtomicInteger implements wu7<T>, c3j {
    private static final long serialVersionUID = -5677354903406201275L;
    volatile boolean cancelled;
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

    public FlowableSkipLastTimed$SkipLastTimedSubscriber(v2j<? super T> v2jVar, long j2, TimeUnit timeUnit, zeg zegVar, int i, boolean z) {
        this.downstream = v2jVar;
        this.time = j2;
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

    public boolean checkTerminated(boolean z, boolean z2, v2j<? super T> v2jVar, boolean z3) {
        if (this.cancelled) {
            this.queue.clear();
            return true;
        }
        if (!z) {
            return false;
        }
        if (z3) {
            if (!z2) {
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
        if (!z2) {
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
        TimeUnit timeUnit = this.unit;
        zeg zegVar = this.scheduler;
        long j2 = this.time;
        int iAddAndGet = 1;
        do {
            long j3 = this.requested.get();
            long j4 = 0;
            while (j4 != j3) {
                boolean z2 = this.done;
                Long l2 = (Long) ykiVar.peek();
                boolean z3 = l2 == null;
                boolean z4 = (z3 || l2.longValue() <= zegVar.b(timeUnit) - j2) ? z3 : true;
                if (checkTerminated(z2, z4, v2jVar, z)) {
                    return;
                }
                if (z4) {
                    break;
                }
                ykiVar.poll();
                v2jVar.onNext(ykiVar.poll());
                j4++;
            }
            if (j4 != 0) {
                wr0.e(this.requested, j4);
            }
            iAddAndGet = addAndGet(-iAddAndGet);
        } while (iAddAndGet != 0);
    }

    @Override // com.oplus.aiunit.vision.v2j
    public void onComplete() {
        this.done = true;
        drain();
    }

    @Override // com.oplus.aiunit.vision.v2j
    public void onError(Throwable th) {
        this.error = th;
        this.done = true;
        drain();
    }

    @Override // com.oplus.aiunit.vision.v2j
    public void onNext(T t) {
        this.queue.l(Long.valueOf(this.scheduler.b(this.unit)), t);
        drain();
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
}
