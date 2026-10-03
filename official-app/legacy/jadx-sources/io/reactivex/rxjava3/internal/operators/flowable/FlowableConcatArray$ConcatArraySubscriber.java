package io.reactivex.rxjava3.internal.operators.flowable;

import com.oplus.aiunit.vision.c3j;
import com.oplus.aiunit.vision.k3f;
import com.oplus.aiunit.vision.v2j;
import com.oplus.aiunit.vision.vu7;
import io.reactivex.rxjava3.exceptions.CompositeException;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionArbiter;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes10.dex */
final class FlowableConcatArray$ConcatArraySubscriber<T> extends SubscriptionArbiter implements vu7<T> {
    private static final long serialVersionUID = -8158322871608889516L;
    final boolean delayError;
    final v2j<? super T> downstream;
    List<Throwable> errors;
    int index;
    long produced;
    final k3f<? extends T>[] sources;
    final AtomicInteger wip;

    public FlowableConcatArray$ConcatArraySubscriber(k3f<? extends T>[] k3fVarArr, boolean z, v2j<? super T> v2jVar) {
        super(false);
        this.downstream = v2jVar;
        this.sources = k3fVarArr;
        this.delayError = z;
        this.wip = new AtomicInteger();
    }

    @Override // com.oplus.aiunit.vision.v2j
    public void onComplete() {
        if (this.wip.getAndIncrement() == 0) {
            k3f<? extends T>[] k3fVarArr = this.sources;
            int length = k3fVarArr.length;
            int i = this.index;
            while (i != length) {
                k3f<? extends T> k3fVar = k3fVarArr[i];
                if (k3fVar == null) {
                    NullPointerException nullPointerException = new NullPointerException("A Publisher entry is null");
                    if (!this.delayError) {
                        this.downstream.onError(nullPointerException);
                        return;
                    }
                    List arrayList = this.errors;
                    if (arrayList == null) {
                        arrayList = new ArrayList((length - i) + 1);
                        this.errors = arrayList;
                    }
                    arrayList.add(nullPointerException);
                    i++;
                } else {
                    long j2 = this.produced;
                    if (j2 != 0) {
                        this.produced = 0L;
                        produced(j2);
                    }
                    k3fVar.subscribe(this);
                    i++;
                    this.index = i;
                    if (this.wip.decrementAndGet() == 0) {
                        return;
                    }
                }
            }
            List<Throwable> list = this.errors;
            if (list == null) {
                this.downstream.onComplete();
            } else if (list.size() == 1) {
                this.downstream.onError(list.get(0));
            } else {
                this.downstream.onError(new CompositeException(list));
            }
        }
    }

    @Override // com.oplus.aiunit.vision.v2j
    public void onError(Throwable th) {
        if (!this.delayError) {
            this.downstream.onError(th);
            return;
        }
        List arrayList = this.errors;
        if (arrayList == null) {
            arrayList = new ArrayList((this.sources.length - this.index) + 1);
            this.errors = arrayList;
        }
        arrayList.add(th);
        onComplete();
    }

    @Override // com.oplus.aiunit.vision.v2j
    public void onNext(T t) {
        this.produced++;
        this.downstream.onNext(t);
    }

    @Override // com.oplus.aiunit.vision.vu7, com.oplus.aiunit.vision.v2j
    public void onSubscribe(c3j c3jVar) {
        setSubscription(c3jVar);
    }
}
