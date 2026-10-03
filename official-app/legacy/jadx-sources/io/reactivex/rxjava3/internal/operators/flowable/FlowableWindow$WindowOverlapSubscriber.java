package io.reactivex.rxjava3.internal.operators.flowable;

import com.oplus.aiunit.vision.c3j;
import com.oplus.aiunit.vision.fv7;
import com.oplus.aiunit.vision.v2j;
import com.oplus.aiunit.vision.vr0;
import com.oplus.aiunit.vision.vu7;
import com.oplus.aiunit.vision.wt7;
import com.oplus.aiunit.vision.xki;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.processors.UnicastProcessor;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes10.dex */
final class FlowableWindow$WindowOverlapSubscriber<T> extends AtomicInteger implements vu7<T>, c3j, Runnable {
    private static final long serialVersionUID = 2428527070996323976L;
    final int bufferSize;
    volatile boolean cancelled;
    volatile boolean done;
    final v2j<? super wt7<T>> downstream;
    Throwable error;
    final AtomicBoolean firstRequest;
    long index;
    final AtomicBoolean once;
    long produced;
    final xki<UnicastProcessor<T>> queue;
    final AtomicLong requested;
    final long size;
    final long skip;
    c3j upstream;
    final ArrayDeque<UnicastProcessor<T>> windows;
    final AtomicInteger wip;

    public FlowableWindow$WindowOverlapSubscriber(v2j<? super wt7<T>> v2jVar, long j2, long j3, int i) {
        super(1);
        this.downstream = v2jVar;
        this.size = j2;
        this.skip = j3;
        this.queue = new xki<>(i);
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
        drain();
    }

    public boolean checkTerminated(boolean z, boolean z2, v2j<?> v2jVar, xki<?> xkiVar) {
        if (!z) {
            return false;
        }
        Throwable th = this.error;
        if (th != null) {
            xkiVar.clear();
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
        v2j<? super wt7<T>> v2jVar = this.downstream;
        xki<UnicastProcessor<T>> xkiVar = this.queue;
        int iAddAndGet = 1;
        while (true) {
            if (this.cancelled) {
                while (true) {
                    UnicastProcessor<T> unicastProcessorPoll = xkiVar.poll();
                    if (unicastProcessorPoll == null) {
                        break;
                    } else {
                        unicastProcessorPoll.onComplete();
                    }
                }
            } else {
                long j2 = this.requested.get();
                long j3 = 0;
                while (true) {
                    if (j3 != j2) {
                        boolean z = this.done;
                        UnicastProcessor<T> unicastProcessorPoll2 = xkiVar.poll();
                        boolean z2 = unicastProcessorPoll2 == null;
                        if (this.cancelled) {
                            continue;
                        } else {
                            if (checkTerminated(z, z2, v2jVar, xkiVar)) {
                                return;
                            }
                            if (!z2) {
                                fv7 fv7Var = new fv7(unicastProcessorPoll2);
                                v2jVar.onNext(fv7Var);
                                if (fv7Var.D()) {
                                    unicastProcessorPoll2.onComplete();
                                }
                                j3++;
                            }
                        }
                    }
                    if (j3 == j2) {
                        if (this.cancelled) {
                            continue;
                        } else if (checkTerminated(this.done, xkiVar.isEmpty(), v2jVar, xkiVar)) {
                            return;
                        }
                    }
                    if (j3 != 0 && j2 != Long.MAX_VALUE) {
                        this.requested.addAndGet(-j3);
                    }
                }
            }
            iAddAndGet = this.wip.addAndGet(-iAddAndGet);
            if (iAddAndGet == 0) {
                return;
            }
        }
    }

    @Override // com.oplus.aiunit.vision.v2j
    public void onComplete() {
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
        UnicastProcessor<T> unicastProcessorG;
        long j2 = this.index;
        if (j2 != 0 || this.cancelled) {
            unicastProcessorG = null;
        } else {
            getAndIncrement();
            unicastProcessorG = UnicastProcessor.G(this.bufferSize, this);
            this.windows.offer(unicastProcessorG);
        }
        long j3 = j2 + 1;
        Iterator<UnicastProcessor<T>> it = this.windows.iterator();
        while (it.hasNext()) {
            it.next().onNext(t);
        }
        if (unicastProcessorG != null) {
            this.queue.offer(unicastProcessorG);
            drain();
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

    @Override // com.oplus.aiunit.vision.vu7, com.oplus.aiunit.vision.v2j
    public void onSubscribe(c3j c3jVar) {
        if (SubscriptionHelper.validate(this.upstream, c3jVar)) {
            this.upstream = c3jVar;
            this.downstream.onSubscribe(this);
        }
    }

    @Override // com.oplus.aiunit.vision.c3j
    public void request(long j2) {
        if (SubscriptionHelper.validate(j2)) {
            vr0.a(this.requested, j2);
            if (this.firstRequest.get() || !this.firstRequest.compareAndSet(false, true)) {
                this.upstream.request(vr0.d(this.skip, j2));
            } else {
                this.upstream.request(vr0.c(this.size, vr0.d(this.skip, j2 - 1)));
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
