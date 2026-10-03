package io.reactivex.subjects;

import com.oplus.aiunit.vision.abd;
import com.oplus.aiunit.vision.bs3;
import com.oplus.aiunit.vision.cv5;
import com.oplus.aiunit.vision.fue;
import com.oplus.aiunit.vision.h4g;
import com.oplus.aiunit.vision.qr3;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
public final class CompletableSubject extends qr3 implements bs3 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final CompletableDisposable[] f20653l = new CompletableDisposable[0];
    public static final CompletableDisposable[] m = new CompletableDisposable[0];
    public Throwable k;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final AtomicBoolean f20654j = new AtomicBoolean();
    public final AtomicReference<CompletableDisposable[]> i = new AtomicReference<>(f20653l);

    public static final class CompletableDisposable extends AtomicReference<CompletableSubject> implements cv5 {
        private static final long serialVersionUID = -7650903191002190468L;
        final bs3 downstream;

        public CompletableDisposable(bs3 bs3Var, CompletableSubject completableSubject) {
            this.downstream = bs3Var;
            lazySet(completableSubject);
        }

        @Override // com.oplus.aiunit.vision.cv5
        public void dispose() {
            CompletableSubject andSet = getAndSet(null);
            if (andSet != null) {
                andSet.e(this);
            }
        }

        @Override // com.oplus.aiunit.vision.cv5
        public boolean isDisposed() {
            return get() == null;
        }
    }

    @Override // com.oplus.aiunit.vision.qr3
    public void b(bs3 bs3Var) {
        CompletableDisposable completableDisposable = new CompletableDisposable(bs3Var, this);
        bs3Var.onSubscribe(completableDisposable);
        if (d(completableDisposable)) {
            if (completableDisposable.isDisposed()) {
                e(completableDisposable);
            }
        } else {
            Throwable th = this.k;
            if (th != null) {
                bs3Var.onError(th);
            } else {
                bs3Var.onComplete();
            }
        }
    }

    public boolean d(CompletableDisposable completableDisposable) {
        CompletableDisposable[] completableDisposableArr;
        CompletableDisposable[] completableDisposableArr2;
        do {
            completableDisposableArr = this.i.get();
            if (completableDisposableArr == m) {
                return false;
            }
            int length = completableDisposableArr.length;
            completableDisposableArr2 = new CompletableDisposable[length + 1];
            System.arraycopy(completableDisposableArr, 0, completableDisposableArr2, 0, length);
            completableDisposableArr2[length] = completableDisposable;
        } while (!fue.a(this.i, completableDisposableArr, completableDisposableArr2));
        return true;
    }

    public void e(CompletableDisposable completableDisposable) {
        CompletableDisposable[] completableDisposableArr;
        CompletableDisposable[] completableDisposableArr2;
        do {
            completableDisposableArr = this.i.get();
            int length = completableDisposableArr.length;
            if (length == 0) {
                return;
            }
            int i = 0;
            while (true) {
                if (i >= length) {
                    i = -1;
                    break;
                } else if (completableDisposableArr[i] == completableDisposable) {
                    break;
                } else {
                    i++;
                }
            }
            if (i < 0) {
                return;
            }
            if (length == 1) {
                completableDisposableArr2 = f20653l;
            } else {
                CompletableDisposable[] completableDisposableArr3 = new CompletableDisposable[length - 1];
                System.arraycopy(completableDisposableArr, 0, completableDisposableArr3, 0, i);
                System.arraycopy(completableDisposableArr, i + 1, completableDisposableArr3, i, (length - i) - 1);
                completableDisposableArr2 = completableDisposableArr3;
            }
        } while (!fue.a(this.i, completableDisposableArr, completableDisposableArr2));
    }

    @Override // com.oplus.aiunit.vision.bs3
    public void onComplete() {
        if (this.f20654j.compareAndSet(false, true)) {
            for (CompletableDisposable completableDisposable : this.i.getAndSet(m)) {
                completableDisposable.downstream.onComplete();
            }
        }
    }

    @Override // com.oplus.aiunit.vision.bs3
    public void onError(Throwable th) {
        abd.d(th, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (!this.f20654j.compareAndSet(false, true)) {
            h4g.r(th);
            return;
        }
        this.k = th;
        for (CompletableDisposable completableDisposable : this.i.getAndSet(m)) {
            completableDisposable.downstream.onError(th);
        }
    }

    @Override // com.oplus.aiunit.vision.bs3
    public void onSubscribe(cv5 cv5Var) {
        if (this.i.get() == m) {
            cv5Var.dispose();
        }
    }
}
