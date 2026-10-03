package io.reactivex.rxjava3.subjects;

import com.oplus.aiunit.vision.aed;
import com.oplus.aiunit.vision.fue;
import com.oplus.aiunit.vision.g4g;
import com.oplus.aiunit.vision.s2j;
import io.reactivex.rxjava3.disposables.a;
import io.reactivex.rxjava3.internal.util.ExceptionHelper;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
public final class PublishSubject<T> extends s2j<T> {
    public static final PublishDisposable[] k = new PublishDisposable[0];

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final PublishDisposable[] f20645l = new PublishDisposable[0];
    public final AtomicReference<PublishDisposable<T>[]> i = new AtomicReference<>(f20645l);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Throwable f20646j;

    public static final class PublishDisposable<T> extends AtomicBoolean implements a {
        private static final long serialVersionUID = 3562861878281475070L;
        final aed<? super T> downstream;
        final PublishSubject<T> parent;

        public PublishDisposable(aed<? super T> aedVar, PublishSubject<T> publishSubject) {
            this.downstream = aedVar;
            this.parent = publishSubject;
        }

        @Override // io.reactivex.rxjava3.disposables.a
        public void dispose() {
            if (compareAndSet(false, true)) {
                this.parent.x1(this);
            }
        }

        @Override // io.reactivex.rxjava3.disposables.a
        public boolean isDisposed() {
            return get();
        }

        public void onComplete() {
            if (get()) {
                return;
            }
            this.downstream.onComplete();
        }

        public void onError(Throwable th) {
            if (get()) {
                g4g.u(th);
            } else {
                this.downstream.onError(th);
            }
        }

        public void onNext(T t) {
            if (get()) {
                return;
            }
            this.downstream.onNext(t);
        }
    }

    public static <T> PublishSubject<T> v1() {
        return new PublishSubject<>();
    }

    @Override // com.oplus.aiunit.vision.lbd
    public void K0(aed<? super T> aedVar) {
        PublishDisposable<T> publishDisposable = new PublishDisposable<>(aedVar, this);
        aedVar.onSubscribe(publishDisposable);
        if (u1(publishDisposable)) {
            if (publishDisposable.isDisposed()) {
                x1(publishDisposable);
            }
        } else {
            Throwable th = this.f20646j;
            if (th != null) {
                aedVar.onError(th);
            } else {
                aedVar.onComplete();
            }
        }
    }

    @Override // com.oplus.aiunit.vision.aed
    public void onComplete() {
        PublishDisposable<T>[] publishDisposableArr = this.i.get();
        PublishDisposable<T>[] publishDisposableArr2 = k;
        if (publishDisposableArr == publishDisposableArr2) {
            return;
        }
        PublishDisposable<T>[] andSet = this.i.getAndSet(publishDisposableArr2);
        for (PublishDisposable<T> publishDisposable : andSet) {
            publishDisposable.onComplete();
        }
    }

    @Override // com.oplus.aiunit.vision.aed
    public void onError(Throwable th) {
        ExceptionHelper.c(th, "onError called with a null Throwable.");
        PublishDisposable<T>[] publishDisposableArr = this.i.get();
        PublishDisposable<T>[] publishDisposableArr2 = k;
        if (publishDisposableArr == publishDisposableArr2) {
            g4g.u(th);
            return;
        }
        this.f20646j = th;
        PublishDisposable<T>[] andSet = this.i.getAndSet(publishDisposableArr2);
        for (PublishDisposable<T> publishDisposable : andSet) {
            publishDisposable.onError(th);
        }
    }

    @Override // com.oplus.aiunit.vision.aed
    public void onNext(T t) {
        ExceptionHelper.c(t, "onNext called with a null value.");
        for (PublishDisposable<T> publishDisposable : this.i.get()) {
            publishDisposable.onNext(t);
        }
    }

    @Override // com.oplus.aiunit.vision.aed
    public void onSubscribe(a aVar) {
        if (this.i.get() == k) {
            aVar.dispose();
        }
    }

    public boolean u1(PublishDisposable<T> publishDisposable) {
        PublishDisposable<T>[] publishDisposableArr;
        PublishDisposable[] publishDisposableArr2;
        do {
            publishDisposableArr = this.i.get();
            if (publishDisposableArr == k) {
                return false;
            }
            int length = publishDisposableArr.length;
            publishDisposableArr2 = new PublishDisposable[length + 1];
            System.arraycopy(publishDisposableArr, 0, publishDisposableArr2, 0, length);
            publishDisposableArr2[length] = publishDisposable;
        } while (!fue.a(this.i, publishDisposableArr, publishDisposableArr2));
        return true;
    }

    public boolean w1() {
        return this.i.get() == k && this.f20646j == null;
    }

    public void x1(PublishDisposable<T> publishDisposable) {
        PublishDisposable<T>[] publishDisposableArr;
        PublishDisposable[] publishDisposableArr2;
        do {
            publishDisposableArr = this.i.get();
            if (publishDisposableArr == k || publishDisposableArr == f20645l) {
                return;
            }
            int length = publishDisposableArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    i = -1;
                    break;
                } else if (publishDisposableArr[i] == publishDisposable) {
                    break;
                } else {
                    i++;
                }
            }
            if (i < 0) {
                return;
            }
            if (length == 1) {
                publishDisposableArr2 = f20645l;
            } else {
                PublishDisposable[] publishDisposableArr3 = new PublishDisposable[length - 1];
                System.arraycopy(publishDisposableArr, 0, publishDisposableArr3, 0, i);
                System.arraycopy(publishDisposableArr, i + 1, publishDisposableArr3, i, (length - i) - 1);
                publishDisposableArr2 = publishDisposableArr3;
            }
        } while (!fue.a(this.i, publishDisposableArr, publishDisposableArr2));
    }
}
