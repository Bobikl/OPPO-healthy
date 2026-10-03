package io.reactivex.internal.operators.flowable;

import com.oplus.aiunit.vision.abd;
import com.oplus.aiunit.vision.c3j;
import com.oplus.aiunit.vision.h4g;
import com.oplus.aiunit.vision.iu6;
import com.oplus.aiunit.vision.j08;
import com.oplus.aiunit.vision.jt3;
import com.oplus.aiunit.vision.k3f;
import com.oplus.aiunit.vision.v2j;
import com.oplus.aiunit.vision.zf8;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AtomicThrowable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: classes10.dex */
final class FlowableWithLatestFromMany$WithLatestFromSubscriber<T, R> extends AtomicInteger implements jt3<T>, c3j {
    private static final long serialVersionUID = 1577321883966341961L;
    final j08<? super Object[], R> combiner;
    volatile boolean done;
    final v2j<? super R> downstream;
    final AtomicThrowable error;
    final AtomicLong requested;
    final FlowableWithLatestFromMany$WithLatestInnerSubscriber[] subscribers;
    final AtomicReference<c3j> upstream;
    final AtomicReferenceArray<Object> values;

    public FlowableWithLatestFromMany$WithLatestFromSubscriber(v2j<? super R> v2jVar, j08<? super Object[], R> j08Var, int i) {
        this.downstream = v2jVar;
        this.combiner = j08Var;
        FlowableWithLatestFromMany$WithLatestInnerSubscriber[] flowableWithLatestFromMany$WithLatestInnerSubscriberArr = new FlowableWithLatestFromMany$WithLatestInnerSubscriber[i];
        for (int i2 = 0; i2 < i; i2++) {
            flowableWithLatestFromMany$WithLatestInnerSubscriberArr[i2] = new FlowableWithLatestFromMany$WithLatestInnerSubscriber(this, i2);
        }
        this.subscribers = flowableWithLatestFromMany$WithLatestInnerSubscriberArr;
        this.values = new AtomicReferenceArray<>(i);
        this.upstream = new AtomicReference<>();
        this.requested = new AtomicLong();
        this.error = new AtomicThrowable();
    }

    @Override // com.oplus.aiunit.vision.c3j
    public void cancel() {
        SubscriptionHelper.cancel(this.upstream);
        for (FlowableWithLatestFromMany$WithLatestInnerSubscriber flowableWithLatestFromMany$WithLatestInnerSubscriber : this.subscribers) {
            flowableWithLatestFromMany$WithLatestInnerSubscriber.dispose();
        }
    }

    public void cancelAllBut(int i) {
        FlowableWithLatestFromMany$WithLatestInnerSubscriber[] flowableWithLatestFromMany$WithLatestInnerSubscriberArr = this.subscribers;
        for (int i2 = 0; i2 < flowableWithLatestFromMany$WithLatestInnerSubscriberArr.length; i2++) {
            if (i2 != i) {
                flowableWithLatestFromMany$WithLatestInnerSubscriberArr[i2].dispose();
            }
        }
    }

    public void innerComplete(int i, boolean z) {
        if (z) {
            return;
        }
        this.done = true;
        SubscriptionHelper.cancel(this.upstream);
        cancelAllBut(i);
        zf8.b(this.downstream, this, this.error);
    }

    public void innerError(int i, Throwable th) {
        this.done = true;
        SubscriptionHelper.cancel(this.upstream);
        cancelAllBut(i);
        zf8.d(this.downstream, th, this, this.error);
    }

    public void innerNext(int i, Object obj) {
        this.values.set(i, obj);
    }

    @Override // com.oplus.aiunit.vision.v2j
    public void onComplete() {
        if (this.done) {
            return;
        }
        this.done = true;
        cancelAllBut(-1);
        zf8.b(this.downstream, this, this.error);
    }

    @Override // com.oplus.aiunit.vision.v2j
    public void onError(Throwable th) {
        if (this.done) {
            h4g.r(th);
            return;
        }
        this.done = true;
        cancelAllBut(-1);
        zf8.d(this.downstream, th, this, this.error);
    }

    @Override // com.oplus.aiunit.vision.v2j
    public void onNext(T t) {
        if (tryOnNext(t) || this.done) {
            return;
        }
        this.upstream.get().request(1L);
    }

    @Override // com.oplus.aiunit.vision.wu7, com.oplus.aiunit.vision.v2j
    public void onSubscribe(c3j c3jVar) {
        SubscriptionHelper.deferredSetOnce(this.upstream, this.requested, c3jVar);
    }

    @Override // com.oplus.aiunit.vision.c3j
    public void request(long j2) {
        SubscriptionHelper.deferredRequest(this.upstream, this.requested, j2);
    }

    public void subscribe(k3f<?>[] k3fVarArr, int i) {
        FlowableWithLatestFromMany$WithLatestInnerSubscriber[] flowableWithLatestFromMany$WithLatestInnerSubscriberArr = this.subscribers;
        AtomicReference<c3j> atomicReference = this.upstream;
        for (int i2 = 0; i2 < i && atomicReference.get() != SubscriptionHelper.CANCELLED; i2++) {
            k3fVarArr[i2].subscribe(flowableWithLatestFromMany$WithLatestInnerSubscriberArr[i2]);
        }
    }

    @Override // com.oplus.aiunit.vision.jt3
    public boolean tryOnNext(T t) {
        if (this.done) {
            return false;
        }
        AtomicReferenceArray<Object> atomicReferenceArray = this.values;
        int length = atomicReferenceArray.length();
        Object[] objArr = new Object[length + 1];
        objArr[0] = t;
        int i = 0;
        while (i < length) {
            Object obj = atomicReferenceArray.get(i);
            if (obj == null) {
                return false;
            }
            i++;
            objArr[i] = obj;
        }
        try {
            zf8.f(this.downstream, abd.d(this.combiner.apply(objArr), "The combiner returned a null value"), this, this.error);
            return true;
        } catch (Throwable th) {
            iu6.b(th);
            cancel();
            onError(th);
            return false;
        }
    }
}
