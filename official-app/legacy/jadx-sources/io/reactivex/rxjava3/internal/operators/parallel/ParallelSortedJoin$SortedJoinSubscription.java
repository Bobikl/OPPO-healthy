package io.reactivex.rxjava3.internal.operators.parallel;

import com.oplus.aiunit.vision.c3j;
import com.oplus.aiunit.vision.fue;
import com.oplus.aiunit.vision.g4g;
import com.oplus.aiunit.vision.hu6;
import com.oplus.aiunit.vision.v2j;
import com.oplus.aiunit.vision.vr0;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
final class ParallelSortedJoin$SortedJoinSubscription<T> extends AtomicInteger implements c3j {
    private static final long serialVersionUID = 3481980673745556697L;
    volatile boolean cancelled;
    final Comparator<? super T> comparator;
    final v2j<? super T> downstream;
    final int[] indexes;
    final List<T>[] lists;
    final ParallelSortedJoin$SortedJoinInnerSubscriber<T>[] subscribers;
    final AtomicLong requested = new AtomicLong();
    final AtomicInteger remaining = new AtomicInteger();
    final AtomicReference<Throwable> error = new AtomicReference<>();

    public ParallelSortedJoin$SortedJoinSubscription(v2j<? super T> v2jVar, int i, Comparator<? super T> comparator) {
        this.downstream = v2jVar;
        this.comparator = comparator;
        ParallelSortedJoin$SortedJoinInnerSubscriber<T>[] parallelSortedJoin$SortedJoinInnerSubscriberArr = new ParallelSortedJoin$SortedJoinInnerSubscriber[i];
        for (int i2 = 0; i2 < i; i2++) {
            parallelSortedJoin$SortedJoinInnerSubscriberArr[i2] = new ParallelSortedJoin$SortedJoinInnerSubscriber<>(this, i2);
        }
        this.subscribers = parallelSortedJoin$SortedJoinInnerSubscriberArr;
        this.lists = new List[i];
        this.indexes = new int[i];
        this.remaining.lazySet(i);
    }

    @Override // com.oplus.aiunit.vision.c3j
    public void cancel() {
        if (this.cancelled) {
            return;
        }
        this.cancelled = true;
        cancelAll();
        if (getAndIncrement() == 0) {
            Arrays.fill(this.lists, (Object) null);
        }
    }

    public void cancelAll() {
        for (ParallelSortedJoin$SortedJoinInnerSubscriber<T> parallelSortedJoin$SortedJoinInnerSubscriber : this.subscribers) {
            parallelSortedJoin$SortedJoinInnerSubscriber.cancel();
        }
    }

    public void drain() {
        boolean z;
        if (getAndIncrement() != 0) {
            return;
        }
        v2j<? super T> v2jVar = this.downstream;
        List<T>[] listArr = this.lists;
        int[] iArr = this.indexes;
        int length = iArr.length;
        int iAddAndGet = 1;
        do {
            long j2 = this.requested.get();
            long j3 = 0;
            while (j3 != j2) {
                if (this.cancelled) {
                    Arrays.fill(listArr, (Object) null);
                    return;
                }
                Throwable th = this.error.get();
                if (th != null) {
                    cancelAll();
                    Arrays.fill(listArr, (Object) null);
                    v2jVar.onError(th);
                    return;
                }
                int i = -1;
                T t = null;
                for (int i2 = 0; i2 < length; i2++) {
                    List<T> list = listArr[i2];
                    int i3 = iArr[i2];
                    if (list.size() != i3) {
                        if (t == null) {
                            t = list.get(i3);
                        } else {
                            T t2 = list.get(i3);
                            try {
                                if (this.comparator.compare(t, t2) > 0) {
                                    t = t2;
                                }
                            } catch (Throwable th2) {
                                hu6.b(th2);
                                cancelAll();
                                Arrays.fill(listArr, (Object) null);
                                if (!fue.a(this.error, null, th2)) {
                                    g4g.u(th2);
                                }
                                v2jVar.onError(this.error.get());
                                return;
                            }
                        }
                        i = i2;
                    }
                }
                if (t == null) {
                    Arrays.fill(listArr, (Object) null);
                    v2jVar.onComplete();
                    return;
                } else {
                    v2jVar.onNext(t);
                    iArr[i] = iArr[i] + 1;
                    j3++;
                }
            }
            if (this.cancelled) {
                Arrays.fill(listArr, (Object) null);
                return;
            }
            Throwable th3 = this.error.get();
            if (th3 != null) {
                cancelAll();
                Arrays.fill(listArr, (Object) null);
                v2jVar.onError(th3);
                return;
            }
            int i4 = 0;
            while (true) {
                if (i4 >= length) {
                    z = true;
                    break;
                } else {
                    if (iArr[i4] != listArr[i4].size()) {
                        z = false;
                        break;
                    }
                    i4++;
                }
            }
            if (z) {
                Arrays.fill(listArr, (Object) null);
                v2jVar.onComplete();
                return;
            } else {
                if (j3 != 0) {
                    vr0.e(this.requested, j3);
                }
                iAddAndGet = addAndGet(-iAddAndGet);
            }
        } while (iAddAndGet != 0);
    }

    public void innerError(Throwable th) {
        if (fue.a(this.error, null, th)) {
            drain();
        } else if (th != this.error.get()) {
            g4g.u(th);
        }
    }

    public void innerNext(List<T> list, int i) {
        this.lists[i] = list;
        if (this.remaining.decrementAndGet() == 0) {
            drain();
        }
    }

    @Override // com.oplus.aiunit.vision.c3j
    public void request(long j2) {
        if (SubscriptionHelper.validate(j2)) {
            vr0.a(this.requested, j2);
            if (this.remaining.get() == 0) {
                drain();
            }
        }
    }
}
