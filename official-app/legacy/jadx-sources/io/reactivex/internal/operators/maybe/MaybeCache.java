package io.reactivex.internal.operators.maybe;

import com.oplus.aiunit.vision.cv5;
import com.oplus.aiunit.vision.fue;
import com.oplus.aiunit.vision.mob;
import com.oplus.aiunit.vision.qob;
import com.oplus.aiunit.vision.ynb;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
public final class MaybeCache<T> extends ynb<T> implements mob<T> {
    public static final CacheDisposable[] m = new CacheDisposable[0];

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final CacheDisposable[] f20474n = new CacheDisposable[0];
    public final AtomicReference<qob<T>> i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final AtomicReference<CacheDisposable<T>[]> f20475j;
    public T k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Throwable f20476l;

    public static final class CacheDisposable<T> extends AtomicReference<MaybeCache<T>> implements cv5 {
        private static final long serialVersionUID = -5791853038359966195L;
        final mob<? super T> downstream;

        public CacheDisposable(mob<? super T> mobVar, MaybeCache<T> maybeCache) {
            super(maybeCache);
            this.downstream = mobVar;
        }

        @Override // com.oplus.aiunit.vision.cv5
        public void dispose() {
            MaybeCache<T> andSet = getAndSet(null);
            if (andSet != null) {
                andSet.d(this);
            }
        }

        @Override // com.oplus.aiunit.vision.cv5
        public boolean isDisposed() {
            return get() == null;
        }
    }

    @Override // com.oplus.aiunit.vision.ynb
    public void b(mob<? super T> mobVar) {
        CacheDisposable<T> cacheDisposable = new CacheDisposable<>(mobVar, this);
        mobVar.onSubscribe(cacheDisposable);
        if (c(cacheDisposable)) {
            if (cacheDisposable.isDisposed()) {
                d(cacheDisposable);
                return;
            }
            qob<T> andSet = this.i.getAndSet(null);
            if (andSet != null) {
                andSet.a(this);
                return;
            }
            return;
        }
        if (cacheDisposable.isDisposed()) {
            return;
        }
        Throwable th = this.f20476l;
        if (th != null) {
            mobVar.onError(th);
            return;
        }
        T t = this.k;
        if (t != null) {
            mobVar.onSuccess(t);
        } else {
            mobVar.onComplete();
        }
    }

    public boolean c(CacheDisposable<T> cacheDisposable) {
        CacheDisposable<T>[] cacheDisposableArr;
        CacheDisposable[] cacheDisposableArr2;
        do {
            cacheDisposableArr = this.f20475j.get();
            if (cacheDisposableArr == f20474n) {
                return false;
            }
            int length = cacheDisposableArr.length;
            cacheDisposableArr2 = new CacheDisposable[length + 1];
            System.arraycopy(cacheDisposableArr, 0, cacheDisposableArr2, 0, length);
            cacheDisposableArr2[length] = cacheDisposable;
        } while (!fue.a(this.f20475j, cacheDisposableArr, cacheDisposableArr2));
        return true;
    }

    public void d(CacheDisposable<T> cacheDisposable) {
        CacheDisposable<T>[] cacheDisposableArr;
        CacheDisposable[] cacheDisposableArr2;
        do {
            cacheDisposableArr = this.f20475j.get();
            int length = cacheDisposableArr.length;
            if (length == 0) {
                return;
            }
            int i = 0;
            while (true) {
                if (i >= length) {
                    i = -1;
                    break;
                } else if (cacheDisposableArr[i] == cacheDisposable) {
                    break;
                } else {
                    i++;
                }
            }
            if (i < 0) {
                return;
            }
            if (length == 1) {
                cacheDisposableArr2 = m;
            } else {
                CacheDisposable[] cacheDisposableArr3 = new CacheDisposable[length - 1];
                System.arraycopy(cacheDisposableArr, 0, cacheDisposableArr3, 0, i);
                System.arraycopy(cacheDisposableArr, i + 1, cacheDisposableArr3, i, (length - i) - 1);
                cacheDisposableArr2 = cacheDisposableArr3;
            }
        } while (!fue.a(this.f20475j, cacheDisposableArr, cacheDisposableArr2));
    }

    @Override // com.oplus.aiunit.vision.mob
    public void onComplete() {
        for (CacheDisposable<T> cacheDisposable : this.f20475j.getAndSet(f20474n)) {
            if (!cacheDisposable.isDisposed()) {
                cacheDisposable.downstream.onComplete();
            }
        }
    }

    @Override // com.oplus.aiunit.vision.mob
    public void onError(Throwable th) {
        this.f20476l = th;
        for (CacheDisposable<T> cacheDisposable : this.f20475j.getAndSet(f20474n)) {
            if (!cacheDisposable.isDisposed()) {
                cacheDisposable.downstream.onError(th);
            }
        }
    }

    @Override // com.oplus.aiunit.vision.mob
    public void onSubscribe(cv5 cv5Var) {
    }

    @Override // com.oplus.aiunit.vision.mob
    public void onSuccess(T t) {
        this.k = t;
        for (CacheDisposable<T> cacheDisposable : this.f20475j.getAndSet(f20474n)) {
            if (!cacheDisposable.isDisposed()) {
                cacheDisposable.downstream.onSuccess(t);
            }
        }
    }
}
