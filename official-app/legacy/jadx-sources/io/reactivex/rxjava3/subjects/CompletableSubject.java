package io.reactivex.rxjava3.subjects;

import com.oplus.aiunit.vision.as3;
import com.oplus.aiunit.vision.fue;
import com.oplus.aiunit.vision.g4g;
import com.oplus.aiunit.vision.pr3;
import io.reactivex.rxjava3.disposables.a;
import io.reactivex.rxjava3.internal.util.ExceptionHelper;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
public final class CompletableSubject extends pr3 implements as3 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final CompletableDisposable[] f20640l = new CompletableDisposable[0];
    public static final CompletableDisposable[] m = new CompletableDisposable[0];
    public Throwable k;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final AtomicBoolean f20641j = new AtomicBoolean();
    public final AtomicReference<CompletableDisposable[]> i = new AtomicReference<>(f20640l);

    public static final class CompletableDisposable extends AtomicReference<CompletableSubject> implements a {
        private static final long serialVersionUID = -7650903191002190468L;
        final as3 downstream;

        public CompletableDisposable(as3 as3Var, CompletableSubject completableSubject) {
            this.downstream = as3Var;
            lazySet(completableSubject);
        }

        @Override // io.reactivex.rxjava3.disposables.a
        public void dispose() {
            CompletableSubject andSet = getAndSet(null);
            if (andSet != null) {
                andSet.o(this);
            }
        }

        @Override // io.reactivex.rxjava3.disposables.a
        public boolean isDisposed() {
            return get() == null;
        }
    }

    @Override // com.oplus.aiunit.vision.pr3
    public void k(as3 as3Var) {
        CompletableDisposable completableDisposable = new CompletableDisposable(as3Var, this);
        as3Var.onSubscribe(completableDisposable);
        if (n(completableDisposable)) {
            if (completableDisposable.isDisposed()) {
                o(completableDisposable);
            }
        } else {
            Throwable th = this.k;
            if (th != null) {
                as3Var.onError(th);
            } else {
                as3Var.onComplete();
            }
        }
    }

    public boolean n(CompletableDisposable completableDisposable) {
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

    public void o(CompletableDisposable completableDisposable) {
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
                completableDisposableArr2 = f20640l;
            } else {
                CompletableDisposable[] completableDisposableArr3 = new CompletableDisposable[length - 1];
                System.arraycopy(completableDisposableArr, 0, completableDisposableArr3, 0, i);
                System.arraycopy(completableDisposableArr, i + 1, completableDisposableArr3, i, (length - i) - 1);
                completableDisposableArr2 = completableDisposableArr3;
            }
        } while (!fue.a(this.i, completableDisposableArr, completableDisposableArr2));
    }

    @Override // com.oplus.aiunit.vision.as3
    public void onComplete() {
        if (this.f20641j.compareAndSet(false, true)) {
            for (CompletableDisposable completableDisposable : this.i.getAndSet(m)) {
                completableDisposable.downstream.onComplete();
            }
        }
    }

    @Override // com.oplus.aiunit.vision.as3
    public void onError(Throwable th) {
        ExceptionHelper.c(th, "onError called with a null Throwable.");
        if (!this.f20641j.compareAndSet(false, true)) {
            g4g.u(th);
            return;
        }
        this.k = th;
        for (CompletableDisposable completableDisposable : this.i.getAndSet(m)) {
            completableDisposable.downstream.onError(th);
        }
    }

    @Override // com.oplus.aiunit.vision.as3
    public void onSubscribe(a aVar) {
        if (this.i.get() == m) {
            aVar.dispose();
        }
    }
}
