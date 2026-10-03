package io.reactivex.internal.operators.parallel;

import com.oplus.aiunit.vision.c3j;
import com.oplus.aiunit.vision.fue;
import com.oplus.aiunit.vision.h4g;
import com.oplus.aiunit.vision.iu6;
import com.oplus.aiunit.vision.v2j;
import com.oplus.aiunit.vision.wr0;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
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
        int i = 1;
        while (true) {
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
                int i2 = -1;
                T t = null;
                for (int i3 = 0; i3 < length; i3++) {
                    List<T> list = listArr[i3];
                    int i4 = iArr[i3];
                    if (list.size() != i4) {
                        if (t == null) {
                            t = list.get(i4);
                        } else {
                            T t2 = list.get(i4);
                            try {
                                if (this.comparator.compare(t, t2) > 0) {
                                    t = t2;
                                }
                            } catch (Throwable th2) {
                                iu6.b(th2);
                                cancelAll();
                                Arrays.fill(listArr, (Object) null);
                                if (!fue.a(this.error, null, th2)) {
                                    h4g.r(th2);
                                }
                                v2jVar.onError(this.error.get());
                                return;
                            }
                        }
                        i2 = i3;
                    }
                }
                if (t == null) {
                    Arrays.fill(listArr, (Object) null);
                    v2jVar.onComplete();
                    return;
                } else {
                    v2jVar.onNext(t);
                    iArr[i2] = iArr[i2] + 1;
                    j3++;
                }
            }
            if (j3 == j2) {
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
                int i5 = 0;
                while (true) {
                    if (i5 >= length) {
                        z = true;
                        break;
                    } else {
                        if (iArr[i5] != listArr[i5].size()) {
                            z = false;
                            break;
                        }
                        i5++;
                    }
                }
                if (z) {
                    Arrays.fill(listArr, (Object) null);
                    v2jVar.onComplete();
                    return;
                }
            }
            if (j3 != 0 && j2 != Long.MAX_VALUE) {
                this.requested.addAndGet(-j3);
            }
            int iAddAndGet = get();
            if (iAddAndGet == i && (iAddAndGet = addAndGet(-i)) == 0) {
                return;
            } else {
                i = iAddAndGet;
            }
        }
    }

    public void innerError(Throwable th) {
        if (fue.a(this.error, null, th)) {
            drain();
        } else if (th != this.error.get()) {
            h4g.r(th);
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
            wr0.a(this.requested, j2);
            if (this.remaining.get() == 0) {
                drain();
            }
        }
    }
}
