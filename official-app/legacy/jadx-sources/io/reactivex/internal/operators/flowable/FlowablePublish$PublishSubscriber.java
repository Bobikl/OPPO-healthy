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
import io.reactivex.internal.util.NotificationLite;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
final class FlowablePublish$PublishSubscriber<T> extends AtomicInteger implements wu7<T>, cv5 {
    static final FlowablePublish$InnerSubscriber[] EMPTY = new FlowablePublish$InnerSubscriber[0];
    static final FlowablePublish$InnerSubscriber[] TERMINATED = new FlowablePublish$InnerSubscriber[0];
    private static final long serialVersionUID = -202316842419149694L;
    final int bufferSize;
    final AtomicReference<FlowablePublish$PublishSubscriber<T>> current;
    volatile g4h<T> queue;
    int sourceMode;
    volatile Object terminalEvent;
    final AtomicReference<c3j> upstream = new AtomicReference<>();
    final AtomicReference<FlowablePublish$InnerSubscriber<T>[]> subscribers = new AtomicReference<>(EMPTY);
    final AtomicBoolean shouldConnect = new AtomicBoolean();

    public FlowablePublish$PublishSubscriber(AtomicReference<FlowablePublish$PublishSubscriber<T>> atomicReference, int i) {
        this.current = atomicReference;
        this.bufferSize = i;
    }

    public boolean add(FlowablePublish$InnerSubscriber<T> flowablePublish$InnerSubscriber) {
        FlowablePublish$InnerSubscriber<T>[] flowablePublish$InnerSubscriberArr;
        FlowablePublish$InnerSubscriber[] flowablePublish$InnerSubscriberArr2;
        do {
            flowablePublish$InnerSubscriberArr = this.subscribers.get();
            if (flowablePublish$InnerSubscriberArr == TERMINATED) {
                return false;
            }
            int length = flowablePublish$InnerSubscriberArr.length;
            flowablePublish$InnerSubscriberArr2 = new FlowablePublish$InnerSubscriber[length + 1];
            System.arraycopy(flowablePublish$InnerSubscriberArr, 0, flowablePublish$InnerSubscriberArr2, 0, length);
            flowablePublish$InnerSubscriberArr2[length] = flowablePublish$InnerSubscriber;
        } while (!fue.a(this.subscribers, flowablePublish$InnerSubscriberArr, flowablePublish$InnerSubscriberArr2));
        return true;
    }

    public boolean checkTerminated(Object obj, boolean z) {
        int i = 0;
        if (obj != null) {
            if (!NotificationLite.isComplete(obj)) {
                Throwable error = NotificationLite.getError(obj);
                fue.a(this.current, this, null);
                FlowablePublish$InnerSubscriber<T>[] andSet = this.subscribers.getAndSet(TERMINATED);
                if (andSet.length != 0) {
                    int length = andSet.length;
                    while (i < length) {
                        andSet[i].child.onError(error);
                        i++;
                    }
                } else {
                    h4g.r(error);
                }
                return true;
            }
            if (z) {
                fue.a(this.current, this, null);
                FlowablePublish$InnerSubscriber<T>[] andSet2 = this.subscribers.getAndSet(TERMINATED);
                int length2 = andSet2.length;
                while (i < length2) {
                    andSet2[i].child.onComplete();
                    i++;
                }
                return true;
            }
        }
        return false;
    }

