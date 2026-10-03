package io.reactivex.rxjava3.subjects;

import com.oplus.aiunit.vision.f5h;
import com.oplus.aiunit.vision.fue;
import com.oplus.aiunit.vision.g4g;
import com.oplus.aiunit.vision.l6h;
import io.reactivex.rxjava3.disposables.a;
import io.reactivex.rxjava3.internal.util.ExceptionHelper;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
public final class SingleSubject<T> extends f5h<T> implements l6h<T> {
    public static final SingleDisposable[] m = new SingleDisposable[0];

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final SingleDisposable[] f20647n = new SingleDisposable[0];
    public T k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Throwable f20649l;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final AtomicBoolean f20648j = new AtomicBoolean();
    public final AtomicReference<SingleDisposable<T>[]> i = new AtomicReference<>(m);

    public static final class SingleDisposable<T> extends AtomicReference<SingleSubject<T>> implements a {
        private static final long serialVersionUID = -7650903191002190468L;
        final l6h<? super T> downstream;

        public SingleDisposable(l6h<? super T> l6hVar, SingleSubject<T> singleSubject) {
            this.downstream = l6hVar;
            lazySet(singleSubject);
        }

        @Override // io.reactivex.rxjava3.disposables.a
        public void dispose() {
            SingleSubject<T> andSet = getAndSet(null);
            if (andSet != null) {
                andSet.F(this);
            }
        }

        @Override // io.reactivex.rxjava3.disposables.a
        public boolean isDisposed() {
            return get() == null;
        }
    }

    public boolean E(SingleDisposable<T> singleDisposable) {
        SingleDisposable<T>[] singleDisposableArr;
        SingleDisposable[] singleDisposableArr2;
        do {
            singleDisposableArr = this.i.get();
            if (singleDisposableArr == f20647n) {
                return false;
            }
            int length = singleDisposableArr.length;
            singleDisposableArr2 = new SingleDisposable[length + 1];
            System.arraycopy(singleDisposableArr, 0, singleDisposableArr2, 0, length);
            singleDisposableArr2[length] = singleDisposable;
        } while (!fue.a(this.i, singleDisposableArr, singleDisposableArr2));
        return true;
    }

    public void F(SingleDisposable<T> singleDisposable) {
        SingleDisposable<T>[] singleDisposableArr;
        SingleDisposable[] singleDisposableArr2;
        do {
            singleDisposableArr = this.i.get();
            int length = singleDisposableArr.length;
            if (length == 0) {
                return;
            }
            int i = 0;
            while (true) {
                if (i >= length) {
                    i = -1;
                    break;
                } else if (singleDisposableArr[i] == singleDisposable) {
                    break;
                } else {
                    i++;
                }
            }
            if (i < 0) {
                return;
            }
            if (length == 1) {
                singleDisposableArr2 = m;
            } else {
                SingleDisposable[] singleDisposableArr3 = new SingleDisposable[length - 1];
                System.arraycopy(singleDisposableArr, 0, singleDisposableArr3, 0, i);
                System.arraycopy(singleDisposableArr, i + 1, singleDisposableArr3, i, (length - i) - 1);
                singleDisposableArr2 = singleDisposableArr3;
            }
        } while (!fue.a(this.i, singleDisposableArr, singleDisposableArr2));
    }

    @Override // com.oplus.aiunit.vision.l6h
    public void onError(Throwable th) {
        ExceptionHelper.c(th, "onError called with a null Throwable.");
        if (!this.f20648j.compareAndSet(false, true)) {
            g4g.u(th);
            return;
        }
        this.f20649l = th;
        for (SingleDisposable<T> singleDisposable : this.i.getAndSet(f20647n)) {
            singleDisposable.downstream.onError(th);
        }
    }

    @Override // com.oplus.aiunit.vision.l6h
    public void onSubscribe(a aVar) {
        if (this.i.get() == f20647n) {
            aVar.dispose();
        }
    }

    @Override // com.oplus.aiunit.vision.l6h
    public void onSuccess(T t) {
        ExceptionHelper.c(t, "onSuccess called with a null value.");
        if (this.f20648j.compareAndSet(false, true)) {
            this.k = t;
            for (SingleDisposable<T> singleDisposable : this.i.getAndSet(f20647n)) {
                singleDisposable.downstream.onSuccess(t);
            }
        }
    }

    @Override // com.oplus.aiunit.vision.f5h
    public void x(l6h<? super T> l6hVar) {
        SingleDisposable<T> singleDisposable = new SingleDisposable<>(l6hVar, this);
        l6hVar.onSubscribe(singleDisposable);
        if (E(singleDisposable)) {
            if (singleDisposable.isDisposed()) {
                F(singleDisposable);
            }
        } else {
            Throwable th = this.f20649l;
            if (th != null) {
                l6hVar.onError(th);
            } else {
                l6hVar.onSuccess(this.k);
            }
        }
    }
}
