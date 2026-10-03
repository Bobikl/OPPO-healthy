package io.reactivex.internal.operators.flowable;

import com.oplus.aiunit.vision.c3j;
import com.oplus.aiunit.vision.cv5;
import com.oplus.aiunit.vision.fue;
import com.oplus.aiunit.vision.g4h;
import com.oplus.aiunit.vision.h4g;
import com.oplus.aiunit.vision.h7f;
import com.oplus.aiunit.vision.iu6;
import com.oplus.aiunit.vision.wu7;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
final class FlowablePublishAlt$PublishConnection<T> extends AtomicInteger implements wu7<T>, cv5 {
    static final FlowablePublishAlt$InnerSubscription[] EMPTY = new FlowablePublishAlt$InnerSubscription[0];
    static final FlowablePublishAlt$InnerSubscription[] TERMINATED = new FlowablePublishAlt$InnerSubscription[0];
    private static final long serialVersionUID = -1672047311619175801L;
    final int bufferSize;
    int consumed;
    final AtomicReference<FlowablePublishAlt$PublishConnection<T>> current;
    volatile boolean done;
    Throwable error;
    volatile g4h<T> queue;
    int sourceMode;
    final AtomicReference<c3j> upstream = new AtomicReference<>();
    final AtomicBoolean connect = new AtomicBoolean();
    final AtomicReference<FlowablePublishAlt$InnerSubscription<T>[]> subscribers = new AtomicReference<>(EMPTY);

    public FlowablePublishAlt$PublishConnection(AtomicReference<FlowablePublishAlt$PublishConnection<T>> atomicReference, int i) {
        this.current = atomicReference;
        this.bufferSize = i;
    }

    public boolean add(FlowablePublishAlt$InnerSubscription<T> flowablePublishAlt$InnerSubscription) {
        FlowablePublishAlt$InnerSubscription<T>[] flowablePublishAlt$InnerSubscriptionArr;
        FlowablePublishAlt$InnerSubscription[] flowablePublishAlt$InnerSubscriptionArr2;
        do {
            flowablePublishAlt$InnerSubscriptionArr = this.subscribers.get();
            if (flowablePublishAlt$InnerSubscriptionArr == TERMINATED) {
                return false;
            }
            int length = flowablePublishAlt$InnerSubscriptionArr.length;
            flowablePublishAlt$InnerSubscriptionArr2 = new FlowablePublishAlt$InnerSubscription[length + 1];
            System.arraycopy(flowablePublishAlt$InnerSubscriptionArr, 0, flowablePublishAlt$InnerSubscriptionArr2, 0, length);
            flowablePublishAlt$InnerSubscriptionArr2[length] = flowablePublishAlt$InnerSubscription;
        } while (!fue.a(this.subscribers, flowablePublishAlt$InnerSubscriptionArr, flowablePublishAlt$InnerSubscriptionArr2));
        return true;
    }

    public boolean checkTerminated(boolean z, boolean z2) {
        if (!z || !z2) {
            return false;
        }
        Throwable th = this.error;
        if (th != null) {
            signalError(th);
            return true;
        }
        for (FlowablePublishAlt$InnerSubscription<T> flowablePublishAlt$InnerSubscription : this.subscribers.getAndSet(TERMINATED)) {
            if (!flowablePublishAlt$InnerSubscription.isCancelled()) {
                flowablePublishAlt$InnerSubscription.downstream.onComplete();
            }
        }
        return true;
    }

    @Override // com.oplus.aiunit.vision.cv5
    public void dispose() {
        this.subscribers.getAndSet(TERMINATED);
        fue.a(this.current, this, null);
        SubscriptionHelper.cancel(this.upstream);
    }

