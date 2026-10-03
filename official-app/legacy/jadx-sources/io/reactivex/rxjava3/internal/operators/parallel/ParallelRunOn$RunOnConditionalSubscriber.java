package io.reactivex.rxjava3.internal.operators.parallel;

import com.oplus.aiunit.vision.c3j;
import com.oplus.aiunit.vision.cfg;
import com.oplus.aiunit.vision.it3;
import com.oplus.aiunit.vision.vr0;
import io.reactivex.rxjava3.internal.queue.SpscArrayQueue;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;

/* JADX INFO: loaded from: classes10.dex */
final class ParallelRunOn$RunOnConditionalSubscriber<T> extends ParallelRunOn$BaseRunOnSubscriber<T> {
    private static final long serialVersionUID = 1075119423897941642L;
    final it3<? super T> downstream;

    public ParallelRunOn$RunOnConditionalSubscriber(it3<? super T> it3Var, int i, SpscArrayQueue<T> spscArrayQueue, cfg.c cVar) {
        super(i, spscArrayQueue, cVar);
        this.downstream = it3Var;
    }

    @Override // io.reactivex.rxjava3.internal.operators.parallel.ParallelRunOn$BaseRunOnSubscriber, com.oplus.aiunit.vision.vu7, com.oplus.aiunit.vision.v2j
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
        it3<? super T> it3Var = this.downstream;
        int i2 = this.limit;
        int iAddAndGet = 1;
        do {
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
                    it3Var.onError(th);
                    this.worker.dispose();
                    return;
                }
                T tPoll = spscArrayQueue.poll();
                boolean z2 = tPoll == null;
                if (z && z2) {
                    it3Var.onComplete();
                    this.worker.dispose();
                    return;
                } else {
                    if (z2) {
                        break;
                    }
                    if (it3Var.tryOnNext(tPoll)) {
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
                        it3Var.onError(th2);
                        this.worker.dispose();
                        return;
                    } else if (spscArrayQueue.isEmpty()) {
                        it3Var.onComplete();
                        this.worker.dispose();
                        return;
                    }
                }
            }
            if (j3 != 0) {
                vr0.e(this.requested, j3);
            }
            this.consumed = i;
            iAddAndGet = addAndGet(-iAddAndGet);
        } while (iAddAndGet != 0);
    }
}
