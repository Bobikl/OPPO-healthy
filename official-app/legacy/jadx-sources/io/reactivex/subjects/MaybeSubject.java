package io.reactivex.subjects;

import com.oplus.aiunit.vision.abd;
import com.oplus.aiunit.vision.cv5;
import com.oplus.aiunit.vision.fue;
import com.oplus.aiunit.vision.h4g;
import com.oplus.aiunit.vision.mob;
import com.oplus.aiunit.vision.ynb;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
public final class MaybeSubject<T> extends ynb<T> implements mob<T> {
    public static final MaybeDisposable[] m = new MaybeDisposable[0];

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final MaybeDisposable[] f20655n = new MaybeDisposable[0];
    public T k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Throwable f20657l;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final AtomicBoolean f20656j = new AtomicBoolean();
    public final AtomicReference<MaybeDisposable<T>[]> i = new AtomicReference<>(m);

    public static final class MaybeDisposable<T> extends AtomicReference<MaybeSubject<T>> implements cv5 {
        private static final long serialVersionUID = -7650903191002190468L;
        final mob<? super T> downstream;

        public MaybeDisposable(mob<? super T> mobVar, MaybeSubject<T> maybeSubject) {
            this.downstream = mobVar;
            lazySet(maybeSubject);
        }

        @Override // com.oplus.aiunit.vision.cv5
        public void dispose() {
            MaybeSubject<T> andSet = getAndSet(null);
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
        MaybeDisposable<T> maybeDisposable = new MaybeDisposable<>(mobVar, this);
        mobVar.onSubscribe(maybeDisposable);
        if (c(maybeDisposable)) {
            if (maybeDisposable.isDisposed()) {
                d(maybeDisposable);
                return;
            }
            return;
        }
        Throwable th = this.f20657l;
        if (th != null) {
            mobVar.onError(th);
            return;
        }
        T t = this.k;
        if (t == null) {
            mobVar.onComplete();
        } else {
            mobVar.onSuccess(t);
        }
    }

    public boolean c(MaybeDisposable<T> maybeDisposable) {
        MaybeDisposable<T>[] maybeDisposableArr;
        MaybeDisposable[] maybeDisposableArr2;
        do {
            maybeDisposableArr = this.i.get();
            if (maybeDisposableArr == f20655n) {
                return false;
            }
            int length = maybeDisposableArr.length;
            maybeDisposableArr2 = new MaybeDisposable[length + 1];
            System.arraycopy(maybeDisposableArr, 0, maybeDisposableArr2, 0, length);
            maybeDisposableArr2[length] = maybeDisposable;
        } while (!fue.a(this.i, maybeDisposableArr, maybeDisposableArr2));
        return true;
    }

    public void d(MaybeDisposable<T> maybeDisposable) {
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

    @Override // com.oplus.aiunit.vision.mob
    public void onComplete() {
        if (this.f20656j.compareAndSet(false, true)) {
            for (MaybeDisposable<T> maybeDisposable : this.i.getAndSet(f20655n)) {
                maybeDisposable.downstream.onComplete();
            }
        }
    }

    @Override // com.oplus.aiunit.vision.mob
    public void onError(Throwable th) {
        abd.d(th, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (!this.f20656j.compareAndSet(false, true)) {
            h4g.r(th);
            return;
        }
        this.f20657l = th;
        for (MaybeDisposable<T> maybeDisposable : this.i.getAndSet(f20655n)) {
            maybeDisposable.downstream.onError(th);
        }
    }

    @Override // com.oplus.aiunit.vision.mob
    public void onSubscribe(cv5 cv5Var) {
        if (this.i.get() == f20655n) {
            cv5Var.dispose();
        }
    }

    @Override // com.oplus.aiunit.vision.mob
    public void onSuccess(T t) {
        abd.d(t, "onSuccess called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.f20656j.compareAndSet(false, true)) {
            this.k = t;
            for (MaybeDisposable<T> maybeDisposable : this.i.getAndSet(f20655n)) {
                maybeDisposable.downstream.onSuccess(t);
            }
        }
    }
}
