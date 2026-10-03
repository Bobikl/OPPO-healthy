package io.reactivex.rxjava3.internal.operators.observable;

import com.oplus.aiunit.vision.aed;
import com.oplus.aiunit.vision.cfg;
import com.oplus.aiunit.vision.fue;
import com.oplus.aiunit.vision.g4g;
import com.oplus.aiunit.vision.hu6;
import com.oplus.aiunit.vision.iy3;
import com.oplus.aiunit.vision.jdd;
import com.oplus.aiunit.vision.o14;
import com.oplus.aiunit.vision.vzj;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.util.ExceptionHelper;
import io.reactivex.rxjava3.internal.util.NotificationLite;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
public final class ObservableReplay<T> extends iy3<T> {
    public static final a m = new e();
    public final jdd<T> i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final AtomicReference<ReplayObserver<T>> f20576j;
    public final a<T> k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final jdd<T> f20577l;

    public static abstract class BoundedReplayBuffer<T> extends AtomicReference<Node> implements b<T> {
        private static final long serialVersionUID = 2346567790059478686L;
        final boolean eagerTruncate;
        int size;
        Node tail;

        public BoundedReplayBuffer(boolean z) {
            this.eagerTruncate = z;
            Node node = new Node(null);
            this.tail = node;
            set(node);
        }

        public final void addLast(Node node) {
            this.tail.set(node);
            this.tail = node;
            this.size++;
        }

