package io.reactivex.internal.operators.maybe;

import com.oplus.aiunit.vision.abd;
import com.oplus.aiunit.vision.c3j;
import com.oplus.aiunit.vision.cv5;
import com.oplus.aiunit.vision.iu6;
import com.oplus.aiunit.vision.mob;
import com.oplus.aiunit.vision.qob;
import com.oplus.aiunit.vision.v2j;
import com.oplus.aiunit.vision.wr0;
import io.reactivex.internal.disposables.SequentialDisposable;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.NotificationLite;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
final class MaybeConcatIterable$ConcatMaybeObserver<T> extends AtomicInteger implements mob<T>, c3j {
    private static final long serialVersionUID = 3520831347801429610L;
    final v2j<? super T> downstream;
    long produced;
    final Iterator<? extends qob<? extends T>> sources;
    final AtomicLong requested = new AtomicLong();
    final SequentialDisposable disposables = new SequentialDisposable();
    final AtomicReference<Object> current = new AtomicReference<>(NotificationLite.COMPLETE);

    public MaybeConcatIterable$ConcatMaybeObserver(v2j<? super T> v2jVar, Iterator<? extends qob<? extends T>> it) {
        this.downstream = v2jVar;
        this.sources = it;
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
                    try {
                        if (this.sources.hasNext()) {
                            try {
                                ((qob) abd.d(this.sources.next(), "The source Iterator returned a null MaybeSource")).a(this);
                            } catch (Throwable th) {
                                iu6.b(th);
                                v2jVar.onError(th);
                                return;
                            }
                        } else {
                            v2jVar.onComplete();
                        }
                    } catch (Throwable th2) {
                        iu6.b(th2);
                        v2jVar.onError(th2);
                        return;
                    }
                }
            }
            if (decrementAndGet() == 0) {
                return;
            }
        }
        atomicReference.lazySet(null);
    }

    @Override // com.oplus.aiunit.vision.mob
    public void onComplete() {
        this.current.lazySet(NotificationLite.COMPLETE);
        drain();
    }

    @Override // com.oplus.aiunit.vision.mob
    public void onError(Throwable th) {
        this.downstream.onError(th);
    }

    @Override // com.oplus.aiunit.vision.mob
    public void onSubscribe(cv5 cv5Var) {
        this.disposables.replace(cv5Var);
    }

    @Override // com.oplus.aiunit.vision.mob
    public void onSuccess(T t) {
        this.current.lazySet(t);
        drain();
    }

    @Override // com.oplus.aiunit.vision.c3j
    public void request(long j2) {
        if (SubscriptionHelper.validate(j2)) {
            wr0.a(this.requested, j2);
            drain();
        }
    }
}
