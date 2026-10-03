package io.reactivex.rxjava3.internal.operators.flowable;

import com.oplus.aiunit.vision.c3j;
import com.oplus.aiunit.vision.f4h;
import com.oplus.aiunit.vision.fue;
import com.oplus.aiunit.vision.g4g;
import com.oplus.aiunit.vision.g7f;
import com.oplus.aiunit.vision.hu6;
import com.oplus.aiunit.vision.vu7;
import io.reactivex.rxjava3.exceptions.MissingBackpressureException;
import io.reactivex.rxjava3.internal.queue.SpscArrayQueue;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
final class FlowablePublish$PublishConnection<T> extends AtomicInteger implements vu7<T>, io.reactivex.rxjava3.disposables.a {
    static final FlowablePublish$InnerSubscription[] EMPTY = new FlowablePublish$InnerSubscription[0];
    static final FlowablePublish$InnerSubscription[] TERMINATED = new FlowablePublish$InnerSubscription[0];
    private static final long serialVersionUID = -1672047311619175801L;
    final int bufferSize;
    int consumed;
    final AtomicReference<FlowablePublish$PublishConnection<T>> current;
    volatile boolean done;
    Throwable error;
    volatile f4h<T> queue;
    int sourceMode;
    final AtomicReference<c3j> upstream = new AtomicReference<>();
    final AtomicBoolean connect = new AtomicBoolean();
    final AtomicReference<FlowablePublish$InnerSubscription<T>[]> subscribers = new AtomicReference<>(EMPTY);

    public FlowablePublish$PublishConnection(AtomicReference<FlowablePublish$PublishConnection<T>> atomicReference, int i) {
        this.current = atomicReference;
        this.bufferSize = i;
    }

    public boolean add(FlowablePublish$InnerSubscription<T> flowablePublish$InnerSubscription) {
        FlowablePublish$InnerSubscription<T>[] flowablePublish$InnerSubscriptionArr;
        FlowablePublish$InnerSubscription[] flowablePublish$InnerSubscriptionArr2;
        do {
            flowablePublish$InnerSubscriptionArr = this.subscribers.get();
            if (flowablePublish$InnerSubscriptionArr == TERMINATED) {
                return false;
            }
            int length = flowablePublish$InnerSubscriptionArr.length;
            flowablePublish$InnerSubscriptionArr2 = new FlowablePublish$InnerSubscription[length + 1];
            System.arraycopy(flowablePublish$InnerSubscriptionArr, 0, flowablePublish$InnerSubscriptionArr2, 0, length);
            flowablePublish$InnerSubscriptionArr2[length] = flowablePublish$InnerSubscription;
        } while (!fue.a(this.subscribers, flowablePublish$InnerSubscriptionArr, flowablePublish$InnerSubscriptionArr2));
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
        for (FlowablePublish$InnerSubscription<T> flowablePublish$InnerSubscription : this.subscribers.getAndSet(TERMINATED)) {
            if (!flowablePublish$InnerSubscription.isCancelled()) {
                flowablePublish$InnerSubscription.downstream.onComplete();
            }
        }
        return true;
    }

    @Override // io.reactivex.rxjava3.disposables.a
    public void dispose() {
        this.subscribers.getAndSet(TERMINATED);
        fue.a(this.current, this, null);
        SubscriptionHelper.cancel(this.upstream);
    }

