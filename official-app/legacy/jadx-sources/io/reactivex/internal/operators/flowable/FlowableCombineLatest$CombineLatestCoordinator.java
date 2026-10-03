package io.reactivex.internal.operators.flowable;

import com.oplus.aiunit.vision.abd;
import com.oplus.aiunit.vision.h4g;
import com.oplus.aiunit.vision.iu6;
import com.oplus.aiunit.vision.j08;
import com.oplus.aiunit.vision.k3f;
import com.oplus.aiunit.vision.v2j;
import com.oplus.aiunit.vision.wr0;
import com.oplus.aiunit.vision.yki;
import io.reactivex.internal.subscriptions.BasicIntQueueSubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.ExceptionHelper;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
final class FlowableCombineLatest$CombineLatestCoordinator<T, R> extends BasicIntQueueSubscription<R> {
    private static final long serialVersionUID = -5082275438355852221L;
    volatile boolean cancelled;
    final j08<? super Object[], ? extends R> combiner;
    int completedSources;
    final boolean delayErrors;
    volatile boolean done;
    final v2j<? super R> downstream;
    final AtomicReference<Throwable> error;
    final Object[] latest;
    int nonEmptySources;
    boolean outputFused;
    final yki<Object> queue;
    final AtomicLong requested;
    final FlowableCombineLatest$CombineLatestInnerSubscriber<T>[] subscribers;

    public FlowableCombineLatest$CombineLatestCoordinator(v2j<? super R> v2jVar, j08<? super Object[], ? extends R> j08Var, int i, int i2, boolean z) {
        this.downstream = v2jVar;
        this.combiner = j08Var;
        FlowableCombineLatest$CombineLatestInnerSubscriber<T>[] flowableCombineLatest$CombineLatestInnerSubscriberArr = new FlowableCombineLatest$CombineLatestInnerSubscriber[i];
        for (int i3 = 0; i3 < i; i3++) {
            flowableCombineLatest$CombineLatestInnerSubscriberArr[i3] = new FlowableCombineLatest$CombineLatestInnerSubscriber<>(this, i3, i2);
        }
        this.subscribers = flowableCombineLatest$CombineLatestInnerSubscriberArr;
        this.latest = new Object[i];
        this.queue = new yki<>(i2);
        this.requested = new AtomicLong();
        this.error = new AtomicReference<>();
        this.delayErrors = z;
    }

    @Override // io.reactivex.internal.subscriptions.BasicIntQueueSubscription, com.oplus.aiunit.vision.c3j
    public void cancel() {
        this.cancelled = true;
        cancelAll();
    }

    public void cancelAll() {
        for (FlowableCombineLatest$CombineLatestInnerSubscriber<T> flowableCombineLatest$CombineLatestInnerSubscriber : this.subscribers) {
            flowableCombineLatest$CombineLatestInnerSubscriber.cancel();
        }
    }

