package io.reactivex.internal.operators.flowable;

import com.oplus.aiunit.vision.c3j;
import com.oplus.aiunit.vision.eo;
import com.oplus.aiunit.vision.h4g;
import com.oplus.aiunit.vision.iu6;
import com.oplus.aiunit.vision.mu7;
import com.oplus.aiunit.vision.v2j;
import com.oplus.aiunit.vision.wr0;
import com.oplus.aiunit.vision.wu7;
import io.reactivex.BackpressureOverflowStrategy;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes10.dex */
final class FlowableOnBackpressureBufferStrategy$OnBackpressureBufferStrategySubscriber<T> extends AtomicInteger implements wu7<T>, c3j {
    private static final long serialVersionUID = 3240706908776709697L;
    final long bufferSize;
    volatile boolean cancelled;
    volatile boolean done;
    final v2j<? super T> downstream;
    Throwable error;
    final eo onOverflow;
    final BackpressureOverflowStrategy strategy;
    c3j upstream;
    final AtomicLong requested = new AtomicLong();
    final Deque<T> deque = new ArrayDeque();

    public FlowableOnBackpressureBufferStrategy$OnBackpressureBufferStrategySubscriber(v2j<? super T> v2jVar, eo eoVar, BackpressureOverflowStrategy backpressureOverflowStrategy, long j2) {
        this.downstream = v2jVar;
        this.onOverflow = eoVar;
        this.strategy = backpressureOverflowStrategy;
        this.bufferSize = j2;
    }

    @Override // com.oplus.aiunit.vision.c3j
    public void cancel() {
        this.cancelled = true;
        this.upstream.cancel();
        if (getAndIncrement() == 0) {
            clear(this.deque);
        }
    }

    public void clear(Deque<T> deque) {
        synchronized (deque) {
            deque.clear();
        }
    }

    public void drain() {
        boolean zIsEmpty;
        T tPoll;
        if (getAndIncrement() != 0) {
            return;
        }
        Deque<T> deque = this.deque;
        v2j<? super T> v2jVar = this.downstream;
        int iAddAndGet = 1;
        do {
            long j2 = this.requested.get();
            long j3 = 0;
            while (j3 != j2) {
                if (this.cancelled) {
                    clear(deque);
                    return;
                }
                boolean z = this.done;
                synchronized (deque) {
                    tPoll = deque.poll();
                }
                boolean z2 = tPoll == null;
                if (z) {
                    Throwable th = this.error;
                    if (th != null) {
                        clear(deque);
                        v2jVar.onError(th);
                        return;
                    } else if (z2) {
                        v2jVar.onComplete();
                        return;
                    }
                }
                if (z2) {
                    break;
                }
                v2jVar.onNext(tPoll);
                j3++;
            }
            if (j3 == j2) {
                if (this.cancelled) {
                    clear(deque);
                    return;
                }
                boolean z3 = this.done;
                synchronized (deque) {
                    zIsEmpty = deque.isEmpty();
                }
                if (z3) {
                    Throwable th2 = this.error;
                    if (th2 != null) {
                        clear(deque);
                        v2jVar.onError(th2);
                        return;
                    } else if (zIsEmpty) {
                        v2jVar.onComplete();
                        return;
                    }
                }
            }
            if (j3 != 0) {
                wr0.e(this.requested, j3);
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
        if (this.done) {
            h4g.r(th);
            return;
        }
        this.error = th;
        this.done = true;
        drain();
    }

    @Override // com.oplus.aiunit.vision.v2j
    public void onNext(T t) {
        boolean z;
        boolean z2;
        if (this.done) {
            return;
        }
        Deque<T> deque = this.deque;
        synchronized (deque) {
            z = false;
            if (deque.size() == this.bufferSize) {
                int i = mu7.a[this.strategy.ordinal()];
                z2 = true;
                if (i == 1) {
                    deque.pollLast();
                    deque.offer(t);
                } else if (i == 2) {
                    deque.poll();
                    deque.offer(t);
                }
                z2 = false;
                z = true;
            } else {
                deque.offer(t);
                z2 = false;
            }
        }
        if (!z) {
            if (!z2) {
                drain();
                return;
            } else {
                this.upstream.cancel();
                onError(new MissingBackpressureException());
                return;
            }
        }
        eo eoVar = this.onOverflow;
        if (eoVar != null) {
            try {
                eoVar.run();
            } catch (Throwable th) {
                iu6.b(th);
                this.upstream.cancel();
                onError(th);
            }
        }
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
