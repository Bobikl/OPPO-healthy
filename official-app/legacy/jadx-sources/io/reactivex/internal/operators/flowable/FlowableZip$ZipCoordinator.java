package io.reactivex.internal.operators.flowable;

import com.oplus.aiunit.vision.abd;
import com.oplus.aiunit.vision.c3j;
import com.oplus.aiunit.vision.g4h;
import com.oplus.aiunit.vision.h4g;
import com.oplus.aiunit.vision.iu6;
import com.oplus.aiunit.vision.j08;
import com.oplus.aiunit.vision.k3f;
import com.oplus.aiunit.vision.v2j;
import com.oplus.aiunit.vision.wr0;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AtomicThrowable;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes10.dex */
final class FlowableZip$ZipCoordinator<T, R> extends AtomicInteger implements c3j {
    private static final long serialVersionUID = -2434867452883857743L;
    volatile boolean cancelled;
    final Object[] current;
    final boolean delayErrors;
    final v2j<? super R> downstream;
    final AtomicThrowable errors;
    final AtomicLong requested;
    final FlowableZip$ZipSubscriber<T, R>[] subscribers;
    final j08<? super Object[], ? extends R> zipper;

    public FlowableZip$ZipCoordinator(v2j<? super R> v2jVar, j08<? super Object[], ? extends R> j08Var, int i, int i2, boolean z) {
        this.downstream = v2jVar;
        this.zipper = j08Var;
        this.delayErrors = z;
        FlowableZip$ZipSubscriber<T, R>[] flowableZip$ZipSubscriberArr = new FlowableZip$ZipSubscriber[i];
        for (int i3 = 0; i3 < i; i3++) {
            flowableZip$ZipSubscriberArr[i3] = new FlowableZip$ZipSubscriber<>(this, i2);
        }
        this.current = new Object[i];
        this.subscribers = flowableZip$ZipSubscriberArr;
        this.requested = new AtomicLong();
        this.errors = new AtomicThrowable();
    }

    @Override // com.oplus.aiunit.vision.c3j
    public void cancel() {
        if (this.cancelled) {
            return;
        }
        this.cancelled = true;
        cancelAll();
    }

    public void cancelAll() {
        for (FlowableZip$ZipSubscriber<T, R> flowableZip$ZipSubscriber : this.subscribers) {
            flowableZip$ZipSubscriber.cancel();
        }
    }

    public void drain() {
        if (getAndIncrement() != 0) {
            return;
        }
        v2j<? super R> v2jVar = this.downstream;
        FlowableZip$ZipSubscriber<T, R>[] flowableZip$ZipSubscriberArr = this.subscribers;
        int length = flowableZip$ZipSubscriberArr.length;
        Object[] objArr = this.current;
        int iAddAndGet = 1;
        do {
            long j2 = this.requested.get();
            long j3 = 0;
            while (j2 != j3) {
                if (this.cancelled) {
                    return;
                }
                if (!this.delayErrors && this.errors.get() != null) {
                    cancelAll();
                    v2jVar.onError(this.errors.terminate());
                    return;
                }
                boolean z = false;
                for (int i = 0; i < length; i++) {
                    FlowableZip$ZipSubscriber<T, R> flowableZip$ZipSubscriber = flowableZip$ZipSubscriberArr[i];
                    if (objArr[i] == null) {
                        try {
                            boolean z2 = flowableZip$ZipSubscriber.done;
                            g4h<T> g4hVar = flowableZip$ZipSubscriber.queue;
                            T tPoll = g4hVar != null ? g4hVar.poll() : null;
                            boolean z3 = tPoll == null;
                            if (z2 && z3) {
                                cancelAll();
                                if (this.errors.get() != null) {
                                    v2jVar.onError(this.errors.terminate());
                                    return;
                                } else {
                                    v2jVar.onComplete();
                                    return;
                                }
                            }
                            if (z3) {
                                z = true;
                            } else {
                                objArr[i] = tPoll;
                            }
                        } catch (Throwable th) {
                            iu6.b(th);
                            this.errors.addThrowable(th);
                            if (!this.delayErrors) {
                                cancelAll();
                                v2jVar.onError(this.errors.terminate());
                                return;
                            }
                        }
                    }
                }
                if (z) {
                    break;
                }
                try {
                    v2jVar.onNext((Object) abd.d(this.zipper.apply(objArr.clone()), "The zipper returned a null value"));
                    j3++;
                    Arrays.fill(objArr, (Object) null);
                } catch (Throwable th2) {
                    iu6.b(th2);
                    cancelAll();
                    this.errors.addThrowable(th2);
                    v2jVar.onError(this.errors.terminate());
                    return;
                }
            }
            if (j2 == j3) {
                if (this.cancelled) {
                    return;
                }
                if (!this.delayErrors && this.errors.get() != null) {
                    cancelAll();
                    v2jVar.onError(this.errors.terminate());
                    return;
                }
                for (int i2 = 0; i2 < length; i2++) {
                    FlowableZip$ZipSubscriber<T, R> flowableZip$ZipSubscriber2 = flowableZip$ZipSubscriberArr[i2];
                    if (objArr[i2] == null) {
                        try {
                            boolean z4 = flowableZip$ZipSubscriber2.done;
                            g4h<T> g4hVar2 = flowableZip$ZipSubscriber2.queue;
                            T tPoll2 = g4hVar2 != null ? g4hVar2.poll() : null;
                            boolean z5 = tPoll2 == null;
                            if (z4 && z5) {
                                cancelAll();
                                if (this.errors.get() != null) {
                                    v2jVar.onError(this.errors.terminate());
                                    return;
                                } else {
                                    v2jVar.onComplete();
                                    return;
                                }
                            }
                            if (!z5) {
                                objArr[i2] = tPoll2;
                            }
                        } catch (Throwable th3) {
                            iu6.b(th3);
                            this.errors.addThrowable(th3);
                            if (!this.delayErrors) {
                                cancelAll();
                                v2jVar.onError(this.errors.terminate());
                                return;
                            }
                        }
                    }
                }
            }
            if (j3 != 0) {
                for (FlowableZip$ZipSubscriber<T, R> flowableZip$ZipSubscriber3 : flowableZip$ZipSubscriberArr) {
                    flowableZip$ZipSubscriber3.request(j3);
                }
                if (j2 != Long.MAX_VALUE) {
                    this.requested.addAndGet(-j3);
                }
            }
            iAddAndGet = addAndGet(-iAddAndGet);
        } while (iAddAndGet != 0);
    }

    public void error(FlowableZip$ZipSubscriber<T, R> flowableZip$ZipSubscriber, Throwable th) {
        if (!this.errors.addThrowable(th)) {
            h4g.r(th);
        } else {
            flowableZip$ZipSubscriber.done = true;
            drain();
        }
    }

    @Override // com.oplus.aiunit.vision.c3j
    public void request(long j2) {
        if (SubscriptionHelper.validate(j2)) {
            wr0.a(this.requested, j2);
            drain();
        }
    }

    public void subscribe(k3f<? extends T>[] k3fVarArr, int i) {
        FlowableZip$ZipSubscriber<T, R>[] flowableZip$ZipSubscriberArr = this.subscribers;
        for (int i2 = 0; i2 < i && !this.cancelled; i2++) {
            if (!this.delayErrors && this.errors.get() != null) {
                return;
            }
            k3fVarArr[i2].subscribe(flowableZip$ZipSubscriberArr[i2]);
        }
    }
}
