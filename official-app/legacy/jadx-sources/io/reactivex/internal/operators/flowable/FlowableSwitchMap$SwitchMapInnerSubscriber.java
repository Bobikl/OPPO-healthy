package io.reactivex.internal.operators.flowable;

import com.oplus.aiunit.vision.c3j;
import com.oplus.aiunit.vision.g4h;
import com.oplus.aiunit.vision.h4g;
import com.oplus.aiunit.vision.h7f;
import com.oplus.aiunit.vision.wu7;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
final class FlowableSwitchMap$SwitchMapInnerSubscriber<T, R> extends AtomicReference<c3j> implements wu7<R> {
    private static final long serialVersionUID = 3837284832786408377L;
    final int bufferSize;
    volatile boolean done;
    int fusionMode;
    final long index;
    final FlowableSwitchMap$SwitchMapSubscriber<T, R> parent;
    volatile g4h<R> queue;

    public FlowableSwitchMap$SwitchMapInnerSubscriber(FlowableSwitchMap$SwitchMapSubscriber<T, R> flowableSwitchMap$SwitchMapSubscriber, long j2, int i) {
        this.parent = flowableSwitchMap$SwitchMapSubscriber;
        this.index = j2;
        this.bufferSize = i;
    }

    public void cancel() {
        SubscriptionHelper.cancel(this);
    }

    @Override // com.oplus.aiunit.vision.v2j
    public void onComplete() {
        FlowableSwitchMap$SwitchMapSubscriber<T, R> flowableSwitchMap$SwitchMapSubscriber = this.parent;
        if (this.index == flowableSwitchMap$SwitchMapSubscriber.unique) {
            this.done = true;
            flowableSwitchMap$SwitchMapSubscriber.drain();
        }
    }

    @Override // com.oplus.aiunit.vision.v2j
    public void onError(Throwable th) {
        FlowableSwitchMap$SwitchMapSubscriber<T, R> flowableSwitchMap$SwitchMapSubscriber = this.parent;
        if (this.index != flowableSwitchMap$SwitchMapSubscriber.unique || !flowableSwitchMap$SwitchMapSubscriber.error.addThrowable(th)) {
            h4g.r(th);
            return;
        }
        if (!flowableSwitchMap$SwitchMapSubscriber.delayErrors) {
            flowableSwitchMap$SwitchMapSubscriber.upstream.cancel();
        }
        this.done = true;
        flowableSwitchMap$SwitchMapSubscriber.drain();
    }

    @Override // com.oplus.aiunit.vision.v2j
    public void onNext(R r) {
        FlowableSwitchMap$SwitchMapSubscriber<T, R> flowableSwitchMap$SwitchMapSubscriber = this.parent;
        if (this.index == flowableSwitchMap$SwitchMapSubscriber.unique) {
            if (this.fusionMode != 0 || this.queue.offer(r)) {
                flowableSwitchMap$SwitchMapSubscriber.drain();
            } else {
                onError(new MissingBackpressureException("Queue full?!"));
            }
        }
    }

    @Override // com.oplus.aiunit.vision.wu7, com.oplus.aiunit.vision.v2j
    public void onSubscribe(c3j c3jVar) {
        if (SubscriptionHelper.setOnce(this, c3jVar)) {
            if (c3jVar instanceof h7f) {
                h7f h7fVar = (h7f) c3jVar;
                int iRequestFusion = h7fVar.requestFusion(7);
                if (iRequestFusion == 1) {
                    this.fusionMode = iRequestFusion;
                    this.queue = h7fVar;
                    this.done = true;
                    this.parent.drain();
                    return;
                }
                if (iRequestFusion == 2) {
                    this.fusionMode = iRequestFusion;
                    this.queue = h7fVar;
                    c3jVar.request(this.bufferSize);
                    return;
                }
            }
            this.queue = new SpscArrayQueue(this.bufferSize);
            c3jVar.request(this.bufferSize);
        }
    }
}
