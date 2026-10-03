package io.reactivex.internal.operators.flowable;

import com.oplus.aiunit.vision.c3j;
import com.oplus.aiunit.vision.h4g;
import com.oplus.aiunit.vision.v2j;
import com.oplus.aiunit.vision.wr0;
import com.oplus.aiunit.vision.wu7;
import com.oplus.aiunit.vision.xt7;
import com.oplus.aiunit.vision.yki;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.processors.UnicastProcessor;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes10.dex */
final class FlowableWindow$WindowOverlapSubscriber<T> extends AtomicInteger implements wu7<T>, c3j, Runnable {
    private static final long serialVersionUID = 2428527070996323976L;
    final int bufferSize;
    volatile boolean cancelled;
    volatile boolean done;
    final v2j<? super xt7<T>> downstream;
    Throwable error;
    final AtomicBoolean firstRequest;
    long index;
    final AtomicBoolean once;
    long produced;
    final yki<UnicastProcessor<T>> queue;
    final AtomicLong requested;
    final long size;
    final long skip;
    c3j upstream;
    final ArrayDeque<UnicastProcessor<T>> windows;
    final AtomicInteger wip;

    public FlowableWindow$WindowOverlapSubscriber(v2j<? super xt7<T>> v2jVar, long j2, long j3, int i) {
        super(1);
        this.downstream = v2jVar;
        this.size = j2;
        this.skip = j3;
        this.queue = new yki<>(i);
        this.windows = new ArrayDeque<>();
        this.once = new AtomicBoolean();
        this.firstRequest = new AtomicBoolean();
        this.requested = new AtomicLong();
        this.wip = new AtomicInteger();
        this.bufferSize = i;
    }

    @Override // com.oplus.aiunit.vision.c3j
    public void cancel() {
        this.cancelled = true;
        if (this.once.compareAndSet(false, true)) {
            run();
        }
    }

    public boolean checkTerminated(boolean z, boolean z2, v2j<?> v2jVar, yki<?> ykiVar) {
        if (this.cancelled) {
            ykiVar.clear();
            return true;
        }
        if (!z) {
            return false;
        }
        Throwable th = this.error;
        if (th != null) {
            ykiVar.clear();
            v2jVar.onError(th);
            return true;
        }
        if (!z2) {
            return false;
        }
        v2jVar.onComplete();
        return true;
    }

    public void drain() {
        if (this.wip.getAndIncrement() != 0) {
            return;
        }
        v2j<? super xt7<T>> v2jVar = this.downstream;
        yki<UnicastProcessor<T>> ykiVar = this.queue;
        int iAddAndGet = 1;
        do {
            long j2 = this.requested.get();
            long j3 = 0;
            while (j3 != j2) {
                boolean z = this.done;
                UnicastProcessor<T> unicastProcessorPoll = ykiVar.poll();
                boolean z2 = unicastProcessorPoll == null;
                if (checkTerminated(z, z2, v2jVar, ykiVar)) {
                    return;
                }
                if (z2) {
                    break;
                }
                v2jVar.onNext(unicastProcessorPoll);
                j3++;
            }
            if (j3 == j2 && checkTerminated(this.done, ykiVar.isEmpty(), v2jVar, ykiVar)) {
                return;
            }
            if (j3 != 0 && j2 != Long.MAX_VALUE) {
                this.requested.addAndGet(-j3);
            }
            iAddAndGet = this.wip.addAndGet(-iAddAndGet);
        } while (iAddAndGet != 0);
    }

    @Override // com.oplus.aiunit.vision.v2j
    public void onComplete() {
        if (this.done) {
            return;
        }
        Iterator<UnicastProcessor<T>> it = this.windows.iterator();
        while (it.hasNext()) {
            it.next().onComplete();
        }
        this.windows.clear();
        this.done = true;
        drain();
    }

    @Override // com.oplus.aiunit.vision.v2j
    public void onError(Throwable th) {
        if (this.done) {
            h4g.r(th);
            return;
        }
        Iterator<UnicastProcessor<T>> it = this.windows.iterator();
        while (it.hasNext()) {
            it.next().onError(th);
        }
        this.windows.clear();
        this.error = th;
        this.done = true;
        drain();
    }

    @Override // com.oplus.aiunit.vision.v2j
    public void onNext(T t) {
        if (this.done) {
            return;
        }
        long j2 = this.index;
        if (j2 == 0 && !this.cancelled) {
            getAndIncrement();
            UnicastProcessor<T> unicastProcessorJ = UnicastProcessor.j(this.bufferSize, this);
            this.windows.offer(unicastProcessorJ);
            this.queue.offer(unicastProcessorJ);
            drain();
        }
        long j3 = j2 + 1;
        Iterator<UnicastProcessor<T>> it = this.windows.iterator();
        while (it.hasNext()) {
            it.next().onNext(t);
        }
        long j4 = this.produced + 1;
        if (j4 == this.size) {
            this.produced = j4 - this.skip;
            UnicastProcessor<T> unicastProcessorPoll = this.windows.poll();
            if (unicastProcessorPoll != null) {
                unicastProcessorPoll.onComplete();
            }
        } else {
            this.produced = j4;
        }
        if (j3 == this.skip) {
            this.index = 0L;
        } else {
            this.index = j3;
        }
    }

    @Override // com.oplus.aiunit.vision.wu7, com.oplus.aiunit.vision.v2j
    public void onSubscribe(c3j c3jVar) {
        if (SubscriptionHelper.validate(this.upstream, c3jVar)) {
            this.upstream = c3jVar;
            this.downstream.onSubscribe(this);
        }
    }

    @Override // com.oplus.aiunit.vision.c3j
    public void request(long j2) {
        if (SubscriptionHelper.validate(j2)) {
            wr0.a(this.requested, j2);
            if (this.firstRequest.get() || !this.firstRequest.compareAndSet(false, true)) {
                this.upstream.request(wr0.d(this.skip, j2));
            } else {
                this.upstream.request(wr0.c(this.size, wr0.d(this.skip, j2 - 1)));
            }
            drain();
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        if (decrementAndGet() == 0) {
            this.upstream.cancel();
        }
    }
}