    public void drain() {
        if (getAndIncrement() != 0) {
            return;
        }
        f4h<T> f4hVar = this.queue;
        int i = this.consumed;
        int i2 = this.bufferSize;
        int i3 = i2 - (i2 >> 2);
        boolean z = this.sourceMode != 1;
        int iAddAndGet = 1;
        f4h<T> f4hVar2 = f4hVar;
        int i4 = i;
        while (true) {
            if (f4hVar2 != null) {
                FlowablePublish$InnerSubscription<T>[] flowablePublish$InnerSubscriptionArr = this.subscribers.get();
                long jMin = Long.MAX_VALUE;
                boolean z2 = false;
                for (FlowablePublish$InnerSubscription<T> flowablePublish$InnerSubscription : flowablePublish$InnerSubscriptionArr) {
                    long j2 = flowablePublish$InnerSubscription.get();
                    if (j2 != Long.MIN_VALUE) {
                        jMin = Math.min(j2 - flowablePublish$InnerSubscription.emitted, jMin);
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
                            T tPoll = f4hVar2.poll();
                            boolean z4 = tPoll == null;
                            if (checkTerminated(z3, z4)) {
                                return;
                            }
                            if (!z4) {
                                for (FlowablePublish$InnerSubscription<T> flowablePublish$InnerSubscription2 : flowablePublish$InnerSubscriptionArr) {
                                    if (!flowablePublish$InnerSubscription2.isCancelled()) {
                                        flowablePublish$InnerSubscription2.downstream.onNext(tPoll);
                                        flowablePublish$InnerSubscription2.emitted++;
                                    }
                                }
                                if (z && (i4 = i4 + 1) == i3) {
                                    this.upstream.get().request(i3);
                                    i4 = 0;
                                }
                                jMin--;
                                if (flowablePublish$InnerSubscriptionArr == this.subscribers.get()) {
                                    j3 = 0;
                                }
                            }
                        } catch (Throwable th) {
                            hu6.b(th);
                            this.upstream.get().cancel();
                            f4hVar2.clear();
                            this.done = true;
                            signalError(th);
                            return;
                        }
                    }
                    if (checkTerminated(this.done, f4hVar2.isEmpty())) {
                        return;
                    }
                }
            }
            this.consumed = i4;
            iAddAndGet = addAndGet(-iAddAndGet);
            if (iAddAndGet == 0) {
                return;
            }
            if (f4hVar2 == null) {
                f4hVar2 = this.queue;
            }
        }
    }

    @Override // io.reactivex.rxjava3.disposables.a
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
            g4g.u(th);
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

    @Override // com.oplus.aiunit.vision.vu7, com.oplus.aiunit.vision.v2j
    public void onSubscribe(c3j c3jVar) {
        if (SubscriptionHelper.setOnce(this.upstream, c3jVar)) {
            if (c3jVar instanceof g7f) {
                g7f g7fVar = (g7f) c3jVar;
                int iRequestFusion = g7fVar.requestFusion(7);
                if (iRequestFusion == 1) {
                    this.sourceMode = iRequestFusion;
                    this.queue = g7fVar;
                    this.done = true;
                    drain();
                    return;
                }
                if (iRequestFusion == 2) {
                    this.sourceMode = iRequestFusion;
                    this.queue = g7fVar;
                    c3jVar.request(this.bufferSize);
                    return;
                }
            }
            this.queue = new SpscArrayQueue(this.bufferSize);
            c3jVar.request(this.bufferSize);
        }
    }

    public void remove(FlowablePublish$InnerSubscription<T> flowablePublish$InnerSubscription) {
        FlowablePublish$InnerSubscription<T>[] flowablePublish$InnerSubscriptionArr;
        FlowablePublish$InnerSubscription[] flowablePublish$InnerSubscriptionArr2;
        do {
            flowablePublish$InnerSubscriptionArr = this.subscribers.get();
            int length = flowablePublish$InnerSubscriptionArr.length;
            if (length == 0) {
                return;
            }
            int i = 0;
            while (true) {
                if (i >= length) {
                    i = -1;
                    break;
                } else if (flowablePublish$InnerSubscriptionArr[i] == flowablePublish$InnerSubscription) {
                    break;
                } else {
                    i++;
                }
            }
            if (i < 0) {
                return;
            }
            if (length == 1) {
                flowablePublish$InnerSubscriptionArr2 = EMPTY;
            } else {
                FlowablePublish$InnerSubscription[] flowablePublish$InnerSubscriptionArr3 = new FlowablePublish$InnerSubscription[length - 1];
                System.arraycopy(flowablePublish$InnerSubscriptionArr, 0, flowablePublish$InnerSubscriptionArr3, 0, i);
                System.arraycopy(flowablePublish$InnerSubscriptionArr, i + 1, flowablePublish$InnerSubscriptionArr3, i, (length - i) - 1);
                flowablePublish$InnerSubscriptionArr2 = flowablePublish$InnerSubscriptionArr3;
            }
        } while (!fue.a(this.subscribers, flowablePublish$InnerSubscriptionArr, flowablePublish$InnerSubscriptionArr2));
    }

    public void signalError(Throwable th) {
        for (FlowablePublish$InnerSubscription<T> flowablePublish$InnerSubscription : this.subscribers.getAndSet(TERMINATED)) {
            if (!flowablePublish$InnerSubscription.isCancelled()) {
                flowablePublish$InnerSubscription.downstream.onError(th);
            }
        }
    }
}
