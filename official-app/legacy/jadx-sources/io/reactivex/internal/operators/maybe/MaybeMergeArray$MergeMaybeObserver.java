package io.reactivex.internal.operators.maybe;

import com.oplus.aiunit.vision.cv5;
import com.oplus.aiunit.vision.h4g;
import com.oplus.aiunit.vision.kob;
import com.oplus.aiunit.vision.mob;
import com.oplus.aiunit.vision.v2j;
import com.oplus.aiunit.vision.wr0;
import com.oplus.aiunit.vision.ys3;
import io.reactivex.internal.subscriptions.BasicIntQueueSubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.NotificationLite;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes10.dex */
final class MaybeMergeArray$MergeMaybeObserver<T> extends BasicIntQueueSubscription<T> implements mob<T> {
    private static final long serialVersionUID = -660395290758764731L;
    volatile boolean cancelled;
    long consumed;
    final v2j<? super T> downstream;
    boolean outputFused;
    final kob<Object> queue;
    final int sourceCount;
    final ys3 set = new ys3();
    final AtomicLong requested = new AtomicLong();
    final AtomicThrowable error = new AtomicThrowable();

    public MaybeMergeArray$MergeMaybeObserver(v2j<? super T> v2jVar, int i, kob<Object> kobVar) {
        this.downstream = v2jVar;
        this.sourceCount = i;
        this.queue = kobVar;
    }

    @Override // io.reactivex.internal.subscriptions.BasicIntQueueSubscription, com.oplus.aiunit.vision.c3j
    public void cancel() {
        if (this.cancelled) {
            return;
        }
        this.cancelled = true;
        this.set.dispose();
        if (getAndIncrement() == 0) {
            this.queue.clear();
        }
    }

    @Override // io.reactivex.internal.subscriptions.BasicIntQueueSubscription, com.oplus.aiunit.vision.g4h
    public void clear() {
        this.queue.clear();
    }

    public void drain() {
        if (getAndIncrement() != 0) {
            return;
        }
        if (this.outputFused) {
            drainFused();
        } else {
            drainNormal();
        }
    }

    public void drainFused() {
        v2j<? super T> v2jVar = this.downstream;
        kob<Object> kobVar = this.queue;
        int iAddAndGet = 1;
        while (!this.cancelled) {
            Throwable th = this.error.get();
            if (th != null) {
                kobVar.clear();
                v2jVar.onError(th);
                return;
            }
            boolean z = kobVar.producerIndex() == this.sourceCount;
            if (!kobVar.isEmpty()) {
                v2jVar.onNext(null);
            }
            if (z) {
                v2jVar.onComplete();
                return;
            } else {
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
        }
        kobVar.clear();
    }

    public void drainNormal() {
        v2j<? super T> v2jVar = this.downstream;
        kob<Object> kobVar = this.queue;
        long j2 = this.consumed;
        int iAddAndGet = 1;
        do {
            long j3 = this.requested.get();
            while (j2 != j3) {
                if (this.cancelled) {
                    kobVar.clear();
                    return;
                }
                if (this.error.get() != null) {
                    kobVar.clear();
                    v2jVar.onError(this.error.terminate());
                    return;
                } else {
                    if (kobVar.consumerIndex() == this.sourceCount) {
                        v2jVar.onComplete();
                        return;
                    }
                    Object objPoll = kobVar.poll();
                    if (objPoll == null) {
                        break;
                    } else if (objPoll != NotificationLite.COMPLETE) {
                        v2jVar.onNext(objPoll);
                        j2++;
                    }
                }
            }
            if (j2 == j3) {
                if (this.error.get() != null) {
                    kobVar.clear();
                    v2jVar.onError(this.error.terminate());
                    return;
                } else {
                    while (kobVar.peek() == NotificationLite.COMPLETE) {
                        kobVar.drop();
                    }
                    if (kobVar.consumerIndex() == this.sourceCount) {
                        v2jVar.onComplete();
                        return;
                    }
                }
            }
            this.consumed = j2;
            iAddAndGet = addAndGet(-iAddAndGet);
        } while (iAddAndGet != 0);
    }

    public boolean isCancelled() {
        return this.cancelled;
    }

    @Override // io.reactivex.internal.subscriptions.BasicIntQueueSubscription, com.oplus.aiunit.vision.g4h
    public boolean isEmpty() {
        return this.queue.isEmpty();
    }

    @Override // com.oplus.aiunit.vision.mob
    public void onComplete() {
        this.queue.offer(NotificationLite.COMPLETE);
        drain();
    }

    @Override // com.oplus.aiunit.vision.mob
    public void onError(Throwable th) {
        if (!this.error.addThrowable(th)) {
            h4g.r(th);
            return;
        }
        this.set.dispose();
        this.queue.offer(NotificationLite.COMPLETE);
        drain();
    }

    @Override // com.oplus.aiunit.vision.mob
    public void onSubscribe(cv5 cv5Var) {
        this.set.a(cv5Var);
    }

    @Override // com.oplus.aiunit.vision.mob
    public void onSuccess(T t) {
        this.queue.offer(t);
        drain();
    }

    @Override // io.reactivex.internal.subscriptions.BasicIntQueueSubscription, com.oplus.aiunit.vision.g4h
    public T poll() throws Exception {
        T t;
        do {
            t = (T) this.queue.poll();
        } while (t == NotificationLite.COMPLETE);
        return t;
    }

    @Override // io.reactivex.internal.subscriptions.BasicIntQueueSubscription, com.oplus.aiunit.vision.c3j
    public void request(long j2) {
        if (SubscriptionHelper.validate(j2)) {
            wr0.a(this.requested, j2);
            drain();
        }
    }

    @Override // io.reactivex.internal.subscriptions.BasicIntQueueSubscription, com.oplus.aiunit.vision.f7f
    public int requestFusion(int i) {
        if ((i & 2) == 0) {
            return 0;
        }
        this.outputFused = true;
        return 2;
    }
}