    public boolean checkTerminated(boolean z, boolean z2, v2j<?> v2jVar, yki<?> ykiVar) {
        if (this.cancelled) {
            cancelAll();
            ykiVar.clear();
            return true;
        }
        if (!z) {
            return false;
        }
        if (this.delayErrors) {
            if (!z2) {
                return false;
            }
            cancelAll();
            Throwable thB = ExceptionHelper.b(this.error);
            if (thB == null || thB == ExceptionHelper.TERMINATED) {
                v2jVar.onComplete();
            } else {
                v2jVar.onError(thB);
            }
            return true;
        }
        Throwable thB2 = ExceptionHelper.b(this.error);
        if (thB2 != null && thB2 != ExceptionHelper.TERMINATED) {
            cancelAll();
            ykiVar.clear();
            v2jVar.onError(thB2);
            return true;
        }
        if (!z2) {
            return false;
        }
        cancelAll();
        v2jVar.onComplete();
        return true;
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
            drainOutput();
        } else {
            drainAsync();
        }
    }

    public void drainAsync() {
        v2j<? super R> v2jVar = this.downstream;
        yki<?> ykiVar = this.queue;
        int iAddAndGet = 1;
        do {
            long j2 = this.requested.get();
            long j3 = 0;
            while (j3 != j2) {
                boolean z = this.done;
                Object objPoll = ykiVar.poll();
                boolean z2 = objPoll == null;
                if (checkTerminated(z, z2, v2jVar, ykiVar)) {
                    return;
                }
                if (z2) {
                    break;
                }
                try {
                    v2jVar.onNext((Object) abd.d(this.combiner.apply((Object[]) ykiVar.poll()), "The combiner returned a null value"));
                    ((FlowableCombineLatest$CombineLatestInnerSubscriber) objPoll).requestOne();
                    j3++;
                } catch (Throwable th) {
                    iu6.b(th);
                    cancelAll();
                    ExceptionHelper.a(this.error, th);
                    v2jVar.onError(ExceptionHelper.b(this.error));
                    return;
                }
            }
            if (j3 == j2 && checkTerminated(this.done, ykiVar.isEmpty(), v2jVar, ykiVar)) {
                return;
            }
            if (j3 != 0 && j2 != Long.MAX_VALUE) {
                this.requested.addAndGet(-j3);
            }
            iAddAndGet = addAndGet(-iAddAndGet);
        } while (iAddAndGet != 0);
    }

    public void drainOutput() {
        v2j<? super R> v2jVar = this.downstream;
        yki<Object> ykiVar = this.queue;
        int iAddAndGet = 1;
        while (!this.cancelled) {
            Throwable th = this.error.get();
            if (th != null) {
                ykiVar.clear();
                v2jVar.onError(th);
                return;
            }
            boolean z = this.done;
            boolean zIsEmpty = ykiVar.isEmpty();
            if (!zIsEmpty) {
                v2jVar.onNext(null);
            }
            if (z && zIsEmpty) {
                v2jVar.onComplete();
                return;
            } else {
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
        }
        ykiVar.clear();
    }

    public void innerComplete(int i) {
        int i2;
        synchronized (this) {
            Object[] objArr = this.latest;
            if (objArr[i] != null && (i2 = this.completedSources + 1) != objArr.length) {
                this.completedSources = i2;
            } else {
                this.done = true;
                drain();
            }
        }
    }

    public void innerError(int i, Throwable th) {
        if (!ExceptionHelper.a(this.error, th)) {
            h4g.r(th);
        } else {
            if (this.delayErrors) {
                innerComplete(i);
                return;
            }
            cancelAll();
            this.done = true;
            drain();
        }
    }

    public void innerValue(int i, T t) {
        boolean z;
        synchronized (this) {
            Object[] objArr = this.latest;
            int i2 = this.nonEmptySources;
            if (objArr[i] == null) {
                i2++;
                this.nonEmptySources = i2;
            }
            objArr[i] = t;
            if (objArr.length == i2) {
                this.queue.l(this.subscribers[i], objArr.clone());
                z = false;
            } else {
                z = true;
            }
        }
        if (z) {
            this.subscribers[i].requestOne();
        } else {
            drain();
        }
    }

    @Override // io.reactivex.internal.subscriptions.BasicIntQueueSubscription, com.oplus.aiunit.vision.g4h
    public boolean isEmpty() {
        return this.queue.isEmpty();
    }

    @Override // io.reactivex.internal.subscriptions.BasicIntQueueSubscription, com.oplus.aiunit.vision.g4h
    public R poll() throws Exception {
        Object objPoll = this.queue.poll();
        if (objPoll == null) {
            return null;
        }
        R r = (R) abd.d(this.combiner.apply((Object[]) this.queue.poll()), "The combiner returned a null value");
        ((FlowableCombineLatest$CombineLatestInnerSubscriber) objPoll).requestOne();
        return r;
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
        if ((i & 4) != 0) {
            return 0;
        }
        int i2 = i & 2;
        this.outputFused = i2 != 0;
        return i2;
    }

    public void subscribe(k3f<? extends T>[] k3fVarArr, int i) {
        FlowableCombineLatest$CombineLatestInnerSubscriber<T>[] flowableCombineLatest$CombineLatestInnerSubscriberArr = this.subscribers;
        for (int i2 = 0; i2 < i && !this.done && !this.cancelled; i2++) {
            k3fVarArr[i2].subscribe(flowableCombineLatest$CombineLatestInnerSubscriberArr[i2]);
        }
    }
}
