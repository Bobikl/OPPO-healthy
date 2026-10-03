package io.reactivex.rxjava3.internal.operators.maybe;

import com.oplus.aiunit.vision.job;
import com.oplus.aiunit.vision.lob;
import com.oplus.aiunit.vision.v2j;
import com.oplus.aiunit.vision.vr0;
import com.oplus.aiunit.vision.xs3;
import io.reactivex.rxjava3.internal.subscriptions.BasicIntQueueSubscription;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.internal.util.AtomicThrowable;
import io.reactivex.rxjava3.internal.util.NotificationLite;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes10.dex */
final class MaybeMergeArray$MergeMaybeObserver<T> extends BasicIntQueueSubscription<T> implements lob<T> {
    private static final long serialVersionUID = -660395290758764731L;
    volatile boolean cancelled;
    long consumed;
    final v2j<? super T> downstream;
    boolean outputFused;
    final job<Object> queue;
    final int sourceCount;
    final xs3 set = new xs3();
    final AtomicLong requested = new AtomicLong();
    final AtomicThrowable errors = new AtomicThrowable();

    public MaybeMergeArray$MergeMaybeObserver(v2j<? super T> v2jVar, int i, job<Object> jobVar) {
        this.downstream = v2jVar;
        this.sourceCount = i;
        this.queue = jobVar;
    }

    @Override // io.reactivex.rxjava3.internal.subscriptions.BasicIntQueueSubscription, com.oplus.aiunit.vision.c3j
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

    @Override // io.reactivex.rxjava3.internal.subscriptions.BasicIntQueueSubscription, com.oplus.aiunit.vision.f4h
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
        job<Object> jobVar = this.queue;
        int iAddAndGet = 1;
        while (!this.cancelled) {
            Throwable th = this.errors.get();
            if (th != null) {
                jobVar.clear();
                v2jVar.onError(th);
                return;
            }
            boolean z = jobVar.producerIndex() == this.sourceCount;
            if (!jobVar.isEmpty()) {
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
        jobVar.clear();
    }

    public void drainNormal() {
        v2j<? super T> v2jVar = this.downstream;
        job<Object> jobVar = this.queue;
        long j2 = this.consumed;
        int iAddAndGet = 1;
        do {
            long j3 = this.requested.get();
            while (j2 != j3) {
                if (this.cancelled) {
                    jobVar.clear();
                    return;
                }
                if (this.errors.get() != null) {
                    jobVar.clear();
                    this.errors.tryTerminateConsumer(this.downstream);
                    return;
                } else {
                    if (jobVar.consumerIndex() == this.sourceCount) {
                        v2jVar.onComplete();
                        return;
                    }
                    Object objPoll = jobVar.poll();
                    if (objPoll == null) {
                        break;
                    } else if (objPoll != NotificationLite.COMPLETE) {
                        v2jVar.onNext(objPoll);
                        j2++;
                    }
                }
            }
            if (j2 == j3) {
                if (this.errors.get() != null) {
                    jobVar.clear();
                    this.errors.tryTerminateConsumer(this.downstream);
                    return;
                } else {
                    while (jobVar.peek() == NotificationLite.COMPLETE) {
                        jobVar.drop();
                    }
                    if (jobVar.consumerIndex() == this.sourceCount) {
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

    @Override // io.reactivex.rxjava3.internal.subscriptions.BasicIntQueueSubscription, com.oplus.aiunit.vision.f4h
    public boolean isEmpty() {
        return this.queue.isEmpty();
    }

    @Override // com.oplus.aiunit.vision.lob
    public void onComplete() {
        this.queue.offer(NotificationLite.COMPLETE);
        drain();
    }

    @Override // com.oplus.aiunit.vision.lob
    public void onError(Throwable th) {
        if (this.errors.tryAddThrowableOrReport(th)) {
            this.set.dispose();
            this.queue.offer(NotificationLite.COMPLETE);
            drain();
        }
    }

    @Override // com.oplus.aiunit.vision.lob
    public void onSubscribe(io.reactivex.rxjava3.disposables.a aVar) {
        this.set.a(aVar);
    }

    @Override // com.oplus.aiunit.vision.lob, com.oplus.aiunit.vision.l6h
    public void onSuccess(T t) {
        this.queue.offer(t);
        drain();
    }

    @Override // io.reactivex.rxjava3.internal.subscriptions.BasicIntQueueSubscription, com.oplus.aiunit.vision.f4h
    public T poll() {
        T t;
        do {
            t = (T) this.queue.poll();
        } while (t == NotificationLite.COMPLETE);
        return t;
    }

    @Override // io.reactivex.rxjava3.internal.subscriptions.BasicIntQueueSubscription, com.oplus.aiunit.vision.c3j
    public void request(long j2) {
        if (SubscriptionHelper.validate(j2)) {
            vr0.a(this.requested, j2);
            drain();
        }
    }

    @Override // io.reactivex.rxjava3.internal.subscriptions.BasicIntQueueSubscription, com.oplus.aiunit.vision.e7f
    public int requestFusion(int i) {
        if ((i & 2) == 0) {
            return 0;
        }
        this.outputFused = true;
        return 2;
    }
}
