package io.reactivex.internal.operators.parallel;

import com.oplus.aiunit.vision.c3j;
import com.oplus.aiunit.vision.jt3;
import com.oplus.aiunit.vision.zeg;
import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.subscriptions.SubscriptionHelper;

/* JADX INFO: loaded from: classes10.dex */
final class ParallelRunOn$RunOnConditionalSubscriber<T> extends ParallelRunOn$BaseRunOnSubscriber<T> {
    private static final long serialVersionUID = 1075119423897941642L;
    final jt3<? super T> downstream;

    public ParallelRunOn$RunOnConditionalSubscriber(jt3<? super T> jt3Var, int i, SpscArrayQueue<T> spscArrayQueue, zeg.c cVar) {
        super(i, spscArrayQueue, cVar);
        this.downstream = jt3Var;
    }

    @Override // io.reactivex.internal.operators.parallel.ParallelRunOn$BaseRunOnSubscriber, com.oplus.aiunit.vision.wu7, com.oplus.aiunit.vision.v2j
    public void onSubscribe(c3j c3jVar) {
        if (SubscriptionHelper.validate(this.upstream, c3jVar)) {
            this.upstream = c3jVar;
            this.downstream.onSubscribe(this);
            c3jVar.request(this.prefetch);
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        Throwable th;
        int i = this.consumed;
        SpscArrayQueue<T> spscArrayQueue = this.queue;
        jt3<? super T> jt3Var = this.downstream;
        int i2 = this.limit;
        int iAddAndGet = 1;
        while (true) {
            long j2 = this.requested.get();
            long j3 = 0;
            while (j3 != j2) {
                if (this.cancelled) {
                    spscArrayQueue.clear();
                    return;
                }
                boolean z = this.done;
                if (z && (th = this.error) != null) {
                    spscArrayQueue.clear();
                    jt3Var.onError(th);
                    this.worker.dispose();
                    return;
                }
                T tPoll = spscArrayQueue.poll();
                boolean z2 = tPoll == null;
                if (z && z2) {
                    jt3Var.onComplete();
                    this.worker.dispose();
                    return;
                } else {
                    if (z2) {
                        break;
                    }
                    if (jt3Var.tryOnNext(tPoll)) {
                        j3++;
                    }
                    i++;
                    if (i == i2) {
                        this.upstream.request(i);
                        i = 0;
                    }
                }
            }
            if (j3 == j2) {
                if (this.cancelled) {
                    spscArrayQueue.clear();
                    return;
                }
                if (this.done) {
                    Throwable th2 = this.error;
                    if (th2 != null) {
                        spscArrayQueue.clear();
                        jt3Var.onError(th2);
                        this.worker.dispose();
                        return;
                    } else if (spscArrayQueue.isEmpty()) {
                        jt3Var.onComplete();
                        this.worker.dispose();
                        return;
                    }
                }
            }
            if (j3 != 0 && j2 != Long.MAX_VALUE) {
                this.requested.addAndGet(-j3);
            }
            int i3 = get();
            if (i3 == iAddAndGet) {
                this.consumed = i;
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            } else {
                iAddAndGet = i3;
            }
        }
    }
}
