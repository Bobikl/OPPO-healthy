package io.reactivex.rxjava3.internal.operators.flowable;

import com.oplus.aiunit.vision.f4h;
import com.oplus.aiunit.vision.hu6;
import com.oplus.aiunit.vision.k3f;
import com.oplus.aiunit.vision.od1;
import com.oplus.aiunit.vision.tu7;
import com.oplus.aiunit.vision.v2j;
import io.reactivex.rxjava3.internal.subscriptions.DeferredScalarSubscription;
import io.reactivex.rxjava3.internal.util.AtomicThrowable;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes10.dex */
final class FlowableSequenceEqual$EqualCoordinator<T> extends DeferredScalarSubscription<Boolean> implements tu7 {
    private static final long serialVersionUID = -6178010334400373240L;
    final od1<? super T, ? super T> comparer;
    final AtomicThrowable errors;
    final FlowableSequenceEqual$EqualSubscriber<T> first;
    final FlowableSequenceEqual$EqualSubscriber<T> second;
    T v1;
    T v2;
    final AtomicInteger wip;

    public FlowableSequenceEqual$EqualCoordinator(v2j<? super Boolean> v2jVar, int i, od1<? super T, ? super T> od1Var) {
        super(v2jVar);
        this.comparer = od1Var;
        this.wip = new AtomicInteger();
        this.first = new FlowableSequenceEqual$EqualSubscriber<>(this, i);
        this.second = new FlowableSequenceEqual$EqualSubscriber<>(this, i);
        this.errors = new AtomicThrowable();
    }

    @Override // io.reactivex.rxjava3.internal.subscriptions.DeferredScalarSubscription, io.reactivex.rxjava3.internal.subscriptions.BasicIntQueueSubscription, com.oplus.aiunit.vision.c3j
    public void cancel() {
        super.cancel();
        this.first.cancel();
        this.second.cancel();
        this.errors.tryTerminateAndReport();
        if (this.wip.getAndIncrement() == 0) {
            this.first.clear();
            this.second.clear();
        }
    }

    public void cancelAndClear() {
        this.first.cancel();
        this.first.clear();
        this.second.cancel();
        this.second.clear();
    }

    @Override // com.oplus.aiunit.vision.tu7
    public void drain() {
        if (this.wip.getAndIncrement() != 0) {
            return;
        }
        int iAddAndGet = 1;
        do {
            f4h<T> f4hVar = this.first.queue;
            f4h<T> f4hVar2 = this.second.queue;
            if (f4hVar != null && f4hVar2 != null) {
                while (true) {
                    if (isCancelled()) {
                        this.first.clear();
                        this.second.clear();
                        return;
                    }
                    if (this.errors.get() != null) {
                        cancelAndClear();
                        this.errors.tryTerminateConsumer(this.downstream);
                        return;
                    }
                    boolean z = this.first.done;
                    T tPoll = this.v1;
                    if (tPoll == null) {
                        try {
                            tPoll = f4hVar.poll();
                            this.v1 = tPoll;
                        } catch (Throwable th) {
                            hu6.b(th);
                            cancelAndClear();
                            this.errors.tryAddThrowableOrReport(th);
                            this.errors.tryTerminateConsumer(this.downstream);
                            return;
                        }
                    }
                    boolean z2 = tPoll == null;
                    boolean z3 = this.second.done;
                    T tPoll2 = this.v2;
                    if (tPoll2 == null) {
                        try {
                            tPoll2 = f4hVar2.poll();
                            this.v2 = tPoll2;
                        } catch (Throwable th2) {
                            hu6.b(th2);
                            cancelAndClear();
                            this.errors.tryAddThrowableOrReport(th2);
                            this.errors.tryTerminateConsumer(this.downstream);
                            return;
                        }
                    }
                    boolean z4 = tPoll2 == null;
                    if (z && z3 && z2 && z4) {
                        complete(Boolean.TRUE);
                        return;
                    }
                    if (z && z3 && z2 != z4) {
                        cancelAndClear();
                        complete(Boolean.FALSE);
                        return;
                    }
                    if (z2 || z4) {
                        break;
                    }
                    try {
                        if (!this.comparer.a(tPoll, tPoll2)) {
                            cancelAndClear();
                            complete(Boolean.FALSE);
                            return;
                        } else {
                            this.v1 = null;
                            this.v2 = null;
                            this.first.request();
                            this.second.request();
                        }
                    } catch (Throwable th3) {
                        hu6.b(th3);
                        cancelAndClear();
                        this.errors.tryAddThrowableOrReport(th3);
                        this.errors.tryTerminateConsumer(this.downstream);
                        return;
                    }
                }
            } else if (isCancelled()) {
                this.first.clear();
                this.second.clear();
                return;
            } else if (this.errors.get() != null) {
                cancelAndClear();
                this.errors.tryTerminateConsumer(this.downstream);
                return;
            }
            iAddAndGet = this.wip.addAndGet(-iAddAndGet);
        } while (iAddAndGet != 0);
    }

    @Override // com.oplus.aiunit.vision.tu7
    public void innerError(Throwable th) {
        if (this.errors.tryAddThrowableOrReport(th)) {
            drain();
        }
    }

    public void subscribe(k3f<? extends T> k3fVar, k3f<? extends T> k3fVar2) {
        k3fVar.subscribe(this.first);
        k3fVar2.subscribe(this.second);
    }
}