    public void dispatch() {
        T tPoll;
        T tPoll2;
        if (getAndIncrement() != 0) {
            return;
        }
        AtomicReference<FlowablePublish$InnerSubscriber<T>[]> atomicReference = this.subscribers;
        boolean z = true;
        FlowablePublish$InnerSubscriber<T>[] flowablePublish$InnerSubscriberArr = atomicReference.get();
        int iAddAndGet = 1;
        while (true) {
            Object obj = this.terminalEvent;
            g4h<T> g4hVar = this.queue;
            boolean z2 = (g4hVar == null || g4hVar.isEmpty()) ? z : false;
            if (checkTerminated(obj, z2)) {
                return;
            }
            if (!z2) {
                int length = flowablePublish$InnerSubscriberArr.length;
                int i = 0;
                long jMin = Long.MAX_VALUE;
                for (FlowablePublish$InnerSubscriber<T> flowablePublish$InnerSubscriber : flowablePublish$InnerSubscriberArr) {
                    long j2 = flowablePublish$InnerSubscriber.get();
                    if (j2 != Long.MIN_VALUE) {
                        jMin = Math.min(jMin, j2 - flowablePublish$InnerSubscriber.emitted);
                    } else {
                        i++;
                    }
                }
                if (length == i) {
                    Object objError = this.terminalEvent;
                    try {
                        tPoll = g4hVar.poll();
                    } catch (Throwable th) {
                        iu6.b(th);
                        this.upstream.get().cancel();
                        objError = NotificationLite.error(th);
                        this.terminalEvent = objError;
                        tPoll = null;
                    }
                    if (checkTerminated(objError, tPoll == null ? z : false)) {
                        return;
                    }
                    if (this.sourceMode != z) {
                        this.upstream.get().request(1L);
                    }
                } else {
                    int i2 = 0;
                    while (true) {
                        long j3 = i2;
                        if (j3 < jMin) {
                            Object objError2 = this.terminalEvent;
                            try {
                                tPoll2 = g4hVar.poll();
                            } catch (Throwable th2) {
                                iu6.b(th2);
                                this.upstream.get().cancel();
                                objError2 = NotificationLite.error(th2);
                                this.terminalEvent = objError2;
                                tPoll2 = null;
                            }
                            boolean z3 = tPoll2 == null ? z : false;
                            if (checkTerminated(objError2, z3)) {
                                return;
                            }
                            if (z3) {
                                z2 = z3;
                            } else {
                                Object value = NotificationLite.getValue(tPoll2);
                                int length2 = flowablePublish$InnerSubscriberArr.length;
                                int i3 = 0;
                                boolean z4 = false;
                                while (i3 < length2) {
                                    FlowablePublish$InnerSubscriber<T> flowablePublish$InnerSubscriber2 = flowablePublish$InnerSubscriberArr[i3];
                                    long j4 = flowablePublish$InnerSubscriber2.get();
                                    if (j4 != Long.MIN_VALUE) {
                                        if (j4 != Long.MAX_VALUE) {
                                            flowablePublish$InnerSubscriber2.emitted++;
                                        }
                                        flowablePublish$InnerSubscriber2.child.onNext(value);
                                    } else {
                                        g4hVar = g4hVar;
                                        z3 = z3;
                                        z4 = true;
                                    }
                                    i3++;
                                    g4hVar = g4hVar;
                                    z3 = z3;
                                }
                                g4h<T> g4hVar2 = g4hVar;
                                boolean z5 = z3;
                                i2++;
                                FlowablePublish$InnerSubscriber<T>[] flowablePublish$InnerSubscriberArr2 = atomicReference.get();
                                if (z4 || flowablePublish$InnerSubscriberArr2 != flowablePublish$InnerSubscriberArr) {
                                    if (i2 != 0 && this.sourceMode != 1) {
                                        this.upstream.get().request(i2);
                                    }
                                    flowablePublish$InnerSubscriberArr = flowablePublish$InnerSubscriberArr2;
                                    z = true;
                                } else {
                                    g4hVar = g4hVar2;
                                    z2 = z5;
                                    z = true;
                                }
                            }
                        }
                        if (i2 != 0) {
                            z = true;
                            if (this.sourceMode != 1) {
                                this.upstream.get().request(j3);
                            }
                        } else {
                            z = true;
                        }
                        if (jMin == 0 || z2) {
                        }
                    }
                }
            }
            iAddAndGet = addAndGet(-iAddAndGet);
            if (iAddAndGet == 0) {
                return;
            } else {
                flowablePublish$InnerSubscriberArr = atomicReference.get();
            }
        }
    }

    @Override // com.oplus.aiunit.vision.cv5
    public void dispose() {
        FlowablePublish$InnerSubscriber<T>[] flowablePublish$InnerSubscriberArr = this.subscribers.get();
        FlowablePublish$InnerSubscriber<T>[] flowablePublish$InnerSubscriberArr2 = TERMINATED;
        if (flowablePublish$InnerSubscriberArr == flowablePublish$InnerSubscriberArr2 || this.subscribers.getAndSet(flowablePublish$InnerSubscriberArr2) == flowablePublish$InnerSubscriberArr2) {
            return;
        }
        fue.a(this.current, this, null);
        SubscriptionHelper.cancel(this.upstream);
    }

    @Override // com.oplus.aiunit.vision.cv5
    public boolean isDisposed() {
        return this.subscribers.get() == TERMINATED;
    }

    @Override // com.oplus.aiunit.vision.v2j
    public void onComplete() {
        if (this.terminalEvent == null) {
            this.terminalEvent = NotificationLite.complete();
            dispatch();
        }
    }

    @Override // com.oplus.aiunit.vision.v2j
    public void onError(Throwable th) {
        if (this.terminalEvent != null) {
            h4g.r(th);
        } else {
            this.terminalEvent = NotificationLite.error(th);
            dispatch();
        }
    }

    @Override // com.oplus.aiunit.vision.v2j
    public void onNext(T t) {
        if (this.sourceMode != 0 || this.queue.offer(t)) {
            dispatch();
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
                    this.terminalEvent = NotificationLite.complete();
                    dispatch();
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

    public void remove(FlowablePublish$InnerSubscriber<T> flowablePublish$InnerSubscriber) {
        FlowablePublish$InnerSubscriber<T>[] flowablePublish$InnerSubscriberArr;
        FlowablePublish$InnerSubscriber[] flowablePublish$InnerSubscriberArr2;
        do {
            flowablePublish$InnerSubscriberArr = this.subscribers.get();
            int length = flowablePublish$InnerSubscriberArr.length;
            if (length == 0) {
                return;
            }
            int i = 0;
            while (true) {
                if (i >= length) {
                    i = -1;
                    break;
                } else if (flowablePublish$InnerSubscriberArr[i].equals(flowablePublish$InnerSubscriber)) {
                    break;
                } else {
                    i++;
                }
            }
            if (i < 0) {
                return;
            }
            if (length == 1) {
                flowablePublish$InnerSubscriberArr2 = EMPTY;
            } else {
                FlowablePublish$InnerSubscriber[] flowablePublish$InnerSubscriberArr3 = new FlowablePublish$InnerSubscriber[length - 1];
                System.arraycopy(flowablePublish$InnerSubscriberArr, 0, flowablePublish$InnerSubscriberArr3, 0, i);
                System.arraycopy(flowablePublish$InnerSubscriberArr, i + 1, flowablePublish$InnerSubscriberArr3, i, (length - i) - 1);
                flowablePublish$InnerSubscriberArr2 = flowablePublish$InnerSubscriberArr3;
            }
        } while (!fue.a(this.subscribers, flowablePublish$InnerSubscriberArr, flowablePublish$InnerSubscriberArr2));
    }
}
