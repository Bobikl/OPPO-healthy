package io.reactivex.rxjava3.internal.operators.maybe;

import com.oplus.aiunit.vision.c3j;
import com.oplus.aiunit.vision.lob;
import com.oplus.aiunit.vision.pob;
import com.oplus.aiunit.vision.v2j;
import com.oplus.aiunit.vision.vr0;
import io.reactivex.rxjava3.internal.disposables.SequentialDisposable;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.internal.util.NotificationLite;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
final class MaybeConcatArray$ConcatMaybeObserver<T> extends AtomicInteger implements lob<T>, c3j {
    private static final long serialVersionUID = 3520831347801429610L;
    final v2j<? super T> downstream;
    int index;
    long produced;
    final pob<? extends T>[] sources;
    final AtomicLong requested = new AtomicLong();
    final SequentialDisposable disposables = new SequentialDisposable();
    final AtomicReference<Object> current = new AtomicReference<>(NotificationLite.COMPLETE);

    public MaybeConcatArray$ConcatMaybeObserver(v2j<? super T> v2jVar, pob<? extends T>[] pobVarArr) {
        this.downstream = v2jVar;
        this.sources = pobVarArr;
    }

    @Override // com.oplus.aiunit.vision.c3j
    public void cancel() {
        this.disposables.dispose();
    }

    public void drain() {
        if (getAndIncrement() != 0) {
            return;
        }
        AtomicReference<Object> atomicReference = this.current;
        v2j<? super T> v2jVar = this.downstream;
        SequentialDisposable sequentialDisposable = this.disposables;
        while (!sequentialDisposable.isDisposed()) {
            Object obj = atomicReference.get();
            if (obj != null) {
                boolean z = true;
                if (obj != NotificationLite.COMPLETE) {
                    long j2 = this.produced;
                    if (j2 != this.requested.get()) {
                        this.produced = j2 + 1;
                        atomicReference.lazySet(null);
                        v2jVar.onNext(obj);
                    } else {
                        z = false;
                    }
                } else {
                    atomicReference.lazySet(null);
                }
                if (z && !sequentialDisposable.isDisposed()) {
                    int i = this.index;
                    pob<? extends T>[] pobVarArr = this.sources;
                    if (i == pobVarArr.length) {
                        v2jVar.onComplete();
                        return;
                    } else {
                        this.index = i + 1;
                        pobVarArr[i].a(this);
                    }
                }
            }
            if (decrementAndGet() == 0) {
                return;
            }
        }
        atomicReference.lazySet(null);
    }

    @Override // com.oplus.aiunit.vision.lob
    public void onComplete() {
        this.current.lazySet(NotificationLite.COMPLETE);
        drain();
    }

    @Override // com.oplus.aiunit.vision.lob
    public void onError(Throwable th) {
        this.downstream.onError(th);
    }

    @Override // com.oplus.aiunit.vision.lob
    public void onSubscribe(io.reactivex.rxjava3.disposables.a aVar) {
        this.disposables.replace(aVar);
    }

    @Override // com.oplus.aiunit.vision.lob, com.oplus.aiunit.vision.l6h
    public void onSuccess(T t) {
        this.current.lazySet(t);
        drain();
    }

    @Override // com.oplus.aiunit.vision.c3j
    public void request(long j2) {
        if (SubscriptionHelper.validate(j2)) {
            vr0.a(this.requested, j2);
            drain();
        }
    }
}
