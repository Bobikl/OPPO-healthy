package io.reactivex.internal.operators.flowable;

import com.oplus.aiunit.vision.iu6;
import com.oplus.aiunit.vision.wr0;
import io.reactivex.internal.util.NotificationLite;
import java.util.Collection;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
class FlowableReplay$BoundedReplayBuffer<T> extends AtomicReference<FlowableReplay$Node> implements c<T> {
    private static final long serialVersionUID = 2346567790059478686L;
    long index;
    int size;
    FlowableReplay$Node tail;

    public FlowableReplay$BoundedReplayBuffer() {
        FlowableReplay$Node flowableReplay$Node = new FlowableReplay$Node(null, 0L);
        this.tail = flowableReplay$Node;
        set(flowableReplay$Node);
    }

    public final void addLast(FlowableReplay$Node flowableReplay$Node) {
        this.tail.set(flowableReplay$Node);
        this.tail = flowableReplay$Node;
        this.size++;
    }

    public final void collect(Collection<? super T> collection) {
        FlowableReplay$Node head = getHead();
        while (true) {
            head = head.get();
            if (head == null) {
                return;
            }
            Object objLeaveTransform = leaveTransform(head.value);
            if (NotificationLite.isComplete(objLeaveTransform) || NotificationLite.isError(objLeaveTransform)) {
                return;
            } else {
                collection.add((Object) NotificationLite.getValue(objLeaveTransform));
            }
        }
    }

    @Override // io.reactivex.internal.operators.flowable.c
    public final void complete() {
        Object objEnterTransform = enterTransform(NotificationLite.complete());
        long j2 = this.index + 1;
        this.index = j2;
        addLast(new FlowableReplay$Node(objEnterTransform, j2));
        truncateFinal();
    }

    public Object enterTransform(Object obj) {
        return obj;
    }

    @Override // io.reactivex.internal.operators.flowable.c
    public final void error(Throwable th) {
        Object objEnterTransform = enterTransform(NotificationLite.error(th));
        long j2 = this.index + 1;
        this.index = j2;
        addLast(new FlowableReplay$Node(objEnterTransform, j2));
        truncateFinal();
    }

    public FlowableReplay$Node getHead() {
        return get();
    }

    public boolean hasCompleted() {
        Object obj = this.tail.value;
        return obj != null && NotificationLite.isComplete(leaveTransform(obj));
    }

    public boolean hasError() {
        Object obj = this.tail.value;
        return obj != null && NotificationLite.isError(leaveTransform(obj));
    }

    public Object leaveTransform(Object obj) {
        return obj;
    }

    @Override // io.reactivex.internal.operators.flowable.c
    public final void next(T t) {
        Object objEnterTransform = enterTransform(NotificationLite.next(t));
        long j2 = this.index + 1;
        this.index = j2;
        addLast(new FlowableReplay$Node(objEnterTransform, j2));
        truncate();
    }

    public final void removeFirst() {
        FlowableReplay$Node flowableReplay$Node = get().get();
        if (flowableReplay$Node == null) {
            throw new IllegalStateException("Empty list!");
        }
        this.size--;
        setFirst(flowableReplay$Node);
    }

    public final void removeSome(int i) {
        FlowableReplay$Node flowableReplay$Node = get();
        while (i > 0) {
            flowableReplay$Node = flowableReplay$Node.get();
            i--;
            this.size--;
        }
        setFirst(flowableReplay$Node);
    }

    @Override // io.reactivex.internal.operators.flowable.c
    public final void replay(FlowableReplay$InnerSubscription<T> flowableReplay$InnerSubscription) {
        FlowableReplay$Node flowableReplay$Node;
        synchronized (flowableReplay$InnerSubscription) {
            if (flowableReplay$InnerSubscription.emitting) {
                flowableReplay$InnerSubscription.missed = true;
                return;
            }
            flowableReplay$InnerSubscription.emitting = true;
            while (!flowableReplay$InnerSubscription.isDisposed()) {
                long j2 = flowableReplay$InnerSubscription.get();
                boolean z = j2 == Long.MAX_VALUE;
                FlowableReplay$Node head = (FlowableReplay$Node) flowableReplay$InnerSubscription.index();
                if (head == null) {
                    head = getHead();
                    flowableReplay$InnerSubscription.index = head;
                    wr0.a(flowableReplay$InnerSubscription.totalRequested, head.index);
                }
                long j3 = 0;
                while (j2 != 0 && (flowableReplay$Node = head.get()) != null) {
                    Object objLeaveTransform = leaveTransform(flowableReplay$Node.value);
                    try {
                        if (NotificationLite.accept(objLeaveTransform, flowableReplay$InnerSubscription.child)) {
                            flowableReplay$InnerSubscription.index = null;
                            return;
                        }
                        j3++;
                        j2--;
                        if (flowableReplay$InnerSubscription.isDisposed()) {
                            flowableReplay$InnerSubscription.index = null;
                            return;
                        }
                        head = flowableReplay$Node;
                    } catch (Throwable th) {
                        iu6.b(th);
                        flowableReplay$InnerSubscription.index = null;
                        flowableReplay$InnerSubscription.dispose();
                        if (NotificationLite.isError(objLeaveTransform) || NotificationLite.isComplete(objLeaveTransform)) {
                            return;
                        }
                        flowableReplay$InnerSubscription.child.onError(th);
                        return;
                    }
                }
                if (j3 != 0) {
                    flowableReplay$InnerSubscription.index = head;
                    if (!z) {
                        flowableReplay$InnerSubscription.produced(j3);
                    }
                }
                synchronized (flowableReplay$InnerSubscription) {
                    if (!flowableReplay$InnerSubscription.missed) {
                        flowableReplay$InnerSubscription.emitting = false;
                        return;
                    }
                    flowableReplay$InnerSubscription.missed = false;
                }
            }
            flowableReplay$InnerSubscription.index = null;
        }
    }

    public final void setFirst(FlowableReplay$Node flowableReplay$Node) {
        set(flowableReplay$Node);
    }

    public final void trimHead() {
        FlowableReplay$Node flowableReplay$Node = get();
        if (flowableReplay$Node.value != null) {
            FlowableReplay$Node flowableReplay$Node2 = new FlowableReplay$Node(null, 0L);
            flowableReplay$Node2.lazySet(flowableReplay$Node.get());
            set(flowableReplay$Node2);
        }
    }

    public void truncate() {
    }

    public void truncateFinal() {
        trimHead();
    }
}
