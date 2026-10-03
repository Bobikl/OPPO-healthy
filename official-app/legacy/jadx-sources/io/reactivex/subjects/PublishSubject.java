package io.reactivex.subjects;

import com.oplus.aiunit.vision.abd;
import com.oplus.aiunit.vision.bed;
import com.oplus.aiunit.vision.cv5;
import com.oplus.aiunit.vision.fue;
import com.oplus.aiunit.vision.h4g;
import com.oplus.aiunit.vision.r2j;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
public final class PublishSubject<T> extends r2j<T> {
    public static final PublishDisposable[] k = new PublishDisposable[0];

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final PublishDisposable[] f20658l = new PublishDisposable[0];
    public final AtomicReference<PublishDisposable<T>[]> i = new AtomicReference<>(f20658l);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Throwable f20659j;

    public static final class PublishDisposable<T> extends AtomicBoolean implements cv5 {
        private static final long serialVersionUID = 3562861878281475070L;
        final bed<? super T> downstream;
        final PublishSubject<T> parent;

        public PublishDisposable(bed<? super T> bedVar, PublishSubject<T> publishSubject) {
            this.downstream = bedVar;
            this.parent = publishSubject;
        }

        @Override // com.oplus.aiunit.vision.cv5
        public void dispose() {
            if (compareAndSet(false, true)) {
                this.parent.K(this);
            }
        }

        @Override // com.oplus.aiunit.vision.cv5
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
                h4g.r(th);
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

    public static <T> PublishSubject<T> J() {
        return new PublishSubject<>();
    }

    @Override // com.oplus.aiunit.vision.kbd
    public void A(bed<? super T> bedVar) {
        PublishDisposable<T> publishDisposable = new PublishDisposable<>(bedVar, this);
        bedVar.onSubscribe(publishDisposable);
        if (I(publishDisposable)) {
            if (publishDisposable.isDisposed()) {
                K(publishDisposable);
            }
        } else {
            Throwable th = this.f20659j;
            if (th != null) {
                bedVar.onError(th);
            } else {
                bedVar.onComplete();
            }
        }
    }

    public boolean I(PublishDisposable<T> publishDisposable) {
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

    public void K(PublishDisposable<T> publishDisposable) {
        PublishDisposable<T>[] publishDisposableArr;
        PublishDisposable[] publishDisposableArr2;
        do {
            publishDisposableArr = this.i.get();
            if (publishDisposableArr == k || publishDisposableArr == f20658l) {
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
                publishDisposableArr2 = f20658l;
            } else {
                PublishDisposable[] publishDisposableArr3 = new PublishDisposable[length - 1];
                System.arraycopy(publishDisposableArr, 0, publishDisposableArr3, 0, i);
                System.arraycopy(publishDisposableArr, i + 1, publishDisposableArr3, i, (length - i) - 1);
                publishDisposableArr2 = publishDisposableArr3;
            }
        } while (!fue.a(this.i, publishDisposableArr, publishDisposableArr2));
    }

    @Override // com.oplus.aiunit.vision.bed
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

    @Override // com.oplus.aiunit.vision.bed
    public void onError(Throwable th) {
        abd.d(th, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        PublishDisposable<T>[] publishDisposableArr = this.i.get();
        PublishDisposable<T>[] publishDisposableArr2 = k;
        if (publishDisposableArr == publishDisposableArr2) {
            h4g.r(th);
            return;
        }
        this.f20659j = th;
        PublishDisposable<T>[] andSet = this.i.getAndSet(publishDisposableArr2);
        for (PublishDisposable<T> publishDisposable : andSet) {
            publishDisposable.onError(th);
        }
    }

    @Override // com.oplus.aiunit.vision.bed
    public void onNext(T t) {
        abd.d(t, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        for (PublishDisposable<T> publishDisposable : this.i.get()) {
            publishDisposable.onNext(t);
        }
    }

    @Override // com.oplus.aiunit.vision.bed
    public void onSubscribe(cv5 cv5Var) {
        if (this.i.get() == k) {
            cv5Var.dispose();
        }
    }
}
