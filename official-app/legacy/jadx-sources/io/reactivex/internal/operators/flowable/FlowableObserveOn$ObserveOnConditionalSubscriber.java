package io.reactivex.internal.operators.flowable;

import com.oplus.aiunit.vision.c3j;
import com.oplus.aiunit.vision.g4h;
import com.oplus.aiunit.vision.h7f;
import com.oplus.aiunit.vision.iu6;
import com.oplus.aiunit.vision.jt3;
import com.oplus.aiunit.vision.zeg;
import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.subscriptions.SubscriptionHelper;

/* JADX INFO: loaded from: classes10.dex */
final class FlowableObserveOn$ObserveOnConditionalSubscriber<T> extends FlowableObserveOn$BaseObserveOnSubscriber<T> {
    private static final long serialVersionUID = 644624475404284533L;
    long consumed;
    final jt3<? super T> downstream;

    public FlowableObserveOn$ObserveOnConditionalSubscriber(jt3<? super T> jt3Var, zeg.c cVar, boolean z, int i) {
        super(cVar, z, i);
        this.downstream = jt3Var;
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
            long j2 = this.consumed + 1;
            if (j2 == this.limit) {
                this.consumed = 0L;
                this.upstream.request(j2);
            } else {
                this.consumed = j2;
            }
        }
        return tPoll;
    }

    @Override // io.reactivex.internal.operators.flowable.FlowableObserveOn$BaseObserveOnSubscriber
    public void runAsync() {
        jt3<? super T> jt3Var = this.downstream;
        g4h<T> g4hVar = this.queue;
        long j2 = this.produced;
        long j3 = this.consumed;
        int iAddAndGet = 1;
        while (true) {
            long j4 = this.requested.get();
            while (j2 != j4) {
                boolean z = this.done;
                try {
                    T tPoll = g4hVar.poll();
                    boolean z2 = tPoll == null;
                    if (checkTerminated(z, z2, jt3Var)) {
                        return;
                    }
                    if (z2) {
                        break;
                    }
                    if (jt3Var.tryOnNext(tPoll)) {
                        j2++;
                    }
                    j3++;
                    if (j3 == this.limit) {
                        this.upstream.request(j3);
                        j3 = 0;
                    }
                } catch (Throwable th) {
                    iu6.b(th);
                    this.cancelled = true;
                    this.upstream.cancel();
                    g4hVar.clear();
                    jt3Var.onError(th);
                    this.worker.dispose();
                    return;
                }
            }
            if (j2 == j4 && checkTerminated(this.done, g4hVar.isEmpty(), jt3Var)) {
                return;
            }
            int i = get();
            if (iAddAndGet == i) {
                this.produced = j2;
                this.consumed = j3;
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
        jt3<? super T> jt3Var = this.downstream;
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
                        jt3Var.onComplete();
                        this.worker.dispose();
                        return;
                    } else if (jt3Var.tryOnNext(tPoll)) {
                        j2++;
                    }
                } catch (Throwable th) {
                    iu6.b(th);
                    this.cancelled = true;
                    this.upstream.cancel();
                    jt3Var.onError(th);
                    this.worker.dispose();
                    return;
                }
            }
            if (this.cancelled) {
                return;
            }
            if (g4hVar.isEmpty()) {
                this.cancelled = true;
                jt3Var.onComplete();
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
