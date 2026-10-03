package io.reactivex.rxjava3.subjects;

import com.oplus.aiunit.vision.fue;
import com.oplus.aiunit.vision.g4g;
import com.oplus.aiunit.vision.lob;
import com.oplus.aiunit.vision.xnb;
import io.reactivex.rxjava3.disposables.a;
import io.reactivex.rxjava3.internal.util.ExceptionHelper;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
public final class MaybeSubject<T> extends xnb<T> implements lob<T> {
    public static final MaybeDisposable[] m = new MaybeDisposable[0];

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final MaybeDisposable[] f20642n = new MaybeDisposable[0];
    public T k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Throwable f20644l;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final AtomicBoolean f20643j = new AtomicBoolean();
    public final AtomicReference<MaybeDisposable<T>[]> i = new AtomicReference<>(m);

    public static final class MaybeDisposable<T> extends AtomicReference<MaybeSubject<T>> implements a {
        private static final long serialVersionUID = -7650903191002190468L;
        final lob<? super T> downstream;

        public MaybeDisposable(lob<? super T> lobVar, MaybeSubject<T> maybeSubject) {
            this.downstream = lobVar;
            lazySet(maybeSubject);
        }

        @Override // io.reactivex.rxjava3.disposables.a
        public void dispose() {
            MaybeSubject<T> andSet = getAndSet(null);
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
        MaybeDisposable<T> maybeDisposable = new MaybeDisposable<>(lobVar, this);
        lobVar.onSubscribe(maybeDisposable);
        if (p(maybeDisposable)) {
            if (maybeDisposable.isDisposed()) {
                q(maybeDisposable);
                return;
            }
            return;
        }
        Throwable th = this.f20644l;
        if (th != null) {
            lobVar.onError(th);
            return;
        }
        T t = this.k;
        if (t == null) {
            lobVar.onComplete();
        } else {
            lobVar.onSuccess(t);
        }
    }

    @Override // com.oplus.aiunit.vision.lob
    public void onComplete() {
        if (this.f20643j.compareAndSet(false, true)) {
            for (MaybeDisposable<T> maybeDisposable : this.i.getAndSet(f20642n)) {
                maybeDisposable.downstream.onComplete();
            }
        }
    }

    @Override // com.oplus.aiunit.vision.lob
    public void onError(Throwable th) {
        ExceptionHelper.c(th, "onError called with a null Throwable.");
        if (!this.f20643j.compareAndSet(false, true)) {
            g4g.u(th);
            return;
        }
        this.f20644l = th;
        for (MaybeDisposable<T> maybeDisposable : this.i.getAndSet(f20642n)) {
            maybeDisposable.downstream.onError(th);
        }
    }

    @Override // com.oplus.aiunit.vision.lob
    public void onSubscribe(a aVar) {
        if (this.i.get() == f20642n) {
            aVar.dispose();
        }
    }

    @Override // com.oplus.aiunit.vision.lob, com.oplus.aiunit.vision.l6h
    public void onSuccess(T t) {
        ExceptionHelper.c(t, "onSuccess called with a null value.");
        if (this.f20643j.compareAndSet(false, true)) {
            this.k = t;
            for (MaybeDisposable<T> maybeDisposable : this.i.getAndSet(f20642n)) {
                maybeDisposable.downstream.onSuccess(t);
            }
        }
    }

    public boolean p(MaybeDisposable<T> maybeDisposable) {
        MaybeDisposable<T>[] maybeDisposableArr;
        MaybeDisposable[] maybeDisposableArr2;
        do {
            maybeDisposableArr = this.i.get();
            if (maybeDisposableArr == f20642n) {
                return false;
            }
            int length = maybeDisposableArr.length;
            maybeDisposableArr2 = new MaybeDisposable[length + 1];
            System.arraycopy(maybeDisposableArr, 0, maybeDisposableArr2, 0, length);
            maybeDisposableArr2[length] = maybeDisposable;
        } while (!fue.a(this.i, maybeDisposableArr, maybeDisposableArr2));
        return true;
    }

    public void q(MaybeDisposable<T> maybeDisposable) {
        MaybeDisposable<T>[] maybeDisposableArr;
        MaybeDisposable[] maybeDisposableArr2;
        do {
            maybeDisposableArr = this.i.get();
            int length = maybeDisposableArr.length;
            if (length == 0) {
                return;
            }
            int i = 0;
            while (true) {
                if (i >= length) {
                    i = -1;
                    break;
                } else if (maybeDisposableArr[i] == maybeDisposable) {
                    break;
                } else {
                    i++;
                }
            }
            if (i < 0) {
                return;
            }
            if (length == 1) {
                maybeDisposableArr2 = m;
            } else {
                MaybeDisposable[] maybeDisposableArr3 = new MaybeDisposable[length - 1];
                System.arraycopy(maybeDisposableArr, 0, maybeDisposableArr3, 0, i);
                System.arraycopy(maybeDisposableArr, i + 1, maybeDisposableArr3, i, (length - i) - 1);
                maybeDisposableArr2 = maybeDisposableArr3;
            }
        } while (!fue.a(this.i, maybeDisposableArr, maybeDisposableArr2));
    }
}
