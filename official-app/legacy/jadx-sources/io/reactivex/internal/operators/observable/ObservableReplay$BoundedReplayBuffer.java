package io.reactivex.internal.operators.observable;

import io.reactivex.internal.util.NotificationLite;
import java.util.Collection;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
abstract class ObservableReplay$BoundedReplayBuffer<T> extends AtomicReference<ObservableReplay$Node> implements d<T> {
    private static final long serialVersionUID = 2346567790059478686L;
    int size;
    ObservableReplay$Node tail;

    public ObservableReplay$BoundedReplayBuffer() {
        ObservableReplay$Node observableReplay$Node = new ObservableReplay$Node(null);
        this.tail = observableReplay$Node;
        set(observableReplay$Node);
    }

    public final void addLast(ObservableReplay$Node observableReplay$Node) {
        this.tail.set(observableReplay$Node);
        this.tail = observableReplay$Node;
        this.size++;
    }

    public final void collect(Collection<? super T> collection) {
        ObservableReplay$Node head = getHead();
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

    @Override // io.reactivex.internal.operators.observable.d
    public final void complete() {
        addLast(new ObservableReplay$Node(enterTransform(NotificationLite.complete())));
        truncateFinal();
    }

    public Object enterTransform(Object obj) {
        return obj;
    }

    @Override // io.reactivex.internal.operators.observable.d
    public final void error(Throwable th) {
        addLast(new ObservableReplay$Node(enterTransform(NotificationLite.error(th))));
        truncateFinal();
    }

    public ObservableReplay$Node getHead() {
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

    @Override // io.reactivex.internal.operators.observable.d
    public final void next(T t) {
        addLast(new ObservableReplay$Node(enterTransform(NotificationLite.next(t))));
        truncate();
    }

    public final void removeFirst() {
        ObservableReplay$Node observableReplay$Node = get().get();
        this.size--;
        setFirst(observableReplay$Node);
    }

    public final void removeSome(int i) {
        ObservableReplay$Node observableReplay$Node = get();
        while (i > 0) {
            observableReplay$Node = observableReplay$Node.get();
            i--;
            this.size--;
        }
        setFirst(observableReplay$Node);
    }

    @Override // io.reactivex.internal.operators.observable.d
    public final void replay(ObservableReplay$InnerDisposable<T> observableReplay$InnerDisposable) {
        if (observableReplay$InnerDisposable.getAndIncrement() != 0) {
            return;
        }
        int iAddAndGet = 1;
        do {
            ObservableReplay$Node head = (ObservableReplay$Node) observableReplay$InnerDisposable.index();
            if (head == null) {
                head = getHead();
                observableReplay$InnerDisposable.index = head;
            }
            while (true) {
                if (observableReplay$InnerDisposable.isDisposed()) {
                    observableReplay$InnerDisposable.index = null;
                    return;
                }
                ObservableReplay$Node observableReplay$Node = head.get();
                if (observableReplay$Node != null) {
                    if (NotificationLite.accept(leaveTransform(observableReplay$Node.value), observableReplay$InnerDisposable.child)) {
                        observableReplay$InnerDisposable.index = null;
                        return;
                    }
                    head = observableReplay$Node;
                }
            }
            observableReplay$InnerDisposable.index = head;
            iAddAndGet = observableReplay$InnerDisposable.addAndGet(-iAddAndGet);
        } while (iAddAndGet != 0);
    }

    public final void setFirst(ObservableReplay$Node observableReplay$Node) {
        set(observableReplay$Node);
    }

    public final void trimHead() {
        ObservableReplay$Node observableReplay$Node = get();
        if (observableReplay$Node.value != null) {
            ObservableReplay$Node observableReplay$Node2 = new ObservableReplay$Node(null);
            observableReplay$Node2.lazySet(observableReplay$Node.get());
            set(observableReplay$Node2);
        }
    }

    public abstract void truncate();

    public void truncateFinal() {
        trimHead();
    }
}
