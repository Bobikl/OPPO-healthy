package io.reactivex.internal.operators.observable;

import com.oplus.aiunit.vision.abd;
import com.oplus.aiunit.vision.bed;
import com.oplus.aiunit.vision.cv5;
import com.oplus.aiunit.vision.ic8;
import com.oplus.aiunit.vision.iu6;
import com.oplus.aiunit.vision.j08;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes10.dex */
public final class ObservableGroupBy$GroupByObserver<T, K, V> extends AtomicInteger implements bed<T>, cv5 {
    static final Object NULL_KEY = new Object();
    private static final long serialVersionUID = -3688291656102519502L;
    final int bufferSize;
    final boolean delayError;
    final bed<? super ic8<K, V>> downstream;
    final j08<? super T, ? extends K> keySelector;
    cv5 upstream;
    final j08<? super T, ? extends V> valueSelector;
    final AtomicBoolean cancelled = new AtomicBoolean();
    final Map<Object, a<K, V>> groups = new ConcurrentHashMap();

    public ObservableGroupBy$GroupByObserver(bed<? super ic8<K, V>> bedVar, j08<? super T, ? extends K> j08Var, j08<? super T, ? extends V> j08Var2, int i, boolean z) {
        this.downstream = bedVar;
        this.keySelector = j08Var;
        this.valueSelector = j08Var2;
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

    @Override // com.oplus.aiunit.vision.cv5
    public void dispose() {
        if (this.cancelled.compareAndSet(false, true) && decrementAndGet() == 0) {
            this.upstream.dispose();
        }
    }

    @Override // com.oplus.aiunit.vision.cv5
    public boolean isDisposed() {
        return this.cancelled.get();
    }

    @Override // com.oplus.aiunit.vision.bed
    public void onComplete() {
        ArrayList arrayList = new ArrayList(this.groups.values());
        this.groups.clear();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((a) it.next()).onComplete();
        }
        this.downstream.onComplete();
    }

    @Override // com.oplus.aiunit.vision.bed
    public void onError(Throwable th) {
        ArrayList arrayList = new ArrayList(this.groups.values());
        this.groups.clear();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((a) it.next()).onError(th);
        }
        this.downstream.onError(th);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.oplus.aiunit.vision.bed
    public void onNext(T t) {
        try {
            K kApply = this.keySelector.apply(t);
            Object obj = kApply != null ? kApply : NULL_KEY;
            a<K, V> aVar = this.groups.get(obj);
            a aVar2 = aVar;
            if (aVar == false) {
                if (this.cancelled.get()) {
                    return;
                }
                a<K, V> aVarI = a.I(kApply, this.bufferSize, this, this.delayError);
                this.groups.put(obj, aVarI);
                getAndIncrement();
                this.downstream.onNext(aVarI);
                aVar2 = aVarI;
            }
            try {
                aVar2.onNext(abd.d(this.valueSelector.apply(t), "The value supplied is null"));
            } catch (Throwable th) {
                iu6.b(th);
                this.upstream.dispose();
                onError(th);
            }
        } catch (Throwable th2) {
            iu6.b(th2);
            this.upstream.dispose();
            onError(th2);
        }
    }

    @Override // com.oplus.aiunit.vision.bed
    public void onSubscribe(cv5 cv5Var) {
        if (DisposableHelper.validate(this.upstream, cv5Var)) {
            this.upstream = cv5Var;
            this.downstream.onSubscribe(this);
        }
    }
}
