package io.reactivex.internal.operators.flowable;

import com.oplus.aiunit.vision.c3j;
import com.oplus.aiunit.vision.cv5;
import com.oplus.aiunit.vision.fue;
import com.oplus.aiunit.vision.h4g;
import com.oplus.aiunit.vision.wu7;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
final class FlowableReplay$ReplaySubscriber<T> extends AtomicReference<c3j> implements wu7<T>, cv5 {
    static final FlowableReplay$InnerSubscription[] EMPTY = new FlowableReplay$InnerSubscription[0];
    static final FlowableReplay$InnerSubscription[] TERMINATED = new FlowableReplay$InnerSubscription[0];
    private static final long serialVersionUID = 7224554242710036740L;
    final c<T> buffer;
    boolean done;
    long maxChildRequested;
    long maxUpstreamRequested;
    final AtomicInteger management = new AtomicInteger();
    final AtomicReference<FlowableReplay$InnerSubscription<T>[]> subscribers = new AtomicReference<>(EMPTY);
    final AtomicBoolean shouldConnect = new AtomicBoolean();

    public FlowableReplay$ReplaySubscriber(c<T> cVar) {
        this.buffer = cVar;
    }

    public boolean add(FlowableReplay$InnerSubscription<T> flowableReplay$InnerSubscription) {
        FlowableReplay$InnerSubscription<T>[] flowableReplay$InnerSubscriptionArr;
        FlowableReplay$InnerSubscription[] flowableReplay$InnerSubscriptionArr2;
        flowableReplay$InnerSubscription.getClass();
        do {
            flowableReplay$InnerSubscriptionArr = this.subscribers.get();
            if (flowableReplay$InnerSubscriptionArr == TERMINATED) {
                return false;
            }
            int length = flowableReplay$InnerSubscriptionArr.length;
            flowableReplay$InnerSubscriptionArr2 = new FlowableReplay$InnerSubscription[length + 1];
            System.arraycopy(flowableReplay$InnerSubscriptionArr, 0, flowableReplay$InnerSubscriptionArr2, 0, length);
            flowableReplay$InnerSubscriptionArr2[length] = flowableReplay$InnerSubscription;
        } while (!fue.a(this.subscribers, flowableReplay$InnerSubscriptionArr, flowableReplay$InnerSubscriptionArr2));
        return true;
    }

    @Override // com.oplus.aiunit.vision.cv5
    public void dispose() {
        this.subscribers.set(TERMINATED);
        SubscriptionHelper.cancel(this);
    }

    @Override // com.oplus.aiunit.vision.cv5
    public boolean isDisposed() {
        return this.subscribers.get() == TERMINATED;
    }

    public void manageRequests() {
        if (this.management.getAndIncrement() != 0) {
            return;
        }
        int iAddAndGet = 1;
        while (!isDisposed()) {
            FlowableReplay$InnerSubscription<T>[] flowableReplay$InnerSubscriptionArr = this.subscribers.get();
            long j2 = this.maxChildRequested;
            long jMax = j2;
            for (FlowableReplay$InnerSubscription<T> flowableReplay$InnerSubscription : flowableReplay$InnerSubscriptionArr) {
                jMax = Math.max(jMax, flowableReplay$InnerSubscription.totalRequested.get());
            }
            long j3 = this.maxUpstreamRequested;
            c3j c3jVar = get();
            long j4 = jMax - j2;
            if (j4 != 0) {
                this.maxChildRequested = jMax;
                if (c3jVar == null) {
                    long j5 = j3 + j4;
                    if (j5 < 0) {
                        j5 = Long.MAX_VALUE;
                    }
                    this.maxUpstreamRequested = j5;
                } else if (j3 != 0) {
                    this.maxUpstreamRequested = 0L;
                    c3jVar.request(j3 + j4);
                } else {
                    c3jVar.request(j4);
                }
            } else if (j3 != 0 && c3jVar != null) {
                this.maxUpstreamRequested = 0L;
                c3jVar.request(j3);
            }
            iAddAndGet = this.management.addAndGet(-iAddAndGet);
            if (iAddAndGet == 0) {
                return;
            }
        }
    }

    @Override // com.oplus.aiunit.vision.v2j
    public void onComplete() {
        if (this.done) {
            return;
        }
        this.done = true;
        this.buffer.complete();
        for (FlowableReplay$InnerSubscription<T> flowableReplay$InnerSubscription : this.subscribers.getAndSet(TERMINATED)) {
            this.buffer.replay(flowableReplay$InnerSubscription);
        }
    }

    @Override // com.oplus.aiunit.vision.v2j
    public void onError(Throwable th) {
        if (this.done) {
            h4g.r(th);
            return;
        }
        this.done = true;
        this.buffer.error(th);
        for (FlowableReplay$InnerSubscription<T> flowableReplay$InnerSubscription : this.subscribers.getAndSet(TERMINATED)) {
            this.buffer.replay(flowableReplay$InnerSubscription);
        }
    }

    @Override // com.oplus.aiunit.vision.v2j
    public void onNext(T t) {
        if (this.done) {
            return;
        }
        this.buffer.next(t);
        for (FlowableReplay$InnerSubscription<T> flowableReplay$InnerSubscription : this.subscribers.get()) {
            this.buffer.replay(flowableReplay$InnerSubscription);
        }
    }

    @Override // com.oplus.aiunit.vision.wu7, com.oplus.aiunit.vision.v2j
    public void onSubscribe(c3j c3jVar) {
        if (SubscriptionHelper.setOnce(this, c3jVar)) {
            manageRequests();
            for (FlowableReplay$InnerSubscription<T> flowableReplay$InnerSubscription : this.subscribers.get()) {
                this.buffer.replay(flowableReplay$InnerSubscription);
            }
        }
    }

    public void remove(FlowableReplay$InnerSubscription<T> flowableReplay$InnerSubscription) {
        FlowableReplay$InnerSubscription<T>[] flowableReplay$InnerSubscriptionArr;
        FlowableReplay$InnerSubscription[] flowableReplay$InnerSubscriptionArr2;
        do {
            flowableReplay$InnerSubscriptionArr = this.subscribers.get();
            int length = flowableReplay$InnerSubscriptionArr.length;
            if (length == 0) {
                return;
            }
            int i = 0;
            while (true) {
                if (i >= length) {
                    i = -1;
                    break;
                } else if (flowableReplay$InnerSubscriptionArr[i].equals(flowableReplay$InnerSubscription)) {
                    break;
                } else {
                    i++;
                }
            }
            if (i < 0) {
                return;
            }
            if (length == 1) {
                flowableReplay$InnerSubscriptionArr2 = EMPTY;
            } else {
                FlowableReplay$InnerSubscription[] flowableReplay$InnerSubscriptionArr3 = new FlowableReplay$InnerSubscription[length - 1];
                System.arraycopy(flowableReplay$InnerSubscriptionArr, 0, flowableReplay$InnerSubscriptionArr3, 0, i);
                System.arraycopy(flowableReplay$InnerSubscriptionArr, i + 1, flowableReplay$InnerSubscriptionArr3, i, (length - i) - 1);
                flowableReplay$InnerSubscriptionArr2 = flowableReplay$InnerSubscriptionArr3;
            }
        } while (!fue.a(this.subscribers, flowableReplay$InnerSubscriptionArr, flowableReplay$InnerSubscriptionArr2));
    }
}
