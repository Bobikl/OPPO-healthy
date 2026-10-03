package io.reactivex.internal.operators.flowable;

import com.oplus.aiunit.vision.cv5;
import com.oplus.aiunit.vision.g4h;
import com.oplus.aiunit.vision.h4g;
import com.oplus.aiunit.vision.iu6;
import com.oplus.aiunit.vision.k3f;
import com.oplus.aiunit.vision.m6h;
import com.oplus.aiunit.vision.pd1;
import com.oplus.aiunit.vision.uu7;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AtomicThrowable;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes10.dex */
final class FlowableSequenceEqualSingle$EqualCoordinator<T> extends AtomicInteger implements cv5, uu7 {
    private static final long serialVersionUID = -6178010334400373240L;
    final pd1<? super T, ? super T> comparer;
    final m6h<? super Boolean> downstream;
    final AtomicThrowable error = new AtomicThrowable();
    final FlowableSequenceEqual$EqualSubscriber<T> first;
    final FlowableSequenceEqual$EqualSubscriber<T> second;
    T v1;
    T v2;

    public FlowableSequenceEqualSingle$EqualCoordinator(m6h<? super Boolean> m6hVar, int i, pd1<? super T, ? super T> pd1Var) {
        this.downstream = m6hVar;
        this.comparer = pd1Var;
        this.first = new FlowableSequenceEqual$EqualSubscriber<>(this, i);
        this.second = new FlowableSequenceEqual$EqualSubscriber<>(this, i);
    }

    public void cancelAndClear() {
        this.first.cancel();
        this.first.clear();
        this.second.cancel();
        this.second.clear();
    }

    @Override // com.oplus.aiunit.vision.cv5
    public void dispose() {
        this.first.cancel();
        this.second.cancel();
        if (getAndIncrement() == 0) {
            this.first.clear();
            this.second.clear();
        }
    }

    @Override // com.oplus.aiunit.vision.uu7
    public void drain() {
        if (getAndIncrement() != 0) {
            return;
        }
        int iAddAndGet = 1;
        do {
            g4h<T> g4hVar = this.first.queue;
            g4h<T> g4hVar2 = this.second.queue;
            if (g4hVar != null && g4hVar2 != null) {
                while (true) {
                    if (isDisposed()) {
                        this.first.clear();
                        this.second.clear();
                        return;
                    }
                    if (this.error.get() != null) {
                        cancelAndClear();
                        this.downstream.onError(this.error.terminate());
                        return;
                    }
                    boolean z = this.first.done;
                    T tPoll = this.v1;
                    if (tPoll == null) {
                        try {
                            tPoll = g4hVar.poll();
                            this.v1 = tPoll;
                        } catch (Throwable th) {
                            iu6.b(th);
                            cancelAndClear();
                            this.error.addThrowable(th);
                            this.downstream.onError(this.error.terminate());
                            return;
                        }
                    }
                    boolean z2 = tPoll == null;
                    boolean z3 = this.second.done;
                    T tPoll2 = this.v2;
                    if (tPoll2 == null) {
                        try {
                            tPoll2 = g4hVar2.poll();
                            this.v2 = tPoll2;
                        } catch (Throwable th2) {
                            iu6.b(th2);
                            cancelAndClear();
                            this.error.addThrowable(th2);
                            this.downstream.onError(this.error.terminate());
                            return;
                        }
                    }
                    boolean z4 = tPoll2 == null;
                    if (z && z3 && z2 && z4) {
                        this.downstream.onSuccess(Boolean.TRUE);
                        return;
                    }
                    if (z && z3 && z2 != z4) {
                        cancelAndClear();
                        this.downstream.onSuccess(Boolean.FALSE);
                        return;
                    }
                    if (z2 || z4) {
                        break;
                    }
                    try {
                        if (!this.comparer.a(tPoll, tPoll2)) {
                            cancelAndClear();
                            this.downstream.onSuccess(Boolean.FALSE);
                            return;
                        } else {
                            this.v1 = null;
                            this.v2 = null;
                            this.first.request();
                            this.second.request();
                        }
                    } catch (Throwable th3) {
                        iu6.b(th3);
                        cancelAndClear();
                        this.error.addThrowable(th3);
                        this.downstream.onError(this.error.terminate());
                        return;
                    }
                }
            } else if (isDisposed()) {
                this.first.clear();
                this.second.clear();
                return;
            } else if (this.error.get() != null) {
                cancelAndClear();
                this.downstream.onError(this.error.terminate());
                return;
            }
            iAddAndGet = addAndGet(-iAddAndGet);
        } while (iAddAndGet != 0);
    }

    @Override // com.oplus.aiunit.vision.uu7
    public void innerError(Throwable th) {
        if (this.error.addThrowable(th)) {
            drain();
        } else {
            h4g.r(th);
        }
    }

    @Override // com.oplus.aiunit.vision.cv5
    public boolean isDisposed() {
        return this.first.get() == SubscriptionHelper.CANCELLED;
    }

    public void subscribe(k3f<? extends T> k3fVar, k3f<? extends T> k3fVar2) {
        k3fVar.subscribe(this.first);
        k3fVar2.subscribe(this.second);
    }
}