        public final void collect(Collection<? super T> collection) {
            Node head = getHead();
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

        @Override // io.reactivex.rxjava3.internal.operators.observable.ObservableReplay.b
        public final void complete() {
            addLast(new Node(enterTransform(NotificationLite.complete())));
            truncateFinal();
        }

        public Object enterTransform(Object obj) {
            return obj;
        }

        @Override // io.reactivex.rxjava3.internal.operators.observable.ObservableReplay.b
        public final void error(Throwable th) {
            addLast(new Node(enterTransform(NotificationLite.error(th))));
            truncateFinal();
        }

        public Node getHead() {
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

        @Override // io.reactivex.rxjava3.internal.operators.observable.ObservableReplay.b
        public final void next(T t) {
            addLast(new Node(enterTransform(NotificationLite.next(t))));
            truncate();
        }

        public final void removeFirst() {
            Node node = get().get();
            this.size--;
            setFirst(node);
        }

        public final void removeSome(int i) {
            Node node = get();
            while (i > 0) {
                node = node.get();
                i--;
                this.size--;
            }
            setFirst(node);
            Node node2 = get();
            if (node2.get() == null) {
                this.tail = node2;
            }
        }

        @Override // io.reactivex.rxjava3.internal.operators.observable.ObservableReplay.b
        public final void replay(InnerDisposable<T> innerDisposable) {
            if (innerDisposable.getAndIncrement() != 0) {
                return;
            }
            int iAddAndGet = 1;
            do {
                Node head = (Node) innerDisposable.index();
                if (head == null) {
                    head = getHead();
                    innerDisposable.index = head;
                }
                while (true) {
                    if (innerDisposable.isDisposed()) {
                        innerDisposable.index = null;
                        return;
                    }
                    Node node = head.get();
                    if (node != null) {
                        if (NotificationLite.accept(leaveTransform(node.value), innerDisposable.child)) {
                            innerDisposable.index = null;
                            return;
                        }
                        head = node;
                    }
                }
                innerDisposable.index = head;
                iAddAndGet = innerDisposable.addAndGet(-iAddAndGet);
            } while (iAddAndGet != 0);
        }

        public final void setFirst(Node node) {
            if (this.eagerTruncate) {
                Node node2 = new Node(null);
                node2.lazySet(node.get());
                node = node2;
            }
            set(node);
        }

        public final void trimHead() {
            Node node = get();
            if (node.value != null) {
                Node node2 = new Node(null);
                node2.lazySet(node.get());
                set(node2);
            }
        }

        public abstract void truncate();

        public void truncateFinal() {
            trimHead();
        }
    }

    public static final class InnerDisposable<T> extends AtomicInteger implements io.reactivex.rxjava3.disposables.a {
        private static final long serialVersionUID = 2728361546769921047L;
        volatile boolean cancelled;
        final aed<? super T> child;
        Object index;
        final ReplayObserver<T> parent;

        public InnerDisposable(ReplayObserver<T> replayObserver, aed<? super T> aedVar) {
            this.parent = replayObserver;
            this.child = aedVar;
        }

        @Override // io.reactivex.rxjava3.disposables.a
        public void dispose() {
            if (this.cancelled) {
                return;
            }
            this.cancelled = true;
            this.parent.remove(this);
            this.index = null;
        }

        public <U> U index() {
            return (U) this.index;
        }

        @Override // io.reactivex.rxjava3.disposables.a
        public boolean isDisposed() {
            return this.cancelled;
        }
    }

    public static final class Node extends AtomicReference<Node> {
        private static final long serialVersionUID = 245354315435971818L;
        final Object value;

        public Node(Object obj) {
            this.value = obj;
        }
    }

    public static final class ReplayObserver<T> extends AtomicReference<io.reactivex.rxjava3.disposables.a> implements aed<T>, io.reactivex.rxjava3.disposables.a {
        static final InnerDisposable[] EMPTY = new InnerDisposable[0];
        static final InnerDisposable[] TERMINATED = new InnerDisposable[0];
        private static final long serialVersionUID = -533785617179540163L;
        final b<T> buffer;
        final AtomicReference<ReplayObserver<T>> current;
        boolean done;
        final AtomicReference<InnerDisposable[]> observers = new AtomicReference<>(EMPTY);
        final AtomicBoolean shouldConnect = new AtomicBoolean();

        public ReplayObserver(b<T> bVar, AtomicReference<ReplayObserver<T>> atomicReference) {
            this.buffer = bVar;
            this.current = atomicReference;
        }

        public boolean add(InnerDisposable<T> innerDisposable) {
            InnerDisposable[] innerDisposableArr;
            InnerDisposable[] innerDisposableArr2;
            do {
                innerDisposableArr = this.observers.get();
                if (innerDisposableArr == TERMINATED) {
                    return false;
                }
                int length = innerDisposableArr.length;
                innerDisposableArr2 = new InnerDisposable[length + 1];
                System.arraycopy(innerDisposableArr, 0, innerDisposableArr2, 0, length);
                innerDisposableArr2[length] = innerDisposable;
            } while (!fue.a(this.observers, innerDisposableArr, innerDisposableArr2));
            return true;
        }

        @Override // io.reactivex.rxjava3.disposables.a
        public void dispose() {
            this.observers.set(TERMINATED);
            fue.a(this.current, this, null);
            DisposableHelper.dispose(this);
        }

        @Override // io.reactivex.rxjava3.disposables.a
        public boolean isDisposed() {
            return this.observers.get() == TERMINATED;
        }

        @Override // com.oplus.aiunit.vision.aed
        public void onComplete() {
            if (this.done) {
                return;
            }
            this.done = true;
            this.buffer.complete();
            replayFinal();
        }

        @Override // com.oplus.aiunit.vision.aed
        public void onError(Throwable th) {
            if (this.done) {
                g4g.u(th);
                return;
            }
            this.done = true;
            this.buffer.error(th);
            replayFinal();
        }

        @Override // com.oplus.aiunit.vision.aed
        public void onNext(T t) {
            if (this.done) {
                return;
            }
            this.buffer.next(t);
            replay();
        }

        @Override // com.oplus.aiunit.vision.aed
        public void onSubscribe(io.reactivex.rxjava3.disposables.a aVar) {
            if (DisposableHelper.setOnce(this, aVar)) {
                replay();
            }
        }

        public void remove(InnerDisposable<T> innerDisposable) {
            InnerDisposable[] innerDisposableArr;
            InnerDisposable[] innerDisposableArr2;
            do {
                innerDisposableArr = this.observers.get();
                int length = innerDisposableArr.length;
                if (length == 0) {
                    return;
                }
                int i = 0;
                while (true) {
                    if (i >= length) {
                        i = -1;
                        break;
                    } else if (innerDisposableArr[i].equals(innerDisposable)) {
                        break;
                    } else {
                        i++;
                    }
                }
                if (i < 0) {
                    return;
                }
                if (length == 1) {
                    innerDisposableArr2 = EMPTY;
                } else {
                    InnerDisposable[] innerDisposableArr3 = new InnerDisposable[length - 1];
                    System.arraycopy(innerDisposableArr, 0, innerDisposableArr3, 0, i);
                    System.arraycopy(innerDisposableArr, i + 1, innerDisposableArr3, i, (length - i) - 1);
                    innerDisposableArr2 = innerDisposableArr3;
                }
            } while (!fue.a(this.observers, innerDisposableArr, innerDisposableArr2));
        }

        public void replay() {
            for (InnerDisposable<T> innerDisposable : this.observers.get()) {
                this.buffer.replay(innerDisposable);
            }
        }

        public void replayFinal() {
            for (InnerDisposable<T> innerDisposable : this.observers.getAndSet(TERMINATED)) {
                this.buffer.replay(innerDisposable);
            }
        }
    }

    public static final class SizeAndTimeBoundReplayBuffer<T> extends BoundedReplayBuffer<T> {
        private static final long serialVersionUID = 3457957419649567404L;
        final int limit;
        final long maxAge;
        final cfg scheduler;
        final TimeUnit unit;

        public SizeAndTimeBoundReplayBuffer(int i, long j2, TimeUnit timeUnit, cfg cfgVar, boolean z) {
            super(z);
            this.scheduler = cfgVar;
            this.limit = i;
            this.maxAge = j2;
            this.unit = timeUnit;
        }

        @Override // io.reactivex.rxjava3.internal.operators.observable.ObservableReplay.BoundedReplayBuffer
        public Object enterTransform(Object obj) {
            return new vzj(obj, this.scheduler.f(this.unit), this.unit);
        }

        @Override // io.reactivex.rxjava3.internal.operators.observable.ObservableReplay.BoundedReplayBuffer
        public Node getHead() {
            Node node;
            long jF = this.scheduler.f(this.unit) - this.maxAge;
            Node node2 = get();
            Node node3 = node2.get();
            while (true) {
                Node node4 = node3;
                node = node2;
                node2 = node4;
                if (node2 == null) {
                    break;
                }
                vzj vzjVar = (vzj) node2.value;
                if (NotificationLite.isComplete(vzjVar.b()) || NotificationLite.isError(vzjVar.b()) || vzjVar.a() > jF) {
                    break;
                }
                node3 = node2.get();
            }
            return node;
        }

        @Override // io.reactivex.rxjava3.internal.operators.observable.ObservableReplay.BoundedReplayBuffer
        public Object leaveTransform(Object obj) {
            return ((vzj) obj).b();
        }

        @Override // io.reactivex.rxjava3.internal.operators.observable.ObservableReplay.BoundedReplayBuffer
        public void truncate() {
            Node node;
            long jF = this.scheduler.f(this.unit) - this.maxAge;
            Node node2 = get();
            Node node3 = node2.get();
            int i = 0;
            while (true) {
                Node node4 = node3;
                node = node2;
                node2 = node4;
                int i2 = this.size;
                if (i2 > 1) {
                    if (i2 <= this.limit) {
                        if (((vzj) node2.value).a() > jF) {
                            break;
                        }
                        i++;
                        this.size--;
                        node3 = node2.get();
                    } else {
                        i++;
                        this.size = i2 - 1;
                        node3 = node2.get();
                    }
                } else {
                    break;
                }
            }
            if (i != 0) {
                setFirst(node);
            }
        }

        @Override // io.reactivex.rxjava3.internal.operators.observable.ObservableReplay.BoundedReplayBuffer
        public void truncateFinal() {
            Node node;
            long jF = this.scheduler.f(this.unit) - this.maxAge;
            Node node2 = get();
            Node node3 = node2.get();
            int i = 0;
            while (true) {
                Node node4 = node3;
                node = node2;
                node2 = node4;
                if (this.size <= 1 || ((vzj) node2.value).a() > jF) {
                    break;
                }
                i++;
                this.size--;
                node3 = node2.get();
            }
            if (i != 0) {
                setFirst(node);
            }
        }
    }

    public static final class SizeBoundReplayBuffer<T> extends BoundedReplayBuffer<T> {
        private static final long serialVersionUID = -5898283885385201806L;
        final int limit;

        public SizeBoundReplayBuffer(int i, boolean z) {
            super(z);
            this.limit = i;
        }

        @Override // io.reactivex.rxjava3.internal.operators.observable.ObservableReplay.BoundedReplayBuffer
        public void truncate() {
            if (this.size > this.limit) {
                removeFirst();
            }
        }
    }

    public static final class UnboundedReplayBuffer<T> extends ArrayList<Object> implements b<T> {
        private static final long serialVersionUID = 7063189396499112664L;
        volatile int size;

        public UnboundedReplayBuffer(int i) {
            super(i);
        }

        @Override // io.reactivex.rxjava3.internal.operators.observable.ObservableReplay.b
        public void complete() {
            add(NotificationLite.complete());
            this.size++;
        }

        @Override // io.reactivex.rxjava3.internal.operators.observable.ObservableReplay.b
        public void error(Throwable th) {
            add(NotificationLite.error(th));
            this.size++;
        }

        @Override // io.reactivex.rxjava3.internal.operators.observable.ObservableReplay.b
        public void next(T t) {
            add(NotificationLite.next(t));
            this.size++;
        }

        @Override // io.reactivex.rxjava3.internal.operators.observable.ObservableReplay.b
        public void replay(InnerDisposable<T> innerDisposable) {
            if (innerDisposable.getAndIncrement() != 0) {
                return;
            }
            aed<? super T> aedVar = innerDisposable.child;
            int iAddAndGet = 1;
            while (!innerDisposable.isDisposed()) {
                int i = this.size;
                Integer num = (Integer) innerDisposable.index();
                int iIntValue = num != null ? num.intValue() : 0;
                while (iIntValue < i) {
                    if (NotificationLite.accept(get(iIntValue), aedVar) || innerDisposable.isDisposed()) {
                        return;
                    } else {
                        iIntValue++;
                    }
                }
                innerDisposable.index = Integer.valueOf(iIntValue);
                iAddAndGet = innerDisposable.addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
        }
    }

    public interface a<T> {
        b<T> call();
    }

    public interface b<T> {
        void complete();

        void error(Throwable th);

        void next(T t);

        void replay(InnerDisposable<T> innerDisposable);
    }

    public static final class c<T> implements a<T> {
        public final int a;
        public final boolean b;

        public c(int i, boolean z) {
            this.a = i;
            this.b = z;
        }

        @Override // io.reactivex.rxjava3.internal.operators.observable.ObservableReplay.a
        public b<T> call() {
            return new SizeBoundReplayBuffer(this.a, this.b);
        }
    }

    public static final class d<T> implements jdd<T> {
        public final AtomicReference<ReplayObserver<T>> i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final a<T> f20578j;

        public d(AtomicReference<ReplayObserver<T>> atomicReference, a<T> aVar) {
            this.i = atomicReference;
            this.f20578j = aVar;
        }

        @Override // com.oplus.aiunit.vision.jdd
        public void subscribe(aed<? super T> aedVar) {
            ReplayObserver<T> replayObserver;
            while (true) {
                replayObserver = this.i.get();
                if (replayObserver != null) {
                    break;
                }
                ReplayObserver<T> replayObserver2 = new ReplayObserver<>(this.f20578j.call(), this.i);
                if (fue.a(this.i, null, replayObserver2)) {
                    replayObserver = replayObserver2;
                    break;
                }
            }
            InnerDisposable<T> innerDisposable = new InnerDisposable<>(replayObserver, aedVar);
            aedVar.onSubscribe(innerDisposable);
            replayObserver.add(innerDisposable);
            if (innerDisposable.isDisposed()) {
                replayObserver.remove(innerDisposable);
            } else {
                replayObserver.buffer.replay(innerDisposable);
            }
        }
    }

    public static final class e implements a<Object> {
        @Override // io.reactivex.rxjava3.internal.operators.observable.ObservableReplay.a
        public b<Object> call() {
            return new UnboundedReplayBuffer(16);
        }
    }

    public ObservableReplay(jdd<T> jddVar, jdd<T> jddVar2, AtomicReference<ReplayObserver<T>> atomicReference, a<T> aVar) {
        this.f20577l = jddVar;
        this.i = jddVar2;
        this.f20576j = atomicReference;
        this.k = aVar;
    }

    public static <T> iy3<T> w1(jdd<T> jddVar, int i, boolean z) {
        return i == Integer.MAX_VALUE ? y1(jddVar) : x1(jddVar, new c(i, z));
    }

    public static <T> iy3<T> x1(jdd<T> jddVar, a<T> aVar) {
        AtomicReference atomicReference = new AtomicReference();
        return g4g.n(new ObservableReplay(new d(atomicReference, aVar), jddVar, atomicReference, aVar));
    }

    public static <T> iy3<T> y1(jdd<? extends T> jddVar) {
        return x1(jddVar, m);
    }

    @Override // com.oplus.aiunit.vision.lbd
    public void K0(aed<? super T> aedVar) {
        this.f20577l.subscribe(aedVar);
    }

    @Override // com.oplus.aiunit.vision.iy3
    public void v1(o14<? super io.reactivex.rxjava3.disposables.a> o14Var) {
        ReplayObserver<T> replayObserver;
        while (true) {
            replayObserver = this.f20576j.get();
            if (replayObserver != null && !replayObserver.isDisposed()) {
                break;
            }
            ReplayObserver<T> replayObserver2 = new ReplayObserver<>(this.k.call(), this.f20576j);
            if (fue.a(this.f20576j, replayObserver, replayObserver2)) {
                replayObserver = replayObserver2;
                break;
            }
        }
        boolean z = !replayObserver.shouldConnect.get() && replayObserver.shouldConnect.compareAndSet(false, true);
        try {
            o14Var.accept(replayObserver);
            if (z) {
                this.i.subscribe(replayObserver);
            }
        } catch (Throwable th) {
            hu6.b(th);
            if (z) {
                replayObserver.shouldConnect.compareAndSet(true, false);
            }
            hu6.b(th);
            throw ExceptionHelper.h(th);
        }
    }
}
