package io.reactivex.rxjava3.internal.operators.observable;

import com.oplus.aiunit.vision.aed;
import com.oplus.aiunit.vision.d08;
import com.oplus.aiunit.vision.hc8;
import com.oplus.aiunit.vision.hu6;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes10.dex */
public final class ObservableGroupBy$GroupByObserver<T, K, V> extends AtomicInteger implements aed<T>, io.reactivex.rxjava3.disposables.a {
    static final Object NULL_KEY = new Object();
    private static final long serialVersionUID = -3688291656102519502L;
    final int bufferSize;
    final boolean delayError;
    final aed<? super hc8<K, V>> downstream;
    final d08<? super T, ? extends K> keySelector;
    io.reactivex.rxjava3.disposables.a upstream;
    final d08<? super T, ? extends V> valueSelector;
    final AtomicBoolean cancelled = new AtomicBoolean();
    final Map<Object, a<K, V>> groups = new ConcurrentHashMap();

    public ObservableGroupBy$GroupByObserver(aed<? super hc8<K, V>> aedVar, d08<? super T, ? extends K> d08Var, d08<? super T, ? extends V> d08Var2, int i, boolean z) {
        this.downstream = aedVar;
        this.keySelector = d08Var;
        this.valueSelector = d08Var2;
        this.bufferSize = i;
        this.delayError = z;
        lazySet(1);
    }

    public void cancel(K k) {
        if (k == null) {
            k = (K) NULL_KEY;
        }
        this.groups.remove(k);
        if (decrementAndGet() == 0) {
            this.upstream.dispose();
        }
    }

    @Override // io.reactivex.rxjava3.disposables.a
    public void dispose() {
        if (this.cancelled.compareAndSet(false, true) && decrementAndGet() == 0) {
            this.upstream.dispose();
        }
    }

    @Override // io.reactivex.rxjava3.disposables.a
    public boolean isDisposed() {
        return this.cancelled.get();
    }

    @Override // com.oplus.aiunit.vision.aed
    public void onComplete() {
        ArrayList arrayList = new ArrayList(this.groups.values());
        this.groups.clear();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((a) it.next()).onComplete();
        }
        this.downstream.onComplete();
    }

    @Override // com.oplus.aiunit.vision.aed
    public void onError(Throwable th) {
        ArrayList arrayList = new ArrayList(this.groups.values());
        this.groups.clear();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((a) it.next()).onError(th);
        }
        this.downstream.onError(th);
    }

    @Override // com.oplus.aiunit.vision.aed
    public void onNext(T t) {
        boolean z;
        try {
            K kApply = this.keySelector.apply(t);
            Object obj = kApply != null ? kApply : NULL_KEY;
            a<K, V> aVarT1 = this.groups.get(obj);
            if (aVarT1 != null) {
                z = false;
            } else {
                if (this.cancelled.get()) {
                    return;
                }
                aVarT1 = a.t1(kApply, this.bufferSize, this, this.delayError);
                this.groups.put(obj, aVarT1);
                getAndIncrement();
                z = true;
            }
            try {
                V vApply = this.valueSelector.apply(t);
                Objects.requireNonNull(vApply, "The value supplied is null");
                aVarT1.onNext(vApply);
                if (z) {
                    this.downstream.onNext(aVarT1);
                    if (aVarT1.f20606j.tryAbandon()) {
                        cancel(kApply);
                        aVarT1.onComplete();
                    }
                }
            } catch (Throwable th) {
                hu6.b(th);
                this.upstream.dispose();
                if (z) {
                    this.downstream.onNext(aVarT1);
                }
                onError(th);
            }
        } catch (Throwable th2) {
            hu6.b(th2);
            this.upstream.dispose();
            onError(th2);
        }
    }

    @Override // com.oplus.aiunit.vision.aed
    public void onSubscribe(io.reactivex.rxjava3.disposables.a aVar) {
        if (DisposableHelper.validate(this.upstream, aVar)) {
            this.upstream = aVar;
            this.downstream.onSubscribe(this);
        }
    }
}
