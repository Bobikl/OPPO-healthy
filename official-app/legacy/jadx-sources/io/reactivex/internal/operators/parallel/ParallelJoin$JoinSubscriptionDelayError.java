package io.reactivex.internal.operators.parallel;

import com.oplus.aiunit.vision.c4h;
import com.oplus.aiunit.vision.v2j;
import io.reactivex.exceptions.MissingBackpressureException;

/* JADX INFO: loaded from: classes10.dex */
final class ParallelJoin$JoinSubscriptionDelayError<T> extends ParallelJoin$JoinSubscriptionBase<T> {
    private static final long serialVersionUID = -5737965195918321883L;

    public ParallelJoin$JoinSubscriptionDelayError(v2j<? super T> v2jVar, int i, int i2) {
        super(v2jVar, i, i2);
    }

    @Override // io.reactivex.internal.operators.parallel.ParallelJoin$JoinSubscriptionBase
    public void drain() {
        if (getAndIncrement() != 0) {
            return;
        }
        drainLoop();
    }

    public void drainLoop() {
        boolean z;
        T tPoll;
        ParallelJoin$JoinInnerSubscriber<T>[] parallelJoin$JoinInnerSubscriberArr = this.subscribers;
        int length = parallelJoin$JoinInnerSubscriberArr.length;
        v2j<? super T> v2jVar = this.downstream;
        int i = 1;
        while (true) {
            long j2 = this.requested.get();
            long j3 = 0;
            while (j3 != j2) {
                if (this.cancelled) {
                    cleanup();
                    return;
                }
                boolean z2 = this.done.get() == 0;
                boolean z3 = true;
                for (ParallelJoin$JoinInnerSubscriber<T> parallelJoin$JoinInnerSubscriber : parallelJoin$JoinInnerSubscriberArr) {
                    c4h<T> c4hVar = parallelJoin$JoinInnerSubscriber.queue;
                    if (c4hVar != null && (tPoll = c4hVar.poll()) != null) {
                        v2jVar.onNext(tPoll);
                        parallelJoin$JoinInnerSubscriber.requestOne();
                        j3++;
                        if (j3 == j2) {
                            break;
                        } else {
                            z3 = false;
                        }
                    }
                }
                if (z2 && z3) {
                    if (this.errors.get() != null) {
                        v2jVar.onError(this.errors.terminate());
                        return;
                    } else {
                        v2jVar.onComplete();
                        return;
                    }
                }
                if (z3) {
                    break;
                }
            }
            if (j3 == j2) {
                if (this.cancelled) {
                    cleanup();
                    return;
                }
                boolean z4 = this.done.get() == 0;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        z = true;
                        break;
                    }
                    c4h<T> c4hVar2 = parallelJoin$JoinInnerSubscriberArr[i2].queue;
                    if (c4hVar2 != null && !c4hVar2.isEmpty()) {
                        z = false;
                        break;
                    }
                    i2++;
                }
                if (z4 && z) {
                    if (this.errors.get() != null) {
                        v2jVar.onError(this.errors.terminate());
                        return;
                    } else {
                        v2jVar.onComplete();
                        return;
                    }
                }
            }
            if (j3 != 0 && j2 != Long.MAX_VALUE) {
                this.requested.addAndGet(-j3);
            }
            int iAddAndGet = get();
            if (iAddAndGet == i && (iAddAndGet = addAndGet(-i)) == 0) {
                return;
            } else {
                i = iAddAndGet;
            }
        }
    }

    @Override // io.reactivex.internal.operators.parallel.ParallelJoin$JoinSubscriptionBase
    public void onComplete() {
        this.done.decrementAndGet();
        drain();
    }

    @Override // io.reactivex.internal.operators.parallel.ParallelJoin$JoinSubscriptionBase
    public void onError(Throwable th) {
        this.errors.addThrowable(th);
        this.done.decrementAndGet();
        drain();
    }

    @Override // io.reactivex.internal.operators.parallel.ParallelJoin$JoinSubscriptionBase
    public void onNext(ParallelJoin$JoinInnerSubscriber<T> parallelJoin$JoinInnerSubscriber, T t) {
        if (get() == 0 && compareAndSet(0, 1)) {
            if (this.requested.get() != 0) {
                this.downstream.onNext(t);
                if (this.requested.get() != Long.MAX_VALUE) {
                    this.requested.decrementAndGet();
                }
                parallelJoin$JoinInnerSubscriber.request(1L);
            } else if (!parallelJoin$JoinInnerSubscriber.getQueue().offer(t)) {
                parallelJoin$JoinInnerSubscriber.cancel();
                this.errors.addThrowable(new MissingBackpressureException("Queue full?!"));
                this.done.decrementAndGet();
                drainLoop();
                return;
            }
            if (decrementAndGet() == 0) {
                return;
            }
        } else {
            if (!parallelJoin$JoinInnerSubscriber.getQueue().offer(t) && parallelJoin$JoinInnerSubscriber.cancel()) {
                this.errors.addThrowable(new MissingBackpressureException("Queue full?!"));
                this.done.decrementAndGet();
            }
            if (getAndIncrement() != 0) {
                return;
            }
        }
        drainLoop();
    }
}
