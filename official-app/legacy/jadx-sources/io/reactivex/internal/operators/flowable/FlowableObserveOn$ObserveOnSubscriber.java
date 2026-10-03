package io.reactivex.internal.operators.flowable;

import com.oplus.aiunit.vision.c3j;
import com.oplus.aiunit.vision.g4h;
import com.oplus.aiunit.vision.h7f;
import com.oplus.aiunit.vision.iu6;
import com.oplus.aiunit.vision.v2j;
import com.oplus.aiunit.vision.zeg;
import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.subscriptions.SubscriptionHelper;

/* JADX INFO: loaded from: classes10.dex */
final class FlowableObserveOn$ObserveOnSubscriber<T> extends FlowableObserveOn$BaseObserveOnSubscriber<T> {
    private static final long serialVersionUID = -4547113800637756442L;
    final v2j<? super T> downstream;

    public FlowableObserveOn$ObserveOnSubscriber(v2j<? super T> v2jVar, zeg.c cVar, boolean z, int i) {
        super(cVar, z, i);
        this.downstream = v2jVar;
    }

    @Override // io.reactivex.internal.operators.flowable.FlowableObserveOn$BaseObserveOnSubscriber, com.oplus.aiunit.vision.wu7, com.oplus.aiunit.vision.v2j
    public void onSubscribe(c3j c3jVar) {
        if (SubscriptionHelper.validate(this.upstream, c3jVar)) {
            this.upstream = c3jVar;
            if (c3jVar instanceof h7f) {
                h7f h7fVar = (h7f) c3jVar;
                int iRequestFusion = h7fVar.requestFusion(7);
                if (iRequestFusion == 1) {
                    this.sourceMode = 1;
                    this.queue = h7fVar;
                    this.done = true;
                    this.downstream.onSubscribe(this);
                    return;
                }
                if (iRequestFusion == 2) {
                    this.sourceMode = 2;
                    this.queue = h7fVar;
                    this.downstream.onSubscribe(this);
                    c3jVar.request(this.prefetch);
                    return;
                }
            }
            this.queue = new SpscArrayQueue(this.prefetch);
            this.downstream.onSubscribe(this);
            c3jVar.request(this.prefetch);
        }
    }

    @Override // io.reactivex.internal.operators.flowable.FlowableObserveOn$BaseObserveOnSubscriber, io.reactivex.internal.subscriptions.BasicIntQueueSubscription, com.oplus.aiunit.vision.g4h
    public T poll() throws Exception {
        T tPoll = this.queue.poll();
        if (tPoll != null && this.sourceMode != 1) {
            long j2 = this.produced + 1;
            if (j2 == this.limit) {
                this.produced = 0L;
                this.upstream.request(j2);
            } else {
                this.produced = j2;
            }
        }
        return tPoll;
    }

    @Override // io.reactivex.internal.operators.flowable.FlowableObserveOn$BaseObserveOnSubscriber
    public void runAsync() {
        v2j<? super T> v2jVar = this.downstream;
        g4h<T> g4hVar = this.queue;
        long j2 = this.produced;
        int iAddAndGet = 1;
        while (true) {
            long jAddAndGet = this.requested.get();
            while (j2 != jAddAndGet) {
                boolean z = this.done;
                try {
                    T tPoll = g4hVar.poll();
                    boolean z2 = tPoll == null;
                    if (checkTerminated(z, z2, v2jVar)) {
                        return;
                    }
                    if (z2) {
                        break;
                    }
                    v2jVar.onNext(tPoll);
                    j2++;
                    if (j2 == this.limit) {
                        if (jAddAndGet != Long.MAX_VALUE) {
                            jAddAndGet = this.requested.addAndGet(-j2);
                        }
                        this.upstream.request(j2);
                        j2 = 0;
                    }
                } catch (Throwable th) {
                    iu6.b(th);
                    this.cancelled = true;
                    this.upstream.cancel();
                    g4hVar.clear();
                    v2jVar.onError(th);
                    this.worker.dispose();
                    return;
                }
            }
            if (j2 == jAddAndGet && checkTerminated(this.done, g4hVar.isEmpty(), v2jVar)) {
                return;
            }
            int i = get();
            if (iAddAndGet == i) {
                this.produced = j2;
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            } else {
                iAddAndGet = i;
            }
        }
    }

    @Override // io.reactivex.internal.operators.flowable.FlowableObserveOn$BaseObserveOnSubscriber
    public void runBackfused() {
        int iAddAndGet = 1;
        while (!this.cancelled) {
            boolean z = this.done;
            this.downstream.onNext(null);
            if (z) {
                this.cancelled = true;
                Throwable th = this.error;
                if (th != null) {
                    this.downstream.onError(th);
                } else {
                    this.downstream.onComplete();
                }
                this.worker.dispose();
                return;
            }
            iAddAndGet = addAndGet(-iAddAndGet);
            if (iAddAndGet == 0) {
                return;
            }
        }
    }

    @Override // io.reactivex.internal.operators.flowable.FlowableObserveOn$BaseObserveOnSubscriber
    public void runSync() {
        v2j<? super T> v2jVar = this.downstream;
        g4h<T> g4hVar = this.queue;
        long j2 = this.produced;
        int iAddAndGet = 1;
        while (true) {
            long j3 = this.requested.get();
            while (j2 != j3) {
                try {
                    T tPoll = g4hVar.poll();
                    if (this.cancelled) {
                        return;
                    }
                    if (tPoll == null) {
                        this.cancelled = true;
                        v2jVar.onComplete();
                        this.worker.dispose();
                        return;
                    }
                    v2jVar.onNext(tPoll);
                    j2++;
                } catch (Throwable th) {
                    iu6.b(th);
                    this.cancelled = true;
                    this.upstream.cancel();
                    v2jVar.onError(th);
                    this.worker.dispose();
                    return;
                }
            }
            if (this.cancelled) {
                return;
            }
            if (g4hVar.isEmpty()) {
                this.cancelled = true;
                v2jVar.onComplete();
                this.worker.dispose();
                return;
            } else {
                int i = get();
                if (iAddAndGet == i) {
                    this.produced = j2;
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                } else {
                    iAddAndGet = i;
                }
            }
        }
    }
}