    public void drain() {
        if (getAndIncrement() != 0) {
            return;
        }
        g4h<T> g4hVar = this.queue;
        int i = this.consumed;
        int i2 = this.bufferSize;
        int i3 = i2 - (i2 >> 2);
        boolean z = this.sourceMode != 1;
        int iAddAndGet = 1;
        g4h<T> g4hVar2 = g4hVar;
        int i4 = i;
        while (true) {
            if (g4hVar2 != null) {
                FlowablePublishAlt$InnerSubscription<T>[] flowablePublishAlt$InnerSubscriptionArr = this.subscribers.get();
                long jMin = Long.MAX_VALUE;
                boolean z2 = false;
                for (FlowablePublishAlt$InnerSubscription<T> flowablePublishAlt$InnerSubscription : flowablePublishAlt$InnerSubscriptionArr) {
                    long j2 = flowablePublishAlt$InnerSubscription.get();
                    if (j2 != Long.MIN_VALUE) {
                        jMin = Math.min(j2 - flowablePublishAlt$InnerSubscription.emitted, jMin);
                        z2 = true;
                    }
                }
                long j3 = 0;
                if (!z2) {
                    jMin = 0;
                }
                while (true) {
                    if (jMin != j3) {
                        boolean z3 = this.done;
                        try {
                            T tPoll = g4hVar2.poll();
                            boolean z4 = tPoll == null;
                            if (checkTerminated(z3, z4)) {
                                return;
                            }
                            if (!z4) {
                                for (FlowablePublishAlt$InnerSubscription<T> flowablePublishAlt$InnerSubscription2 : flowablePublishAlt$InnerSubscriptionArr) {
                                    if (!flowablePublishAlt$InnerSubscription2.isCancelled()) {
                                        flowablePublishAlt$InnerSubscription2.downstream.onNext(tPoll);
                                        flowablePublishAlt$InnerSubscription2.emitted++;
                                    }
                                }
                                if (z && (i4 = i4 + 1) == i3) {
                                    this.upstream.get().request(i3);
                                    i4 = 0;
                                }
                                jMin--;
                                if (flowablePublishAlt$InnerSubscriptionArr == this.subscribers.get()) {
                                    j3 = 0;
                                }
                            }
                        } catch (Throwable th) {
                            iu6.b(th);
                            this.upstream.get().cancel();
                            g4hVar2.clear();
                            this.done = true;
                            signalError(th);
                            return;
                        }
                    }
                    if (checkTerminated(this.done, g4hVar2.isEmpty())) {
                        return;
                    }
                }
            }
            this.consumed = i4;
            iAddAndGet = addAndGet(-iAddAndGet);
            if (iAddAndGet == 0) {
                return;
            }
            if (g4hVar2 == null) {
                g4hVar2 = this.queue;
            }
        }
    }

    @Override // com.oplus.aiunit.vision.cv5
    public boolean isDisposed() {
        return this.subscribers.get() == TERMINATED;
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
        if (this.sourceMode != 0 || this.queue.offer(t)) {
            drain();
        } else {
            onError(new MissingBackpressureException("Prefetch queue is full?!"));
        }
    }

    @Override // com.oplus.aiunit.vision.wu7, com.oplus.aiunit.vision.v2j
    public void onSubscribe(c3j c3jVar) {
        if (SubscriptionHelper.setOnce(this.upstream, c3jVar)) {
            if (c3jVar instanceof h7f) {
                h7f h7fVar = (h7f) c3jVar;
                int iRequestFusion = h7fVar.requestFusion(7);
                if (iRequestFusion == 1) {
                    this.sourceMode = iRequestFusion;
                    this.queue = h7fVar;
                    this.done = true;
                    drain();
                    return;
                }
                if (iRequestFusion == 2) {
                    this.sourceMode = iRequestFusion;
                    this.queue = h7fVar;
                    c3jVar.request(this.bufferSize);
                    return;
                }
            }
            this.queue = new SpscArrayQueue(this.bufferSize);
            c3jVar.request(this.bufferSize);
        }
    }

    public void remove(FlowablePublishAlt$InnerSubscription<T> flowablePublishAlt$InnerSubscription) {
        FlowablePublishAlt$InnerSubscription<T>[] flowablePublishAlt$InnerSubscriptionArr;
        FlowablePublishAlt$InnerSubscription[] flowablePublishAlt$InnerSubscriptionArr2;
        do {
            flowablePublishAlt$InnerSubscriptionArr = this.subscribers.get();
            int length = flowablePublishAlt$InnerSubscriptionArr.length;
            if (length == 0) {
                return;
            }
            int i = 0;
            while (true) {
                if (i >= length) {
                    i = -1;
                    break;
                } else if (flowablePublishAlt$InnerSubscriptionArr[i] == flowablePublishAlt$InnerSubscription) {
                    break;
                } else {
                    i++;
                }
            }
            if (i < 0) {
                return;
            }
            if (length == 1) {
                flowablePublishAlt$InnerSubscriptionArr2 = EMPTY;
            } else {
                FlowablePublishAlt$InnerSubscription[] flowablePublishAlt$InnerSubscriptionArr3 = new FlowablePublishAlt$InnerSubscription[length - 1];
                System.arraycopy(flowablePublishAlt$InnerSubscriptionArr, 0, flowablePublishAlt$InnerSubscriptionArr3, 0, i);
                System.arraycopy(flowablePublishAlt$InnerSubscriptionArr, i + 1, flowablePublishAlt$InnerSubscriptionArr3, i, (length - i) - 1);
                flowablePublishAlt$InnerSubscriptionArr2 = flowablePublishAlt$InnerSubscriptionArr3;
            }
        } while (!fue.a(this.subscribers, flowablePublishAlt$InnerSubscriptionArr, flowablePublishAlt$InnerSubscriptionArr2));
    }

    public void signalError(Throwable th) {
        for (FlowablePublishAlt$InnerSubscription<T> flowablePublishAlt$InnerSubscription : this.subscribers.getAndSet(TERMINATED)) {
            if (!flowablePublishAlt$InnerSubscription.isCancelled()) {
                flowablePublishAlt$InnerSubscription.downstream.onError(th);
            }
        }
    }
}
