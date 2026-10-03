package io.reactivex.rxjava3.internal.operators.maybe;

import com.oplus.aiunit.vision.fue;
import com.oplus.aiunit.vision.lob;
import com.oplus.aiunit.vision.pob;
import com.oplus.aiunit.vision.xnb;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
public final class MaybeCache<T> extends xnb<T> implements lob<T> {
    public static final CacheDisposable[] m = new CacheDisposable[0];

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final CacheDisposable[] f20538n = new CacheDisposable[0];
    public final AtomicReference<pob<T>> i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final AtomicReference<CacheDisposable<T>[]> f20539j;
    public T k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Throwable f20540l;

    public static final class CacheDisposable<T> extends AtomicReference<MaybeCache<T>> implements io.reactivex.rxjava3.disposables.a {
        private static final long serialVersionUID = -5791853038359966195L;
        final lob<? super T> downstream;

        public CacheDisposable(lob<? super T> lobVar, MaybeCache<T> maybeCache) {
            super(maybeCache);
            this.downstream = lobVar;
        }

        @Override // io.reactivex.rxjava3.disposables.a
        public void dispose() {
            MaybeCache<T> andSet = getAndSet(null);
            if (andSet != null) {
                andSet.q(this);
            }
        }

        @Override // io.reactivex.rxjava3.disposables.a
        public boolean isDisposed() {
            return get() == null;
        }
    }

    @Override // com.oplus.aiunit.vision.xnb
    public void l(lob<? super T> lobVar) {
        CacheDisposable<T> cacheDisposable = new CacheDisposable<>(lobVar, this);
        lobVar.onSubscribe(cacheDisposable);
        if (p(cacheDisposable)) {
            if (cacheDisposable.isDisposed()) {
                q(cacheDisposable);
                return;
            }
            pob<T> andSet = this.i.getAndSet(null);
            if (andSet != null) {
                andSet.a(this);
                return;
            }
            return;
        }
        if (cacheDisposable.isDisposed()) {
            return;
        }
        Throwable th = this.f20540l;
        if (th != null) {
            lobVar.onError(th);
            return;
        }
        T t = this.k;
        if (t != null) {
            lobVar.onSuccess(t);
        } else {
            lobVar.onComplete();
        }
    }

    @Override // com.oplus.aiunit.vision.lob
    public void onComplete() {
        for (CacheDisposable<T> cacheDisposable : this.f20539j.getAndSet(f20538n)) {
            if (!cacheDisposable.isDisposed()) {
                cacheDisposable.downstream.onComplete();
            }
        }
    }

    @Override // com.oplus.aiunit.vision.lob
    public void onError(Throwable th) {
        this.f20540l = th;
        for (CacheDisposable<T> cacheDisposable : this.f20539j.getAndSet(f20538n)) {
            if (!cacheDisposable.isDisposed()) {
                cacheDisposable.downstream.onError(th);
            }
        }
    }

    @Override // com.oplus.aiunit.vision.lob
    public void onSubscribe(io.reactivex.rxjava3.disposables.a aVar) {
    }

    @Override // com.oplus.aiunit.vision.lob, com.oplus.aiunit.vision.l6h
    public void onSuccess(T t) {
        this.k = t;
        for (CacheDisposable<T> cacheDisposable : this.f20539j.getAndSet(f20538n)) {
            if (!cacheDisposable.isDisposed()) {
                cacheDisposable.downstream.onSuccess(t);
            }
        }
    }

    public boolean p(CacheDisposable<T> cacheDisposable) {
        CacheDisposable<T>[] cacheDisposableArr;
        CacheDisposable[] cacheDisposableArr2;
        do {
            cacheDisposableArr = this.f20539j.get();
            if (cacheDisposableArr == f20538n) {
                return false;
            }
            int length = cacheDisposableArr.length;
            cacheDisposableArr2 = new CacheDisposable[length + 1];
            System.arraycopy(cacheDisposableArr, 0, cacheDisposableArr2, 0, length);
            cacheDisposableArr2[length] = cacheDisposable;
        } while (!fue.a(this.f20539j, cacheDisposableArr, cacheDisposableArr2));
        return true;
    }

    public void q(CacheDisposable<T> cacheDisposable) {
        CacheDisposable<T>[] cacheDisposableArr;
        CacheDisposable[] cacheDisposableArr2;
        do {
            cacheDisposableArr = this.f20539j.get();
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
        } while (!fue.a(this.f20539j, cacheDisposableArr, cacheDisposableArr2));
    }
}
